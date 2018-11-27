package com.hiya.se.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HiyaSetOper  extends AbstractChainHandler implements IHiyaCollection 
{

    public Set<Course> courses = new HashSet<Course>();

    public HiyaSetOper()
    {
    }
    
    @Override
    public void doBudiness(Student student)
    {
        System.out.println("HiyaSetOper doBudiness....");
        //operation();
    }
    
    @Override
    public void operation()
    {
        courses.add(new Course("1", "离散数学"));
        courses.add(new Course("2", "Java语言"));
        Course[] crs =  { new Course("3", "大学英语"), new Course("4", "软件设计"), new Course("5", "软件测试") };
        courses.addAll(Arrays.asList(crs));
        Iterator<Course> it = courses.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next().toString());
        }

        Set<Course> courseTree = new TreeSet<Course>();
        courseTree.add(new Course("3", "离散数学"));
        courseTree.add(new Course("2", "Java语言"));
        Course[] crs2 ={ new Course("1", "大学英语"), new Course("7", "软件设计"), new Course("5", "软件测试") };
        courseTree.addAll(Arrays.asList(crs2));
        Iterator<Course> it2 = courseTree.iterator();
        while (it2.hasNext())
        {
            System.out.println(it2.next().toString());
        }
    }
}
