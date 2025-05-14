package antonBurshteyn.SpringAI.exception;

public class EmptyQuestionException extends RuntimeException {

    public EmptyQuestionException() {
        super("Question cannot be empty");
    }
}