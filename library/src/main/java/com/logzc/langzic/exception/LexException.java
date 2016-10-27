package com.logzc.langzic.exception;

import com.logzc.langzic.lexical.Token;

/**
 * Created by lishuang on 2016/10/27.
 */
public class LexException extends Exception {


    public LexException(Token token) {
        this("", token);
    }

    public LexException(String message, Token token) {
        super("syntax error around " + location(token) + ". " + message);
    }

    public static String location(Token token) {
        if (token == Token.EOF) {
            return "the last line";
        } else {
            return "\"" + token.getText() + "\" at line " + token.getLineNumber();
        }
    }

    public LexException(Exception e) {
        super(e);
    }

    public LexException(String message) {
        super(message);
    }
}
