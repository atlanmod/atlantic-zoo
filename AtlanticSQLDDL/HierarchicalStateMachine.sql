CREATE TABLE MgaObject (
	__IDMgaObject__ Integer NOT NULL,
	name text,
	position text,
	PRIMARY KEY MgaObject (__IDMgaObject__)
) ;

CREATE TABLE StateBase (
	__IDStateBase__ Integer NOT NULL,
	defaultTransition text,
	marked Boolean,
	FOREIGN KEY associationDataStateBase (__FKassociationDataStateBase__) REFERENCES AssociationDataStateBase (__IDAssociationDataStateBase__),
	PRIMARY KEY StateBase (__IDStateBase__),
	__FKassociationDataStateBase__ Integer
) ;

CREATE TABLE DataVar (
	__IDDataVar__ Integer NOT NULL,
	FOREIGN KEY orState (__FKorState__) REFERENCES OrState (__IDOrState__),
	FOREIGN KEY associationDataStateBase (__FKassociationDataStateBase__) REFERENCES AssociationDataStateBase (__IDAssociationDataStateBase__),
	PRIMARY KEY DataVar (__IDDataVar__),
	__FKassociationDataStateBase__ Integer,
	__FKorState__ Integer
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	guard text,
	"trigger" text,
	action text,
	isSync Boolean,
	FOREIGN KEY orState (__FKorState__) REFERENCES OrState (__IDOrState__),
	FOREIGN KEY associationStateState (__FKassociationStateState__) REFERENCES AssociationStateState (__IDAssociationStateState__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKorState__ Integer,
	__FKassociationStateState__ Integer
) ;

CREATE TABLE StateDateRelation (
	__IDStateDateRelation__ Integer NOT NULL,
	value text,
	color text,
	PRIMARY KEY StateDateRelation (__IDStateDateRelation__)
) ;

CREATE TABLE RootFolder (
	__IDRootFolder__ Integer NOT NULL,
	name text,
	PRIMARY KEY RootFolder (__IDRootFolder__)
) ;

CREATE TABLE OrState (
	__IDOrState__ Integer NOT NULL,
	FOREIGN KEY rootFolder (__FKrootFolder__) REFERENCES RootFolder (__IDRootFolder__),
	FOREIGN KEY init (__FKinit__) REFERENCES Init (__IDInit__),
	PRIMARY KEY OrState (__IDOrState__),
	__FKrootFolder__ Integer,
	__FKinit__ Integer
) ;

CREATE TABLE AndState (
	__IDAndState__ Integer NOT NULL,
	PRIMARY KEY AndState (__IDAndState__)
) ;

CREATE TABLE CompoundState (
	__IDCompoundState__ Integer NOT NULL,
	FOREIGN KEY andState (__FKandState__) REFERENCES AndState (__IDAndState__),
	FOREIGN KEY orState (__FKorState__) REFERENCES OrState (__IDOrState__),
	PRIMARY KEY CompoundState (__IDCompoundState__),
	__FKorState__ Integer,
	__FKandState__ Integer
) ;

CREATE TABLE PrimitiveState (
	__IDPrimitiveState__ Integer NOT NULL,
	PRIMARY KEY PrimitiveState (__IDPrimitiveState__)
) ;

CREATE TABLE Init (
	__IDInit__ Integer NOT NULL,
	FOREIGN KEY orState (__FKorState__) REFERENCES OrState (__IDOrState__),
	PRIMARY KEY Init (__IDInit__),
	__FKorState__ Integer
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	FOREIGN KEY orState (__FKorState__) REFERENCES OrState (__IDOrState__),
	PRIMARY KEY State (__IDState__),
	__FKorState__ Integer
) ;

CREATE TABLE StateDataRelation (
	__IDStateDataRelation__ Integer NOT NULL,
	value text,
	color text,
	FOREIGN KEY orState (__FKorState__) REFERENCES OrState (__IDOrState__),
	FOREIGN KEY associationDataStateBase1 (__FKassociationDataStateBase1__) REFERENCES AssociationDataStateBase (__IDAssociationDataStateBase__),
	PRIMARY KEY StateDataRelation (__IDStateDataRelation__),
	__FKassociationDataStateBase1__ Integer,
	__FKorState__ Integer
) ;

CREATE TABLE AssociationStateState (
	__IDAssociationStateState__ Integer NOT NULL,
	FOREIGN KEY transition (__FKtransition__) REFERENCES Transition (__IDTransition__),
	PRIMARY KEY AssociationStateState (__IDAssociationStateState__),
	__FKtransition__ Integer
) ;

CREATE TABLE AssociationDataStateBase (
	__IDAssociationDataStateBase__ Integer NOT NULL,
	FOREIGN KEY stateDataRelation (__FKstateDataRelation__) REFERENCES StateDataRelation (__IDStateDataRelation__),
	PRIMARY KEY AssociationDataStateBase (__IDAssociationDataStateBase__),
	__FKstateDataRelation__ Integer
) ;

CREATE TABLE DataVar_stateBase_StateBase (
	__IDDataVar__ Integer NOT NULL,
	__IDStateBase__ Integer NOT NULL
) ;

CREATE TABLE AssociationDataStateBase_dataVar_DataVar (
	__IDAssociationDataStateBase__ Integer NOT NULL,
	__IDDataVar__ Integer NOT NULL
) ;

CREATE TABLE OrState_compoundState_CompoundState (
	__IDOrState__ Integer NOT NULL,
	__IDCompoundState__ Integer NOT NULL
) ;

CREATE TABLE RootFolder_orState_OrState (
	__IDRootFolder__ Integer NOT NULL,
	__IDOrState__ Integer NOT NULL
) ;

CREATE TABLE StateBase_data_DataVar (
	__IDStateBase__ Integer NOT NULL,
	__IDDataVar__ Integer NOT NULL
) ;

CREATE TABLE StateBase_associationStateStatedst_AssociationStateState (
	__IDStateBase__ Integer NOT NULL,
	__IDAssociationStateState__ Integer NOT NULL
) ;

CREATE TABLE OrState_dataVar_DataVar (
	__IDOrState__ Integer NOT NULL,
	__IDDataVar__ Integer NOT NULL
) ;

CREATE TABLE AssociationStateState_dstTransition_StateBase (
	__IDAssociationStateState__ Integer NOT NULL,
	__IDStateBase__ Integer NOT NULL
) ;

CREATE TABLE OrState_transition_Transition (
	__IDOrState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE AndState_compoundState_CompoundState (
	__IDAndState__ Integer NOT NULL,
	__IDCompoundState__ Integer NOT NULL
) ;

CREATE TABLE AssociationDataStateBase_stateBase_StateBase (
	__IDAssociationDataStateBase__ Integer NOT NULL,
	__IDStateBase__ Integer NOT NULL
) ;

CREATE TABLE RootFolder_rootFolders_RootFolder (
	__IDRootFolder__ Integer NOT NULL,
	__IDRootFolder__ Integer NOT NULL
) ;

CREATE TABLE OrState_stateDataRelation_StateDataRelation (
	__IDOrState__ Integer NOT NULL,
	__IDStateDataRelation__ Integer NOT NULL
) ;

CREATE TABLE OrState_state_State (
	__IDOrState__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE AssociationStateState_srcTransition_StateBase (
	__IDAssociationStateState__ Integer NOT NULL,
	__IDStateBase__ Integer NOT NULL
) ;

CREATE TABLE StateBase_associationStateStatesrc_AssociationStateState (
	__IDStateBase__ Integer NOT NULL,
	__IDAssociationStateState__ Integer NOT NULL
) ;
