import java.util.*;
public class Main{
    public static void main(String[] args) {

        tuitionCentre PandaiOne = new tuitionCentre();
        Tutor Amzar = new Tutor();
        Student Ali = new Student();
        Student Abu = new Student();

        //set tuitioncentre attributes
        PandaiOne.setAddress("Jalan Permai Damai 7/5");
        PandaiOne.setHeadmaster("Encik Ahmad");
        PandaiOne.setStudents(Ali);
        PandaiOne.setStudents(Abu);
        PandaiOne.setTutors(Amzar);

        //set student (Ali) attributes

        Ali.setName("Ali");
        Ali.setAddress("Jalan Damai 99");
        Ali.setIc("030225139999");
        Ali.setSchoolname("Sekolah School");
        Ali.setYear("17");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println(Ali.getName() + ": Enter score for subject " + (i+1) + ": ");
            Ali.setScores(input.nextFloat(), i);
        }


        //set next student (Abu) attributes
        Abu.setName("Abu");
        Abu.setAddress("Jalan Damai 69");
        Abu.setIc("030225139559");
        Abu.setSchoolname("School of Sekolah");
        Abu.setYear("17");

        for (int i = 0; i < 5; i++){
            System.out.println(Abu.getName() + ": Enter score for subject " + (i+1) + ": ");
            Abu.setScores(input.nextFloat(), i);
        }

        //set tutor (Amzar) attributes

        Amzar.setName("Amzar");
        Amzar.setAddress("Jalan Permai 111");
        Amzar.setDateJoined("10/2/2020");
        Amzar.setIc("030217103333");
        Amzar.setNumYearsCentre(3);
        Amzar.setNumYearsExp(10);
        Amzar.setQualification("PhD in Psychology with Honours");

        //run required methods in report

        System.out.println("Number of students in PandaiOne: " + PandaiOne.numStudents());
        System.out.println("Number of tutors in PandaiOne: " + PandaiOne.numTutors());
        System.out.println("Average marks in PandaiOne: " + PandaiOne.avgMarks());
        System.out.println("Minimum marks in PandaiOne: " + PandaiOne.minMarks());
        System.out.println("Maximum marks in PandaiOne: " + PandaiOne.maxMarks());
        System.out.println("Enter name of tutor to search: ");
        String reqTutor = input.next();
        System.out.println("Qualification of tutor: " + PandaiOne.tutorBG(reqTutor));

        input.close();
    }}