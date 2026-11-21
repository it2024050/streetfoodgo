package gr.hua.dit.streetfoodgo.repositories;

import gr.hua.dit.streetfoodgo.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}