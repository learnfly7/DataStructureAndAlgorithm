package cc.learnfly.exam.dji;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int len = scan.nextInt();
			int ap = scan.nextInt();
			int al = scan.nextInt();
			int ad = scan.nextInt();
			int bp = scan.nextInt();
			int bl = scan.nextInt();
			int bd = scan.nextInt();
			count(len, ap, al, ad, bp, bl, bd);
		}
		scan.close();
		
	}

	private static void count(int len, int ap, int al, int ad, int bp, int bl, int bd) {
		int count = 0;
		if(ad + bd == 0){
			if(al < bl && ad < bd){
				//a left ,b right
				if(ap >= al +1){
					count++;
				}
				if(bp >= len - bl){
					count++;
				}
			}else if(al > bl && ad > bd){
				//a right, b left
				if(ap >= len - al){
					count++;
				}
				if(bp >= bl +1){
					count++;
				}
			}else if(al > bl && ad < bd){
				if(ap >= (al-bl - 1)  + len - al){
					count++;
				}
				if(bp >= (al - bl - 1) + bl + 1){
					count++;
				}
			}else if(al < bl && ad > bd){
				if(ap >= (bl-al - 1) + al + 1){
					count++;
				}
				if(bp >= (bl - al - 1) + len - bl){
					count++;
				}
			}
		}else if(ad + bd < 0){
			if(al < bl){
				if(ap >= al + 1){
					count++;
					if(bp >= bl +1){
						count++;
					}
				}else{
					if(bp == bl -(al -ap ) + 1 + (al -ap + 1) * 2) {
						count++;
					}else if(bp > bl -(al -ap )+ 1 + (al -ap + 1) * 2){
						count+=2;
					}
				}
				
			}else{
				if(bp >= bl + 1){
					count++;
					if(ap >= al +1){
						count++;
					}
				}else{
					if(ap == al -(bl -bp )+ 1 + (bl -bp + 1) * 2) {
						count++;
					}else if(ap > al -(bl -bp )+ 1 + (bl -bp + 1) * 2){
						count+=2;
					}
				}
				
			}
		}else{
			if(al < bl){
				if(bp >= len - bl){
					count++;
					if(ap >= len -al){
						count++;
					}
				}else{
					if(ap == (bl+ bp -al - 1) + 2 * (len - bl - bp )){
						count++;
					}else if(ap >= (bl+ bp -al - 1) + 2 * (len - bl - bp )){
						count+=2;
					}
				}
				
			}else{
				if(ap >= len - al ){
					count++;
					if(bp >= len -bl){
						count++;
					}
				}else{
					if(bp == (al+ ap -bl - 1) + 2 * (len - al - ap )){
						count++;
					}else if(bp >= (al+ ap -bl - 1) + 2 * (len - al - ap )){
						count+=2;
					}
				}
			}
		}
		System.out.println(count);
	}

	

	

	

}
