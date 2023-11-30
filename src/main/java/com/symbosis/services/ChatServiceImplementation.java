package com.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Chat;
import com.model.Room;
import com.model.User;
import com.repository.ChatRepository;
import com.repository.RoomRepository;
import com.repository.UserRepository;

@Service
public class ChatServiceImplementation implements ChatServiceInterface {

	@Autowired
	ChatRepository chatRepo;
	RoomRepository RoomRepo;
	UserRepository userRepo;

	
	@Override
	public List<Chat> getAllChats() {
		// TODO Auto-generated method stub
		return chatRepo.findAll();
	}

	@Override
	public List<Chat> getChatsByRoomId(int roomId) {
		// TODO Auto-generated method stub
		return chatRepo.getRoomById(roomId);
	}

//	@Override
//	public List<Chat> getChatsByUserId(int userId) {
//		// TODO Auto-generated method stub
//		return chatRepo.findBySenderId(userId);
//	}

	@Override
	public Chat getChatById(int chatId) {
		// TODO Auto-generated method stub
		return chatRepo.findById(chatId).orElse(null);
	}

	@Override
	public Chat sendChatMessage(int userId, int roomId, String message) {

		User user=userRepo.findById(userId).orElse(null);
		Room room=RoomRepo.findById(roomId).orElse(null);
		
		if(user!=null && room!=null)
		{
			Chat chat=new Chat();
			chat.setSender(user);
			chat.setRoom(room);
			chat.setMessage(message);
			chat.setTimestamp(LocalDateTime.now());
			return chatRepo.save(chat);
		}
		
		return null;
	}

	@Override
	public void deleteChatById(int chatId) {
		chatRepo.deleteById(chatId);		
	}

}
