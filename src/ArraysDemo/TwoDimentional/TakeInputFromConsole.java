package ArraysDemo.TwoDimentional;

import java.util.Scanner;

public class TakeInputFromConsole {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row=");
        int row = sc.nextInt();
        System.out.println("Enter col=");
        int col = sc.nextInt();

        int[][] a = new int[row][col]; //


        for (int i=0;i<a.length;i++)
        {
           for (int j=0;j<a[0].length;j++)
           {
               System.out.println("Enter a["+i+"]["+j+"]");
               a[i][j] = sc.nextInt();
           }
        }


     /*   a[0][0] = 12;
        a[0][1] = 13;
        a[0][2] = 14;

        a[1][0] = 22;
        a[1][1] = 23;
        a[1][2] = 24;

        a[2][0] = 32;
        a[2][1] = 33;
        a[2][2] = 34;

        a[3][0] = 42;
        a[3][1] = 43;
        a[3][2] = 44;

        a[4][0] = 52;
        a[4][1] = 53;
        a[4][2] = 54;*/




        System.out.println("row="+a.length); // 5
        System.out.println("col="+a[0].length); // 3


        for (int i=0;i<a.length;i++) // rows
        {
            for (int j=0;j<a[0].length;j++) // cols
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
