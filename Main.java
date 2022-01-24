// Method-1: using Brute Force.
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]==nums[j]&&i<j) count++;
           } 
        }
        return count;
    }
}

// Method-2: using HashMap.
class Solution {
    public int numIdenticalPairs(int[] numList) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans=0;
        for(int num:numList){
           int sameNumCount = hm.getOrDefault(num, 0);
            int numCount = sameNumCount + 1;
            ans += sameNumCount;
            hm.put(num, numCount);
        }
        return ans;
    }
}
