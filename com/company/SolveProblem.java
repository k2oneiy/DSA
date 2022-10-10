package com.company;
import java.util.HashMap;
import java.util.HashSet;

public class SolveProblem {



    public static boolean findMatchArray(char[] a,char[] b){
        HashSet<Character> match = new HashSet<Character>();


        for (int i=0;i<a.length;i++) {
            match.add(a[i]);
        }

        for (int i=0;i<b.length;i++){
            if(match.contains(b[i])){
                return true;
            }
        }
        return false;
    }


//    public static boolean findMatchArray(char[] a, char[] b) {
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                if (a[i] == b[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        char[] a = {'a','b','c'};
        char[] b = {'c','y','z'};


        System.out.println(findMatchArray(a,b));

//        for (int i=0;i<a.length;i++){
//            for(int j=0;j<b.length;j++){
//                if(a[i]==b[j]) {
//                    System.out.println("Yes, We have matching elements");
//                }
//                else{
//                    System.out.println("We don't have matching elements");
//                }
//            }
//        }

    }
}
