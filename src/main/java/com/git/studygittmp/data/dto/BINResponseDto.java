package com.git.studygittmp.data.dto;

public class BINResponseDto {

    private Long number;
    private String name;
    private int age;
    private int sid;

    public BINResponseDto() {}

    public BINResponseDto(Long number, String name, int age, int sid){
        this.number = number;
        this.name = name;
        this.age = age;
        this.sid = sid;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
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
