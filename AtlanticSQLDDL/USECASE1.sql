CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE User (
	__IDUser__ Integer NOT NULL,
	PRIMARY KEY User (__IDUser__)
) ;

CREATE TABLE Actor (
	__IDActor__ Integer NOT NULL,
	PRIMARY KEY Actor (__IDActor__)
) ;

CREATE TABLE Goal (
	__IDGoal__ Integer NOT NULL,
	PRIMARY KEY Goal (__IDGoal__)
) ;

CREATE TABLE UseCase (
	__IDUseCase__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES Context (__IDContext__),
	PRIMARY KEY UseCase (__IDUseCase__),
	__FKcontext__ Integer
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	PRIMARY KEY Service (__IDService__)
) ;

CREATE TABLE Scenario (
	__IDScenario__ Integer NOT NULL,
	PRIMARY KEY Scenario (__IDScenario__)
) ;

CREATE TABLE Context (
	__IDContext__ Integer NOT NULL,
	PRIMARY KEY Context (__IDContext__)
) ;

CREATE TABLE PreCondition (
	__IDPreCondition__ Integer NOT NULL,
	PRIMARY KEY PreCondition (__IDPreCondition__)
) ;

CREATE TABLE PostCondition (
	__IDPostCondition__ Integer NOT NULL,
	PRIMARY KEY PostCondition (__IDPostCondition__)
) ;

CREATE TABLE Episode (
	__IDEpisode__ Integer NOT NULL,
	PRIMARY KEY Episode (__IDEpisode__)
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	PRIMARY KEY Event (__IDEvent__)
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	PRIMARY KEY Action (__IDAction__)
) ;

CREATE TABLE Responce (
	__IDResponce__ Integer NOT NULL,
	PRIMARY KEY Responce (__IDResponce__)
) ;

CREATE TABLE Stimilus (
	__IDStimilus__ Integer NOT NULL,
	PRIMARY KEY Stimilus (__IDStimilus__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	PRIMARY KEY Parameter (__IDParameter__)
) ;

CREATE TABLE PostCondition_context_Context (
	__IDPostCondition__ Integer NOT NULL,
	__IDContext__ Integer NOT NULL
) ;

CREATE TABLE Context_preCondition_PreCondition (
	__IDContext__ Integer NOT NULL,
	__IDPreCondition__ Integer NOT NULL
) ;

CREATE TABLE PreCondition_context_Context (
	__IDPreCondition__ Integer NOT NULL,
	__IDContext__ Integer NOT NULL
) ;

CREATE TABLE UseCase_user_User (
	__IDUseCase__ Integer NOT NULL,
	__IDUser__ Integer NOT NULL
) ;

CREATE TABLE Actor_useCase_UseCase (
	__IDActor__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE Episode_event_Event (
	__IDEpisode__ Integer NOT NULL,
	__IDEvent__ Integer NOT NULL
) ;

CREATE TABLE Service_useCase_UseCase (
	__IDService__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE Task_service_Service (
	__IDTask__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE UseCase_service_Service (
	__IDUseCase__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE Parameter_stimilus_Stimilus (
	__IDParameter__ Integer NOT NULL,
	__IDStimilus__ Integer NOT NULL
) ;

CREATE TABLE Goal_actor_Actor (
	__IDGoal__ Integer NOT NULL,
	__IDActor__ Integer NOT NULL
) ;

CREATE TABLE Actor_goal_Goal (
	__IDActor__ Integer NOT NULL,
	__IDGoal__ Integer NOT NULL
) ;

CREATE TABLE Stimilus_parameter_Parameter (
	__IDStimilus__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Service_goal_Goal (
	__IDService__ Integer NOT NULL,
	__IDGoal__ Integer NOT NULL
) ;

CREATE TABLE Service_task_Task (
	__IDService__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE User_useCase_UseCase (
	__IDUser__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE Responce_parameter_Parameter (
	__IDResponce__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Context_postCondition_PostCondition (
	__IDContext__ Integer NOT NULL,
	__IDPostCondition__ Integer NOT NULL
) ;

CREATE TABLE User_actor_Actor (
	__IDUser__ Integer NOT NULL,
	__IDActor__ Integer NOT NULL
) ;

CREATE TABLE Context_useCase_UseCase (
	__IDContext__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE Goal_service_Service (
	__IDGoal__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE Parameter_responce_Responce (
	__IDParameter__ Integer NOT NULL,
	__IDResponce__ Integer NOT NULL
) ;

CREATE TABLE UseCase_actor_Actor (
	__IDUseCase__ Integer NOT NULL,
	__IDActor__ Integer NOT NULL
) ;

CREATE TABLE Event_episode_Episode (
	__IDEvent__ Integer NOT NULL,
	__IDEpisode__ Integer NOT NULL
) ;

CREATE TABLE Actor_user_User (
	__IDActor__ Integer NOT NULL,
	__IDUser__ Integer NOT NULL
) ;
