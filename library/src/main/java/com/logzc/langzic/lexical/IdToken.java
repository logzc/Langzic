package com.logzc.langzic.lexical;

/**
 * Created by lishuang on 2016/10/27.
 */
public class IdToken extends Token {

    private String text;

    protected IdToken(int line, String id) {


        super(line);
        this.text = id;
    }

    @Override
    public boolean isIdentifier() {
        return true;
    }

    public String getText() {
        return text;
    }
}
