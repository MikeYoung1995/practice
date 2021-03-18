package basement.sort.search;

import java.util.Scanner;

/*二分查找*/
public class biSearch {
    public static void main(String[] args){
        int number=0;
        Scanner scanner =new Scanner(System.in);
        number=scanner.nextInt();
        int[] nums={2,7,8,45,140,1000,6788};
        int pos=biSearch(nums,number);
        System.out.println(pos);
    }

    public static int biSearch(int[] array,int a){
        int low=0;
        int high=array.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(array[mid]==a){
                return mid;
            }
            else if(array[mid]<a)
            {low=mid+1;}
            else high=mid-1;
        }
        return -1;

    }


}
