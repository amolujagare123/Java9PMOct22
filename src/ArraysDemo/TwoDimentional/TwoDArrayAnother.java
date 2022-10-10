package ArraysDemo.TwoDimentional;

public class TwoDArrayAnother {

    public static void main(String[] args) {

        int[][] a = {
                {12,13,14} ,
                {22,23,24},
                {32,33,34},
                {42,43,44},
                {52,53,54},
        };

        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
