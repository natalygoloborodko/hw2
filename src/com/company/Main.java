package com.company;

import junit.framework.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //task01 - выводим минимальное значение из двух введённых
        System.out.println("task 1");
        HomeWorkArrays arrays = new HomeWorkArrays();
        HomeWorkArrays2 arrays2 = new HomeWorkArrays2();
        Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int mini = arrays.minNumber(a, b);
        System.out.println("the minimal number is " + mini);

        //task02 - сумма элементов массива, кратных k
        System.out.println("\n task 2");
        int[] myArray = arrays.initMass(10, 100); //инициализируем массив рандомными значениями от 0 до 100
        System.out.println("the initialized array is ");
        arrays.printArray(myArray);
        int sumOfK = arrays.sumK(mini, myArray);
        System.out.println("sum is " + sumOfK);

        // 3.	В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
        System.out.println("\n task 3");
        int[] zeroArr = arrays.initZeroMass(10);
        System.out.println("the initialized array is ");
        arrays.printArray(zeroArr);
        int[] outZeroArr = arrays.countZeros(zeroArr);
        System.out.println("\n result is ");
        arrays.printArray(outZeroArr);

        //4.	Дан целочисленный массив чисел (положительных и отрицательных). //
        // Выяснить, какое число встречается раньше – положительное или отрицательное.
        System.out.println("\n task 4");
        int[] a4 = arrays.initMass(10, 100);//инициализируем массив рандомными значениями от 0 до 100
        System.out.println(" generated random array "); //вывод массива для наглядности
        for (int i = 0; i < a4.length; i++) {
            a4[i] = (50 - a4[i]); //делаем отрицательные числа в массиве
            System.out.print(a4[i] + " ");
        }
        Boolean str = arrays.positiveNegative(a4);
        if (str == true) {
            System.out.println("the first non-zero element is positive");
        } else {
            System.out.println("the first non-zero element is negative");
        }

        //5.	Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.

        //используем массив из task02
        System.out.println("\n task 5");
        boolean sort = arrays.isSortedArray(myArray);
        System.out.println("is array sorted? - " + sort);

        //6.	Дан массив чисел. Создать массив из четных чисел этого массива.
        // Если таких чисел нет, то вывести сообщение об этом факте.
        System.out.println("\n task 6");
        //используем массив из task02
        int[] arr6 = arrays.evenArray(myArray);
        System.out.println("the array of even numbers from the array in task02 is - ");
        arrays.printArray(arr6);

        //7.	Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать количество замен.
        System.out.println("\n \n task 7");
        //используем массив из task02
        int z = 10;
        int zed = arrays.arrZ(myArray, z);
        System.out.println("the number of changes is " + zed);

        //8. 	Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
        System.out.println("\n \n task 8");
        //используем массив из task04
        System.out.println("using the array from task 04: ");
        Map<String, Integer> myMap = arrays.minMaxZero(a4);
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // 9.	Дан массив чисел. Поменять местами наибольший и наименьший элементы.
        System.out.println("\n \n task 9");
        //используем массив из task02
        int[] arr9 = arrays.initMass(10, 100);
        System.out.println("new initialized array ");
        arrays.printArray(arr9);
        int[] changedArr = arrays.changeMaxMin(arr9);
        System.out.println("new array with changed min and max values ");
        arrays.printArray(changedArr);


        //10.	Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
        System.out.println("\n \n task 10");
        //инициализируем массив с рандомными значениями от 1 до 10
        int[] arr10 = arrays.initMass(10, 10);
        System.out.println("new initialized array ");
        arrays.printArray(arr10);
        System.out.println("\n and the result is ");
        Integer[] aRR10 = arrays2.lessThanI(arr10);
        arrays.printIntegerArray(aRR10);

        //11.	Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.
        System.out.println("\n \n task 11");
        //инициализируем массив с рандомными значениями от 1 до 100
        int[] arr11 = arrays.initMass(10, 100);
        System.out.println("new initialized array ");
        arrays.printArray(arr11);
        int m = 0;
        int l = 0;
        System.out.println("enter the number M ");
        m = arrays.inputNumber();
        System.out.println("enter the number L ");
        l = arrays.inputNumber();
        Integer[] aRR11 = arrays2.mDivL(arr11, m, l);
        arrays.printIntegerArray(aRR11);
        Assert.assertNotNull(aRR11);

        //12.	Дан массив чисел.  Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
        System.out.println("\n \n task 12");
        int[] arr12 = arrays.initMass(11, 100);
        System.out.println("new initialized array ");
        arrays.printArray(arr12);
        int[] arrChanged=arrays2.changeNeighbours(arr12);
        System.out.println("\n the array with changed neighbours is ");
        arrays.printArray(arrChanged);

        //13.	Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно до нуля.
        System.out.println("\n task 13");
        int[] arr13={12, 25, 26, 78, 0, 45, 23, 55, 0, 9};
        System.out.println("the initial array is ");
        arrays.printArray(arr13);
        System.out.println();
        Integer[] arrTillZero=arrays2.outTillZero(arr13);
        System.out.println("the new array till zero from initial array is ");
        arrays.printIntegerArray(arrTillZero);

        //14.	Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).
        System.out.println("\n \n task 14");
        int[] arr14 = arrays.initMass(11, 100);
        System.out.println("new initialized array ");
        arrays.printArray(arr14);
        int sumMaxMinArr=arrays2.sumMaxMin(arr14);
        System.out.println("sum is "+sumMaxMinArr);




        //15.	Дан массив целых положительных чисел. Найти произведение только тех чисел,
        //     которые больше заданного числа М. Если таких нет, то выдать сообщение об этом.

        System.out.println("\n task 15");
        int[] arr15 = arrays.initMass(10, 100);
        System.out.println("new initialized array ");
        arrays.printArray(arr15);
        System.out.println("enter M");
        int mNum=0;
        mNum = arrays.inputNumber();
        long mult = arrays2.multiplBig(arr15,mNum);
        if (mult!=1) {
            System.out.println("result of multiplication of numbers bigger than M is = " + mult);
        }

        //16.	Дан массив положительных и отрицательных чисел.  Заменить нулями те числа,
        //     величина которых по модулю больше максимального числа (|a[i]| > max{ a[0], a[1], ..., a[n]})
        System.out.println("\n task 16");
        int[] arr16 = arrays.initMass(10, 100);
        for (int i = 0; i < a4.length; i++) {
            arr16[i] = (50 - arr16[i]); //делаем отрицательные числа в массиве
        }
        System.out.println("new initialized array is ");
        arrays.printArray(arr16);
        int[] mtz = arrays2.maxToZeros(arr16);
        System.out.println("\n changed array");
        arrays.printArray(mtz);

        //17.	Дан массив чисел с положительными и отрицательными элементы.
        //     Вычислить произведение отрицательных элементов P1 и произведение положительных элементов Р2.
        //     Сравнить модуль Р2 с модулем Р1 и указать, какое из произведений по модулю больше.
        System.out.println("\n task 17");
        int[] arr17 = arrays.initMass(10, 100);
        for (int i = 0; i < a4.length; i++) {
            arr17[i] = (50 - arr17[i]); //делаем отрицательные числа в массиве
        }
        System.out.println("new initialized array is ");
        arrays.printArray(arr17);
        long biggerProduct=arrays2.positiveNegativeProduct(arr17);
        System.out.println("the bigger product is "+ biggerProduct);

        //18.	Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и заменить его нулем.

        System.out.println("\n task 18");
        int[] arr18 = arrays.initMass(10, 100);
        System.out.println("new initialized array is ");
        arrays.printArray(arr18);
        int[] newArray = arrays2.firstMaxToZero(arr18);
        System.out.println("\n new array is ");
        arrays.printArray(newArray);

        //19.	 Дан массив чисел. Образовать новый массив,
        // элементами которого будут элементы исходного, оканчивающиеся на цифру k.
        System.out.println("\n task 19");
        int[] arr19 = arrays.initMass(10, 100);
        System.out.println("new initialized array is ");
        arrays.printArray(arr19);
        int k=0;
        k = arrays.inputNumber();
        Integer[] arrK=arrays2.lastK(arr19, k);
        System.out.println("\n new array is ");
        arrays.printIntegerArray(arrK);



    }
}
