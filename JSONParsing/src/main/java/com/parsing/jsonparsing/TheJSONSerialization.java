package com.parsing.jsonparsing;

import org.json.simple.JSONArray;

import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("unchecked")
public class TheJSONSerialization {

    public static void main(String[] args) {

        System.out.println("***Creating JSONArray of Diners***");

        JSONArray dinerList = new JSONArray();

        Diner diner1 = new Diner("Jane Stark", 22, "Female", 154);
        Diner diner2 = new Diner("Jon Snow", 26, "Male", 1054);

        dinerList.add(diner1);
        dinerList.add(diner2);

        System.out.println(dinerList);

        try{
            FileWriter file = new FileWriter("serializedDiners.json");
            //file.write(dinerList.toJSONString());
            dinerList.writeJSONString(file);
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Done writing to file");
    }

}
