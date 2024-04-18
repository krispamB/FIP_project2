package Quiz;

public class Question {
    private final String questionText;
    private final String[] options;
    private final int correctAnswerIndex;

    public Question(String questionText, String[] options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionText() {
        return this.questionText;
    }

    public String[] getOptions() {
        return this.options;
    }

    public int getCorrectAnswerIndex() {
        return this.correctAnswerIndex;
    }
}
