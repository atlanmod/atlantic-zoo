CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE Environnement (
	__IDEnvironnement__ Integer NOT NULL,
	FOREIGN KEY element (__FKelement__) REFERENCES Element (__IDElement__),
	PRIMARY KEY Environnement (__IDEnvironnement__),
	__FKelement__ Integer
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	FOREIGN KEY environnement (__FKenvironnement__) REFERENCES Environnement (__IDEnvironnement__),
	FOREIGN KEY action (__FKaction__) REFERENCES CooperativeAgent (__IDCooperativeAgent__),
	FOREIGN KEY perception (__FKperception__) REFERENCES CooperativeAgent (__IDCooperativeAgent__),
	PRIMARY KEY Element (__IDElement__),
	__FKaction__ Integer,
	__FKperception__ Integer,
	__FKenvironnement__ Integer
) ;

CREATE TABLE CooperativeAgent (
	__IDCooperativeAgent__ Integer NOT NULL,
	FOREIGN KEY elementA (__FKelementA__) REFERENCES Element (__IDElement__),
	FOREIGN KEY elementP (__FKelementP__) REFERENCES Element (__IDElement__),
	PRIMARY KEY CooperativeAgent (__IDCooperativeAgent__),
	__FKelementP__ Integer,
	__FKelementA__ Integer
) ;

CREATE TABLE Representation (
	__IDRepresentation__ Integer NOT NULL,
	FOREIGN KEY cooperativeAgentR (__FKcooperativeAgentR__) REFERENCES CooperativeAgent (__IDCooperativeAgent__),
	FOREIGN KEY element (__FKelement__) REFERENCES Element (__IDElement__),
	PRIMARY KEY Representation (__IDRepresentation__),
	__FKelement__ Integer,
	__FKcooperativeAgentR__ Integer
) ;

CREATE TABLE Skill (
	__IDSkill__ Integer NOT NULL,
	FOREIGN KEY cooperativeAgentS (__FKcooperativeAgentS__) REFERENCES CooperativeAgent (__IDCooperativeAgent__),
	PRIMARY KEY Skill (__IDSkill__),
	__FKcooperativeAgentS__ Integer
) ;

CREATE TABLE Aptitude (
	__IDAptitude__ Integer NOT NULL,
	FOREIGN KEY cooperativeAgentA (__FKcooperativeAgentA__) REFERENCES CooperativeAgent (__IDCooperativeAgent__),
	PRIMARY KEY Aptitude (__IDAptitude__),
	__FKcooperativeAgentA__ Integer
) ;

CREATE TABLE Characteristic (
	__IDCharacteristic__ Integer NOT NULL,
	FOREIGN KEY cooperativeAgentCha (__FKcooperativeAgentCha__) REFERENCES CooperativeAgent (__IDCooperativeAgent__),
	PRIMARY KEY Characteristic (__IDCharacteristic__),
	__FKcooperativeAgentCha__ Integer
) ;

CREATE TABLE Communication (
	__IDCommunication__ Integer NOT NULL,
	FOREIGN KEY cooperativeAgentCom (__FKcooperativeAgentCom__) REFERENCES CooperativeAgent (__IDCooperativeAgent__),
	PRIMARY KEY Communication (__IDCommunication__),
	__FKcooperativeAgentCom__ Integer
) ;

CREATE TABLE AIP (
	__IDAIP__ Integer NOT NULL,
	PRIMARY KEY AIP (__IDAIP__)
) ;

CREATE TABLE CooperationRules (
	__IDCooperationRules__ Integer NOT NULL,
	PRIMARY KEY CooperationRules (__IDCooperationRules__)
) ;

CREATE TABLE NCS (
	__IDNCS__ Integer NOT NULL,
	FOREIGN KEY cooperationRules (__FKcooperationRules__) REFERENCES CooperationRules (__IDCooperationRules__),
	PRIMARY KEY NCS (__IDNCS__),
	__FKcooperationRules__ Integer
) ;

CREATE TABLE Incomprehension (
	__IDIncomprehension__ Integer NOT NULL,
	PRIMARY KEY Incomprehension (__IDIncomprehension__)
) ;

CREATE TABLE Ambiguity (
	__IDAmbiguity__ Integer NOT NULL,
	PRIMARY KEY Ambiguity (__IDAmbiguity__)
) ;

CREATE TABLE Incompetence (
	__IDIncompetence__ Integer NOT NULL,
	PRIMARY KEY Incompetence (__IDIncompetence__)
) ;

CREATE TABLE Unproductiveness (
	__IDUnproductiveness__ Integer NOT NULL,
	PRIMARY KEY Unproductiveness (__IDUnproductiveness__)
) ;

CREATE TABLE Concurrency (
	__IDConcurrency__ Integer NOT NULL,
	PRIMARY KEY Concurrency (__IDConcurrency__)
) ;

CREATE TABLE Conflict (
	__IDConflict__ Integer NOT NULL,
	PRIMARY KEY Conflict (__IDConflict__)
) ;

CREATE TABLE Uselessness (
	__IDUselessness__ Integer NOT NULL,
	PRIMARY KEY Uselessness (__IDUselessness__)
) ;

CREATE TABLE CooperativeAgent_observes_CooperationRules (
	__IDCooperativeAgent__ Integer NOT NULL,
	__IDCooperationRules__ Integer NOT NULL
) ;

CREATE TABLE CooperativeAgent_skill_Skill (
	__IDCooperativeAgent__ Integer NOT NULL,
	__IDSkill__ Integer NOT NULL
) ;

CREATE TABLE CooperationRules_detects_NCS (
	__IDCooperationRules__ Integer NOT NULL,
	__IDNCS__ Integer NOT NULL
) ;

CREATE TABLE CooperativeAgent_characteristic_Characteristic (
	__IDCooperativeAgent__ Integer NOT NULL,
	__IDCharacteristic__ Integer NOT NULL
) ;

CREATE TABLE Communication_aip_AIP (
	__IDCommunication__ Integer NOT NULL,
	__IDAIP__ Integer NOT NULL
) ;

CREATE TABLE CooperativeAgent_representation_Representation (
	__IDCooperativeAgent__ Integer NOT NULL,
	__IDRepresentation__ Integer NOT NULL
) ;

CREATE TABLE CooperativeAgent_communication_Communication (
	__IDCooperativeAgent__ Integer NOT NULL,
	__IDCommunication__ Integer NOT NULL
) ;

CREATE TABLE CooperativeAgent_aptitude_Aptitude (
	__IDCooperativeAgent__ Integer NOT NULL,
	__IDAptitude__ Integer NOT NULL
) ;
