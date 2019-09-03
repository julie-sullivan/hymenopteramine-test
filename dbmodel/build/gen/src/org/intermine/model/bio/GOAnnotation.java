package org.intermine.model.bio;

public interface GOAnnotation extends org.intermine.model.bio.OntologyAnnotation
{
    public java.util.Set<org.intermine.model.bio.GOEvidence> getEvidence();
    public void setEvidence(final java.util.Set<org.intermine.model.bio.GOEvidence> evidence);
    public void addEvidence(final org.intermine.model.bio.GOEvidence arg);

}
