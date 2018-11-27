package com.hiya.se.collection;

public class Course implements Comparable<Course>
{
    public String id;
    public String name;

    public Course()
    {
    }

    public Course(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof Course))
        {
            return false;
        }
        Course other = (Course) obj;
        if (name == null)
        {
            if (other.name != null)
            {
                return false;
            } else if (!name.equals(other.name))
            {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"[id="+this.id+";name="+this.name+"]";
    }
    
    @Override
    public int compareTo(Course o) 
    {
        return (this.id .compareTo(o.id));
    }
}
