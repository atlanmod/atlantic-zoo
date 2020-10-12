CREATE TABLE EnvironmentContract (
	__IDEnvironmentContract__ Integer NOT NULL,
	FOREIGN KEY specifier_ec (__FKspecifier_ec__) REFERENCES ComputationalTemplate (__IDComputationalTemplate__),
	PRIMARY KEY EnvironmentContract (__IDEnvironmentContract__),
	__FKspecifier_ec__ Integer
) ;

CREATE TABLE ComputationalTemplate (
	__IDComputationalTemplate__ Integer NOT NULL,
	FOREIGN KEY ct_to_ec (__FKct_to_ec__) REFERENCES EnvironmentContract (__IDEnvironmentContract__),
	PRIMARY KEY ComputationalTemplate (__IDComputationalTemplate__),
	__FKct_to_ec__ Integer
) ;

CREATE TABLE ComputationalObject (
	__IDComputationalObject__ Integer NOT NULL,
	FOREIGN KEY co_to_bh (__FKco_to_bh__) REFERENCES Behaviour (__IDBehaviour__),
	FOREIGN KEY specifier_co (__FKspecifier_co__) REFERENCES ComputationalObjectTemplate (__IDComputationalObjectTemplate__),
	FOREIGN KEY co_to_st (__FKco_to_st__) REFERENCES State (__IDState__),
	PRIMARY KEY ComputationalObject (__IDComputationalObject__),
	__FKco_to_st__ Integer,
	__FKspecifier_co__ Integer,
	__FKco_to_bh__ Integer
) ;

CREATE TABLE BindingObject (
	__IDBindingObject__ Integer NOT NULL,
	PRIMARY KEY BindingObject (__IDBindingObject__)
) ;

CREATE TABLE ComputationalObjectTemplate (
	__IDComputationalObjectTemplate__ Integer NOT NULL,
	PRIMARY KEY ComputationalObjectTemplate (__IDComputationalObjectTemplate__)
) ;

CREATE TABLE ComputationalInterfaceTemplate (
	__IDComputationalInterfaceTemplate__ Integer NOT NULL,
	FOREIGN KEY cit_to_intsig (__FKcit_to_intsig__) REFERENCES InterfaceSignature (__IDInterfaceSignature__),
	PRIMARY KEY ComputationalInterfaceTemplate (__IDComputationalInterfaceTemplate__),
	__FKcit_to_intsig__ Integer
) ;

CREATE TABLE Interface (
	__IDInterface__ Integer NOT NULL,
	FOREIGN KEY owner_i (__FKowner_i__) REFERENCES ComputationalObject (__IDComputationalObject__),
	FOREIGN KEY i_to_bd (__FKi_to_bd__) REFERENCES Binding (__IDBinding__),
	FOREIGN KEY specifier_i (__FKspecifier_i__) REFERENCES ComputationalInterfaceTemplate (__IDComputationalInterfaceTemplate__),
	PRIMARY KEY Interface (__IDInterface__),
	__FKi_to_bd__ Integer,
	__FKowner_i__ Integer,
	__FKspecifier_i__ Integer
) ;

CREATE TABLE Binding (
	__IDBinding__ Integer NOT NULL,
	PRIMARY KEY Binding (__IDBinding__)
) ;

CREATE TABLE SignalInterface (
	__IDSignalInterface__ Integer NOT NULL,
	PRIMARY KEY SignalInterface (__IDSignalInterface__)
) ;

CREATE TABLE OperationInterface (
	__IDOperationInterface__ Integer NOT NULL,
	PRIMARY KEY OperationInterface (__IDOperationInterface__)
) ;

CREATE TABLE StreamInterface (
	__IDStreamInterface__ Integer NOT NULL,
	PRIMARY KEY StreamInterface (__IDStreamInterface__)
) ;

CREATE TABLE InterfaceSignature (
	__IDInterfaceSignature__ Integer NOT NULL,
	FOREIGN KEY intsig_to_cit (__FKintsig_to_cit__) REFERENCES ComputationalInterfaceTemplate (__IDComputationalInterfaceTemplate__),
	PRIMARY KEY InterfaceSignature (__IDInterfaceSignature__),
	__FKintsig_to_cit__ Integer
) ;

CREATE TABLE SignalInterfaceSignature (
	__IDSignalInterfaceSignature__ Integer NOT NULL,
	PRIMARY KEY SignalInterfaceSignature (__IDSignalInterfaceSignature__)
) ;

CREATE TABLE OperationInterfaceSignature (
	__IDOperationInterfaceSignature__ Integer NOT NULL,
	PRIMARY KEY OperationInterfaceSignature (__IDOperationInterfaceSignature__)
) ;

CREATE TABLE StreamInterfaceSignature (
	__IDStreamInterfaceSignature__ Integer NOT NULL,
	PRIMARY KEY StreamInterfaceSignature (__IDStreamInterfaceSignature__)
) ;

CREATE TABLE InteractionSignature (
	__IDInteractionSignature__ Integer NOT NULL,
	FOREIGN KEY isig_to_at (__FKisig_to_at__) REFERENCES ActionTemplate (__IDActionTemplate__),
	PRIMARY KEY InteractionSignature (__IDInteractionSignature__),
	__FKisig_to_at__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	FOREIGN KEY param_to_isig (__FKparam_to_isig__) REFERENCES InteractionSignature (__IDInteractionSignature__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKparam_to_isig__ Integer
) ;

CREATE TABLE AnnouncementSignature (
	__IDAnnouncementSignature__ Integer NOT NULL,
	FOREIGN KEY ansig_to_optisig (__FKansig_to_optisig__) REFERENCES OperationInterfaceSignature (__IDOperationInterfaceSignature__),
	PRIMARY KEY AnnouncementSignature (__IDAnnouncementSignature__),
	__FKansig_to_optisig__ Integer
) ;

CREATE TABLE InterrogationSignature (
	__IDInterrogationSignature__ Integer NOT NULL,
	FOREIGN KEY intsig_to_optisig (__FKintsig_to_optisig__) REFERENCES OperationInterfaceSignature (__IDOperationInterfaceSignature__),
	PRIMARY KEY InterrogationSignature (__IDInterrogationSignature__),
	__FKintsig_to_optisig__ Integer
) ;

CREATE TABLE TerminationSignature (
	__IDTerminationSignature__ Integer NOT NULL,
	FOREIGN KEY tersig_to_intsig (__FKtersig_to_intsig__) REFERENCES InterrogationSignature (__IDInterrogationSignature__),
	PRIMARY KEY TerminationSignature (__IDTerminationSignature__),
	__FKtersig_to_intsig__ Integer
) ;

CREATE TABLE SignalSignature (
	__IDSignalSignature__ Integer NOT NULL,
	FOREIGN KEY ssig_to_sgisig (__FKssig_to_sgisig__) REFERENCES SignalInterfaceSignature (__IDSignalInterfaceSignature__),
	PRIMARY KEY SignalSignature (__IDSignalSignature__),
	__FKssig_to_sgisig__ Integer
) ;

CREATE TABLE FlowSignature (
	__IDFlowSignature__ Integer NOT NULL,
	FOREIGN KEY fsig_to_strisig (__FKfsig_to_strisig__) REFERENCES StreamInterfaceSignature (__IDStreamInterfaceSignature__),
	PRIMARY KEY FlowSignature (__IDFlowSignature__),
	__FKfsig_to_strisig__ Integer
) ;

CREATE TABLE ActionTemplate (
	__IDActionTemplate__ Integer NOT NULL,
	FOREIGN KEY at_to_isig (__FKat_to_isig__) REFERENCES InteractionSignature (__IDInteractionSignature__),
	PRIMARY KEY ActionTemplate (__IDActionTemplate__),
	__FKat_to_isig__ Integer
) ;

CREATE TABLE Behaviour (
	__IDBehaviour__ Integer NOT NULL,
	FOREIGN KEY specifier_bh (__FKspecifier_bh__) REFERENCES ComputationalTemplate (__IDComputationalTemplate__),
	FOREIGN KEY owner_bh (__FKowner_bh__) REFERENCES ComputationalObject (__IDComputationalObject__),
	PRIMARY KEY Behaviour (__IDBehaviour__),
	__FKowner_bh__ Integer,
	__FKspecifier_bh__ Integer
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	FOREIGN KEY specifier_a (__FKspecifier_a__) REFERENCES ActionTemplate (__IDActionTemplate__),
	FOREIGN KEY a_to_bh (__FKa_to_bh__) REFERENCES Behaviour (__IDBehaviour__),
	PRIMARY KEY Action (__IDAction__),
	__FKa_to_bh__ Integer,
	__FKspecifier_a__ Integer
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	FOREIGN KEY startState (__FKstartState__) REFERENCES State (__IDState__),
	FOREIGN KEY endState (__FKendState__) REFERENCES State (__IDState__),
	FOREIGN KEY st_to_co (__FKst_to_co__) REFERENCES ComputationalObject (__IDComputationalObject__),
	PRIMARY KEY State (__IDState__),
	__FKst_to_co__ Integer,
	__FKstartState__ Integer,
	__FKendState__ Integer
) ;

CREATE TABLE InternalAction (
	__IDInternalAction__ Integer NOT NULL,
	PRIMARY KEY InternalAction (__IDInternalAction__)
) ;

CREATE TABLE Interaction (
	__IDInteraction__ Integer NOT NULL,
	FOREIGN KEY ina_to_i (__FKina_to_i__) REFERENCES Interface (__IDInterface__),
	PRIMARY KEY Interaction (__IDInteraction__),
	__FKina_to_i__ Integer
) ;

CREATE TABLE Flow (
	__IDFlow__ Integer NOT NULL,
	PRIMARY KEY Flow (__IDFlow__)
) ;

CREATE TABLE Signal (
	__IDSignal__ Integer NOT NULL,
	PRIMARY KEY Signal (__IDSignal__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	FOREIGN KEY opt_to_inv (__FKopt_to_inv__) REFERENCES Invocation (__IDInvocation__),
	PRIMARY KEY Operation (__IDOperation__),
	__FKopt_to_inv__ Integer
) ;

CREATE TABLE Announcement (
	__IDAnnouncement__ Integer NOT NULL,
	PRIMARY KEY Announcement (__IDAnnouncement__)
) ;

CREATE TABLE Interrogation (
	__IDInterrogation__ Integer NOT NULL,
	FOREIGN KEY int_to_ter (__FKint_to_ter__) REFERENCES Termination (__IDTermination__),
	PRIMARY KEY Interrogation (__IDInterrogation__),
	__FKint_to_ter__ Integer
) ;

CREATE TABLE Invocation (
	__IDInvocation__ Integer NOT NULL,
	FOREIGN KEY inv_to_ter (__FKinv_to_ter__) REFERENCES Termination (__IDTermination__),
	FOREIGN KEY inv_to_opt (__FKinv_to_opt__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY Invocation (__IDInvocation__),
	__FKinv_to_opt__ Integer,
	__FKinv_to_ter__ Integer
) ;

CREATE TABLE Termination (
	__IDTermination__ Integer NOT NULL,
	FOREIGN KEY owner_ter (__FKowner_ter__) REFERENCES Interrogation (__IDInterrogation__),
	FOREIGN KEY ter_to_inv (__FKter_to_inv__) REFERENCES Invocation (__IDInvocation__),
	PRIMARY KEY Termination (__IDTermination__),
	__FKowner_ter__ Integer,
	__FKter_to_inv__ Integer
) ;

CREATE TABLE SignalInterfaceSignature_sgisig_to_ssig_SignalSignature (
	__IDSignalInterfaceSignature__ Integer NOT NULL,
	__IDSignalSignature__ Integer NOT NULL
) ;

CREATE TABLE ComputationalTemplate_ct_to_bh_Behaviour (
	__IDComputationalTemplate__ Integer NOT NULL,
	__IDBehaviour__ Integer NOT NULL
) ;

CREATE TABLE InterrogationSignature_intsig_to_tersig_TerminationSignature (
	__IDInterrogationSignature__ Integer NOT NULL,
	__IDTerminationSignature__ Integer NOT NULL
) ;

CREATE TABLE ComputationalInterfaceTemplate_cit_to_i_Interface (
	__IDComputationalInterfaceTemplate__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Behaviour_bh_to_a_Action (
	__IDBehaviour__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE ComputationalObject_co_to_i_Interface (
	__IDComputationalObject__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE OperationInterfaceSignature_optisig_to_ansig_AnnouncementSignature (
	__IDOperationInterfaceSignature__ Integer NOT NULL,
	__IDAnnouncementSignature__ Integer NOT NULL
) ;

CREATE TABLE ComputationalObjectTemplate_part_provide_ComputationalInterfaceTemplate (
	__IDComputationalObjectTemplate__ Integer NOT NULL,
	__IDComputationalInterfaceTemplate__ Integer NOT NULL
) ;

CREATE TABLE InteractionSignature_isig_to_param_Parameter (
	__IDInteractionSignature__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Interface_i_to_ina_Interaction (
	__IDInterface__ Integer NOT NULL,
	__IDInteraction__ Integer NOT NULL
) ;

CREATE TABLE ActionTemplate_at_to_a_Action (
	__IDActionTemplate__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE Binding_bd_to_i_Interface (
	__IDBinding__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Action_constrainer_ec_EnvironmentContract (
	__IDAction__ Integer NOT NULL,
	__IDEnvironmentContract__ Integer NOT NULL
) ;

CREATE TABLE EnvironmentContract_ec_to_a_Action (
	__IDEnvironmentContract__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE StreamInterfaceSignature_strisig_to_fsig_FlowSignature (
	__IDStreamInterfaceSignature__ Integer NOT NULL,
	__IDFlowSignature__ Integer NOT NULL
) ;

CREATE TABLE ComputationalObjectTemplate_part_request_ComputationalInterfaceTemplate (
	__IDComputationalObjectTemplate__ Integer NOT NULL,
	__IDComputationalInterfaceTemplate__ Integer NOT NULL
) ;

CREATE TABLE Action_changedState_State (
	__IDAction__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE OperationInterfaceSignature_optisig_to_intsig_InterrogationSignature (
	__IDOperationInterfaceSignature__ Integer NOT NULL,
	__IDInterrogationSignature__ Integer NOT NULL
) ;

CREATE TABLE ComputationalObjectTemplate_cot_to_co_ComputationalObject (
	__IDComputationalObjectTemplate__ Integer NOT NULL,
	__IDComputationalObject__ Integer NOT NULL
) ;

CREATE TABLE ComputationalInterfaceTemplate_aggregate_request_ComputationalObjectTemplate (
	__IDComputationalInterfaceTemplate__ Integer NOT NULL,
	__IDComputationalObjectTemplate__ Integer NOT NULL
) ;

CREATE TABLE ComputationalInterfaceTemplate_aggregate_provide_ComputationalObjectTemplate (
	__IDComputationalInterfaceTemplate__ Integer NOT NULL,
	__IDComputationalObjectTemplate__ Integer NOT NULL
) ;

CREATE TABLE State_changer_Action (
	__IDState__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;
