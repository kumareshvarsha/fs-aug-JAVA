class myEmployee{
    private int id;
    private String name;
    private int salary;
    public myEmployee(int myid, String myname, int mysalary ){
        // id=101;
        // name="varsha";
        id=myid;
        name=myname;
        salary=mysalary;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
    public void setSalary(int s){
        salary=s;
    }
    public int getSalary(){
        return salary;
    }
}
public class Construct{
    public static void main(String[] args) {
        myEmployee em=new myEmployee(1000,"kumaresh varsha",60000);
        // em.setName("sony");        
        // em.setId(100);
        System.out.println(em.getName());
        System.out.println(em.getId());
        System.out.println(em.getSalary());
    }
}
