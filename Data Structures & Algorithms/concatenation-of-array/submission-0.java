class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] newArr = new int[l*2];
        for(int i=0;i<l;i++){
            newArr[i] = nums[i];
            newArr[l+i] = nums[i];
        }
        return newArr;
    }
}