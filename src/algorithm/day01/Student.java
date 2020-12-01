package day01;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int score;
	public Student(){}
	public Student(String name, int age,int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object stu) {
		if(stu == null){
			return false;
		}
		// TODO Auto-generated method stub
		if(this == stu){
			return true;
		}
		if(this.getClass() != stu.getClass()){
			return false;
		}
		return this.getName().equals(((Student) stu).getName());
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
//		if(this.score > o.score)
//			return 1;
//		if(this.score < o.score)
//			return -1;
//		return 0;
		return this.score - o.score;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Student(name:%s,score:%d)", name,score);
	}
}
