package com.service;

import java.util.List;

import com.model.Meeting;

public interface MeetingServiceInterface {

		public Meeting createMeeting(Meeting meeting);

		public List<Meeting> getAllMeetings();

		public Meeting getMeetingById(Integer id);


		public void deleteMeetingById(Integer id);
	
	
	
}
