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
    private String varName;
    private int line;
    boolean identifier;

    public Operation(int type, Operation left, Operation right, int line) {                
        this.type = type;
        this.left = left;
        this.right = right;        
        this.line = line;
    }
    
    public Operation(Value value, int line) {
        this.type = UNITARIO;   
        this.value = value;
        this.line = line;        
    }       
        
    public Operation(String varName, int line){
        this.varName = varName;
        this.line = line;
        this.type = UNITARIO;
        this.identifier = true;
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
        string2 = typeValueL == Value.STRING;
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
        if(identifier){
            CopyVariable variable = ParseCopy.getCopy().getVariable(varName);
            if(variable == null){
                ClientError.getError().log("COPY\n"+varName+" no está definida ln:" + this.line);
                return null;
            }                        
            if(variable.getValue() == null) {
                ClientError.getError().log("COPY\n"+varName+" no tiene ningún valor ln:" + this.line);
                return null;
            }
            return variable.getValue();
        }
        
        if(type == UNITARIO){
            return value;
        }else if(type == NEGACION){
            Value val = left.run();
            if(val == null || val.getType() == Value.STRING){
                ClientError.getError().log("COPY\nError al castear los tipos ln:" + this.line);
                return null;
            }
            else {
                Integer fval = 0 - val.getIntegerValue();
                val.setValue(fval.toString());
                return val;
            }
        }
        
        Value leftVal = left.run();
        Value rightVal = right.run();
        
        if(leftVal == null || rightVal == null) return null;
        
        int finalType = finalType(leftVal.getType(), rightVal.getType(), this.type);
                
        
        if(finalType == Value.ERROR){
            ClientError.getError().log("COPY\nError al castear los tipos ln:" + this.line);
            return null;
        }else if(finalType == Value.STRING){                                    
                String fval = leftVal.getValue() + rightVal.getValue();
                value = new Value(fval, Value.STRING);
                return value;            
        }else if(finalType == Value.INTEGER){                        
            Integer fval = 0;            
            switch(type){
                case MULTIPLICACION:
                    fval = leftVal.getIntegerValue() * rightVal.getIntegerValue();
                    break;
                case DIVISION:
                    fval = leftVal.getIntegerValue() / rightVal.getIntegerValue();
                    break;
                case RESTA:
                    fval = leftVal.getIntegerValue() - rightVal.getIntegerValue();
                    break;
                case SUMA:
                    fval = leftVal.getIntegerValue() + rightVal.getIntegerValue();
                    break;
                case NEGACION:
                    fval = 0 - leftVal.getIntegerValue();
                    break;                    
            }
            value = new Value(fval.toString(), Value.INTEGER);
            return value;            
        }
        return null;        
    }

    @Override
    public String toString() {
        return "Operation{" + "type=" + type + ", valueStr=" + value + ", left=" + left + ", right=" + right + '}';
    }            
}