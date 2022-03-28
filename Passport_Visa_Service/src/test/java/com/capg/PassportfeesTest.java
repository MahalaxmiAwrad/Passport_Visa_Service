package com.capg;



import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.capg.Model.Passportfees;
import com.capg.Repository.PassportfeesRepo;
import com.capg.Service.PassportfeesService;

@SpringBootTest
public class PassportfeesTest {
	
	@Autowired
	private PassportfeesService service;
	
	@MockBean
	private PassportfeesRepo repository;
	
	
	public void PassportTest() {
	 Passportfees pf=new Passportfees("IND-1032",3000,"1970-01-01","FPS-3654","Tatkal");
	 when(repository.save(pf)).thenReturn(pf);
	 assertEquals(pf,service.addPassportfees(pf));
	}

}

