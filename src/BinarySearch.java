public class BinarySearch {

    public int search(int[] nums, int target) {
        int n = nums.length;
        int iLeft = 0;
        int iRight = n - 1;

        while (iLeft <= iRight) {
            int iMid = (iLeft + iRight) / 2;
            if(target == nums[iMid]) {
                return iMid;
            }
            else if(target > nums[iMid]) {
                iLeft = iMid + 1;
            }
            else {
                iRight = iMid - 1;
            }
        }

        return -1;
    }
}
