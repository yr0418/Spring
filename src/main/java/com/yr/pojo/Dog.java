package com.yr.pojo;

public class Dog {
    private String name;

   public Dog(){
       System.out.println("Dog 类的无参构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
