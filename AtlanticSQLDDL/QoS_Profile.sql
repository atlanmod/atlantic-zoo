CREATE TABLE QoSComponent (
	__IDQoSComponent__ Integer NOT NULL,
	FOREIGN KEY operations (__FKoperations__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY QoSComponent (__IDQoSComponent__),
	__FKoperations__ Integer
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	PRIMARY KEY Operation (__IDOperation__)
) ;

CREATE TABLE QoSProfile (
	__IDQoSProfile__ Integer NOT NULL,
	FOREIGN KEY "for" (__FKfor__) REFERENCES QoSComponent (__IDQoSComponent__),
	PRIMARY KEY QoSProfile (__IDQoSProfile__),
	__FKfor__ Integer
) ;

CREATE TABLE CompoundProfile (
	__IDCompoundProfile__ Integer NOT NULL,
	PRIMARY KEY CompoundProfile (__IDCompoundProfile__)
) ;

CREATE TABLE SimpleProfile (
	__IDSimpleProfile__ Integer NOT NULL,
	FOREIGN KEY compoundProfile (__FKcompoundProfile__) REFERENCES CompoundProfile (__IDCompoundProfile__),
	FOREIGN KEY uses (__FKuses__) REFERENCES QoSStatement (__IDQoSStatement__),
	FOREIGN KEY provides (__FKprovides__) REFERENCES QoSStatement (__IDQoSStatement__),
	PRIMARY KEY SimpleProfile (__IDSimpleProfile__),
	__FKprovides__ Integer,
	__FKuses__ Integer,
	__FKcompoundProfile__ Integer
) ;

CREATE TABLE QoSStatement (
	__IDQoSStatement__ Integer NOT NULL,
	PRIMARY KEY QoSStatement (__IDQoSStatement__)
) ;

CREATE TABLE ProfileTransition (
	__IDProfileTransition__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES SimpleProfile (__IDSimpleProfile__),
	FOREIGN KEY "to" (__FKto__) REFERENCES SimpleProfile (__IDSimpleProfile__),
	FOREIGN KEY compoundProfile (__FKcompoundProfile__) REFERENCES CompoundProfile (__IDCompoundProfile__),
	PRIMARY KEY ProfileTransition (__IDProfileTransition__),
	__FKfrom__ Integer,
	__FKcompoundProfile__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE CompoundProfile_simpleProfile_SimpleProfile (
	__IDCompoundProfile__ Integer NOT NULL,
	__IDSimpleProfile__ Integer NOT NULL
) ;

CREATE TABLE ProfileTransition_operations_Operation (
	__IDProfileTransition__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE CompoundProfile_profileTransition_ProfileTransition (
	__IDCompoundProfile__ Integer NOT NULL,
	__IDProfileTransition__ Integer NOT NULL
) ;

CREATE TABLE QoSComponent_profile_QoSProfile (
	__IDQoSComponent__ Integer NOT NULL,
	__IDQoSProfile__ Integer NOT NULL
) ;
