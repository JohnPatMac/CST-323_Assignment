package com.gcu.cst323.testapp.repository;

import com.gcu.cst323.testapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

