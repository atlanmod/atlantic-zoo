CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE ExtendedIdentifier (
	__IDExtendedIdentifier__ Integer NOT NULL,
	FOREIGN KEY parentIdentifier (__FKparentIdentifier__) REFERENCES ExtendedIdentifier (__IDExtendedIdentifier__),
	FOREIGN KEY extendedIdentifierOwner (__FKextendedIdentifierOwner__) REFERENCES Extended (__IDExtended__),
	PRIMARY KEY ExtendedIdentifier (__IDExtendedIdentifier__),
	__FKextendedIdentifierOwner__ Integer,
	__FKparentIdentifier__ Integer
) ;

CREATE TABLE Extended (
	__IDExtended__ Integer NOT NULL,
	FOREIGN KEY extendedIdentifier (__FKextendedIdentifier__) REFERENCES ExtendedIdentifier (__IDExtendedIdentifier__),
	PRIMARY KEY Extended (__IDExtended__),
	__FKextendedIdentifier__ Integer
) ;

CREATE TABLE Definition (
	__IDDefinition__ Integer NOT NULL,
	PRIMARY KEY Definition (__IDDefinition__)
) ;

CREATE TABLE RuleSet (
	__IDRuleSet__ Integer NOT NULL,
	FOREIGN KEY propertyDefinitions (__FKpropertyDefinitions__) REFERENCES PropertyDefinition (__IDPropertyDefinition__),
	PRIMARY KEY RuleSet (__IDRuleSet__),
	__FKpropertyDefinitions__ Integer
) ;

CREATE TABLE ImportDefinition (
	__IDImportDefinition__ Integer NOT NULL,
	FOREIGN KEY importDefinitionOwners (__FKimportDefinitionOwners__) REFERENCES RuleSet (__IDRuleSet__),
	dotStar Boolean,
	PRIMARY KEY ImportDefinition (__IDImportDefinition__),
	__FKimportDefinitionOwners__ Integer
) ;

CREATE TABLE RuleSet_importDefinitions_ImportDefinition (
	__IDRuleSet__ Integer NOT NULL,
	__IDImportDefinition__ Integer NOT NULL
) ;

CREATE TABLE RuleSet_rulesetElementDefinitions_RulesetElementDefinition (
	__IDRuleSet__ Integer NOT NULL,
	__IDRulesetElementDefinition__ Integer NOT NULL
) ;
