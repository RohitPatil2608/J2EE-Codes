package com.jspiders.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspiders.quizapp.pojo.QuestionPOJO;

public interface QuestionRepository extends JpaRepository<QuestionPOJO, Integer>{

}
