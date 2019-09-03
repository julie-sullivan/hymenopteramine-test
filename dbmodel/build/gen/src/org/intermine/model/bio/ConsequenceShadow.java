package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ConsequenceShadow implements Consequence, ShadowClass
{
    public static final Class<Consequence> shadowOf = Consequence.class;
    // Attr: org.intermine.model.bio.Consequence.cdnaPosition
    protected java.lang.String cdnaPosition;
    public java.lang.String getCdnaPosition() { return cdnaPosition; }
    public void setCdnaPosition(final java.lang.String cdnaPosition) { this.cdnaPosition = cdnaPosition; }

    // Attr: org.intermine.model.bio.Consequence.alternateCodon
    protected java.lang.String alternateCodon;
    public java.lang.String getAlternateCodon() { return alternateCodon; }
    public void setAlternateCodon(final java.lang.String alternateCodon) { this.alternateCodon = alternateCodon; }

    // Attr: org.intermine.model.bio.Consequence.proteinIdentifier
    protected java.lang.String proteinIdentifier;
    public java.lang.String getProteinIdentifier() { return proteinIdentifier; }
    public void setProteinIdentifier(final java.lang.String proteinIdentifier) { this.proteinIdentifier = proteinIdentifier; }

    // Attr: org.intermine.model.bio.Consequence.rsId
    protected java.lang.String rsId;
    public java.lang.String getRsId() { return rsId; }
    public void setRsId(final java.lang.String rsId) { this.rsId = rsId; }

    // Attr: org.intermine.model.bio.Consequence.cdsPosition
    protected java.lang.String cdsPosition;
    public java.lang.String getCdsPosition() { return cdsPosition; }
    public void setCdsPosition(final java.lang.String cdsPosition) { this.cdsPosition = cdsPosition; }

    // Attr: org.intermine.model.bio.Consequence.referenceResidue
    protected java.lang.String referenceResidue;
    public java.lang.String getReferenceResidue() { return referenceResidue; }
    public void setReferenceResidue(final java.lang.String referenceResidue) { this.referenceResidue = referenceResidue; }

    // Attr: org.intermine.model.bio.Consequence.aminoAcidPosition
    protected java.lang.String aminoAcidPosition;
    public java.lang.String getAminoAcidPosition() { return aminoAcidPosition; }
    public void setAminoAcidPosition(final java.lang.String aminoAcidPosition) { this.aminoAcidPosition = aminoAcidPosition; }

    // Attr: org.intermine.model.bio.Consequence.referenceCodon
    protected java.lang.String referenceCodon;
    public java.lang.String getReferenceCodon() { return referenceCodon; }
    public void setReferenceCodon(final java.lang.String referenceCodon) { this.referenceCodon = referenceCodon; }

    // Attr: org.intermine.model.bio.Consequence.alternateResidue
    protected java.lang.String alternateResidue;
    public java.lang.String getAlternateResidue() { return alternateResidue; }
    public void setAlternateResidue(final java.lang.String alternateResidue) { this.alternateResidue = alternateResidue; }

    // Attr: org.intermine.model.bio.Consequence.transcriptIdentifier
    protected java.lang.String transcriptIdentifier;
    public java.lang.String getTranscriptIdentifier() { return transcriptIdentifier; }
    public void setTranscriptIdentifier(final java.lang.String transcriptIdentifier) { this.transcriptIdentifier = transcriptIdentifier; }

    // Ref: org.intermine.model.bio.Consequence.variant
    protected org.intermine.model.InterMineObject variant;
    public org.intermine.model.bio.SequenceAlteration getVariant() { if (variant instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.SequenceAlteration) ((org.intermine.objectstore.proxy.ProxyReference) variant).getObject()); }; return (org.intermine.model.bio.SequenceAlteration) variant; }
    public void setVariant(final org.intermine.model.bio.SequenceAlteration variant) { this.variant = variant; }
    public void proxyVariant(final org.intermine.objectstore.proxy.ProxyReference variant) { this.variant = variant; }
    public org.intermine.model.InterMineObject proxGetVariant() { return variant; }

    // Ref: org.intermine.model.bio.Consequence.transcript
    protected org.intermine.model.InterMineObject transcript;
    public org.intermine.model.bio.Transcript getTranscript() { if (transcript instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Transcript) ((org.intermine.objectstore.proxy.ProxyReference) transcript).getObject()); }; return (org.intermine.model.bio.Transcript) transcript; }
    public void setTranscript(final org.intermine.model.bio.Transcript transcript) { this.transcript = transcript; }
    public void proxyTranscript(final org.intermine.objectstore.proxy.ProxyReference transcript) { this.transcript = transcript; }
    public org.intermine.model.InterMineObject proxGetTranscript() { return transcript; }

    // Col: org.intermine.model.bio.Consequence.consequenceTypes
    protected java.util.Set<org.intermine.model.bio.ConsequenceType> consequenceTypes = new java.util.HashSet<org.intermine.model.bio.ConsequenceType>();
    public java.util.Set<org.intermine.model.bio.ConsequenceType> getConsequenceTypes() { return consequenceTypes; }
    public void setConsequenceTypes(final java.util.Set<org.intermine.model.bio.ConsequenceType> consequenceTypes) { this.consequenceTypes = consequenceTypes; }
    public void addConsequenceTypes(final org.intermine.model.bio.ConsequenceType arg) { consequenceTypes.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Consequence && id != null) ? id.equals(((Consequence)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Consequence [alternateCodon=" + (alternateCodon == null ? "null" : "\"" + alternateCodon + "\"") + ", alternateResidue=" + (alternateResidue == null ? "null" : "\"" + alternateResidue + "\"") + ", aminoAcidPosition=" + (aminoAcidPosition == null ? "null" : "\"" + aminoAcidPosition + "\"") + ", cdnaPosition=" + (cdnaPosition == null ? "null" : "\"" + cdnaPosition + "\"") + ", cdsPosition=" + (cdsPosition == null ? "null" : "\"" + cdsPosition + "\"") + ", id=" + id + ", proteinIdentifier=" + (proteinIdentifier == null ? "null" : "\"" + proteinIdentifier + "\"") + ", referenceCodon=" + (referenceCodon == null ? "null" : "\"" + referenceCodon + "\"") + ", referenceResidue=" + (referenceResidue == null ? "null" : "\"" + referenceResidue + "\"") + ", rsId=" + (rsId == null ? "null" : "\"" + rsId + "\"") + ", transcript=" + (transcript == null ? "null" : (transcript.getId() == null ? "no id" : transcript.getId().toString())) + ", transcriptIdentifier=" + (transcriptIdentifier == null ? "null" : "\"" + transcriptIdentifier + "\"") + ", variant=" + (variant == null ? "null" : (variant.getId() == null ? "no id" : variant.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("cdnaPosition".equals(fieldName)) {
            return cdnaPosition;
        }
        if ("alternateCodon".equals(fieldName)) {
            return alternateCodon;
        }
        if ("proteinIdentifier".equals(fieldName)) {
            return proteinIdentifier;
        }
        if ("rsId".equals(fieldName)) {
            return rsId;
        }
        if ("cdsPosition".equals(fieldName)) {
            return cdsPosition;
        }
        if ("referenceResidue".equals(fieldName)) {
            return referenceResidue;
        }
        if ("aminoAcidPosition".equals(fieldName)) {
            return aminoAcidPosition;
        }
        if ("referenceCodon".equals(fieldName)) {
            return referenceCodon;
        }
        if ("alternateResidue".equals(fieldName)) {
            return alternateResidue;
        }
        if ("transcriptIdentifier".equals(fieldName)) {
            return transcriptIdentifier;
        }
        if ("variant".equals(fieldName)) {
            if (variant instanceof ProxyReference) {
                return ((ProxyReference) variant).getObject();
            } else {
                return variant;
            }
        }
        if ("transcript".equals(fieldName)) {
            if (transcript instanceof ProxyReference) {
                return ((ProxyReference) transcript).getObject();
            } else {
                return transcript;
            }
        }
        if ("consequenceTypes".equals(fieldName)) {
            return consequenceTypes;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Consequence.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("cdnaPosition".equals(fieldName)) {
            return cdnaPosition;
        }
        if ("alternateCodon".equals(fieldName)) {
            return alternateCodon;
        }
        if ("proteinIdentifier".equals(fieldName)) {
            return proteinIdentifier;
        }
        if ("rsId".equals(fieldName)) {
            return rsId;
        }
        if ("cdsPosition".equals(fieldName)) {
            return cdsPosition;
        }
        if ("referenceResidue".equals(fieldName)) {
            return referenceResidue;
        }
        if ("aminoAcidPosition".equals(fieldName)) {
            return aminoAcidPosition;
        }
        if ("referenceCodon".equals(fieldName)) {
            return referenceCodon;
        }
        if ("alternateResidue".equals(fieldName)) {
            return alternateResidue;
        }
        if ("transcriptIdentifier".equals(fieldName)) {
            return transcriptIdentifier;
        }
        if ("variant".equals(fieldName)) {
            return variant;
        }
        if ("transcript".equals(fieldName)) {
            return transcript;
        }
        if ("consequenceTypes".equals(fieldName)) {
            return consequenceTypes;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Consequence.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("cdnaPosition".equals(fieldName)) {
            cdnaPosition = (java.lang.String) value;
        } else if ("alternateCodon".equals(fieldName)) {
            alternateCodon = (java.lang.String) value;
        } else if ("proteinIdentifier".equals(fieldName)) {
            proteinIdentifier = (java.lang.String) value;
        } else if ("rsId".equals(fieldName)) {
            rsId = (java.lang.String) value;
        } else if ("cdsPosition".equals(fieldName)) {
            cdsPosition = (java.lang.String) value;
        } else if ("referenceResidue".equals(fieldName)) {
            referenceResidue = (java.lang.String) value;
        } else if ("aminoAcidPosition".equals(fieldName)) {
            aminoAcidPosition = (java.lang.String) value;
        } else if ("referenceCodon".equals(fieldName)) {
            referenceCodon = (java.lang.String) value;
        } else if ("alternateResidue".equals(fieldName)) {
            alternateResidue = (java.lang.String) value;
        } else if ("transcriptIdentifier".equals(fieldName)) {
            transcriptIdentifier = (java.lang.String) value;
        } else if ("variant".equals(fieldName)) {
            variant = (org.intermine.model.InterMineObject) value;
        } else if ("transcript".equals(fieldName)) {
            transcript = (org.intermine.model.InterMineObject) value;
        } else if ("consequenceTypes".equals(fieldName)) {
            consequenceTypes = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Consequence.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("cdnaPosition".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("alternateCodon".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("proteinIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("rsId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("cdsPosition".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("referenceResidue".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("aminoAcidPosition".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("referenceCodon".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("alternateResidue".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("transcriptIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("variant".equals(fieldName)) {
            return org.intermine.model.bio.SequenceAlteration.class;
        }
        if ("transcript".equals(fieldName)) {
            return org.intermine.model.bio.Transcript.class;
        }
        if ("consequenceTypes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Consequence.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Consequence.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ConsequenceShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Consequence");
        if (cdnaPosition != null) {
            sb.append("$_^acdnaPosition$_^");
            String string = cdnaPosition;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (alternateCodon != null) {
            sb.append("$_^aalternateCodon$_^");
            String string = alternateCodon;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (proteinIdentifier != null) {
            sb.append("$_^aproteinIdentifier$_^");
            String string = proteinIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (rsId != null) {
            sb.append("$_^arsId$_^");
            String string = rsId;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (cdsPosition != null) {
            sb.append("$_^acdsPosition$_^");
            String string = cdsPosition;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (referenceResidue != null) {
            sb.append("$_^areferenceResidue$_^");
            String string = referenceResidue;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (aminoAcidPosition != null) {
            sb.append("$_^aaminoAcidPosition$_^");
            String string = aminoAcidPosition;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (referenceCodon != null) {
            sb.append("$_^areferenceCodon$_^");
            String string = referenceCodon;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (alternateResidue != null) {
            sb.append("$_^aalternateResidue$_^");
            String string = alternateResidue;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (transcriptIdentifier != null) {
            sb.append("$_^atranscriptIdentifier$_^");
            String string = transcriptIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (variant != null) {
            sb.append("$_^rvariant$_^").append(variant.getId());
        }
        if (transcript != null) {
            sb.append("$_^rtranscript$_^").append(transcript.getId());
        }
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.ConsequenceShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Consequence)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "acdnaPosition".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                cdnaPosition = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aalternateCodon".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                alternateCodon = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aproteinIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                proteinIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "arsId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                rsId = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acdsPosition".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                cdsPosition = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "areferenceResidue".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                referenceResidue = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aaminoAcidPosition".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                aminoAcidPosition = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "areferenceCodon".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                referenceCodon = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aalternateResidue".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                alternateResidue = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atranscriptIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                transcriptIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rvariant".equals(notXml[i])) {
                i++;
                variant = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.SequenceAlteration.class);
                i++;
            };
            if ((i < notXml.length) &&"rtranscript".equals(notXml[i])) {
                i++;
                transcript = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Transcript.class);
                i++;
            };
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        consequenceTypes = new ProxyCollection<org.intermine.model.bio.ConsequenceType>(os, this, "consequenceTypes", org.intermine.model.bio.ConsequenceType.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("consequenceTypes".equals(fieldName)) {
            consequenceTypes.add((org.intermine.model.bio.ConsequenceType) element);
        } else {
            if (!org.intermine.model.bio.Consequence.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("consequenceTypes".equals(fieldName)) {
            return org.intermine.model.bio.ConsequenceType.class;
        }
        if (!org.intermine.model.bio.Consequence.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Consequence.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
