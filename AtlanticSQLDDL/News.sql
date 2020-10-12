CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	title text,
	description text,
	link text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE Newspaper (
	__IDNewspaper__ Integer NOT NULL,
	language text,
	copyright text,
	FOREIGN KEY pubDate (__FKpubDate__) REFERENCES Date (__IDDate__),
	FOREIGN KEY category (__FKcategory__) REFERENCES Category (__IDCategory__),
	PRIMARY KEY Newspaper (__IDNewspaper__),
	__FKpubDate__ Integer,
	__FKcategory__ Integer
) ;

CREATE TABLE News (
	__IDNews__ Integer NOT NULL,
	author text,
	comments text,
	FOREIGN KEY pubDate (__FKpubDate__) REFERENCES Date (__IDDate__),
	FOREIGN KEY category (__FKcategory__) REFERENCES Category (__IDCategory__),
	FOREIGN KEY newspaper (__FKnewspaper__) REFERENCES Newspaper (__IDNewspaper__),
	PRIMARY KEY News (__IDNews__),
	__FKpubDate__ Integer,
	__FKcategory__ Integer,
	__FKnewspaper__ Integer
) ;

CREATE TABLE Category (
	__IDCategory__ Integer NOT NULL,
	value text,
	PRIMARY KEY Category (__IDCategory__)
) ;

CREATE TABLE Date (
	__IDDate__ Integer NOT NULL,
	eDay text,
	day Integer,
	month Integer,
	year Integer,
	hours Integer,
	minutes Integer,
	seconds Integer,
	PRIMARY KEY Date (__IDDate__)
) ;

CREATE TABLE Newspaper_news_News (
	__IDNewspaper__ Integer NOT NULL,
	__IDNews__ Integer NOT NULL
) ;
