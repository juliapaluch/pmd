/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import org.apache.commons.io.input.CharSequenceReader;

import net.sourceforge.pmd.cpd.internal.JavaCCTokenizer;
import net.sourceforge.pmd.lang.TokenManager;
import net.sourceforge.pmd.lang.jsp.ast.JspTokenManager;
import net.sourceforge.pmd.util.IOUtil;

public class JSPTokenizer extends JavaCCTokenizer {

    @Override
    protected TokenManager getLexerForSource(SourceCode sourceCode) {
        return new JspTokenManager(IOUtil.skipBOM(new CharSequenceReader(sourceCode.getCodeBuffer())));
    }

}
