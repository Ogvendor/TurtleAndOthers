import javax.swing.*;
import java.util.ArrayList;

public class StudentGrade {
    private static int oneTotal;
    private static int twoTotal;
    private static int threeTotal;
    private static int oneAverage;
    private static int twoAverage;
    private static int threeAverage;
    private static int onePosition;
    private static int twoPosition;
    private static int threePosition;



    private static String highest;
    private static String lowest;
    private static double highestScore;
    private static double lowestScore;

    static ArrayList<Integer> student1 = new ArrayList<>();
    static ArrayList<Integer> student2 = new ArrayList<>();
    static ArrayList<Integer> student3 = new ArrayList<>();

    public static void main(String[] args){
         gradesTable();

    }
    public static void gradesTable(){
        for(int studOne=0;studOne<3;studOne++){
            int stud1 = Integer.parseInt(JOptionPane.showInputDialog("Enter StudentOne Grade:  "));
            student1.add(stud1);
        }
        for(int studTwo=0;studTwo<3;studTwo++){
            int stud2 = Integer.parseInt(JOptionPane.showInputDialog("Enter StudentTwo Grade: "));
            student2.add(stud2);
        }
        for(int studThree=0;studThree<3;studThree++){
            int stud3 = Integer.parseInt(JOptionPane.showInputDialog("Enter StudentThree Grade: "));
            student3.add(stud3);
        }
       studentTotals();
    }
    public static void studentTotals(){
        for(int x: student1){
            oneTotal += x;
        }
        for(int y : student2){
            twoTotal += y;
        }
        for(int z: student3){
            twoTotal += z;
        }
    studentAverage();
    }
    public static void studentAverage(){
        if(oneTotal>0){
            oneAverage = oneTotal / 3;
        }
        if(twoTotal>0){
            twoAverage = twoTotal / 3;
        }
        if(threeTotal>0){
            threeAverage = threeTotal / 3;
        }
        studentPosition();
    }
    public static void studentPosition() {
        if (oneAverage > twoAverage && oneAverage > threeAverage)
            onePosition = 1;
        else if (oneAverage > twoAverage && oneAverage < threeAverage) {
            onePosition = 2;
        }
        else if(oneAverage > threeAverage && oneAverage < twoAverage ){
            onePosition = 2;
        }
        else{
            onePosition = 3;
        }

        if(twoAverage > oneAverage && twoAverage > threeAverage){
            twoPosition = 1;
        }
        else if(twoAverage > oneAverage && twoAverage < threeAverage){
            twoPosition = 2;
        }
        else if(twoAverage > threeAverage && twoAverage < oneAverage){
            twoPosition = 2;
        }
        else{
            twoPosition = 3;
        }

        if(threeAverage > oneAverage && threeAverage > twoAverage){
            threePosition = 1;
        }
        else if(threeAverage > oneAverage && threeAverage < twoAverage){
            threePosition = 2;
        }
        else if(threeAverage > twoAverage && threeAverage < oneAverage){
            threePosition = 2;
        }
        else{
            threePosition = 3;
        }
        minMaxScore();
        }
    public static void minMaxScore(){
        highestScore = Math.max(oneAverage,Math.max(twoAverage,threeAverage));
            if(highestScore == oneAverage){
                highest = "StudentOne";
            }
            else if(highestScore == twoAverage){
                highest = "StudentTwo";
            }
            else if(highestScore == threeAverage){
                highest = "StudentThree";
            }

            lowestScore = Math.min(oneAverage,Math.min(twoAverage,threeAverage));
              if(lowestScore == oneAverage){
                  lowest = "StudentOne";
              }
              else if(lowestScore == twoAverage){
                  lowest = "StudentTwo";
              }
              else if(lowestScore == threeAverage){
                  lowest = "StudentThree";
              }
              printResult();
    }
    public static void printResult(){
        System.out.println("Student   " +                              "SUB1   SUB2   SUB3    TOTAL   AVERAGE   POSITION");
        System.out.println("Student 1"+ "     "+   student1 +  "      "+           oneTotal + "          "+ oneAverage +"      "+ onePosition + "\n" +
                           "Student 2"+ "     "+  student2  +  "      "+      twoTotal  +"            "+ twoAverage +"      "+ twoPosition + "\n" +
                           "Student 3"+ "     "+   student3 +  "      "+      threeTotal +"          "+ threeAverage+"       "+ threePosition+ "\n");
        System.out.println("Highest Scoring Student is: "+ highest + "Scoring "+ highestScore + "\n" +
                           "Lowest Scoring Student is: "+ lowest  + "Scoring "+ lowestScore );

    }


}
