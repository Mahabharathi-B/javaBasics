package com.javalover.example;
import com.javalover.Demo1;
public class Demo3 {
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.i=10;
		//d.rollno=40;protected of another package
		//d.h=30;private
		//d.value=30;default of another 
		Demo2 k=new Demo2();
		k.i=30;
		k.rollno=30;
		k.sum=50;
		//k.name="hi";private 
	}

}
