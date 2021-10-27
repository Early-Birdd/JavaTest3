package test3;

import java.util.*;
public class Main {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int sum = 0;
		for(int i=0; i<m; i++) {
			sum+=arr[i];
		}
		answer = sum;
		for(int j=m; j<n; j++) {
			sum = sum + arr[j] - arr[j-m];
			answer = Math.max(answer, sum);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	}

}
