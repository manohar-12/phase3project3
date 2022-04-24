package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class LoginDao {

	@Autowired


	JdbcTemplate template;
	
	// setter method
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public  LoginEntity getByEmail(String email,String password) {
		String sql="select * from register where email=? and password=?";
		LoginEntity entity =(LoginEntity) template.queryForObject(sql,
				BeanPropertyRowMapper.newInstance(LoginEntity.class),email,password);
		return entity;   
		
}
}