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





    //algorithm 5- returnSomething







}