public class sorts{
  public static void selectionSort(int [] ary) {
    for (int x = 0; x < ary.length; x++){
      int min = ary[x];
      for (int y = x; y < ary.length; y++){
        if (ary[y] < min){
          min = ary[y];
        }
      }
      ary[x] = min;
    }
  }

}
