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

CREATE TABLE RuleSet (
	__IDRuleSet__ Integer NOT NULL,
	PRIMARY KEY RuleSet (__IDRuleSet__)
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	FOREIGN KEY binding (__FKbinding__) REFERENCES Binding (__IDBinding__),
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES RuleCondition (__IDRuleCondition__),
	FOREIGN KEY ruleOwner (__FKruleOwner__) REFERENCES RuleSet (__IDRuleSet__),
	PRIMARY KEY Rule (__IDRule__),
	__FKcondition__ Integer,
	__FKbinding__ Integer,
	__FKruleOwner__ Integer
) ;

CREATE TABLE RuleAction (
	__IDRuleAction__ Integer NOT NULL,
	FOREIGN KEY actionOwner (__FKactionOwner__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY RuleAction (__IDRuleAction__),
	__FKactionOwner__ Integer
) ;

CREATE TABLE RuleCondition (
	__IDRuleCondition__ Integer NOT NULL,
	FOREIGN KEY ruleConditionOwner (__FKruleConditionOwner__) REFERENCES Rule (__IDRule__),
	FOREIGN KEY conditionExp (__FKconditionExp__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY RuleCondition (__IDRuleCondition__),
	__FKconditionExp__ Integer,
	__FKruleConditionOwner__ Integer
) ;

CREATE TABLE Binding (
	__IDBinding__ Integer NOT NULL,
	FOREIGN KEY bindingOwner (__FKbindingOwner__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY Binding (__IDBinding__),
	__FKbindingOwner__ Integer
) ;

CREATE TABLE RuleVariable (
	__IDRuleVariable__ Integer NOT NULL,
	FOREIGN KEY ruleVariableOwner (__FKruleVariableOwner__) REFERENCES Binding (__IDBinding__),
	FOREIGN KEY filter (__FKfilter__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY RuleVariable (__IDRuleVariable__),
	__FKfilter__ Integer,
	__FKruleVariableOwner__ Integer
) ;

CREATE TABLE Binding_ruleVariable_RuleVariable (
	__IDBinding__ Integer NOT NULL,
	__IDRuleVariable__ Integer NOT NULL
) ;

CREATE TABLE RuleSet_rules_Rule (
	__IDRuleSet__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE Rule_actions_RuleAction (
	__IDRule__ Integer NOT NULL,
	__IDRuleAction__ Integer NOT NULL
) ;
