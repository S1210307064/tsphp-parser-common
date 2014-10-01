/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.common.test;

import ch.tsphp.parser.common.ANTLRNoCaseStringStream;
import org.antlr.runtime.CharStream;

import java.io.IOException;

public class ANTLRNoCaseStringStreamTest extends ARNoCaseStreamTest
{
    @Override
    protected CharStream createStream(String input) throws IOException {
        return new ANTLRNoCaseStringStream(input);
    }
}
