public class NecessaryTests4 {
    public int a = 5;
    public double confidence(){
        double x = 12.5;
        double s = 3.4;
        double t = this.a;
        System.out.println(t);
        double theConfidenceHi = x + ((1.96*s)/Math.sqrt(t));
        return theConfidenceHi;
    }
    public static void main(String[] args) {
        NecessaryTests4 myTest = new NecessaryTests4();
        double g = myTest.confidence();
        System.out.println("The answer is " + g);

        int z = 10;
        double h = Math.sqrt(z);
        System.out.println("Second result is: " + h);
    }
}
