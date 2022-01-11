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
    //or-- solution 2
    int numOfSpaces=0
				for (int i-0; i<newStr.length();i++){
        if(newStr.charAt(i)--' '){

        }
    }


    //algorithm 8-numHigher ** couldn't figure this one out-- used solutions.
    public static boolean existsHigher(int[] arr, int n) {
        if (arr.length == 0) return false;
        for (int i : arr) {
            if (i >= n) return true;
        }
        return false;
    }


    //algorithm 9- vowels **needed help on this one.
    public static int getCount(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }


//Algorithm 10 sumOfTwoNumbers
public static int sum(int a, int b) {
    return a+b;
}


//Algorithm 11 equalNumbers
public static boolean isSameNum(int x, int y) {
    if(x==y){
        return true;
    }else{
        return false;
    }
}


//Algorithm 12 ageToDays
public static int calcAge(int age) {
    return age*365;
}


//Algorithm 13 nameGreeting
public static String helloName(String name) {
    return "Hello "+ name+"!";
}


//Algorithm 14 reverseString **needed help with this one
public static String reverse(final String str) {
    String reverse = "";
    for(int i= str.length()-1;i>= 0; i--)
    {
        reverse = reverse + str.charAt(i);
    }
    return reverse;
}
                //15 twoMakesTen
                public static boolean makesTen(int a, int b) {
                    return (a == 10 || b == 10 || (a + b) == 10);
                }

    //16 countSyllables
    public static int numberSyllables(String word) {
        String[] syl = word.split("-");
        return syl.length;
    }

    //17 caseInsensative Comparisons
    public static boolean match(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }


    //18 hackerSpeak
    public static String hackerSpeak(String str) {
        return str.replace('a', '4')
                .replace('e', '3').replace('i', '1')
                .replace('o', '0').replace('s', '5');
    }


}