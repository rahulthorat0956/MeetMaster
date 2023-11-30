package com.service;

import java.util.List;

import com.model.Room;

public interface RoomServiceInterface {

	    public List<Room> getAllRooms();
	    
	    public Room getRoomById(int roomId);
	    
	   public Room createRoom(Room room);
	    
	   public void deleteRoomById(int roomId);

	}

	
