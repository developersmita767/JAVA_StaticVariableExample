public class TestStaticVariable{
    static int staticVar=10;
    int  nonStaticVar=20;
    public static void main(String[] ar){
       // System.out.println("Static var="+staticVar);
       System.out.println("Non Static var="+nonStaticVar);//compilation error
    }
    void m1(){
        System.out.println("Static var="+staticVar);
         System.out.println("Non Static var="+nonStaticVar);
    }
}