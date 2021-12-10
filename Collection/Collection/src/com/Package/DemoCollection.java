package com.Package;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//FrameWork is interface,classes,methods
public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> lst=new LinkedList<>();//generic code
       // lst.add(new Integer(10)); Boxing
       // lst.add(new Integer(20));
        lst.add(23);//autoboxing
        System.out.println("Linked List is :"+lst);//order collection(In which order you inserted data in that same fashon lst will be made)

        List<Integer> lst2=new ArrayList<>();
       // lst2.add(new Integer(10)); Boxing
       // lst2.add(new Integer(20));
        lst2.add(23);//autoboxing
        System.out.println("Array List is :"+lst2);
    }
}
