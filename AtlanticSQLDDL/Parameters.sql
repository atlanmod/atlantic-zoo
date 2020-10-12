CREATE TABLE ParametersList (
	__IDParametersList__ Integer NOT NULL,
	PRIMARY KEY ParametersList (__IDParametersList__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	name text,
	value text,
	PRIMARY KEY Parameter (__IDParameter__)
) ;

CREATE TABLE ParametersList_parameters_Parameter (
	__IDParametersList__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;
