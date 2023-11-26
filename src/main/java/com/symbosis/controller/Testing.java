package com.symbosis.controller;

import com.symbosis.model.Logins;
import com.symbosis.model.Registers;
import com.symbosis.services.LoginServiceImplementation;
import com.symbosis.services.RegisterserviceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Testing {
	@Autowired
	RegisterserviceImplementation registerService;

	@Autowired
	LoginServiceImplementation loginService;

	//Register
	@PostMapping("/save")
	public Registers saveUser(@RequestBody Registers register)
	{
		return registerService.saveUser(register);
	}


	//login
	@GetMapping("/email")
	public Logins getusingEmail(@PathVariable String email){
		return loginService.userfindByEmail(email);
	}

}
