/*
 * Welcome
 */
package com.achess.client.attribute;

/**
 *
 * @author achess
 */
public class Attribute<T> {
    public static final int VARIABLES = 1;
    public static final int METHODS = 2; 
    public static final int CLASSES = 3;
    public static final int COMMENTS = 4;    
    public static final int SCORE = 5;    
    private T attribute;
    private int type;
    private int line;

    public Attribute(T attribute, int type, int line) {
        this.attribute = attribute;
        this.type = type;
        this.line = line;
    }

    public T getAttribute() {
        return attribute;
    }

    public int getType() {
        return type;
    }               

    public int getLine() {
        return line;
    }
}
