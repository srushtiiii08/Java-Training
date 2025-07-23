package com.techlabs.EducationalSoftware.test;

import com.techlabs.EducationalSoftware.model.BeforeExam;
import com.techlabs.EducationalSoftware.model.ExamSession;
import com.techlabs.EducationalSoftware.model.IAdmin;
import com.techlabs.EducationalSoftware.model.IExamService;

public class ExamTest {
public static void main(String[] args) {
	
	IAdmin admin = new BeforeExam();
	admin.assignTeacher();
	
	
	ExamSession exam = new ExamSession();
	exam.createQuestionBank();
	exam.examStart();
	exam.gradeExam();
	
	
}
}
