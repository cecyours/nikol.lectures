public class CH06_P02_DogClass {
    public static void main(String[] args) {

            Dog d1 = new Dog("Pugiee", 1, "Vodaphone wala kutta");
            d1.getData();
  

            Dog d2 = new Dog("Nommie", 2, "unknown");
            d2.getData();
        }
}

class Dog{ // stamp

    private String name;
    private int age;
    private String breed;

    public Dog() // constructor..
    {
        System.out.println("default  dog.."+this);
    }

    public Dog(String name,int age,String breed)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void getData()
    {
        System.out.println(" name : "+name);
        System.out.println("  age : "+age);
        System.out.println("breed : "+breed);
    }
}
