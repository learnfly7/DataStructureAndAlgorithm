package cc.learnfly.exam;

public class Yuanjing1 {

	public static void main(String[] args) {
		int [] a= {1,1,2,2,3,4};
		int[] b=new int[1];
		int[] c=new int[1];
		// TODO Auto-generated method stub
		FindNumsAppearOnce(a,b,c);
	}

	 public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
			//与或操作
	        if(array == null || array.length == 1){
	        	num1[0] = 0;
	        	num2[0] = 0;
	        	return ;
	        }
	        int n = array.length;
	        int result = 0;
	        for(int i = 0;i<n;i++){
	        	result ^= array[i];
	        }
	        int k = 0;
	        while((result & (1 << k))== 0){
	        	k++;
	        }
	        for(int i = 0;i<n;i++){
	        	if((array[i] & (1 << k)) != 0){
	        		num1[0] ^= array[i];
	        	}else{
	        		num2[0] ^= array[i];
	        	}
	        }
	        System.out.println(num1[0]);
	        System.out.println(num2[0]);
	        
	    }
}
