CREATE TABLE Contact (
	__IDContact__ Integer NOT NULL,
	nom text,
	prenom text,
	PRIMARY KEY Contact (__IDContact__)
) ;

CREATE TABLE Num_fixe (
	__IDNum_fixe__ Integer NOT NULL,
	numero text,
	FOREIGN KEY contact_fixe (__FKcontact_fixe__) REFERENCES Contact (__IDContact__),
	PRIMARY KEY Num_fixe (__IDNum_fixe__),
	__FKcontact_fixe__ Integer
) ;

CREATE TABLE Num_portable (
	__IDNum_portable__ Integer NOT NULL,
	numero text,
	FOREIGN KEY contact_portable (__FKcontact_portable__) REFERENCES Contact (__IDContact__),
	PRIMARY KEY Num_portable (__IDNum_portable__),
	__FKcontact_portable__ Integer
) ;

CREATE TABLE Contact_num_fixes_Num_fixe (
	__IDContact__ Integer NOT NULL,
	__IDNum_fixe__ Integer NOT NULL
) ;

CREATE TABLE Contact_num_portables_Num_portable (
	__IDContact__ Integer NOT NULL,
	__IDNum_portable__ Integer NOT NULL
) ;
