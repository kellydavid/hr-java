import java.io.*;
import java.util.*;

class Main {

	static int solveMeSecond(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println("Solve Me Second");
		Scanner in = new Scanner(System.in);
		int t;
		int sum;
		int a,b;
		t = in.nextInt();
		for (int i=0;i<t;i++) {
			a = in.nextInt();
			b = in.nextInt();
			sum = solveMeSecond(a, b);
			System.out.println(sum);
		}
		in.close();
	}
}
