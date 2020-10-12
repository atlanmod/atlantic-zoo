CREATE TABLE Actor (
	__IDActor__ Integer NOT NULL,
	PRIMARY KEY Actor (__IDActor__)
) ;

CREATE TABLE Goal (
	__IDGoal__ Integer NOT NULL,
	FOREIGN KEY wanter (__FKwanter__) REFERENCES Actor (__IDActor__),
	PRIMARY KEY Goal (__IDGoal__),
	__FKwanter__ Integer
) ;

CREATE TABLE SoftGoal (
	__IDSoftGoal__ Integer NOT NULL,
	PRIMARY KEY SoftGoal (__IDSoftGoal__)
) ;

CREATE TABLE HardGoal (
	__IDHardGoal__ Integer NOT NULL,
	PRIMARY KEY HardGoal (__IDHardGoal__)
) ;

CREATE TABLE Dependency (
	__IDDependency__ Integer NOT NULL,
	FOREIGN KEY dependee (__FKdependee__) REFERENCES Actor (__IDActor__),
	FOREIGN KEY depender (__FKdepender__) REFERENCES Actor (__IDActor__),
	FOREIGN KEY goal (__FKgoal__) REFERENCES Goal (__IDGoal__),
	FOREIGN KEY WhyG (__FKWhyG__) REFERENCES Goal (__IDGoal__),
	FOREIGN KEY WhyR (__FKWhyR__) REFERENCES Resource (__IDResource__),
	FOREIGN KEY resourceD (__FKresourceD__) REFERENCES Resource (__IDResource__),
	FOREIGN KEY WhyP (__FKWhyP__) REFERENCES Plan (__IDPlan__),
	FOREIGN KEY plan (__FKplan__) REFERENCES Plan (__IDPlan__),
	PRIMARY KEY Dependency (__IDDependency__),
	__FKWhyR__ Integer,
	__FKdependee__ Integer,
	__FKWhyG__ Integer,
	__FKdepender__ Integer,
	__FKWhyP__ Integer,
	__FKplan__ Integer,
	__FKresourceD__ Integer,
	__FKgoal__ Integer
) ;

CREATE TABLE Plan (
	__IDPlan__ Integer NOT NULL,
	FOREIGN KEY isFulfilled (__FKisFulfilled__) REFERENCES Goal (__IDGoal__),
	FOREIGN KEY capableOf (__FKcapableOf__) REFERENCES Actor (__IDActor__),
	PRIMARY KEY Plan (__IDPlan__),
	__FKisFulfilled__ Integer,
	__FKcapableOf__ Integer
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	FOREIGN KEY "use" (__FKuse__) REFERENCES Actor (__IDActor__),
	FOREIGN KEY dependencyWR (__FKdependencyWR__) REFERENCES Dependency (__IDDependency__),
	FOREIGN KEY dependencyR (__FKdependencyR__) REFERENCES Dependency (__IDDependency__),
	PRIMARY KEY Resource (__IDResource__),
	__FKdependencyR__ Integer,
	__FKdependencyWR__ Integer,
	__FKuse__ Integer
) ;

CREATE TABLE Actor_dependencyE_Dependency (
	__IDActor__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE Goal_plan_Plan (
	__IDGoal__ Integer NOT NULL,
	__IDPlan__ Integer NOT NULL
) ;

CREATE TABLE Goal_dependencyWG_Dependency (
	__IDGoal__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE Plan_dependencyP_Dependency (
	__IDPlan__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE Actor_goal_Goal (
	__IDActor__ Integer NOT NULL,
	__IDGoal__ Integer NOT NULL
) ;

CREATE TABLE Actor_resource_Resource (
	__IDActor__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Actor_dependencyR_Dependency (
	__IDActor__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE Plan_dependencyWP_Dependency (
	__IDPlan__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE Actor_plan_Plan (
	__IDActor__ Integer NOT NULL,
	__IDPlan__ Integer NOT NULL
) ;

CREATE TABLE Goal_dependencyG_Dependency (
	__IDGoal__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;
