CREATE TABLE RelationSchip (
	__IDRelationSchip__ Integer NOT NULL,
	FOREIGN KEY "constraint" (__FKconstraint__) REFERENCES "Constraint" (__IDConstraint__),
	PRIMARY KEY RelationSchip (__IDRelationSchip__),
	__FKconstraint__ Integer
) ;

CREATE TABLE ConstrainedRelationSchip (
	__IDConstrainedRelationSchip__ Integer NOT NULL,
	PRIMARY KEY ConstrainedRelationSchip (__IDConstrainedRelationSchip__)
) ;

CREATE TABLE Aggregation (
	__IDAggregation__ Integer NOT NULL,
	PRIMARY KEY Aggregation (__IDAggregation__)
) ;

CREATE TABLE Composition (
	__IDComposition__ Integer NOT NULL,
	PRIMARY KEY Composition (__IDComposition__)
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	PRIMARY KEY Association (__IDAssociation__)
) ;

CREATE TABLE Generalisation (
	__IDGeneralisation__ Integer NOT NULL,
	PRIMARY KEY Generalisation (__IDGeneralisation__)
) ;

CREATE TABLE Dependency (
	__IDDependency__ Integer NOT NULL,
	PRIMARY KEY Dependency (__IDDependency__)
) ;

CREATE TABLE AssociationEnd (
	__IDAssociationEnd__ Integer NOT NULL,
	PRIMARY KEY AssociationEnd (__IDAssociationEnd__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	FOREIGN KEY steriotype (__FKsteriotype__) REFERENCES Steriotype (__IDSteriotype__),
	FOREIGN KEY parent (__FKparent__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY Package (__IDPackage__),
	__FKsteriotype__ Integer,
	__FKparent__ Integer
) ;

CREATE TABLE Steriotype (
	__IDSteriotype__ Integer NOT NULL,
	PRIMARY KEY Steriotype (__IDSteriotype__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	FOREIGN KEY details (__FKdetails__) REFERENCES MetaData (__IDMetaData__),
	FOREIGN KEY operations (__FKoperations__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY steriotype (__FKsteriotype__) REFERENCES Steriotype (__IDSteriotype__),
	PRIMARY KEY Class (__IDClass__),
	__FKdetails__ Integer,
	__FKsteriotype__ Integer,
	__FKoperations__ Integer
) ;

CREATE TABLE "Constraint" (
	__IDConstraint__ Integer NOT NULL,
	FOREIGN KEY caracteristic (__FKcaracteristic__) REFERENCES Characteristic (__IDCharacteristic__),
	FOREIGN KEY theClass (__FKtheClass__) REFERENCES Class (__IDClass__),
	PRIMARY KEY "Constraint" (__IDConstraint__),
	__FKtheClass__ Integer,
	__FKcaracteristic__ Integer
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	FOREIGN KEY detail (__FKdetail__) REFERENCES MetaData (__IDMetaData__),
	FOREIGN KEY steriotype (__FKsteriotype__) REFERENCES Steriotype (__IDSteriotype__),
	FOREIGN KEY behaviour (__FKbehaviour__) REFERENCES Class (__IDClass__),
	PRIMARY KEY Operation (__IDOperation__),
	__FKdetail__ Integer,
	__FKsteriotype__ Integer,
	__FKbehaviour__ Integer
) ;

CREATE TABLE Characteristic (
	__IDCharacteristic__ Integer NOT NULL,
	FOREIGN KEY details (__FKdetails__) REFERENCES MetaData (__IDMetaData__),
	FOREIGN KEY rule (__FKrule__) REFERENCES BusnissRule (__IDBusnissRule__),
	FOREIGN KEY operations (__FKoperations__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY theClass (__FKtheClass__) REFERENCES Class (__IDClass__),
	FOREIGN KEY relationSchip (__FKrelationSchip__) REFERENCES RelationSchip (__IDRelationSchip__),
	FOREIGN KEY "constraint" (__FKconstraint__) REFERENCES "Constraint" (__IDConstraint__),
	PRIMARY KEY Characteristic (__IDCharacteristic__),
	__FKoperations__ Integer,
	__FKrelationSchip__ Integer,
	__FKdetails__ Integer,
	__FKrule__ Integer,
	__FKtheClass__ Integer,
	__FKconstraint__ Integer
) ;

CREATE TABLE BusnissRule (
	__IDBusnissRule__ Integer NOT NULL,
	FOREIGN KEY characteristic (__FKcharacteristic__) REFERENCES Characteristic (__IDCharacteristic__),
	PRIMARY KEY BusnissRule (__IDBusnissRule__),
	__FKcharacteristic__ Integer
) ;

CREATE TABLE MetaData (
	__IDMetaData__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	FOREIGN KEY characteristic (__FKcharacteristic__) REFERENCES Characteristic (__IDCharacteristic__),
	FOREIGN KEY operations (__FKoperations__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY theClass (__FKtheClass__) REFERENCES Class (__IDClass__),
	PRIMARY KEY MetaData (__IDMetaData__),
	__FKtheClass__ Integer,
	__FKcharacteristic__ Integer,
	__FKsource__ Integer,
	__FKoperations__ Integer
) ;

CREATE TABLE Source (
	__IDSource__ Integer NOT NULL,
	FOREIGN KEY metaData (__FKmetaData__) REFERENCES MetaData (__IDMetaData__),
	PRIMARY KEY Source (__IDSource__),
	__FKmetaData__ Integer
) ;

CREATE TABLE Domain (
	__IDDomain__ Integer NOT NULL,
	PRIMARY KEY Domain (__IDDomain__)
) ;

CREATE TABLE DescriptiveAttribute (
	__IDDescriptiveAttribute__ Integer NOT NULL,
	FOREIGN KEY tempsDef (__FKtempsDef__) REFERENCES Temporality (__IDTemporality__),
	FOREIGN KEY specialDef (__FKspecialDef__) REFERENCES Geometry (__IDGeometry__),
	FOREIGN KEY steriotype (__FKsteriotype__) REFERENCES Steriotype (__IDSteriotype__),
	FOREIGN KEY domain (__FKdomain__) REFERENCES Domain (__IDDomain__),
	PRIMARY KEY DescriptiveAttribute (__IDDescriptiveAttribute__),
	__FKdomain__ Integer,
	__FKsteriotype__ Integer,
	__FKtempsDef__ Integer,
	__FKspecialDef__ Integer
) ;

CREATE TABLE Geometry (
	__IDGeometry__ Integer NOT NULL,
	FOREIGN KEY tempsDef (__FKtempsDef__) REFERENCES Temporality (__IDTemporality__),
	FOREIGN KEY descriptiveAttributeg (__FKdescriptiveAttributeg__) REFERENCES DescriptiveAttribute (__IDDescriptiveAttribute__),
	PRIMARY KEY Geometry (__IDGeometry__),
	__FKdescriptiveAttributeg__ Integer,
	__FKtempsDef__ Integer
) ;

CREATE TABLE Temporality (
	__IDTemporality__ Integer NOT NULL,
	FOREIGN KEY geometry (__FKgeometry__) REFERENCES Geometry (__IDGeometry__),
	FOREIGN KEY descriptiveAttributet (__FKdescriptiveAttributet__) REFERENCES DescriptiveAttribute (__IDDescriptiveAttribute__),
	PRIMARY KEY Temporality (__IDTemporality__),
	__FKgeometry__ Integer,
	__FKdescriptiveAttributet__ Integer
) ;

CREATE TABLE VisualInfo (
	__IDVisualInfo__ Integer NOT NULL,
	PRIMARY KEY VisualInfo (__IDVisualInfo__)
) ;

CREATE TABLE Value (
	__IDValue__ Integer NOT NULL,
	FOREIGN KEY enumeratedDomain (__FKenumeratedDomain__) REFERENCES EnumeratedDomain (__IDEnumeratedDomain__),
	PRIMARY KEY Value (__IDValue__),
	__FKenumeratedDomain__ Integer
) ;

CREATE TABLE RangeDomain (
	__IDRangeDomain__ Integer NOT NULL,
	PRIMARY KEY RangeDomain (__IDRangeDomain__)
) ;

CREATE TABLE EnumeratedDomain (
	__IDEnumeratedDomain__ Integer NOT NULL,
	PRIMARY KEY EnumeratedDomain (__IDEnumeratedDomain__)
) ;

CREATE TABLE PerceptorySteriotype (
	__IDPerceptorySteriotype__ Integer NOT NULL,
	PRIMARY KEY PerceptorySteriotype (__IDPerceptorySteriotype__)
) ;

CREATE TABLE Steriotype_operations_Operation (
	__IDSteriotype__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Package_relationSchip_RelationSchip (
	__IDPackage__ Integer NOT NULL,
	__IDRelationSchip__ Integer NOT NULL
) ;

CREATE TABLE Steriotype_thePackage_Package (
	__IDSteriotype__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE Operation_affectFeature_Class (
	__IDOperation__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Steriotype_theClass_Class (
	__IDSteriotype__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Package_children_Package (
	__IDPackage__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE Domain_descriptiveAttribute_DescriptiveAttribute (
	__IDDomain__ Integer NOT NULL,
	__IDDescriptiveAttribute__ Integer NOT NULL
) ;

CREATE TABLE RelationSchip_steriotype_Steriotype (
	__IDRelationSchip__ Integer NOT NULL,
	__IDSteriotype__ Integer NOT NULL
) ;

CREATE TABLE RelationSchip_packages_Package (
	__IDRelationSchip__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE Operation_inCharacteristic_Characteristic (
	__IDOperation__ Integer NOT NULL,
	__IDCharacteristic__ Integer NOT NULL
) ;

CREATE TABLE Class_characteristic_Characteristic (
	__IDClass__ Integer NOT NULL,
	__IDCharacteristic__ Integer NOT NULL
) ;

CREATE TABLE Package_connectedRelationSchip_RelationSchip (
	__IDPackage__ Integer NOT NULL,
	__IDRelationSchip__ Integer NOT NULL
) ;

CREATE TABLE EnumeratedDomain_value_Value (
	__IDEnumeratedDomain__ Integer NOT NULL,
	__IDValue__ Integer NOT NULL
) ;

CREATE TABLE RelationSchip_affectCharacteristic_Characteristic (
	__IDRelationSchip__ Integer NOT NULL,
	__IDCharacteristic__ Integer NOT NULL
) ;

CREATE TABLE Class_packages_Package (
	__IDClass__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE Steriotype_relationSchip_RelationSchip (
	__IDSteriotype__ Integer NOT NULL,
	__IDRelationSchip__ Integer NOT NULL
) ;

CREATE TABLE Constraint_relationSchip_RelationSchip (
	__IDConstraint__ Integer NOT NULL,
	__IDRelationSchip__ Integer NOT NULL
) ;

CREATE TABLE Package_classes_Class (
	__IDPackage__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Steriotype_descriptiveAttribute_DescriptiveAttribute (
	__IDSteriotype__ Integer NOT NULL,
	__IDDescriptiveAttribute__ Integer NOT NULL
) ;

CREATE TABLE Class_myOperations_Operation (
	__IDClass__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Class_constraint_Constraint (
	__IDClass__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE RelationSchip_associatePackages_Package (
	__IDRelationSchip__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;
