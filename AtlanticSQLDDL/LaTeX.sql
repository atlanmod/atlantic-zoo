CREATE TABLE ValuedElement (
	__IDValuedElement__ Integer NOT NULL,
	value text,
	PRIMARY KEY ValuedElement (__IDValuedElement__)
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE Title (
	__IDTitle__ Integer NOT NULL,
	PRIMARY KEY Title (__IDTitle__)
) ;

CREATE TABLE Name (
	__IDName__ Integer NOT NULL,
	FOREIGN KEY author (__FKauthor__) REFERENCES Author (__IDAuthor__),
	FOREIGN KEY organisation (__FKorganisation__) REFERENCES Organisation (__IDOrganisation__),
	PRIMARY KEY Name (__IDName__),
	__FKauthor__ Integer,
	__FKorganisation__ Integer
) ;

CREATE TABLE Date (
	__IDDate__ Integer NOT NULL,
	PRIMARY KEY Date (__IDDate__)
) ;

CREATE TABLE Author (
	__IDAuthor__ Integer NOT NULL,
	PRIMARY KEY Author (__IDAuthor__)
) ;

CREATE TABLE Adress (
	__IDAdress__ Integer NOT NULL,
	PRIMARY KEY Adress (__IDAdress__)
) ;

CREATE TABLE Organisation (
	__IDOrganisation__ Integer NOT NULL,
	FOREIGN KEY adress (__FKadress__) REFERENCES Adress (__IDAdress__),
	FOREIGN KEY heading (__FKheading__) REFERENCES Heading (__IDHeading__),
	PRIMARY KEY Organisation (__IDOrganisation__),
	__FKadress__ Integer,
	__FKheading__ Integer
) ;

CREATE TABLE Phone (
	__IDPhone__ Integer NOT NULL,
	PRIMARY KEY Phone (__IDPhone__)
) ;

CREATE TABLE Fax (
	__IDFax__ Integer NOT NULL,
	PRIMARY KEY Fax (__IDFax__)
) ;

CREATE TABLE EMail (
	__IDEMail__ Integer NOT NULL,
	PRIMARY KEY EMail (__IDEMail__)
) ;

CREATE TABLE Heading (
	__IDHeading__ Integer NOT NULL,
	FOREIGN KEY phone (__FKphone__) REFERENCES Phone (__IDPhone__),
	FOREIGN KEY fax (__FKfax__) REFERENCES Fax (__IDFax__),
	FOREIGN KEY email (__FKemail__) REFERENCES EMail (__IDEMail__),
	PRIMARY KEY Heading (__IDHeading__),
	__FKfax__ Integer,
	__FKphone__ Integer,
	__FKemail__ Integer
) ;

CREATE TABLE Abstract (
	__IDAbstract__ Integer NOT NULL,
	PRIMARY KEY Abstract (__IDAbstract__)
) ;

CREATE TABLE Keywords (
	__IDKeywords__ Integer NOT NULL,
	PRIMARY KEY Keywords (__IDKeywords__)
) ;

CREATE TABLE SectionBody (
	__IDSectionBody__ Integer NOT NULL,
	FOREIGN KEY section (__FKsection__) REFERENCES Section (__IDSection__),
	PRIMARY KEY SectionBody (__IDSectionBody__),
	__FKsection__ Integer
) ;

CREATE TABLE Corps (
	__IDCorps__ Integer NOT NULL,
	FOREIGN KEY sectionbody (__FKsectionbody__) REFERENCES SectionBody (__IDSectionBody__),
	PRIMARY KEY Corps (__IDCorps__),
	__FKsectionbody__ Integer
) ;

CREATE TABLE Value (
	__IDValue__ Integer NOT NULL,
	PRIMARY KEY Value (__IDValue__)
) ;

CREATE TABLE Cite (
	__IDCite__ Integer NOT NULL,
	PRIMARY KEY Cite (__IDCite__)
) ;

CREATE TABLE Path (
	__IDPath__ Integer NOT NULL,
	PRIMARY KEY Path (__IDPath__)
) ;

CREATE TABLE "Label" (
	__IDLabel__ Integer NOT NULL,
	PRIMARY KEY "Label" (__IDLabel__)
) ;

CREATE TABLE Figure (
	__IDFigure__ Integer NOT NULL,
	FOREIGN KEY path (__FKpath__) REFERENCES Path (__IDPath__),
	FOREIGN KEY "label" (__FKlabel__) REFERENCES "Label" (__IDLabel__),
	FOREIGN KEY title (__FKtitle__) REFERENCES Title (__IDTitle__),
	PRIMARY KEY Figure (__IDFigure__),
	__FKpath__ Integer,
	__FKtitle__ Integer,
	__FKlabel__ Integer
) ;

CREATE TABLE Item (
	__IDItem__ Integer NOT NULL,
	FOREIGN KEY itemscontainer (__FKitemscontainer__) REFERENCES Items (__IDItems__),
	FOREIGN KEY enumeratecontainer (__FKenumeratecontainer__) REFERENCES Enumerate (__IDEnumerate__),
	PRIMARY KEY Item (__IDItem__),
	__FKenumeratecontainer__ Integer,
	__FKitemscontainer__ Integer
) ;

CREATE TABLE Items (
	__IDItems__ Integer NOT NULL,
	PRIMARY KEY Items (__IDItems__)
) ;

CREATE TABLE Enumerate (
	__IDEnumerate__ Integer NOT NULL,
	PRIMARY KEY Enumerate (__IDEnumerate__)
) ;

CREATE TABLE Section (
	__IDSection__ Integer NOT NULL,
	FOREIGN KEY title (__FKtitle__) REFERENCES Title (__IDTitle__),
	FOREIGN KEY sectionBody (__FKsectionBody__) REFERENCES SectionBody (__IDSectionBody__),
	PRIMARY KEY Section (__IDSection__),
	__FKtitle__ Integer,
	__FKsectionBody__ Integer
) ;

CREATE TABLE Description (
	__IDDescription__ Integer NOT NULL,
	FOREIGN KEY date (__FKdate__) REFERENCES Date (__IDDate__),
	PRIMARY KEY Description (__IDDescription__),
	__FKdate__ Integer
) ;

CREATE TABLE Citation (
	__IDCitation__ Integer NOT NULL,
	FOREIGN KEY "label" (__FKlabel__) REFERENCES "Label" (__IDLabel__),
	FOREIGN KEY author (__FKauthor__) REFERENCES Author (__IDAuthor__),
	FOREIGN KEY description (__FKdescription__) REFERENCES Description (__IDDescription__),
	FOREIGN KEY bibliography (__FKbibliography__) REFERENCES Bibliography (__IDBibliography__),
	PRIMARY KEY Citation (__IDCitation__),
	__FKauthor__ Integer,
	__FKdescription__ Integer,
	__FKlabel__ Integer,
	__FKbibliography__ Integer
) ;

CREATE TABLE Bibliography (
	__IDBibliography__ Integer NOT NULL,
	FOREIGN KEY documentbody (__FKdocumentbody__) REFERENCES DocumentBody (__IDDocumentBody__),
	PRIMARY KEY Bibliography (__IDBibliography__),
	__FKdocumentbody__ Integer
) ;

CREATE TABLE DocumentBody (
	__IDDocumentBody__ Integer NOT NULL,
	FOREIGN KEY document (__FKdocument__) REFERENCES Document (__IDDocument__),
	PRIMARY KEY DocumentBody (__IDDocumentBody__),
	__FKdocument__ Integer
) ;

CREATE TABLE Document (
	__IDDocument__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	FOREIGN KEY title (__FKtitle__) REFERENCES Title (__IDTitle__),
	FOREIGN KEY author (__FKauthor__) REFERENCES Author (__IDAuthor__),
	FOREIGN KEY date (__FKdate__) REFERENCES Date (__IDDate__),
	FOREIGN KEY heading (__FKheading__) REFERENCES Heading (__IDHeading__),
	FOREIGN KEY abstract (__FKabstract__) REFERENCES Abstract (__IDAbstract__),
	FOREIGN KEY keywords (__FKkeywords__) REFERENCES Keywords (__IDKeywords__),
	FOREIGN KEY documentbody (__FKdocumentbody__) REFERENCES DocumentBody (__IDDocumentBody__),
	PRIMARY KEY Document (__IDDocument__),
	__FKdocumentbody__ Integer,
	__FKheading__ Integer,
	__FKdate__ Integer,
	__FKtitle__ Integer,
	__FKabstract__ Integer,
	__FKauthor__ Integer,
	__FKtype__ Integer,
	__FKkeywords__ Integer
) ;

CREATE TABLE Items_item_Item (
	__IDItems__ Integer NOT NULL,
	__IDItem__ Integer NOT NULL
) ;

CREATE TABLE Heading_organisations_Organisation (
	__IDHeading__ Integer NOT NULL,
	__IDOrganisation__ Integer NOT NULL
) ;

CREATE TABLE DocumentBody_bibliography_Bibliography (
	__IDDocumentBody__ Integer NOT NULL,
	__IDBibliography__ Integer NOT NULL
) ;

CREATE TABLE Bibliography_citations_Citation (
	__IDBibliography__ Integer NOT NULL,
	__IDCitation__ Integer NOT NULL
) ;

CREATE TABLE DocumentBody_sections_Section (
	__IDDocumentBody__ Integer NOT NULL,
	__IDSection__ Integer NOT NULL
) ;

CREATE TABLE Author_names_Name (
	__IDAuthor__ Integer NOT NULL,
	__IDName__ Integer NOT NULL
) ;

CREATE TABLE Organisation_names_Name (
	__IDOrganisation__ Integer NOT NULL,
	__IDName__ Integer NOT NULL
) ;

CREATE TABLE Enumerate_item_Item (
	__IDEnumerate__ Integer NOT NULL,
	__IDItem__ Integer NOT NULL
) ;

CREATE TABLE SectionBody_corps_Corps (
	__IDSectionBody__ Integer NOT NULL,
	__IDCorps__ Integer NOT NULL
) ;
