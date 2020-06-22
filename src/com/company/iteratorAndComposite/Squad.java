package com.company.iteratorAndComposite;

public class Squad implements Camp{
    private String name;
    private String nameOfLeader;
    private String[] namesOfChildren;

    public Squad(String name, String nameOfLeader, String[] namesOfChildren) {
        this.name = name;
        this.nameOfLeader = nameOfLeader;
        this.namesOfChildren = namesOfChildren;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfLeader() {
        return nameOfLeader;
    }

    public void setNameOfLeader(String nameOfLeader) {
        this.nameOfLeader = nameOfLeader;
    }

    public String[] getNamesOfChildren() {
        return namesOfChildren;
    }

    public void setNamesOfChildren(String[] namesOfChildren) {
        this.namesOfChildren = namesOfChildren;
    }

    @Override
    public Iterator getIterator() {
        return new ChildrenIterator();
    }

    private class ChildrenIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < namesOfChildren.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return namesOfChildren[index++];
        }
    }
}
