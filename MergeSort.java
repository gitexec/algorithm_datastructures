public class MergeSort{
 public static void mergesort(int[] array){
  mergesort(array,0,array.length - 1)
 }
 
 public static void mergesort(int[] array, int leftstart, int rightEnd){
  if(leftStart >= rightEnd){
   return;
  }
  
  int middle = (leftStart + rightEnd)/2;

  mergesort(array,leftStart,middle);
  mergesort(array,middle+1,rightEnd);
  mergeHalves(array,leftstart,rigthEnd);
 
 }




}
