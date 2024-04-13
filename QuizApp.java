import Quiz.*;

import java.util.Scanner;
public class QuizApp {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Scanner scanner = new Scanner(System.in);
        int numberOfQuestions = 0;

        System.out.print("How many questions would you like to answer? (Max 10): ");
        numberOfQuestions = scanner.nextInt();

        if(numberOfQuestions > 10) System.out.println("Limit Exceeded");

        int score = 0;
        for (int i = 0; i < numberOfQuestions; i++) {
            Question question = quiz.getRandomQuestion();
            System.out.println(question.getQuestionText());
            for (int j = 0; j < question.getOptions().length; j++) {
                System.out.println((j + 1) + ". " + question.getOptions()[j]);
            }
            System.out.print("Answer: ");
            int userAnswer = scanner.nextInt();
            if (userAnswer - 1 == question.getCorrectAnswerIndex()) {
                score++;
            }
        }

        System.out.println("Your score is: " + score);

    }
}
