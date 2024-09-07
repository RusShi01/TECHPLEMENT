package Techplement;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private String quizName;
    private ArrayList<String> questions = new ArrayList<>();
    private ArrayList<ArrayList<String>> options = new ArrayList<>();
    private ArrayList<Integer> correctAnswers = new ArrayList<>();

    public Quiz(String quizName) {
        this.quizName = quizName;
    }

    public void addQuestion(String question, ArrayList<String> optionsList, int correctAnswerIndex) {
        questions.add(question);
        options.add(optionsList);
        correctAnswers.add(correctAnswerIndex);
    }

    public void takeQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Q" + (i + 1) + ": " + questions.get(i));
            ArrayList<String> currentOptions = options.get(i);
            for (int j = 0; j < currentOptions.size(); j++) {
                System.out.println((j + 1) + ". " + currentOptions.get(j));
            }

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer - 1 == correctAnswers.get(i)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + (correctAnswers.get(i) + 1));
            }
            System.out.println();
        }

        System.out.println("You scored: " + score + "/" + questions.size());
    }

    public String getQuizName() {
        return quizName;
    }
}