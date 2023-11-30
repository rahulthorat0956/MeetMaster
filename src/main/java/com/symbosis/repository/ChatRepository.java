package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Integer>{

	
	List<Chat> getRoomById(int roomId);


    //List<Chat> findBySenderId(int senderId);

}
