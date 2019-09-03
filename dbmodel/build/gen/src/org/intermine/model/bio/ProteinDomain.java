package org.intermine.model.bio;

public interface ProteinDomain extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.String getShortName();
    public void setShortName(final java.lang.String shortName);

    public java.util.Set<org.intermine.model.bio.ProteinDomain> getChildFeatures();
    public void setChildFeatures(final java.util.Set<org.intermine.model.bio.ProteinDomain> childFeatures);
    public void addChildFeatures(final org.intermine.model.bio.ProteinDomain arg);

    public java.util.Set<org.intermine.model.bio.ProteinDomain> getFoundIn();
    public void setFoundIn(final java.util.Set<org.intermine.model.bio.ProteinDomain> foundIn);
    public void addFoundIn(final org.intermine.model.bio.ProteinDomain arg);

    public java.util.Set<org.intermine.model.bio.ProteinDomain> getParentFeatures();
    public void setParentFeatures(final java.util.Set<org.intermine.model.bio.ProteinDomain> parentFeatures);
    public void addParentFeatures(final org.intermine.model.bio.ProteinDomain arg);

    public java.util.Set<org.intermine.model.bio.ProteinDomain> getContains();
    public void setContains(final java.util.Set<org.intermine.model.bio.ProteinDomain> contains);
    public void addContains(final org.intermine.model.bio.ProteinDomain arg);

    public java.util.Set<org.intermine.model.bio.ProteinDomainRegion> getProteinDomainRegions();
    public void setProteinDomainRegions(final java.util.Set<org.intermine.model.bio.ProteinDomainRegion> proteinDomainRegions);
    public void addProteinDomainRegions(final org.intermine.model.bio.ProteinDomainRegion arg);

}
