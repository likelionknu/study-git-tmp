package com.git.studygittmp.data.dto;

public class BINDto {

    private String name;
    private int age;
    private int sid;

    public BINDto(String name, int age, int sid){
        this.name = name;
        this.age = age;
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
