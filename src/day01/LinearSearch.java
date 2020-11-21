package day01;

/**
 * 输入：数组和目标元素
 * 输出：目标元素所在的索引，若不存在返回-1
 * @author Administrator
 *
 */
public class LinearSearch<E> {
	private LinearSearch(){}
	public static void main(String[] args) {
		Integer[] arr = {24,18,12,9,16,66,32,4};
		System.out.println(search(arr, 32));
		System.out.println(search(arr, 666));
		
		Student s1 = new Student("张三", 22);
		Student s2 = new Student("李四", 23);
		Student s3 = new Student("张三", 24);
		Student s4 = new Student("王五", 24);
		
		Student[] students = {s1,s2};
		System.out.println(search(students,s3));
		System.out.println(search(students,s4));
	}
	public static <E> int search(E[] arr,E target){
		for(int i=0; i<arr.length; i++){
			if(arr[i].equals(target)){
				return i;
			}
		}
		return -1;
	}
}

