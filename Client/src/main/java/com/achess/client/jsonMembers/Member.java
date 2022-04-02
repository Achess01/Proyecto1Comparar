/*
 * Welcome
 */
package com.achess.client.jsonMembers;

/**
 *
 * @author achess
 */
public abstract class Member {
    protected String value;

    public Member(String text) {
        this.value = text;
    }

    public String getValue() {
        return value;
    }        
        
}
