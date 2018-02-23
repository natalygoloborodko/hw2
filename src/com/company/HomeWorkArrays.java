package com.company;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HomeWorkArrays {
    Logger log;

    public HomeWorkArrays()
    {
        log=Logger.getLogger(String.valueOf(getClass()));
    }

    /**
     * 1 1.	Дано два числа. Найти минимальное число из них.
     */
    public int minNumber(int a, int b) {
        log.info("task 1");
        if (a < b) {
            log.info("min is "+a);
            return a;
        } else {
            log.info("min is "+b);
            return b;
        }
    }

    /**
     * Блок с дополнительными методами
     */
    //дополнительный метод для инициализации массивов
    //указывается количество элементов (len) и диапазон значений от 0 до range
    public int[] initMass(int len, int range) {
        int[] arr = new int[len];
        for (int i=0; i<len; i++) {
            arr[i] = (int) (Math.random() * range);
        }
        return arr;
    }

    //дополнительный метод для инициализации массивов с нулями
    public int[] initZeroMass(int len) {
        int[] arr = new int[len];
        for (int i=0; i<len; i++) {
            arr[i] = (int) (Math.random() *2);
        }
        return arr;
    }

    //дополнительный метод для вывода на экран элементов (типа Int) массива
    public void printArray(int[] arr){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //дополнительный метод для вывода на экран элементов (типа Integer) массива
    public void printIntegerArray(Integer[] arr){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //дополнительный метод для ввода значений с клавиатуры
    public int inputNumber() {
        int number=0;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input number please:  ");
            String s1 = reader.readLine();
            number = Integer.parseInt(s1);
            return number;
        }catch (IOException ex){
            log.info("there is an exception "+ex);
            System.out.println("there is an exception "+ex);
        }
        return number;
    }

    /**
     * конец блока с дополнительными методами
     */

    /**
     * 2.	Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
     */
    public int sumK(int k, int[] arr) {
        log.info("task 2");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % k) == 0) {
                sum = sum + arr[i];
            }
        }
        log.info("sum is "+sum);
        return sum;
    }

    /**
     * 3.	В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
     */

     public  int[] countZeros(int[] arr){
     log.info("task 3");
     int count=0;
     for (int i=0; i<arr.length ; i++){
         if (arr[i]==0){
             count++;
         }
     }
     int[] nArr = new int[count];
     if (count == 0){
         log.info("no zeros in array ");
         System.out.println("no zeros in array");
     } else {
         int j=0;
         for(int i=0; i<arr.length ; i++) {
             if (arr[i] == 0) {
                 nArr[j] = i;
                 j+=1;
             }
         }
     }
     return nArr;
     }

     /**
     * 4.	Дан целочисленный массив чисел (положительных и отрицательных).
     * Выяснить, какое число встречается раньше – положительное или отрицательное.
     */
     public boolean positiveNegative(int[] a1) {
     log.info("task 4");
         boolean res = false;
         for (int i = 0; i < a1.length; i++) {
             if (a1[i] == 0) {
                 log.info("the " + i + " element is 0");
                 System.out.println("the " + i + " element is 0");
             } else if (a1[0] < 0) {
                 return res;
             } else if (a1[0] > 0) {
                 res = true;
                 return res;
             }
         }
         return res;
     }

     /**
      * 5.	Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
       */
     public boolean isSortedArray(int[] a){
     log.info("task 5");
         try {
             for (int i=0; i<(a.length-1); i++)
             {
                 if (a[i]>a[i+1])
                 {
                     return false;
                 }
             }
             return true;
         }
         catch (Exception ex)
         {
             log.info("this is exception: "+ex);
             return false;
         }
     }

     /**
      * 6.	Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести сообщение об этом факте.
      */

     public int[] evenArray(int[] eArr){
         log.info("task 6");
         int counter=0;
         for (int i=0; i<eArr.length; i++){
             if ((eArr[i]%2)==0){
                 counter++;
             }
         }
         int[] isEven = new int[counter];
         log.info("number of even elements is "+counter);
         if (counter==0){
             log.info("no even elements");
             System.out.println("no even elements");
         } else {
             int j = 0;
             for (int i = 0; i < eArr.length; i++) {
                 if ((eArr[i] % 2) == 0) {
                     isEven[j] = eArr[i];
                     j+=1;
                 }
             }
         } return isEven;
     }

     /**
      * 7.	Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать количество замен.
      */

     public int arrZ(int[] arr, int z){
     log.info("task 7");
         int sumZ = 0;
         try {
             for (int i = 0; i < arr.length; i++) {
                 if (arr[i] > z) {
                     arr[i] = z;
                     sumZ += 1;
                 }
             }
           log.info("the number of changes to z is "+sumZ);
         } catch (Exception e){
             log.info("this is exception: "+e);
             return -1;
         }
         return sumZ;
     }

     /**
      * 8.	Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
      */

     public Map<String, Integer> minMaxZero(int[] arr){
     log.info("task 8");
         int pos=0;
         int neg=0;
         int zero=0;
         for (int i=0; i< arr.length; i++){
            if (arr[i]<0){
                neg+=1;
            } else if(arr[i]>0){
                pos +=1;
            } else {
                zero +=1;
            }
         }
         Map<String, Integer> map = new HashMap<>();
         map.put("positive", pos);
         map.put("negative", neg);
         map.put("zero", zero);
         return map;
     }

      /**
      * 9.	Дан массив чисел. Поменять местами наибольший и наименьший элементы.
      */
        //в данной реализации, если максимальных (или минимальных) элемента два, то для замены выбирается первое найденное
      public int[] changeMaxMin(int[] arr){
      log.info("task 9");
          try {
          int ch;
          int indexMin=0;
          int indexMax=0;
              for (int i = 0; i < arr.length; i++) {
               if (arr[i]>arr[indexMax]) {
                   indexMax = i;

               } else if (arr[i]<arr[indexMin]){
                   indexMin=i;
               }
              }
              log.info("indexMax = "+indexMax);
              log.info("indexMin = "+indexMin);
              ch = arr[indexMax];
              arr[indexMax] = arr[indexMin];
              arr[indexMin] = ch;
              return arr;
          } catch (Exception ex) {
              log.error("got an exception: "+ex);
              System.out.println("this is exception: "+ex);
              return new int[]{-1, -1};
          }
      }




}
