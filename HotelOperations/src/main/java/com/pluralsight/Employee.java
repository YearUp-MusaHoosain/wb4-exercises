package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public double getOvertimeHours() {
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    public double getTotalPay() {
//        if(hoursWorked > 40){
//            double overTimeHours = hoursWorked - 40;
//            double regularPay = 40 * payRate;
//            double overTimePay = overTimeHours * payRate * 1.5;
//            return regularPay + overTimePay;
//        }
//        else {
//            return this.payRate * this.hoursWorked;
//        }

        double regularPay = getRegularHours() * payRate;
        double overTimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overTimePay;
    }

    public double punchIn(double time){
        return this.hoursWorked -= time;
    }

    // todo
    public double punchIn(){
        double localHour = LocalDateTime.now().getHour();
        double localMinute = LocalDateTime.now().getMinute();

        double minutes =  localMinute / 60;
        double punchInTime = localHour + minutes;

        return this.hoursWorked = this.hoursWorked -  punchInTime;
    }

    public double punchOut(double time){
        return this.hoursWorked = this.hoursWorked + time;
    }

    // todo
    public double punchOut(){
        double localHour = LocalDateTime.now().getHour();
        double localMinute = LocalDateTime.now().getMinute();

        double minutes =  localMinute / 60;
        double punchInTime = localHour + minutes;

        return this.hoursWorked = this.hoursWorked + punchInTime;
    }

    public double punchTimeCard(double timeIn, double timeOut){
        return this.hoursWorked = this.hoursWorked + timeOut - timeIn;
    }

    // todo
//    public double punchTimeCard(){
//        LocalDateTime localDateTime = LocalDateTime.now();
//
//    }
}

