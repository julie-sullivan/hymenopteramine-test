package org.intermine.model.bio;

public interface GOEvidenceCode extends org.intermine.model.InterMineObject
{
    public java.lang.String getSource();
    public void setSource(final java.lang.String source);

    public java.lang.String getCode();
    public void setCode(final java.lang.String code);

    public org.intermine.model.bio.ECOTerm getEvidenceOntology();
    public void setEvidenceOntology(final org.intermine.model.bio.ECOTerm evidenceOntology);
    public void proxyEvidenceOntology(final org.intermine.objectstore.proxy.ProxyReference evidenceOntology);
    public org.intermine.model.InterMineObject proxGetEvidenceOntology();

}
