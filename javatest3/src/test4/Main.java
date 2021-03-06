package test4;

import java.util.*;
public class Main {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = 0;
		int sum = 0;
		for(int rt=0; rt<n; rt++) {
			sum+=arr[rt];
			if(sum==m) {
				answer++;
			}
			while(sum>=m) {
				sum-=arr[lt];
				lt++;
				if(sum==m) {
					answer++;
				}
			}
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
