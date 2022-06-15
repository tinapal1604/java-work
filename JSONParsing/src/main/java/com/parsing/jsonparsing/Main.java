package com.parsing.jsonparsing;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        System.out.println("Reading from a JSON file.");

        try{
            FileReader reader = new FileReader("diner.json");
            JSONObject dinerDate = (JSONObject) JSONValue.parse(reader);
            System.out.println(dinerDate);

            String name = (String) dinerDate.get("name");
            System.out.println("\nName:"+name);

            String gender = (String) dinerDate.get("gender");
            System.out.println("\nGender:"+gender);

            Long age = (Long) dinerDate.get("age");
            System.out.println("\nAge:"+age);

        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nDone reading data.");
    }
}

/*
* System.out.println("*****Creating JSONObject*****");

        JSONObject diner = new JSONObject();

        diner.put("name", "Jane Stark");
        diner.put("age", 22);
        diner.put("gender", null);
        diner.put("isAllergic", false);
        diner.put("amountSpent", 1556.26);

        System.out.println(diner.toJSONString());
        FileWriter file = new FileWriter("diner.json");
        try {

            file.write(diner.toJSONString());
            file.flush();

        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            file.close();
        }

        System.out.println("Writing out json Object");*/