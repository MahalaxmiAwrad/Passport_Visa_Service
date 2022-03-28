package com.capg.Service;

import org.springframework.stereotype.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import com.capg.Model.Passportfees;
import com.capg.Repository.PassportfeesRepo;

@Service
public class PassportfeesService {
	@Autowired
	PassportfeesRepo repo;

	public Passportfees addPassportfees(Passportfees ps) {

		String no = ps.getTEMPORARY_NO();
		String s2 = no.substring(4, no.length());
		int num = Integer.parseInt(s2);
		int maxNum = num + 1;
		String n1 = String.valueOf(maxNum);

		String n2 = String.valueOf(ps.getTEMPORARY_NO());
		String ss = "IND-" + n1;
		ps.setPASSPORT_NO(ss);
		Date dateTime = ps.getPAYMENT_DATE();

		if (ps.getTYPE_OF_SERVICE().equalsIgnoreCase("Normal")) {
			ps.setAMOUNT(2500);
		} else if (ps.getTYPE_OF_SERVICE().equalsIgnoreCase("Tatkal")) {
			ps.setAMOUNT(3000);

		}

		return repo.save(ps);

	}

}
