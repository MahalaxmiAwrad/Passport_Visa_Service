package com.capg.Repository;


import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.Model.Passportfees;

@Repository
public interface PassportfeesRepo extends JpaRepository<Passportfees,Integer>{
	

}



