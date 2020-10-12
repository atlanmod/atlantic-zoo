CREATE TABLE Book (
	__IDBook__ Integer NOT NULL,
	title text,
	PRIMARY KEY Book (__IDBook__)
) ;

CREATE TABLE Chapter (
	__IDChapter__ Integer NOT NULL,
	title text,
	nbPages Integer,
	author text,
	FOREIGN KEY book (__FKbook__) REFERENCES Book (__IDBook__),
	PRIMARY KEY Chapter (__IDChapter__),
	__FKbook__ Integer
) ;

CREATE TABLE Book_chapters_Chapter (
	__IDBook__ Integer NOT NULL,
	__IDChapter__ Integer NOT NULL
) ;
