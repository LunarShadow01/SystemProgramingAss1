// Name: איליי בנזינו  ID: 326476827
// Name: ______  ID: ______
package part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentReport {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department file name: ");
        String deptFile = sc.nextLine().trim();
        System.out.print("Enter course file name: ");
        String courseFile = sc.nextLine().trim();
        sc.close();

        try (BufferedReader dept = new BufferedReader(new FileReader(deptFile));
             BufferedReader course = new BufferedReader(new FileReader(courseFile));
             PrintWriter report = new PrintWriter(new FileWriter("report.txt"))) {

            // Only one line from each file is held in memory at any time
            String deptLine = nextLine(dept);
            String courseLine = nextLine(course);

            // Both files are sorted by ID, so we advance whichever side has the smaller ID
            while (deptLine != null && courseLine != null) {
                String[] d = deptLine.split("\\s+");   // first, last, id
                String[] c = courseLine.split("\\s+"); // id, grade1, grade2

                int deptId = Integer.parseInt(d[2]);
                int courseId = Integer.parseInt(c[0]);

                if (deptId < courseId) {
                    // Student in department but not registered to the course
                    deptLine = nextLine(dept);
                } else if (deptId > courseId) {
                    // Student in course but from another department
                    courseLine = nextLine(course);
                } else {
                    int avg = (Integer.parseInt(c[1]) + Integer.parseInt(c[2])) / 2;
                    report.println(deptId + " " + d[0] + " " + d[1] + " " + avg);
                    deptLine = nextLine(dept);
                    courseLine = nextLine(course);
                }
            }

            System.out.println("Report written to report.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading/writing files: " + e.getMessage());
        }
    }

    // Returns the next non-empty line (trimmed), or null at end of file
    private static String nextLine(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (!line.isEmpty()) {
                return line;
            }
        }
        return null;
    }
}
