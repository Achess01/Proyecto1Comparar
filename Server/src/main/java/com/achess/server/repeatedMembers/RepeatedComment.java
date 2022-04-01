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
         StringBuilder str = new StringBuilder();
        str.append('{');
                        
                
        str.append('"');
        str.append("Texto");
        str.append('"');        
        str.append(':');        
        str.append('"');        
        str.append(name);        
        str.append('"');                
        str.append('}');
        return str.toString();
    }
    
    
}
