package cc.learnfly.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException {
		Class cls = ReflectBean.class;
		Constructor[] cs = cls.getDeclaredConstructors();
		for(Constructor c : cs){
			System.out.println(c.getName());
		}
		System.out.println();
		
		ReflectBean bean = new ReflectBean("hello", "hello", "hello", "hello");
		Field[] fs = cls.getDeclaredFields();
		for(Field f : fs){
			//f.setAccessible(true);
			System.out.println(f.getName());
		}
		System.out.println();
		
		Method[] ms = cls.getDeclaredMethods();
		for(Method m : ms){
			System.out.println(m.getName());
		}
		System.out.println();
		for(Method m : ms){
			m.setAccessible(true);
			m.invoke(bean, null);
			//m.setAccessible(true);
			
		}
	}

}
