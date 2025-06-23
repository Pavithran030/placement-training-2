class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int  re=0;

        while(left<right){
            int width=right-left;
            int he=Math.min(height[left],height[right]);
            int water=width*he;
            re=Math.max(re,water);

            if(height[left]<height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return re;
    }
}
