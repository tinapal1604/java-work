package com.parsing.jsonparsing;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("unchecked")
public class ReadingJSONComplexExample {

    public static void main(String[] args) {

        System.out.println("***Reading from JSON complex example.");

        try{
            FileReader reader = new FileReader("complexDiners.json");
            JSONObject dinerListObject = (JSONObject) JSONValue.parse(reader);
            JSONArray dinersList = (JSONArray) dinerListObject.get("diners");

            for (Object obj: dinersList) {

                JSONObject diner = (JSONObject) obj;

                System.out.println("****Diners****");

                for (Object keyObj: diner.keySet()) {
                    String key = (String) keyObj;

                    if(key.equals("contact")) {

                        JSONArray contactList = (JSONArray) diner.get(key);
                        System.out.println("Contacts:");
                        for (Object contact: contactList) {
                            JSONObject contactJSON = (JSONObject) contact;

                            System.out.format("**Number: %s, Type: %s**\n", contactJSON.get("number"), contactJSON.get("type"));
                        }
                    }

                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
