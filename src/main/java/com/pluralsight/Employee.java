package com.pluralsight;

public class Employee {

        // Private
        private int employeeId;
        private String name;
        private double hoursWorked;
        private double payRate;
        //Constructor
        public Employee(int id, String name, double hours, double pay) {

        }
        // Getters Setter

        public int getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getHoursWorked() {
            return hoursWorked;
        }

        public void setHoursWorked(double hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

        public double getPayRate() {
            return payRate;
        }

        public void setPayRate(double payRate) {
            this.payRate = payRate;
        }
        public double getGrossPay(){
            return hoursWorked * payRate;
        }
    }

