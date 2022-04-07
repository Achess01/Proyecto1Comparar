/*
 * Welcome
 */
package com.achess.client.ui;

import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class ProjectsJava {
    private static ProjectsJava pj;
    
    private ArrayList<String> pj1;
    private ArrayList<String> pj2;
    private ProjectsJava(){
        pj1 = new ArrayList();
        pj2 = new ArrayList();
    }
    
    public static ProjectsJava getPJ(){
        if(pj == null){
            pj = new ProjectsJava();
        }
        return pj;
    }

    public ArrayList<String> getPj1() {
        return pj1;
    }

    
    public void addFile(String text, boolean isP1){
        if(isP1){
            pj1.add(text);
        }else{
            pj2.add(text);
        }
    }
    
    
    public void setPj1(ArrayList<String> pj1) {
        this.pj1 = pj1;
    }

    public ArrayList<String> getPj2() {
        return pj2;
    }

    public void setPj2(ArrayList<String> pj2) {
        this.pj2 = pj2;
    }

    @Override
    public String toString() {
        return "ProjectsJava{" + "pj1=" + pj1 + ", \n\npj2=" + pj2 + '}';
    }
        
    
}
