CREATE TABLE ArtifactUsageName (
	__IDArtifactUsageName__ Integer NOT NULL,
	isInput Boolean,
	isOutput Boolean,
	hasWorkPerArtifact Boolean,
	FOREIGN KEY artifactKind (__FKartifactKind__) REFERENCES ArtifactKind (__IDArtifactKind__),
	FOREIGN KEY workDefinition (__FKworkDefinition__) REFERENCES WorkDefinition (__IDWorkDefinition__),
	PRIMARY KEY ArtifactUsageName (__IDArtifactUsageName__),
	__FKartifactKind__ Integer,
	__FKworkDefinition__ Integer
) ;

CREATE TABLE ProcessDefinitionElement (
	__IDProcessDefinitionElement__ Integer NOT NULL,
	PRIMARY KEY ProcessDefinitionElement (__IDProcessDefinitionElement__)
) ;

CREATE TABLE Guidance (
	__IDGuidance__ Integer NOT NULL,
	PRIMARY KEY Guidance (__IDGuidance__)
) ;

CREATE TABLE ArtifactKind (
	__IDArtifactKind__ Integer NOT NULL,
	FOREIGN KEY responsible (__FKresponsible__) REFERENCES RoleKind (__IDRoleKind__),
	PRIMARY KEY ArtifactKind (__IDArtifactKind__),
	__FKresponsible__ Integer
) ;

CREATE TABLE WorkItem (
	__IDWorkItem__ Integer NOT NULL,
	PRIMARY KEY WorkItem (__IDWorkItem__)
) ;

CREATE TABLE RoleKind (
	__IDRoleKind__ Integer NOT NULL,
	PRIMARY KEY RoleKind (__IDRoleKind__)
) ;

CREATE TABLE "Condition" (
	__IDCondition__ Integer NOT NULL,
	PRIMARY KEY "Condition" (__IDCondition__)
) ;

CREATE TABLE ProcessComponent (
	__IDProcessComponent__ Integer NOT NULL,
	PRIMARY KEY ProcessComponent (__IDProcessComponent__)
) ;

CREATE TABLE Goal (
	__IDGoal__ Integer NOT NULL,
	FOREIGN KEY workDefinition (__FKworkDefinition__) REFERENCES WorkDefinition (__IDWorkDefinition__),
	PRIMARY KEY Goal (__IDGoal__),
	__FKworkDefinition__ Integer
) ;

CREATE TABLE Precondition (
	__IDPrecondition__ Integer NOT NULL,
	FOREIGN KEY workDefinition (__FKworkDefinition__) REFERENCES WorkDefinition (__IDWorkDefinition__),
	PRIMARY KEY Precondition (__IDPrecondition__),
	__FKworkDefinition__ Integer
) ;

CREATE TABLE WorkDefinition (
	__IDWorkDefinition__ Integer NOT NULL,
	FOREIGN KEY goal (__FKgoal__) REFERENCES Goal (__IDGoal__),
	FOREIGN KEY precondition (__FKprecondition__) REFERENCES Precondition (__IDPrecondition__),
	PRIMARY KEY WorkDefinition (__IDWorkDefinition__),
	__FKprecondition__ Integer,
	__FKgoal__ Integer
) ;

CREATE TABLE ActivityKind (
	__IDActivityKind__ Integer NOT NULL,
	PRIMARY KEY ActivityKind (__IDActivityKind__)
) ;

CREATE TABLE Iteration (
	__IDIteration__ Integer NOT NULL,
	PRIMARY KEY Iteration (__IDIteration__)
) ;

CREATE TABLE Phase (
	__IDPhase__ Integer NOT NULL,
	PRIMARY KEY Phase (__IDPhase__)
) ;

CREATE TABLE Lifecycle (
	__IDLifecycle__ Integer NOT NULL,
	PRIMARY KEY Lifecycle (__IDLifecycle__)
) ;

CREATE TABLE ProcessDefinitionElement_processComponents_ProcessComponent (
	__IDProcessDefinitionElement__ Integer NOT NULL,
	__IDProcessComponent__ Integer NOT NULL
) ;

CREATE TABLE ProcessDefinitionElement_guidances_Guidance (
	__IDProcessDefinitionElement__ Integer NOT NULL,
	__IDGuidance__ Integer NOT NULL
) ;

CREATE TABLE Guidance_processDefinitionElements_ProcessDefinitionElement (
	__IDGuidance__ Integer NOT NULL,
	__IDProcessDefinitionElement__ Integer NOT NULL
) ;

CREATE TABLE ActivityKind_assistant_RoleKind (
	__IDActivityKind__ Integer NOT NULL,
	__IDRoleKind__ Integer NOT NULL
) ;

CREATE TABLE RoleKind_artifactKinds_ArtifactKind (
	__IDRoleKind__ Integer NOT NULL,
	__IDArtifactKind__ Integer NOT NULL
) ;

CREATE TABLE WorkDefinition_artifactUsageNames_ArtifactUsageName (
	__IDWorkDefinition__ Integer NOT NULL,
	__IDArtifactUsageName__ Integer NOT NULL
) ;

CREATE TABLE ProcessComponent_processDefinitionElements_ProcessDefinitionElement (
	__IDProcessComponent__ Integer NOT NULL,
	__IDProcessDefinitionElement__ Integer NOT NULL
) ;

CREATE TABLE ActivityKind_performer_RoleKind (
	__IDActivityKind__ Integer NOT NULL,
	__IDRoleKind__ Integer NOT NULL
) ;

CREATE TABLE ArtifactKind_artifactUsageNames_ArtifactUsageName (
	__IDArtifactKind__ Integer NOT NULL,
	__IDArtifactUsageName__ Integer NOT NULL
) ;
