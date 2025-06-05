class Student{
  private int studentId;
  private String name;
  private int daysAttended;

//constructor

  public Student(int studentId,String name,int daysAttended){
    this.studentId=studentId;
    this.name=name;
    this.daysAttended;
  }

  //getters

  public int getStudentId(){
    return studentId;
  }

  public String getName(){
    return name;
  }

  public int getDaysAttended(){
    return daysAttended;
  }

//setters

  public void setStudentId(int studentId){
    this.studentId=studentId;
  }

 public void setName(String name){
    this.name=name;
  }

   public void setDaysAttended(int daysAttended){
    this.daysAttended=daysAttended;
  }

//method
public void display(){
  System.out.println("ID: "+ studentId + ",Name: "+ name + ",DaysAttended: "+ daysAttended);
  } 
}

class Classroom{  private ArrayList<Student> students;

  public Classroom() {
    students = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void displayAllStudents() {
    for (Student student : students) {
      student.display();
    }
  
}

public class Main{
  public static void main(String[] args){}
  //create classroom
  Classroom classroom = new Classroom();

classroom.addStudent(newStudent(101,"Thisu",11));
classroom.addStudent(newStudent(102,"Nike",12));
classroom.addStudent(newStudent(103,"Kula",14));
  
}


