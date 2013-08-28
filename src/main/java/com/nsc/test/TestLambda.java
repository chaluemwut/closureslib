package com.nsc.test;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: linux
 * Date: 8/28/13
 * Time: 2:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestLambda {

    public static void main(String [] args){
        List<String> lst = Arrays.asList("test1","test2","test3");
        //String str = lst.stream().reduce("",(x,y)->x+"|"+y).substring(1);
        System.out.println(lst);
    }
}
