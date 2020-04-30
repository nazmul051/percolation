public class NecessaryTests2 {
    public int a;
    private int b;

    public void setData(int a ,int b){
        this.a = a;
        this.b = b;
        this.showData();
    }
    public void showData(){
        System.out.println("Value of A ="+a);
        System.out.println("Value of B ="+b);
    }

}
class NewClass{
    public static void main(String args[]){
        NecessaryTests2 obj = new NecessaryTests2();
        NecessaryTests2 obj2 = new NecessaryTests2();
        obj.setData(7,8);
        obj.a = 6;
        obj2.setData(9,10);
        obj.showData();
    }
}
