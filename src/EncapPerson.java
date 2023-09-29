
public class EncapPerson {
   
    //private varibles
    private String name;
    private int age;
    
    public EncapPerson(String name, int age){
        this.name = name;
        setAge(age);
    }
    
    //getters
    public String getName(){
        return name;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
   
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        if (isValidAge(age)){
            this.age = age;
        }else{
            System.out.println("invalid age");
        }
    }
    
    private boolean isValidAge(int age){
        return age >= 0 && age <=100;
    }
    
    @Override
    public String toString(){
        return "Name: "+ name + " Age: "+age;
    }
    
    
}
