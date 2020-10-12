CREATE TABLE HTML (
	__IDHTML__ Integer NOT NULL,
	FOREIGN KEY head (__FKhead__) REFERENCES HEAD (__IDHEAD__),
	FOREIGN KEY body (__FKbody__) REFERENCES BODY (__IDBODY__),
	PRIMARY KEY HTML (__IDHTML__),
	__FKhead__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE HTMLElement (
	__IDHTMLElement__ Integer NOT NULL,
	value text,
	FOREIGN KEY parent (__FKparent__) REFERENCES HTMLElement (__IDHTMLElement__),
	PRIMARY KEY HTMLElement (__IDHTMLElement__),
	__FKparent__ Integer
) ;

CREATE TABLE HEAD (
	__IDHEAD__ Integer NOT NULL,
	FOREIGN KEY html (__FKhtml__) REFERENCES HTML (__IDHTML__),
	PRIMARY KEY HEAD (__IDHEAD__),
	__FKhtml__ Integer
) ;

CREATE TABLE HEADElement (
	__IDHEADElement__ Integer NOT NULL,
	FOREIGN KEY head (__FKhead__) REFERENCES HEAD (__IDHEAD__),
	PRIMARY KEY HEADElement (__IDHEADElement__),
	__FKhead__ Integer
) ;

CREATE TABLE LINK (
	__IDLINK__ Integer NOT NULL,
	rel text,
	title text,
	ahref text,
	type text,
	PRIMARY KEY LINK (__IDLINK__)
) ;

CREATE TABLE TITLE (
	__IDTITLE__ Integer NOT NULL,
	PRIMARY KEY TITLE (__IDTITLE__)
) ;

CREATE TABLE BODY (
	__IDBODY__ Integer NOT NULL,
	background text,
	bgcolor text,
	text text,
	link text,
	alink text,
	vlink text,
	FOREIGN KEY html (__FKhtml__) REFERENCES HTML (__IDHTML__),
	PRIMARY KEY BODY (__IDBODY__),
	__FKhtml__ Integer
) ;

CREATE TABLE BODYElement (
	__IDBODYElement__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES BODY (__IDBODY__),
	PRIMARY KEY BODYElement (__IDBODYElement__),
	__FKbody__ Integer
) ;

CREATE TABLE H1 (
	__IDH1__ Integer NOT NULL,
	PRIMARY KEY H1 (__IDH1__)
) ;

CREATE TABLE H2 (
	__IDH2__ Integer NOT NULL,
	PRIMARY KEY H2 (__IDH2__)
) ;

CREATE TABLE H3 (
	__IDH3__ Integer NOT NULL,
	PRIMARY KEY H3 (__IDH3__)
) ;

CREATE TABLE H4 (
	__IDH4__ Integer NOT NULL,
	PRIMARY KEY H4 (__IDH4__)
) ;

CREATE TABLE EM (
	__IDEM__ Integer NOT NULL,
	PRIMARY KEY EM (__IDEM__)
) ;

CREATE TABLE STRONG (
	__IDSTRONG__ Integer NOT NULL,
	PRIMARY KEY STRONG (__IDSTRONG__)
) ;

CREATE TABLE B (
	__IDB__ Integer NOT NULL,
	PRIMARY KEY B (__IDB__)
) ;

CREATE TABLE I (
	__IDI__ Integer NOT NULL,
	PRIMARY KEY I (__IDI__)
) ;

CREATE TABLE TT (
	__IDTT__ Integer NOT NULL,
	PRIMARY KEY TT (__IDTT__)
) ;

CREATE TABLE PRE (
	__IDPRE__ Integer NOT NULL,
	PRIMARY KEY PRE (__IDPRE__)
) ;

CREATE TABLE BIG (
	__IDBIG__ Integer NOT NULL,
	PRIMARY KEY BIG (__IDBIG__)
) ;

CREATE TABLE SMALL (
	__IDSMALL__ Integer NOT NULL,
	PRIMARY KEY SMALL (__IDSMALL__)
) ;

CREATE TABLE SUB (
	__IDSUB__ Integer NOT NULL,
	PRIMARY KEY SUB (__IDSUB__)
) ;

CREATE TABLE SUP (
	__IDSUP__ Integer NOT NULL,
	PRIMARY KEY SUP (__IDSUP__)
) ;

CREATE TABLE STRIKE (
	__IDSTRIKE__ Integer NOT NULL,
	PRIMARY KEY STRIKE (__IDSTRIKE__)
) ;

CREATE TABLE FONT (
	__IDFONT__ Integer NOT NULL,
	color text,
	face text,
	size text,
	PRIMARY KEY FONT (__IDFONT__)
) ;

CREATE TABLE IMG (
	__IDIMG__ Integer NOT NULL,
	src text,
	width text,
	height text,
	alt text,
	align text,
	vspace text,
	hspace text,
	ismap text,
	usemap text,
	border text,
	PRIMARY KEY IMG (__IDIMG__)
) ;

CREATE TABLE BR (
	__IDBR__ Integer NOT NULL,
	clear text,
	PRIMARY KEY BR (__IDBR__)
) ;

CREATE TABLE MAP (
	__IDMAP__ Integer NOT NULL,
	PRIMARY KEY MAP (__IDMAP__)
) ;

CREATE TABLE AREA (
	__IDAREA__ Integer NOT NULL,
	shape text,
	coords text,
	ahref text,
	PRIMARY KEY AREA (__IDAREA__)
) ;

CREATE TABLE STYLE (
	__IDSTYLE__ Integer NOT NULL,
	PRIMARY KEY STYLE (__IDSTYLE__)
) ;

CREATE TABLE EMBED (
	__IDEMBED__ Integer NOT NULL,
	src text,
	width text,
	height text,
	align text,
	vspace text,
	hspace text,
	border text,
	PRIMARY KEY EMBED (__IDEMBED__)
) ;

CREATE TABLE NOEMBED (
	__IDNOEMBED__ Integer NOT NULL,
	PRIMARY KEY NOEMBED (__IDNOEMBED__)
) ;

CREATE TABLE SPAN (
	__IDSPAN__ Integer NOT NULL,
	style text,
	PRIMARY KEY SPAN (__IDSPAN__)
) ;

CREATE TABLE A (
	__IDA__ Integer NOT NULL,
	ahref text,
	name text,
	id text,
	PRIMARY KEY A (__IDA__)
) ;

CREATE TABLE "DIV" (
	__IDDIV__ Integer NOT NULL,
	align text,
	PRIMARY KEY "DIV" (__IDDIV__)
) ;

CREATE TABLE P (
	__IDP__ Integer NOT NULL,
	PRIMARY KEY P (__IDP__)
) ;

CREATE TABLE TABLEElement (
	__IDTABLEElement__ Integer NOT NULL,
	bgcolor text,
	background text,
	PRIMARY KEY TABLEElement (__IDTABLEElement__)
) ;

CREATE TABLE "TABLE" (
	__IDTABLE__ Integer NOT NULL,
	border text,
	width text,
	cellspacing text,
	cellpadding text,
	PRIMARY KEY "TABLE" (__IDTABLE__)
) ;

CREATE TABLE TR (
	__IDTR__ Integer NOT NULL,
	valign text,
	align text,
	FOREIGN KEY "table" (__FKtable__) REFERENCES "TABLE" (__IDTABLE__),
	PRIMARY KEY TR (__IDTR__),
	__FKtable__ Integer
) ;

CREATE TABLE TD (
	__IDTD__ Integer NOT NULL,
	colspan text,
	rowspan text,
	valign text,
	align text,
	width text,
	FOREIGN KEY tr (__FKtr__) REFERENCES TR (__IDTR__),
	PRIMARY KEY TD (__IDTD__),
	__FKtr__ Integer
) ;

CREATE TABLE TH (
	__IDTH__ Integer NOT NULL,
	PRIMARY KEY TH (__IDTH__)
) ;

CREATE TABLE FORM (
	__IDFORM__ Integer NOT NULL,
	action text,
	method text,
	PRIMARY KEY FORM (__IDFORM__)
) ;

CREATE TABLE INPUT (
	__IDINPUT__ Integer NOT NULL,
	align text,
	maxlength text,
	size text,
	checked text,
	src text,
	inputValue text,
	name text,
	type text,
	PRIMARY KEY INPUT (__IDINPUT__)
) ;

CREATE TABLE TEXTAREA (
	__IDTEXTAREA__ Integer NOT NULL,
	name text,
	rows text,
	cols text,
	PRIMARY KEY TEXTAREA (__IDTEXTAREA__)
) ;

CREATE TABLE "SELECT" (
	__IDSELECT__ Integer NOT NULL,
	multiple text,
	size text,
	name text,
	PRIMARY KEY "SELECT" (__IDSELECT__)
) ;

CREATE TABLE "OPTION" (
	__IDOPTION__ Integer NOT NULL,
	selected text,
	optionValue text,
	PRIMARY KEY "OPTION" (__IDOPTION__)
) ;

CREATE TABLE ListElement (
	__IDListElement__ Integer NOT NULL,
	type text,
	PRIMARY KEY ListElement (__IDListElement__)
) ;

CREATE TABLE OL (
	__IDOL__ Integer NOT NULL,
	start text,
	PRIMARY KEY OL (__IDOL__)
) ;

CREATE TABLE UL (
	__IDUL__ Integer NOT NULL,
	PRIMARY KEY UL (__IDUL__)
) ;

CREATE TABLE LI (
	__IDLI__ Integer NOT NULL,
	liValue text,
	PRIMARY KEY LI (__IDLI__)
) ;

CREATE TABLE DL (
	__IDDL__ Integer NOT NULL,
	PRIMARY KEY DL (__IDDL__)
) ;

CREATE TABLE DT (
	__IDDT__ Integer NOT NULL,
	PRIMARY KEY DT (__IDDT__)
) ;

CREATE TABLE DD (
	__IDDD__ Integer NOT NULL,
	PRIMARY KEY DD (__IDDD__)
) ;

CREATE TABLE APPLET (
	__IDAPPLET__ Integer NOT NULL,
	applet text,
	class text,
	src text,
	align text,
	width text,
	height text,
	PRIMARY KEY APPLET (__IDAPPLET__)
) ;

CREATE TABLE PARAM (
	__IDPARAM__ Integer NOT NULL,
	name text,
	paramValue text,
	PRIMARY KEY PARAM (__IDPARAM__)
) ;

CREATE TABLE OBJECT (
	__IDOBJECT__ Integer NOT NULL,
	classid text,
	id text,
	data text,
	type text,
	standby text,
	PRIMARY KEY OBJECT (__IDOBJECT__)
) ;

CREATE TABLE FRAMESET (
	__IDFRAMESET__ Integer NOT NULL,
	rows text,
	cols text,
	framespacing text,
	frameborder text,
	border text,
	PRIMARY KEY FRAMESET (__IDFRAMESET__)
) ;

CREATE TABLE FRAME (
	__IDFRAME__ Integer NOT NULL,
	src text,
	name text,
	marginwidth text,
	marginheight text,
	scrolling text,
	noresize text,
	PRIMARY KEY FRAME (__IDFRAME__)
) ;

CREATE TABLE NOFRAME (
	__IDNOFRAME__ Integer NOT NULL,
	PRIMARY KEY NOFRAME (__IDNOFRAME__)
) ;

CREATE TABLE IFRAME (
	__IDIFRAME__ Integer NOT NULL,
	PRIMARY KEY IFRAME (__IDIFRAME__)
) ;

CREATE TABLE TR_tds_TD (
	__IDTR__ Integer NOT NULL,
	__IDTD__ Integer NOT NULL
) ;

CREATE TABLE BODY_bodyElements_BODYElement (
	__IDBODY__ Integer NOT NULL,
	__IDBODYElement__ Integer NOT NULL
) ;

CREATE TABLE TABLE_trs_TR (
	__IDTABLE__ Integer NOT NULL,
	__IDTR__ Integer NOT NULL
) ;

CREATE TABLE HEAD_headElements_HEADElement (
	__IDHEAD__ Integer NOT NULL,
	__IDHEADElement__ Integer NOT NULL
) ;

CREATE TABLE HTMLElement_children_HTMLElement (
	__IDHTMLElement__ Integer NOT NULL,
	__IDHTMLElement__ Integer NOT NULL
) ;
