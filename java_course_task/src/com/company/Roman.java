package com.company;

import java.util.HashMap;
import java.util.Map;

public class Roman{
    HashMap<String, Integer> numbers;
    public Roman(){
        numbers=new HashMap<String, Integer>();
        numbers.put("I", 1);
        numbers.put("II", 2);
        numbers.put("III", 3);
        numbers.put("IV", 4);
        numbers.put("V", 5);
        numbers.put("VI", 6);
        numbers.put("VII", 7);
        numbers.put("VIII", 8);
        numbers.put("IX", 9);
        numbers.put("X", 10);
    }
    public String intToSymbol(int val){
        String res = "";
        if(numbers.containsValue(val)){
           for(Map.Entry<String, Integer> entry:numbers.entrySet()){
               if(entry.getValue().equals(val)){
                   res = entry.getKey();
                   break;
               }
           }
           return res;
        }else{
            int tens=val/10;
            int remainder=val%10;

            if(tens == 10){
                tens = tens - 10;
                res = "C";
            }
            else if(tens >= 9 && tens < 10){
                tens = tens - 9;
                res = "XC";
            }
            else if(tens >= 5 && tens < 9){
                tens = tens - 5;
                res = "L";
            }
            else if(tens == 4){
                tens = tens - 4;
                res = "XL";
            }



            for(int i = 0; i < tens; i++){
                res = res + "X";
            }

            for(Map.Entry<String, Integer> entry:numbers.entrySet()){
                if(entry.getValue().equals(remainder)){
                    res = res + entry.getKey();
                    break;
                }
            }

            return res;
        }
    }
}