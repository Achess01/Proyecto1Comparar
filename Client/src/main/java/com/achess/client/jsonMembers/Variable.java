/*
 * Welcome
 */
package com.achess.client.jsonMembers;

import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class Variable extends Member{
    private String type;    
    private String function;

    public Variable(String value, String type, String function) {
        super(value);
        this.type = type;
        this.function = function;
    }
    
}
