package buystock;

class Main {
  public static void main(String[] args) {
    int[] arr = {7, 6, 4, 3, 1};

    int buy_price = arr[0];
    int sell_price = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > buy_price && arr[i] > sell_price) {
        sell_price = arr[i];
      } else if (arr[i] < buy_price) {
        buy_price = arr[i];
        sell_price = 0;
      }
    }

    if (sell_price == 0) {
      System.out.println(0);
    } else {
      System.out.println(sell_price - buy_price);
    }
    
  }
}