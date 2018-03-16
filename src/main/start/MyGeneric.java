/**
 * 
 */
package main.start;

/**
 * @description:
 * @author: Admin
 * @time: 5:29:31 PM
 * @date: Mar 16, 2018
 */
public class MyGeneric<T> {
	// Type T
	T obj;

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 16, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 16, 2018
	 * @exception:
	 * @param obj
	 */
	void add(T obj) {
		this.obj = obj;
	}

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 16, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 16, 2018
	 * @exception:
	 * @return
	 */
	T get() {
		return obj;
	}

	/**
	 * @description: Giống như lớp generic, chúng ta có thể tạo phương thức generic
	 *               có thể chấp
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 16, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 16, 2018
	 * @exception:
	 * @param elements
	 */
	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
