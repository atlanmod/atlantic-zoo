CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	name text,
	type text,
	value text,
	visibility text,
	FOREIGN KEY context (__FKcontext__) REFERENCES Context (__IDContext__),
	PRIMARY KEY Variable (__IDVariable__),
	__FKcontext__ Integer
) ;

CREATE TABLE Context (
	__IDContext__ Integer NOT NULL,
	FOREIGN KEY rule (__FKrule__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY Context (__IDContext__),
	__FKrule__ Integer
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES Context (__IDContext__),
	FOREIGN KEY subRule (__FKsubRule__) REFERENCES Rule (__IDRule__),
	FOREIGN KEY superRule (__FKsuperRule__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY Rule (__IDRule__),
	__FKcontext__ Integer,
	__FKsuperRule__ Integer,
	__FKsubRule__ Integer
) ;

CREATE TABLE RootRule (
	__IDRootRule__ Integer NOT NULL,
	FOREIGN KEY ruleSet (__FKruleSet__) REFERENCES RuleSet (__IDRuleSet__),
	PRIMARY KEY RootRule (__IDRootRule__),
	__FKruleSet__ Integer
) ;

CREATE TABLE RuleSetCall (
	__IDRuleSetCall__ Integer NOT NULL,
	FOREIGN KEY ruleSet (__FKruleSet__) REFERENCES RuleSet (__IDRuleSet__),
	PRIMARY KEY RuleSetCall (__IDRuleSetCall__),
	__FKruleSet__ Integer
) ;

CREATE TABLE QARule (
	__IDQARule__ Integer NOT NULL,
	FOREIGN KEY query (__FKquery__) REFERENCES Query (__IDQuery__),
	FOREIGN KEY action (__FKaction__) REFERENCES Action (__IDAction__),
	PRIMARY KEY QARule (__IDQARule__),
	__FKaction__ Integer,
	__FKquery__ Integer
) ;

CREATE TABLE RuleSet (
	__IDRuleSet__ Integer NOT NULL,
	FOREIGN KEY rootRule (__FKrootRule__) REFERENCES RootRule (__IDRootRule__),
	PRIMARY KEY RuleSet (__IDRuleSet__),
	__FKrootRule__ Integer
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	visibility text,
	signature text,
	FOREIGN KEY rule (__FKrule__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY Service (__IDService__),
	__FKrule__ Integer
) ;

CREATE TABLE OCLService (
	__IDOCLService__ Integer NOT NULL,
	PRIMARY KEY OCLService (__IDOCLService__)
) ;

CREATE TABLE RTransService (
	__IDRTransService__ Integer NOT NULL,
	PRIMARY KEY RTransService (__IDRTransService__)
) ;

CREATE TABLE JavaService (
	__IDJavaService__ Integer NOT NULL,
	PRIMARY KEY JavaService (__IDJavaService__)
) ;

CREATE TABLE RulePart (
	__IDRulePart__ Integer NOT NULL,
	FOREIGN KEY service (__FKservice__) REFERENCES Service (__IDService__),
	PRIMARY KEY RulePart (__IDRulePart__),
	__FKservice__ Integer
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	FOREIGN KEY qARule (__FKqARule__) REFERENCES QARule (__IDQARule__),
	PRIMARY KEY Action (__IDAction__),
	__FKqARule__ Integer
) ;

CREATE TABLE RTransAction (
	__IDRTransAction__ Integer NOT NULL,
	PRIMARY KEY RTransAction (__IDRTransAction__)
) ;

CREATE TABLE JavaAction (
	__IDJavaAction__ Integer NOT NULL,
	PRIMARY KEY JavaAction (__IDJavaAction__)
) ;

CREATE TABLE Query (
	__IDQuery__ Integer NOT NULL,
	FOREIGN KEY qARule (__FKqARule__) REFERENCES QARule (__IDQARule__),
	PRIMARY KEY Query (__IDQuery__),
	__FKqARule__ Integer
) ;

CREATE TABLE OCLFilter (
	__IDOCLFilter__ Integer NOT NULL,
	PRIMARY KEY OCLFilter (__IDOCLFilter__)
) ;

CREATE TABLE RTransQuery (
	__IDRTransQuery__ Integer NOT NULL,
	PRIMARY KEY RTransQuery (__IDRTransQuery__)
) ;

CREATE TABLE JavaQuery (
	__IDJavaQuery__ Integer NOT NULL,
	PRIMARY KEY JavaQuery (__IDJavaQuery__)
) ;

CREATE TABLE JavaFilter (
	__IDJavaFilter__ Integer NOT NULL,
	PRIMARY KEY JavaFilter (__IDJavaFilter__)
) ;

CREATE TABLE Rule_services_Service (
	__IDRule__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE Context_variables_Variable (
	__IDContext__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;
