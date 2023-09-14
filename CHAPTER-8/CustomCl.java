class Employee{
    int id;
    String name;
    int salary;
    public void get_details(){
        System.out.println("The Employee ID is "+id);
        System.out.println("The Employee NAME is "+name);
    }

}
        public class CustomCl{
    public static void main(String[] args) {
        System.out.println("The first custom class");
        Employee varsha = new Employee();
        varsha.id = 101;
        varsha.name="Kumaresh varsha";
        varsha.salary=60000;                      
    }
}
