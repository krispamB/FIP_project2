package Quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?", new String[]{"Paris", "London", "Berlin", "Madrid"}, 0));
        questions.add(new Question("Who is the author of 'To Kill a Mockingbird'?", new String[]{"Mark Twain", "John Steinbeck", "Harper Lee", "F. Scott Fitzgerald"}, 2));
        questions.add(new Question("What is the chemical symbol for gold?", new String[]{"Au", "Fe", "Cu", "Ag"}, 3));
        questions.add(new Question("Which planet is known as the Red Planet?", new String[]{"Mars", "Venus", "Jupiter", "Mercury"}, 0));
        questions.add(new Question("Who painted the Mona Lisa?", new String[]{"Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Michelangelo"}, 1));
        questions.add(new Question("In which year did the Titanic sink?", new String[]{"1908", "1920", "1915", "1912"}, 3));
        questions.add(new Question("What is the tallest mammal?", new String[]{"Giraffe", "Elephant", "Blue Whale", "Horse"}, 0));
        questions.add(new Question("What is the smallest planet in our solar system?", new String[]{"Venus", "Mars", "Mercury", "Pluto"}, 2));
        questions.add(new Question("Who wrote the play 'Romeo and Juliet'?", new String[]{"Charles Dickens", "William Shakespeare", "Jane Austen", "George Orwell"}, 1));
        questions.add(new Question("What is the chemical symbol for water?", new String[]{"H2O", "CO2", "O2", "NaCl"}, 0));
        questions.add(new Question("What is the capital of Japan?", new String[]{"Beijing", "Seoul", "Tokyo", "Bangkok"}, 2));
    }

    public Question getRandomQuestion() {
        int index = (int) (Math.random() * questions.size());
        return questions.get(index);
    }
}
