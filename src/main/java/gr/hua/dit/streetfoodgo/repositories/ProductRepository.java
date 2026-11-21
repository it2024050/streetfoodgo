package gr.hua.dit.streetfoodgo.repositories;

import gr.hua.dit.streetfoodgo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
