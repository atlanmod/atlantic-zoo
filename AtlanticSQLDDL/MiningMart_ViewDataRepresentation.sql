CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	PRIMARY KEY ModelElement (__IDModelElement__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE StructuralFeature (
	__IDStructuralFeature__ Integer NOT NULL,
	PRIMARY KEY StructuralFeature (__IDStructuralFeature__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	name text,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	FOREIGN KEY attribute (__FKattribute__) REFERENCES Attribute (__IDAttribute__),
	PRIMARY KEY DataType (__IDDataType__),
	__FKattribute__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	FOREIGN KEY class (__FKclass__) REFERENCES Class (__IDClass__),
	FOREIGN KEY has (__FKhas__) REFERENCES DataType (__IDDataType__),
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKhas__ Integer,
	__FKclass__ Integer
) ;

CREATE TABLE "Column" (
	__IDColumn__ Integer NOT NULL,
	name text,
	FOREIGN KEY dataType (__FKdataType__) REFERENCES DataType (__IDDataType__),
	FOREIGN KEY belongsToColumnSet (__FKbelongsToColumnSet__) REFERENCES ColumnSet (__IDColumnSet__),
	FOREIGN KEY corespondsToBaseAttribute (__FKcorespondsToBaseAttribute__) REFERENCES BaseAttribute (__IDBaseAttribute__),
	PRIMARY KEY "Column" (__IDColumn__),
	__FKdataType__ Integer,
	__FKcorespondsToBaseAttribute__ Integer,
	__FKbelongsToColumnSet__ Integer
) ;

CREATE TABLE ColumnSet (
	__IDColumnSet__ Integer NOT NULL,
	number Integer,
	file text,
	dbConnectString text,
	user text,
	FOREIGN KEY correspondsToConcept (__FKcorrespondsToConcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY correspondsToRelationShip (__FKcorrespondsToRelationShip__) REFERENCES RelationShip (__IDRelationShip__),
	PRIMARY KEY ColumnSet (__IDColumnSet__),
	__FKcorrespondsToRelationShip__ Integer,
	__FKcorrespondsToConcept__ Integer
) ;

CREATE TABLE ColumnStatistics (
	__IDColumnStatistics__ Integer NOT NULL,
	"unique" Integer,
	missing Integer,
	min Integer,
	max Integer,
	average Integer,
	standarDeviation Integer,
	distributionValue text,
	distributionCount Integer,
	distributionMin Integer,
	distributionMax Integer,
	FOREIGN KEY forColumn (__FKforColumn__) REFERENCES "Column" (__IDColumn__),
	PRIMARY KEY ColumnStatistics (__IDColumnStatistics__),
	__FKforColumn__ Integer
) ;

CREATE TABLE ColumnSetStatistics (
	__IDColumnSetStatistics__ Integer NOT NULL,
	allNumber Integer,
	ordinalNumber Integer,
	nominalNumber Integer,
	timeNumber Integer,
	FOREIGN KEY forColumnSet (__FKforColumnSet__) REFERENCES ColumnSet (__IDColumnSet__),
	PRIMARY KEY ColumnSetStatistics (__IDColumnSetStatistics__),
	__FKforColumnSet__ Integer
) ;

CREATE TABLE Snapshot (
	__IDSnapshot__ Integer NOT NULL,
	PRIMARY KEY Snapshot (__IDSnapshot__)
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	PRIMARY KEY "Table" (__IDTable__)
) ;

CREATE TABLE View (
	__IDView__ Integer NOT NULL,
	PRIMARY KEY View (__IDView__)
) ;

CREATE TABLE "Key" (
	__IDKey__ Integer NOT NULL,
	isUsedForIndex Boolean,
	FOREIGN KEY isAssociatedToColumnSet (__FKisAssociatedToColumnSet__) REFERENCES ColumnSet (__IDColumnSet__),
	PRIMARY KEY "Key" (__IDKey__),
	__FKisAssociatedToColumnSet__ Integer
) ;

CREATE TABLE ForeignKey (
	__IDForeignKey__ Integer NOT NULL,
	FOREIGN KEY isConnectionTo (__FKisConnectionTo__) REFERENCES "Table" (__IDTable__),
	FOREIGN KEY correspondsToRelationShip (__FKcorrespondsToRelationShip__) REFERENCES RelationShip (__IDRelationShip__),
	PRIMARY KEY ForeignKey (__IDForeignKey__),
	__FKcorrespondsToRelationShip__ Integer,
	__FKisConnectionTo__ Integer
) ;

CREATE TABLE PrimaryKey (
	__IDPrimaryKey__ Integer NOT NULL,
	PRIMARY KEY PrimaryKey (__IDPrimaryKey__)
) ;

CREATE TABLE Concept (
	__IDConcept__ Integer NOT NULL,
	subConceptRestriction text,
	FOREIGN KEY isA (__FKisA__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY FromConcept (__FKFromConcept__) REFERENCES RelationShip (__IDRelationShip__),
	FOREIGN KEY ToConcept (__FKToConcept__) REFERENCES RelationShip (__IDRelationShip__),
	FOREIGN KEY correspondsToColumnSet (__FKcorrespondsToColumnSet__) REFERENCES ColumnSet (__IDColumnSet__),
	PRIMARY KEY Concept (__IDConcept__),
	__FKisA__ Integer,
	__FKToConcept__ Integer,
	__FKFromConcept__ Integer,
	__FKcorrespondsToColumnSet__ Integer
) ;

CREATE TABLE RelationShip (
	__IDRelationShip__ Integer NOT NULL,
	name text,
	subRelationShipRestriction text,
	defined text,
	FOREIGN KEY isA (__FKisA__) REFERENCES RelationShip (__IDRelationShip__),
	FOREIGN KEY correspondsToColumnSet (__FKcorrespondsToColumnSet__) REFERENCES ColumnSet (__IDColumnSet__),
	FOREIGN KEY FromConcept (__FKFromConcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY ToConcept (__FKToConcept__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY RelationShip (__IDRelationShip__),
	__FKisA__ Integer,
	__FKcorrespondsToColumnSet__ Integer,
	__FKFromConcept__ Integer,
	__FKToConcept__ Integer
) ;

CREATE TABLE FeatureAttribute (
	__IDFeatureAttribute__ Integer NOT NULL,
	name text,
	relevanceForMining Boolean,
	FOREIGN KEY attributeType (__FKattributeType__) REFERENCES DataType (__IDDataType__),
	FOREIGN KEY belongsToConcept (__FKbelongsToConcept__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY FeatureAttribute (__IDFeatureAttribute__),
	__FKbelongsToConcept__ Integer,
	__FKattributeType__ Integer
) ;

CREATE TABLE BaseAttribute (
	__IDBaseAttribute__ Integer NOT NULL,
	FOREIGN KEY isPartMultiColumnFeature (__FKisPartMultiColumnFeature__) REFERENCES MultiColumnFeature (__IDMultiColumnFeature__),
	FOREIGN KEY domainDataType (__FKdomainDataType__) REFERENCES DomainDataType (__IDDomainDataType__),
	PRIMARY KEY BaseAttribute (__IDBaseAttribute__),
	__FKisPartMultiColumnFeature__ Integer,
	__FKdomainDataType__ Integer
) ;

CREATE TABLE MultiColumnFeature (
	__IDMultiColumnFeature__ Integer NOT NULL,
	PRIMARY KEY MultiColumnFeature (__IDMultiColumnFeature__)
) ;

CREATE TABLE Value (
	__IDValue__ Integer NOT NULL,
	name text,
	FOREIGN KEY domainDataType (__FKdomainDataType__) REFERENCES DomainDataType (__IDDomainDataType__),
	PRIMARY KEY Value (__IDValue__),
	__FKdomainDataType__ Integer
) ;

CREATE TABLE UserInput (
	__IDUserInput__ Integer NOT NULL,
	PRIMARY KEY UserInput (__IDUserInput__)
) ;

CREATE TABLE Ordinal (
	__IDOrdinal__ Integer NOT NULL,
	PRIMARY KEY Ordinal (__IDOrdinal__)
) ;

CREATE TABLE Scalar (
	__IDScalar__ Integer NOT NULL,
	PRIMARY KEY Scalar (__IDScalar__)
) ;

CREATE TABLE Time (
	__IDTime__ Integer NOT NULL,
	PRIMARY KEY Time (__IDTime__)
) ;

CREATE TABLE "Binary" (
	__IDBinary__ Integer NOT NULL,
	PRIMARY KEY "Binary" (__IDBinary__)
) ;

CREATE TABLE Categorial (
	__IDCategorial__ Integer NOT NULL,
	PRIMARY KEY Categorial (__IDCategorial__)
) ;

CREATE TABLE KeyAttribute (
	__IDKeyAttribute__ Integer NOT NULL,
	PRIMARY KEY KeyAttribute (__IDKeyAttribute__)
) ;

CREATE TABLE TimeGroup (
	__IDTimeGroup__ Integer NOT NULL,
	PRIMARY KEY TimeGroup (__IDTimeGroup__)
) ;

CREATE TABLE "Spatial" (
	__IDSpatial__ Integer NOT NULL,
	PRIMARY KEY "Spatial" (__IDSpatial__)
) ;

CREATE TABLE Constant (
	__IDConstant__ Integer NOT NULL,
	PRIMARY KEY Constant (__IDConstant__)
) ;

CREATE TABLE RoleRestriction (
	__IDRoleRestriction__ Integer NOT NULL,
	name text,
	FOREIGN KEY restrictionForRelationShip (__FKrestrictionForRelationShip__) REFERENCES RelationShip (__IDRelationShip__),
	FOREIGN KEY restrictionForConcept (__FKrestrictionForConcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY restrictionToConcept (__FKrestrictionToConcept__) REFERENCES Concept (__IDConcept__),
	min Integer,
	max Integer,
	FOREIGN KEY belongsToConcept (__FKbelongsToConcept__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY RoleRestriction (__IDRoleRestriction__),
	__FKbelongsToConcept__ Integer,
	__FKrestrictionForRelationShip__ Integer,
	__FKrestrictionForConcept__ Integer,
	__FKrestrictionToConcept__ Integer
) ;

CREATE TABLE DomainDataType (
	__IDDomainDataType__ Integer NOT NULL,
	FOREIGN KEY baseAttributeD (__FKbaseAttributeD__) REFERENCES BaseAttribute (__IDBaseAttribute__),
	PRIMARY KEY DomainDataType (__IDDomainDataType__),
	__FKbaseAttributeD__ Integer
) ;

CREATE TABLE Nominal (
	__IDNominal__ Integer NOT NULL,
	PRIMARY KEY Nominal (__IDNominal__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	PRIMARY KEY Parameter (__IDParameter__)
) ;

CREATE TABLE Class_attributes_Attribute (
	__IDClass__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE MultiColumnFeature_consitsOfBaseAttributes_BaseAttribute (
	__IDMultiColumnFeature__ Integer NOT NULL,
	__IDBaseAttribute__ Integer NOT NULL
) ;

CREATE TABLE UserInput_containsValues_Value (
	__IDUserInput__ Integer NOT NULL,
	__IDValue__ Integer NOT NULL
) ;

CREATE TABLE RelationShip_correspondsToForeignKey_ForeignKey (
	__IDRelationShip__ Integer NOT NULL,
	__IDForeignKey__ Integer NOT NULL
) ;

CREATE TABLE ColumnSet_hasColumn_Column (
	__IDColumnSet__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Value_belongsToUserInput_UserInput (
	__IDValue__ Integer NOT NULL,
	__IDUserInput__ Integer NOT NULL
) ;

CREATE TABLE Column_keys_Key (
	__IDColumn__ Integer NOT NULL,
	__IDKey__ Integer NOT NULL
) ;

CREATE TABLE ColumnSet_hasKey_Key (
	__IDColumnSet__ Integer NOT NULL,
	__IDKey__ Integer NOT NULL
) ;

CREATE TABLE FeatureAttribute_correspondsToColumns_Column (
	__IDFeatureAttribute__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Key_hasColumn_Column (
	__IDKey__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;
