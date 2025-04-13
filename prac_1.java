class Solution {
    public int test(int x, int y, int z) {
        int d1, d2;
        if (x > z) {
            d1 = x - z;
        } else {
            d1 = z - x;
        }
        if (y > z) {
            d2 = y - z;
        } else {
            d2 = z - y;
        }
        if (d1 < d2) {
            return 1;
        } else if (d2 < d1) {
            return 2;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        int x = 2, y = 7, z = 4;
        Solution o = new Solution();
        int a = o.test(x, y, z);
        System.out.println(a);
    }
}