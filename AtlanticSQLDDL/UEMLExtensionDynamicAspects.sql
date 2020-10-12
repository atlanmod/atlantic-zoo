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
	PRIMARY KEY Activity (__IDActivity__),
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
	__FKroleQualifier__ Integer,
	__FKin__ Integer
) ;

CREATE TABLE RoleType (
	__IDRoleType__ Integer NOT NULL,
	PRIMARY KEY RoleType (__IDRoleType__)
) ;

CREATE TABLE Anchor (
	__IDAnchor__ Integer NOT NULL,
	PRIMARY KEY Anchor (__IDAnchor__)
) ;

CREATE TABLE OutputPort (
	__IDOutputPort__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY OutputPort (__IDOutputPort__),
	__FKactivity__ Integer
) ;

CREATE TABLE InputPort (
	__IDInputPort__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY InputPort (__IDInputPort__),
	__FKactivity__ Integer
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

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE FlowObject (
	__IDFlowObject__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES AssociationConnector (__IDAssociationConnector__),
	FOREIGN KEY origin (__FKorigin__) REFERENCES AssociationConnector (__IDAssociationConnector__),
	PRIMARY KEY FlowObject (__IDFlowObject__),
	__FKorigin__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	PRIMARY KEY Event (__IDEvent__)
) ;

CREATE TABLE Process (
	__IDProcess__ Integer NOT NULL,
	PRIMARY KEY Process (__IDProcess__)
) ;

CREATE TABLE UEMLModel_contains_UEMLObject (
	__IDUEMLModel__ Integer NOT NULL,
	__IDUEMLObject__ Integer NOT NULL
) ;

CREATE TABLE Activity_resourceRole_ResourceRole (
	__IDActivity__ Integer NOT NULL,
	__IDResourceRole__ Integer NOT NULL
) ;

CREATE TABLE Activity_hasInput_InputPort (
	__IDActivity__ Integer NOT NULL,
	__IDInputPort__ Integer NOT NULL
) ;

CREATE TABLE IOFlow_carries_Object (
	__IDIOFlow__ Integer NOT NULL,
	__IDObject__ Integer NOT NULL
) ;

CREATE TABLE AssociationConnector_target_FlowObject (
	__IDAssociationConnector__ Integer NOT NULL,
	__IDFlowObject__ Integer NOT NULL
) ;

CREATE TABLE Process_child_Activity (
	__IDProcess__ Integer NOT NULL,
	__IDActivity__ Integer NOT NULL
) ;

CREATE TABLE AssociationConnector_origin_FlowObject (
	__IDAssociationConnector__ Integer NOT NULL,
	__IDFlowObject__ Integer NOT NULL
) ;

CREATE TABLE Resource_plays_ResourceRole (
	__IDResource__ Integer NOT NULL,
	__IDResourceRole__ Integer NOT NULL
) ;

CREATE TABLE ResourceRole_resourcePlays_Resource (
	__IDResourceRole__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE ControlFlow_carries_InformationObject (
	__IDControlFlow__ Integer NOT NULL,
	__IDInformationObject__ Integer NOT NULL
) ;

CREATE TABLE ResourceFlow_resourceCarries_Resource (
	__IDResourceFlow__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Activity_hasOutput_OutputPort (
	__IDActivity__ Integer NOT NULL,
	__IDOutputPort__ Integer NOT NULL
) ;
