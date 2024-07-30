public class BubbleSort {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        boolean flag;
        for (int i = 0; i < n - 1; i++) {
            flag = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
}
