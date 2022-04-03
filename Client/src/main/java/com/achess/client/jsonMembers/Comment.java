/*
 * Welcome
 */
package com.achess.client.jsonMembers;

/**
 *
 * @author achess
 */
public class Comment extends Member{

    public Comment(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return "Comment{"  + "name=" + value +'}';
    }
        
    
}
