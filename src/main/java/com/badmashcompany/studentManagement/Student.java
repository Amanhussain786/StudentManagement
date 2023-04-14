package com.badmashcompany.studentManagement;

public class Student {
    private int admNo;
    private String name;
    private int age;
    private String branch;

    public Student() {
        this.admNo = admNo;
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
