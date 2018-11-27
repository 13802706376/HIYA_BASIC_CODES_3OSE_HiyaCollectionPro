package com.hiya.se.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HiyaMapOper  extends AbstractChainHandler   implements IHiyaCollection
{
    public Map<String, Student> stus;

    public HiyaMapOper()
    {
        this.stus = new HashMap<String, Student>();
    }

    Scanner sc = new Scanner(System.in);
    
    public void add()
    {
        int i = 0;
        while (i < 3)
        {
            System.out.println("请输入学生id：");
            String id = sc.next();
            Student stu = stus.get(id);
            if (stu == null)
            {
                System.out.println("请输入学生姓名：");
                String name = sc.next();
                Student newStu = new Student(id, name);
                stus.put(id, newStu);
                System.out.println("成功添加学生：" + stus.get(id).name);
                i++;

            } else
            {
                System.out.println("该id已被占用！");
                continue;
            }
        }
    }

    public void testKeySet()
    {
        Set<String> ketSet = stus.keySet();
        System.out.println("总共有：" + stus.size() + "个学生");
        for (String stuId : ketSet)
        {
            Student st = stus.get(stuId);
            if (st != null)
            {
                System.out.println("学生：" + st.name);
            }
        }
    }

    public void testRemove()
    {
        while (true)
        {
            System.out.println("请输入要删除的学生id：");
            String id = sc.next();
            Student st = stus.get(id);
            if (st == null)
            {
                System.out.println("该id不存在！");
                continue;
            }
            stus.remove(id);
            System.out.println("成功删除学生" + st.name);
            break;
        }
    }

    public void testEntrySet()
    {
        Set<Entry<String, Student>> entrySet = stus.entrySet();
        for (Entry<String, Student> entry : entrySet)
        {
            System.out.println("取得键：" + entry.getKey() + "   取得值：" + entry.getValue().name);
        }
    }

    public void testModify()
    {
        System.out.println("请输入要修改的学生id：");
        while (true)
        {
            String id = sc.next();
            Student stu = stus.get(id);
            if (stu == null)
            {
                System.out.println("不存在该学生id，请重新输入!");
                continue;
            }
            System.out.println("当前该学生id所对应的学生姓名为：" + stu.name);
            System.out.println("请输入新的学生姓名：");
            String name = sc.next();
            Student newStu = new Student(id, name);
            stus.put(id, newStu);
            System.out.println("修改成功！");
            break;
        }
    }

    @Override
    public void doBudiness(Student student)
    {
        System.out.println("HiyaMapOper doBudiness....");
        //operation();
    }
    
    @Override
    public void operation()
    {
        add();
        testKeySet();
        testRemove();
        testEntrySet();
        testModify();
        testEntrySet();
    }
}
