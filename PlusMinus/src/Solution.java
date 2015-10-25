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
    	int sumPos = 0;
    	int sumNeg = 0;
    	int sumZero = 0;
    	for(int i = 0; i < N; i++){
    		int next = in.nextInt();
    		if(next > 0)
    			sumPos++;
    		else if(next < 0)
    			sumNeg++;
    		else
    			sumZero++;
    	}
    	float posFraction = (float)sumPos / (float)N;
    	float negFraction = (float)sumNeg / (float)N;
    	float zeroFraction = (float)sumZero / (float)N;
    	//print positive fraction then negative then zero
    	System.out.println(posFraction);
    	System.out.println(negFraction);
    	System.out.println(zeroFraction);
    }
}