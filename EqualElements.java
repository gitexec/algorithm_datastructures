public class EqualElements{

  public static boolean equalElement(int[] nums){
       int sum = 0;
        for(int i = 0; i < nums.length; i++){

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
   a =new int[]{3,4,3};
   System.out.println("no" + equalElement(a));
   a = new int[]{4,4,4};
   System.out.println("yes" + equalElement(a));

 }


}
