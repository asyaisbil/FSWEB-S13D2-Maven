package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }


    public static boolean isPalindrome(int integer){
        if(integer < 0) {
            integer = integer * -1;
        }

        String integerStr = Integer.toString(integer);
        int left = 0;
        int right = integerStr.length() - 1;

        while (left < right) {
            if (integerStr.charAt(left) != integerStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;


    }


    public static boolean isPerfectNumber(int integer){
        if(integer > 1){
            int total = 0;
            for(int i = 1; i < integer; i++){
                if(integer % i == 0){
                    total = total + i;
                }

            }
            return total == integer;
        } else {
            return false;
        }
    }


    public static String numberToWords(int integer){
        if(integer >= 0){
            StringBuilder kelime = new StringBuilder();
            String numStr = String.valueOf(integer);
            for(int i = 0; i < numStr.length(); i++){
                char digit = numStr.charAt(i);
                switch (digit){
                    case '0':
                        kelime.append("Zero ");
                        break;
                    case '1':
                        kelime.append("One ");
                        break;
                    case '2':
                        kelime.append("Two ");
                        break;
                    case '3':
                        kelime.append("Three ");
                        break;
                    case '4':
                        kelime.append("Four ");
                        break;
                    case '5':
                        kelime.append("Five ");
                        break;
                    case '6':
                        kelime.append("Six ");
                        break;
                    case '7':
                        kelime.append("Seven ");
                        break;
                    case '8':
                        kelime.append("Eight ");
                        break;
                    case '9':
                        kelime.append("Nine ");
                        break;

                }

            }
            return kelime.toString().trim();
        }
        else {
            return "Invalid Value";
        }
    }




}


