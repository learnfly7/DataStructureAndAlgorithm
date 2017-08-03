package cc.learnfly.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeSet;

public class Test {

	int a[] = new int[6]; 
	
	
	public static void main(String[] args) {
		Collections.synchronizedList(new ArrayList());
		// TODO Auto-generated method stub
		ArrayList list  =new ArrayList<>();
		/*int a = 123;
		a <<= 2;
		a >>>=2;*/
		/*Double d = 1.0; 
		 A obj = new D();

		 System.out.println(obj instanceof B);

		 System.out.println(obj instanceof C);

		 System.out.println(obj instanceof D);

		 System.out.println(obj instanceof A); 
		// System.out.println(a[0]);
		 Hashtable<String, Object> tab = new Hashtable<>();
		 tab.put("", "");
		 HashMap<String, String> map = new HashMap<>();
		 map.put("", "");*/
		
/*		int x,y;

		x=5>>2;
		System.out.println(x);
		y=x>>>2;
		System.out.println(y); */
		/*String str = "  I am  stident ";
		String[] strs = str.split(" ");
		for(String s:strs){
			System.out.println(s+"KKK");
		}*/
		/*HashSet<Object> set = new HashSet<>();
		TreeSet set1 = new TreeSet<>();*/
		long a  =0;
	}

}
class A{
	protected int a;
	private static void method(){
		
	}
	public A(){
		
	}
}

class B extends A{
	private int b;
	public B(){
		this.b = super.a;
	}
}

class C extends A{}

class D extends B{} 