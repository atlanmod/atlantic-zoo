CREATE TABLE UEMLObject (
	__IDUEMLObject__ Integer NOT NULL,
	FOREIGN KEY has (__FKhas__) REFERENCES Geometry (__IDGeometry__),
	FOREIGN KEY model (__FKmodel__) REFERENCES UEMLModel (__IDUEMLModel__),
	PRIMARY KEY UEMLObject (__IDUEMLObject__),
	__FKmodel__ Integer,
	__FKhas__ Integer
) ;

CREATE TABLE UEMLModel (
	__IDUEMLModel__ Integer NOT NULL,
	PRIMARY KEY UEMLModel (__IDUEMLModel__)
) ;

CREATE TABLE Geometry (
	__IDGeometry__ Integer NOT NULL,
	FOREIGN KEY object (__FKobject__) REFERENCES UEMLObject (__IDUEMLObject__),
	PRIMARY KEY Geometry (__IDGeometry__),
	__FKobject__ Integer
) ;

CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	PRIMARY KEY Port (__IDPort__)
) ;

CREATE TABLE Flow (
	__IDFlow__ Integer NOT NULL,
	FOREIGN KEY associationConnector (__FKassociationConnector__) REFERENCES AssociationConnector (__IDAssociationConnector__),
	PRIMARY KEY Flow (__IDFlow__),
	__FKassociationConnector__ Integer
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	FOREIGN KEY parent (__FKparent__) REFERENCES Process (__IDProcess__),
	FOREIGN KEY hasOutput (__FKhasOutput__) REFERENCES OutputPort (__IDOutputPort__),
	PRIMARY KEY Activity (__IDActivity__),
	__FKhasOutput__ Integer,
	__FKparent__ Integer
) ;

CREATE TABLE Object (
	__IDObject__ Integer NOT NULL,
	FOREIGN KEY ioFlow (__FKioFlow__) REFERENCES IOFlow (__IDIOFlow__),
	PRIMARY KEY Object (__IDObject__),
	__FKioFlow__ Integer
) ;

CREATE TABLE InformationObject (
	__IDInformationObject__ Integer NOT NULL,
	FOREIGN KEY controlFlow (__FKcontrolFlow__) REFERENCES ControlFlow (__IDControlFlow__),
	PRIMARY KEY InformationObject (__IDInformationObject__),
	__FKcontrolFlow__ Integer
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	FOREIGN KEY carries (__FKcarries__) REFERENCES ResourceFlow (__IDResourceFlow__),
	PRIMARY KEY Resource (__IDResource__),
	__FKcarries__ Integer
) ;

CREATE TABLE MaterialResource (
	__IDMaterialResource__ Integer NOT NULL,
	PRIMARY KEY MaterialResource (__IDMaterialResource__)
) ;

CREATE TABLE HumanResource (
	__IDHumanResource__ Integer NOT NULL,
	PRIMARY KEY HumanResource (__IDHumanResource__)
) ;

CREATE TABLE ResourceFlow (
	__IDResourceFlow__ Integer NOT NULL,
	PRIMARY KEY ResourceFlow (__IDResourceFlow__)
) ;

CREATE TABLE IOFlow (
	__IDIOFlow__ Integer NOT NULL,
	PRIMARY KEY IOFlow (__IDIOFlow__)
) ;

CREATE TABLE ControlFlow (
	__IDControlFlow__ Integer NOT NULL,
	PRIMARY KEY ControlFlow (__IDControlFlow__)
) ;

CREATE TABLE TriggerFlow (
	__IDTriggerFlow__ Integer NOT NULL,
	PRIMARY KEY TriggerFlow (__IDTriggerFlow__)
) ;

CREATE TABLE ConstraintFlow (
	__IDConstraintFlow__ Integer NOT NULL,
	PRIMARY KEY ConstraintFlow (__IDConstraintFlow__)
) ;

CREATE TABLE ResourceRole (
	__IDResourceRole__ Integer NOT NULL,
	FOREIGN KEY roleQualifier (__FKroleQualifier__) REFERENCES RoleType (__IDRoleType__),
	FOREIGN KEY "in" (__FKin__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY ResourceRole (__IDResourceRole__),
	__FKin__ Integer,
	__FKroleQualifier__ Integer
) ;

CREATE TABLE RoleType (
	__IDRoleType__ Integer NOT NULL,
	PRIMARY KEY RoleType (__IDRoleType__)
) ;

CREATE TABLE Anchor (
	__IDAnchor__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES AssociationConnector (__IDAssociationConnector__),
	FOREIGN KEY origin (__FKorigin__) REFERENCES AssociationConnector (__IDAssociationConnector__),
	PRIMARY KEY Anchor (__IDAnchor__),
	__FKorigin__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE OutputPort (
	__IDOutputPort__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY OutputPort (__IDOutputPort__),
	__FKactivity__ Integer
) ;

CREATE TABLE InputPort (
	__IDInputPort__ Integer NOT NULL,
	PRIMARY KEY InputPort (__IDInputPort__)
) ;

CREATE TABLE ConnectionOperator (
	__IDConnectionOperator__ Integer NOT NULL,
	PRIMARY KEY ConnectionOperator (__IDConnectionOperator__)
) ;

CREATE TABLE AssociationConnector (
	__IDAssociationConnector__ Integer NOT NULL,
	FOREIGN KEY classAssociation (__FKclassAssociation__) REFERENCES Flow (__IDFlow__),
	PRIMARY KEY AssociationConnector (__IDAssociationConnector__),
	__FKclassAssociation__ Integer
) ;

CREATE TABLE Process (
	__IDProcess__ Integer NOT NULL,
	FOREIGN KEY child (__FKchild__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY realises (__FKrealises__) REFERENCES Service (__IDService__),
	PRIMARY KEY Process (__IDProcess__),
	__FKrealises__ Integer,
	__FKchild__ Integer
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	FOREIGN KEY process (__FKprocess__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY Service (__IDService__),
	__FKprocess__ Integer
) ;

CREATE TABLE Agent (
	__IDAgent__ Integer NOT NULL,
	FOREIGN KEY obliger (__FKobliger__) REFERENCES Commitment (__IDCommitment__),
	FOREIGN KEY claimer (__FKclaimer__) REFERENCES Commitment (__IDCommitment__),
	FOREIGN KEY has_parties (__FKhas_parties__) REFERENCES Contract (__IDContract__),
	PRIMARY KEY Agent (__IDAgent__),
	__FKobliger__ Integer,
	__FKclaimer__ Integer,
	__FKhas_parties__ Integer
) ;

CREATE TABLE Contract (
	__IDContract__ Integer NOT NULL,
	PRIMARY KEY Contract (__IDContract__)
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE Commitment (
	__IDCommitment__ Integer NOT NULL,
	FOREIGN KEY task (__FKtask__) REFERENCES Task (__IDTask__),
	FOREIGN KEY agentO (__FKagentO__) REFERENCES Agent (__IDAgent__),
	FOREIGN KEY agentC (__FKagentC__) REFERENCES Agent (__IDAgent__),
	FOREIGN KEY contract (__FKcontract__) REFERENCES Contract (__IDContract__),
	PRIMARY KEY Commitment (__IDCommitment__),
	__FKagentO__ Integer,
	__FKagentC__ Integer,
	__FKcontract__ Integer,
	__FKtask__ Integer
) ;

CREATE TABLE Resource_plays_ResourceRole (
	__IDResource__ Integer NOT NULL,
	__IDResourceRole__ Integer NOT NULL
) ;

CREATE TABLE ControlFlow_carries_InformationObject (
	__IDControlFlow__ Integer NOT NULL,
	__IDInformationObject__ Integer NOT NULL
) ;

CREATE TABLE Process_fulfills_Contract (
	__IDProcess__ Integer NOT NULL,
	__IDContract__ Integer NOT NULL
) ;

CREATE TABLE ResourceFlow_resourceCarries_Resource (
	__IDResourceFlow__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE IOFlow_carries_Object (
	__IDIOFlow__ Integer NOT NULL,
	__IDObject__ Integer NOT NULL
) ;

CREATE TABLE Contract_process_Process (
	__IDContract__ Integer NOT NULL,
	__IDProcess__ Integer NOT NULL
) ;

CREATE TABLE Contract_collection_of_Commitment (
	__IDContract__ Integer NOT NULL,
	__IDCommitment__ Integer NOT NULL
) ;

CREATE TABLE ResourceRole_resourcePlays_Resource (
	__IDResourceRole__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Task_fulfills_Commitment (
	__IDTask__ Integer NOT NULL,
	__IDCommitment__ Integer NOT NULL
) ;

CREATE TABLE Activity_resourceRole_ResourceRole (
	__IDActivity__ Integer NOT NULL,
	__IDResourceRole__ Integer NOT NULL
) ;

CREATE TABLE Contract_agent_Agent (
	__IDContract__ Integer NOT NULL,
	__IDAgent__ Integer NOT NULL
) ;

CREATE TABLE AssociationConnector_origin_Anchor (
	__IDAssociationConnector__ Integer NOT NULL,
	__IDAnchor__ Integer NOT NULL
) ;

CREATE TABLE UEMLModel_contains_UEMLObject (
	__IDUEMLModel__ Integer NOT NULL,
	__IDUEMLObject__ Integer NOT NULL
) ;

CREATE TABLE AssociationConnector_target_Anchor (
	__IDAssociationConnector__ Integer NOT NULL,
	__IDAnchor__ Integer NOT NULL
) ;
