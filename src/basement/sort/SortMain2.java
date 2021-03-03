package basement.sort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SortMain2 {
    /*插入排序
    直接插入排序
    折半插入排序
    希尔排序
    *
    * */
    public static void main(String[] args){
//        建立数组
//        Scanner scanner =new Scanner(System.in);
//        String str=scanner.nextLine();
//        String[] strarrys=str.split(" ");
//        int[] nums =new int[strarrys.length];
//        for(int i=0;i<nums.length;i++){
//            nums[i]=Integer.parseInt(strarrys[i]);
//        }
//        InsertSort(nums);
//        for (int i : nums) {
//            System.out.println(i);
//        }

        int N = 20000;
        int[] arr = new int[800000];
        for (int index = 0; index < 800000; index++) {
            arr[index] = (int)(Math.random() * 80000);
        }

        SimpleDateFormat startTime = new SimpleDateFormat("yyyy:MM:dd:HH:mm:ss");
        System.out.println("排序开始时间："+startTime.format(new Date()));

        InsertSort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        SimpleDateFormat endTime = new SimpleDateFormat("yyyy:MM:dd:HH:mm:ss");
        System.out.println("排序结束时间："+endTime.format(new Date()));
    }


//    直接插入排序
    public static void InsertSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // 寻找元素 arr[i] 合适的插入位置
            for( int j = i ; j > 0 ; j -- )
                if( nums[j]<nums[j-1] ){
                    int temp;
                    temp =nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
                else
                    break;
        }

    }
}
