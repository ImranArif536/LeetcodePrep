package com.leetcodeprep;

import com.leetcodeprep.linkedList.LinkedListCustom;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LinkedListCustom<Integer> linkedListCustom = new LinkedListCustom();
        linkedListCustom.add(1);
        linkedListCustom.add(10);
        Integer b = linkedListCustom.get(0);
        System.out.println(b);
    }
}
