package com.hiya.se.collection;

import java.util.HashSet;
import java.util.Set;

public class Student  implements Comparable<Course>
{
    public String id;
    public String name;
    Set<Course> courses;

    public Student(String id, String name)
    {
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }
    
    @Override
    public int compareTo(Course o) 
    {
        return (this.id .compareTo(o.id));
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Set<Course> getCourses()
    {
        return courses;
    }

    public void setCourses(Set<Course> courses)
    {
        this.courses = courses;
    }
}
