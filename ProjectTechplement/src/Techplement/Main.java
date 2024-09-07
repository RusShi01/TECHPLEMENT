package Techplement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuizManager quizManager = new QuizManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Quiz Generator Menu:");
            System.out.println("1. Create Quiz");
            System.out.println("2. Add Question to Quiz");
            System.out.println("3. Take Quiz");
            System.out.println("4. List Quizzes");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter quiz name: ");
                    String quizName = scanner.nextLine();
                    quizManager.createQuiz(quizName);
                    break;

                case 2:
                    System.out.print("Enter quiz name: ");
                    quizName = scanner.nextLine();
                    quizManager.addQuestionToQuiz(quizName);
                    break;

                case 3:
                    System.out.print("Enter quiz name: ");
                    quizName = scanner.nextLine();
                    quizManager.takeQuiz(quizName);
                    break;

                case 4:
                    quizManager.listQuizzes();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}