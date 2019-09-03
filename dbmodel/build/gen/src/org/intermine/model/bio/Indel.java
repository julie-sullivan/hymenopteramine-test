package org.intermine.model.bio;

public interface Indel extends org.intermine.model.bio.SequenceAlteration
{
    public java.lang.String getValidationStatus();
    public void setValidationStatus(final java.lang.String validationStatus);

    public java.lang.String getReferenceAllele();
    public void setReferenceAllele(final java.lang.String referenceAllele);

    public java.lang.Float getHeterozygosity();
    public void setHeterozygosity(final java.lang.Float heterozygosity);

    public java.lang.String getAlternateAllele();
    public void setAlternateAllele(final java.lang.String alternateAllele);

    public java.lang.String getVariationType();
    public void setVariationType(final java.lang.String variationType);

    public java.lang.String getOrientation();
    public void setOrientation(final java.lang.String orientation);

}
