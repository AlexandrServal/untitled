public class Array {
    public static void main(String args[]) {

        int[] nums1 = new int[]{0, 1, 2, 3, 4, 5};
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
        int[][] nums2 = new int[][]{{0, 1, 2},{3, 4, 5}};
        for (int i =0; i < nums2.length; i++) {
            for (int j = 0; j <nums2[i].length; j++) {
                System.out.printf("%d ", nums2[i][j]);
            }
            System.out.println();
        }
    }

}
