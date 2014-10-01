/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.common.test;

import org.antlr.runtime.CharStream;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public abstract class ARNoCaseStreamTest
{
    @Test
    public void LA_IsLowerCase_ReturnsTokenInLowerCase() throws IOException {
        String input = "a";

        CharStream stream = createStream(input);
        int token = stream.LA(1);

        assertThat(token, is(Character.codePointAt(new char[]{'a'}, 0)));
    }

    @Test
    public void LA_IsUpperCase_ReturnsTokenInLowerCase() throws IOException {
        String input = "A";

        CharStream stream = createStream(input);
        int token = stream.LA(1);

        assertThat(token, is(Character.codePointAt(new char[]{'a'}, 0)));
    }

    @Test
    public void LA_NextTokenIsEOF_ReturnsEOF() throws IOException {
        String input = "";

        CharStream stream = createStream(input);
        int token = stream.LA(1);

        assertThat(token, is(CharStream.EOF));
    }

    @Test
    public void LA_NextTokenIs0_ReturnsEOF() throws IOException {
        String input = String.valueOf(Character.toChars(0));

        CharStream stream = createStream(input);
        int token = stream.LA(1);

        assertThat(token, is(0));
    }

    abstract protected CharStream createStream(String input) throws IOException;
}
