CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE CPL (
	__IDCPL__ Integer NOT NULL,
	FOREIGN KEY outgoing (__FKoutgoing__) REFERENCES Outgoing (__IDOutgoing__),
	FOREIGN KEY incoming (__FKincoming__) REFERENCES Incoming (__IDIncoming__),
	PRIMARY KEY CPL (__IDCPL__),
	__FKoutgoing__ Integer,
	__FKincoming__ Integer
) ;

CREATE TABLE NodeContainer (
	__IDNodeContainer__ Integer NOT NULL,
	FOREIGN KEY contents (__FKcontents__) REFERENCES Node (__IDNode__),
	PRIMARY KEY NodeContainer (__IDNodeContainer__),
	__FKcontents__ Integer
) ;

CREATE TABLE SubAction (
	__IDSubAction__ Integer NOT NULL,
	id text,
	PRIMARY KEY SubAction (__IDSubAction__)
) ;

CREATE TABLE Outgoing (
	__IDOutgoing__ Integer NOT NULL,
	PRIMARY KEY Outgoing (__IDOutgoing__)
) ;

CREATE TABLE Incoming (
	__IDIncoming__ Integer NOT NULL,
	PRIMARY KEY Incoming (__IDIncoming__)
) ;

CREATE TABLE NotPresent (
	__IDNotPresent__ Integer NOT NULL,
	PRIMARY KEY NotPresent (__IDNotPresent__)
) ;

CREATE TABLE Otherwise (
	__IDOtherwise__ Integer NOT NULL,
	PRIMARY KEY Otherwise (__IDOtherwise__)
) ;

CREATE TABLE SwitchedAddress (
	__IDSwitchedAddress__ Integer NOT NULL,
	"is" text,
	contains text,
	subDomainOf text,
	PRIMARY KEY SwitchedAddress (__IDSwitchedAddress__)
) ;

CREATE TABLE SwitchedString (
	__IDSwitchedString__ Integer NOT NULL,
	"is" text,
	contains text,
	PRIMARY KEY SwitchedString (__IDSwitchedString__)
) ;

CREATE TABLE SwitchedLanguage (
	__IDSwitchedLanguage__ Integer NOT NULL,
	matches text,
	PRIMARY KEY SwitchedLanguage (__IDSwitchedLanguage__)
) ;

CREATE TABLE SwitchedTime (
	__IDSwitchedTime__ Integer NOT NULL,
	dtstart text,
	dtend text,
	duration text,
	freq text,
	until text,
	count text,
	"interval" text,
	bySecond text,
	byMinute text,
	byHour text,
	byDay text,
	byMonthDay text,
	byYearDay text,
	byWeekNo text,
	byMonth text,
	wkst text,
	bySetPos text,
	PRIMARY KEY SwitchedTime (__IDSwitchedTime__)
) ;

CREATE TABLE SwitchedPriority (
	__IDSwitchedPriority__ Integer NOT NULL,
	less text,
	greater text,
	equal text,
	PRIMARY KEY SwitchedPriority (__IDSwitchedPriority__)
) ;

CREATE TABLE Busy (
	__IDBusy__ Integer NOT NULL,
	PRIMARY KEY Busy (__IDBusy__)
) ;

CREATE TABLE NoAnswer (
	__IDNoAnswer__ Integer NOT NULL,
	PRIMARY KEY NoAnswer (__IDNoAnswer__)
) ;

CREATE TABLE Redirection (
	__IDRedirection__ Integer NOT NULL,
	PRIMARY KEY Redirection (__IDRedirection__)
) ;

CREATE TABLE Failure (
	__IDFailure__ Integer NOT NULL,
	PRIMARY KEY Failure (__IDFailure__)
) ;

CREATE TABLE "Default" (
	__IDDefault__ Integer NOT NULL,
	PRIMARY KEY "Default" (__IDDefault__)
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	PRIMARY KEY Node (__IDNode__)
) ;

CREATE TABLE Switch (
	__IDSwitch__ Integer NOT NULL,
	FOREIGN KEY notPresent (__FKnotPresent__) REFERENCES NotPresent (__IDNotPresent__),
	FOREIGN KEY otherwise (__FKotherwise__) REFERENCES Otherwise (__IDOtherwise__),
	PRIMARY KEY Switch (__IDSwitch__),
	__FKnotPresent__ Integer,
	__FKotherwise__ Integer
) ;

CREATE TABLE AddressSwitch (
	__IDAddressSwitch__ Integer NOT NULL,
	field text,
	subField text,
	PRIMARY KEY AddressSwitch (__IDAddressSwitch__)
) ;

CREATE TABLE StringSwitch (
	__IDStringSwitch__ Integer NOT NULL,
	field text,
	PRIMARY KEY StringSwitch (__IDStringSwitch__)
) ;

CREATE TABLE LanguageSwitch (
	__IDLanguageSwitch__ Integer NOT NULL,
	PRIMARY KEY LanguageSwitch (__IDLanguageSwitch__)
) ;

CREATE TABLE TimeSwitch (
	__IDTimeSwitch__ Integer NOT NULL,
	tzid text,
	tzurl text,
	PRIMARY KEY TimeSwitch (__IDTimeSwitch__)
) ;

CREATE TABLE PrioritySwitch (
	__IDPrioritySwitch__ Integer NOT NULL,
	PRIMARY KEY PrioritySwitch (__IDPrioritySwitch__)
) ;

CREATE TABLE Location (
	__IDLocation__ Integer NOT NULL,
	url text,
	priority text,
	clear text,
	PRIMARY KEY Location (__IDLocation__)
) ;

CREATE TABLE SubCall (
	__IDSubCall__ Integer NOT NULL,
	ref text,
	PRIMARY KEY SubCall (__IDSubCall__)
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	PRIMARY KEY Action (__IDAction__)
) ;

CREATE TABLE SignallingAction (
	__IDSignallingAction__ Integer NOT NULL,
	PRIMARY KEY SignallingAction (__IDSignallingAction__)
) ;

CREATE TABLE Proxy (
	__IDProxy__ Integer NOT NULL,
	timeout text,
	recurse text,
	ordering text,
	FOREIGN KEY busy (__FKbusy__) REFERENCES Busy (__IDBusy__),
	FOREIGN KEY noAnswer (__FKnoAnswer__) REFERENCES NoAnswer (__IDNoAnswer__),
	FOREIGN KEY redirection (__FKredirection__) REFERENCES Redirection (__IDRedirection__),
	FOREIGN KEY failure (__FKfailure__) REFERENCES Failure (__IDFailure__),
	FOREIGN KEY "default" (__FKdefault__) REFERENCES "Default" (__IDDefault__),
	PRIMARY KEY Proxy (__IDProxy__),
	__FKdefault__ Integer,
	__FKnoAnswer__ Integer,
	__FKfailure__ Integer,
	__FKredirection__ Integer,
	__FKbusy__ Integer
) ;

CREATE TABLE Redirect (
	__IDRedirect__ Integer NOT NULL,
	permanent text,
	PRIMARY KEY Redirect (__IDRedirect__)
) ;

CREATE TABLE Reject (
	__IDReject__ Integer NOT NULL,
	status text,
	reason text,
	PRIMARY KEY Reject (__IDReject__)
) ;

CREATE TABLE PrioritySwitch_priorities_SwitchedPriority (
	__IDPrioritySwitch__ Integer NOT NULL,
	__IDSwitchedPriority__ Integer NOT NULL
) ;

CREATE TABLE StringSwitch_strings_SwitchedString (
	__IDStringSwitch__ Integer NOT NULL,
	__IDSwitchedString__ Integer NOT NULL
) ;

CREATE TABLE TimeSwitch_times_SwitchedTime (
	__IDTimeSwitch__ Integer NOT NULL,
	__IDSwitchedTime__ Integer NOT NULL
) ;

CREATE TABLE AddressSwitch_addresses_SwitchedAddress (
	__IDAddressSwitch__ Integer NOT NULL,
	__IDSwitchedAddress__ Integer NOT NULL
) ;

CREATE TABLE CPL_subActions_SubAction (
	__IDCPL__ Integer NOT NULL,
	__IDSubAction__ Integer NOT NULL
) ;

CREATE TABLE LanguageSwitch_languages_SwitchedLanguage (
	__IDLanguageSwitch__ Integer NOT NULL,
	__IDSwitchedLanguage__ Integer NOT NULL
) ;
