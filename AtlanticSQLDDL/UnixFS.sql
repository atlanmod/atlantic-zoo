CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE File (
	__IDFile__ Integer NOT NULL,
	owner text,
	"group" text,
	PRIMARY KEY File (__IDFile__)
) ;

CREATE TABLE Directory (
	__IDDirectory__ Integer NOT NULL,
	PRIMARY KEY Directory (__IDDirectory__)
) ;

CREATE TABLE FileSystemRoot (
	__IDFileSystemRoot__ Integer NOT NULL,
	PRIMARY KEY FileSystemRoot (__IDFileSystemRoot__)
) ;

CREATE TABLE TextFile (
	__IDTextFile__ Integer NOT NULL,
	PRIMARY KEY TextFile (__IDTextFile__)
) ;

CREATE TABLE Directory_contents_File (
	__IDDirectory__ Integer NOT NULL,
	__IDFile__ Integer NOT NULL
) ;
