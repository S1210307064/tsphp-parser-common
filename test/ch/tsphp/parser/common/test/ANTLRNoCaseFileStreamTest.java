/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.common.test;

import ch.tsphp.parser.common.ANTLRNoCaseFileStream;
import ch.tsphp.parser.common.ANTLRNoCaseInputStream;
import org.antlr.runtime.CharStream;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ANTLRNoCaseFileStreamTest extends  ARNoCaseStreamTest
{
    @Rule
    public TemporaryFolder folder= new TemporaryFolder();

    @Override
    protected CharStream createStream(String input) throws IOException {
        File file = folder.newFile("dummy.tsphp");
        FileWriter writer = new FileWriter(file);
        writer.write(input);
        writer.close();
        return new ANTLRNoCaseFileStream(file.getPath());
    }
}
