CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	domainModel text,
	PRIMARY KEY Model (__IDModel__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	type text,
	id text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	FOREIGN KEY parentLink (__FKparentLink__) REFERENCES EmbeddingLink (__IDEmbeddingLink__),
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKparentLink__ Integer
) ;

CREATE TABLE ModelElementLink (
	__IDModelElementLink__ Integer NOT NULL,
	PRIMARY KEY ModelElementLink (__IDModelElementLink__)
) ;

CREATE TABLE EmbeddingLink (
	__IDEmbeddingLink__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES ModelElement (__IDModelElement__),
	PRIMARY KEY EmbeddingLink (__IDEmbeddingLink__),
	__FKowner__ Integer
) ;

CREATE TABLE ReferenceLink (
	__IDReferenceLink__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES ModelElement (__IDModelElement__),
	FOREIGN KEY modelElement (__FKmodelElement__) REFERENCES ModelElementLink (__IDModelElementLink__),
	PRIMARY KEY ReferenceLink (__IDReferenceLink__),
	__FKmodelElement__ Integer,
	__FKowner__ Integer
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES ModelElement (__IDModelElement__),
	FOREIGN KEY value (__FKvalue__) REFERENCES Value (__IDValue__),
	PRIMARY KEY Property (__IDProperty__),
	__FKowner__ Integer,
	__FKvalue__ Integer
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	FOREIGN KEY element (__FKelement__) REFERENCES ModelElement (__IDModelElement__),
	FOREIGN KEY owner (__FKowner__) REFERENCES ReferenceLink (__IDReferenceLink__),
	PRIMARY KEY Role (__IDRole__),
	__FKelement__ Integer,
	__FKowner__ Integer
) ;

CREATE TABLE Value (
	__IDValue__ Integer NOT NULL,
	PRIMARY KEY Value (__IDValue__)
) ;

CREATE TABLE IntegerValue (
	__IDIntegerValue__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY IntegerValue (__IDIntegerValue__)
) ;

CREATE TABLE DoubleValue (
	__IDDoubleValue__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY DoubleValue (__IDDoubleValue__)
) ;

CREATE TABLE BooleanValue (
	__IDBooleanValue__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY BooleanValue (__IDBooleanValue__)
) ;

CREATE TABLE StringValue (
	__IDStringValue__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringValue (__IDStringValue__)
) ;

CREATE TABLE ModelElement_embeddinglinks_EmbeddingLink (
	__IDModelElement__ Integer NOT NULL,
	__IDEmbeddingLink__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_referencelinks_ReferenceLink (
	__IDModelElement__ Integer NOT NULL,
	__IDReferenceLink__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_properties_Property (
	__IDModelElement__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE ReferenceLink_roles_Role (
	__IDReferenceLink__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE ModelElementLink_links_ReferenceLink (
	__IDModelElementLink__ Integer NOT NULL,
	__IDReferenceLink__ Integer NOT NULL
) ;

CREATE TABLE Model_contents_ModelElement (
	__IDModel__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE EmbeddingLink_elements_ModelElement (
	__IDEmbeddingLink__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;
