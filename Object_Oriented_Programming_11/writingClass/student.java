package Abdul_Bari_Java.Object_Oriented_Programming_11.writingClass;

import java.util.Scanner;

class stud {
    public int rollno;
    public String name;
    public String coureseName;
    public int markSubject[] = new int[5];
    int sum;

    public int totalMarks() {
        for (int i = 0; i < markSubject.length; i++) {

            sum += markSubject[i];
        }
        return sum;
    }

    // public int average() {
    //     return (m1 + m2 + m3 + m4 + m5) / 5;
    // }

}

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stud st = new stud();
        st.name = "ABdullah";
        st.coureseName = "BSCS";
        st.rollno = 2205784;

        int marks[] = new int[5];
        System.out.println("Enter the Marks of 5 Subjects: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < marks.length; i++) {
            st.markSubject[i] = marks[i];
        }


        System.out.println(st.totalMarks());

    }

}
