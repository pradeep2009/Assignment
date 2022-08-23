package com.switchassignment;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         
         System.out.println("MENU:");
         System.out.println("1.Area of a Circle");
         System.out.println("2.Area of a Square");
         System.out.println("3.Area of a Right Angled Triangle");
         System.out.println("4.Area of a Rectangle");
         System.out.println("5.Circumference of a Circle");
         System.out.println("6.Perimeter of a Square");
         System.out.println("7.Exit");

         System.out.println("Enter your option:");
         int op=sc.nextInt();

         switch(op)
         {
               case 1: System.out.println("Enter radius:");
                           float r=sc.nextFloat();
                           float ac=3.14f*r*r;
                          System.out.println("Area Of Circle:"+ac);
                          break;

              case 2: System.out.println("Enter side:");
                           int x=sc.nextInt();
                           int as=x*x;
                          System.out.println("Area of a Square:"+as);
                          break;

              case 3: System.out.println("Enter height and base:");
                           float h=sc.nextFloat();
                           float bs=sc.nextFloat();
                           float art=0.5f*h*bs;
                          System.out.println("Area of a Right Angled Triangle"+art);
                          break;

             case 4: System.out.println("Enter length and breadth:");
                           int l=sc.nextInt();
                           int b=sc.nextInt();
                           int ar=l*b;
                          System.out.println("Area of a Rectangle:"+ar);
                          break;

            case 5: System.out.println("Enter radius:");
                           float r1=sc.nextFloat();
                           float c=3.14f*2f*r1;
                          System.out.println("Circumference of a Circle:"+c);
                          break;


             case 6: System.out.println("Enter side:");
                           int X=sc.nextInt();
                           int p=4*X;
                          System.out.println("Perimeter of a Square:"+p);
                          break;

              default:System.out.println("invalid input");
              
         }
      sc.close();
	}

}
