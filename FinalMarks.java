import java.util.*;
import cie.*;
import see.*;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Personal p[] = new Personal[n];
        Internals in[] = new Internals[n];
        External ex[] = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            int internalMarks[] = new int[5];
            System.out.println("Enter 5 Internal Marks:");
            for (int j = 0; j < 5; j++)
                internalMarks[j] = sc.nextInt();
    
             int seeMarks[] = new int[5];
            System.out.println("Enter 5 SEE Marks:");
            for (int j = 0; j < 5; j++)
                seeMarks[j] = sc.nextInt();

            p[i] = new Personal(usn, name, sem);
            in[i] = new Internals(internalMarks);
            ex[i] = new External(usn, name, sem, seeMarks);
        }

        System.out.println("\n----- FINAL MARKS OF STUDENTS -----");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("USN: " + p[i].usn);
            System.out.println("Name: " + p[i].name);
            System.out.println("Semester: " + p[i].sem);

            System.out.println("Final Marks in 5 Courses:");
            for (int j = 0; j < 5; j++) {
                int finalMarks = in[i].internalMarks[j] + ex[i].seeMarks[j];
                System.out.println("Course " + (j + 1) + ": " + finalMarks);
            }
        }

        sc.close();
    }
}
