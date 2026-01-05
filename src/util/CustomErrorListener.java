package util;

import org.antlr.v4.runtime.*;
import java.util.*;

public class CustomErrorListener extends BaseErrorListener {
    private boolean hasErrors = false;
    private List<String> errorMessages = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
            int line, int charPositionInLine, String msg,
            RecognitionException e) {
        hasErrors = true;
        String error = String.format("Error línea %d:%d - %s", line, charPositionInLine, msg);
        errorMessages.add(error);
        System.err.println(error);
    }

    public boolean hasErrors() {
        return hasErrors;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }
}
