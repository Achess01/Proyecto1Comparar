/*
 * Welcome
 */
package com.achess.client.copy;

/**
 *
 * @author achess
 */
public class CopyVariable {
    private String name;
    private int type;
    private Value value;
    public Operation op;

    public CopyVariable(String name, int type, Operation op) {
        this.name = name;
        this.type = type;
        this.op = op;
    }

    public CopyVariable(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.op = null;
        this.value = value;
    }

    @Override
    public String toString() {
        return "CopyVariable{" + "name=" + name + ", type=" + type + ", value=" + value + '}';
    }
    
        
}
