package code;

import java.math.*;

public class CutRod {
	static int[] p;
	public static int maxRevenue(int costs[], int len){
		p = costs;
		int q = -1;
		if (len == 0){
			return 0;
		}
		for (int i=1; i<=len; i++){
			q = Math.max(q, p[i-1] + maxRevenue(p, len-i));
			//System.out.println(q);
		}
		return q;
	}
	public static void main(String[] args){
		int len = 40;
		int[] costs = {1,5,8,9,10,17,17,20,24,30,30,30,30,30,30,30,30,30,30,30,1,5,8,9,10,17,17,20,24,30,30,30,30,30,30,30,30,30,30,30};
		int maxRev = maxRevenue(costs, len);
		System.out.println(maxRev);
	}
}

