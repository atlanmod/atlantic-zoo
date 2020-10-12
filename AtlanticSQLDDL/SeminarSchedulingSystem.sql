CREATE TABLE SeminarSchedulingSystem (
	__IDSeminarSchedulingSystem__ Integer NOT NULL,
	PRIMARY KEY SeminarSchedulingSystem (__IDSeminarSchedulingSystem__)
) ;

CREATE TABLE Presenter (
	__IDPresenter__ Integer NOT NULL,
	name text,
	FOREIGN KEY seminarSchedulingSystem (__FKseminarSchedulingSystem__) REFERENCES SeminarSchedulingSystem (__IDSeminarSchedulingSystem__),
	PRIMARY KEY Presenter (__IDPresenter__),
	__FKseminarSchedulingSystem__ Integer
) ;

CREATE TABLE Seminar (
	__IDSeminar__ Integer NOT NULL,
	title text,
	FOREIGN KEY seminarSchedulingSystem (__FKseminarSchedulingSystem__) REFERENCES SeminarSchedulingSystem (__IDSeminarSchedulingSystem__),
	PRIMARY KEY Seminar (__IDSeminar__),
	__FKseminarSchedulingSystem__ Integer
) ;

CREATE TABLE Offering (
	__IDOffering__ Integer NOT NULL,
	is_cancelled Boolean,
	FOREIGN KEY date (__FKdate__) REFERENCES Date (__IDDate__),
	FOREIGN KEY presenter (__FKpresenter__) REFERENCES Presenter (__IDPresenter__),
	FOREIGN KEY seminar (__FKseminar__) REFERENCES Seminar (__IDSeminar__),
	PRIMARY KEY Offering (__IDOffering__),
	__FKdate__ Integer,
	__FKpresenter__ Integer,
	__FKseminar__ Integer
) ;

CREATE TABLE Date (
	__IDDate__ Integer NOT NULL,
	year Integer,
	month Integer,
	day Integer,
	PRIMARY KEY Date (__IDDate__)
) ;

CREATE TABLE Attendee (
	__IDAttendee__ Integer NOT NULL,
	name text,
	PRIMARY KEY Attendee (__IDAttendee__)
) ;

CREATE TABLE Attendee_offering_Offering (
	__IDAttendee__ Integer NOT NULL,
	__IDOffering__ Integer NOT NULL
) ;

CREATE TABLE Offering_attendee_Attendee (
	__IDOffering__ Integer NOT NULL,
	__IDAttendee__ Integer NOT NULL
) ;

CREATE TABLE Seminar_offering_Offering (
	__IDSeminar__ Integer NOT NULL,
	__IDOffering__ Integer NOT NULL
) ;

CREATE TABLE SeminarSchedulingSystem_seminar_Seminar (
	__IDSeminarSchedulingSystem__ Integer NOT NULL,
	__IDSeminar__ Integer NOT NULL
) ;

CREATE TABLE Presenter_qualifiedFor_Seminar (
	__IDPresenter__ Integer NOT NULL,
	__IDSeminar__ Integer NOT NULL
) ;

CREATE TABLE Presenter_offering_Offering (
	__IDPresenter__ Integer NOT NULL,
	__IDOffering__ Integer NOT NULL
) ;

CREATE TABLE Seminar_qualified_Presenter (
	__IDSeminar__ Integer NOT NULL,
	__IDPresenter__ Integer NOT NULL
) ;

CREATE TABLE SeminarSchedulingSystem_presenter_Presenter (
	__IDSeminarSchedulingSystem__ Integer NOT NULL,
	__IDPresenter__ Integer NOT NULL
) ;
