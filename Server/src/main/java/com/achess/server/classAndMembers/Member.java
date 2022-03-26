/*
 * Welcome
 */
package com.achess.server.classAndMembers;

/**
 *
 * @author achess
 */
public abstract class Member {
    protected String name;
    protected String type;

    public Member(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }       

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "name=" + name + ", type=" + type;
    }
    
    
}
