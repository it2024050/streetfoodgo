package gr.hua.dit.streetfoodgo.repositories;

import gr.hua.dit.streetfoodgo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}