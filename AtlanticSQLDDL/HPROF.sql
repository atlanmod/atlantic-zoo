CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Profile (
	__IDProfile__ Integer NOT NULL,
	header text,
	FOREIGN KEY times (__FKtimes__) REFERENCES Times (__IDTimes__),
	PRIMARY KEY Profile (__IDProfile__),
	__FKtimes__ Integer
) ;

CREATE TABLE Method (
	__IDMethod__ Integer NOT NULL,
	fullyQualifiedName text,
	PRIMARY KEY Method (__IDMethod__)
) ;

CREATE TABLE ThreadAction (
	__IDThreadAction__ Integer NOT NULL,
	id Integer,
	PRIMARY KEY ThreadAction (__IDThreadAction__)
) ;

CREATE TABLE ThreadStart (
	__IDThreadStart__ Integer NOT NULL,
	obj Integer,
	name text,
	"group" text,
	PRIMARY KEY ThreadStart (__IDThreadStart__)
) ;

CREATE TABLE ThreadEnd (
	__IDThreadEnd__ Integer NOT NULL,
	PRIMARY KEY ThreadEnd (__IDThreadEnd__)
) ;

CREATE TABLE Trace (
	__IDTrace__ Integer NOT NULL,
	id Integer,
	threadId Integer,
	PRIMARY KEY Trace (__IDTrace__)
) ;

CREATE TABLE StackTraceElement (
	__IDStackTraceElement__ Integer NOT NULL,
	FOREIGN KEY method (__FKmethod__) REFERENCES Method (__IDMethod__),
	fileName text,
	line Integer,
	FOREIGN KEY trace (__FKtrace__) REFERENCES Trace (__IDTrace__),
	PRIMARY KEY StackTraceElement (__IDStackTraceElement__),
	__FKmethod__ Integer,
	__FKtrace__ Integer
) ;

CREATE TABLE Times (
	__IDTimes__ Integer NOT NULL,
	unit text,
	total Integer,
	FOREIGN KEY date (__FKdate__) REFERENCES Date (__IDDate__),
	PRIMARY KEY Times (__IDTimes__),
	__FKdate__ Integer
) ;

CREATE TABLE Time (
	__IDTime__ Integer NOT NULL,
	rank Integer,
	self "Double",
	accum "Double",
	count Integer,
	FOREIGN KEY trace (__FKtrace__) REFERENCES Trace (__IDTrace__),
	FOREIGN KEY method (__FKmethod__) REFERENCES Method (__IDMethod__),
	PRIMARY KEY Time (__IDTime__),
	__FKtrace__ Integer,
	__FKmethod__ Integer
) ;

CREATE TABLE Date (
	__IDDate__ Integer NOT NULL,
	day text,
	month text,
	dayOfMonth Integer,
	hour Integer,
	minutes Integer,
	seconds Integer,
	year Integer,
	PRIMARY KEY Date (__IDDate__)
) ;

CREATE TABLE Profile_threadActions_ThreadAction (
	__IDProfile__ Integer NOT NULL,
	__IDThreadAction__ Integer NOT NULL
) ;

CREATE TABLE Profile_traces_Trace (
	__IDProfile__ Integer NOT NULL,
	__IDTrace__ Integer NOT NULL
) ;

CREATE TABLE Profile_methods_Method (
	__IDProfile__ Integer NOT NULL,
	__IDMethod__ Integer NOT NULL
) ;

CREATE TABLE Method_stackTraceElements_StackTraceElement (
	__IDMethod__ Integer NOT NULL,
	__IDStackTraceElement__ Integer NOT NULL
) ;

CREATE TABLE Trace_elements_StackTraceElement (
	__IDTrace__ Integer NOT NULL,
	__IDStackTraceElement__ Integer NOT NULL
) ;

CREATE TABLE Trace_times_Time (
	__IDTrace__ Integer NOT NULL,
	__IDTime__ Integer NOT NULL
) ;

CREATE TABLE Times_elements_Time (
	__IDTimes__ Integer NOT NULL,
	__IDTime__ Integer NOT NULL
) ;
