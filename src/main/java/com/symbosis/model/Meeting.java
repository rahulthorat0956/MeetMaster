package com.model;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Meeting {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int meetingId;

	    private String title;
	    private String description;

	    @Temporal(TemporalType.TIMESTAMP)
	    private Date dateTime;

	    private int duration; // Duration in minutes

	    private String location;

	    // Other fields, getters, and setters

	    
		public Meeting() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Meeting(int meetingId, String title, String description, Date dateTime, int duration, String location) {
			super();
			this.meetingId = meetingId;
			this.title = title;
			this.description = description;
			this.dateTime = dateTime;
			this.duration = duration;
			this.location = location;
		}

		public int getMeetingId() {
			return meetingId;
		}

		public void setMeetingId(int meetingId) {
			this.meetingId = meetingId;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Date getDateTime() {
			return dateTime;
		}

		public void setDateTime(Date dateTime) {
			this.dateTime = dateTime;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		@Override
		public String toString() {
			return "Meeting [meetingId=" + meetingId + ", title=" + title + ", description=" + description
					+ ", dateTime=" + dateTime + ", duration=" + duration + ", location=" + location + "]";
		}


	    
		

	   
	}

	
	

