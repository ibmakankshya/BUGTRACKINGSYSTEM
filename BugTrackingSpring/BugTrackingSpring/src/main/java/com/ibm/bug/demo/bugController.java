package com.ibm.bug.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class bugController {
	@PostMapping("/bug")
	String createBug() {

		return "Bug is Created";
	}

	@GetMapping("/bug")
	String getBug() {
		return "Found the bug";
	}

	@PutMapping("/bug/{id}")
	String updateBug(@PathVariable("id") int bugID) {
		System.out.println(bugID);
		return " Bug status updated";
	}

	@DeleteMapping("/bug/{id}")
	String deletedOrder(@PathVariable("id") int bugID) {
		System.out.println(bugID);
		return " Bug deleted";
	}

}