package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class apptest {
@Autowired
LoginDao logindao;
	@Test
	void validatelogin() {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter email:");
		String s=sc.next();
		Scanner sc1 =new Scanner (System.in);
		System.out.println("Enter password:");
		String s1=sc1.nextLine();
		LoginEntity entity=logindao.getByEmail(s, s1);
assertNotNull(entity);
System.out.println("validation successfull--------------");
sc.close();
sc1.close();
	}

}
