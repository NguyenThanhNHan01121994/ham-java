package giatrimin;
import java.util.*;

public class giatrimin {
		public static void main(String[] args) {
			int A[] = new int[] {1,15,25,36,42,23,58};
			int min = A[0];
			int max = A[0];
			for(int i=0; i<A.length; i++) {
			if(A[i]<min) {
				min = A[i];
			}
			if(A[i]>max) {
				max = A[i];
			}
			}
			System.out.println("giá trị nhỏ nhất là: "+min);
			System.out.println("giá trị lớn nhất là: "+max);
			
		}
		
		}