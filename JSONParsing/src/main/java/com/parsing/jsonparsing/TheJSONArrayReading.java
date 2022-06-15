package com.parsing.jsonparsing;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("unchecked")
public class TheJSONArrayReading {

    public static void main(String[] args) {

        System.out.println("Reading from a JSON file.");

        try {

            FileReader reader = new FileReader("diners.json");
            JSONArray dinerList = (JSONArray) JSONValue.parse(reader);
            System.out.println(dinerList);

            for (Object obj: dinerList) {
                JSONObject diner = (JSONObject) obj;
                System.out.println("****DinersList*****");

                String name = (String) diner.get("name");
                System.out.println("Name:"+name);

                String gender = (String) diner.get("gender:");
                System.out.println("Gender"+gender);

                double amoutSpent = (double) diner.get("amountSpent");
                System.out.println("Amount:"+amoutSpent);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
