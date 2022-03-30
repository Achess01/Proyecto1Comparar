/*
 * Welcome
 */
package com.achess.server.repeatedMembers;
import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class RepeatedVariable extends RepeatedMember{
    private ArrayList<String> places;
    
    public RepeatedVariable(String type, String name){
        super(type, name);
        places = new ArrayList();
    }
    
    public void addPlace(String place){
        places.add(place);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(super.toString()+"\n");
        for(String p: places){
            str.append("\t" + p + "\n");
        }
        return str.toString();
    }
    
    
}
