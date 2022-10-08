import java.util.Scanner;

public class Solution {
    public int a;
    public int b;

    Scanner sc = new Scanner(System.in);

    /**
     *constructor.
     */
    Solution(int a_, int b_) {
        a = a_;
        b = b_;
    }

    /**
     * ham nhap.
     */
    public void nhap() {
        a = sc.nextInt();
        b = sc.nextInt();
    }

    /**
     * ham xuat.
     */
    public void print() {
        System.out.print(a + b);
    }
}
