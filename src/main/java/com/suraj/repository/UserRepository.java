package com.suraj.repository;

import com.suraj.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email); // ✅ needed for login
    Optional<User> findByUsername(String username);
}
