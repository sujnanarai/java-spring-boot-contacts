package com.sujnan.contacts.controler;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.sujnan.contacts.contoller.ContactControler;
import com.sujnan.contacts.service.ContactService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ContactControler.class, secure = false)
public class ContactControlerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ContactService contactService;
	
	@Test
	public void exampleTest() throws Exception {
		this.mockMvc.perform(get("/api/v1/contacts")).andExpect(status().isOk());
	}
	

}
