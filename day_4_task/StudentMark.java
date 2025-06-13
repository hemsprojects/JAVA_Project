package day_4_task;

import java.util.Scanner;

class StudentMarks{
    String name;
    int mark1, mark2, mark3;

   
    StudentMarks(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    int getTotalMarks() {
        return mark1 + mark2 + mark3;
    }

    double getAverageMarks() {
        return getTotalMarks() / 3.0;
    }

    String getGrade() {
        double avg = getAverageMarks();
        if (avg >= 35) return "pass";
        else if (avg >= 35) return "A";
        else if (avg >= 35) return "B";
        else if (avg >= 35) return "C";
        else return "Fail";
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average Marks: " + getAverageMarks());
        System.out.println("Grade: " + getGrade());
    }
}

public class StudentMark {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.println("--- Enter Details for Student ---");

            System.out.print("Enter Student Name: ");
            String name = in.nextLine();

            System.out.print("Enter marks for Subject 1: ");
            int mark1 = in.nextInt();

            System.out.print("Enter marks for Subject 2: ");
            int mark2 = in.nextInt();

            System.out.print("Enter marks for Subject 3: ");
            int mark3 = in.nextInt();


            StudentMarks student = new StudentMarks(name, mark1, mark2, mark3);
            student.displayDetails();
           
            in.close();
    }

    }
