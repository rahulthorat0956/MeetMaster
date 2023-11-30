package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Chat;
import com.service.ChatServiceInterface;

@RestController
@RequestMapping("/api/chats")
public class ChatController {

	@Autowired
	ChatServiceInterface chatService;
	
	@GetMapping("getAllChats")
	public ResponseEntity<List<Chat>>  getAllChats() {
		List<Chat> chats=chatService.getAllChats();
		return new ResponseEntity<>(chats,HttpStatus.OK);
	}
	
	@GetMapping("getChatsByRoomId/{roomId}")
	public ResponseEntity<List<Chat>>  getChatsByRoomId(@PathVariable int roomId) {
		List<Chat> chats=chatService.getChatsByRoomId(roomId);
		return new ResponseEntity<>(chats, HttpStatus.OK);
	}
	
	@GetMapping("getChatsByRoomId/{userId}")
	public ResponseEntity<List<Chat>>  getChatsByUserId(@PathVariable int userId) {
		List<Chat> chats=chatService.getChatsByUserId(userId);
		return new ResponseEntity<>(chats,HttpStatus.OK);
	
	}
	
	@GetMapping("getChatsByRoomId/{chatId}")
	public  ResponseEntity<Chat>  getChatById(@PathVariable int chatId) {
		Chat chats=chatService.getChatById(chatId);
		return new ResponseEntity<>(chats,HttpStatus.OK);
	
	}
	
	@PostMapping("sendChatMessage")
	public ResponseEntity<Chat> sendChatMessage(@RequestBody int userId, int roomId, String message) {

		Chat sentChats=chatService.sendChatMessage(userId, roomId, message);

		if(sentChats!=null)
		{
			return new ResponseEntity<>(sentChats, HttpStatus.ACCEPTED);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	@DeleteMapping("deleteChatById/{chatId}")
	public  ResponseEntity<Void> deleteChatById(@PathVariable int chatId) {
		chatService.deleteChatById(chatId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
