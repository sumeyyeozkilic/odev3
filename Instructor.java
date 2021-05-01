public class Instructor extends User{
    private String instructorsCourse;

    public Instructor(){

    }

    public Instructor(String instructorsCourse){
        super();
        this.setInstructorsCourse(instructorsCourse);
    }

    public String getInstructorsCourse() {
        return instructorsCourse;
    }

    public void setInstructorsCourse(String instructorsCourse) {
        this.instructorsCourse = instructorsCourse;
    }
}
