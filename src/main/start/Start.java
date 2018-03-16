/**
 * 
 */
package main.start;

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

		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A' };

		System.out.print("In mảng số nguyên: ");
		MyGeneric.printArray(intArray);

		System.out.print("In mảng ký tự: ");
		MyGeneric.printArray(charArray);

	}
}
