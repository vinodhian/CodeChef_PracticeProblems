import java.util.Scanner;

public class ByteLandian {
	public static long[] savedValues = new long[10000000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		savedValues[0] = 0;
	    savedValues[1] = 1;
	    savedValues[2] = 2;
	    savedValues[3] = 3;
	    savedValues[4] = 4;
	    savedValues[5] = 5;
	    savedValues[6] = 6;
		Scanner scanner = new Scanner(System.in);
		int nInput = 0;
		while(scanner.hasNextInt() && nInput < 10){
			nInput++;
			n=scanner.nextInt();
			System.out.println(getMax(n));
			
		}
		scanner.close();
	}
	public static long getMax(int n){
		if (n < savedValues.length) {
		      if (n == 0 || savedValues[n] != 0)
		        return savedValues[n];
		    }
		long maxVal = Math.max((long)n, (long)getMax(n/2)+(long)getMax(n/3)+(long)getMax(n/4));
		if(n < savedValues.length){
			savedValues[n] = maxVal;
		}
		return maxVal;
	}
}
