/*
 * Welcome
 */
package com.achess.client.jsonMembers;

/**
 *
 * @author achess
 */
public class Score extends Member{

    public Score(String text) {
        super(text);
    }

    @Override
    public String toString() {
        return "Score{"  + "name=" + value  + '}';
    }
    
    
    
}
