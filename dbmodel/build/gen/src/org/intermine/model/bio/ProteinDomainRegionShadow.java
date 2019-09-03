package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ProteinDomainRegionShadow implements ProteinDomainRegion, ShadowClass
{
    public static final Class<ProteinDomainRegion> shadowOf = ProteinDomainRegion.class;
    // Attr: org.intermine.model.bio.ProteinDomainRegion.identifier
    protected java.lang.String identifier;
    public java.lang.String getIdentifier() { return identifier; }
    public void setIdentifier(final java.lang.String identifier) { this.identifier = identifier; }

    // Attr: org.intermine.model.bio.ProteinDomainRegion.start
    protected java.lang.Integer start;
    public java.lang.Integer getStart() { return start; }
    public void setStart(final java.lang.Integer start) { this.start = start; }

    // Attr: org.intermine.model.bio.ProteinDomainRegion.database
    protected java.lang.String database;
    public java.lang.String getDatabase() { return database; }
    public void setDatabase(final java.lang.String database) { this.database = database; }

    // Attr: org.intermine.model.bio.ProteinDomainRegion.end
    protected java.lang.Integer end;
    public java.lang.Integer getEnd() { return end; }
    public void setEnd(final java.lang.Integer end) { this.end = end; }

    // Ref: org.intermine.model.bio.ProteinDomainRegion.protein
    protected org.intermine.model.InterMineObject protein;
    public org.intermine.model.bio.Protein getProtein() { if (protein instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Protein) ((org.intermine.objectstore.proxy.ProxyReference) protein).getObject()); }; return (org.intermine.model.bio.Protein) protein; }
    public void setProtein(final org.intermine.model.bio.Protein protein) { this.protein = protein; }
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein) { this.protein = protein; }
    public org.intermine.model.InterMineObject proxGetProtein() { return protein; }

    // Ref: org.intermine.model.bio.ProteinDomainRegion.proteinDomain
    protected org.intermine.model.InterMineObject proteinDomain;
    public org.intermine.model.bio.ProteinDomain getProteinDomain() { if (proteinDomain instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.ProteinDomain) ((org.intermine.objectstore.proxy.ProxyReference) proteinDomain).getObject()); }; return (org.intermine.model.bio.ProteinDomain) proteinDomain; }
    public void setProteinDomain(final org.intermine.model.bio.ProteinDomain proteinDomain) { this.proteinDomain = proteinDomain; }
    public void proxyProteinDomain(final org.intermine.objectstore.proxy.ProxyReference proteinDomain) { this.proteinDomain = proteinDomain; }
    public org.intermine.model.InterMineObject proxGetProteinDomain() { return proteinDomain; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ProteinDomainRegion && id != null) ? id.equals(((ProteinDomainRegion)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ProteinDomainRegion [database=" + (database == null ? "null" : "\"" + database + "\"") + ", end=" + end + ", id=" + id + ", identifier=" + (identifier == null ? "null" : "\"" + identifier + "\"") + ", protein=" + (protein == null ? "null" : (protein.getId() == null ? "no id" : protein.getId().toString())) + ", proteinDomain=" + (proteinDomain == null ? "null" : (proteinDomain.getId() == null ? "no id" : proteinDomain.getId().toString())) + ", start=" + start + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("start".equals(fieldName)) {
            return start;
        }
        if ("database".equals(fieldName)) {
            return database;
        }
        if ("end".equals(fieldName)) {
            return end;
        }
        if ("protein".equals(fieldName)) {
            if (protein instanceof ProxyReference) {
                return ((ProxyReference) protein).getObject();
            } else {
                return protein;
            }
        }
        if ("proteinDomain".equals(fieldName)) {
            if (proteinDomain instanceof ProxyReference) {
                return ((ProxyReference) proteinDomain).getObject();
            } else {
                return proteinDomain;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ProteinDomainRegion.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("start".equals(fieldName)) {
            return start;
        }
        if ("database".equals(fieldName)) {
            return database;
        }
        if ("end".equals(fieldName)) {
            return end;
        }
        if ("protein".equals(fieldName)) {
            return protein;
        }
        if ("proteinDomain".equals(fieldName)) {
            return proteinDomain;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ProteinDomainRegion.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("identifier".equals(fieldName)) {
            identifier = (java.lang.String) value;
        } else if ("start".equals(fieldName)) {
            start = (java.lang.Integer) value;
        } else if ("database".equals(fieldName)) {
            database = (java.lang.String) value;
        } else if ("end".equals(fieldName)) {
            end = (java.lang.Integer) value;
        } else if ("protein".equals(fieldName)) {
            protein = (org.intermine.model.InterMineObject) value;
        } else if ("proteinDomain".equals(fieldName)) {
            proteinDomain = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ProteinDomainRegion.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("identifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("start".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("database".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("end".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("protein".equals(fieldName)) {
            return org.intermine.model.bio.Protein.class;
        }
        if ("proteinDomain".equals(fieldName)) {
            return org.intermine.model.bio.ProteinDomain.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ProteinDomainRegion.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ProteinDomainRegion.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ProteinDomainRegionShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ProteinDomainRegion");
        if (identifier != null) {
            sb.append("$_^aidentifier$_^");
            String string = identifier;
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
        if (start != null) {
            sb.append("$_^astart$_^").append(start);
        }
        if (database != null) {
            sb.append("$_^adatabase$_^");
            String string = database;
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
        if (end != null) {
            sb.append("$_^aend$_^").append(end);
        }
        if (protein != null) {
            sb.append("$_^rprotein$_^").append(protein.getId());
        }
        if (proteinDomain != null) {
            sb.append("$_^rproteinDomain$_^").append(proteinDomain.getId());
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
        if (!org.intermine.model.bio.ProteinDomainRegionShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ProteinDomainRegion)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aidentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                identifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "astart".equals(notXml[i])) {
                i++;
                start = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "adatabase".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                database = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aend".equals(notXml[i])) {
                i++;
                end = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rprotein".equals(notXml[i])) {
                i++;
                protein = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Protein.class);
                i++;
            };
            if ((i < notXml.length) &&"rproteinDomain".equals(notXml[i])) {
                i++;
                proteinDomain = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.ProteinDomain.class);
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
            if (!org.intermine.model.bio.ProteinDomainRegion.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.ProteinDomainRegion.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ProteinDomainRegion.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
