package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
        //obj.name="Rishav";
        //java: name has private access in com.driver.RWOnly

        obj.setName("Rishav");
        System.out.println(obj.getName());
    }
  
}