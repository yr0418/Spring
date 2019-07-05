package com.yr.pojo;

public class Gril {
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void destory(){
        System.out.println("销毁该对象");
    }

    public void init(){
        System.out.println("你好");
    }

    @Override
    public String toString() {
        return "Gril{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
