import java.util.Optional;

public class Optional_Class {
    public static void main(String[] args) {
        String email=null;

        // Optional<Object> emptyOptional = Optional.empty();
        // System.out.println(emptyOptional);

        // Optional<String> emailOptional = Optional.of(email);
        // System.out.println(emailOptional);

        // Optional<String> stringOptional = Optional.ofNullable(email);
        // System.out.println(stringOptional);

        Optional<String> stringOptional = Optional.ofNullable(email);
        // String defaultOptional = stringOptional.orElse("dhfsdskfjafkfeu");
        // System.out.println(defaultOptional);

        // String defaultOptional2 = stringOptional.orElseGet(()->"jp");
        // System.out.println(defaultOptional2);

        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        } else {
            System.out.println("no value present");
        }
    }
}
