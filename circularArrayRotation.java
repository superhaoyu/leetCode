import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n, k ,q;
		int j, tmp;
		// n is number of separated integers
		n = in.nextInt();
		//k is number of rotation
		k = in.nextInt();
		q = in.nextInt();

		int[] array = new int [n];
		for (int i =0; i< n; i ++){
			array[i]=in.nextInt();
		}

		//System.out.println(Arrays.toString(array));

		for (int i =0; i < k; i++){
			tmp = array[n-1];
			//System.out.println("tmp is:" + tmp);
			for (j=n-1; j> 0 ;j--){
				int tmp1 = array[j];
				array[j]=array[j-1];
				array[j-1]=tmp1;


			}
			array[0] = tmp;

		}

		for (int w = 0; w < q; w++){
			System.out.println(array[w]);
		}
	}

}
