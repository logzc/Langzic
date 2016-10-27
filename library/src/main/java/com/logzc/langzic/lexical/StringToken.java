package com.logzc.langzic.lexical;

/**
 * Created by lishuang on 2016/10/27.
 */
public class StringToken extends Token {

    private String literal;

    public StringToken(int line, String str) {
        super(line);

        literal = str;
    }

    @Override
    public boolean isString() {
        return true;
    }

    @Override
    public String getText() {
        return literal;
    }
}
