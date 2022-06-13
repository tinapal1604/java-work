package com.applicationservice;

import jakarta.xml.ws.Endpoint;

public class BookServicePublisher {

    public static void main(String[] args) {

        try {
            Endpoint.publish("http://localhost:8082/books", new BookServiceImplementation());
            System.out.println("The endpoint has been published..");

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
