package com.oops;

public class Area {

	public static void main(String[] args) {
		
		Area1 a1;
		a1=new Area1();
		double c1=a1.circleArea(8);
		System.out.println("Area of circle is: "+c1);
		float r1=a1.reactAngleArea(8,12);
		System.out.println("Area of Reactangle is: "+r1);
		double sq1=a1.squareArea(9);
		System.out.println("Area of Square is: "+sq1);
		double tr1=a1.triangleArea(8, 4);
		System.out.println("Area of Triangle is: "+tr1);

	}

}
