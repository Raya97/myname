package com.mycompany.app;

import com.google.gson.JsonObject;

public class App
{
    public static void main(String[] args)
    {
        JsonObject obj = new JsonObject();
        obj.addProperty("name", "Raisa");
        obj.addProperty("lastName", "Vlasenko");

        System.out.println(obj);

    }
}

