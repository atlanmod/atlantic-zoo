CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	name text,
	FOREIGN KEY service (__FKservice__) REFERENCES Service (__IDService__),
	FOREIGN KEY binding (__FKbinding__) REFERENCES Binding (__IDBinding__),
	PRIMARY KEY Port (__IDPort__),
	__FKservice__ Integer,
	__FKbinding__ Integer
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	name text,
	PRIMARY KEY Service (__IDService__)
) ;

CREATE TABLE Param (
	__IDParam__ Integer NOT NULL,
	name text,
	FOREIGN KEY message (__FKmessage__) REFERENCES Message (__IDMessage__),
	PRIMARY KEY Param (__IDParam__),
	__FKmessage__ Integer
) ;

CREATE TABLE Input (
	__IDInput__ Integer NOT NULL,
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY Input (__IDInput__),
	__FKoperation__ Integer
) ;

CREATE TABLE Output (
	__IDOutput__ Integer NOT NULL,
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY Output (__IDOutput__),
	__FKoperation__ Integer
) ;

CREATE TABLE PortType (
	__IDPortType__ Integer NOT NULL,
	name text,
	PRIMARY KEY PortType (__IDPortType__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	name text,
	FOREIGN KEY input (__FKinput__) REFERENCES Input (__IDInput__),
	FOREIGN KEY output (__FKoutput__) REFERENCES Output (__IDOutput__),
	FOREIGN KEY type (__FKtype__) REFERENCES PortType (__IDPortType__),
	PRIMARY KEY Operation (__IDOperation__),
	__FKtype__ Integer,
	__FKoutput__ Integer,
	__FKinput__ Integer
) ;

CREATE TABLE StartWithExtensions (
	__IDStartWithExtensions__ Integer NOT NULL,
	PRIMARY KEY StartWithExtensions (__IDStartWithExtensions__)
) ;

CREATE TABLE Binding (
	__IDBinding__ Integer NOT NULL,
	name text,
	FOREIGN KEY type (__FKtype__) REFERENCES PortType (__IDPortType__),
	PRIMARY KEY Binding (__IDBinding__),
	__FKtype__ Integer
) ;

CREATE TABLE BindingFault (
	__IDBindingFault__ Integer NOT NULL,
	FOREIGN KEY operation (__FKoperation__) REFERENCES BindingOperation (__IDBindingOperation__),
	FOREIGN KEY binding (__FKbinding__) REFERENCES Fault (__IDFault__),
	PRIMARY KEY BindingFault (__IDBindingFault__),
	__FKoperation__ Integer,
	__FKbinding__ Integer
) ;

CREATE TABLE BindingOperation (
	__IDBindingOperation__ Integer NOT NULL,
	name text,
	FOREIGN KEY bind (__FKbind__) REFERENCES Binding (__IDBinding__),
	FOREIGN KEY binding (__FKbinding__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY input (__FKinput__) REFERENCES StartWithExtensions (__IDStartWithExtensions__),
	FOREIGN KEY output (__FKoutput__) REFERENCES StartWithExtensions (__IDStartWithExtensions__),
	PRIMARY KEY BindingOperation (__IDBindingOperation__),
	__FKbinding__ Integer,
	__FKinput__ Integer,
	__FKbind__ Integer,
	__FKoutput__ Integer
) ;

CREATE TABLE Fault (
	__IDFault__ Integer NOT NULL,
	name text,
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY message (__FKmessage__) REFERENCES Message (__IDMessage__),
	PRIMARY KEY Fault (__IDFault__),
	__FKoperation__ Integer,
	__FKmessage__ Integer
) ;

CREATE TABLE Message (
	__IDMessage__ Integer NOT NULL,
	name text,
	PRIMARY KEY Message (__IDMessage__)
) ;

CREATE TABLE Part (
	__IDPart__ Integer NOT NULL,
	name text,
	FOREIGN KEY message (__FKmessage__) REFERENCES Message (__IDMessage__),
	PRIMARY KEY Part (__IDPart__),
	__FKmessage__ Integer
) ;

CREATE TABLE Binding_ports_Port (
	__IDBinding__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE BindingOperation_faults_BindingFault (
	__IDBindingOperation__ Integer NOT NULL,
	__IDBindingFault__ Integer NOT NULL
) ;

CREATE TABLE Message_params_Param (
	__IDMessage__ Integer NOT NULL,
	__IDParam__ Integer NOT NULL
) ;

CREATE TABLE Message_parts_Part (
	__IDMessage__ Integer NOT NULL,
	__IDPart__ Integer NOT NULL
) ;

CREATE TABLE Binding_operations_BindingOperation (
	__IDBinding__ Integer NOT NULL,
	__IDBindingOperation__ Integer NOT NULL
) ;

CREATE TABLE PortType_bindings_Binding (
	__IDPortType__ Integer NOT NULL,
	__IDBinding__ Integer NOT NULL
) ;

CREATE TABLE Operation_faults_Fault (
	__IDOperation__ Integer NOT NULL,
	__IDFault__ Integer NOT NULL
) ;

CREATE TABLE Service_ports_Port (
	__IDService__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE PortType_operations_Operation (
	__IDPortType__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Message_faults_Fault (
	__IDMessage__ Integer NOT NULL,
	__IDFault__ Integer NOT NULL
) ;
