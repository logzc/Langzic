package com.logzc.langzic.lexical;

import com.logzc.langzic.exception.LexException;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;

/**
 * Created by lishuang on 2016/10/27.
 */
public class Lexer {


    private LineNumberReader reader;

    private boolean hasMore = true;

    public Lexer(Reader reader) {

        this.reader = new LineNumberReader(reader);

    }

    public void test() throws LexException {
        while (hasMore){
            this.readLine();
        }
    }

    private void readLine() throws LexException {

        String line = null;

        try {
            line = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
            throw new LexException(e);
        }

        if (line == null) {
            hasMore = false;
            return;
        }

        int lineNo = reader.getLineNumber();

        System.out.println(lineNo + ":" + line);

    }


}
