CREATE TABLE RootFolder (
	__IDRootFolder__ Integer NOT NULL,
	PRIMARY KEY RootFolder (__IDRootFolder__)
) ;

CREATE TABLE CompoundComponent (
	__IDCompoundComponent__ Integer NOT NULL,
	FOREIGN KEY rootFolder (__FKrootFolder__) REFERENCES RootFolder (__IDRootFolder__),
	PRIMARY KEY CompoundComponent (__IDCompoundComponent__),
	__FKrootFolder__ Integer
) ;

CREATE TABLE PrimitiveComponent (
	__IDPrimitiveComponent__ Integer NOT NULL,
	PRIMARY KEY PrimitiveComponent (__IDPrimitiveComponent__)
) ;

CREATE TABLE BaseComponent (
	__IDBaseComponent__ Integer NOT NULL,
	name text,
	position text,
	FOREIGN KEY compoundComponent (__FKcompoundComponent__) REFERENCES CompoundComponent (__IDCompoundComponent__),
	PRIMARY KEY BaseComponent (__IDBaseComponent__),
	__FKcompoundComponent__ Integer
) ;

CREATE TABLE InputPort (
	__IDInputPort__ Integer NOT NULL,
	FOREIGN KEY baseComponent (__FKbaseComponent__) REFERENCES BaseComponent (__IDBaseComponent__),
	PRIMARY KEY InputPort (__IDInputPort__),
	__FKbaseComponent__ Integer
) ;

CREATE TABLE LocalPort (
	__IDLocalPort__ Integer NOT NULL,
	FOREIGN KEY compoundComponent (__FKcompoundComponent__) REFERENCES CompoundComponent (__IDCompoundComponent__),
	PRIMARY KEY LocalPort (__IDLocalPort__),
	__FKcompoundComponent__ Integer
) ;

CREATE TABLE OutputPort (
	__IDOutputPort__ Integer NOT NULL,
	FOREIGN KEY baseComponent (__FKbaseComponent__) REFERENCES BaseComponent (__IDBaseComponent__),
	PRIMARY KEY OutputPort (__IDOutputPort__),
	__FKbaseComponent__ Integer
) ;

CREATE TABLE PortBase (
	__IDPortBase__ Integer NOT NULL,
	name text,
	position text,
	FOREIGN KEY associationPortBase_PortBasesrc (__FKassociationPortBase_PortBasesrc__) REFERENCES AssociationPortBase_PortBase (__IDAssociationPortBase_PortBase__),
	FOREIGN KEY associationPortBase_PortBasedst (__FKassociationPortBase_PortBasedst__) REFERENCES AssociationPortBase_PortBase (__IDAssociationPortBase_PortBase__),
	PRIMARY KEY PortBase (__IDPortBase__),
	__FKassociationPortBase_PortBasedst__ Integer,
	__FKassociationPortBase_PortBasesrc__ Integer
) ;

CREATE TABLE Signal (
	__IDSignal__ Integer NOT NULL,
	name text,
	position text,
	FOREIGN KEY baseComponent (__FKbaseComponent__) REFERENCES BaseComponent (__IDBaseComponent__),
	FOREIGN KEY associationPortBase_PortBase (__FKassociationPortBase_PortBase__) REFERENCES AssociationPortBase_PortBase (__IDAssociationPortBase_PortBase__),
	PRIMARY KEY Signal (__IDSignal__),
	__FKbaseComponent__ Integer,
	__FKassociationPortBase_PortBase__ Integer
) ;

CREATE TABLE AssociationPortBase_PortBase (
	__IDAssociationPortBase_PortBase__ Integer NOT NULL,
	FOREIGN KEY signal (__FKsignal__) REFERENCES Signal (__IDSignal__),
	PRIMARY KEY AssociationPortBase_PortBase (__IDAssociationPortBase_PortBase__),
	__FKsignal__ Integer
) ;

CREATE TABLE BaseComponent_signal_Signal (
	__IDBaseComponent__ Integer NOT NULL,
	__IDSignal__ Integer NOT NULL
) ;

CREATE TABLE AssociationPortBase_PortBase_dstPortBase_PortBase (
	__IDAssociationPortBase_PortBase__ Integer NOT NULL,
	__IDPortBase__ Integer NOT NULL
) ;

CREATE TABLE BaseComponent_inputPort_InputPort (
	__IDBaseComponent__ Integer NOT NULL,
	__IDInputPort__ Integer NOT NULL
) ;

CREATE TABLE RootFolder_compoundComponent_CompoundComponent (
	__IDRootFolder__ Integer NOT NULL,
	__IDCompoundComponent__ Integer NOT NULL
) ;

CREATE TABLE AssociationPortBase_PortBase_srcPortBase_PortBase (
	__IDAssociationPortBase_PortBase__ Integer NOT NULL,
	__IDPortBase__ Integer NOT NULL
) ;

CREATE TABLE CompoundComponent_baseComponent_BaseComponent (
	__IDCompoundComponent__ Integer NOT NULL,
	__IDBaseComponent__ Integer NOT NULL
) ;

CREATE TABLE CompoundComponent_localPort_LocalPort (
	__IDCompoundComponent__ Integer NOT NULL,
	__IDLocalPort__ Integer NOT NULL
) ;

CREATE TABLE BaseComponent_outputPort_OutputPort (
	__IDBaseComponent__ Integer NOT NULL,
	__IDOutputPort__ Integer NOT NULL
) ;
