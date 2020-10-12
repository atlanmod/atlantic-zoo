CREATE TABLE BugzillaRoot (
	__IDBugzillaRoot__ Integer NOT NULL,
	version text,
	urlbase text,
	maintainer text,
	exporter text,
	PRIMARY KEY BugzillaRoot (__IDBugzillaRoot__)
) ;

CREATE TABLE Bug (
	__IDBug__ Integer NOT NULL,
	FOREIGN KEY bug_bugzillaRoot (__FKbug_bugzillaRoot__) REFERENCES BugzillaRoot (__IDBugzillaRoot__),
	error text,
	bug_id text,
	exporter text,
	urlbase text,
	bug_status text,
	resolution text,
	product text,
	priority text,
	version text,
	rep_platform text,
	assigned_to text,
	delta_ts text,
	component text,
	reporter text,
	target_milestone text,
	bug_severity text,
	creation_ts text,
	qa_contact text,
	status_whiteboard text,
	op_sys text,
	bug_file_loc text,
	short_desc text,
	PRIMARY KEY Bug (__IDBug__),
	__FKbug_bugzillaRoot__ Integer
) ;

CREATE TABLE StringElt (
	__IDStringElt__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringElt (__IDStringElt__)
) ;

CREATE TABLE Keywords (
	__IDKeywords__ Integer NOT NULL,
	PRIMARY KEY Keywords (__IDKeywords__)
) ;

CREATE TABLE Dependson (
	__IDDependson__ Integer NOT NULL,
	PRIMARY KEY Dependson (__IDDependson__)
) ;

CREATE TABLE Blocks (
	__IDBlocks__ Integer NOT NULL,
	PRIMARY KEY Blocks (__IDBlocks__)
) ;

CREATE TABLE Cc (
	__IDCc__ Integer NOT NULL,
	PRIMARY KEY Cc (__IDCc__)
) ;

CREATE TABLE LongDesc (
	__IDLongDesc__ Integer NOT NULL,
	isPrivate Boolean,
	who text,
	bug_when text,
	thetext text,
	PRIMARY KEY LongDesc (__IDLongDesc__)
) ;

CREATE TABLE Attachment (
	__IDAttachment__ Integer NOT NULL,
	isObsolete Boolean,
	isPatch Boolean,
	isPrivate Boolean,
	id text,
	date text,
	"desc" text,
	type text,
	data text,
	PRIMARY KEY Attachment (__IDAttachment__)
) ;

CREATE TABLE BugzillaRoot_bugs_Bug (
	__IDBugzillaRoot__ Integer NOT NULL,
	__IDBug__ Integer NOT NULL
) ;

CREATE TABLE Bug_keywords_Keywords (
	__IDBug__ Integer NOT NULL,
	__IDKeywords__ Integer NOT NULL
) ;

CREATE TABLE Bug_dependson_Dependson (
	__IDBug__ Integer NOT NULL,
	__IDDependson__ Integer NOT NULL
) ;

CREATE TABLE Bug_blocks_Blocks (
	__IDBug__ Integer NOT NULL,
	__IDBlocks__ Integer NOT NULL
) ;

CREATE TABLE Bug_cc_Cc (
	__IDBug__ Integer NOT NULL,
	__IDCc__ Integer NOT NULL
) ;

CREATE TABLE Bug_long_desc_LongDesc (
	__IDBug__ Integer NOT NULL,
	__IDLongDesc__ Integer NOT NULL
) ;

CREATE TABLE Bug_attachment_Attachment (
	__IDBug__ Integer NOT NULL,
	__IDAttachment__ Integer NOT NULL
) ;
