package com.leetcodeprep;

import com.leetcodeprep.linkedList.LinkedListCustom;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LinkedList<String> t = new LinkedList<>();
        t.add("10");
        t.remove(0);
        LinkedListCustom<String> linkedListCustom = new LinkedListCustom();
        linkedListCustom.add("1");
        linkedListCustom.add("10");
        String b = linkedListCustom.get(0);
        String c = linkedListCustom.get(1);
        System.out.println(b);
        System.out.println(c);
        System.out.println(linkedListCustom.remove(0));
        System.out.println(linkedListCustom.remove("0"));
        System.out.println(linkedListCustom.remove("10"));
        linkedListCustom.remove(10);
    }
}
