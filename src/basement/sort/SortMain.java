package basement.sort;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;
/*
交换排序
冒泡排序
* 快速排序
* */
public class SortMain {
    public static void main(String[] args){
/*建立非固定数组*/
//        int[] nums= {20,14,18};
        Scanner scanner =new Scanner(System.in);
        String str=scanner.nextLine();
        String[] strarrys=str.split(" ");
        int[] nums =new int[strarrys.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(strarrys[i]);
        }
        
//        bubblesort(nums);
        quickSort(nums,0,nums.length-1);
//      冒泡排序后的数组为：
        for (int i : nums) {
            System.out.println(i);
        }

    }

/*冒泡排序*/
    private static void bubblesort(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if (nums[j] > nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

            }
        }
    }
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 找寻基准数据的正确索引
            int index = getpivot(arr, low, high);
            // 进行迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
            //quickSort(arr, 0, index - 1); 之前的版本，这种姿势有很大的性能问题，谢谢大家的建议
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }

    }
    /*快速排序 运用递归*/
    private static int getpivot(int[] nums,int low,int high){
        int pivot=nums[low];
        while (low<high){
            while(low<high&&nums[high]>=pivot){
                --high;
            }
            nums[low]=nums[high];
            while(low<high&&nums[low]<=pivot){
                ++low;
            }
            nums[high]=nums[low];
        }
        nums[low]=pivot;
        return low;
    }
}
