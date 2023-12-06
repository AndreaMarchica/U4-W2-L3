import entities.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = generateBooks(5); // Genera una lista di 5 libri
        productList = generateBaby(5); // Genera una lista di 5 bambini
        System.out.println(Arrays.toString(productList.toArray()));
    }
    /*GENERATE BOOKS*/
    public static List<Product> generateBooks(int numberOfBooks) {
        List<Product> allProducts = new ArrayList<>();

        for (int i = 0; i < numberOfBooks; i++) {
            String name = generateRandomNameBook();
            Product book = new Product(name, "Book");
            allProducts.add(book);
        }

        return allProducts;
    }

    public static String generateRandomNameBook() {
        // Logica per generare un nome casuale, puoi implementarla secondo le tue esigenze
        return "Book" + (int) (Math.random() * 1000);
    }

    /*GENERATE BABY*/
    public static List<Product> generateBaby(int numberOfBaby) {
        List<Product> allProducts = new ArrayList<>();

        for (int i = 0; i < numberOfBaby; i++) {
            String name = generateRandomNameBaby();
            Product baby = new Product(name, "Baby");
            allProducts.add(baby);
        }

        return allProducts;
    }

    public static String generateRandomNameBaby() {
        // Logica per generare un nome casuale, puoi implementarla secondo le tue esigenze
        return "Baby" + (int) (Math.random() * 1000);
    }

    /*GENERATE BOYS*/
    public static List<Product> generateBoy(int numberOfBoys) {
        List<Product> allProducts = new ArrayList<>();

        for (int i = 0; i < numberOfBoys; i++) {
            String name = generateRandomNameBoy();
            Product boy = new Product(name, "Boy");
            allProducts.add(boy);
        }

        return allProducts;
    }

    public static String generateRandomNameBoy() {
        // Logica per generare un nome casuale, puoi implementarla secondo le tue esigenze
        return "Boy" + (int) (Math.random() * 1000);
    }
}
