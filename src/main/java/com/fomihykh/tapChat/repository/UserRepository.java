package com.fomihykh.tapChat.repository;

import com.fomihykh.tapChat.model.UserChat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserChat,Long> {
}
