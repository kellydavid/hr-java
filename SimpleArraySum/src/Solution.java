import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int N = in.nextInt();
    	int sum = 0;
    	for(int i = 0; i < N; i++){
    		sum += in.nextInt();
    	}
    	System.out.println(sum);
    }
}