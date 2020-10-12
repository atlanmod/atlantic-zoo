CREATE TABLE WorkDefinition (
	__IDWorkDefinition__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES ProcessPerformer (__IDProcessPerformer__),
	PRIMARY KEY WorkDefinition (__IDWorkDefinition__),
	__FKowner__ Integer
) ;

CREATE TABLE ProcessPerformer (
	__IDProcessPerformer__ Integer NOT NULL,
	PRIMARY KEY ProcessPerformer (__IDProcessPerformer__)
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	PRIMARY KEY Role (__IDRole__)
) ;

CREATE TABLE WorkProduct (
	__IDWorkProduct__ Integer NOT NULL,
	FOREIGN KEY responsible (__FKresponsible__) REFERENCES Role (__IDRole__),
	PRIMARY KEY WorkProduct (__IDWorkProduct__),
	__FKresponsible__ Integer
) ;

CREATE TABLE Lifecycle (
	__IDLifecycle__ Integer NOT NULL,
	PRIMARY KEY Lifecycle (__IDLifecycle__)
) ;

CREATE TABLE Phase (
	__IDPhase__ Integer NOT NULL,
	FOREIGN KEY lifeCycle (__FKlifeCycle__) REFERENCES Lifecycle (__IDLifecycle__),
	PRIMARY KEY Phase (__IDPhase__),
	__FKlifeCycle__ Integer
) ;

CREATE TABLE Iteration (
	__IDIteration__ Integer NOT NULL,
	FOREIGN KEY phase (__FKphase__) REFERENCES Phase (__IDPhase__),
	PRIMARY KEY Iteration (__IDIteration__),
	__FKphase__ Integer
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	FOREIGN KEY iteration (__FKiteration__) REFERENCES Iteration (__IDIteration__),
	PRIMARY KEY Activity (__IDActivity__),
	__FKiteration__ Integer
) ;

CREATE TABLE Step (
	__IDStep__ Integer NOT NULL,
	PRIMARY KEY Step (__IDStep__)
) ;

CREATE TABLE WorkDefinition_subWorks_WorkDefinition (
	__IDWorkDefinition__ Integer NOT NULL,
	__IDWorkDefinition__ Integer NOT NULL
) ;

CREATE TABLE Lifecycle_phases_Phase (
	__IDLifecycle__ Integer NOT NULL,
	__IDPhase__ Integer NOT NULL
) ;

CREATE TABLE Activity_steps_Step (
	__IDActivity__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE Role_products_WorkProduct (
	__IDRole__ Integer NOT NULL,
	__IDWorkProduct__ Integer NOT NULL
) ;

CREATE TABLE WorkDefinition_parentWorks_WorkDefinition (
	__IDWorkDefinition__ Integer NOT NULL,
	__IDWorkDefinition__ Integer NOT NULL
) ;

CREATE TABLE ProcessPerformer_features_WorkDefinition (
	__IDProcessPerformer__ Integer NOT NULL,
	__IDWorkDefinition__ Integer NOT NULL
) ;

CREATE TABLE Phase_iterations_Iteration (
	__IDPhase__ Integer NOT NULL,
	__IDIteration__ Integer NOT NULL
) ;

CREATE TABLE Iteration_activities_Activity (
	__IDIteration__ Integer NOT NULL,
	__IDActivity__ Integer NOT NULL
) ;
