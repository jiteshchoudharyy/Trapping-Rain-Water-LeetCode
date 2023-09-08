import java.util.Scanner;
import java.util.Collections;

class Solution {
    public int trap(int[] height) {
        int storage=0;
        int elevation=0;
        int leftPillar=-1;
        int rightPillar=-1;
        for(int left=0,right=height.length-1;left<right;){
            if(leftPillar==-1||rightPillar==-1){
                if(height[left]>elevation){
                    leftPillar=left;
                }
                if(height[right]>elevation){
                    rightPillar=right;
                }
            }
            else{
                elevation=Math.min(height[leftPillar],height[rightPillar]);
                for(int i=leftPillar;i<=rightPillar;i++){
                    if(height[i]<elevation){
                        storage+=elevation-height[i];
                        height[i]=elevation;
                    }
                }
                if(height[leftPillar]<=elevation){
                    leftPillar=-1;
                }
                else if(height[rightPillar]<=elevation){
                    rightPillar=-1;
                }
            }
            if(leftPillar==-1){
                left++;
            }
            if(rightPillar==-1){
                right--;
            }
        }
        return storage;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] height=new int[n];
        Solution solObj=new Solution();
        solObj.trap(height);
    }
}
