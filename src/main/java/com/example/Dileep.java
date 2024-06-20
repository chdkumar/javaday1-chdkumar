package com.example;

public class Dileep {
    public static void main(String[] args) {
        

    float temp=0.5 ;
        String dayname;
        switch (temp)
        {
            case 0.1:
                   dayname="monday";
                   break;
            case 0.2:
                    dayname="Tuesday";
                    break;      
            case 0.3:
            dayname="wednesday";
            break;
            case 0.4:
            dayname="Thursday";
                   break;
            case 0.5:
            dayname="friday";
                   break;
            default:
            System.out.println("not a exiting value");               
        }
    }
}
