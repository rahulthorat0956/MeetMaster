package com.service;

import java.util.List;

import com.model.Chat;

public interface ChatServiceInterface {

		public List<Chat> getAllChats();

	    public List<Chat> getChatsByRoomId(int roomId);

	    public List<Chat> getChatsByUserId(int userId);

	    public Chat getChatById(int chatId);

	    public Chat sendChatMessage(int userId, int roomId, String message);

	    public void deleteChatById(int chatId);

	}

	
	

