package com.wipro.bank.assessment;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import com.wipro.bank.entity.Account;

public class AppTest1 {

	@Before
	public void setUp() throws Exception {
		App.accounts.add(new Account (1,"acc1",101.11));		
		App.accounts.add(new Account (2,"patel",202.22));
		App.accounts.add(new Account (3,"acc3",303.33));
		App.accounts.add(new Account (4,"acc4",404.43));
		App.accounts.add(new Account (5,"acc5",505.55));	
	}

	@Test
	public void testGetAccountDetailsByID1() {
		assertNull(new App().getAccountDetailsByID(567));
	}
	
	@Test
	public void testGetAccountDetailsByID2() {
		Account acc=new App().getAccountDetailsByID(2);
		assertNotNull(acc);
		assertEquals("patel",acc.getName());
	}
	
	}