package com.company;

import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getFirstValue(new int[]{3,1,7}));
    }


//algorithm 1 getFirstElement
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }


    //algorithm 2 nextNum
    public static int addition(int num) {
        return ++num;
    }


    //algorithm 3- findTheIndex
    public static int search(int[] arr, int item) {
        int index=-1;
        for(int i=0; i < arr.length;i++){
            if(arr[i]==item){
                index = i;
                i+=arr.length+1;
            }
        }
        return index;
    }


    //algorithm 4- minToSec
    public static int convert(int minutes) {
        int seconds=minutes*60;
        return(seconds);
    }


    //algorithm 5- returnSomething
    public static String giveMeSomething(String a) {
        return "something " +a;
    }


    //algorithm 6- flipTheBoolean
    public static boolean reverse(boolean b) {
        return !b;
    }

    //algorithm 7- getWordCount
    public static int countWords(String s) {
        return s.split(" ").length;
    }


    //algorithm 8-numHigher ** couldn't figure this one out-- used solutions.
    public static boolean existsHigher(int[] arr, int n) {
        if (arr.length == 0) return false;
        for (int i : arr) {
            if (i >= n) return true;
        }
        return false;
    }


    //algorithm 9- vowels









}