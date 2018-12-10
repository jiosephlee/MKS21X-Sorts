public class Sorts{
  public static void main(String[] args) {
    int[] data = {2,1,3,7,0,-1,4,2,7};
    selectionSort(data);
    for (int x = 0; x < data.length; x++){
      System.out.print(data[x] + " ");
    }
    int[] data3 = {2,1,1,1,5,5,5,5,1,3,7,0,13,13,-5,5,-1,4,2,7};
    selectionSort(data3);
    for (int x = 0; x < data3.length; x++){
      System.out.print(data3[x] + " ");
    }
    System.out.println();
    int[] data2 = {2,1,3,7,0,-1,4,2,7};
    bubbleSort(data2);
    for (int x = 0; x < data2.length; x++){
      System.out.print(data2[x] + " ");
    }
  }

  public static void selectionSort(int [] ary) {
    int min = 0;
    int hold = 0;
    int holdind = 0;
    for (int x = 0; x < ary.length; x++){
      min = ary[x];
      for (int y = x; y < ary.length; y++){
        if (ary[y] < min){
          min = ary[y];
          holdind = y;
        }
      }
      hold = ary[x];
      ary[x] = min;
      ary[holdind] = hold;
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

  public static void insertionSort(int[] data){
    int min = 0;
    int hold = 0;
    int holdind = 0;
    for (int x = 1; x < data.length; x++){
      for (int y = x; y > -1 && data[x] < data[x-1] ; y--){
        if {
          min = data[y];
          holdind = y;
        }
      }
      hold = data[x];
      data[x] = min;
      data[holdind] = hold;
    }
  }

}
