package org.inventory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryExtended {

	public static JSONArray readJson(String filepath) {
		FileReader fr;
		JSONArray objArr = null;
		try {
			fr = new FileReader(filepath);
			JSONParser parser = new JSONParser();
			objArr = (JSONArray) parser.parse(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return objArr;
	}

	public static JSONObject[] impleJsonArr(JSONArray objArr) {
		JSONObject[] obj = new JSONObject[objArr.size()];
		for (int j = 0; j < objArr.size(); j++) {
			obj[j] = (JSONObject) objArr.get(j);
		}
		return obj;
	}

	public static Inventory jsonToInventory(JSONObject obj) {
		Inventory in = new Inventory();

		in.setName((String) obj.get("name"));
		in.setPrice((double) obj.get("price"));
		in.setWeight((double) obj.get("weight"));
		return in;
	}

	public static void main(String[] args) {

		JSONArray arr = readJson(
				"/home/bridgeit/Desktop/Darpan/Eclipse Workspace/Basic Programs/Json Project/input.json");

		List<Inventory> li = new ArrayList<Inventory>();

		JSONObject[] obj = impleJsonArr(arr);

		for (int i = 0; i < obj.length; i++) {
			li.add(jsonToInventory(obj[i]));
			obj[i].put("total",(double) obj[i].get("price")*(double) obj[i].get("weight"));
		}

		System.out.println("|\tname\t|\tprice\t|\tweight\t|\ttotal\t\t|");
		System.out.println("-------------------------------------------------------------------------");
		for (Inventory i : li) {
			System.out.println("|\t" + i.getName() + "\t|\t" + i.getPrice() + "\t|\t" + i.getWeight() + "\t|\t"
					+ i.getPrice() * i.getWeight() + "\t|");
		}
		System.out.println("\n\n");
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].toJSONString());
		}
	}
}