package com.workintech.inheritance;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(String name){
        super(name);
    }

    @Override
    public void work() {
        setSalary(50000);
        System.out.println(getName()+" joined the company with "+getSalary()+" salary");
    }
}