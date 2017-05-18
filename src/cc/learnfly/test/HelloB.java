package cc.learnfly.test;

public class HelloB extends HelloA 
{
 public HelloB()
 {
	 System.out.println("Hello B");
 }
 {
     System.out.println("I’m B class");
 }
 static
 {
     System.out.println("static B");
 }
 public static void main(String[] args)
 {
     new HelloB();
 }
}
class HelloA
{
 public HelloA()
 {
	 System.out.println("Hello A");
 }
 {
     System.out.println("I’m A class");
 }
 static
 {
     System.out.println("static A");
 }
}