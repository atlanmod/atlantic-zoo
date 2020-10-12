CREATE TABLE TwoByteField (
	__IDTwoByteField__ Integer NOT NULL,
	PRIMARY KEY TwoByteField (__IDTwoByteField__)
) ;

CREATE TABLE VariableLengthField (
	__IDVariableLengthField__ Integer NOT NULL,
	PRIMARY KEY VariableLengthField (__IDVariableLengthField__)
) ;

CREATE TABLE IMSTransactionMessage (
	__IDIMSTransactionMessage__ Integer NOT NULL,
	OIMAPrefixFormat text,
	standardFieldsFlag Boolean,
	FOREIGN KEY OIMAPrefixComponent (__FKOIMAPrefixComponent__) REFERENCES OIMAPrefix (__IDOIMAPrefix__),
	FOREIGN KEY standardFieldComponent (__FKstandardFieldComponent__) REFERENCES StandardFields (__IDStandardFields__),
	FOREIGN KEY messageComponent (__FKmessageComponent__) REFERENCES ApplicationData (__IDApplicationData__),
	PRIMARY KEY IMSTransactionMessage (__IDIMSTransactionMessage__),
	__FKOIMAPrefixComponent__ Integer,
	__FKstandardFieldComponent__ Integer,
	__FKmessageComponent__ Integer
) ;

CREATE TABLE OIMAPrefix (
	__IDOIMAPrefix__ Integer NOT NULL,
	FOREIGN KEY controlDataComponent (__FKcontrolDataComponent__) REFERENCES ControlData (__IDControlData__),
	FOREIGN KEY stateDataComponent (__FKstateDataComponent__) REFERENCES StateData (__IDStateData__),
	FOREIGN KEY securityDataComponent (__FKsecurityDataComponent__) REFERENCES SecurityData (__IDSecurityData__),
	FOREIGN KEY userDataComponent (__FKuserDataComponent__) REFERENCES UserData (__IDUserData__),
	PRIMARY KEY OIMAPrefix (__IDOIMAPrefix__),
	__FKuserDataComponent__ Integer,
	__FKcontrolDataComponent__ Integer,
	__FKsecurityDataComponent__ Integer,
	__FKstateDataComponent__ Integer
) ;

CREATE TABLE ControlData (
	__IDControlData__ Integer NOT NULL,
	PRIMARY KEY ControlData (__IDControlData__)
) ;

CREATE TABLE StateData (
	__IDStateData__ Integer NOT NULL,
	PRIMARY KEY StateData (__IDStateData__)
) ;

CREATE TABLE SecurityData (
	__IDSecurityData__ Integer NOT NULL,
	PRIMARY KEY SecurityData (__IDSecurityData__)
) ;

CREATE TABLE UserData (
	__IDUserData__ Integer NOT NULL,
	PRIMARY KEY UserData (__IDUserData__)
) ;

CREATE TABLE StandardFields (
	__IDStandardFields__ Integer NOT NULL,
	FOREIGN KEY length (__FKlength__) REFERENCES TwoByteField (__IDTwoByteField__),
	FOREIGN KEY reservedField (__FKreservedField__) REFERENCES TwoByteField (__IDTwoByteField__),
	FOREIGN KEY transactionCode (__FKtransactionCode__) REFERENCES VariableLengthField (__IDVariableLengthField__),
	PRIMARY KEY StandardFields (__IDStandardFields__),
	__FKlength__ Integer,
	__FKtransactionCode__ Integer,
	__FKreservedField__ Integer
) ;

CREATE TABLE ApplicationData (
	__IDApplicationData__ Integer NOT NULL,
	PRIMARY KEY ApplicationData (__IDApplicationData__)
) ;

CREATE TABLE Field (
	__IDField__ Integer NOT NULL,
	FOREIGN KEY fieldContainer (__FKfieldContainer__) REFERENCES ApplicationData (__IDApplicationData__),
	PRIMARY KEY Field (__IDField__),
	__FKfieldContainer__ Integer
) ;

CREATE TABLE TDLangElement (
	__IDTDLangElement__ Integer NOT NULL,
	PRIMARY KEY TDLangElement (__IDTDLangElement__)
) ;

CREATE TABLE ApplicationData_fieldComponents_Field (
	__IDApplicationData__ Integer NOT NULL,
	__IDField__ Integer NOT NULL
) ;

CREATE TABLE ApplicationData_languageElements_TDLangElement (
	__IDApplicationData__ Integer NOT NULL,
	__IDTDLangElement__ Integer NOT NULL
) ;
