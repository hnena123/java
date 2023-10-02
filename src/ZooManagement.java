public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "Nala";
        lion.age = 4;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();<
        myZoo.name = "The Erie Zoo ";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 20;
        myZoo.animals = new Animal[20];


        Animal dog = new Animal("Doo", "scouby", 2, true);

        System.out.println(myZoo);


    }
}