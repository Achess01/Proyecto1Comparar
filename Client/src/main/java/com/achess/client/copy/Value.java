/*
 * Welcome
 */
package com.achess.client.copy;

/**
 *
 * @author achess
 */
public class Value {
    public static final int INTEGER = 0;
    public static final int STRING = 1;    
    public static final int ERROR = -1;
    private String value;
    private int type;

    public Value(String value, int type) {
        this.value = value;
        this.type = type;
    }
    
    public Integer getIntegerValue() {
        if(type == INTEGER) return Integer.valueOf(value);
        return 0;
    }
    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return value;
    }    
    
}
