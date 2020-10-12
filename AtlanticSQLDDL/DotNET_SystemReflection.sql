CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE Assembly (
	__IDAssembly__ Integer NOT NULL,
	location text,
	imageRuntimeVersion text,
	evidence text,
	codeBase text,
	FOREIGN KEY entryPoint (__FKentryPoint__) REFERENCES MethodInfo (__IDMethodInfo__),
	FOREIGN KEY manifestModule (__FKmanifestModule__) REFERENCES Module (__IDModule__),
	FOREIGN KEY manifest (__FKmanifest__) REFERENCES ManifestResource (__IDManifestResource__),
	PRIMARY KEY Assembly (__IDAssembly__),
	__FKmanifestModule__ Integer,
	__FKmanifest__ Integer,
	__FKentryPoint__ Integer
) ;

CREATE TABLE ManifestResource (
	__IDManifestResource__ Integer NOT NULL,
	content text,
	FOREIGN KEY assembly (__FKassembly__) REFERENCES Assembly (__IDAssembly__),
	PRIMARY KEY ManifestResource (__IDManifestResource__),
	__FKassembly__ Integer
) ;

CREATE TABLE Module (
	__IDModule__ Integer NOT NULL,
	qualifiedName text,
	scopeName text,
	FOREIGN KEY assembly (__FKassembly__) REFERENCES Assembly (__IDAssembly__),
	PRIMARY KEY Module (__IDModule__),
	__FKassembly__ Integer
) ;

CREATE TABLE MemberInfo (
	__IDMemberInfo__ Integer NOT NULL,
	memberType text,
	FOREIGN KEY declaringType (__FKdeclaringType__) REFERENCES Type (__IDType__),
	PRIMARY KEY MemberInfo (__IDMemberInfo__),
	__FKdeclaringType__ Integer
) ;

CREATE TABLE PropertyInfo (
	__IDPropertyInfo__ Integer NOT NULL,
	FOREIGN KEY propertyType (__FKpropertyType__) REFERENCES Type (__IDType__),
	PRIMARY KEY PropertyInfo (__IDPropertyInfo__),
	__FKpropertyType__ Integer
) ;

CREATE TABLE FieldInfo (
	__IDFieldInfo__ Integer NOT NULL,
	FOREIGN KEY fieldType (__FKfieldType__) REFERENCES Type (__IDType__),
	PRIMARY KEY FieldInfo (__IDFieldInfo__),
	__FKfieldType__ Integer
) ;

CREATE TABLE EventInfo (
	__IDEventInfo__ Integer NOT NULL,
	isMulticast Boolean,
	attributes text,
	FOREIGN KEY eventHandlerType (__FKeventHandlerType__) REFERENCES Type (__IDType__),
	PRIMARY KEY EventInfo (__IDEventInfo__),
	__FKeventHandlerType__ Integer
) ;

CREATE TABLE ParameterInfo (
	__IDParameterInfo__ Integer NOT NULL,
	defaultValue text,
	position Integer,
	FOREIGN KEY parameterType (__FKparameterType__) REFERENCES Type (__IDType__),
	FOREIGN KEY member (__FKmember__) REFERENCES MethodBase (__IDMethodBase__),
	PRIMARY KEY ParameterInfo (__IDParameterInfo__),
	__FKparameterType__ Integer,
	__FKmember__ Integer
) ;

CREATE TABLE MethodBase (
	__IDMethodBase__ Integer NOT NULL,
	PRIMARY KEY MethodBase (__IDMethodBase__)
) ;

CREATE TABLE MethodInfo (
	__IDMethodInfo__ Integer NOT NULL,
	FOREIGN KEY returnType (__FKreturnType__) REFERENCES Type (__IDType__),
	PRIMARY KEY MethodInfo (__IDMethodInfo__),
	__FKreturnType__ Integer
) ;

CREATE TABLE ConstructorInfo (
	__IDConstructorInfo__ Integer NOT NULL,
	PRIMARY KEY ConstructorInfo (__IDConstructorInfo__)
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	namespace text,
	FOREIGN KEY baseType (__FKbaseType__) REFERENCES Type (__IDType__),
	FOREIGN KEY module (__FKmodule__) REFERENCES Module (__IDModule__),
	PRIMARY KEY Type (__IDType__),
	__FKmodule__ Integer,
	__FKbaseType__ Integer
) ;

CREATE TABLE Assembly_modules_Module (
	__IDAssembly__ Integer NOT NULL,
	__IDModule__ Integer NOT NULL
) ;

CREATE TABLE MethodBase_parameters_ParameterInfo (
	__IDMethodBase__ Integer NOT NULL,
	__IDParameterInfo__ Integer NOT NULL
) ;

CREATE TABLE Assembly_referencedAssembly_Assembly (
	__IDAssembly__ Integer NOT NULL,
	__IDAssembly__ Integer NOT NULL
) ;

CREATE TABLE Type_interfaces_Type (
	__IDType__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Module_types_Type (
	__IDModule__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Type_members_MemberInfo (
	__IDType__ Integer NOT NULL,
	__IDMemberInfo__ Integer NOT NULL
) ;
