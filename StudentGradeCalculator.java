import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of subjects: ");
        int n = sc.nextInt(), total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Marks for Subject " + i + ": ");
            int mark = sc.nextInt();
            total += mark;
        }

        double avg = (double) total / n;
        String grade = (avg >= 90) ? "A+" : (avg >= 80) ? "A" : (avg >= 70) ? "B" :
                       (avg >= 60) ? "C" : (avg >= 50) ? "D" : "F";

        System.out.printf("Total: %d\n, Average: %.2f%%\n, Grade: %s\n", total, avg, grade);
        sc.close();
    }
}