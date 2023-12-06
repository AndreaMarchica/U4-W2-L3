package entities;

import java.time.LocalDate;
import java.util.List;

public class Order {
    /*ATTRIBUTI*/
    long id;
    String status;
    LocalDate orderDate;
    LocalDate deliveryDate;
    List<Product> products;
    Customer customer;

    /*COSTRUTTORI*/
    /*METODI*/
}
