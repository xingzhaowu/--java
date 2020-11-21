package day01;

/**
 * ���룺�����Ŀ��Ԫ��
 * �����Ŀ��Ԫ�����ڵ��������������ڷ���-1
 * @author Administrator
 *
 */
public class LinearSearch<E> {
	private LinearSearch(){}
	public static void main(String[] args) {
		Integer[] arr = {24,18,12,9,16,66,32,4};
		System.out.println(search(arr, 32));
		System.out.println(search(arr, 666));
		
		Student s1 = new Student("����", 22);
		Student s2 = new Student("����", 23);
		Student s3 = new Student("����", 24);
		Student s4 = new Student("����", 24);
		
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

