package javaBasics;

public class PercentageMarks {

    public static void main(String[] args) {

        int maths = 110; // out of 150
        int science = 120;// out of 150
        int ss = 100;// out of 150
        int english = 70; // out of 100
        int hindi = 75; // out of 100

        double percentage ;

         double additionSubjectMarks;
         double totalMArks = 650;

        additionSubjectMarks = maths + science + ss + hindi + english;

        percentage = (additionSubjectMarks / totalMArks ) * 100 ;

        System.out.println("percentage = "+percentage);



    }
}
