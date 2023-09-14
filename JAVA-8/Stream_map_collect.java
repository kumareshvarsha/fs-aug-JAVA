import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream_map_collect{
    public static void main(String[] args) {
        List<User> users =new ArrayList<User>();
        users.add(new User(1, "varsha", "v", "v@gmail.com"));
        users.add(new User(2, "sony", "s", "s@gmail.com"));
        users.add(new User(3, "jp", "jp", "jp@gmail.com"));

        List<UserDTO> usersDTO = new ArrayList<UserDTO>();
        for (User user : users) {
            usersDTO.add(new UserDTO(user.getId(),user.getUsername(),user.getEmail()));
        }
        for (UserDTO dto: usersDTO) {
            System.out.println(dto);
        }

        //using stream().map() and lambda 
        users.stream().map((User user)-> new UserDTO(user.getId(),user.getUsername(),user.getEmail())).forEach((userDTO)->{System.out.println(userDTO);});

        //using collect
        users.stream().map((User user)-> new UserDTO(user.getId(),user.getUsername(),user.getEmail())).collect(Collectors.toList());
        usersDTO.forEach(System.out::println);
    }
}

class UserDTO{
    private int id;
    private String username;
    private String email;

    public UserDTO(int id, String username, String email){
        super();
        this.id=id;
        this.username=username;
        this.email=email;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }
    public void setEmain(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    public String toString(){
        return "User [id="+id+",username="+username+",email="+email+"]";
    }
}

class User{
    private int id;
    private String username;
    private String password;
    private String email;

    public User (int id, String username, String password, String email){
        super();
        this.id=id;
        this.username=username;
        this.password=password;
        this.email=email;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setEmain(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    public String toString(){
        return "User [id="+id+",username="+username+",password="+password+",email="+email+"]";
    }
}