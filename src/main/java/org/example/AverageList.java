package org.example;

import java.util.ArrayList;

public class AverageList {
     int[] listInt;

    public AverageList(int[] listInt) {
        this.listInt = listInt;
    }


    public double AverageOfAverageList() {
        double sumOfAverageList = 0;
        if (this.listInt.length ==0){
            return  0;
        }

        for (double number : this.listInt) {
            sumOfAverageList = number + sumOfAverageList;
        }
        double averageOfaverageList = sumOfAverageList / this.listInt.length;
        return averageOfaverageList;
    }

    public String WhatAverageListIsBigger( AverageList two){
        Double averageOfFirstList = this.AverageOfAverageList();
        Double averageOfSecondList = two.AverageOfAverageList();
        if(averageOfFirstList > averageOfSecondList){
            String result = "Первый список имеет большее среднее значение";
            System.out.println(result);
            return  result;
        }
        if (averageOfFirstList < averageOfSecondList){
            String result = "Второй список имеет большее среднее значение";
            System.out.println(result);
            return  result;

        }

        else {
            String result =  "Средние значения равны";
            return  result;

        }




    }
}
