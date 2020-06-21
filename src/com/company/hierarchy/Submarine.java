package com.company.hierarchy;

public class Submarine extends WaterTransport{

    protected boolean presenceOfTorpedoes;
    public Submarine(String name, int weight, int speed, int price, int maxDivingDepth, boolean presenceOfTorpedoes) {
        super(name, weight, speed, price, maxDivingDepth);
        this.presenceOfTorpedoes = presenceOfTorpedoes;
    }

    //Getter and setter for presenceOfTorpedoes
    public boolean isPresenceOfTorpedoes() {
        return presenceOfTorpedoes;
    }

    public void setPresenceOfTorpedoes(boolean presenceOfTorpedoes) {
        this.presenceOfTorpedoes = presenceOfTorpedoes;
    }

    @Override
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Presence of torpedoes = " + isPresenceOfTorpedoes());
    }
}
