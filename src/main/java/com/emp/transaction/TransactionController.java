package com.emp.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.repo.RecieverRepo;
import com.emp.repo.SenderRepo;  

@RestController
public class TransactionController {
	@Autowired
	SenderRepo sr;
	@Autowired
	RecieverRepo rr;
	@Transactional
	@PostMapping("/bharathi")
	public String post(@RequestBody Transaction t) {
		sr.save(t.getS());
		int a=10/0;
		rr.save(t.getR());
		return "saved";
	}

}
