import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_FilterExample {
    public static void main(String[] args) {

        List<product> list = new ArrayList<product>();
        for (product p : getproducts()) {
            if(p.getPrice()>25000){
                list.add(p);
            }
        }
        for (product p: list) {
            System.out.println(p);
        }

        //using stream API
         getproducts().stream().filter((product)->product.getPrice()>25000f).forEach(System.out::println);

    }
    private static List<product> getproducts(){
        List<product> listProducts = new ArrayList<product>();
        listProducts.add(new product(1, "HP LAPTOP",20000f));
        listProducts.add(new product(2, "DELL LAPTOP", 35000f));
        listProducts.add(new product(3, "ACER LAPTOP", 58499f));
        listProducts.add(new product(4, "LENOVO LAPTOP", 50000f));
        listProducts.add(new product(5, "APPLE LAPTOP", 78488f));
        return listProducts;
    }
}
class product{
    private int id;
    private String name;
    private float price;
    public product(int id, String name, float price){
        this.id=id;
        this.name=name;
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }public void setPrice(float price){
        this.price=price;
    }
    public float getPrice(){
        return price;
    }
    public String toString(){
        return "product [id="+id+", name ="+ name +" , price ="+ price +"]";
    }
}
