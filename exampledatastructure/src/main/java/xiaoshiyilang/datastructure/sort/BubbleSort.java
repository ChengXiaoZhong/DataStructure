package xiaoshiyilang.datastructure.sort;

import java.util.Arrays;

/**
 * @program: example-test
 * @description:
 * @author: zhang.cheng
 * @create: 2019-11-12 13:29
 **/

public class BubbleSort {
    public static void main(String[] args) {


        int[] array = {5, 7, 8, 6, 4};
        Arrays.stream(array).forEach(arr -> System.out.print(arr + " "));
        int temp;
        //0-3 第一趟排序将最大的放最后一位 从第一个和第二个数开始比及下标为0和1，最后一轮为第四个和第五个，即下标为3和4.所以i虽大为3就ok
        //第一趟需要比较四次即length-1次
        for (int i = 0; i < array.length - 1 - 0; i++) {
            if (array[i + 1] < array[i]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.println();
        Arrays.stream(array).forEach(arr -> System.out.print(arr + " "));

        //0-2第二趟排序将第二大的放倒数第二个位置
        //第二趟需要比较三次即length-1-1次
        for (int i = 0; i < array.length - 1 - 1; i++) {
            if (array[i + 1] < array[i]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.println();
        Arrays.stream(array).forEach(arr -> System.out.print(arr + " "));

        for (int i = 0; i < array.length - 1 - 2; i++) {
            if (array[i + 1] < array[i]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.println();
        Arrays.stream(array).forEach(arr -> System.out.print(arr + " "));


        for (int i = 0; i < array.length - 1 - 3; i++) {
            if (array[i + 1] < array[i]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.println();
        Arrays.stream(array).forEach(arr -> System.out.print(arr + " "));

        System.out.println();
        Boolean flag = false;
//        int[] array2 = {5, 7, 8, 6, 4};
        int[] array2 = {4, 5, 6, 7, 8};
        for (int j = 0; j < array2.length - 1; j++) {
            for (int i = 0; i < array2.length - 1 - j; i++) {
                if (array2[i + 1] < array2[i]) {
                    flag = true;
                    temp = array2[i];
                    array2[i] = array2[i + 1];
                    array2[i + 1] = temp;
                }
            }

            System.out.println("第" + (j + 1) + "趟排序后的数组");
            System.out.println(Arrays.toString(array2));

            // 在一趟排序中，一次交换都没有发生过
            if (!flag) {
                break;
                // 重置flag!!!, 进行下次判断
            } else {
                flag = false;
            }
        }

        System.out.println();
        Arrays.stream(array2).forEach(arr2 -> System.out.print(arr2 + " "));
    }


}
