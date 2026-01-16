class Selectionsort {
    public static void selectionsort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minindex]) {
                    temp = arr[j];
                    arr[j] = arr[minindex];
                    arr[minindex] = temp;

                }
            }

        }
        System.out.println("Sorted Array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 65, 78, 16, 48, 32, 05 };
        System.out.println("Original Array");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        selectionsort(arr);
    }
}