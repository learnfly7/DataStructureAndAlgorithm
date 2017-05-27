package cc.learnfly.offer;

import java.util.ArrayList;

public class FindPath {
	
	ArrayList<ArrayList<Integer>> pathList = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null){
        	return pathList;
        }
        target = target - root.val;
        list.add(root.val);
        if(target == 0 && root.left == null && root.right == null){
        	pathList.add(new ArrayList<>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);
        return pathList;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
