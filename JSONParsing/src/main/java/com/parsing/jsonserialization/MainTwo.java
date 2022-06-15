package com.parsing.jsonserialization;

import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class MainTwo {

    public static void main(String[] args) {

        JSONObject employeeJSON = new JSONObject();

        employeeJSON.put("name", "john");
        employeeJSON.put("age", 25);
        employeeJSON.put("gender", JSONObject.NULL);
        employeeJSON.put("title", "Senior Developer");
        employeeJSON.put("salary", 20000000);

        System.out.println(employeeJSON);

        try{
            FileWriter file = new FileWriter("employee.json");
            employeeJSON.write(file, 2, 0);
            file.flush();

        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("written data to file.");
    }
}
