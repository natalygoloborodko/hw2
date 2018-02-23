package com.company;
import org.apache.log4j.Logger;
import java.util.ArrayList;

public class HomeWorkArrays2 {
    Logger log;

    public HomeWorkArrays2() {
        log = org.apache.log4j.Logger.getLogger(String.valueOf(getClass()));
    }

    /**
     * 10.	Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
     */
    public Integer[] lessThanI(int[] arr) {
    log.info("task 10");
        ArrayList<Integer> lti = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= i) {
                lti.add(arr[i]);
            }
        }
        if ((lti.size())==0){
            log.info("no such elements ");
            System.out.println("no such elements ");
            return new Integer[]{-1, -1};
        }else {
            return lti.toArray(new Integer[lti.size()]);
        }
    }

    /**
     * 11.	Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.
     */
    public Integer[] mDivL(int[] arr, int m, int l) {
    log.info("task 11");
        try {
            if (m > l) {
                ArrayList<Integer> mdl = new ArrayList<>();
                for (int i = 0; i < arr.length; i++) {
                    if ((arr[i] % m) == l) {
                        mdl.add(arr[i]);
                    }
                }
                return mdl.toArray(new Integer[mdl.size()]);
            } else {
                log.error("m can't be bigger than l");
                return new Integer[]{-1, -1};
            }
        } catch (Exception e) {
            log.error("got an exception in task 11 : " + e);
            System.out.println("this is exception: " + e);
            return new Integer[]{-1, -1};
        }
    }

    /**
     * 12.	Дан массив чисел.  Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
     */

    public int[] changeNeighbours(int[] arr) {
        log.info("task 12");
        int len = 0;
        if ((arr.length % 2) == 1) {
            log.info("the number of elements is not even and is = " + arr.length);
            len = arr.length - 1;
        } else {
            len = arr.length;
        }
        for (int i = 0; i < len; i = i + 2) {
            int s = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = s;
        }
        return arr;
    }

    /**
     * 13.	Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно до нуля.
     */

    public Integer[] outTillZero(int[] arr) {
        log.info("task 13");
        int count = 0;
        int j = 0;
        ArrayList<Integer> outArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        log.info("number of zeros is " + count);
        if (count == 0) {
            for (int i : arr) {
                outArr.add(arr[i]);
            }
            return outArr.toArray(new Integer[outArr.size()]);
        } else {
            int i = 0;
            do {
                outArr.add(arr[i]);
                i++;
            } while (arr[i - 1] != 0);
            return outArr.toArray(new Integer[outArr.size()]);
        }
    }

    /**
     * 14.	Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).
     */

    public int sumMaxMin(int[] arr){
        log.info("task 14");
        int max=arr[0];
        int min=arr[1];
        int sum=0;
        if (((arr.length)%2)==0)
        for (int i=2; i<arr.length; i=i+2)//перебираем четные элементы массива
        {
            if ((arr[i])> arr[i-2]){
                max=arr[i];
            }else {
                max=arr[i-2];
            }
        }
        log.info("max is "+max);
        for (int i=3; i<arr.length; i=i+2)//перебираем нечетные элементы массива
        {
            if ((arr[i])< arr[i-2]){
                min=arr[i];
            }else {
                min=arr[i-2];
            }
        }
        log.info("min is "+min);
        sum=min+max;
        return sum;
    }

    /**
     * 15.	Дан массив целых положительных чисел. Найти произведение только тех чисел,
     * которые больше заданного числа М. Если таких нет, то выдать сообщение об этом.
     */

    public long multiplBig(int[] arr, int m) {
        log.info("task 15");
        long mult = 1;
        int count = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > m) {
                    mult = mult * arr[i];
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("no numbers bigger than M = " + m);
            }
            return mult;
        } catch (Exception ex) {
            System.out.println("exception occurred " + ex);
        }
        return mult;
    }

    /**
     * 16.	Дан массив положительных и отрицательных чисел.  Заменить нулями те числа,
     * величина которых по модулю больше максимального числа (|a[i]| > max{ a[0], a[1], ..., a[n]})
     */
    public int[] maxToZeros(int[] arr) {
        log.info("task 16");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        log.info("\n maximum is "+max);
        for (int i = 0; i < arr.length; i++) {
            if ((Math.abs(arr[i]))>max)
            {
                arr[i] = 0;
            }
        }
        return arr;
    }

    /**
     * 17.	Дан массив чисел с положительными и отрицательными элементы.
     * Вычислить произведение отрицательных элементов P1 и произведение положительных элементов Р2.
     * Сравнить модуль Р2 с модулем Р1 и указать, какое из произведений по модулю больше.
     */

    public long positiveNegativeProduct(int[] arr) {
        log.info("task 17");
        long p1 = 1;
        long p2 = 1;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    p1 = p1 * arr[i];
                } else if (arr[i] > 0) {
                    p2 = p2 * arr[i];
                }
            }
        } catch (Exception e) {
            log.error("oooops! there is an exception " + e);
        }
        if (Math.abs(p1) > p2) {
            System.out.println("the product of negative elements is bigger ");
            log.info("the product of negative elements " + Math.abs(p1) + " is bigger than product of positive elements " + p2);
            return p1;
        } else {
            System.out.println("the product of positive elements is bigger ");
            log.info("the product of positive elements " + p2 + " is bigger than product of negative elements " + Math.abs(p1));
            return p2;
        }
    }

    /**
     * 18.	Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и заменить его нулем.
     */

        public int[] firstMaxToZero(int[] arr){
            log.info("task 18");
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]>max){
                    max=arr[i];
                }
            }
            for (int i = 1; i < arr.length; i++){
                if (arr[i]==max){
                    arr[i]=0;
                    break;
                }
            }
            return arr;
        }

    /**
     * 19.	 Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного, оканчивающиеся на цифру k.
     */
    public Integer[] lastK(int[] arr, int k){
        log.info("task 19");
        int countK=0;
        ArrayList<Integer> arrK= new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            if (((arr[i])%10)==k) {
                arrK.add(arr[i]);
                countK++;
            }
        }
        if (countK==0){
            System.out.println("no such elements");
            log.info("no such elements");
        }
        return arrK.toArray(new Integer[arrK.size()]);
    }

}
