package com.pluralsight;

import java.io.*;

public class PayrollCalculator {
    public static void main(String[] args) {
        // File writer
        try {
//            FileWriter payRollWriter = new FileWriter("payRoll.csv");
            BufferedWriter payRollWriter2 = new BufferedWriter( new FileWriter("payRoll.csv"));
            BufferedReader br = new BufferedReader(new FileReader("payRoll.csv"));
            String line;
            while (( line = br.readLine()) != null) {
                String[] emps = line.split("\\|");
                int id = Integer.parseInt(emps[0]);
                String name = emps[1];
                double hoursWorked = Double.parseDouble(emps[2]);
                double payRate = Double.parseDouble(emps[3]);

                Employee employ = new Employee(id, name, hoursWorked, payRate);



//            payRollWriter.write("111|Cameron Tay|3277.65\n");
//            payRollWriter.write("222|James Tee|2150.00\n");
//
//            payRollWriter.close();
            payRollWriter2.close();
            }
        }catch (Exception e) {
            System.err.println("Error");
    }
    }
}
