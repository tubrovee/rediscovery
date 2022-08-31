package com.company;

public class Employee {

    private  Integer age;
    private  String first_name;
    private  String last_name;

    public Employee(Integer age, String first_name, String last_name) {
        this.age = age;
        this.first_name = first_name;
        this.last_name = last_name;
    }


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



}
