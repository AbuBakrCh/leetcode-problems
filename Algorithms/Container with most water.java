class Solution {
    public int maxArea(int[] height) {
        
        int maxArea=0;
        int h=0;
        int h1=0;

        
        
    
        if(height.length==2){
             h=height[0];
             h1=height[1];

                if(h=h1){
                     return h;

                }
                else{
                     return h1;

                }
        }
        
        int k=height.length-1;
        int i=0;
        while(ik){
            
            if(height[i]=height[k]){
                
                if(maxAreaheight[i](k-i)){
                    
                    maxArea=height[i](k-i);
                }
                
                i++;
            }
            else{
                if(maxAreaheight[k](k-i)){
                    
                    maxArea=height[k](k-i);
                }
                k--;
            }
            
        }
        
        return maxArea;
                 
            
       }
    
}
    