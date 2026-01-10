package main.java.com.conceptcoding.creationalpatterns.builder.solution;

public class Client {

    public static void main(String args[]){
        System.out.println("===== Builder Design Pattern =====");
        //Create Director objects
        StudentRegistrationDirector enggStudentDirector = new StudentRegistrationDirector(new EngineeringStudentBuilder());
        StudentRegistrationDirector mbaStudentDirector = new StudentRegistrationDirector(new MBAStudentBuilder());

        // Create students using different builders
        Student engineerStudent = enggStudentDirector.createStudent();
        Student mbaStudent = mbaStudentDirector.createStudent();

        System.out.println("===== Builder Design Pattern =====");
    }
}
