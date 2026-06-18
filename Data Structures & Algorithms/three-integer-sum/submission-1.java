class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int k = 0;k<nums.length-2;k++){
            int i = k+1,j=nums.length-1;
            while(i<j){
            int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                i++;
                j--;
            }else if(sum>0){
                j--;
            }else{
                i++;
            }
        }
        }
        return new ArrayList<>(result);
    }
}
