/*
 * Welcome
 */
package com.achess.server.classAndMembers;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JavaComment other = (JavaComment) obj;
        return Objects.equals(this.comment, other.comment);
    }
    
    
    
}
