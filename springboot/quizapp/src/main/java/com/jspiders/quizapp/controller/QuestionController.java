package com.jspiders.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.quizapp.pojo.QuestionPOJO;
import com.jspiders.quizapp.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@GetMapping("/allQuestions")
	public List<QuestionPOJO> getAllQuestions() {
		return questionService.getAllQuestions();
	}

}
