package com.hex;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        PrintWriter outputFile = new PrintWriter("test_File");
        outputFile.println("this works!");
        outputFile.close();
    }
}
