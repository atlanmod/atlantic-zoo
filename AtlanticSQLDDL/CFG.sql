CREATE TABLE AbstractNode (
	__IDAbstractNode__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY AbstractNode (__IDAbstractNode__),
	__FKexpression__ Integer
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	FOREIGN KEY inNode (__FKinNode__) REFERENCES Node (__IDNode__),
	FOREIGN KEY outNode (__FKoutNode__) REFERENCES Node (__IDNode__),
	PRIMARY KEY Node (__IDNode__),
	__FKinNode__ Integer,
	__FKoutNode__ Integer
) ;

CREATE TABLE ConditionalNode (
	__IDConditionalNode__ Integer NOT NULL,
	FOREIGN KEY trueConditionNode (__FKtrueConditionNode__) REFERENCES Node (__IDNode__),
	FOREIGN KEY falseConditionNode (__FKfalseConditionNode__) REFERENCES Node (__IDNode__),
	PRIMARY KEY ConditionalNode (__IDConditionalNode__),
	__FKtrueConditionNode__ Integer,
	__FKfalseConditionNode__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	expressionName text,
	PRIMARY KEY Expression (__IDExpression__)
) ;
