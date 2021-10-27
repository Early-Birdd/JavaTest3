package test1;

import java.util.*;
public class Main {

	public ArrayList<Integer> solution(int n, int[] arr, int m, int[] arrr){
		ArrayList<Integer> answer = new ArrayList<>();
		int p = 0;
		int q = 0;
		while(p<n && q<m) {
			if(arr[p]<arrr[q]) {
				answer.add(arr[p]);
				p++;
			}
			else {
				answer.add(arrr[q]);
				q++;
			}
		}
		while(p<n) {
			answer.add(arr[p]);
			p++;
		}
		while(q<m) {
			answer.add(arrr[q]);
			q++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		int m = in.nextInt();
		int[] arrr = new int[m];
		for(int j=0; j<m; j++) {
			arrr[j] = in.nextInt();
		}
		for(int x : T.solution(n, arr, m, arrr)) {
			System.out.print(x + " ");
		}
	}

}
