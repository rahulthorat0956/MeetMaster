package com.service;

import java.util.List;

import com.model.Invitation;
import com.model.User;

public interface InvitationServiceInterface {

	public Invitation createInvitaion(Invitation invitation);
	
	public List<Invitation> allInvitation(List<Invitation> list);
	
	public Invitation getInvitationById(int invitationId);
	
	public List<Invitation> getAllInvitation();
	
	public void deleteInvitation(int invitationId);
	
	public Invitation updateInvitation(Invitation invitation);

	
}
