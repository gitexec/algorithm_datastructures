public class EqualArrayEle {

    public int minMoves(int[] nums) {
      int count = 0;
      while(!equalElements(nums)){    

        //find the max element

        int max_index = findMaxIndex(nums);

        //Increment all elements except max_index

        nums = increment(nums, max_index);
        System.out.println("b"+ count);
        count++;
        System.out.println("after"+ count);
      }

      return count; 

        

    }

    private int[] increment(int[] nums,int max_index){

        for(int i = 0; i<nums.length;i++){

            if(i == max_index){

                continue;

            }

            nums[i]++;

        }

        return nums;

    }

    private int findMaxIndex(int[] nums){

        int max = 0;

        for(int i =0;i<nums.length;i++){

            if(nums[i] > nums[max]){

                max = i;

            }

        }

        return max;

    }

    public boolean equalElements(int[] a){

        int sum = 0;
        int[] nums = a;
        int sign =1;
        for(int i = 0; i < nums.length; i++){
          System.out.println(nums[i]); 
          //make sure all the signs are the same
          //Otherwise return false
          sign *= nums[i];
          if(sign < 0 ){
            return false;
          }
          sum += nums[i]*nums[i];
        }
        sum = sum % nums.length;
        

        if(sum == 0){

            return true;

        }

        return false;

    }
    
    public static void main(String[] args){
      int[] nums = new int[]{1,2,3};
      EqualArrayEle elements = new EqualArrayEle();
      
      System.out.println("minMoves "+elements.minMoves(nums));
      nums = new int[]{1,2147483647};
      System.out.println("minMoves -1"+elements.minMoves(nums));

    }

}
