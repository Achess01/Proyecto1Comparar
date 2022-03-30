/*
 * Welcome
 */
package com.achess.server.repeatedMembers;

/**
 *
 * @author achess
 */
public abstract class RepeatedMember {
    protected String type;
    protected String name;
    protected boolean repeated;
    protected int counted;
    
    public RepeatedMember(String type, String name) {
        this.type = type;
        this.name = name;
        repeated = false;
        counted = 1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRepeated() {
        return repeated;
    }

    public void repeated() {
        this.repeated = true;
    }
    
    public void addCount(){
        this.counted++;
    }

    public int getCounted() {
        return counted;
    }        

    @Override
    public String toString() {
        return type + " " + name + " - " + repeated;
    }
    
            
}
