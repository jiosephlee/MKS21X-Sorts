public class sorts{
  public static void selectionsort(int [] ary) {
    for (int x = 0; x < ary.length; x++){
      min = ary[x];
      for (int y = x; y < ary.length; y++){
        min = ary[y];
        if (ary[y] < min){
          min = ary[y];
        }
      }
      ary[x] = min;
    }
  }

}
