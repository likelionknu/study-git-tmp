package com.git.studygittmp.data.dto;

public class ChangeSunNameDto {
    private Long number;
    private String name;
    public ChangeSunNameDto(Long number, String name){
        this.number = number;
        this.name = name;
    }
    public ChangeSunNameDto(){
    }

    public Long getNumber() {
        return this.number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
