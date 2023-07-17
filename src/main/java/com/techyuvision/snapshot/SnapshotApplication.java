package com.techyuvision.snapshot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnapshotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnapshotApplication.class, args);
		System.out.println("Hello World..");
		List<String> argList = new ArrayList<>();
		argList.add("String A");
		argList.add("String B");
		argList.add("String C");
		for (String str : argList) {
			System.out.println(str);
		}
		System.out.println("Length of List: "+ argList.size()+2);
	}
}
