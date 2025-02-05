package com.fomihykh.tapChat.repository;

import com.fomihykh.tapChat.model.MessageChat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageChatRepository extends JpaRepository<MessageChat,Long> {
}
