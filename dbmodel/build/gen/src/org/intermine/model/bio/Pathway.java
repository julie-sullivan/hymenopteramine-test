package org.intermine.model.bio;

public interface Pathway extends org.intermine.model.InterMineObject
{
    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.Boolean getCurated();
    public void setCurated(final java.lang.Boolean curated);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getBsid();
    public void setBsid(final java.lang.String bsid);

    public java.lang.String getPathwayMap();
    public void setPathwayMap(final java.lang.String pathwayMap);

    public java.lang.String getKoPathway();
    public void setKoPathway(final java.lang.String koPathway);

    public java.lang.String getPathwayClass();
    public void setPathwayClass(final java.lang.String pathwayClass);

    public java.lang.String getShortName();
    public void setShortName(final java.lang.String shortName);

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.Protein> getProteins();
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins);
    public void addProteins(final org.intermine.model.bio.Protein arg);

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

    public java.util.Set<org.intermine.model.bio.GOAnnotation> getGoAnnotation();
    public void setGoAnnotation(final java.util.Set<org.intermine.model.bio.GOAnnotation> goAnnotation);
    public void addGoAnnotation(final org.intermine.model.bio.GOAnnotation arg);

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
