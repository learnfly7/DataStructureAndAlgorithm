package cc.learnfly.offer;

public class JumpFloorII {

	public int JumpFloorII(int target) {
        if(target == 0 || target == 1){
        	return 1;
        }
        return 2*JumpFloorII(target-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
