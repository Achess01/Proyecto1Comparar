/*
 * Welcome
 */
package com.achess.server.repeatedMembers;

/**
 *
 * @author achess
 */
public class RepeatedComment extends RepeatedMember{
    public RepeatedComment(String name){
        super("~comment", name);
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
