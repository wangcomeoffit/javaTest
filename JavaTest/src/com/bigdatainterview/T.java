package com.bigdatainterview;

import java.util.HashSet;
import java.util.Set;

public class T {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2); //F
        System.out.println(s1.equals(s2)); //T
        Set<String> set01 =new HashSet<String>();
        set01.add(s1);
        set01.add(s2);
        System.out.println(s1.hashCode()+"\t"+s2.hashCode());
        System.out.println(set01.size());  //1

        System.out.println("==========");
        Person p1 =new Person("abc");
        Person p2 =new Person("abc");
        System.out.println(p1==p2); //F
        System.out.println(p1.equals(p2)); //F
        Set<Person> hash = new HashSet<Person>();
        hash.add(p1);
        hash.add(p2);
        System.out.println(p1.hashCode()+"\t"+p2.hashCode());
        System.out.println(hash.size()); //2


    }
}
