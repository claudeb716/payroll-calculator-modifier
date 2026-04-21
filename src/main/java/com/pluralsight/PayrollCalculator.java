package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {
        // File writer
        try {
            FileWriter payRollWriter = new FileWriter("payRoll.csv");


            payRollWriter.write("111|Cameron Tay|3277.65\n");
            payRollWriter.write("222|James Tee|2150.00\n");

            payRollWriter.close();
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}
