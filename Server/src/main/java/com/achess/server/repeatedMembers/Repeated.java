/*
 * Welcome
 */
package com.achess.server.repeatedMembers;

import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class Repeated {
    private static final float SCORE_PERCENT = 0.25f;
    private static Repeated repeated;
    private ArrayList<RepeatedVariable> variables;
    private ArrayList<RepeatedMethod> methods;
    private ArrayList<RepeatedClass> classes;
    private ArrayList<RepeatedComment> comments;   
    private float score;
    private float countVars[] = {0,0};
    private float countMethods[] = {0,0};
    private float countClasses[] = {0,0};
    private float countComments[] = {0,0};
    
    private Repeated(){
        variables = new ArrayList();
        methods = new ArrayList();
        classes = new ArrayList();
        comments = new ArrayList();            
    }
    
    public static Repeated getRepeated(){
        if(repeated == null){
            repeated = new Repeated();
        }
        return repeated;
    }        
    
    public static void clear(){
        repeated = null;
    }
    
    public void setRepeatedVariables(int repeatedVariables) {
        this.countVars[0] += (float)repeatedVariables;
    }
    
    public void addTotalVariables(int total){
        this.countVars[1] += (float)total;
    }

    public ArrayList<RepeatedVariable> getVariables() {
        return variables;
    }

    public ArrayList<RepeatedMethod> getMethods() {
        return methods;
    }

    public ArrayList<RepeatedClass> getClasses() {
        return classes;
    }

    public ArrayList<RepeatedComment> getComments() {
        return comments;
    }
    
    public void addClass(RepeatedClass jc){
        classes.add(jc);
    }
    
    public void addMethod(RepeatedMethod method){
        methods.add(method);
    }
    
    public void addVariable(RepeatedVariable variable){
        variables.add(variable);
    }
    
    public void addComment(RepeatedComment comment){
        comments.add(comment);
    }
    
    public void setRepeatedMethods(int repeatedMethods) {
        this.countMethods[0] += (float)repeatedMethods;
    }
    
    public void totalMethods(int total){
        this.countMethods[1] += (float)total;
    }
    
    public void setRepeatedClasses(int repeatedClasses) {
        this.countClasses[0] += (float)repeatedClasses;
    }

    public void totalClasses(int total){
        this.countClasses[1] += (float)total;
    }

    public void setRepeatedComments(int repeatedComments) {
        this.countComments[0] += (float)repeatedComments;
    }
    
    public void totalComments(int total){
        this.countComments[1] += (float)total;
    }
    
    public void score(){
        float variableScores = 0;
        float methodScores = 0;
        float classScores = 0;
        float commentScores = 0;
        
        if(countVars[1] != 0){
            System.out.println("Hola");
            variableScores = countVars[0]/countVars[1]*SCORE_PERCENT;
        }
        if(countMethods[1] != 0){
            methodScores = countMethods[0]/countMethods[1]*SCORE_PERCENT;
        }
        if(countClasses[1] != 0){
            classScores = countClasses[0]/countClasses[1]*SCORE_PERCENT;
        }
        if(countComments[1] != 0){
            commentScores = countComments[0]/countComments[1]*SCORE_PERCENT;
        }
        
        this.score = variableScores + methodScores + classScores + commentScores;   
        System.out.println(variableScores);
    }

    @Override
    public String toString() {
        return "Repeated{" + 
                "\nvariables=" + variables + 
                ",\nmethods=" + methods + 
                ",\nclasses=" + classes + 
                ",\ncomments=" + comments + 
                ",\nvariables=" + countVars[0] + "/" + countVars[1] +
                ",\nmethods=" + countMethods[0] + "/" + countMethods[1] +
                ",\nclasses=" + countClasses[0] + "/" + countClasses[1] +
                ",\ncomments=" + countComments[0] + "/" + countComments[1] +
                "\nScore: " + score +
                '}';
    }
       
    
    
    
}
