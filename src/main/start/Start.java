/**
 * 
 */
package main.start;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Một lớp có thể tham chiếu bất kỳ kiểu đối tượng nào được gọi là lớp generic
/**
 * @description:
 * @author: Admin
 * @time: 5:27:37 PM
 * @date: Mar 16, 2018
 */
public class Start {
	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 16, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 16, 2018
	 * @exception:
	 * @param args
	 */
	public static void main(String[] args) {
		// use Integer
		MyGeneric<Integer> m1 = new MyGeneric<Integer>();
		m1.add(2);
		System.out.println(m1.get());

		// use String
		MyGeneric<String> m2 = new MyGeneric<String>();
		m2.add("Hello");
		System.out.println(m2.get());

		// demo generic method
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A' };

		System.out.print("In mảng số nguyên: ");
		MyGeneric.printArray(intArray);

		System.out.print("In mảng ký tự: ");
		MyGeneric.printArray(charArray);

		// demo param ? trong generic
		List<Rectangle> list1 = new ArrayList<Rectangle>();
		Rectangle rectangleObj = new Rectangle();
		list1.add(rectangleObj);

		List<Circle> list2 = new ArrayList<Circle>();
		list2.add(new Circle());
		list2.add(new Circle());
		drawShapes(list1);
		drawShapes(list2);

		// demo Sử dụng Generics trong các đối tượng Collection
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("PHP");
		list.add("C++");
		// list.add(32);//compile time error

		// show list
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	// tao phuong thuc chi chap nhan tham so la lop con cua Shape
	public static void drawShapes(List<? extends Shape> lists) {
		for (Shape s : lists) {
			s.draw();// goi phuong thuc cua lop Shape boi lop con
		}
	}

}

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("ve hinh chu nhat.");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("ve hinh tron.");
	}
}
