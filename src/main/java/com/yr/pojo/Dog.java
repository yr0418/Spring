package com.yr.pojo;

public class Dog {
    private String name;

   public Dog(){

       System.out.println("Dog 类的无参构造函数");
    }

    public Dog(String name){
       this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
