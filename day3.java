public class day3 {
/*    盛最多水的容器
    https://github.com/gzc426/leetcode/blob/master/2018.11.26-leetcode11/%E4%B9%94%E6%88%88%E9%87%8C.md*/

    public int maxArea(int[] nums){

        int l=0,r=nums.length-1;
        int max = 0;
        while (l!=r){
            int sum;
            if(nums[l]<nums[r]){
                sum = nums[l]*(r-l) ;
                max = max>sum ? max:sum ;
                l++;
            }else {
                sum = nums[r]*(r-l);
                max = max>sum ? max:sum ;
                r--;
            }
        }

        return max;
    }
}
