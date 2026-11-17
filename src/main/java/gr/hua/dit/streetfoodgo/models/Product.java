package gr.hua.dit.streetfoodgo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;

    // Σχέση: Πολλά προϊόντα ανήκουν σε ένα Κατάστημα
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    // Βασικός Constructor
    public Product() {}

    // Getters και Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Store getStore() { return store; }
    public void setStore(Store store) { this.store = store; }
}