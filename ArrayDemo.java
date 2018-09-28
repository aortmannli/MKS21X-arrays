public class ArrayDemo{
 
   public static void main(String[] args){
    int[] arr = {
      1, 2, 3, 4
    };
    int[][] multiArr = {
      {1, 0, 3},
      {2, 3, 0},
      {3, 4, 5},
    };
    printArray(arr);
    printArray(multiArr);
    System.out.println(countZeroes2D(multiArr));
    fill2D(multiArr);
}

   public static void printArray(int[]ary){
        String out = "{";
        for (int i = 0; i < ary.length; i++){
            if (i != ary.length-1) out +=  Integer.toString(ary[i]) + ",";
                else out += Integer.toString(ary[i]);
        }
        System.out.println(out +"}") ;
    }

  public static void printArray(int[][] ary) {
    System.out.println("{");
        for (int i = 0; i < ary.length; i++){
            if (i != ary.length-1){
              printArray(ary[i]);
              //System.out.println(", /n");;
            }else{
              printArray(ary[i]);
            } 
        }
    System.out.println("}");
  }


  public static int countZeroes2D(int[][] nums) {
    int count = 0;
    for (int i=0; i < nums.length; i++) {
      for (int c = 0; c < nums[i].length; c++) {
        if (nums[i][c] == 0) {
          count += 1;
        }
      }
    }
    return count;
  }

 public static void fill2D(int[][] vals) {
  for (int i =0; i < vals.length; i++) {
    for (int n=0; n < vals[i].length; n++) {
      if (i != n) {
        vals[i][n] = 1;
      }else {
        vals[i][n] = 3;
      }
    }
  }
  printArray(vals);
 }


}            
