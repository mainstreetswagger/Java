package com.company;

public class Roman{
    String[] nums;
    public Roman(){
        nums=new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    }
    public String[] getNums(){
        return nums;
    }
    public int symbolToInt(String num){
        int res = 0;
        switch(num){
            case "I":
                res= 1;
                break;
            case "II":
                res= 2;
            break;
            case "III":
                res= 3;
            break;
            case "IV":
                res= 4;
            break;
            case "V":
                res= 5;
            break;
            case "VI":
                res= 6;
            break;
            case "VII":
                res= 7;
            break;
            case "VIII":
                res= 8;
            break;
            case "IX":
                res= 9;
            break;
            case "X":
                res= 10;
            break;
        }
        return res;
    }
    public String intToSymbol(int num){
        String res = "";
        switch(num){
            case 1:
                res= "I";
                break;
            case 2:
                res= "II";
                break;
            case 3:
                res= "III";
                break;
            case 4:
                res= "IV";
                break;
            case 5:
                res= "V";
                break;
            case 6:
                res= "VI";
                break;
            case 7:
                res= "VII";
                break;
            case 8:
                res= "VIII";
                break;
            case 9:
                res= "IX";
                break;
            case 10:
                res= "X";
                break;
        }
        return res;
    }
}