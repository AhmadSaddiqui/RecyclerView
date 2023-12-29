package com.example.recyclerview;

public class P {
    String name;
    String color;
    String preference;

    public P() {
    }

    public P(String name, String color, String preference) {
        this.name = name;
        this.color = color;
        this.preference = preference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + color + '\'' +
                ", preference='" + preference + '\'' +
                '}';
    }
}
