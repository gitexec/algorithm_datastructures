class Matrix {
 public static int CountPaths(boolean[][] n, int row, int col){ 
  //obstacle
  if(!validCell[row][col]) return 0;
  if(reachEnd[row][col]) return 1;
  else{
    return CountPaths(n, row+1, col) + CountPaths(n,row,col+1);
  }

  
 }





}
