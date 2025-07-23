package com.techlabs.test;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.techlabs.model.IExamEvaluator;
import com.techlabs.model.OnlineQuiz;
import com.techlabs.model.PracticalExam;
import com.techlabs.model.TheoryExam;

public class ExamEvaluatorTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	IExamEvaluator[] exams = { new TheoryExam(), new PracticalExam(), new OnlineQuiz() };

	while (true) {
        try {
            System.out.println("\n==== Exam Evaluation System ====");
            for (int i = 0; i < exams.length; i++) {
                System.out.println((i + 1) + ". " + exams[i].getExamType());
            }
            System.out.println("0. Exit");

            int choice = -1;
            while (choice < 0 || choice > exams.length) {
                System.out.print("Select exam type (0 to exit): ");
                try {
                    choice = sc.nextInt();
                    if (choice < 0 || choice > exams.length) {
                        System.out.println("Please enter a valid option.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Enter a number.");
                    sc.next(); // clear invalid input
                }
            }

            if (choice == 0) {
                System.out.println("Exiting Exam System.");
                break;
            }

            IExamEvaluator selected = exams[choice - 1];

            double marks = -1;
            while (marks < 0 || marks > 100) {
                System.out.print("Enter marks (0–100): ");
                try {
                    marks = sc.nextDouble();
                    if (marks < 0 || marks > 100) {
                        System.out.println("Marks must be between 0 and 100.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid number.");
                    sc.next(); // clear invalid input
                }
            }

            try {
                selected.evaluateMarks(marks);
                selected.calculateGrade();
            } catch (Exception e) {
                System.out.println("Error during evaluation: " + e.getMessage());
            }

            sc.nextLine(); // clear buffer
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
            sc.nextLine(); // clear buffer
        }
    }

    sc.close();
}
}
