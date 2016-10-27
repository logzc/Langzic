package com.logzc.langzic.lexical;

import com.logzc.langzic.exception.ZicException;

/**
 * Created by lishuang on 2016/10/27.
 */
public abstract class Token {

    //End Of File
    public static final Token EOF = new Token(-1) {
    };
    public static final String EOL = "\\n";

    private int lineNumber;

    protected Token(int line) {
        this.lineNumber = line;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public boolean isIdentifier() {
        return false;
    }

    public boolean isNumber() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public int getNumber() {
        throw new ZicException("No a number token");
    }

    public String getText() {
        return "";
    }
}
