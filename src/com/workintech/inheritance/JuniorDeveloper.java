package com.workintech.inheritance;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(String name){
        super(name);
    }

    @Override
    public void work() {
        setSalary(30000);
        System.out.println(getName()+" joined the company with "+getSalary()+" salary");
    }
}