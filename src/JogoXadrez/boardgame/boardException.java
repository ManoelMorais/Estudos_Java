package JogoXadrez.boardgame;

import java.io.Serial;

public class boardException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public boardException(String message) {
        super(message);
    }
}
