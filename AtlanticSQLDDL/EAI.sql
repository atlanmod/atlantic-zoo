CREATE TABLE FCMSource (
	__IDFCMSource__ Integer NOT NULL,
	PRIMARY KEY FCMSource (__IDFCMSource__)
) ;

CREATE TABLE EAISource (
	__IDEAISource__ Integer NOT NULL,
	PRIMARY KEY EAISource (__IDEAISource__)
) ;

CREATE TABLE FCMSink (
	__IDFCMSink__ Integer NOT NULL,
	PRIMARY KEY FCMSink (__IDFCMSink__)
) ;

CREATE TABLE EAISink (
	__IDEAISink__ Integer NOT NULL,
	PRIMARY KEY EAISink (__IDEAISink__)
) ;

CREATE TABLE EAIResource (
	__IDEAIResource__ Integer NOT NULL,
	PRIMARY KEY EAIResource (__IDEAIResource__)
) ;

CREATE TABLE EAIQueue (
	__IDEAIQueue__ Integer NOT NULL,
	maxLength Integer,
	name text,
	PRIMARY KEY EAIQueue (__IDEAIQueue__)
) ;

CREATE TABLE EAISink_resources_EAIResource (
	__IDEAISink__ Integer NOT NULL,
	__IDEAIResource__ Integer NOT NULL
) ;

CREATE TABLE EAISource_resources_EAIResource (
	__IDEAISource__ Integer NOT NULL,
	__IDEAIResource__ Integer NOT NULL
) ;
