package org.intermine.model.bio;

public interface Chromosome extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.String getTertiaryIdentifier();
    public void setTertiaryIdentifier(final java.lang.String tertiaryIdentifier);

    public java.lang.String getAssembly();
    public void setAssembly(final java.lang.String assembly);

}
