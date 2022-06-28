package com.example.serializationparsing;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("writing to a custom serialization class");
        Account account1 = new Account(111111l, "Shobha Sood", 12343546.0d);
        Account account2 = new Account(222222, "Sonam Bhujel", 24983323.2d);
        String fileName  = "account.txt";

        ObjectOutputStream objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));

        try {

            objOut.writeObject(account1);
            objOut.writeObject(account2);

        }catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("code executed successfully.");
        }

    }
}

/*System.out.println("Reading records using ObjectOutputStream.");
        String productFilename = "product.txt";

        try (ObjectInputStream objeIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(productFilename)))) {

            for (int i = 0; i < 3; i++) {

                BigInteger id = (BigInteger) objeIn.readObject();
                String name = objeIn.readUTF();
                float price = objeIn.readFloat();

                System.out.println("Product Id:" +id+"\nProduct Name:"+name+"\nProduct price"+price);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Successfully executed code.");
        }*/

  /*ystem.out.println("ObjectOutputStream to write to Disk");

        BigInteger[] productIds = new BigInteger[]{
                new BigInteger("12300000124"),
                new BigInteger("24130201354"),
                new BigInteger("54315678216")
        };
        String[] productNames = new String[]{"Samsung TV", "Adidas Shoes", "iPhone 12Pro"};
        float[] productPrices = new float[]{68000.58f, 16000.89f, 120000.45f};

        String productFilename = "product.txt";
        ObjectOutputStream objOut = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(productFilename)));

        try{
            for(int i = 0; i < productIds.length; i++) {
                    objOut.writeObject(productIds[i]);
                    objOut.writeUTF(productNames[i]);objOut.writeFloat(productPrices[i]);}
        }finally {

            System.out.println("Completed code execution.");

        }*/


