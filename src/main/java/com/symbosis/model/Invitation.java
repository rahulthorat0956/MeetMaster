package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Invitation {

	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int invitationId;

	    @ManyToOne
	    @JoinColumn(name = "meeting_id")
	    private Meeting meeting;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

	    @Enumerated(EnumType.STRING)
	    private InvitationStatus status;

	    @Temporal(TemporalType.TIMESTAMP)
	    private Date sentDateTime;

	    // Constructors, getters, and setters

	    public Invitation() {
	    }

	    public Invitation(Meeting meeting, User user, InvitationStatus status) {
	        this.meeting = meeting;
	        this.user = user;
	        this.status = status;
	        this.sentDateTime = new Date();
	    }

	    public int getId() {
	        return invitationId;
	    }

	    public void setId(int invitationId) {
	        this.invitationId = invitationId;
	    }

	    public Meeting getMeeting() {
	        return meeting;
	    }

	    public void setMeeting(Meeting meeting) {
	        this.meeting = meeting;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

	    public InvitationStatus getStatus() {
	        return status;
	    }

	    public void setStatus(InvitationStatus status) {
	        this.status = status;
	    }

	    public Date getSentDateTime() {
	        return sentDateTime;
	    }

	    public void setSentDateTime(Date sentDateTime) {
	        this.sentDateTime = sentDateTime;
	    }
	}

	
	
	

