package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Meeting;
import com.repository.MeetingRepository;

@Service
public class MeetingServiceImplementation implements MeetingServiceInterface {

	@Autowired
	MeetingRepository meetRepo;

	@Override
	public Meeting createMeeting(Meeting meeting) {
		return meetRepo.save(meeting);
	}

	@Override
	public List<Meeting> getAllMeetings() {
		return meetRepo.findAll();
	}

	@Override
	public Meeting getMeetingById(Integer id) {
		return meetRepo.findById(id).orElse(null);
	}

	@Override
	public void deleteMeetingById(Integer id) {
		 meetRepo.deleteById(id);
	}
	
	
	
	
}
