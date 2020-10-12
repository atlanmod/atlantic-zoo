CREATE TABLE JavaProject (
	__IDJavaProject__ Integer NOT NULL,
	PRIMARY KEY JavaProject (__IDJavaProject__)
) ;

CREATE TABLE PackageFragment (
	__IDPackageFragment__ Integer NOT NULL,
	PRIMARY KEY PackageFragment (__IDPackageFragment__)
) ;

CREATE TABLE CompilationUnit (
	__IDCompilationUnit__ Integer NOT NULL,
	FOREIGN KEY declaration (__FKdeclaration__) REFERENCES PackageDeclaration (__IDPackageDeclaration__),
	PRIMARY KEY CompilationUnit (__IDCompilationUnit__),
	__FKdeclaration__ Integer
) ;

CREATE TABLE ImportDeclaration (
	__IDImportDeclaration__ Integer NOT NULL,
	PRIMARY KEY ImportDeclaration (__IDImportDeclaration__)
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	elementName text,
	member_kind text,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE Field (
	__IDField__ Integer NOT NULL,
	PRIMARY KEY Field (__IDField__)
) ;

CREATE TABLE Method (
	__IDMethod__ Integer NOT NULL,
	returnType text,
	PRIMARY KEY Method (__IDMethod__)
) ;

CREATE TABLE JavaElement (
	__IDJavaElement__ Integer NOT NULL,
	PRIMARY KEY JavaElement (__IDJavaElement__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE PackageDeclaration (
	__IDPackageDeclaration__ Integer NOT NULL,
	PRIMARY KEY PackageDeclaration (__IDPackageDeclaration__)
) ;

CREATE TABLE JavaProject_ownedPackageFragment_PackageFragment (
	__IDJavaProject__ Integer NOT NULL,
	__IDPackageFragment__ Integer NOT NULL
) ;

CREATE TABLE PackageFragment_ownedCompilationUnit_CompilationUnit (
	__IDPackageFragment__ Integer NOT NULL,
	__IDCompilationUnit__ Integer NOT NULL
) ;

CREATE TABLE CompilationUnit_importDeclaration_ImportDeclaration (
	__IDCompilationUnit__ Integer NOT NULL,
	__IDImportDeclaration__ Integer NOT NULL
) ;

CREATE TABLE CompilationUnit_ownedType_Type (
	__IDCompilationUnit__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Type_nestedType_Type (
	__IDType__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Type_ownedSuperType_Type (
	__IDType__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Type_methods_Method (
	__IDType__ Integer NOT NULL,
	__IDMethod__ Integer NOT NULL
) ;

CREATE TABLE Type_fields_Field (
	__IDType__ Integer NOT NULL,
	__IDField__ Integer NOT NULL
) ;
