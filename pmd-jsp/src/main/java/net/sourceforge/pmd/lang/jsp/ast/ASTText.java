/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTText.java */

package net.sourceforge.pmd.lang.jsp.ast;

public class ASTText extends AbstractJspNode {
    public ASTText(int id) {
        super(id);
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(JspParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
