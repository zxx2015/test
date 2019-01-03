public class day2 {
    public int delRepeat(int[] nums){
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
