CREATE TABLE "Condition" (
	__IDCondition__ Integer NOT NULL,
	PRIMARY KEY "Condition" (__IDCondition__)
) ;

CREATE TABLE CompositeParDef (
	__IDCompositeParDef__ Integer NOT NULL,
	PRIMARY KEY CompositeParDef (__IDCompositeParDef__)
) ;

CREATE TABLE ElementaryPartDef (
	__IDElementaryPartDef__ Integer NOT NULL,
	PRIMARY KEY ElementaryPartDef (__IDElementaryPartDef__)
) ;

CREATE TABLE ElementaryActDef (
	__IDElementaryActDef__ Integer NOT NULL,
	PRIMARY KEY ElementaryActDef (__IDElementaryActDef__)
) ;

CREATE TABLE CompositeActDef (
	__IDCompositeActDef__ Integer NOT NULL,
	PRIMARY KEY CompositeActDef (__IDCompositeActDef__)
) ;

CREATE TABLE ActCompositeMember (
	__IDActCompositeMember__ Integer NOT NULL,
	PRIMARY KEY ActCompositeMember (__IDActCompositeMember__)
) ;

CREATE TABLE ActivityDefinition (
	__IDActivityDefinition__ Integer NOT NULL,
	FOREIGN KEY actCompositeMember (__FKactCompositeMember__) REFERENCES ActCompositeMember (__IDActCompositeMember__),
	PRIMARY KEY ActivityDefinition (__IDActivityDefinition__),
	__FKactCompositeMember__ Integer
) ;

CREATE TABLE PartDefinition (
	__IDPartDefinition__ Integer NOT NULL,
	PRIMARY KEY PartDefinition (__IDPartDefinition__)
) ;

CREATE TABLE PartCompositeMember (
	__IDPartCompositeMember__ Integer NOT NULL,
	FOREIGN KEY partDefinitions (__FKpartDefinitions__) REFERENCES PartDefinition (__IDPartDefinition__),
	PRIMARY KEY PartCompositeMember (__IDPartCompositeMember__),
	__FKpartDefinitions__ Integer
) ;

CREATE TABLE Condition_actCompositeMembers_ActCompositeMember (
	__IDCondition__ Integer NOT NULL,
	__IDActCompositeMember__ Integer NOT NULL
) ;

CREATE TABLE ActCompositeMember_activityDefinitions_ActivityDefinition (
	__IDActCompositeMember__ Integer NOT NULL,
	__IDActivityDefinition__ Integer NOT NULL
) ;

CREATE TABLE CompositeActDef_actCompositeMembers_ActCompositeMember (
	__IDCompositeActDef__ Integer NOT NULL,
	__IDActCompositeMember__ Integer NOT NULL
) ;

CREATE TABLE PartDefinition_partCompositeMembers_PartCompositeMember (
	__IDPartDefinition__ Integer NOT NULL,
	__IDPartCompositeMember__ Integer NOT NULL
) ;

CREATE TABLE CompositeParDef_partCompositeMember_PartCompositeMember (
	__IDCompositeParDef__ Integer NOT NULL,
	__IDPartCompositeMember__ Integer NOT NULL
) ;

CREATE TABLE Condition_partCompositeMembers_PartCompositeMember (
	__IDCondition__ Integer NOT NULL,
	__IDPartCompositeMember__ Integer NOT NULL
) ;
