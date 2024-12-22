package com.app.notekeeper.repository;

import com.app.notekeeper.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
