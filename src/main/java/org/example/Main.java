package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static boolean isPalindrome(int integer){
        if(integer >= 0){
            String integerStr = Integer.toString(integer);
            for(int i = 0; i < integerStr.length(); i++){
                if(integerStr[i] == integerStr[integerStr.length()-1]){
                    continue;
                } else {
                    break;
                }
            }
        }
    }

}


