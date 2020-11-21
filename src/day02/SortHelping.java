package day02;

public class SortHelping {
	private SortHelping(){}
	
	public static void sortTest(String sortName,Integer[]data){
		long startTime = System.nanoTime();
		if(sortName.equals("SelectionSort"))
			SelectionSort.selectionSort(data);
		long endTime = System.nanoTime();
		double time = (endTime - startTime)/1000000000.0;
		System.out.println(String.format("SelectionSort n=%d t=%f", data.length,time));
	}

}
