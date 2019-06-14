package vehinhchunhat;
import java.util.*;
public class vehinhchunhat  {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 vehinhchunhat hcn = new vehinhchunhat();
	    int chieuDai;
	    int chieurong;
	        System.out.print("Nhap chieu dai: ");
	        chieuDai = Math.round(sc.nextFloat());
	        System.out.println("nhap chieu rong: ");
	        chieurong = Math.round(sc.nextFloat());
	        System.out.println("Hinh chu nhat ban vua nhap la: ");
	        for(int i = 0; i < chieuDai; i++) {
	            for(int j = 0; j < chieurong; j++) {
	                System.out.print("* ");
	            }
	            System.out.println("");
	        }
	    }
	    
    }