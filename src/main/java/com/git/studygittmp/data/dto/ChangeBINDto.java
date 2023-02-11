package com.git.studygittmp.data.dto;

public class ChangeBINDto {

    private Long number;
    private String name;

    public ChangeBINDto(Long number, String name){
        this.number = number;
        this.name = name;
    }

    public ChangeBINDto(){
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
}
