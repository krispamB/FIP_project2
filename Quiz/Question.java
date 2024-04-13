package Quiz;

public class Question {
    private String questionText;
    private String[] options;
    private int correctAnswerIndex;

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
