package Techplement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizManager {
    private HashMap<String, Quiz> quizzes = new HashMap<>();

    public void createQuiz(String quizName) {
        if (!quizzes.containsKey(quizName)) {
            quizzes.put(quizName, new Quiz(quizName));
            System.out.println("Quiz '" + quizName + "' created successfully.");
        } else {
            System.out.println("Quiz '" + quizName + "' already exists.");
        }
    }

    public void addQuestionToQuiz(String quizName) {
        if (!quizzes.containsKey(quizName)) {
            System.out.println("Quiz not found!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        Quiz quiz = quizzes.get(quizName);

        System.out.print("Enter question: ");
        String question = scanner.nextLine();

        ArrayList<String> options = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter option " + (i + 1) + ": ");
            options.add(scanner.nextLine());
        }

        System.out.print("Enter the index of the correct answer (1-4): ");
        int correctAnswerIndex = scanner.nextInt() - 1;

        quiz.addQuestion(question, options, correctAnswerIndex);
        System.out.println("Question added successfully.");
    }

    public void takeQuiz(String quizName) {
        if (!quizzes.containsKey(quizName)) {
            System.out.println("Quiz not found!");
            return;
        }

        quizzes.get(quizName).takeQuiz();
    }

    public void listQuizzes() {
        if (quizzes.isEmpty()) {
            System.out.println("No quizzes available.");
        } else {
            System.out.println("Available quizzes:");
            for (String quizName : quizzes.keySet()) {
                System.out.println("- " + quizName);
            }
        }
    }
}