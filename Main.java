public class Main {

    public static void main(String[] args) {
        User user= new User();
        user.setFirstName("Sümeyye");
        user.setLastName("Özkılıç");
        user.seteMail("ozkilicsumeyye3@gmail.com");

        UserManager userManager= new UserManager();
        userManager.add(user);

        Student student= new Student();
        student.setStudentNumber(123);


        Instructor instructor=new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("DEMİROĞ");
        instructor.setInstructorsCourse("JAVA+ REACT");

        InstructorManager instructorManager= new InstructorManager();
        instructorManager.add(instructor);



    }
}
