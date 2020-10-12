CREATE TABLE HyperLink (
	__IDHyperLink__ Integer NOT NULL,
	PRIMARY KEY HyperLink (__IDHyperLink__)
) ;

CREATE TABLE HyperLink_server_ServerPage (
	__IDHyperLink__ Integer NOT NULL,
	__IDServerPage__ Integer NOT NULL
) ;
