import java.io.*;
import java.util.*;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.text.*;
import java.math.*;
import java.lang.Math;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int N = Integer.parseInt(in.nextLine());
    	int sum1 = 0; // sum of diagonal top left to bottom right
    	int sum2 = 0; // sum of diagonal top right to bottom left
    	for(int i = 0; i < N; i++){
    		String line[] = in.nextLine().split(" ");
    		sum1 += Integer.parseInt(line[i]);
    		sum2 += Integer.parseInt(line[(N-1) - i]);
    	}
    	System.out.println(Math.abs(sum1 - sum2));
    }
}