package code;

public class BottomUpCutRod {
	static int[] r;
	static int[] s;
	
	
	public BottomUpCutRod(int[] r2, int[] s2) {
		// TODO Auto-generated constructor stub
	}
 

	public static BottomUpCutRod cutRod(int[] arr1, int len){
		int[] p = arr1;
		r = new int[len];
		s = new int[len];
		r[0]=0;
		for (int j=1; j<=len; j++){ 
			int q = -1;
			for(int i=1; i<=j; i++){
				if (q < p[i-1] + r[j-i]){
					q = p[i-1] + r[j-i];
					s[j-1] = i;
				}
			}
			r[j-1] = q;
		}
		BottomUpCutRod obj1 = new BottomUpCutRod(r, s);
		return obj1;
	}
	
	public static void PrintSol(int[] arr1, int len){
		BottomUpCutRod obj;
		obj = cutRod(arr1, len); 
		while (len>0)
		{
			System.out.println(obj.s[len-1]);
			len = len - obj.s[len-1];
		}
	}
	
	public static void main(String[] args){
		int[] arr1 = {1,5,8,10,13,17,18,22,25,30};
		int len = 5;
		PrintSol(arr1,len);
	}
}
