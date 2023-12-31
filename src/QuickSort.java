import java.util.Arrays;

public class QuickSort {

    static void quickSort(int[] a, int L, int R) {
        // dieu kien dung
        if(L >= R) {
            return;
        }
        // chon khoa
        int key = a[(L + R) / 2];

        // phan bo lai mang theo khoa
        int k = partition(a, L, R, key);
        // chia doi mang => lap lai
        quickSort(a, L, k - 1);
        quickSort(a, k, R);
    }

    static int partition(int[] a,int L ,int R, int key) {
        int iL = L;
        int iR = R;
        while (iL <= iR) {
            // voi iL, di tim phan tu >= key de doi cho
            while (a[iL] < key) {
                iL++;
            }
            // voi iR, di tim phan tu <= key de doi cho
            while (a[iR] > key) {
                iR--;
            }
            // doi cho 2 phan tu dang dung khong dung vi tri
            if(iL <= iR) {
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] a = {6, 7, 8, 5, 4, 1, 2, 3};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }
}
