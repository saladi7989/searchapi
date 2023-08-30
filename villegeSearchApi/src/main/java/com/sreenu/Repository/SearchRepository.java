package com.sreenu.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sreenu.Controler.SearchController;
import com.sreenu.Entity.SearchEntity;

@Repository
public interface SearchRepository extends JpaRepository<SearchEntity, Integer> {

	@Query(value = "select * from search s where s.id=?1 or s.name=?2 or s.country=?3 or s.state=?4 or s.district=?5 or s.mandal=?6 or s.villeage=?7,", nativeQuery = true)

	public void search(String name);
	
	

}
