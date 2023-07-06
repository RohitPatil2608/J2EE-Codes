package com.jspiders.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.quizapp.pojo.QuestionPOJO;
import com.jspiders.quizapp.repository.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	QuestionRepository questionRepository;
	
	public List<QuestionPOJO> getAllQuestions() {
		return questionRepository.findAll();
		
	}
	
	
}
