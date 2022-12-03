package com.ben.daikichiroutes.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//  DAIKICHI ROUTES PRACTICE ASSIGNMENT
//  // 1. Annotation
//  @RequestMapping("/daikichi")
//  // 3. Method that maps to the request route above
//  public String welcomeMessage() {
//  	return "Welcome!";
//  }
//  
//  @RequestMapping("/daikichi/today")
//  public String today() {
//  	return "Today you will find luck in all your endeavors!";
//  }
  
//  DAIKICHI PATH VARIABLE CORE ASSIGNMENT
  
  @RequestMapping("/daikichi/travel/{location}")
  public String travelLocation(
		  @PathVariable("location") String locationName){
  	return "Congratulations! You will soon travel to " + locationName + ".";
  }
  
  @RequestMapping("/daikichi/lotto/{number}")
  public String lottoNumber(
		  @PathVariable("number") int number) {
	  if (number % 2 == 0) {
		  return "You will take a grand journey in the future.";
	  }
	  else
		  return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
  }
}
