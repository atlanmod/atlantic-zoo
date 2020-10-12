CREATE TABLE DateType (
	__IDDateType__ Integer NOT NULL,
	day Integer,
	month Integer,
	year Integer,
	PRIMARY KEY DateType (__IDDateType__)
) ;

CREATE TABLE ControlsSequence (
	__IDControlsSequence__ Integer NOT NULL,
	PRIMARY KEY ControlsSequence (__IDControlsSequence__)
) ;

CREATE TABLE Control (
	__IDControl__ Integer NOT NULL,
	FOREIGN KEY c_controlsSequence (__FKc_controlsSequence__) REFERENCES ControlsSequence (__IDControlsSequence__),
	responsible text,
	component text,
	developmentPhase text,
	scope text,
	FOREIGN KEY date (__FKdate__) REFERENCES DateType (__IDDateType__),
	controlledElt text,
	eltRef text,
	eltAuthor text,
	formRef text,
	FOREIGN KEY type (__FKtype__) REFERENCES ControlType (__IDControlType__),
	PRIMARY KEY Control (__IDControl__),
	__FKdate__ Integer,
	__FKc_controlsSequence__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE ControlType (
	__IDControlType__ Integer NOT NULL,
	FOREIGN KEY ct_control (__FKct_control__) REFERENCES Control (__IDControl__),
	PRIMARY KEY ControlType (__IDControlType__),
	__FKct_control__ Integer
) ;

CREATE TABLE BugTracking (
	__IDBugTracking__ Integer NOT NULL,
	PRIMARY KEY BugTracking (__IDBugTracking__)
) ;

CREATE TABLE Bug (
	__IDBug__ Integer NOT NULL,
	FOREIGN KEY b_bugTracking (__FKb_bugTracking__) REFERENCES BugTracking (__IDBugTracking__),
	number Integer,
	componentVersion text,
	description text,
	status text,
	originator text,
	responsible text,
	commentsAnswers text,
	openDate text,
	closeDate text,
	PRIMARY KEY Bug (__IDBug__),
	__FKb_bugTracking__ Integer
) ;

CREATE TABLE ControlsSequence_controls_Control (
	__IDControlsSequence__ Integer NOT NULL,
	__IDControl__ Integer NOT NULL
) ;

CREATE TABLE BugTracking_bugs_Bug (
	__IDBugTracking__ Integer NOT NULL,
	__IDBug__ Integer NOT NULL
) ;
