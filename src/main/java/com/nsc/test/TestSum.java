package com.nsc.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: linux
 * Date: 8/29/13
 * Time: 1:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestSum {

    public static void main(String [] args){
        List<Integer> lst = Arrays.asList(1,2,3,4,5);
        List<Integer> newList = lst.stream().filter(p -> p > 2).collect(Collectors.toList());
        int i = lst.stream().filter(p->p>2).reduce(1,(x,y)->x+y);
        System.out.println("i is "+i);
        newList.forEach(p->System.out.println(p));
    }
}
