package com.parsing.jsonserialization;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingJSONFile {

    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("employee.json"));
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            String ls = System.getProperty("line.separator");

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            JSONObject employeeJSON = new JSONObject(stringBuilder.toString());

            String name = employeeJSON.getString("name");
            String title = employeeJSON.getString("title");
            int age = employeeJSON.getInt("age");
            long salary = employeeJSON.getLong("salary");

            System.out.format("Name: %s, Title: %s, Age: %d, Salary: %d", name, title, age, salary);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
