CREATE TABLE XQueryProgram (
	__IDXQueryProgram__ Integer NOT NULL,
	PRIMARY KEY XQueryProgram (__IDXQueryProgram__)
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	FOREIGN KEY parentNode (__FKparentNode__) REFERENCES ElementNode (__IDElementNode__),
	FOREIGN KEY returnEx (__FKreturnEx__) REFERENCES "Return" (__IDReturn__),
	PRIMARY KEY Expression (__IDExpression__),
	__FKparentNode__ Integer,
	__FKreturnEx__ Integer
) ;

CREATE TABLE ExecutableExpression (
	__IDExecutableExpression__ Integer NOT NULL,
	FOREIGN KEY xQueryProgram (__FKxQueryProgram__) REFERENCES XQueryProgram (__IDXQueryProgram__),
	FOREIGN KEY functionDeclaration (__FKfunctionDeclaration__) REFERENCES FunctionDeclaration (__IDFunctionDeclaration__),
	PRIMARY KEY ExecutableExpression (__IDExecutableExpression__),
	__FKfunctionDeclaration__ Integer,
	__FKxQueryProgram__ Integer
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	name text,
	PRIMARY KEY Node (__IDNode__)
) ;

CREATE TABLE FLWOR (
	__IDFLWOR__ Integer NOT NULL,
	FOREIGN KEY "for" (__FKfor__) REFERENCES "For" (__IDFor__),
	FOREIGN KEY let (__FKlet__) REFERENCES Let (__IDLet__),
	FOREIGN KEY "where" (__FKwhere__) REFERENCES "Where" (__IDWhere__),
	FOREIGN KEY orderBy (__FKorderBy__) REFERENCES OrderBy (__IDOrderBy__),
	FOREIGN KEY "return" (__FKreturn__) REFERENCES "Return" (__IDReturn__),
	PRIMARY KEY FLWOR (__IDFLWOR__),
	__FKfor__ Integer,
	__FKwhere__ Integer,
	__FKorderBy__ Integer,
	__FKlet__ Integer,
	__FKreturn__ Integer
) ;

CREATE TABLE FunctionCall (
	__IDFunctionCall__ Integer NOT NULL,
	name text,
	PRIMARY KEY FunctionCall (__IDFunctionCall__)
) ;

CREATE TABLE FunctionDeclaration (
	__IDFunctionDeclaration__ Integer NOT NULL,
	name text,
	PRIMARY KEY FunctionDeclaration (__IDFunctionDeclaration__)
) ;

CREATE TABLE ElementNode (
	__IDElementNode__ Integer NOT NULL,
	PRIMARY KEY ElementNode (__IDElementNode__)
) ;

CREATE TABLE AttributeNode (
	__IDAttributeNode__ Integer NOT NULL,
	value text,
	PRIMARY KEY AttributeNode (__IDAttributeNode__)
) ;

CREATE TABLE TextNode (
	__IDTextNode__ Integer NOT NULL,
	PRIMARY KEY TextNode (__IDTextNode__)
) ;

CREATE TABLE ReturnXPath (
	__IDReturnXPath__ Integer NOT NULL,
	value text,
	PRIMARY KEY ReturnXPath (__IDReturnXPath__)
) ;

CREATE TABLE XPath (
	__IDXPath__ Integer NOT NULL,
	FOREIGN KEY functionCall (__FKfunctionCall__) REFERENCES FunctionCall (__IDFunctionCall__),
	FOREIGN KEY "for" (__FKfor__) REFERENCES "For" (__IDFor__),
	FOREIGN KEY let (__FKlet__) REFERENCES Let (__IDLet__),
	PRIMARY KEY XPath (__IDXPath__),
	__FKfunctionCall__ Integer,
	__FKlet__ Integer,
	__FKfor__ Integer
) ;

CREATE TABLE BooleanExp (
	__IDBooleanExp__ Integer NOT NULL,
	FOREIGN KEY "where" (__FKwhere__) REFERENCES "Where" (__IDWhere__),
	PRIMARY KEY BooleanExp (__IDBooleanExp__),
	__FKwhere__ Integer
) ;

CREATE TABLE "For" (
	__IDFor__ Integer NOT NULL,
	var text,
	FOREIGN KEY flwor (__FKflwor__) REFERENCES FLWOR (__IDFLWOR__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES XPath (__IDXPath__),
	PRIMARY KEY "For" (__IDFor__),
	__FKexpression__ Integer,
	__FKflwor__ Integer
) ;

CREATE TABLE Let (
	__IDLet__ Integer NOT NULL,
	var text,
	FOREIGN KEY flwor (__FKflwor__) REFERENCES FLWOR (__IDFLWOR__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES XPath (__IDXPath__),
	PRIMARY KEY Let (__IDLet__),
	__FKflwor__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE "Where" (
	__IDWhere__ Integer NOT NULL,
	FOREIGN KEY flwor (__FKflwor__) REFERENCES FLWOR (__IDFLWOR__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES BooleanExp (__IDBooleanExp__),
	PRIMARY KEY "Where" (__IDWhere__),
	__FKflwor__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE OrderBy (
	__IDOrderBy__ Integer NOT NULL,
	FOREIGN KEY flwor (__FKflwor__) REFERENCES FLWOR (__IDFLWOR__),
	PRIMARY KEY OrderBy (__IDOrderBy__),
	__FKflwor__ Integer
) ;

CREATE TABLE "Return" (
	__IDReturn__ Integer NOT NULL,
	FOREIGN KEY flwor (__FKflwor__) REFERENCES FLWOR (__IDFLWOR__),
	PRIMARY KEY "Return" (__IDReturn__),
	__FKflwor__ Integer
) ;

CREATE TABLE Return_expressions_Expression (
	__IDReturn__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE XQueryProgram_expressions_ExecutableExpression (
	__IDXQueryProgram__ Integer NOT NULL,
	__IDExecutableExpression__ Integer NOT NULL
) ;

CREATE TABLE ElementNode_nodes_Expression (
	__IDElementNode__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE FunctionCall_parameters_XPath (
	__IDFunctionCall__ Integer NOT NULL,
	__IDXPath__ Integer NOT NULL
) ;

CREATE TABLE FunctionDeclaration_expression_ExecutableExpression (
	__IDFunctionDeclaration__ Integer NOT NULL,
	__IDExecutableExpression__ Integer NOT NULL
) ;
