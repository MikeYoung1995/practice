package design_pattern;

public class Singletion {
    private static final Singletion singletion =new Singletion();
    private Singletion(){}
    //通过该方法获得实例对象
    public static Singletion getSingletion(){
                return singletion;
    }
    //类中其他方法，尽量是 static
     public static void doSomething(){
     }

     public static void main(){
         System.out.println();
         System.gc();
     }
}
