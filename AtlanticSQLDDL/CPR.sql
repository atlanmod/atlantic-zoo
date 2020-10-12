CREATE TABLE Plan (
	__IDPlan__ Integer NOT NULL,
	FOREIGN KEY super_plan (__FKsuper_plan__) REFERENCES Plan (__IDPlan__),
	PRIMARY KEY Plan (__IDPlan__),
	__FKsuper_plan__ Integer
) ;

CREATE TABLE Objective (
	__IDObjective__ Integer NOT NULL,
	FOREIGN KEY objective_plan (__FKobjective_plan__) REFERENCES Plan (__IDPlan__),
	PRIMARY KEY Objective (__IDObjective__),
	__FKobjective_plan__ Integer
) ;

CREATE TABLE EvaluationCriteria (
	__IDEvaluationCriteria__ Integer NOT NULL,
	FOREIGN KEY criteria_objective (__FKcriteria_objective__) REFERENCES Objective (__IDObjective__),
	PRIMARY KEY EvaluationCriteria (__IDEvaluationCriteria__),
	__FKcriteria_objective__ Integer
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	FOREIGN KEY action_plan (__FKaction_plan__) REFERENCES Plan (__IDPlan__),
	FOREIGN KEY super_action (__FKsuper_action__) REFERENCES Action (__IDAction__),
	FOREIGN KEY actor (__FKactor__) REFERENCES Actor (__IDActor__),
	PRIMARY KEY Action (__IDAction__),
	__FKaction_plan__ Integer,
	__FKactor__ Integer,
	__FKsuper_action__ Integer
) ;

CREATE TABLE Actor (
	__IDActor__ Integer NOT NULL,
	FOREIGN KEY actor_action (__FKactor_action__) REFERENCES Action (__IDAction__),
	FOREIGN KEY super_actor (__FKsuper_actor__) REFERENCES Actor (__IDActor__),
	PRIMARY KEY Actor (__IDActor__),
	__FKactor_action__ Integer,
	__FKsuper_actor__ Integer
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	FOREIGN KEY resource_action (__FKresource_action__) REFERENCES Action (__IDAction__),
	PRIMARY KEY Resource (__IDResource__),
	__FKresource_action__ Integer
) ;

CREATE TABLE TimeSpec (
	__IDTimeSpec__ Integer NOT NULL,
	FOREIGN KEY timeSpec_action (__FKtimeSpec_action__) REFERENCES Action (__IDAction__),
	PRIMARY KEY TimeSpec (__IDTimeSpec__),
	__FKtimeSpec_action__ Integer
) ;

CREATE TABLE Action_sub_actions_Action (
	__IDAction__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE Plan_sub_plans_Plan (
	__IDPlan__ Integer NOT NULL,
	__IDPlan__ Integer NOT NULL
) ;

CREATE TABLE Actor_sub_actors_Actor (
	__IDActor__ Integer NOT NULL,
	__IDActor__ Integer NOT NULL
) ;

CREATE TABLE Action_timeSpecs_TimeSpec (
	__IDAction__ Integer NOT NULL,
	__IDTimeSpec__ Integer NOT NULL
) ;

CREATE TABLE Action_resources_Resource (
	__IDAction__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Plan_objectives_Objective (
	__IDPlan__ Integer NOT NULL,
	__IDObjective__ Integer NOT NULL
) ;

CREATE TABLE Objective_criterias_EvaluationCriteria (
	__IDObjective__ Integer NOT NULL,
	__IDEvaluationCriteria__ Integer NOT NULL
) ;

CREATE TABLE Plan_actions_Action (
	__IDPlan__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;
