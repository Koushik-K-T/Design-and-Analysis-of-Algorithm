public class greedymethod {
    public greedymethod(int[] a) {

    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30 }, { 60, 100, 120 } };
        int capacity = 50;
        double[] ratio = new double[3];
        for (int i = 0; i <= arr.length; i++) {
            ratio[i] = arr[1][i] / arr[0][i];
        }

        for (int i = 0; i < ratio.length; i++) {
            for (int j = 0; j < ratio.length; j++) {
                if (ratio[i] > ratio[j]) {
                    // ratio sort
                    double temp = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = temp;
                    // profit sort
                    int temp1 = arr[0][i];
                    arr[0][i] = arr[0][j];
                    arr[0][j] = temp1;
                    // Weight sort
                    temp1 = arr[1][i];
                    arr[1][i] = arr[1][j];
                    arr[1][j] = temp1;
                }
            }
        }

        double profit = 0;
        for (int i = 0; i < ratio.length; i++) {
            if (arr[0][i] <= capacity) {
                profit += arr[1][i];
                capacity -= arr[0][i];
            } else {
                profit += ratio[i] * capacity;
                capacity = 0;
            }
        }
        System.out.print(profit);
    }
}
