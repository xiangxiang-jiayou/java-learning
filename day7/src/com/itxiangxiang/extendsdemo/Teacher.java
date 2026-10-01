package com.itxiangxiang.extendsdemo;

public class Teacher extends  People {

    private String skill;

    public Teacher() {

    }
    public Teacher(String name, char sex, String skill) {

        super(name, sex);
        this.skill = skill;

    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }



}
