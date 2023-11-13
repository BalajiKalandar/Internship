package com.java.flipDailyQuestion;

public class DetectCapital {
    public static void main(String[] args) {
        String name="Balaji";
        System.out.println(detectCapitalUse(name));

    }


     static boolean detectCapitalUse(String word) {
        int n=word.length();

        // All leters captial
        boolean allCapital=true;
        for(int i=0;i<n;i++){
            if(!Character.isUpperCase(word.charAt(i))){
                allCapital=false;
                break;
            }

        }
        if(allCapital){
            return true;
        }
        // All leters small
        boolean allLower=true;
        for(int i=0;i<n;i++){
            if(!Character.isLowerCase(word.charAt(i))){
                allLower=false;
                break;
            }
        }
        if(allLower){
            return true;
        }
        // First letter upperCase only

        if(Character.isUpperCase(word.charAt(0))){
            boolean onlyFirst=true;

            for(int i=1;i<n;i++){
                if(!Character.isLowerCase(word.charAt(i))){
                    onlyFirst=false;
                }
            }
            return onlyFirst;
        }
        return false;

    }
}