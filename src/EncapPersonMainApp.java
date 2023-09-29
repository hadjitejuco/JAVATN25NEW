
public class EncapPersonMainApp {
    public static void main(String[] args) {
        
        EncapPerson person = new EncapPerson("Hadji",20);
        System.out.println(person);
        
        person.setAge(200);
        System.out.println(person);
        
        person.setAge(25);
        System.out.println(person);
    }
}
