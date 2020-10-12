CREATE TABLE Member (
	__IDMember__ Integer NOT NULL,
	name text,
	FOREIGN KEY owner (__FKowner__) REFERENCES Type (__IDType__),
	PRIMARY KEY Member (__IDMember__),
	__FKowner__ Integer
) ;

CREATE TABLE TypedAttribute (
	__IDTypedAttribute__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY TypedAttribute (__IDTypedAttribute__),
	__FKtype__ Integer
) ;

CREATE TABLE Field (
	__IDField__ Integer NOT NULL,
	PRIMARY KEY Field (__IDField__)
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	isReadable Boolean,
	isWritable Boolean,
	PRIMARY KEY Property (__IDProperty__)
) ;

CREATE TABLE MethodBase (
	__IDMethodBase__ Integer NOT NULL,
	visibility text,
	isAbstract Boolean,
	isFinal Boolean,
	isStatic Boolean,
	PRIMARY KEY MethodBase (__IDMethodBase__)
) ;

CREATE TABLE Constructor (
	__IDConstructor__ Integer NOT NULL,
	PRIMARY KEY Constructor (__IDConstructor__)
) ;

CREATE TABLE Method (
	__IDMethod__ Integer NOT NULL,
	FOREIGN KEY returnType (__FKreturnType__) REFERENCES Type (__IDType__),
	PRIMARY KEY Method (__IDMethod__),
	__FKreturnType__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	qualifiedName text,
	isAbstract Boolean,
	visibility text,
	isSealed Boolean,
	nameSpace text,
	FOREIGN KEY t_container (__FKt_container__) REFERENCES Assembly (__IDAssembly__),
	FOREIGN KEY super (__FKsuper__) REFERENCES Type (__IDType__),
	PRIMARY KEY Type (__IDType__),
	__FKt_container__ Integer,
	__FKsuper__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	isIn Boolean,
	isOut Boolean,
	name Boolean,
	position Integer,
	FOREIGN KEY method (__FKmethod__) REFERENCES MethodBase (__IDMethodBase__),
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKtype__ Integer,
	__FKmethod__ Integer
) ;

CREATE TABLE Assembly (
	__IDAssembly__ Integer NOT NULL,
	name text,
	PRIMARY KEY Assembly (__IDAssembly__)
) ;

CREATE TABLE Type_members_Member (
	__IDType__ Integer NOT NULL,
	__IDMember__ Integer NOT NULL
) ;

CREATE TABLE MethodBase_parameters_Parameter (
	__IDMethodBase__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Assembly_content_Type (
	__IDAssembly__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;
