public class Animal {
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Animal{
    @Override
    public void animalSound() {
        System.out.println("The pig says : wee wee");
    }
}
class Man{
    public static void main(String[] args) {
        Animal animal=new Animal();
        Pig pig1=new Pig();
        Animal pig= new Pig();
        animal.animalSound();
        pig.animalSound();
        pig1.animalSound();
    }
}