package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class GOEvidenceCodeShadow implements GOEvidenceCode, ShadowClass
{
    public static final Class<GOEvidenceCode> shadowOf = GOEvidenceCode.class;
    // Attr: org.intermine.model.bio.GOEvidenceCode.source
    protected java.lang.String source;
    public java.lang.String getSource() { return source; }
    public void setSource(final java.lang.String source) { this.source = source; }

    // Attr: org.intermine.model.bio.GOEvidenceCode.code
    protected java.lang.String code;
    public java.lang.String getCode() { return code; }
    public void setCode(final java.lang.String code) { this.code = code; }

    // Ref: org.intermine.model.bio.GOEvidenceCode.evidenceOntology
    protected org.intermine.model.InterMineObject evidenceOntology;
    public org.intermine.model.bio.ECOTerm getEvidenceOntology() { if (evidenceOntology instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.ECOTerm) ((org.intermine.objectstore.proxy.ProxyReference) evidenceOntology).getObject()); }; return (org.intermine.model.bio.ECOTerm) evidenceOntology; }
    public void setEvidenceOntology(final org.intermine.model.bio.ECOTerm evidenceOntology) { this.evidenceOntology = evidenceOntology; }
    public void proxyEvidenceOntology(final org.intermine.objectstore.proxy.ProxyReference evidenceOntology) { this.evidenceOntology = evidenceOntology; }
    public org.intermine.model.InterMineObject proxGetEvidenceOntology() { return evidenceOntology; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof GOEvidenceCode && id != null) ? id.equals(((GOEvidenceCode)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "GOEvidenceCode [code=" + (code == null ? "null" : "\"" + code + "\"") + ", evidenceOntology=" + (evidenceOntology == null ? "null" : (evidenceOntology.getId() == null ? "no id" : evidenceOntology.getId().toString())) + ", id=" + id + ", source=" + (source == null ? "null" : "\"" + source + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("source".equals(fieldName)) {
            return source;
        }
        if ("code".equals(fieldName)) {
            return code;
        }
        if ("evidenceOntology".equals(fieldName)) {
            if (evidenceOntology instanceof ProxyReference) {
                return ((ProxyReference) evidenceOntology).getObject();
            } else {
                return evidenceOntology;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GOEvidenceCode.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("source".equals(fieldName)) {
            return source;
        }
        if ("code".equals(fieldName)) {
            return code;
        }
        if ("evidenceOntology".equals(fieldName)) {
            return evidenceOntology;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GOEvidenceCode.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("source".equals(fieldName)) {
            source = (java.lang.String) value;
        } else if ("code".equals(fieldName)) {
            code = (java.lang.String) value;
        } else if ("evidenceOntology".equals(fieldName)) {
            evidenceOntology = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.GOEvidenceCode.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("source".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("code".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("evidenceOntology".equals(fieldName)) {
            return org.intermine.model.bio.ECOTerm.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.GOEvidenceCode.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.GOEvidenceCode.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.GOEvidenceCodeShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.GOEvidenceCode");
        if (source != null) {
            sb.append("$_^asource$_^");
            String string = source;
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
        if (code != null) {
            sb.append("$_^acode$_^");
            String string = code;
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
        if (evidenceOntology != null) {
            sb.append("$_^revidenceOntology$_^").append(evidenceOntology.getId());
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
        if (!org.intermine.model.bio.GOEvidenceCodeShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.GOEvidenceCode)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "asource".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                source = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acode".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                code = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"revidenceOntology".equals(notXml[i])) {
                i++;
                evidenceOntology = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.ECOTerm.class);
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
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        {
            if (!org.intermine.model.bio.GOEvidenceCode.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.GOEvidenceCode.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.GOEvidenceCode.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
