package org.intermine.model.bio;

public interface Consequence extends org.intermine.model.InterMineObject
{
    public java.lang.String getCdnaPosition();
    public void setCdnaPosition(final java.lang.String cdnaPosition);

    public java.lang.String getAlternateCodon();
    public void setAlternateCodon(final java.lang.String alternateCodon);

    public java.lang.String getProteinIdentifier();
    public void setProteinIdentifier(final java.lang.String proteinIdentifier);

    public java.lang.String getRsId();
    public void setRsId(final java.lang.String rsId);

    public java.lang.String getCdsPosition();
    public void setCdsPosition(final java.lang.String cdsPosition);

    public java.lang.String getReferenceResidue();
    public void setReferenceResidue(final java.lang.String referenceResidue);

    public java.lang.String getAminoAcidPosition();
    public void setAminoAcidPosition(final java.lang.String aminoAcidPosition);

    public java.lang.String getReferenceCodon();
    public void setReferenceCodon(final java.lang.String referenceCodon);

    public java.lang.String getAlternateResidue();
    public void setAlternateResidue(final java.lang.String alternateResidue);

    public java.lang.String getTranscriptIdentifier();
    public void setTranscriptIdentifier(final java.lang.String transcriptIdentifier);

    public org.intermine.model.bio.SequenceAlteration getVariant();
    public void setVariant(final org.intermine.model.bio.SequenceAlteration variant);
    public void proxyVariant(final org.intermine.objectstore.proxy.ProxyReference variant);
    public org.intermine.model.InterMineObject proxGetVariant();

    public org.intermine.model.bio.Transcript getTranscript();
    public void setTranscript(final org.intermine.model.bio.Transcript transcript);
    public void proxyTranscript(final org.intermine.objectstore.proxy.ProxyReference transcript);
    public org.intermine.model.InterMineObject proxGetTranscript();

    public java.util.Set<org.intermine.model.bio.ConsequenceType> getConsequenceTypes();
    public void setConsequenceTypes(final java.util.Set<org.intermine.model.bio.ConsequenceType> consequenceTypes);
    public void addConsequenceTypes(final org.intermine.model.bio.ConsequenceType arg);

}
