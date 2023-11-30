package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int roomId;

	    private String roomName;

	    private int capacity;

		public Room() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Room(int roomId, String roomName, int capacity) {
			super();
			this.roomId = roomId;
			this.roomName = roomName;
			this.capacity = capacity;
		}

		public int getRoomId() {
			return roomId;
		}

		public void setRoomId(int roomId) {
			this.roomId = roomId;
		}

		public String getRoomName() {
			return roomName;
		}

		public void setRoomName(String roomName) {
			this.roomName = roomName;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		@Override
		public String toString() {
			return "Room [roomId=" + roomId + ", roomName=" + roomName + ", capacity=" + capacity + "]";
		}

	

	    
	    
	   
	}

	

