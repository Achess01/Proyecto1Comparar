/*
 * Welcome
 */
package com.achess.server.classAndMembers;

/**
 *
 * @author achess
 */
public class JavaComment {
    private String comment;
    private boolean counted;

    public JavaComment(String comment) {
        this.comment = comment;
        this.counted = false;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isCounted() {
        return counted;
    }

    public void setCounted(boolean counted) {
        this.counted = counted;
    }

    @Override
    public String toString() {
        return comment;
    }
    
    
}
