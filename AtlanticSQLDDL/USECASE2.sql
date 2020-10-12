CREATE TABLE Requirement (
	__IDRequirement__ Integer NOT NULL,
	PRIMARY KEY Requirement (__IDRequirement__)
) ;

CREATE TABLE NonFunctionnelRequirement (
	__IDNonFunctionnelRequirement__ Integer NOT NULL,
	PRIMARY KEY NonFunctionnelRequirement (__IDNonFunctionnelRequirement__)
) ;

CREATE TABLE FunctionnelRequirement (
	__IDFunctionnelRequirement__ Integer NOT NULL,
	PRIMARY KEY FunctionnelRequirement (__IDFunctionnelRequirement__)
) ;

CREATE TABLE UseCase (
	__IDUseCase__ Integer NOT NULL,
	PRIMARY KEY UseCase (__IDUseCase__)
) ;

CREATE TABLE Goal (
	__IDGoal__ Integer NOT NULL,
	PRIMARY KEY Goal (__IDGoal__)
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	PRIMARY KEY Role (__IDRole__)
) ;

CREATE TABLE HumanRole (
	__IDHumanRole__ Integer NOT NULL,
	PRIMARY KEY HumanRole (__IDHumanRole__)
) ;

CREATE TABLE SystemRole (
	__IDSystemRole__ Integer NOT NULL,
	PRIMARY KEY SystemRole (__IDSystemRole__)
) ;

CREATE TABLE EventRole (
	__IDEventRole__ Integer NOT NULL,
	PRIMARY KEY EventRole (__IDEventRole__)
) ;

CREATE TABLE Manage (
	__IDManage__ Integer NOT NULL,
	PRIMARY KEY Manage (__IDManage__)
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	PRIMARY KEY Resource (__IDResource__)
) ;

CREATE TABLE ScenarioDescription (
	__IDScenarioDescription__ Integer NOT NULL,
	FOREIGN KEY useCase (__FKuseCase__) REFERENCES UseCase (__IDUseCase__),
	PRIMARY KEY ScenarioDescription (__IDScenarioDescription__),
	__FKuseCase__ Integer
) ;

CREATE TABLE "Condition" (
	__IDCondition__ Integer NOT NULL,
	PRIMARY KEY "Condition" (__IDCondition__)
) ;

CREATE TABLE Pre (
	__IDPre__ Integer NOT NULL,
	PRIMARY KEY Pre (__IDPre__)
) ;

CREATE TABLE Post (
	__IDPost__ Integer NOT NULL,
	PRIMARY KEY Post (__IDPost__)
) ;

CREATE TABLE UseCase_scenario_ScenarioDescription (
	__IDUseCase__ Integer NOT NULL,
	__IDScenarioDescription__ Integer NOT NULL
) ;

CREATE TABLE UseCase_condition_Condition (
	__IDUseCase__ Integer NOT NULL,
	__IDCondition__ Integer NOT NULL
) ;

CREATE TABLE NonFunctionnelRequirement_scopes_UseCase (
	__IDNonFunctionnelRequirement__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE UseCase_meet_by_Goal (
	__IDUseCase__ Integer NOT NULL,
	__IDGoal__ Integer NOT NULL
) ;

CREATE TABLE Condition_constrained_with_UseCase (
	__IDCondition__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE FunctionnelRequirement_specifies_UseCase (
	__IDFunctionnelRequirement__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE Manage_managed_Resource_Resource (
	__IDManage__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE UseCase_interacter_Role (
	__IDUseCase__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE UseCase_scoped_by_NonFunctionnelRequirement (
	__IDUseCase__ Integer NOT NULL,
	__IDNonFunctionnelRequirement__ Integer NOT NULL
) ;

CREATE TABLE UseCase_specified_by_FunctionnelRequirement (
	__IDUseCase__ Integer NOT NULL,
	__IDFunctionnelRequirement__ Integer NOT NULL
) ;

CREATE TABLE Role_interacted_with_UseCase (
	__IDRole__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE Goal_to_meet_UseCase (
	__IDGoal__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;
