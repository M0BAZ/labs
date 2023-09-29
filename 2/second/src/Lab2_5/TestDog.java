package Lab2_5;

public class TestDog {
    public static void main(String[] args) {
        DogShelter shelter = new DogShelter(3);

        Dog Baron = new Dog("Барон", 3);
        Dog Max = new Dog("Макс", 5);
        Dog Rex = new Dog("Рекс", 2);

        shelter.addDog(Baron);
        shelter.addDog(Max);
        shelter.addDog(Rex);

        shelter.displayDogs();
    }
}
