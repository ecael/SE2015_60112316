
public class Lecture {
	
	private String name;
	private Student student;
	
	public Lecture(){
		
	}
	
	public Lecture(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		this.student = student;
	}

	public String getStudent(){
		return student.getName();
	}

}
