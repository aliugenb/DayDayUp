package com.study.liaoxuefeng;

public class FangFa {
    public static void main(String[] args) {
        String name = "helen";
        int age = 100;
        Person person = new Person(name, age);
//        person.setAge(age);
//        person.setName(name);
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}

class Person {
    private int age = 66;
    private String name = "may";

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return testAge(20);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private int testAge(int tempAge) {
        return age - tempAge;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}