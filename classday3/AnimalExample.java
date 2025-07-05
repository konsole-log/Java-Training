package classday3;
class Animal{
    String name,species;
    int age,size;
    Animal(String name,String species,int age,int size){
        this.name=name;
        this.species=species;
        this.age=age;
        this.size=size;
    }
    public void displayInfo(){
        System.out.println("Name: "+name+"\nSpecies: "+species+"\nAge: "+age+"\nSize: "+size+"Kg");
    }
}
class wildAnimal extends Animal{
    String habitat;
    wildAnimal(String name,String species, int age,int size,String habitat){
        super(name,species,age,size);
        this.habitat=habitat;
    }
    public void displayInfo(){
        System.out.println("Wild Info");
        super.displayInfo();
        System.out.println("Habitat: "+habitat);
    }
}
class domesticAnimal extends Animal{
    String owner;
    domesticAnimal(String name, String species,int age,int size,String owner){
        super(name,species,age,size);
        this.owner=owner;
    }
    public void displayInfo(){
        System.out.println("Domestic Info");
        super.displayInfo();
        System.out.println("Owner: "+owner);
    }
}
public class AnimalExample{
    public static void main(String[] args) {
        wildAnimal w=new wildAnimal("lion", "mammal", 20, 50, "jungle");
        domesticAnimal d=new domesticAnimal("dog", "mammal", 10, 20, "Anush");
        w.displayInfo();
        d.displayInfo();
    }
}