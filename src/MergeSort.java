import java.util.Arrays;

// LeetCode912
public class MergeSort {

    public static int[] merge(int[] a1, int[] a2) {
        // Tron vao: a2 va a1 la cac mang da duoc sap xep
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;// i index result, i1 index a1, i2 index a2
        while (i < n) {
            if(i1 < a1.length && i2 < a2.length) { // a1 va a2 khac rong
                if(a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++; i1++;
                }
                else { // a2 nho hon
                    result[i] = a2[i2];
                    i++; i2++;
                }
            } else { // a1 rong hoac a2 rong
                if(i1 < a1.length) { // a2 rong
                    result[i] = a1[i1];
                    i++; i1++;
                }
                else { // a1 rong
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }

    public static int[] mergeSort(int a[], int L, int R) {
        // TH Dac Biet (Dieu Kien Dung)
        if(L > R) {
            return new int[0];
        }
        if(L == R) {
            return new int[]{a[L]};
        }

        // Chia Ra
//        System.out.println("Chia: " + L + " - " + R);
        int mid = (L + R) / 2;
        int[] a1 = mergeSort(a, L, mid);
        int[] a2 =  mergeSort(a ,mid + 1, R);
//        System.out.println("Ket Qua Merge: " + Arrays.toString(merge(a1, a2)));
        return merge(a1, a2);
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = {1, 5, 3, 2, 8, 7, 6, 4};
        System.out.println(Arrays.toString(mergeSort(c, 0, c.length - 1)));
    }
}
