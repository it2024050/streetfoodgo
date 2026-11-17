package gr.hua.dit.streetfoodgo.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime orderDate;
    private String status; // π.χ. PENDING, PREPARING, DELIVERED

    // Σχέση: Κάθε παραγγελία ανήκει σε ΕΝΑΝ πελάτη
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Σχέση: Κάθε παραγγελία γίνεται σε ΕΝΑ κατάστημα
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    // Σχέση: Μια παραγγελία μπορεί να έχει ΠΟΛΛΑ προϊόντα (φαγητά)
    @ManyToMany
    @JoinTable(
            name = "order_products",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;

    // Βασικός Constructor που βάζει αυτόματα την τωρινή ώρα
    public Order() {
        this.orderDate = LocalDateTime.now();
    }

    // Getters και Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Store getStore() { return store; }
    public void setStore(Store store) { this.store = store; }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }
}