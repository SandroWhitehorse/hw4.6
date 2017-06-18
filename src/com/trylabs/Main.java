package com.trylabs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int array[]=new int[]{10,22,3,45,6,7,8,9,33,56};
        int max=0;
        int min=array[1];
        for (int a:array){
            if (a>max) max=a;
        }
        array[Arrays.binarySearch(array,max)]=0;//находится индекс максимального числа в массиве
    int index=0;
        for (int i=0;i<array.length;i++)
     {
        if ((i+1)>=10) break;
        if (array[i] < min  )

        {
            min=array[i];
            index=i;      //нахожу индекс минимального числа в массиве

        }
             }
array [index]=0;
        for (int d:array)
        System.out.println(d);



    }
}
