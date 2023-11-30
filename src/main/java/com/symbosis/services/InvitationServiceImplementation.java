package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Invitation;
import com.repository.InvitationRepository;

@Service
public class InvitationServiceImplementation implements InvitationServiceInterface {

	@Autowired
	InvitationRepository inviRepo;
	
	@Override
	public Invitation createInvitaion(Invitation invitation) {
		return inviRepo.save(invitation);
	}

	@Override
	public List<Invitation> allInvitation(List<Invitation> list) {
		return inviRepo.saveAll(list);
	}

	@Override
	public Invitation getInvitationById(int id) {
		return inviRepo.findById(id).orElse(null);
	}

	@Override
	public List<Invitation> getAllInvitation() {
		return inviRepo.findAll();
	}

	@Override
	public void deleteInvitation(int invitationId) {
		inviRepo.deleteById(invitationId);;		
	}

	
	@Override
	public Invitation updateInvitation(Invitation invitation) {
		Invitation existInvitation=inviRepo.findById(invitation.getId()).orElse(null);
		existInvitation.setMeeting(invitation.getMeeting());
		return existInvitation;
	}

	

	

	
	
}
