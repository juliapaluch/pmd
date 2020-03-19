/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.jsp.ast;

public final class ASTDoctypeExternalId extends AbstractJspNode {

    /**
     * URI of the external entity. Cannot be null.
     */
    private String uri;

    /**
     * Public ID of the external entity. This is optional.
     */
    private String publicId;

    ASTDoctypeExternalId(int id) {
        super(id);
    }

    public boolean isHasPublicId() {
        return null != publicId;
    }

    public String getUri() {
        return uri;
    }

    void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * @return Returns the publicId (or an empty string if there is none for
     *         this external entity id).
     */
    public String getPublicId() {
        return null == publicId ? "" : publicId;
    }

    void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    @Override
    public Object jjtAccept(JspParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
