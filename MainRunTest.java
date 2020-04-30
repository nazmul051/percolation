import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class MainRunTest {
    /*
    static int k=0;
    public MainRunTest(int n){
        k=n;
    }
    public static void main(String[] args) {
        System.out.println(k);
    }

     */
    private static boolean checkReturn(int i){
        StdOut.println(i);
        if(i<5) throw new IllegalArgumentException("rows and columns must be larger than 1");
        else return false;
    }
    public static void main(String[] args) {
        int row = StdIn.readInt();
        //int col = StdIn.readInt();
        boolean a = MainRunTest.checkReturn(row -1);
        //int d = ((row - 1)*4) + col;
        StdOut.println(a);
        //StdOut.println(row - 1);
    }

}
