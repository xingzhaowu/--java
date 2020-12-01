package data_structures;

public class Array {

	private int[] data;
	private int size;
	//����ָ������������
	public Array(int capacity){
		data = new int[capacity];
	}
	//��ʼ��һ��Ĭ�ϵ�����Ϊ10������
	public Array(){
		this(10);
	}
	//��ȡ�����С
	public int getSize(){
		return size;
	}
	//��ȡ��������
	public int getCapacity(){
		return data.length;
	}
	//�ж������Ƿ�Ϊ��
	public boolean isEmpty(){
		return size == 0;
	}
	//������Ԫ��������һ����Ԫ��
	public void addLast(int e){
		add(size,e);
	}
	//������Ԫ��ǰ����һ����Ԫ��
	public void addFirst(int e){
		add(0,e);
	}
	
	//������ָ��λ�ò�����Ԫ��
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
	
	//ɾ��ָ��λ�õ�Ԫ��
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
	//ɾ�������е�һ��Ԫ��
	public void removeFirst(){
		remove(0);
	}
	//ɾ�����������һ��Ԫ��
	public void removeLast() {
		remove(size);
	}
	//����������ĳ��λ�õ�����
	public void update(int index,int e){
		
		if(index <0 || index>size){
			throw new IllegalArgumentException("Update failed. Require index >=0 and index<=size");
		}
		data[index] = e;
	}
	//��ӡ
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
		System.out.println("��ʼ�����飺");
		arr.printArr();
		System.out.println("��β�����һ��Ԫ��16");
		arr.addLast(16);
		arr.printArr();
		System.out.println("ɾ����7��Ԫ�أ�");
		arr.remove(6);
		arr.printArr();
		System.out.println("�޸ĵ�3��Ԫ��ֵΪ9");
		arr.update(2, 9);
		arr.printArr();
		System.out.printf("������%d,���ȣ�%d", arr.getCapacity(),arr.getSize());
		
	}
}
