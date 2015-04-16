package com.microtest.testspark;
import static spark.Spark.*;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World.java");
        get("/hello", (request, response) -> "Hello World!");
    }
}