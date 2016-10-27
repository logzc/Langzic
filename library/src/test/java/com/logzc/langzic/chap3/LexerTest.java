package com.logzc.langzic.chap3;

import com.logzc.langzic.lexical.Lexer;
import org.junit.Assume;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.net.URL;

/**
 * Created by lishuang on 2016/10/27.
 */
public class LexerTest {

    @Test
    public void test() throws Exception {

        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource("chap3/code.zic");

        Assume.assumeNotNull(url);
        if (url != null) {
            File file = new File(url.getPath());
            Reader reader = new FileReader(file);

            Lexer lexer = new Lexer(reader);
            lexer.test();
        }


    }
}
