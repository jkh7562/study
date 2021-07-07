package study;

import java.util.Scanner;

public class hanoi {
	
	public static int answer = 0;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        moveHanoiTower(num, 1, 2, 3);
        sb.insert(0, answer + "\n");
        System.out.println(sb);
	}
	public static void moveHanoiTower(int num, int from, int by, int to) {
        ++answer;
        if(num == 1) {
            sb.append(from + " " + to + "\n");
        } else {
            moveHanoiTower(num-1, from, to, by);
            sb.append(from + " " + to + "\n");
            moveHanoiTower(num-1, by, from, to);
        }	
    }
}
