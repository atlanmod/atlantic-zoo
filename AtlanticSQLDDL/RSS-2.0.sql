CREATE TABLE RSS (
	__IDRSS__ Integer NOT NULL,
	version text,
	FOREIGN KEY channel (__FKchannel__) REFERENCES Channel (__IDChannel__),
	PRIMARY KEY RSS (__IDRSS__),
	__FKchannel__ Integer
) ;

CREATE TABLE Channel (
	__IDChannel__ Integer NOT NULL,
	title text,
	link text,
	description text,
	language text,
	copyright text,
	managingEditor text,
	webmaster text,
	generator text,
	docs text,
	ttl Integer,
	rating text,
	FOREIGN KEY rss (__FKrss__) REFERENCES RSS (__IDRSS__),
	FOREIGN KEY pubDate (__FKpubDate__) REFERENCES Date (__IDDate__),
	FOREIGN KEY lastBuildDate (__FKlastBuildDate__) REFERENCES Date (__IDDate__),
	FOREIGN KEY image (__FKimage__) REFERENCES Image (__IDImage__),
	FOREIGN KEY textInput (__FKtextInput__) REFERENCES TextInput (__IDTextInput__),
	FOREIGN KEY cloud (__FKcloud__) REFERENCES Cloud (__IDCloud__),
	FOREIGN KEY category (__FKcategory__) REFERENCES Category (__IDCategory__),
	PRIMARY KEY Channel (__IDChannel__),
	__FKcategory__ Integer,
	__FKcloud__ Integer,
	__FKpubDate__ Integer,
	__FKimage__ Integer,
	__FKtextInput__ Integer,
	__FKrss__ Integer,
	__FKlastBuildDate__ Integer
) ;

CREATE TABLE Item (
	__IDItem__ Integer NOT NULL,
	title text,
	link text,
	description text,
	author text,
	comments text,
	guid text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	FOREIGN KEY pubDate (__FKpubDate__) REFERENCES Date (__IDDate__),
	FOREIGN KEY enclosure (__FKenclosure__) REFERENCES Enclosure (__IDEnclosure__),
	FOREIGN KEY category (__FKcategory__) REFERENCES Category (__IDCategory__),
	FOREIGN KEY channel (__FKchannel__) REFERENCES Channel (__IDChannel__),
	PRIMARY KEY Item (__IDItem__),
	__FKpubDate__ Integer,
	__FKcategory__ Integer,
	__FKenclosure__ Integer,
	__FKsource__ Integer,
	__FKchannel__ Integer
) ;

CREATE TABLE Image (
	__IDImage__ Integer NOT NULL,
	url text,
	title text,
	link text,
	description text,
	width Integer,
	height Integer,
	FOREIGN KEY channel (__FKchannel__) REFERENCES Channel (__IDChannel__),
	PRIMARY KEY Image (__IDImage__),
	__FKchannel__ Integer
) ;

CREATE TABLE TextInput (
	__IDTextInput__ Integer NOT NULL,
	title text,
	description text,
	name text,
	link text,
	FOREIGN KEY channel (__FKchannel__) REFERENCES Channel (__IDChannel__),
	PRIMARY KEY TextInput (__IDTextInput__),
	__FKchannel__ Integer
) ;

CREATE TABLE Cloud (
	__IDCloud__ Integer NOT NULL,
	domain text,
	port Integer,
	path text,
	registerProcedure text,
	protocol text,
	FOREIGN KEY channel (__FKchannel__) REFERENCES Channel (__IDChannel__),
	PRIMARY KEY Cloud (__IDCloud__),
	__FKchannel__ Integer
) ;

CREATE TABLE Category (
	__IDCategory__ Integer NOT NULL,
	domain text,
	value text,
	PRIMARY KEY Category (__IDCategory__)
) ;

CREATE TABLE Enclosure (
	__IDEnclosure__ Integer NOT NULL,
	url text,
	lenght Integer,
	type text,
	PRIMARY KEY Enclosure (__IDEnclosure__)
) ;

CREATE TABLE Source (
	__IDSource__ Integer NOT NULL,
	url text,
	value text,
	PRIMARY KEY Source (__IDSource__)
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

CREATE TABLE Channel_items_Item (
	__IDChannel__ Integer NOT NULL,
	__IDItem__ Integer NOT NULL
) ;
