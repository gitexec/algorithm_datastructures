class Fibonacci{

 //Fib = F(n-1) + F(n-2) given f(0) = 0, f(0) = 1
 public static int FibonacciNo(int n,int[] m){
  
  if(n == 0) return 0;
  if(n == 1) return 1;

  else if(m[n]>0)
  {
   m[n] = FibonacciNo(n-1,m) + FibonacciNo(n-2,m);
  }
  return m[n];

 }
 public static void main(String[] args){
   int[] a = new int[21];
   System.out.println(FibonacciNo(21,a));

 }



}
