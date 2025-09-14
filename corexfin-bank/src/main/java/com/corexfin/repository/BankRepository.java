package com.corexfin.repository;

import com.corexfin.model.Bank;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface BankRepository extends JpaRepository<Bank, String> {
	
     @Query("select b from Bank b "+"where lower(replace(b.name,'',''))=lower(replace(:name,'',''))")
     Optional<Bank>findByNameContainingIgnoreCase(@Param("name") String name);

}
