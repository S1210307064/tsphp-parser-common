/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.common.test;

import ch.tsphp.parser.common.ANTLRNoCaseInputStream;
import org.antlr.runtime.CharStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ANTLRNoCaseInputStreamWithInitialAndReadBufferSizeIncludingEncodingTest extends ARNoCaseStreamTest
{
    @Override
    protected CharStream createStream(String input) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        return new ANTLRNoCaseInputStream(inputStream,30,20,StandardCharsets.UTF_8.name());
    }
}
