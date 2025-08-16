package com.codewithajay.fullstackbackend.repository;

import com.codewithajay.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User ,Long> {
}
