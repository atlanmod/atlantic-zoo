CREATE TABLE ReactionRuleSet (
	__IDReactionRuleSet__ Integer NOT NULL,
	PRIMARY KEY ReactionRuleSet (__IDReactionRuleSet__)
) ;

CREATE TABLE ProductionRuleSet (
	__IDProductionRuleSet__ Integer NOT NULL,
	PRIMARY KEY ProductionRuleSet (__IDProductionRuleSet__)
) ;

CREATE TABLE EventType (
	__IDEventType__ Integer NOT NULL,
	eventTypeID text,
	PRIMARY KEY EventType (__IDEventType__)
) ;

CREATE TABLE RuleSet (
	__IDRuleSet__ Integer NOT NULL,
	FOREIGN KEY externalVocabulary (__FKexternalVocabulary__) REFERENCES ExternalVocabulary (__IDExternalVocabulary__),
	FOREIGN KEY vocabularies (__FKvocabularies__) REFERENCES Vocabulary (__IDVocabulary__),
	ruleSetID text,
	PRIMARY KEY RuleSet (__IDRuleSet__),
	__FKexternalVocabulary__ Integer,
	__FKvocabularies__ Integer
) ;

CREATE TABLE RuleBase (
	__IDRuleBase__ Integer NOT NULL,
	FOREIGN KEY vocabularies (__FKvocabularies__) REFERENCES Vocabulary (__IDVocabulary__),
	ruleBaseID text,
	PRIMARY KEY RuleBase (__IDRuleBase__),
	__FKvocabularies__ Integer
) ;

CREATE TABLE IntegrityRuleSet (
	__IDIntegrityRuleSet__ Integer NOT NULL,
	PRIMARY KEY IntegrityRuleSet (__IDIntegrityRuleSet__)
) ;

CREATE TABLE DerivationRuleSet (
	__IDDerivationRuleSet__ Integer NOT NULL,
	PRIMARY KEY DerivationRuleSet (__IDDerivationRuleSet__)
) ;

CREATE TABLE IntegrityRuleSet_rules_IntegrityRule (
	__IDIntegrityRuleSet__ Integer NOT NULL,
	__IDIntegrityRule__ Integer NOT NULL
) ;

CREATE TABLE ProductionRuleSet_rules_ProductionRule (
	__IDProductionRuleSet__ Integer NOT NULL,
	__IDProductionRule__ Integer NOT NULL
) ;

CREATE TABLE ReactionRuleSet_rules_ReactionRule (
	__IDReactionRuleSet__ Integer NOT NULL,
	__IDReactionRule__ Integer NOT NULL
) ;

CREATE TABLE RuleSet_variables_Variable (
	__IDRuleSet__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE RuleBase_rules_RuleSet (
	__IDRuleBase__ Integer NOT NULL,
	__IDRuleSet__ Integer NOT NULL
) ;

CREATE TABLE DerivationRuleSet_rules_DerivationRule (
	__IDDerivationRuleSet__ Integer NOT NULL,
	__IDDerivationRule__ Integer NOT NULL
) ;

CREATE TABLE RuleBase_externalVocabulaires_ExternalVocabulary (
	__IDRuleBase__ Integer NOT NULL,
	__IDExternalVocabulary__ Integer NOT NULL
) ;
