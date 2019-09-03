package org.intermine.model.bio;

public interface ProteinDomainRegion extends org.intermine.model.InterMineObject
{
    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public java.lang.Integer getStart();
    public void setStart(final java.lang.Integer start);

    public java.lang.String getDatabase();
    public void setDatabase(final java.lang.String database);

    public java.lang.Integer getEnd();
    public void setEnd(final java.lang.Integer end);

    public org.intermine.model.bio.Protein getProtein();
    public void setProtein(final org.intermine.model.bio.Protein protein);
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein);
    public org.intermine.model.InterMineObject proxGetProtein();

    public org.intermine.model.bio.ProteinDomain getProteinDomain();
    public void setProteinDomain(final org.intermine.model.bio.ProteinDomain proteinDomain);
    public void proxyProteinDomain(final org.intermine.objectstore.proxy.ProxyReference proteinDomain);
    public org.intermine.model.InterMineObject proxGetProteinDomain();

}
