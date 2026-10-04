package halima.idouaksim.billingservice.entities;

import jakarta.persistence.*;

@Entity
public class ProductItem {
    @Id @GeneratedValue
    private Long id;
    private long productId;
    private int quantity;
    private double price;
    @ManyToOne
    private Bill bill;

}