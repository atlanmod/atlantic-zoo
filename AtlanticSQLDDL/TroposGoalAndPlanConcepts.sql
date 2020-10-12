CREATE TABLE Actor (
	__IDActor__ Integer NOT NULL,
	PRIMARY KEY Actor (__IDActor__)
) ;

CREATE TABLE Decomposition (
	__IDDecomposition__ Integer NOT NULL,
	FOREIGN KEY PointOfView (__FKPointOfView__) REFERENCES Actor (__IDActor__),
	PRIMARY KEY Decomposition (__IDDecomposition__),
	__FKPointOfView__ Integer
) ;

CREATE TABLE Contribution (
	__IDContribution__ Integer NOT NULL,
	metric text,
	FOREIGN KEY contributer (__FKcontributer__) REFERENCES Goal (__IDGoal__),
	FOREIGN KEY contributed (__FKcontributed__) REFERENCES Goal (__IDGoal__),
	FOREIGN KEY PointOfView (__FKPointOfView__) REFERENCES Actor (__IDActor__),
	PRIMARY KEY Contribution (__IDContribution__),
	__FKcontributer__ Integer,
	__FKPointOfView__ Integer,
	__FKcontributed__ Integer
) ;

CREATE TABLE Goal (
	__IDGoal__ Integer NOT NULL,
	FOREIGN KEY booleanDecomposition (__FKbooleanDecomposition__) REFERENCES BooleanDecomposition (__IDBooleanDecomposition__),
	PRIMARY KEY Goal (__IDGoal__),
	__FKbooleanDecomposition__ Integer
) ;

CREATE TABLE MeansEnd (
	__IDMeansEnd__ Integer NOT NULL,
	FOREIGN KEY meansR (__FKmeansR__) REFERENCES Resource (__IDResource__),
	FOREIGN KEY means (__FKmeans__) REFERENCES Goal (__IDGoal__),
	FOREIGN KEY end (__FKend__) REFERENCES Goal (__IDGoal__),
	FOREIGN KEY PointOfView (__FKPointOfView__) REFERENCES Actor (__IDActor__),
	FOREIGN KEY meansP (__FKmeansP__) REFERENCES Plan (__IDPlan__),
	PRIMARY KEY MeansEnd (__IDMeansEnd__),
	__FKmeansR__ Integer,
	__FKPointOfView__ Integer,
	__FKmeans__ Integer,
	__FKmeansP__ Integer,
	__FKend__ Integer
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	PRIMARY KEY Resource (__IDResource__)
) ;

CREATE TABLE Plan (
	__IDPlan__ Integer NOT NULL,
	FOREIGN KEY booleanDecompositionP (__FKbooleanDecompositionP__) REFERENCES BooleanDecomposition (__IDBooleanDecomposition__),
	PRIMARY KEY Plan (__IDPlan__),
	__FKbooleanDecompositionP__ Integer
) ;

CREATE TABLE BooleanDecomposition (
	__IDBooleanDecomposition__ Integer NOT NULL,
	type text,
	FOREIGN KEY root (__FKroot__) REFERENCES Goal (__IDGoal__),
	FOREIGN KEY rootP (__FKrootP__) REFERENCES Plan (__IDPlan__),
	PRIMARY KEY BooleanDecomposition (__IDBooleanDecomposition__),
	__FKrootP__ Integer,
	__FKroot__ Integer
) ;

CREATE TABLE BooleanDecLink (
	__IDBooleanDecLink__ Integer NOT NULL,
	FOREIGN KEY booleanDecompositionB (__FKbooleanDecompositionB__) REFERENCES BooleanDecomposition (__IDBooleanDecomposition__),
	FOREIGN KEY target (__FKtarget__) REFERENCES Goal (__IDGoal__),
	FOREIGN KEY targetP (__FKtargetP__) REFERENCES Plan (__IDPlan__),
	PRIMARY KEY BooleanDecLink (__IDBooleanDecLink__),
	__FKtarget__ Integer,
	__FKbooleanDecompositionB__ Integer,
	__FKtargetP__ Integer
) ;

CREATE TABLE AndDecLink (
	__IDAndDecLink__ Integer NOT NULL,
	PRIMARY KEY AndDecLink (__IDAndDecLink__)
) ;

CREATE TABLE OrDecLink (
	__IDOrDecLink__ Integer NOT NULL,
	PRIMARY KEY OrDecLink (__IDOrDecLink__)
) ;

CREATE TABLE Goal_meansEndD_MeansEnd (
	__IDGoal__ Integer NOT NULL,
	__IDMeansEnd__ Integer NOT NULL
) ;

CREATE TABLE Goal_meansEndS_MeansEnd (
	__IDGoal__ Integer NOT NULL,
	__IDMeansEnd__ Integer NOT NULL
) ;

CREATE TABLE Resource_meansEndR_MeansEnd (
	__IDResource__ Integer NOT NULL,
	__IDMeansEnd__ Integer NOT NULL
) ;

CREATE TABLE Goal_contributionD_Contribution (
	__IDGoal__ Integer NOT NULL,
	__IDContribution__ Integer NOT NULL
) ;

CREATE TABLE Goal_booleanDecLink_BooleanDecLink (
	__IDGoal__ Integer NOT NULL,
	__IDBooleanDecLink__ Integer NOT NULL
) ;

CREATE TABLE BooleanDecomposition_booleanDecLinkD_BooleanDecLink (
	__IDBooleanDecomposition__ Integer NOT NULL,
	__IDBooleanDecLink__ Integer NOT NULL
) ;

CREATE TABLE Plan_booleanDecLinkP_BooleanDecLink (
	__IDPlan__ Integer NOT NULL,
	__IDBooleanDecLink__ Integer NOT NULL
) ;

CREATE TABLE Plan_meansEndP_MeansEnd (
	__IDPlan__ Integer NOT NULL,
	__IDMeansEnd__ Integer NOT NULL
) ;

CREATE TABLE Actor_decomposition_Decomposition (
	__IDActor__ Integer NOT NULL,
	__IDDecomposition__ Integer NOT NULL
) ;

CREATE TABLE Goal_contributionR_Contribution (
	__IDGoal__ Integer NOT NULL,
	__IDContribution__ Integer NOT NULL
) ;

CREATE TABLE Actor_contribution_Contribution (
	__IDActor__ Integer NOT NULL,
	__IDContribution__ Integer NOT NULL
) ;

CREATE TABLE Actor_meansEnd_MeansEnd (
	__IDActor__ Integer NOT NULL,
	__IDMeansEnd__ Integer NOT NULL
) ;
