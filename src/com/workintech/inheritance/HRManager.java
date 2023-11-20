package com.workintech.inheritance;

public class HRManager extends Employee {
    public JuniorDeveloper[] juniors;
    public MidDeveloper[] mids;
    public SeniorDeveloper[] seniors;

    public HRManager(String name, JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(name);
        this.juniors=juniors;
        this.mids=mids;
        this.seniors=seniors;
    }

    @Override
    public void work() {
        setSalary(60000);
        System.out.println(getName() + " joined the company with " + getSalary() + " salary");
    }

    public void addEmployee(int index,JuniorDeveloper junior){
        try {
            if (juniors[index] == null) {
                juniors[index] = junior;
            } else {
                System.out.println("index is full");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.getMessage();
            System.out.println("Index not found" + index);
        }
    }

    public void addEmployee(int index,MidDeveloper mid){
        try {
            if (mids[index] == null) {
                mids[index] = mid;
            } else {
                System.out.println("index is full");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.getMessage();
            System.out.println("Index not found" + index);
        }
    }

    public void addEmployee(int index,SeniorDeveloper senior){
        try {
            if (seniors[index] == null) {
                seniors[index] = senior;
            } else {
                System.out.println("index is full");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.getMessage();
            System.out.println("Index not found" + index);
        }
    }
}
