package com.collections.set;

import java.util.Objects;

public class Student implements Comparable {
    private String name;
    public int id;

    Student(String name, int id) {
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student))
            return false;
        Student e = (Student)obj;
        if(e == null)
            return false;
        else if(this == e)
            return true;
        else if(this.hashCode() == e.hashCode())
            return true;
        else if(this.id == e.id && this.name.equals(e.name))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id) + Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return name + ", " + id;
    }


    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        return this.id - s.id;
    }

}
