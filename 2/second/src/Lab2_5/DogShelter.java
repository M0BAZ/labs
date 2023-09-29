package Lab2_5;

public class DogShelter {
    private Dog[] dogs;
    private int count;

    public DogShelter(int capacity) {
        dogs = new Dog[capacity];
        count = 0;
    }

    public void addDog(Dog dog) {
        if (count < dogs.length) {
            dogs[count] = dog;
            count++;
            System.out.println(dog.getName() + " добавлена в питомник.");
        } else {
            System.out.println("Питомник полон. Невозможно добавить больше собак.");
        }
    }

    public void displayDogs() {
        System.out.println("Список собак в питомнике:");
        for (int i = 0; i < count; i++) {
            System.out.println(dogs[i]);
        }
    }
}
