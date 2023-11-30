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

import com.model.Room;
import com.service.RoomServiceInterface;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

	@Autowired
	RoomServiceInterface roomService;
	
	    @GetMapping("getAllRooms")
	    public ResponseEntity<List<Room>> getAllRooms() {
	        List<Room> rooms = roomService.getAllRooms();
	        return new ResponseEntity<>(rooms, HttpStatus.OK);
	    }

	    @GetMapping("getRoomById/{roomId}")
	    public ResponseEntity<Room> getRoomById(@PathVariable int roomId) {
	        Room room = roomService.getRoomById(roomId);
	        if (room != null) {
	            return new ResponseEntity<>(room, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @PostMapping("createRoom")
	    public ResponseEntity<Room> createRoom(@RequestBody Room room) {
	        Room createdRoom = roomService.createRoom(room);
	        return new ResponseEntity<>(createdRoom, HttpStatus.CREATED);
	    }

	    @DeleteMapping("deleteRoomById/{roomId}")
	    public ResponseEntity<Void> deleteRoom(@PathVariable int roomId) {
	        roomService.deleteRoomById(roomId);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	}

	
	

