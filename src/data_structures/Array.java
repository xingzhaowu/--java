package data_structures;

public class Array {

	private int[] data;
	private int size;
	//创建指定容量的数组
	public Array(int capacity){
		data = new int[capacity];
	}
	//初始化一个默认的容量为10的数组
	public Array(){
		this(10);
	}
	//获取数组大小
	public int getSize(){
		return size;
	}
	//获取数组容量
	public int getCapacity(){
		return data.length;
	}
	//判断数组是否为空
	public boolean isEmpty(){
		return size == 0;
	}
	//向所有元素最后插入一个新元素
	public void addLast(int e){
		add(size,e);
	}
	//向所有元素前插入一个新元素
	public void addFirst(int e){
		add(0,e);
	}
	
	//向数组指定位置插入新元素
	public void add(int index, int e){
		if(size == data.length){
			throw new IllegalArgumentException("Add failed. Array is full.");
		}
		if(index <0 || index>size){
			throw new IllegalArgumentException("Add failed. Require index >=0 and index<=size");
		}
		for(int i= size-1; i>=index; i--){
			data[i+1] = data[i];
		}
		data[index] = e;
		size ++;
	}
	
	//删除指定位置的元素
	public void remove(int index){
		if(index > size-1 || index < 0){
			throw new IllegalArgumentException("Remove failed. Require index >=0 and index<=size");
		}
		for(int i=index; i<=size-2; i++){
			data[i] = data[i+1];
//			System.out.print(data[i] + " ");
		}
		data[size-1] = 0;
		size -- ;
	}
	//删除数组中第一个元素
	public void removeFirst(){
		remove(0);
	}
	//删除数组中最后一个元素
	public void removeLast() {
		remove(size);
	}
	//更新数组中某个位置的数据
	public void update(int index,int e){
		
		if(index <0 || index>size){
			throw new IllegalArgumentException("Update failed. Require index >=0 and index<=size");
		}
		data[index] = e;
	}
	//打印
	public void printArr(){
		for(int i=0; i<getSize(); i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Array arr = new Array(20);
		for(int i=0; i<10; i++)
			arr.addLast(i);
		System.out.println("初始化数组：");
		arr.printArr();
		System.out.println("向尾部添加一个元素16");
		arr.addLast(16);
		arr.printArr();
		System.out.println("删除第7个元素：");
		arr.remove(6);
		arr.printArr();
		System.out.println("修改第3个元素值为9");
		arr.update(2, 9);
		arr.printArr();
		System.out.printf("容量：%d,长度：%d", arr.getCapacity(),arr.getSize());
		
	}
}
