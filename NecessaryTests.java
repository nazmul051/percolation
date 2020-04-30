import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

import java.util.Arrays;

public class NecessaryTests {

    public static void main(String[] args) {
/*
        StdOut.print("please input number");
        int a = StdIn.readInt();
        //StdOut.print("please input another number");
        int b = StdIn.readInt();
        StdOut.print(a+b);


        int[] a = StdIn.readAllInts();

        StdOut.print(a[0] + a[1]);

        int c = StdRandom.uniform(0, 9);
        StdOut.print(c);



        double[] arrayOfP = new double[20];
        for(int i=0;i<20;i++){
            arrayOfP[i] = i;
        }
        double resultM = StdStats.mean(arrayOfP);
        double resultS = StdStats.stddev(arrayOfP);
        StdOut.print(resultM + "  " + resultS);
        */
        StdOut.print("Please enter two ints separated by space: ");
        int a = StdIn.readInt();
        boolean[] state = new boolean[10];
        boolean[] newState = new boolean[10];
        //state = false;
        state[5] = true;
        for(int i=0; i<10; i++){
            StdOut.print(state[i]);
            StdOut.print(a);
        }
        for(int i=0; i<10; i++){
            StdOut.print(newState[i]);
        }


      //MainRunTest myvar = new MainRunTest(4);
    }
}
