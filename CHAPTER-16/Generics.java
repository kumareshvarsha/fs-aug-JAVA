class MyGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2){
        this.val=val;
        this.t1=t1;
        this.t2=t2;
    }
    public void setval(int val){
        this.val=val;
    }
    public int getval(){
        return val;
    }
    public void setT1(T1 t1){
        this.t1=t1;
    }
    public T1 getT1(){
        return t1;
    }
    public void setT2(T2 t2){
        this.t2=t2;
    }
    public T2 getT2(){
        return t2;
    }
}

public class Generics{
    public static void main(String[] args) {
        MyGeneric<String, Integer> g= new MyGeneric(3,4,"varsha");
        String s=g.getT2();
        Integer a= g.getval();
        System.out.println(s+a);
       
        
    }
}