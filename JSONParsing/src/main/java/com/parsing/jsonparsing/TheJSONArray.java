package com.parsing.jsonparsing;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("unchecked")
public class TheJSONArray {
    public static void main(String[] args) throws IOException {
        System.out.println("***Creating JSONArray of JSONObject.");

        JSONArray dinerList = new JSONArray();

        JSONObject diner1 = new JSONObject();
        diner1.put("name", "Jane Paul");
        diner1.put("age", 23);
        diner1.put("gender", "Female");
        diner1.put("isAllergic", false);
        diner1.put("amountSpent", 145.23);

        dinerList.add(diner1);
        System.out.println(dinerList);

        JSONObject diner2 = new JSONObject();
        diner2.put("name", "Charlie Putt");
        diner2.put("age", 26);
        diner2.put("gender", "Male");
        diner2.put("isAllergic", false);
        diner2.put("amountSpent", 14545.23);

        dinerList.add(diner2);

        System.out.println(dinerList);
        System.out.println(dinerList.size());

        try (FileWriter file = new FileWriter("diners.json")){

            dinerList.writeJSONString(file);

        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Written all data to json file.");
    }
}
