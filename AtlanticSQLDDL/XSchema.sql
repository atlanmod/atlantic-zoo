CREATE TABLE AnnotedElement (
	__IDAnnotedElement__ Integer NOT NULL,
	PRIMARY KEY AnnotedElement (__IDAnnotedElement__)
) ;

CREATE TABLE Annotation (
	__IDAnnotation__ Integer NOT NULL,
	FOREIGN KEY annotedElement (__FKannotedElement__) REFERENCES AnnotedElement (__IDAnnotedElement__),
	PRIMARY KEY Annotation (__IDAnnotation__),
	__FKannotedElement__ Integer
) ;

CREATE TABLE Documentation (
	__IDDocumentation__ Integer NOT NULL,
	text text,
	PRIMARY KEY Documentation (__IDDocumentation__)
) ;

CREATE TABLE ApplicationInfo (
	__IDApplicationInfo__ Integer NOT NULL,
	text text,
	PRIMARY KEY ApplicationInfo (__IDApplicationInfo__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE XSchema (
	__IDXSchema__ Integer NOT NULL,
	namespace text,
	PRIMARY KEY XSchema (__IDXSchema__)
) ;

CREATE TABLE XSchemaContentElement (
	__IDXSchemaContentElement__ Integer NOT NULL,
	FOREIGN KEY "schema" (__FKschema__) REFERENCES XSchema (__IDXSchema__),
	PRIMARY KEY XSchemaContentElement (__IDXSchemaContentElement__),
	__FKschema__ Integer
) ;

CREATE TABLE Parameters (
	__IDParameters__ Integer NOT NULL,
	FOREIGN KEY typeRef (__FKtypeRef__) REFERENCES AbstractType (__IDAbstractType__),
	FOREIGN KEY typeContain (__FKtypeContain__) REFERENCES AbstractType (__IDAbstractType__),
	fixed text,
	"default" text,
	PRIMARY KEY Parameters (__IDParameters__),
	__FKtypeRef__ Integer,
	__FKtypeContain__ Integer
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE Occurable (
	__IDOccurable__ Integer NOT NULL,
	minOccurs text,
	maxOccurs text,
	PRIMARY KEY Occurable (__IDOccurable__)
) ;

CREATE TABLE AbstractContent (
	__IDAbstractContent__ Integer NOT NULL,
	FOREIGN KEY container (__FKcontainer__) REFERENCES Container (__IDContainer__),
	FOREIGN KEY complexType (__FKcomplexType__) REFERENCES ComplexType (__IDComplexType__),
	PRIMARY KEY AbstractContent (__IDAbstractContent__),
	__FKcomplexType__ Integer,
	__FKcontainer__ Integer
) ;

CREATE TABLE Container (
	__IDContainer__ Integer NOT NULL,
	PRIMARY KEY Container (__IDContainer__)
) ;

CREATE TABLE AtomicContent (
	__IDAtomicContent__ Integer NOT NULL,
	PRIMARY KEY AtomicContent (__IDAtomicContent__)
) ;

CREATE TABLE ElementRef (
	__IDElementRef__ Integer NOT NULL,
	FOREIGN KEY referencedElement (__FKreferencedElement__) REFERENCES Element (__IDElement__),
	PRIMARY KEY ElementRef (__IDElementRef__),
	__FKreferencedElement__ Integer
) ;

CREATE TABLE GroupRef (
	__IDGroupRef__ Integer NOT NULL,
	FOREIGN KEY referencedGroup (__FKreferencedGroup__) REFERENCES "Group" (__IDGroup__),
	PRIMARY KEY GroupRef (__IDGroupRef__),
	__FKreferencedGroup__ Integer
) ;

CREATE TABLE "All" (
	__IDAll__ Integer NOT NULL,
	PRIMARY KEY "All" (__IDAll__)
) ;

CREATE TABLE "Group" (
	__IDGroup__ Integer NOT NULL,
	PRIMARY KEY "Group" (__IDGroup__)
) ;

CREATE TABLE Choice (
	__IDChoice__ Integer NOT NULL,
	PRIMARY KEY Choice (__IDChoice__)
) ;

CREATE TABLE Sequence (
	__IDSequence__ Integer NOT NULL,
	PRIMARY KEY Sequence (__IDSequence__)
) ;

CREATE TABLE AbstractAttributeGroupContent (
	__IDAbstractAttributeGroupContent__ Integer NOT NULL,
	FOREIGN KEY container (__FKcontainer__) REFERENCES AttributeGroup (__IDAttributeGroup__),
	FOREIGN KEY complexType (__FKcomplexType__) REFERENCES ComplexType (__IDComplexType__),
	PRIMARY KEY AbstractAttributeGroupContent (__IDAbstractAttributeGroupContent__),
	__FKcomplexType__ Integer,
	__FKcontainer__ Integer
) ;

CREATE TABLE AttributeGroup (
	__IDAttributeGroup__ Integer NOT NULL,
	PRIMARY KEY AttributeGroup (__IDAttributeGroup__)
) ;

CREATE TABLE AttributeGroupRef (
	__IDAttributeGroupRef__ Integer NOT NULL,
	FOREIGN KEY referencedAttributeGroup (__FKreferencedAttributeGroup__) REFERENCES AttributeGroup (__IDAttributeGroup__),
	PRIMARY KEY AttributeGroupRef (__IDAttributeGroupRef__),
	__FKreferencedAttributeGroup__ Integer
) ;

CREATE TABLE AtomicAttributeGroupContent (
	__IDAtomicAttributeGroupContent__ Integer NOT NULL,
	PRIMARY KEY AtomicAttributeGroupContent (__IDAtomicAttributeGroupContent__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	"use" text,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE AttributeRef (
	__IDAttributeRef__ Integer NOT NULL,
	FOREIGN KEY referencedAttribute (__FKreferencedAttribute__) REFERENCES Attribute (__IDAttribute__),
	PRIMARY KEY AttributeRef (__IDAttributeRef__),
	__FKreferencedAttribute__ Integer
) ;

CREATE TABLE AbstractType (
	__IDAbstractType__ Integer NOT NULL,
	FOREIGN KEY container (__FKcontainer__) REFERENCES Parameters (__IDParameters__),
	PRIMARY KEY AbstractType (__IDAbstractType__),
	__FKcontainer__ Integer
) ;

CREATE TABLE SimpleType (
	__IDSimpleType__ Integer NOT NULL,
	PRIMARY KEY SimpleType (__IDSimpleType__)
) ;

CREATE TABLE ComplexType (
	__IDComplexType__ Integer NOT NULL,
	FOREIGN KEY content (__FKcontent__) REFERENCES AbstractContent (__IDAbstractContent__),
	PRIMARY KEY ComplexType (__IDComplexType__),
	__FKcontent__ Integer
) ;

CREATE TABLE ComplexTypeSimpleContent (
	__IDComplexTypeSimpleContent__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES SimpleType (__IDSimpleType__),
	PRIMARY KEY ComplexTypeSimpleContent (__IDComplexTypeSimpleContent__),
	__FKbase__ Integer
) ;

CREATE TABLE ComplexTypeComplexContent (
	__IDComplexTypeComplexContent__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES ComplexType (__IDComplexType__),
	PRIMARY KEY ComplexTypeComplexContent (__IDComplexTypeComplexContent__),
	__FKbase__ Integer
) ;

CREATE TABLE XSchema_contents_XSchemaContentElement (
	__IDXSchema__ Integer NOT NULL,
	__IDXSchemaContentElement__ Integer NOT NULL
) ;

CREATE TABLE ComplexType_attributes_AbstractAttributeGroupContent (
	__IDComplexType__ Integer NOT NULL,
	__IDAbstractAttributeGroupContent__ Integer NOT NULL
) ;

CREATE TABLE Attribute_references_AttributeRef (
	__IDAttribute__ Integer NOT NULL,
	__IDAttributeRef__ Integer NOT NULL
) ;

CREATE TABLE Group_references_GroupRef (
	__IDGroup__ Integer NOT NULL,
	__IDGroupRef__ Integer NOT NULL
) ;

CREATE TABLE Annotation_applicationInfos_ApplicationInfo (
	__IDAnnotation__ Integer NOT NULL,
	__IDApplicationInfo__ Integer NOT NULL
) ;

CREATE TABLE Container_contents_AbstractContent (
	__IDContainer__ Integer NOT NULL,
	__IDAbstractContent__ Integer NOT NULL
) ;

CREATE TABLE AttributeGroup_references_AttributeGroupRef (
	__IDAttributeGroup__ Integer NOT NULL,
	__IDAttributeGroupRef__ Integer NOT NULL
) ;

CREATE TABLE SimpleType_extensions_ComplexTypeSimpleContent (
	__IDSimpleType__ Integer NOT NULL,
	__IDComplexTypeSimpleContent__ Integer NOT NULL
) ;

CREATE TABLE AttributeGroup_contents_AbstractAttributeGroupContent (
	__IDAttributeGroup__ Integer NOT NULL,
	__IDAbstractAttributeGroupContent__ Integer NOT NULL
) ;

CREATE TABLE Element_references_ElementRef (
	__IDElement__ Integer NOT NULL,
	__IDElementRef__ Integer NOT NULL
) ;

CREATE TABLE ComplexType_extensions_ComplexTypeComplexContent (
	__IDComplexType__ Integer NOT NULL,
	__IDComplexTypeComplexContent__ Integer NOT NULL
) ;

CREATE TABLE AnnotedElement_annotations_Annotation (
	__IDAnnotedElement__ Integer NOT NULL,
	__IDAnnotation__ Integer NOT NULL
) ;

CREATE TABLE Annotation_documentations_Documentation (
	__IDAnnotation__ Integer NOT NULL,
	__IDDocumentation__ Integer NOT NULL
) ;
