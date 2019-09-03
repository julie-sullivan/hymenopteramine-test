package org.intermine.model.bio;

public interface Polypeptide extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.String getMrnaIdentifier();
    public void setMrnaIdentifier(final java.lang.String mrnaIdentifier);

    public java.lang.String getGeneIdentifier();
    public void setGeneIdentifier(final java.lang.String geneIdentifier);

    public org.intermine.model.bio.MRNA getMrna();
    public void setMrna(final org.intermine.model.bio.MRNA mrna);
    public void proxyMrna(final org.intermine.objectstore.proxy.ProxyReference mrna);
    public org.intermine.model.InterMineObject proxGetMrna();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

}
