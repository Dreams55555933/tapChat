package com.fomihykh.tapChat.service;

import com.fomihykh.tapChat.model.MessageChat;
import com.fomihykh.tapChat.repository.MessageChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MessageChatService {
    @Autowired
    private MessageChatRepository messageChatRepository;

    public List<MessageChat>getAllMessageChat(){
        return messageChatRepository.findAll();
    }
    public Optional<MessageChat> getMessageChatById(Long id){
        return messageChatRepository.findById(id);
    }
    public MessageChat createMessageChat(MessageChat messageChat){
        return messageChatRepository.save(messageChat);
    }
    public MessageChat updateMessageChat(Long id,MessageChat messageChatDetail){
        MessageChat messageChat = messageChatRepository.findById(id).orElse(null);
        if (messageChat!=null){
            messageChat.setMessageChat(messageChatDetail.getMessageChat());
            messageChat.setUserId(messageChatDetail.getUserId());
            return messageChatRepository.save(messageChat);
        }
        return null;
    }
    public void deleteMessageChat(Long id){
        messageChatRepository.deleteById(id);
    }
}
