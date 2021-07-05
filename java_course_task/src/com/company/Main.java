package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Roman roman=new Roman();
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        String input=obj.readLine();

        String[] params = input.split(" ");
        int a;
        int b;
        int res = 0;


        if(!roman.numbers.containsKey(params[0])){//if not roman
            a=Integer.parseInt(params[0]);
            b=Integer.parseInt(params[2]);
            switch (params[1]){
                case "+":
                    res=a+b;
                    break;
                case"-":
                    if(a>b){
                        res=a-b;
                    }
                    else{
                        res=b-a;
                    }
                    break;
                case"*":
                    res=a*b;
                    break;
                default:
                    if(a>b){
                        res = a/b;
                    }
                    else{
                        res=b/a;
                    }
            }
            System.out.println(res);
        }
        else{//if roman style
            a=roman.numbers.get(params[0]);
            b=roman.numbers.get(params[2]);
            switch (params[1]){
                case "+":
                    res=a+b;
                    break;
                case"-":
                    if(a>b){
                        res=a-b;
                    }
                    else{
                        res=b-a;
                    }
                    break;
                case"*":
                    res=a*b;
                    break;
                default:
                    if(a>b){
                        res = a/b;
                    }
                    else{
                        res=b/a;
                    }
            }
            System.out.println(roman.intToSymbol(res));
        }

    }
}

