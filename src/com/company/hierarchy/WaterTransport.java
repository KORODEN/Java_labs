package com.company.hierarchy;

public class WaterTransport extends AbstractTransport{

    protected int maxDivingDepth;

    public WaterTransport(String name, int weight, int speed, int price, int maxDivingDepth) {
        super(name, weight, speed, price);
        this.maxDivingDepth = maxDivingDepth;
    }

    //Getter and setter for maxDivingDepth
    public int getMaxDivingDepth() {
        return maxDivingDepth;
    }

    public void setMaxDivingDepth(int maxDivingDepth) {
        this.maxDivingDepth = maxDivingDepth;
    }

    @Override
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Maximum diving depth = " + getMaxDivingDepth() + " м");
    }
}
