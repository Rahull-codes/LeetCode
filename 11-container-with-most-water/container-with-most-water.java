class Solution {
    public int maxArea(int[] height) {
        int left =  0 , right = height.length -1 , Maxarea = 0;
        while(left < right){
            int area = (Math.min(height[left] , height[right])) * (right - left );
            if(Maxarea < area ) 
                Maxarea = area;
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }            
        }
        return Maxarea; 
    }
}