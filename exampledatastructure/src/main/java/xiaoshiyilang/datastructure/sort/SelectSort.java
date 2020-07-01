package xiaoshiyilang.datastructure.sort;

import java.util.Arrays;

/**
 * @program: example-test
 * @description: 选择排序分析
 * @author: zhang.cheng
 * @create: 2019-11-15 11:26
 **/

public class SelectSort {

    public static void main(String[] args) {

        /**
         * 思路分析：
         * 第一次从所有的数中找到最小的与第一个数进行交换
         * 第二次从剩下的所有数中找到最小的与第二个数进行交换
         * 依次类推
         *
         */

        int[] arr = {5, 7, 89, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            //假定第一个数是最小的
            int min = arr[i];
            //最小的数索引
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }


            //交换，将最小值放前面
            if (minIndex != i) {
                //第一个数赋给对应最小数的位子
                arr[minIndex] = arr[i];
                //将最小数赋值给第一位
                arr[i] = min;
            }
        }

        System.out.println(Arrays.toString(arr));


//        //假定第一个数是最小的
//        int min = arr[0];
//        //最小的数索引
//        int minIndex = 0;
//        for (int i = 0 + 1; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//                minIndex = i;
//            }
//        }
//
//
//
//
//
//        //交换，将最小值放前面
//        if (minIndex != 0) {
//            //第一个数赋给对应最小数的位子
//            arr[minIndex] = arr[0];
//            //将最小数赋值给第一位
//            arr[0] = min;
//        }
//
//        System.out.println("第1轮后~~");
//        System.out.println(Arrays.toString(arr));
//
//        int min2 = arr[1];
//        //最小的数索引
//        int minIndex2 = 1;
//        for (int i = 1 + 1; i < arr.length; i++) {
//            if (arr[i] < min2) {
//                min2 = arr[i];
//                minIndex2 = i;
//            }
//        }
//
//        //交换，将最小值放前面
//        if (minIndex2 != 1) {
//            //第一个数赋给对应最小数的位子
//            arr[minIndex2] = arr[1];
//            //将最小数赋值给第一位
//            arr[1] = min2;
//        }
//
//        System.out.println("第2轮后~~");
//        System.out.println(Arrays.toString(arr));
//
//
//        int min3 = arr[2];
//        //最小的数索引
//        int minIndex3 = 2;
//        for (int i = 2 + 1; i < arr.length; i++) {
//            if (arr[i] < min3) {
//                min3 = arr[i];
//                minIndex3 = i;
//            }
//        }
//
//        //交换，将最小值放前面
//        if (minIndex3 != 2) {
//            //第一个数赋给对应最小数的位子
//            arr[minIndex3] = arr[2];
//            //将最小数赋值给第一位
//            arr[2] = min3;
//        }
//
//        System.out.println("第3轮后~~");
//        System.out.println(Arrays.toString(arr));


    }

}
