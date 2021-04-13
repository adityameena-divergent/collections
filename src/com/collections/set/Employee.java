package com.collections.set;

import java.util.Objects;

public class Employee implements Comparable {
    int id;
    String name;

    public Employee(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "[" + id + "," + name + "]";
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id) + Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee))
            return false;
        Employee e = (Employee)obj;
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
    public int compareTo(Object o) {
        Employee e = (Employee)o;
        return this.id - e.id;
    }
}
