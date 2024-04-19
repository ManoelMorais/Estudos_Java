package JogoXadrez.Chess;

import java.io.Serial;

public class ChessExceptions extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ChessExceptions(String message) {
        super(message);
    }
}
