/*
 * Welcome
 */
package com.achess.server.classAndMembers;

import java.util.Objects;

/**
 *
 * @author achess
 */
public abstract class Member {
    protected String name;
    protected String type;
    protected boolean counted;

    public Member(String name, String type) {
        this.name = name;
        this.type = type;
        this.counted = false;
    }

    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }       

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCounted() {
        return counted;
    }

    public void setCounted(boolean counted) {
        this.counted = counted;
    }
        

    @Override
    public String toString() {
        return "name=" + name + ", type=" + type;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Member other = (Member) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.type, other.type);
    }
    
    
    
}
