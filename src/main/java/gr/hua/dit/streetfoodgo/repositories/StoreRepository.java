package gr.hua.dit.streetfoodgo.repositories;

import gr.hua.dit.streetfoodgo.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
}