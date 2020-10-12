CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	name text,
	FOREIGN KEY parentNode (__FKparentNode__) REFERENCES ElementNode (__IDElementNode__),
	PRIMARY KEY Node (__IDNode__),
	__FKparentNode__ Integer
) ;

CREATE TABLE ElementNode (
	__IDElementNode__ Integer NOT NULL,
	PRIMARY KEY ElementNode (__IDElementNode__)
) ;

CREATE TABLE AttributeNode (
	__IDAttributeNode__ Integer NOT NULL,
	PRIMARY KEY AttributeNode (__IDAttributeNode__)
) ;

CREATE TABLE RootNode (
	__IDRootNode__ Integer NOT NULL,
	FOREIGN KEY document (__FKdocument__) REFERENCES Document (__IDDocument__),
	PRIMARY KEY RootNode (__IDRootNode__),
	__FKdocument__ Integer
) ;

CREATE TABLE TextNode (
	__IDTextNode__ Integer NOT NULL,
	value text,
	PRIMARY KEY TextNode (__IDTextNode__)
) ;

CREATE TABLE XSLTNode (
	__IDXSLTNode__ Integer NOT NULL,
	PRIMARY KEY XSLTNode (__IDXSLTNode__)
) ;

CREATE TABLE XSLTRootNode (
	__IDXSLTRootNode__ Integer NOT NULL,
	PRIMARY KEY XSLTRootNode (__IDXSLTRootNode__)
) ;

CREATE TABLE Document (
	__IDDocument__ Integer NOT NULL,
	documentName text,
	FOREIGN KEY document (__FKdocument__) REFERENCES RootNode (__IDRootNode__),
	PRIMARY KEY Document (__IDDocument__),
	__FKdocument__ Integer
) ;

CREATE TABLE ApplyTemplates (
	__IDApplyTemplates__ Integer NOT NULL,
	"select" text,
	PRIMARY KEY ApplyTemplates (__IDApplyTemplates__)
) ;

CREATE TABLE "If" (
	__IDIf__ Integer NOT NULL,
	test text,
	PRIMARY KEY "If" (__IDIf__)
) ;

CREATE TABLE Template (
	__IDTemplate__ Integer NOT NULL,
	"match" text,
	PRIMARY KEY Template (__IDTemplate__)
) ;

CREATE TABLE ValueOf (
	__IDValueOf__ Integer NOT NULL,
	"select" text,
	PRIMARY KEY ValueOf (__IDValueOf__)
) ;

CREATE TABLE "When" (
	__IDWhen__ Integer NOT NULL,
	test text,
	PRIMARY KEY "When" (__IDWhen__)
) ;

CREATE TABLE Choose (
	__IDChoose__ Integer NOT NULL,
	FOREIGN KEY "when" (__FKwhen__) REFERENCES "When" (__IDWhen__),
	FOREIGN KEY otherwise (__FKotherwise__) REFERENCES Otherwise (__IDOtherwise__),
	PRIMARY KEY Choose (__IDChoose__),
	__FKwhen__ Integer,
	__FKotherwise__ Integer
) ;

CREATE TABLE Otherwise (
	__IDOtherwise__ Integer NOT NULL,
	PRIMARY KEY Otherwise (__IDOtherwise__)
) ;

CREATE TABLE Sort (
	__IDSort__ Integer NOT NULL,
	"select" text,
	PRIMARY KEY Sort (__IDSort__)
) ;

CREATE TABLE ElementNode_nodes_Node (
	__IDElementNode__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;
