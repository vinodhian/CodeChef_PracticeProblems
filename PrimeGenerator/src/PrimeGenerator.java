import java.io.IOException;
import java.util.Scanner;
 
 
public class PrimeGenerator {
	public static void main(String[] args) throws IOException {
		int m,n;
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
                    for(int i=0;i<testCases;i++){
                        int lower = scanner.nextInt();
                        int higher = scanner.nextInt();
         
                        printPrimes(lower,higher);
                        System.out.println();
                    }
		// TODO Auto-generated method stub
		scanner.close();
 
	}
public static void printPrimes(int m, int n){
	for(int i=m;i<=n;i++){
		if(checkPrime(i)){
			System.out.println(i);
		}
	}
}
 
public static boolean checkPrime(int p){
	if(p<2) return false;
	int sq = (int)Math.sqrt(p);
	for(int i=2;i<=sq;i++){
		if(p%i == 0)
			return false;
	}
	return true;
}
}    