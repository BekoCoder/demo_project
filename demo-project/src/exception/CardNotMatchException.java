package exception;

public class CardNotMatchException extends RuntimeException{
    public CardNotMatchException(String message) {
        super(message);
    }
}
