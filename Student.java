public class Student extends User{
    private int studentNumber;

    public Student(){

    }

    public Student(int studentNumber){
        super();
        this.setStudentNumber(studentNumber);
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
