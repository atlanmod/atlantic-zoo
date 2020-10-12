CREATE TABLE Actor (
	__IDActor__ Integer NOT NULL,
	PRIMARY KEY Actor (__IDActor__)
) ;

CREATE TABLE Agent (
	__IDAgent__ Integer NOT NULL,
	FOREIGN KEY occupy (__FKoccupy__) REFERENCES Position (__IDPosition__),
	PRIMARY KEY Agent (__IDAgent__),
	__FKoccupy__ Integer
) ;

CREATE TABLE Position (
	__IDPosition__ Integer NOT NULL,
	PRIMARY KEY Position (__IDPosition__)
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	PRIMARY KEY Role (__IDRole__)
) ;

CREATE TABLE Position_cover_Role (
	__IDPosition__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE Agent_play_Role (
	__IDAgent__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;
