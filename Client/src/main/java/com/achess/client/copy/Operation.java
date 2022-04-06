/*
 * Welcome
 */
package com.achess.client.copy;

import com.achess.client.error.ClientError;

/**
 *
 * @author achess
 */
public class Operation{
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULTIPLICACION = 3;
    public static final int DIVISION = 4;
    public static final int NEGACION = 5;
    public static final int UNITARIO = 6;
    
    private int type;
    private Value value;
    private Operation left;
    private Operation right;    
    private int line;

    public Operation(int type, Operation left, Operation right, int line) {                
        this.type = type;
        this.left = left;
        this.right = right;        
    }
    
    public Operation(Value value) {
        this.type = UNITARIO;   
        this.value = value;
    }       

    public void setLeft(Operation left) {
        this.left = left;
    }

    public void setRight(Operation right) {
        this.right = right;
    }

    public int getType() {
        return type;
    }

    public Value getValueStr() {
        return value;
    }

    public Operation getLeft() {
        return left;
    }

    public Operation getRight() {
        return right;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
    
    
    private int finalType(int typeValueL, int typeValueR, int typeOperation){
        boolean string1 = false, string2 = false;
        string1 = typeValueL == Value.STRING;
        string2 = typeValueR == Value.STRING;
        if((
            (string1 && string2) ||
            (!string1 && string2) ||
            (string1 && !string2)
            )
            && typeOperation == SUMA){
           return Value.STRING;
       }else if(!string1 && !string2){
           return Value.INTEGER;
       }
        return Value.ERROR;
    }
       
    public Value run() {  
        if(type == UNITARIO){
            return value;
        }  
        int finalType = finalType(left.value.getType(), right.value.getType(), this.type);
        
        if(finalType == Value.ERROR){
            ClientError.getError().log("COPY\nError al castear los tipos ln:" + this.line);
            return null;
        }else if(finalType == Value.STRING){
            Value valL = left.run();
            Value valR = left.run();
            
            if(valL != null && valR != null){
                String fval = valL.getValue() + valR.getValue();
                value = new Value(fval, Value.STRING);
                return value;
            }                        
        }else if(finalType == Value.INTEGER){
            Value valL = left.run();
            Value valR = left.run();
            Integer fval = 0;
            if(valL != null && valR != null){
                switch(type){
                    case MULTIPLICACION:
                        fval = valL.getIntegerValue() * valR.getIntegerValue();
                        break;
                    case DIVISION:
                        fval = valL.getIntegerValue() / valR.getIntegerValue();
                        break;
                    case RESTA:
                        fval = valL.getIntegerValue() * valR.getIntegerValue();
                        break;
                    case SUMA:
                        fval = valL.getIntegerValue() * valR.getIntegerValue();
                        break;
                    case NEGACION:
                        fval = 0 - valL.getIntegerValue();
                        break;                    
                }
                value = new Value(fval.toString(), Value.INTEGER);
            }   
            
        }
        return null;
        
    }

    @Override
    public String toString() {
        return "Operation{" + "type=" + type + ", valueStr=" + value + ", left=" + left + ", right=" + right + '}';
    }            
}