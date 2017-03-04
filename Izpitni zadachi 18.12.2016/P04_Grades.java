import java.util.Scanner;

/**
 * Created by todor on 4.03.2017 г..
 */
public class P04_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int studentsCount = Integer.parseInt(scan.nextLine());
        int topGradesCount = 0; // 5.00 - 6.00
        int veryGoodGradesCount = 0; // 4.00 - 4.99
        int goodGradesCount = 0; // 3.00 - 3.99
        int failGradesCount = 0; // 2.00 - 2.99
        double averageGrade = 0;
    
        for (int i = 0; i < studentsCount; i++) {
            double currantGrade = Double.parseDouble(scan.nextLine());
            
            if (5 <=currantGrade && currantGrade <= 6){
                averageGrade += currantGrade;
                topGradesCount++;
                continue;
            }
            if (4 <=currantGrade && currantGrade < 5){
                averageGrade += currantGrade;
                veryGoodGradesCount++;
                continue;
            }
            if (3 <=currantGrade && currantGrade < 4){
                averageGrade += currantGrade;
                goodGradesCount++;
                continue;
            }
            if (2 <=currantGrade && currantGrade < 3){
                averageGrade += currantGrade;
                failGradesCount++;
            }
        }
        
        averageGrade /= studentsCount;
    
        System.out.printf("Top students: %.2f%%%n", gradePercentage(topGradesCount, studentsCount));
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", gradePercentage(veryGoodGradesCount, studentsCount));
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", gradePercentage(goodGradesCount, studentsCount));
        System.out.printf("Fail: %.2f%%%n", gradePercentage(failGradesCount, studentsCount));
        System.out.printf("Average: %.2f", averageGrade);
        
    }
    
    static double gradePercentage (int gradesCount, int totalGradesCount){
        return gradesCount * 100.0 / totalGradesCount;
    }
}
