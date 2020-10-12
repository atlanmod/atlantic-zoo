CREATE TABLE DocBook (
	__IDDocBook__ Integer NOT NULL,
	PRIMARY KEY DocBook (__IDDocBook__)
) ;

CREATE TABLE Book (
	__IDBook__ Integer NOT NULL,
	PRIMARY KEY Book (__IDBook__)
) ;

CREATE TABLE TitledElement (
	__IDTitledElement__ Integer NOT NULL,
	title text,
	PRIMARY KEY TitledElement (__IDTitledElement__)
) ;

CREATE TABLE Article (
	__IDArticle__ Integer NOT NULL,
	PRIMARY KEY Article (__IDArticle__)
) ;

CREATE TABLE Sect1 (
	__IDSect1__ Integer NOT NULL,
	PRIMARY KEY Sect1 (__IDSect1__)
) ;

CREATE TABLE Para (
	__IDPara__ Integer NOT NULL,
	content text,
	PRIMARY KEY Para (__IDPara__)
) ;

CREATE TABLE DocBook_books_Book (
	__IDDocBook__ Integer NOT NULL,
	__IDBook__ Integer NOT NULL
) ;

CREATE TABLE Article_sections_1_Sect1 (
	__IDArticle__ Integer NOT NULL,
	__IDSect1__ Integer NOT NULL
) ;

CREATE TABLE Sect1_paras_Para (
	__IDSect1__ Integer NOT NULL,
	__IDPara__ Integer NOT NULL
) ;

CREATE TABLE Book_articles_Article (
	__IDBook__ Integer NOT NULL,
	__IDArticle__ Integer NOT NULL
) ;
