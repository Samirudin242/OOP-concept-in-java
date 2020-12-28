package com.theyaku;

public class Person {

    public String name;
    public int age;
    public String address;
    public boolean programmer;

    public Person(String name, int age, String address, boolean programmer) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.programmer = programmer;
    }

    public void isProgrammer() {
        if(this.programmer) {
            System.out.println(this.name +  " is a developer");
        } else {
            System.out.println("This man is not a developer");
        }
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void getAddress() {
        System.out.println(this.address);
    }

}
