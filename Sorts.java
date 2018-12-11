public class Sorts{
  public static void main(String[] args) {
    int[] data = {2,1,3,7,0,-1,4,2,7};
    selectionSort(data);
    for (int x = 0; x < data.length; x++){
      System.out.print(data[x] + " ");
    }
    System.out.println();
    int[] data3 = {1,3,2,5};
    insertionSort(data3);
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
    int swap, hold;
    for (int x = 1; x < data.length; x++){
      swap = -1;
      for (int y = x; y > -1 && data[x] < data[x-1] ; y--){
          swap = y - 1;
          System.out.println(swap);
        }
      if (swap > -1){
        for (int a = 0; a < data.length; a++){
          System.out.print(data[a] + " ");
        }
        hold = data[swap];
        data[swap] = data[x];
        data[x] = hold;
        for (int a = 0; a < data.length; a++){
          System.out.print(data[a] + " ");
        }
      }
    }
  }

}
