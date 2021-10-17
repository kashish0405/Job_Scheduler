package PriorityQueue;

public class Student implements Comparable<Student> {
    private String name;
    private Integer marks;

    public Student(String trim, int parseInt) {
    	name=trim;
    	marks=parseInt;
    }


    @Override
    public int compareTo(Student student) {
    	
        if(this.marks>student.marks)
        	{
        	return 1;}
        else if(this.marks<student.marks)
        	{
        	
        	return -1;
        	}else 
        	return 0;
    }
    public String toString() {
    	return "Student{name ='"+name+ "', marks ="+marks+"}";
    }
    public String getName() {
        return name;
    }
}
