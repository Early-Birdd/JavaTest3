package test2;

import java.util.*;
public class Main {

	public ArrayList<Integer> solution(int n, int[] a, int m, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		int p = 0;
		int q = 0;
		while(p<n && q<m) {
			if(a[p]==b[q]) {
				answer.add(a[p]);
				p++;
				q++;
			}
			else if(a[p]<b[q]) {
				p++;
			}
			else {
				q++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		
		int m = in.nextInt();
		int[] b = new int[m];
		for(int j=0; j<m; j++) {
			b[j] = in.nextInt();
		}
		for(int x : T.solution(n, a, m, b)) {
			System.out.print(x + " ");
		}
	}

}
