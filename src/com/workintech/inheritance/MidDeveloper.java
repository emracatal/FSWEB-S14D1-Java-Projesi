package com.workintech.inheritance;

public class MidDeveloper extends Employee{
    public MidDeveloper(String name){
        super(name);
    }

    @Override
    public void work() {
        setSalary(40000);
        System.out.println(getName()+" joined the company with "+getSalary()+" salary");
    }
}