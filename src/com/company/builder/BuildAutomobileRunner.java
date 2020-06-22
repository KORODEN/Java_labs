package com.company.builder;

public class BuildAutomobileRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new SportCarBuilder());
        Automobile automobile = director.buildAutomobile();

        automobile.ShowInfo();

        System.out.println();

        director.setBuilder(new OffRoadCarBuilder());
        automobile = director.buildAutomobile();

        automobile.ShowInfo();
    }
}
