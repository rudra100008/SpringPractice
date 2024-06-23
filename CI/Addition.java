package com.SpringCore.Spring.CI;

public class Addition {
   private int a;
   private int b;
   
   public Addition(double a,double b) {
   	this.a=(int)a;
   	this.b=(int)b;
   	System.out.println("Value of a "+this.a);
    System.out.println("Value of b "+this.b);
   	System.out.println("Constructor double ,double");
   }
    public Addition(int a , int b) {
    	this.a=a;
    	this.b=b;
    	System.out.println("Value of a "+this.a);
        System.out.println("Value of b "+this.b);
    	System.out.println("Constructor int, int");
    }
    
    
    void addition() {
    	System.out.println("Addition of two number: "+(this.a+this.b));
    }
   
}
