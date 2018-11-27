package com.hiya.se.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HiyaListOper   extends AbstractChainHandler   implements IHiyaCollection
{

    public List<Course> courseToSelect = new ArrayList<Course>();

    public HiyaListOper()
    {
    }

    public void testAdd()
    {
        Course cr1 = new Course("1", "数据结构");
        courseToSelect.add(0, cr1);
        Course temp = (Course) courseToSelect.get(0);
        System.out.println("添加的课程：" + temp.id + ":" + temp.name);

        Course cr2 = new Course("2", "Java语言");
        courseToSelect.add(0, cr2);
        Course temp2 = (Course) courseToSelect.get(0);
        System.out.println("添加的课程：" + temp2.id + ":" + temp2.name);

        Course[] courses =
        { new Course("3", "离散数学"), new Course("4", "汇编语言") };
        courseToSelect.addAll(Arrays.asList(courses));
        Course temp3 = (Course) courseToSelect.get(2);
        Course temp4 = (Course) courseToSelect.get(3);
        System.out.println("添加了两门课程：" + temp3.id + ":" + temp3.name + ";" + temp4.id + ":" + temp4.name);

        Course cr5 = new Course("5", "数据结构");
        courseToSelect.add(1, cr5);
        Course temp5 = (Course) courseToSelect.get(1);
        System.out.println("添加的课程：" + temp5.id + ":" + temp5.name);

        Course[] courses1 =
        { new Course("6", "javaweb开发"), new Course("7", "Android开发") };
        courseToSelect.addAll(Arrays.asList(courses1));
        Course temp6 = (Course) courseToSelect.get(5);
        Course temp7 = (Course) courseToSelect.get(6);
        System.out.println("添加了两门课程：" + temp6.id + ":" + temp6.name + ";" + temp7.id + ":" + temp7.name);

    }

    public void testGet()
    {
        int size = courseToSelect.size();
        System.out.println();
        System.out.println("for循环遍历List有如下可选课程：");
        for (int i = 0; i < size; i++)
        {
            Course cr = (Course) courseToSelect.get(i);
            System.out.println("课程：" + cr.id + ":" + cr.name);
        }
    }

    public void testIterater()
    {
        System.out.println();
        System.out.println("迭代器遍历List有如下可选课程：");
        @SuppressWarnings("rawtypes")
        Iterator it = courseToSelect.iterator();
        while (it.hasNext())
        {
            Course cr = (Course) it.next();
            System.out.println("课程：" + cr.id + ":" + cr.name);
        }
    }

    public void testForEach()
    {
        System.out.println();
        System.out.println("ForEach遍历List有如下可选课程：");
        // 当一个元素存到集合中去，它的类型是被忽略的。所以用Object类型
        for (Object obj : courseToSelect)
        {
            Course cr = (Course) obj;// 强转
            System.out.println("课程：" + cr.id + ":" + cr.name);
        }
    }

    public void testModify()
    {
        courseToSelect.set(1, new Course("5", "大学英语"));
    }

    public void testRemove()
    {
        Course[] crs = { (Course) courseToSelect.get(0), (Course) courseToSelect.get(1) };
        courseToSelect.removeAll(Arrays.asList(crs));
        System.out.println();
        System.out.println("成功删除课程！");
        testForEach();
    }

    @Override
    public void operation()
    {
        testAdd();
        testGet();
        testIterater();      
        testForEach();
        testModify();
        testForEach();
        testRemove();
    }
    
    @Override
    public void doBudiness(Student student)
    {
        System.out.println("HiyaListOper doBudiness....");
        //operation();
    }
}
