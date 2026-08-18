class Solution {
    public void sortColors(int[] nums) {

        int zeros = 0;
        int ones = 0; 
        int twos = 0; 

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zeros++;

            }
            else if(nums[i]==1){
                ones++;

            }
            else if(nums[i]==2){
                twos++;
            }
        }

            int index = 0;
            for (int j = 0; j < zeros; j++) {

            nums[index++] = 0;

        }

        for (int j = 0; j < ones; j++) {

            nums[index++] = 1;

        }

        for (int j = 0; j < twos; j++) {

            nums[index++] = 2;

        }

        


        
    }
}