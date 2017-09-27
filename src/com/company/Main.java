package com.company;

public class Main {

    public static void main(String[] args) {
        print(args);
    }

    public static void print(String[] args) {
        for(String str: args)
        {
            System.out.println(str);
        }
    }
}
