package org.example;


public class Main {


    public static void main(String[] args) {

        Utility utility = new Utility();
        utility.setFirstValue(5);
        utility.setSecondValue(10);
        System.out.println(utility.getFirstValue() + "     " + utility.getSecondValue());
    }

    public String sayHello() {
        System.out.println("Hello world");
        return "Hello world";
    }

    public int firstValue() {
        Utility utility = new Utility();
        return utility.getFirstValue();
    }
}