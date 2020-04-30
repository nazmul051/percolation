import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class NecessaryTests3 {
    public static void main(String[] args) {
        /*
        int a = 5;
        double score = (double) a/(2*2);
        StdOut.println("The score is: " + score);
        */
         //<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>
        int t = 0;
        for(int i=1; i<= 100; i++){
            int r = StdRandom.uniform(0,10);

            StdOut.println(r + " ");
            if(r==9 || r==1 || r==5 || r==3){
                StdOut.println("Found it>>>>>>>>>");
            }
            if(r==0) t+=1;

        }
        StdOut.println("The number of zeros= " + t);
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>
         /*
        double[] a = new double[4]; //{1.0, 2.5, 3.5, 5.7};
        a[0] = 1; a[1] = 4.5; a[2] = 9.67; a[3] = 7.8;
        //for(int i=0; i<4; i++){
          //  StdOut.println(a[i]);
        //}
        double b = StdStats.mean(a);
        StdOut.println(b);
        */
    }
}
