public class SortingAlgorithm {

    public static void printArray(int i, int [] a) {
        System.out.print(i + ": ");
        for (int j : a) {
            System.out.print(j + " ");

        }
        System.out.println();
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            if(isSorted) {
                break;
            }
            printArray(i, a);
        }
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for(int i = 0;i < n;i++) {
            int minIndex = i;
            for(int j = i + 1;j < n;j++) {
                // tim min [i, n]
                if(a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
            printArray(i, a);
        }
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for(int i = 1;i < n;i++) {
            // chen a[i] vao day 0 -> i - 1
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = ai;
            printArray(i, a);
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        insertionSort(a);
    }
}
