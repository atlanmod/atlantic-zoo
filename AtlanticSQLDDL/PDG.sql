CREATE TABLE MProgramDependenceGraph (
	__IDMProgramDependenceGraph__ Integer NOT NULL,
	FOREIGN KEY node (__FKnode__) REFERENCES EnterNode (__IDEnterNode__),
	PRIMARY KEY MProgramDependenceGraph (__IDMProgramDependenceGraph__),
	__FKnode__ Integer
) ;

CREATE TABLE EnterNode (
	__IDEnterNode__ Integer NOT NULL,
	name text,
	PRIMARY KEY EnterNode (__IDEnterNode__)
) ;

CREATE TABLE ExpressionNode (
	__IDExpressionNode__ Integer NOT NULL,
	name text,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ExpressionNode (__IDExpressionNode__),
	__FKexpression__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	name text,
	isIdentifier Boolean,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE EnterNode_controlDependenceNodes_ExpressionNode (
	__IDEnterNode__ Integer NOT NULL,
	__IDExpressionNode__ Integer NOT NULL
) ;

CREATE TABLE ExpressionNode_dataDependenceNodes_ExpressionNode (
	__IDExpressionNode__ Integer NOT NULL,
	__IDExpressionNode__ Integer NOT NULL
) ;

CREATE TABLE ExpressionNode_controlDependenceNodes_ExpressionNode (
	__IDExpressionNode__ Integer NOT NULL,
	__IDExpressionNode__ Integer NOT NULL
) ;

CREATE TABLE Expression_innerExpressions_Expression (
	__IDExpression__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;
