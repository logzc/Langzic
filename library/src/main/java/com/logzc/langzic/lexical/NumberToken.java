package com.logzc.langzic.lexical;

/**
 * Created by lishuang on 2016/10/27.
 */
public class NumberToken extends Token {

    private int value;

    protected NumberToken(int line, int value) {
        super(line);

        this.value = value;
    }

    @Override
    public boolean isNumber() {
        return true;
    }

    @Override
    public String getText() {
        return Integer.toString(value);
    }

    @Override
    public int getNumber() {
        return value;
    }
}
