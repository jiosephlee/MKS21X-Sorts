public class Sorts{
  public static void main(String[] args) {
    int[] data = {2,1,3,7,0,-1,4,2,7};
    selectionSort(data);
    for (int x = 0; x < data.length; x++){
      System.out.print(data[x] + " ");
    }
    System.out.println();
    int[] data3 = {1,3,7,-1,5,2,12,0,2,5};
    insertionSort(data3);
    for (int x = 0; x < data3.length; x++){
      System.out.print(data3[x] + " ");
    }
    System.out.println();
    int[] data2 = new int[2000000];
    for (int x = 0; x < data2.length; x++){
      data2[x] = 0;
    }
    bubbleSort(data2);
  }

  public static void selectionSort(int [] ary) {
    int hold;
    int holdind = 0;
    for (int x = 0; x < ary.length; x++){
      holdind = x;
      for (int y = x; y < ary.length; y++){
        if (ary[y] < ary[holdind]){
          holdind = y;
        }
      }
      hold = ary[x];
      ary[x] = ary[holdind];
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
    int orig;
    for (int x = 1; x < data.length; x++){
      orig = data[x];
      for (int y = x; y > 0 && data[y] < data[y-1] ; y--){
          data[y] = data[y-1];
          data[y-1] = orig;
      }
    }
  }

}
