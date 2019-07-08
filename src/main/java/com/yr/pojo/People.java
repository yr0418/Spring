package com.yr.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {

    private String name;

    private int age;

    private String[] friends;

    private List<Integer> nums;

    private Car car;

    private List<Cat> catList;

    private Set<Dog> dogSet;
    /**
     * 以 String 作为 key
     * 以 Gril 作为 value
     */
    private Map<String,Gril> grilMap;

    public Map<String, Gril> getGrilMap() {
        return grilMap;
    }

    public void setGrilMap(Map<String, Gril> grilMap) {
        this.grilMap = grilMap;
    }



    public Set<Dog> getDogSet() {
        return dogSet;
    }

    public void setDogSet(Set<Dog> dogSet) {
        this.dogSet = dogSet;
    }

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Integer> getNums() {
        return nums;
    }

    public void setNums(List<Integer> nums) {
        this.nums = nums;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + Arrays.toString(friends) +
                ", nums=" + nums +
                ", car=" + car +
                ", catList=" + catList +
                ", dogSet=" + dogSet +
                '}';
    }
}
