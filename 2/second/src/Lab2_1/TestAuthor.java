package Lab2_1;


import Lab2_1.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author Kuprin = new Author("Vasily", "kuprin777@gmail.com", 'm');

        System.out.println(Kuprin.getName() + " " + Kuprin.getEmail() + " " + Kuprin.getGender());

        Kuprin.setName("Petr");
        Kuprin.setEmail("petr777@gmail.com");
        Kuprin.setGender('m');

        System.out.println(Kuprin);
    }
}
