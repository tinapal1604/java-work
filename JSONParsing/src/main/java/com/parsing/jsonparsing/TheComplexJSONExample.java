package com.parsing.jsonparsing;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("unchecked")
public class TheComplexJSONExample {

    public static void main(String[] args) {

        System.out.println("Creating JSONArray of JSONObjects");

        JSONObject dinerListObj = new JSONObject();

        JSONArray dinerList = new JSONArray();

        JSONObject diner1 = new JSONObject();
        diner1.put("name", "Jane Paul");
        diner1.put("age", 23);
        diner1.put("gender", "Female");
        diner1.put("isAllergic", false);
        diner1.put("amountSpent", 145.23);

        JSONObject diner2 = new JSONObject();
        diner2.put("name", "Selena Gomez");
        diner2.put("age", 29);
        diner2.put("gender", "Female");

        JSONArray contactList = new JSONArray();
        JSONObject contact1 = new JSONObject();

        contact1.put("type", "home");
        contact1.put("number", "212-456-258");

        JSONObject contact2 = new JSONObject();
        contact2.put("type", "mobile");
        contact2.put("number", "789-456-321");

        contactList.add(contact1);
        contactList.add(contact2);

        diner1.put("contact", contactList);

        dinerList.add(diner1);
        dinerList.add(diner2);

        dinerListObj.put("diners", dinerList);

        System.out.println(dinerListObj);

        try{
            FileWriter file = new FileWriter("complexDiners.json");
            //dinerListObj.writeJSONString(file);
            file.write(dinerListObj.toJSONString());
            file.flush();

        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Written all data to file.");
        }

    }
}
