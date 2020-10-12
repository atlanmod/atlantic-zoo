CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	FOREIGN KEY asso_Port_Signalsrc (__FKasso_Port_Signalsrc__) REFERENCES Asso_Port_Signal (__IDAsso_Port_Signal__),
	FOREIGN KEY asso_Port_Signaldst (__FKasso_Port_Signaldst__) REFERENCES Asso_Port_Signal (__IDAsso_Port_Signal__),
	PRIMARY KEY Port (__IDPort__),
	__FKasso_Port_Signaldst__ Integer,
	__FKasso_Port_Signalsrc__ Integer
) ;

CREATE TABLE Signal (
	__IDSignal__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES Base (__IDBase__),
	FOREIGN KEY asso_Port_Signal (__FKasso_Port_Signal__) REFERENCES Asso_Port_Signal (__IDAsso_Port_Signal__),
	PRIMARY KEY Signal (__IDSignal__),
	__FKbase__ Integer,
	__FKasso_Port_Signal__ Integer
) ;

CREATE TABLE Base (
	__IDBase__ Integer NOT NULL,
	FOREIGN KEY compound (__FKcompound__) REFERENCES Compound (__IDCompound__),
	PRIMARY KEY Base (__IDBase__),
	__FKcompound__ Integer
) ;

CREATE TABLE Compound (
	__IDCompound__ Integer NOT NULL,
	PRIMARY KEY Compound (__IDCompound__)
) ;

CREATE TABLE InputPort (
	__IDInputPort__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES Base (__IDBase__),
	PRIMARY KEY InputPort (__IDInputPort__),
	__FKbase__ Integer
) ;

CREATE TABLE OutputPort (
	__IDOutputPort__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES Base (__IDBase__),
	PRIMARY KEY OutputPort (__IDOutputPort__),
	__FKbase__ Integer
) ;

CREATE TABLE LocalPort (
	__IDLocalPort__ Integer NOT NULL,
	FOREIGN KEY compound (__FKcompound__) REFERENCES Compound (__IDCompound__),
	PRIMARY KEY LocalPort (__IDLocalPort__),
	__FKcompound__ Integer
) ;

CREATE TABLE Primitive (
	__IDPrimitive__ Integer NOT NULL,
	PRIMARY KEY Primitive (__IDPrimitive__)
) ;

CREATE TABLE Asso_Port_Signal (
	__IDAsso_Port_Signal__ Integer NOT NULL,
	FOREIGN KEY signal (__FKsignal__) REFERENCES Signal (__IDSignal__),
	PRIMARY KEY Asso_Port_Signal (__IDAsso_Port_Signal__),
	__FKsignal__ Integer
) ;

CREATE TABLE Asso_Port_Signal_dst_Port (
	__IDAsso_Port_Signal__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE Base_outputPort_OutputPort (
	__IDBase__ Integer NOT NULL,
	__IDOutputPort__ Integer NOT NULL
) ;

CREATE TABLE Compound_localPort_LocalPort (
	__IDCompound__ Integer NOT NULL,
	__IDLocalPort__ Integer NOT NULL
) ;

CREATE TABLE Base_signal_Signal (
	__IDBase__ Integer NOT NULL,
	__IDSignal__ Integer NOT NULL
) ;

CREATE TABLE Asso_Port_Signal_src_Port (
	__IDAsso_Port_Signal__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE Base_inputPort_InputPort (
	__IDBase__ Integer NOT NULL,
	__IDInputPort__ Integer NOT NULL
) ;

CREATE TABLE Compound_base_Base (
	__IDCompound__ Integer NOT NULL,
	__IDBase__ Integer NOT NULL
) ;
