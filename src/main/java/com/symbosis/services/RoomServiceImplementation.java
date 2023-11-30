package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Room;
import com.repository.RoomRepository;

@Service
public class RoomServiceImplementation implements RoomServiceInterface {

	@Autowired
	RoomRepository RoomRepo;

	@Override
	public List<Room> getAllRooms() {
		// TODO Auto-generated method stub
		return RoomRepo.findAll();
	}

	@Override
	public Room getRoomById(int roomId) {
		// TODO Auto-generated method stub
		return RoomRepo.findById(roomId).orElse(null);
	}

	@Override
	public Room createRoom(Room room) {
		// TODO Auto-generated method stub
		return RoomRepo.save(room);
	}

	@Override
	public void deleteRoomById(int roomId) {
		// TODO Auto-generated method stub
		RoomRepo.deleteById(roomId);
	}

	
	



}
