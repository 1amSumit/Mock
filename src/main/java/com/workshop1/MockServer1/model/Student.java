package com.workshop1.MockServer1.model;

public class Student {
    private String usn;
    private String name;
    private String phoneNumber;

    public Student(String usn, String name, String phoneNumber) {
        this.usn = usn;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getUsn() { return usn; }
    public void setUsn(String usn) { this.usn = usn; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
