package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Meeting;

@Repository//http request is maintained in repository
public interface MeetingRepository extends JpaRepository<Meeting,Integer >{


}
