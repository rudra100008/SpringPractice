package com.SpringCore.Spring.FactoryMethod;

public class A {
   private static final A obj=new A();
   private A() {
	   System.out.println("Constructor is called....");
   }
   public static A getA() {
	   System.out.println("getA() method is called..");
	   return obj;
   }
   
   public void message() {
	   System.out.println("Hello User!! How are you?");
   }
}
