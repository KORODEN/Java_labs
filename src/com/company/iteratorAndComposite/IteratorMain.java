package com.company.iteratorAndComposite;

public class IteratorMain {
    public static void main(String[] args) {
        String[] namesOfChildren = {"Vasily", "Masha", "Danil", "Roma"};

        Squad squad = new Squad("Dolphins", "Denis", namesOfChildren);

        Iterator iterator = squad.getIterator();
        System.out.println("Squad: " + squad.getName());
        System.out.println("Name of leader: " + squad.getNameOfLeader());
        System.out.println("Children list: ");

        while(iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
