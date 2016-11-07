public class EqualElements{

  public static boolean equalElement(int[] nums){
       int sum = 0;
        int j =1;
        for(int i = 0; i < nums.length; i++){
          //make sure all the signs are the same

        //Otherwise return false
          
          if(i == 0){
            if((nums[0]*nums[1]) < 0){
             return false;
            }

          }else{
            if((nums[i-1]*nums[i]) < 0){
             return false;
            }



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
   int[] a = new int[]{1,2,3};
   System.out.println("no" + equalElement(a));
   a =new int[] {2,3,3};
   System.out.println("no" + equalElement(a));
   a =new int[]{-1,1};
   System.out.println("nio" + equalElement(a));
   a = new int[]{4,4,4};
   System.out.println("yes" + equalElement(a));

 }


}
