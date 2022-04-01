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
        str.append('{');
        
        str.append(super.toString());
        //"Nombre":"nombre","Tipo","tipo",
                
        str.append('"');
        str.append("Funcion");
        str.append('"');        
        str.append(':');        
        str.append('"');
        
        for(int x = 0; x < places.size(); x++){
            String place = places.get(x);
            str.append(place);
            if(x != places.size() - 1) str.append(',');
        }        
        
        str.append('"');
        
        
        str.append('}');
        return str.toString();
    }
    
    
}
