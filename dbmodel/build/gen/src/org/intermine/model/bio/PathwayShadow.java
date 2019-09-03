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

public class PathwayShadow implements Pathway, ShadowClass
{
    public static final Class<Pathway> shadowOf = Pathway.class;
    // Attr: org.intermine.model.bio.Pathway.identifier
    protected java.lang.String identifier;
    public java.lang.String getIdentifier() { return identifier; }
    public void setIdentifier(final java.lang.String identifier) { this.identifier = identifier; }

    // Attr: org.intermine.model.bio.Pathway.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Attr: org.intermine.model.bio.Pathway.curated
    protected java.lang.Boolean curated;
    public java.lang.Boolean getCurated() { return curated; }
    public void setCurated(final java.lang.Boolean curated) { this.curated = curated; }

    // Attr: org.intermine.model.bio.Pathway.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.Pathway.bsid
    protected java.lang.String bsid;
    public java.lang.String getBsid() { return bsid; }
    public void setBsid(final java.lang.String bsid) { this.bsid = bsid; }

    // Attr: org.intermine.model.bio.Pathway.pathwayMap
    protected java.lang.String pathwayMap;
    public java.lang.String getPathwayMap() { return pathwayMap; }
    public void setPathwayMap(final java.lang.String pathwayMap) { this.pathwayMap = pathwayMap; }

    // Attr: org.intermine.model.bio.Pathway.koPathway
    protected java.lang.String koPathway;
    public java.lang.String getKoPathway() { return koPathway; }
    public void setKoPathway(final java.lang.String koPathway) { this.koPathway = koPathway; }

    // Attr: org.intermine.model.bio.Pathway.pathwayClass
    protected java.lang.String pathwayClass;
    public java.lang.String getPathwayClass() { return pathwayClass; }
    public void setPathwayClass(final java.lang.String pathwayClass) { this.pathwayClass = pathwayClass; }

    // Attr: org.intermine.model.bio.Pathway.shortName
    protected java.lang.String shortName;
    public java.lang.String getShortName() { return shortName; }
    public void setShortName(final java.lang.String shortName) { this.shortName = shortName; }

    // Ref: org.intermine.model.bio.Pathway.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.Pathway.genes
    protected java.util.Set<org.intermine.model.bio.Gene> genes = new java.util.HashSet<org.intermine.model.bio.Gene>();
    public java.util.Set<org.intermine.model.bio.Gene> getGenes() { return genes; }
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes) { this.genes = genes; }
    public void addGenes(final org.intermine.model.bio.Gene arg) { genes.add(arg); }

    // Col: org.intermine.model.bio.Pathway.proteins
    protected java.util.Set<org.intermine.model.bio.Protein> proteins = new java.util.HashSet<org.intermine.model.bio.Protein>();
    public java.util.Set<org.intermine.model.bio.Protein> getProteins() { return proteins; }
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins) { this.proteins = proteins; }
    public void addProteins(final org.intermine.model.bio.Protein arg) { proteins.add(arg); }

    // Col: org.intermine.model.bio.Pathway.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet<org.intermine.model.bio.Publication>();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Col: org.intermine.model.bio.Pathway.goAnnotation
    protected java.util.Set<org.intermine.model.bio.GOAnnotation> goAnnotation = new java.util.HashSet<org.intermine.model.bio.GOAnnotation>();
    public java.util.Set<org.intermine.model.bio.GOAnnotation> getGoAnnotation() { return goAnnotation; }
    public void setGoAnnotation(final java.util.Set<org.intermine.model.bio.GOAnnotation> goAnnotation) { this.goAnnotation = goAnnotation; }
    public void addGoAnnotation(final org.intermine.model.bio.GOAnnotation arg) { goAnnotation.add(arg); }

    // Col: org.intermine.model.bio.Pathway.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Pathway && id != null) ? id.equals(((Pathway)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Pathway [bsid=" + (bsid == null ? "null" : "\"" + bsid + "\"") + ", curated=" + (curated == null ? "null" : "\"" + curated + "\"") + ", description=" + (description == null ? "null" : "\"" + description + "\"") + ", id=" + id + ", identifier=" + (identifier == null ? "null" : "\"" + identifier + "\"") + ", koPathway=" + (koPathway == null ? "null" : "\"" + koPathway + "\"") + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", pathwayClass=" + (pathwayClass == null ? "null" : "\"" + pathwayClass + "\"") + ", pathwayMap=" + (pathwayMap == null ? "null" : "\"" + pathwayMap + "\"") + ", shortName=" + (shortName == null ? "null" : "\"" + shortName + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("curated".equals(fieldName)) {
            return curated;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("bsid".equals(fieldName)) {
            return bsid;
        }
        if ("pathwayMap".equals(fieldName)) {
            return pathwayMap;
        }
        if ("koPathway".equals(fieldName)) {
            return koPathway;
        }
        if ("pathwayClass".equals(fieldName)) {
            return pathwayClass;
        }
        if ("shortName".equals(fieldName)) {
            return shortName;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("proteins".equals(fieldName)) {
            return proteins;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("goAnnotation".equals(fieldName)) {
            return goAnnotation;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("curated".equals(fieldName)) {
            return curated;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("bsid".equals(fieldName)) {
            return bsid;
        }
        if ("pathwayMap".equals(fieldName)) {
            return pathwayMap;
        }
        if ("koPathway".equals(fieldName)) {
            return koPathway;
        }
        if ("pathwayClass".equals(fieldName)) {
            return pathwayClass;
        }
        if ("shortName".equals(fieldName)) {
            return shortName;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("proteins".equals(fieldName)) {
            return proteins;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("goAnnotation".equals(fieldName)) {
            return goAnnotation;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("identifier".equals(fieldName)) {
            identifier = (java.lang.String) value;
        } else if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("curated".equals(fieldName)) {
            curated = (java.lang.Boolean) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("bsid".equals(fieldName)) {
            bsid = (java.lang.String) value;
        } else if ("pathwayMap".equals(fieldName)) {
            pathwayMap = (java.lang.String) value;
        } else if ("koPathway".equals(fieldName)) {
            koPathway = (java.lang.String) value;
        } else if ("pathwayClass".equals(fieldName)) {
            pathwayClass = (java.lang.String) value;
        } else if ("shortName".equals(fieldName)) {
            shortName = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("genes".equals(fieldName)) {
            genes = (java.util.Set) value;
        } else if ("proteins".equals(fieldName)) {
            proteins = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("goAnnotation".equals(fieldName)) {
            goAnnotation = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
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
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("curated".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("bsid".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("pathwayMap".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("koPathway".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("pathwayClass".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("shortName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("genes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("proteins".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("goAnnotation".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Pathway.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.PathwayShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Pathway");
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
        if (description != null) {
            sb.append("$_^adescription$_^");
            String string = description;
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
        if (curated != null) {
            sb.append("$_^acurated$_^").append(curated);
        }
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
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
        if (bsid != null) {
            sb.append("$_^absid$_^");
            String string = bsid;
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
        if (pathwayMap != null) {
            sb.append("$_^apathwayMap$_^");
            String string = pathwayMap;
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
        if (koPathway != null) {
            sb.append("$_^akoPathway$_^");
            String string = koPathway;
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
        if (pathwayClass != null) {
            sb.append("$_^apathwayClass$_^");
            String string = pathwayClass;
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
        if (shortName != null) {
            sb.append("$_^ashortName$_^");
            String string = shortName;
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
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
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
        if (!org.intermine.model.bio.PathwayShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Pathway)");
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
            if ((i < notXml.length) && "adescription".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                description = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acurated".equals(notXml[i])) {
                i++;
                curated = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "absid".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                bsid = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apathwayMap".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                pathwayMap = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "akoPathway".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                koPathway = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apathwayClass".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                pathwayClass = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ashortName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                shortName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
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
        genes = new ProxyCollection<org.intermine.model.bio.Gene>(os, this, "genes", org.intermine.model.bio.Gene.class);
        proteins = new ProxyCollection<org.intermine.model.bio.Protein>(os, this, "proteins", org.intermine.model.bio.Protein.class);
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
        goAnnotation = new ProxyCollection<org.intermine.model.bio.GOAnnotation>(os, this, "goAnnotation", org.intermine.model.bio.GOAnnotation.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("genes".equals(fieldName)) {
            genes.add((org.intermine.model.bio.Gene) element);
        } else if ("proteins".equals(fieldName)) {
            proteins.add((org.intermine.model.bio.Protein) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else if ("goAnnotation".equals(fieldName)) {
            goAnnotation.add((org.intermine.model.bio.GOAnnotation) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else {
            if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("genes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("proteins".equals(fieldName)) {
            return org.intermine.model.bio.Protein.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("goAnnotation".equals(fieldName)) {
            return org.intermine.model.bio.GOAnnotation.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Pathway.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
