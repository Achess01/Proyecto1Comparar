/*
 * Welcome
 */
package com.achess.server.repeatedMembers;

/**
 *
 * @author achess
 */
public class RepeatedMethod extends RepeatedMember{
    private int parametersAmount;
    
    public RepeatedMethod(String type, String name, int parametersAmount){
        super(type, name);
        this.parametersAmount = parametersAmount;
    }
        
}
