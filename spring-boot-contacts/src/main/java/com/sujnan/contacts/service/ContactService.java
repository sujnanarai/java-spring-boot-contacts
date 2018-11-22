package com.sujnan.contacts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sujnan.contacts.domain.Contact;

@Service
public class ContactService {
	
	private List<Contact> contactList = new ArrayList<Contact>();
	public ContactService() {
		Contact c1 = new Contact("1", "Sujnana", "Rai", "123456789");
		contactList.add(c1);
	}
	
	public List<Contact> getAllContacts () {
		return contactList;
	}

}
