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

  public static void bubbleSort(int[] data){
    int swaps = 1;
    while (swaps > 0){
      swaps = 0;
      for (int x = 0; x < data.length - 1; x++){
        int hold = data[x];
        if (hold > data[x+1]){
          data[x] = data[x+1];
          data[x+1] = hold;
          swaps++;
        }
      }
    }
  }

}
