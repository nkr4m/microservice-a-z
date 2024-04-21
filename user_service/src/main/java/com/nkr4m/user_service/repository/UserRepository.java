package com.nkr4m.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nkr4m.user_service.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query(value = "SELECT * FROM user u WHERE u.user_id = :id", nativeQuery = true)
	User findByUserId(@Param("id") Integer id);
	
	@Query(value = "DELETE FROM user u WHERE u.user_id = :id", nativeQuery = true)
	User deleteUserId(@Param("id") Integer id);

}
