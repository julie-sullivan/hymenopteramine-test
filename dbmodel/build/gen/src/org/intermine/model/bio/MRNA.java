package org.intermine.model.bio;

public interface MRNA extends org.intermine.model.bio.Transcript
{
    public java.util.Set<org.intermine.model.bio.Polypeptide> getPolypeptide();
    public void setPolypeptide(final java.util.Set<org.intermine.model.bio.Polypeptide> polypeptide);
    public void addPolypeptide(final org.intermine.model.bio.Polypeptide arg);

}
