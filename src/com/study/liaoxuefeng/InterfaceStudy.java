package com.study.liaoxuefeng;

public class InterfaceStudy {
    public static void main(String[] args) {
        InterfacePerson p = new Student("Xiao Ming");
        p.run();
    }
}


interface InterfacePerson {
    String getName();

    default void run() {
        System.out.println(getName() + " run");
    }
}

class Student implements InterfacePerson {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public void run() {
        System.out.println("hello");
    }
}