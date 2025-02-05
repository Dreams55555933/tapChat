package com.fomihykh.tapChat.controller;

import com.fomihykh.tapChat.model.MessageChat;
import com.fomihykh.tapChat.repository.MessageChatRepository;
import com.fomihykh.tapChat.service.MessageChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/message")
public class MessageChatController {

    @Autowired
    private MessageChatService messageChatService;

    @GetMapping
    public List<MessageChat> getAllMessageChat(){
        return messageChatService.getAllMessageChat();
    }
    @GetMapping("/{id}")
    public Optional<MessageChat> getMessageChat(@PathVariable Long id){
        return messageChatService.getMessageChatById(id);
    }
    @PostMapping
    public MessageChat createMessageChat(@RequestBody MessageChat messageChat){
        return messageChatService.createMessageChat(messageChat);
    }
    @PutMapping("/{id}")
    public MessageChat updateMessageChat(@PathVariable Long id,@RequestBody MessageChat messageChat){
        return messageChatService.updateMessageChat(id,messageChat);
    }
    @DeleteMapping("/{id}")
    public void deleteMessageChat(@PathVariable Long id){
        messageChatService.deleteMessageChat(id);
    }

}
