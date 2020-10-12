CREATE TABLE GeoTransfos (
	__IDGeoTransfos__ Integer NOT NULL,
	name text,
	PRIMARY KEY GeoTransfos (__IDGeoTransfos__)
) ;

CREATE TABLE GeoTransfo (
	__IDGeoTransfo__ Integer NOT NULL,
	name text,
	freeze Boolean,
	FOREIGN KEY superGeoTransfo (__FKsuperGeoTransfo__) REFERENCES GeoTransfo (__IDGeoTransfo__),
	PRIMARY KEY GeoTransfo (__IDGeoTransfo__),
	__FKsuperGeoTransfo__ Integer
) ;

CREATE TABLE Param (
	__IDParam__ Integer NOT NULL,
	name text,
	param "Double",
	FOREIGN KEY geoTransfo (__FKgeoTransfo__) REFERENCES GeoTransfo (__IDGeoTransfo__),
	PRIMARY KEY Param (__IDParam__),
	__FKgeoTransfo__ Integer
) ;

CREATE TABLE GeoTransfo_params_Param (
	__IDGeoTransfo__ Integer NOT NULL,
	__IDParam__ Integer NOT NULL
) ;

CREATE TABLE GeoTransfo_subGeoTransfos_GeoTransfo (
	__IDGeoTransfo__ Integer NOT NULL,
	__IDGeoTransfo__ Integer NOT NULL
) ;

CREATE TABLE GeoTransfos_transfos_GeoTransfo (
	__IDGeoTransfos__ Integer NOT NULL,
	__IDGeoTransfo__ Integer NOT NULL
) ;
