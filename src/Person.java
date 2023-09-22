/*
    PERSON

    -name: String
    -age: int

    +Person(String name, int age)
    +String getName()
    +setName(String name)
    +getAge()
    +setAge(int age)
*/
public class Person {
    //Attributes
    private String name;
    private int age;
    
    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //getter for name
    public String getName(){
        return name;
    }
    //setter for name
    public void setName(String name){
        this.name = name;
    }
    
    //getter for age
    public int getAge(){
        return age;
    }
    
    //setter for age
    public void setAge(int age){
        if (age >=0)
            this.age = age;
    }
    
}
