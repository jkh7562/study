package study;

import java.util.Scanner;

public class tree {
	static int[] tree = new int[10000];

    public static void main(String[] args) {
    	int num;
    	
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (true) {
        	num = sc.nextInt();
        	if(num == 0) {
        		break;
        	}
        	tree[i++] = num;
        }

        TF(0, i-1);

    }

    static void TF(int n, int end) {
        if (n > end) {
        	return;
        }

        int mid = n + 1;
        while (mid <= end && tree[mid] < tree[n]) {
        	mid++;
        }

        TF(n + 1, mid - 1);
        TF(mid, end);
        System.out.println(tree[n]);
    }
}
