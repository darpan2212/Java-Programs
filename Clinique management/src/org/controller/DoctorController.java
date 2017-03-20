package org.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.model.Doctor;

public class DoctorController {

	JSONObject docObj;
	JSONArray docArr = new JSONArray();

	public void addDoc(Doctor d) {
		docObj = new JSONObject();
		docObj.put("id", d.getId());
		docObj.put("name", d.getName());
		docObj.put("specialization", d.getSpecialization());
		docObj.put("availability", d.getAvailability());

		docArr.add(docObj);
	}

	public void printDocList() {
		System.out.println(docArr);
	}

	public Doctor getDocObj(int index) {
		Doctor doc = new Doctor();
		JSONParser parser = new JSONParser();
		JSONArray arr = null;
		try {
			arr = (JSONArray) parser.parse(docArr.toJSONString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JSONObject obj = (JSONObject) arr.get(index);
		doc.setId((String) obj.get("id"));
		doc.setName((String) obj.get("name"));
		doc.setSpecialization((String) obj.get("specialization"));
		doc.setAvailability((String) obj.get("availability"));
		return doc;
	}

	List<Doctor> docLi = new ArrayList<Doctor>();

	public List<Doctor> getDocList() {
		JSONParser parser = new JSONParser();
		JSONArray arr = null;
		try {
			arr = (JSONArray) parser.parse(docArr.toJSONString());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < arr.size(); i++) {
			JSONObject obj = (JSONObject) arr.get(i);
			Doctor doc = new Doctor();
			doc.setId((String) obj.get("id"));
			doc.setName((String) obj.get("name"));
			doc.setSpecialization((String) obj.get("specialization"));
			doc.setAvailability((String) obj.get("availability"));
			docLi.add(doc);
		}
		return docLi;
	}

	public List<Doctor> searchDocByName(String name) {
		List<Doctor> searchLi = new LinkedList<>();
		Doctor doc = new Doctor();
		JSONParser parser = new JSONParser();
		JSONArray arr = null;
		try {
			arr = (JSONArray) parser.parse(docArr.toJSONString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < arr.size(); i++) {
			JSONObject obj = (JSONObject) arr.get(i);
			if (name.equals(obj.get("name"))) {
				doc.setId((String) obj.get("id"));
				doc.setName((String) obj.get("name"));
				doc.setSpecialization((String) obj.get("specialization"));
				doc.setAvailability((String) obj.get("availability"));
				searchLi.add(doc);
			}
		}
		return searchLi;
	}
	
	public Doctor searchDocById(String id) {
		Doctor doc = new Doctor();
		JSONParser parser = new JSONParser();
		JSONArray arr = null;
		try {
			arr = (JSONArray) parser.parse(docArr.toJSONString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < arr.size(); i++) {
			JSONObject obj = (JSONObject) arr.get(i);
			if (id.equals(obj.get("id"))) {
				doc.setId((String) obj.get("id"));
				doc.setName((String) obj.get("name"));
				doc.setSpecialization((String) obj.get("specialization"));
				doc.setAvailability((String) obj.get("availability"));
				return doc;
			}
		}
		System.err.println("No doctor with this ID in this clinic");
		return null;
	}
	
	public List<Doctor> searchDocBySpecialization(String specialization) {
		List<Doctor> searchLi = new LinkedList<>();
		Doctor doc = new Doctor();
		JSONParser parser = new JSONParser();
		JSONArray arr = null;
		try {
			arr = (JSONArray) parser.parse(docArr.toJSONString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < arr.size(); i++) {
			JSONObject obj = (JSONObject) arr.get(i);
			if (specialization.equals(obj.get("specialization"))) {
				doc.setId((String) obj.get("id"));
				doc.setName((String) obj.get("name"));
				doc.setSpecialization((String) obj.get("specialization"));
				doc.setAvailability((String) obj.get("availability"));
				searchLi.add(doc);
			}
		}
		return searchLi;
	}
}