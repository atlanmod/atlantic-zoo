CREATE TABLE DXF (
	__IDDXF__ Integer NOT NULL,
	PRIMARY KEY DXF (__IDDXF__)
) ;

CREATE TABLE Mesh (
	__IDMesh__ Integer NOT NULL,
	name text,
	PRIMARY KEY Mesh (__IDMesh__)
) ;

CREATE TABLE Point (
	__IDPoint__ Integer NOT NULL,
	name text,
	FOREIGN KEY mesh (__FKmesh__) REFERENCES Mesh (__IDMesh__),
	x "Double",
	y "Double",
	z "Double",
	PRIMARY KEY Point (__IDPoint__),
	__FKmesh__ Integer
) ;

CREATE TABLE Mesh_points_Point (
	__IDMesh__ Integer NOT NULL,
	__IDPoint__ Integer NOT NULL
) ;

CREATE TABLE DXF_meshes_Mesh (
	__IDDXF__ Integer NOT NULL,
	__IDMesh__ Integer NOT NULL
) ;
