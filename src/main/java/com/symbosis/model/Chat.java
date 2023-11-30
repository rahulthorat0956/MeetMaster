package com.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chats")
public class Chat {

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int chatId;

	    private String message;

	    @ManyToOne
	    @JoinColumn(name = "userId")
	    private User sender;

	    @ManyToOne
	    @JoinColumn(name = "roomId")
	    private Room room;

	    private LocalDateTime timestamp;

		public Chat() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Chat(int chatId, String message, User sender, Room room, LocalDateTime timestamp) {
			super();
			this.chatId = chatId;
			this.message = message;
			this.sender = sender;
			this.room = room;
			this.timestamp = timestamp;
		}

		public int getChatId() {
			return chatId;
		}

		public void setChatId(int chatId) {
			this.chatId = chatId;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public User getSender() {
			return sender;
		}

		public void setSender(User sender) {
			this.sender = sender;
		}

		public Room getRoom() {
			return room;
		}

		public void setRoom(Room room) {
			this.room = room;
		}

		public LocalDateTime getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(LocalDateTime timestamp) {
			this.timestamp = timestamp;
		}

		@Override
		public String toString() {
			return "Chat [chatId=" + chatId + ", message=" + message + ", sender=" + sender + ", room=" + room
					+ ", timestamp=" + timestamp + "]";
		}

		
	    
	    
	}


