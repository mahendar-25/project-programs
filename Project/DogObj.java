package assitedproject;

public class DogObj 
{  
    String name; 
    String breed; 
    int age; 
    String color; 
    public DogObj(String name, String breed, int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
        DogObj strom = new DogObj("Strom","papillon", 8, " BlackWhite"); 
        System.out.println(strom.toString()); 
    } 
}

