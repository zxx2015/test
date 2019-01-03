public class day2 {

    /*https://github.com/gzc426/leetcode/blob/master/2018.11.25-leetcode80/%E4%B9%94%E6%88%88%E9%87%8C.md8/
    删除排序数组中的重复项
     */
    public int delRepeat(int[] nums){
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }

        int first = 0,last = first,tempCount = 0,count = 0;

       while (first < nums.length){
          if(last < nums.length&&nums[first] == nums[last]){
             last++;
             tempCount++;
          }else {
             if(tempCount>=2){
                 nums[first+1] = nums[first];
                 first+=2;
                 count+=2;
             }else {
                 first++;
                 count++;
             }
             if(last<nums.length) {
                  nums[first] = nums[last];
                  tempCount = 0;
             }else break;
         }

       }
        return count;
    }
}
