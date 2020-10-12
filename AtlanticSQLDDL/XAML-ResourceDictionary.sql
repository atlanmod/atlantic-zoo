CREATE TABLE Transformation (
	__IDTransformation__ Integer NOT NULL,
	PRIMARY KEY Transformation (__IDTransformation__)
) ;

CREATE TABLE WinFXElement (
	__IDWinFXElement__ Integer NOT NULL,
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES NameSpace (__IDNameSpace__),
	PRIMARY KEY WinFXElement (__IDWinFXElement__),
	__FKnamespace__ Integer
) ;

CREATE TABLE NameSpace (
	__IDNameSpace__ Integer NOT NULL,
	namespace text,
	identifier text,
	PRIMARY KEY NameSpace (__IDNameSpace__)
) ;

CREATE TABLE ResourceGroup (
	__IDResourceGroup__ Integer NOT NULL,
	FOREIGN KEY "key" (__FKkey__) REFERENCES "Key" (__IDKey__),
	PRIMARY KEY ResourceGroup (__IDResourceGroup__),
	__FKkey__ Integer
) ;

CREATE TABLE Material (
	__IDMaterial__ Integer NOT NULL,
	PRIMARY KEY Material (__IDMaterial__)
) ;

CREATE TABLE "Key" (
	__IDKey__ Integer NOT NULL,
	name text,
	PRIMARY KEY "Key" (__IDKey__)
) ;

CREATE TABLE ResourceDictionary (
	__IDResourceDictionary__ Integer NOT NULL,
	PRIMARY KEY ResourceDictionary (__IDResourceDictionary__)
) ;

CREATE TABLE Transform3DGroup (
	__IDTransform3DGroup__ Integer NOT NULL,
	PRIMARY KEY Transform3DGroup (__IDTransform3DGroup__)
) ;

CREATE TABLE MaterialGroup (
	__IDMaterialGroup__ Integer NOT NULL,
	PRIMARY KEY MaterialGroup (__IDMaterialGroup__)
) ;

CREATE TABLE DiffuseMaterial (
	__IDDiffuseMaterial__ Integer NOT NULL,
	Brush text,
	PRIMARY KEY DiffuseMaterial (__IDDiffuseMaterial__)
) ;

CREATE TABLE TranslateTransform3D (
	__IDTranslateTransform3D__ Integer NOT NULL,
	OffsetX "Double",
	OffsetY "Double",
	OffsetZ "Double",
	PRIMARY KEY TranslateTransform3D (__IDTranslateTransform3D__)
) ;

CREATE TABLE ScaleTransform3D (
	__IDScaleTransform3D__ Integer NOT NULL,
	ScaleX "Double",
	ScaleY "Double",
	ScaleZ "Double",
	PRIMARY KEY ScaleTransform3D (__IDScaleTransform3D__)
) ;

CREATE TABLE RotateTransform3D (
	__IDRotateTransform3D__ Integer NOT NULL,
	CenterX "Double",
	CenterY "Double",
	FOREIGN KEY rotation (__FKrotation__) REFERENCES RotateTransformat3DRotation (__IDRotateTransformat3DRotation__),
	PRIMARY KEY RotateTransform3D (__IDRotateTransform3D__),
	__FKrotation__ Integer
) ;

CREATE TABLE RotateTransformat3DRotation (
	__IDRotateTransformat3DRotation__ Integer NOT NULL,
	FOREIGN KEY axisAngleRotation3D (__FKaxisAngleRotation3D__) REFERENCES AxisAngleRotation3D (__IDAxisAngleRotation3D__),
	PRIMARY KEY RotateTransformat3DRotation (__IDRotateTransformat3DRotation__),
	__FKaxisAngleRotation3D__ Integer
) ;

CREATE TABLE AxisAngleRotation3D (
	__IDAxisAngleRotation3D__ Integer NOT NULL,
	angle Integer,
	axis text,
	PRIMARY KEY AxisAngleRotation3D (__IDAxisAngleRotation3D__)
) ;

CREATE TABLE ResourceDictionary_resourcegroups_ResourceGroup (
	__IDResourceDictionary__ Integer NOT NULL,
	__IDResourceGroup__ Integer NOT NULL
) ;

CREATE TABLE ResourceDictionary_xmlns_NameSpace (
	__IDResourceDictionary__ Integer NOT NULL,
	__IDNameSpace__ Integer NOT NULL
) ;

CREATE TABLE Transform3DGroup_transformations_Transformation (
	__IDTransform3DGroup__ Integer NOT NULL,
	__IDTransformation__ Integer NOT NULL
) ;

CREATE TABLE MaterialGroup_materials_Material (
	__IDMaterialGroup__ Integer NOT NULL,
	__IDMaterial__ Integer NOT NULL
) ;
