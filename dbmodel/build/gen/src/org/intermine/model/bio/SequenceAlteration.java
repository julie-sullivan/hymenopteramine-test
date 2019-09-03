package org.intermine.model.bio;

public interface SequenceAlteration extends org.intermine.model.bio.SequenceFeature
{
    public java.util.Set<org.intermine.model.bio.Consequence> getConsequences();
    public void setConsequences(final java.util.Set<org.intermine.model.bio.Consequence> consequences);
    public void addConsequences(final org.intermine.model.bio.Consequence arg);

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

}
