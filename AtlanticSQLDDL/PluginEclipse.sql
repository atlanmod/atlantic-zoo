CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Eclipse (
	__IDEclipse__ Integer NOT NULL,
	PRIMARY KEY Eclipse (__IDEclipse__)
) ;

CREATE TABLE Bundle (
	__IDBundle__ Integer NOT NULL,
	symbolicName text,
	singleton Boolean,
	manifestVersion Integer,
	FOREIGN KEY version (__FKversion__) REFERENCES Version (__IDVersion__),
	PRIMARY KEY Bundle (__IDBundle__),
	__FKversion__ Integer
) ;

CREATE TABLE RequireBundleAttribute (
	__IDRequireBundleAttribute__ Integer NOT NULL,
	PRIMARY KEY RequireBundleAttribute (__IDRequireBundleAttribute__)
) ;

CREATE TABLE AttResolution (
	__IDAttResolution__ Integer NOT NULL,
	value text,
	PRIMARY KEY AttResolution (__IDAttResolution__)
) ;

CREATE TABLE AttVisibility (
	__IDAttVisibility__ Integer NOT NULL,
	value text,
	PRIMARY KEY AttVisibility (__IDAttVisibility__)
) ;

CREATE TABLE Range (
	__IDRange__ Integer NOT NULL,
	isLeftInclusive Boolean,
	isRightInclusive Boolean,
	FOREIGN KEY lowerBound (__FKlowerBound__) REFERENCES Version (__IDVersion__),
	FOREIGN KEY upperBound (__FKupperBound__) REFERENCES Version (__IDVersion__),
	PRIMARY KEY Range (__IDRange__),
	__FKlowerBound__ Integer,
	__FKupperBound__ Integer
) ;

CREATE TABLE Version (
	__IDVersion__ Integer NOT NULL,
	major Integer,
	minor Integer,
	micro Integer,
	qualification text,
	PRIMARY KEY Version (__IDVersion__)
) ;

CREATE TABLE RequiredBundle (
	__IDRequiredBundle__ Integer NOT NULL,
	FOREIGN KEY bundle (__FKbundle__) REFERENCES Bundle (__IDBundle__),
	PRIMARY KEY RequiredBundle (__IDRequiredBundle__),
	__FKbundle__ Integer
) ;

CREATE TABLE ImportedPackage (
	__IDImportedPackage__ Integer NOT NULL,
	resolution text,
	FOREIGN KEY package (__FKpackage__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY range (__FKrange__) REFERENCES Range (__IDRange__),
	PRIMARY KEY ImportedPackage (__IDImportedPackage__),
	__FKpackage__ Integer,
	__FKrange__ Integer
) ;

CREATE TABLE ExportedPackage (
	__IDExportedPackage__ Integer NOT NULL,
	FOREIGN KEY package (__FKpackage__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY version (__FKversion__) REFERENCES Version (__IDVersion__),
	FOREIGN KEY xFriends (__FKxFriends__) REFERENCES Xfriends (__IDXfriends__),
	PRIMARY KEY ExportedPackage (__IDExportedPackage__),
	__FKpackage__ Integer,
	__FKversion__ Integer,
	__FKxFriends__ Integer
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	fqn text,
	FOREIGN KEY exportedBy (__FKexportedBy__) REFERENCES ExportedPackage (__IDExportedPackage__),
	PRIMARY KEY Package (__IDPackage__),
	__FKexportedBy__ Integer
) ;

CREATE TABLE Xfriends (
	__IDXfriends__ Integer NOT NULL,
	PRIMARY KEY Xfriends (__IDXfriends__)
) ;

CREATE TABLE Xinternal (
	__IDXinternal__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY Xinternal (__IDXinternal__)
) ;

CREATE TABLE Eclipse_bundles_Bundle (
	__IDEclipse__ Integer NOT NULL,
	__IDBundle__ Integer NOT NULL
) ;

CREATE TABLE Eclipse_packages_Package (
	__IDEclipse__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE Bundle_require_RequiredBundle (
	__IDBundle__ Integer NOT NULL,
	__IDRequiredBundle__ Integer NOT NULL
) ;

CREATE TABLE Bundle_export_ExportedPackage (
	__IDBundle__ Integer NOT NULL,
	__IDExportedPackage__ Integer NOT NULL
) ;

CREATE TABLE Bundle_import_ImportedPackage (
	__IDBundle__ Integer NOT NULL,
	__IDImportedPackage__ Integer NOT NULL
) ;

CREATE TABLE Bundle_packages_Package (
	__IDBundle__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE RequiredBundle_requireBundleAttribute_RequireBundleAttribute (
	__IDRequiredBundle__ Integer NOT NULL,
	__IDRequireBundleAttribute__ Integer NOT NULL
) ;

CREATE TABLE Package_importedBy_ImportedPackage (
	__IDPackage__ Integer NOT NULL,
	__IDImportedPackage__ Integer NOT NULL
) ;

CREATE TABLE Xfriends_bundles_Bundle (
	__IDXfriends__ Integer NOT NULL,
	__IDBundle__ Integer NOT NULL
) ;
