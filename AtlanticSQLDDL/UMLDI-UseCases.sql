CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES Namespace (__IDNamespace__),
	name text,
	visibility text,
	isSpecification Boolean,
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKnamespace__ Integer
) ;

CREATE TABLE GeneralizableElement (
	__IDGeneralizableElement__ Integer NOT NULL,
	isRoot Boolean,
	isLeaf Boolean,
	isAbstract Boolean,
	PRIMARY KEY GeneralizableElement (__IDGeneralizableElement__)
) ;

CREATE TABLE Namespace (
	__IDNamespace__ Integer NOT NULL,
	PRIMARY KEY Namespace (__IDNamespace__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE Feature (
	__IDFeature__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Classifier (__IDClassifier__),
	ownerScope text,
	PRIMARY KEY Feature (__IDFeature__),
	__FKowner__ Integer
) ;

CREATE TABLE StructuralFeature (
	__IDStructuralFeature__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Classifier (__IDClassifier__),
	multiplicity text,
	changeability text,
	targetScope text,
	ordering text,
	PRIMARY KEY StructuralFeature (__IDStructuralFeature__),
	__FKtype__ Integer
) ;

CREATE TABLE AssociationEnd (
	__IDAssociationEnd__ Integer NOT NULL,
	FOREIGN KEY association (__FKassociation__) REFERENCES Association (__IDAssociation__),
	FOREIGN KEY participant (__FKparticipant__) REFERENCES Classifier (__IDClassifier__),
	isNavigable Boolean,
	ordering text,
	aggregation text,
	targetScope text,
	multiplicity text,
	changeability text,
	PRIMARY KEY AssociationEnd (__IDAssociationEnd__),
	__FKparticipant__ Integer,
	__FKassociation__ Integer
) ;

CREATE TABLE Relationship (
	__IDRelationship__ Integer NOT NULL,
	PRIMARY KEY Relationship (__IDRelationship__)
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	PRIMARY KEY Association (__IDAssociation__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	FOREIGN KEY associationEnd (__FKassociationEnd__) REFERENCES AssociationEnd (__IDAssociationEnd__),
	initialValue text,
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKassociationEnd__ Integer
) ;

CREATE TABLE Generalization (
	__IDGeneralization__ Integer NOT NULL,
	FOREIGN KEY parent (__FKparent__) REFERENCES GeneralizableElement (__IDGeneralizableElement__),
	FOREIGN KEY powertype (__FKpowertype__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY child (__FKchild__) REFERENCES GeneralizableElement (__IDGeneralizableElement__),
	discriminator text,
	PRIMARY KEY Generalization (__IDGeneralization__),
	__FKchild__ Integer,
	__FKpowertype__ Integer,
	__FKparent__ Integer
) ;

CREATE TABLE Instance (
	__IDInstance__ Integer NOT NULL,
	FOREIGN KEY componentInstance (__FKcomponentInstance__) REFERENCES ComponentInstance (__IDComponentInstance__),
	PRIMARY KEY Instance (__IDInstance__),
	__FKcomponentInstance__ Integer
) ;

CREATE TABLE AttributeLink (
	__IDAttributeLink__ Integer NOT NULL,
	FOREIGN KEY instance (__FKinstance__) REFERENCES Instance (__IDInstance__),
	FOREIGN KEY value (__FKvalue__) REFERENCES Instance (__IDInstance__),
	FOREIGN KEY linkEnd (__FKlinkEnd__) REFERENCES LinkEnd (__IDLinkEnd__),
	FOREIGN KEY attribute (__FKattribute__) REFERENCES Attribute (__IDAttribute__),
	PRIMARY KEY AttributeLink (__IDAttributeLink__),
	__FKattribute__ Integer,
	__FKvalue__ Integer,
	__FKinstance__ Integer,
	__FKlinkEnd__ Integer
) ;

CREATE TABLE Link (
	__IDLink__ Integer NOT NULL,
	FOREIGN KEY association (__FKassociation__) REFERENCES Association (__IDAssociation__),
	PRIMARY KEY Link (__IDLink__),
	__FKassociation__ Integer
) ;

CREATE TABLE LinkEnd (
	__IDLinkEnd__ Integer NOT NULL,
	FOREIGN KEY link (__FKlink__) REFERENCES Link (__IDLink__),
	FOREIGN KEY instance (__FKinstance__) REFERENCES Instance (__IDInstance__),
	FOREIGN KEY associationEnd (__FKassociationEnd__) REFERENCES AssociationEnd (__IDAssociationEnd__),
	PRIMARY KEY LinkEnd (__IDLinkEnd__),
	__FKlink__ Integer,
	__FKassociationEnd__ Integer,
	__FKinstance__ Integer
) ;

CREATE TABLE ComponentInstance (
	__IDComponentInstance__ Integer NOT NULL,
	FOREIGN KEY nodeInstance (__FKnodeInstance__) REFERENCES NodeInstance (__IDNodeInstance__),
	PRIMARY KEY ComponentInstance (__IDComponentInstance__),
	__FKnodeInstance__ Integer
) ;

CREATE TABLE NodeInstance (
	__IDNodeInstance__ Integer NOT NULL,
	PRIMARY KEY NodeInstance (__IDNodeInstance__)
) ;

CREATE TABLE UseCase (
	__IDUseCase__ Integer NOT NULL,
	PRIMARY KEY UseCase (__IDUseCase__)
) ;

CREATE TABLE Actor (
	__IDActor__ Integer NOT NULL,
	PRIMARY KEY Actor (__IDActor__)
) ;

CREATE TABLE UseCaseInstance (
	__IDUseCaseInstance__ Integer NOT NULL,
	PRIMARY KEY UseCaseInstance (__IDUseCaseInstance__)
) ;

CREATE TABLE Extend (
	__IDExtend__ Integer NOT NULL,
	FOREIGN KEY extension (__FKextension__) REFERENCES UseCase (__IDUseCase__),
	FOREIGN KEY base (__FKbase__) REFERENCES UseCase (__IDUseCase__),
	"condition" text,
	PRIMARY KEY Extend (__IDExtend__),
	__FKextension__ Integer,
	__FKbase__ Integer
) ;

CREATE TABLE Include (
	__IDInclude__ Integer NOT NULL,
	FOREIGN KEY addition (__FKaddition__) REFERENCES UseCase (__IDUseCase__),
	FOREIGN KEY base (__FKbase__) REFERENCES UseCase (__IDUseCase__),
	PRIMARY KEY Include (__IDInclude__),
	__FKaddition__ Integer,
	__FKbase__ Integer
) ;

CREATE TABLE ExtensionPoint (
	__IDExtensionPoint__ Integer NOT NULL,
	FOREIGN KEY useCase (__FKuseCase__) REFERENCES UseCase (__IDUseCase__),
	location text,
	PRIMARY KEY ExtensionPoint (__IDExtensionPoint__),
	__FKuseCase__ Integer
) ;

CREATE TABLE Multiplicity (
	__IDMultiplicity__ Integer NOT NULL,
	PRIMARY KEY Multiplicity (__IDMultiplicity__)
) ;

CREATE TABLE MultiplicityRange (
	__IDMultiplicityRange__ Integer NOT NULL,
	FOREIGN KEY multiplicity (__FKmultiplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	lower Integer,
	upper Integer,
	PRIMARY KEY MultiplicityRange (__IDMultiplicityRange__),
	__FKmultiplicity__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	language text,
	body text,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE BooleanExpression (
	__IDBooleanExpression__ Integer NOT NULL,
	PRIMARY KEY BooleanExpression (__IDBooleanExpression__)
) ;

CREATE TABLE Classifier_feature_Feature (
	__IDClassifier__ Integer NOT NULL,
	__IDFeature__ Integer NOT NULL
) ;

CREATE TABLE Association_connection_AssociationEnd (
	__IDAssociation__ Integer NOT NULL,
	__IDAssociationEnd__ Integer NOT NULL
) ;

CREATE TABLE Multiplicity_range_MultiplicityRange (
	__IDMultiplicity__ Integer NOT NULL,
	__IDMultiplicityRange__ Integer NOT NULL
) ;

CREATE TABLE NodeInstance_resident_ComponentInstance (
	__IDNodeInstance__ Integer NOT NULL,
	__IDComponentInstance__ Integer NOT NULL
) ;

CREATE TABLE UseCase_extensionPoint_ExtensionPoint (
	__IDUseCase__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE ComponentInstance_resident_Instance (
	__IDComponentInstance__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE AssociationEnd_specification_Classifier (
	__IDAssociationEnd__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE AssociationEnd_qualifier_Attribute (
	__IDAssociationEnd__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE LinkEnd_qualifiedValue_AttributeLink (
	__IDLinkEnd__ Integer NOT NULL,
	__IDAttributeLink__ Integer NOT NULL
) ;

CREATE TABLE Extend_extensionPoint_ExtensionPoint (
	__IDExtend__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE Link_connection_LinkEnd (
	__IDLink__ Integer NOT NULL,
	__IDLinkEnd__ Integer NOT NULL
) ;

CREATE TABLE Namespace_ownedElement_ModelElement (
	__IDNamespace__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE Instance_linkEnd_LinkEnd (
	__IDInstance__ Integer NOT NULL,
	__IDLinkEnd__ Integer NOT NULL
) ;

CREATE TABLE Classifier_powertypeRange_Generalization (
	__IDClassifier__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE Instance_ownedLink_Link (
	__IDInstance__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE Instance_classifier_Classifier (
	__IDInstance__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Instance_ownedInstance_Instance (
	__IDInstance__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE UseCase_extend_Extend (
	__IDUseCase__ Integer NOT NULL,
	__IDExtend__ Integer NOT NULL
) ;

CREATE TABLE Instance_slot_AttributeLink (
	__IDInstance__ Integer NOT NULL,
	__IDAttributeLink__ Integer NOT NULL
) ;

CREATE TABLE UseCase_include_Include (
	__IDUseCase__ Integer NOT NULL,
	__IDInclude__ Integer NOT NULL
) ;

CREATE TABLE GeneralizableElement_generalization_Generalization (
	__IDGeneralizableElement__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;
