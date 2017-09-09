/**
 * 
 */
package cc.learnfly.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectBean {
	
	public ReflectBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ReflectBean(String attr1, String attr2, String attr3, String attr4) {
		super();
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.attr4 = attr4;
	}

	public String attr1;
	protected String attr2;
	String attr3;
	private String attr4;
	
	/*public String getAttr1() {
		return attr1;
	}

	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}

	public String getAttr2() {
		return attr2;
	}

	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}

	public String getAttr3() {
		return attr3;
	}

	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}

	public String getAttr4() {
		return attr4;
	}

	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}*/

	public void method1(){
		System.out.println("method1");
	}
	protected void method2(){
		System.out.println("method2");
	}
	void method3(){
		System.out.println("method3");
	}
	private void method4(){
		System.out.println("method4");
	}
	
	
}
