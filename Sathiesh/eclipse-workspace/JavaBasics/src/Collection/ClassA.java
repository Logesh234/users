package Collection;

public class ClassA implements Comparable<ClassA>
{
	private String students;
	private int age;
	private int marks;

public ClassA()
{
	
}

public ClassA(String students, int age, int marks) {
	super();
	this.students = students;
	this.age = age;
	this.marks = marks;
}

public String getStudents() {
	return students;
}

public void setStudents(String students) {
	this.students = students;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}


@Override
public String toString() {
	return "ClassA [students=" + students + ", age=" + age + ", marks=" + marks + ", getStudents()=" + getStudents()
			+ ", getAge()=" + getAge() + ", getMarks()=" + getMarks() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}



public int compareTo(ClassA that) {
	
			if(this.getMarks()> that.getMarks())
				return 1;
			else
				return -1;
	
}
	

}
