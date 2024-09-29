
public class Test {
   
    public static void main(String[] args) {
        byte a = 23;
        String s = "sumit";
        s= String.valueOf(a);
        System.out.println(s);
        Calculator cal = new Calculator();
        cal.add(a);
    }
}
class Calculator{
   public int a=1;
    public int add(int ta) {
        System.out.println("gdshj"+ta);
        
        return 0;
    }
};
