CREATE TABLE AWKProgram (
	__IDAWKProgram__ Integer NOT NULL,
	name text,
	FOREIGN KEY input (__FKinput__) REFERENCES File (__IDFile__),
	FOREIGN KEY output (__FKoutput__) REFERENCES File (__IDFile__),
	FOREIGN KEY script (__FKscript__) REFERENCES Script (__IDScript__),
	PRIMARY KEY AWKProgram (__IDAWKProgram__),
	__FKscript__ Integer,
	__FKoutput__ Integer,
	__FKinput__ Integer
) ;

CREATE TABLE File (
	__IDFile__ Integer NOT NULL,
	name text,
	PRIMARY KEY File (__IDFile__)
) ;

CREATE TABLE Record (
	__IDRecord__ Integer NOT NULL,
	FOREIGN KEY r_file (__FKr_file__) REFERENCES File (__IDFile__),
	PRIMARY KEY Record (__IDRecord__),
	__FKr_file__ Integer
) ;

CREATE TABLE Field (
	__IDField__ Integer NOT NULL,
	value text,
	FOREIGN KEY f_record (__FKf_record__) REFERENCES Record (__IDRecord__),
	PRIMARY KEY Field (__IDField__),
	__FKf_record__ Integer
) ;

CREATE TABLE Script (
	__IDScript__ Integer NOT NULL,
	name text,
	PRIMARY KEY Script (__IDScript__)
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	FOREIGN KEY r_script (__FKr_script__) REFERENCES Script (__IDScript__),
	FOREIGN KEY pattern (__FKpattern__) REFERENCES Pattern (__IDPattern__),
	FOREIGN KEY action (__FKaction__) REFERENCES Action (__IDAction__),
	PRIMARY KEY Rule (__IDRule__),
	__FKpattern__ Integer,
	__FKr_script__ Integer,
	__FKaction__ Integer
) ;

CREATE TABLE Pattern (
	__IDPattern__ Integer NOT NULL,
	regularExpression text,
	PRIMARY KEY Pattern (__IDPattern__)
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	PRIMARY KEY Action (__IDAction__)
) ;

CREATE TABLE Instruction (
	__IDInstruction__ Integer NOT NULL,
	value text,
	FOREIGN KEY i_action (__FKi_action__) REFERENCES Action (__IDAction__),
	PRIMARY KEY Instruction (__IDInstruction__),
	__FKi_action__ Integer
) ;

CREATE TABLE InitialRule (
	__IDInitialRule__ Integer NOT NULL,
	PRIMARY KEY InitialRule (__IDInitialRule__)
) ;

CREATE TABLE FinalRule (
	__IDFinalRule__ Integer NOT NULL,
	PRIMARY KEY FinalRule (__IDFinalRule__)
) ;

CREATE TABLE Record_fields_Field (
	__IDRecord__ Integer NOT NULL,
	__IDField__ Integer NOT NULL
) ;

CREATE TABLE Action_instructions_Instruction (
	__IDAction__ Integer NOT NULL,
	__IDInstruction__ Integer NOT NULL
) ;

CREATE TABLE Script_rules_Rule (
	__IDScript__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE File_records_Record (
	__IDFile__ Integer NOT NULL,
	__IDRecord__ Integer NOT NULL
) ;
