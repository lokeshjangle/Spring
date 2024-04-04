/* Polymorphism: same name of function being used for many form */
class Animal{
    public void animalSound(){
        System.out.println("The sound of animal is:");
    }
}
class Cat extends Animal{
   public void animalSound(){
       System.out.println("The sound of cat is: meow meow");
   }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The sound of dog is: bhao bhao");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();

        /* animalSound() are single function but used do multiple work*/
    }
}
