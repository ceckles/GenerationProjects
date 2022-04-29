package com.example.MSGrades;
// import the java util ArrayList class module

import java.util.*;


public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    
    // Create 4 ArrayLists below all private constant properties (final)

    // 1. a new instance of a students ArrayList storing strings
    private final List<String> students = new ArrayList<String>();
    // 2. a new instance of a math grades ArrayList storing integers
    private final List<Integer> mathGrade = new ArrayList<Integer>();
    // 3. a new instance of a science grades ArrayList storing integers
    private final List<Integer> scienceGrade = new ArrayList<Integer>();
    // 4. a new instance of a english grades ArrayList storing integers
    private final List<Integer> englishGrade = new ArrayList<Integer>();


    public MSGrades(){
        // Add some students and their grades to the ArrayLists

            // add two students to the students ArrayList
        students.add("Mark");
        students.add("Tom");
            // add two corresponding values for the two students to the math grades ArrayList
        mathGrade.add(45);
        mathGrade.add(90);
            // add two corresponding values for the two students to the science grades ArrayList
        scienceGrade.add(78);
        scienceGrade.add(80);
            // add two corresponding values for the two students to the english grades ArrayList
        englishGrade.add(22);
        englishGrade.add(90);
    }

    public void printStudents(){
        // loop thru the students ArrayList with a For Each loop
            // print each students name on a new line as output
        for (String student: students) {
            System.out.println(student);
        }
    }

    // Make a method that prints an individual students grades
    // It will be public, not have a return value,
    // and have one int type parameter that is a students index
public void studentGrade(int i){
    System.out.println("Grades for "+students.get(i)+" : Math: "+mathGrade.get(i)+", Science: "+scienceGrade.get(i)+", English: "+englishGrade.get(i));
}
    // Inside the method:
        // Print the students name by using the index variable to index the students array
        // Print a concatenated string of say "Math: " + and the corresponding grade
            // from that ArrayList of grades by index
        // Do this for the next two subjects
        // Total of four output statements

    public static void main(String[] args) {

        // create a new instance of MSGrades class and store in a variable
            // (anything like msGrade8)
        MSGrades msGradeMain = new MSGrades();
        // look up how to print an empty new line
            // for readability
        
        System.out.println("Middle School Roster");
        System.out.println("====================");
        msGradeMain.printStudents();
        // invoke or run the printStudents method on our class instance
        // Print another empty line if desired for readability
        // Use a for loop to loop thru the given teachers array on the class instance
        // inside the loop
            // create a new variable that stores the result of "Teacher: " +
                // teachers name from the array using the counter variable
            // Print the new variable as output
        System.out.println("");
        System.out.println("Teachers: ");
        System.out.println("====================");
        List<String> teachers = new ArrayList<String>();
        for (int i = 0; i < msGradeMain.teachers.length ; i++) {
            teachers.add(msGradeMain.teachers[i].toString());
        }
        for (String teacher: teachers) {
            System.out.println(teacher.toString());
        }

        System.out.println("");
        System.out.println("====================");
        System.out.println("\nStudent Grades:\n");
        for (int i = 0; i < msGradeMain.students.size(); i++) {
            msGradeMain.studentGrade(i);
        }

    }
}
