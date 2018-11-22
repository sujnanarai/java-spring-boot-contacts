package com.sujnan.contacts.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujnan.contacts.domain.Contact;
import com.sujnan.contacts.service.ContactService;

@RestController
@RequestMapping ("/api/v1")
public class ContactControler {
	
	@Autowired
	public ContactService contactService;
	
	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public ResponseEntity<List<Contact>> listAllUsers() {
		List<Contact> contacts = contactService.getAllContacts();
		return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
	}

}
