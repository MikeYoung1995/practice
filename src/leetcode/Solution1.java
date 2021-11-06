package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/*给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出
和为目标值 的那 两个 整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
你可以按任意顺序返回答案。
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class Solution1 {

    public static void main(String[] args){
        int[] nums={9,-3,1,5,7,8,0};
        int[] result=twoSum(nums,15);
        System.out.println(Arrays.toString(result));
    }


    public static int[] twoSum(int[] nums, int target) {
        /*暴力破解*/

//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//            if(map.containsKey(nums[i])){
//                return new int[]{map.get(nums[i]), i};
//            }
//            map.put(target - nums[i], i);
//        }
//        return null;

        int[] indexs = new int[2];
        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                System.out.println(indexs[1]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
//            hash.put(i,target-nums[i]);
        }
        return indexs;
    }
}
