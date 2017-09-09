package cc.learnfly.test;

import java.util.ArrayDeque;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> arr = new ArrayDeque<>();
		int initialCapacity = Integer.MAX_VALUE;
		System.out.println(initialCapacity);
        initialCapacity |= (initialCapacity >>>  1);
        System.out.println(initialCapacity);
        initialCapacity |= (initialCapacity >>>  2);
        System.out.println(initialCapacity);
        initialCapacity |= (initialCapacity >>>  4);
        System.out.println(initialCapacity);
        initialCapacity |= (initialCapacity >>>  8);
        System.out.println(initialCapacity);
        initialCapacity |= (initialCapacity >>> 16);
        System.out.println(initialCapacity);
        initialCapacity++;
        System.out.println(initialCapacity);
        if (initialCapacity < 0)   // Too many elements, must back off
            initialCapacity >>>= 1;// Good luck allocating 2 ^ 30 elements
            System.out.println(initialCapacity);
	}

}
