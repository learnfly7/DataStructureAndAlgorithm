package cc.learnfly.recursion;
/**  
 * @Title:  HanoiTowers.java   
 * @Package cc.learnfly   
 * @Description:    ��ŵ��   
 * @author: Schaffer chen     
 * @date:   2017��4��16�� ����6:58:13   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
public class HanoiTowers {
	/**
	 * 
	 * @Title: hanoiTowers   
	 * @Description: TODO  
	 * @param: @param n Բ������
	 * @param: @param from Ҫ�ƶ�������
	 * @param: @param to Ŀ������
	 * @param: @param temp   ��������  
	 * @return: void      
	 * @throws
	 */
	public static void hanoiTowers(int n,String from,String to,String temp){
		if(n == 1){
			System.out.println("�ƶ�Բ�̣���" + from +"��"+ to);
			return;
		} 
		//���ø������ӣ��������n-1Բ�̴�ԭ�����ƶ�����������
		hanoiTowers(n-1, from, temp,to );
		System.out.println("�ƶ�Բ�̴�" + from +"��"+ to);
		//���ø������ӣ��������n-1Բ�̴�ԭ�����ƶ�����������
		hanoiTowers(n-1, temp, to, from);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoiTowers(3, "A", "B", "C");
	}

}
