package org.inventory;

import java.io.FileReader; 
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonFileReadDemo {

	String name;
	double weight, price;

	public static void main(String[] args) throws IOException {

		FileReader fr = null;

		try {
			fr = new FileReader(
					"/home/bridgeit/Desktop/Darpan/Eclipse Workspace/Basic Programs/Json Project/input.json");

			int i = fr.read();
			String s = "";
			while(i>-1){
				s+=(char) i;
				i = fr.read();
			}
			System.out.println(s);
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject)parser.parse(s);
			System.out.println(obj.get("Author"));
			System.out.println(obj.get("Name"));
			JSONArray objA = (JSONArray)obj.get("Company List");
			System.out.println(obj.get("Company List"));
			System.out.println(objA);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}