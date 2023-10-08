package tn.esprit.gestionzoo.entities;

public class Zoo
{

    static final int number_of_cages = 25;
    Animal[] animals;
    String name, City;
    int nbrAnimals;

    public Zoo() {

    }

    public Zoo(String name1, String City1) {
        animals = new Animal[number_of_cages];
        this.name = name1;
        this.City = City1;
    }



    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }



    void DisplayZoo() {
        System.out.println("Le nom : " + name + ", La cité : " + City + "nbr des cages : " + number_of_cages + "nbr des animaux : " + nbrAnimals);
    }

    int searchAnimal(Animal animal1) {
        int i = -1;
        for (int j = 0; j < nbrAnimals; j++) {
            if (animals[j].name == animal1.name)
                return j;
        }

        return i;

    }

    boolean addAnimal(Animal animal2) {
        //1er cas : animal trouvé pas d'ajout
        if (searchAnimal(animal2) != -1)
            return false;
    }


    boolean removeAnimal(Animal animal)
    {
        boolean b=false
        int Test = searchAnimal(animal);

        if (Test == -1){
            b= false;
            animals[nbrAnimals] = null;
            nbrAnimals--;

            b= true;

        }
        return b;
    }

    void ListAnimal()
    {
        System.out.println("Liste d'animaux  "+name+ ":");
        for (int i=0; i<nbrAnimals ; i++)
            System.out.println(animals[i]);
    }

    @Override
    public String toString()
    {
        return "Nom : "+name+ "City :"+City+ "nbr cages : "+ number_of_cages +"nbr animaux :" + nbrAnimals;
    }


}public class Zoo
{
    //Déclaration des attributs
    static final int number_of_cages = 25; //hedha 3ibara compteur du tableau animals
    Animal[] animals;
    String name, City;
    int nbrAnimals; //compteur d'animaux pour l'ajout fel instruction 10

    //Constructeur par défaut qui initialise tout à 0

    public Zoo() {

    }

    //Constructeur parametré qui affecte des valeurs aux champs

    public Zoo(String name1, String City1) {
        animals = new Animal[number_of_cages];
        this.name = name1;
        this.City = City1;
    }


    //instruction 16
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

//instruction 8
    //Puisque affichage donc void

    void DisplayZoo() {
        System.out.println("Le nom : " + name + ", La cité : " + City + "nbr des cages : " + number_of_cages + "nbr des animaux : " + nbrAnimals);
    }


    //9bal l'ajout lezem une fonction recherche pour savoir si
    // on peut ajouter ou non et pour ça lezemna nekhdmou instruction 11 9bal instruction 10
//instruction 11
    int searchAnimal(Animal animal1) {
        int i = -1;
        for (int j = 0; j < nbrAnimals; j++) {
            if (animals[j].name == animal1.name)
                return j;
        }

        return i;

    }

    //instruction 10
//tawa nemchiw lel ajout

    boolean addAnimal(Animal animal2) {
        //1er cas : animal trouvé pas d'ajout
        if (searchAnimal(animal2) != -1)
            return false;

//2ème cas : Zoo complet donc pas d'ajout
        if (nbrAnimals == number_of_cages)
            return false;

        //3ème cas : animal non trouvé et il ya encore des places dans le zoo
        if (searchAnimal(animal2) == -1)
            animals[nbrAnimals] = animal2;
        nbrAnimals++;
        return true;

    }

    //instruction 13 : suppression animal
    boolean removeAnimal(Animal animal)
    {
        boolean b=false;
        //Avant de supprimer l'animal on doit d'abord le chercher
        int Test = searchAnimal(animal);

        //1er cas : Si animal non trouvé alors pas de suppression
        if (Test == -1)
            b= false;

        //2ème cas : animal trouvé donc on effectue la suppression
        if (Test != -1)
        {
            //on a 3 étapes de suppression :
            //étape 1 : on parcoure le tableau à partir de l'indice de l'animal 7ata
            // lel ekher et on écrase l'animal qu'on veut supprimer
            for (int i = Test; i < nbrAnimals; i++)
            {
                animals[i] = animals[i + 1];
            }

            //étape 2 : on fait vider la dernière case
            animals[nbrAnimals] = null;

            //étape 3 : on décremente le compteur d'animaux
            nbrAnimals--;

            b= true;

        }
        return b;
    }

    void ListAnimal()
    {
        System.out.println("Liste d'animaux  "+name+ ":");
        for (int i=0; i<nbrAnimals ; i++)
            System.out.println(animals[i]);
    }

    //instruction 15 : vérifier si le zoo est plein en focntion du
    // nbr d'animaux et du nbr de cages

    //boolean isZooFull()
    //{

    //}

    @Override
    public String toString()
    {
        return "Nom : "+name+ "City :"+City+ "nbr cages : "+ number_of_cages +"nbr animaux :" + nbrAnimals;
    }


}
