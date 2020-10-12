CREATE TABLE CDerived (
	__IDCDerived__ Integer NOT NULL,
	PRIMARY KEY CDerived (__IDCDerived__)
) ;

CREATE TABLE CStructured (
	__IDCStructured__ Integer NOT NULL,
	PRIMARY KEY CStructured (__IDCStructured__)
) ;

CREATE TABLE CBehavorialFeature (
	__IDCBehavorialFeature__ Integer NOT NULL,
	PRIMARY KEY CBehavorialFeature (__IDCBehavorialFeature__)
) ;

CREATE TABLE CFunction (
	__IDCFunction__ Integer NOT NULL,
	isVsrArg Boolean,
	PRIMARY KEY CFunction (__IDCFunction__)
) ;

CREATE TABLE CStructureContents (
	__IDCStructureContents__ Integer NOT NULL,
	PRIMARY KEY CStructureContents (__IDCStructureContents__)
) ;

CREATE TABLE CField (
	__IDCField__ Integer NOT NULL,
	PRIMARY KEY CField (__IDCField__)
) ;

CREATE TABLE CDerivableType (
	__IDCDerivableType__ Integer NOT NULL,
	PRIMARY KEY CDerivableType (__IDCDerivableType__)
) ;

CREATE TABLE CPPReference (
	__IDCPPReference__ Integer NOT NULL,
	PRIMARY KEY CPPReference (__IDCPPReference__)
) ;

CREATE TABLE CPPExtern (
	__IDCPPExtern__ Integer NOT NULL,
	linkage text,
	PRIMARY KEY CPPExtern (__IDCPPExtern__)
) ;

CREATE TABLE CPPConst (
	__IDCPPConst__ Integer NOT NULL,
	PRIMARY KEY CPPConst (__IDCPPConst__)
) ;

CREATE TABLE CPPTemplate (
	__IDCPPTemplate__ Integer NOT NULL,
	PRIMARY KEY CPPTemplate (__IDCPPTemplate__)
) ;

CREATE TABLE CPPClass (
	__IDCPPClass__ Integer NOT NULL,
	isAbstract Boolean,
	isVolatile Boolean,
	visibility text,
	PRIMARY KEY CPPClass (__IDCPPClass__)
) ;

CREATE TABLE CPPGeneralization (
	__IDCPPGeneralization__ Integer NOT NULL,
	visibility text,
	isVirtual Boolean,
	FOREIGN KEY supertype (__FKsupertype__) REFERENCES CPPClass (__IDCPPClass__),
	PRIMARY KEY CPPGeneralization (__IDCPPGeneralization__),
	__FKsupertype__ Integer
) ;

CREATE TABLE CPPOperation (
	__IDCPPOperation__ Integer NOT NULL,
	isStatic Boolean,
	isExtern Boolean,
	isInline Boolean,
	isVirtual Boolean,
	isPure Boolean,
	visibility text,
	isCtor Boolean,
	isDtor Boolean,
	PRIMARY KEY CPPOperation (__IDCPPOperation__)
) ;

CREATE TABLE CPPOperator (
	__IDCPPOperator__ Integer NOT NULL,
	isInline Boolean,
	visibility text,
	PRIMARY KEY CPPOperator (__IDCPPOperator__)
) ;

CREATE TABLE CPPMember (
	__IDCPPMember__ Integer NOT NULL,
	isStatic Boolean,
	isVolatile Boolean,
	isRegister Boolean,
	visibility text,
	PRIMARY KEY CPPMember (__IDCPPMember__)
) ;

CREATE TABLE CPPClass_generalizations_CPPGeneralization (
	__IDCPPClass__ Integer NOT NULL,
	__IDCPPGeneralization__ Integer NOT NULL
) ;

CREATE TABLE CPPTemplate_classes_CPPClass (
	__IDCPPTemplate__ Integer NOT NULL,
	__IDCPPClass__ Integer NOT NULL
) ;

CREATE TABLE CPPClass_templates_CPPTemplate (
	__IDCPPClass__ Integer NOT NULL,
	__IDCPPTemplate__ Integer NOT NULL
) ;

CREATE TABLE CPPOperation_throws_CPPClass (
	__IDCPPOperation__ Integer NOT NULL,
	__IDCPPClass__ Integer NOT NULL
) ;
