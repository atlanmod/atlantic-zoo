CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	id text,
	name text,
	category text,
	frequency Integer,
	importance Integer,
	structurationLevel Integer,
	complexityLevel Integer,
	criticity Integer,
	centrality Integer,
	terminationValue text,
	taskType text,
	taskItem text,
	FOREIGN KEY decomposedTask (__FKdecomposedTask__) REFERENCES Task (__IDTask__),
	FOREIGN KEY leftOperator (__FKleftOperator__) REFERENCES BinaryOperator (__IDBinaryOperator__),
	FOREIGN KEY rightOperator (__FKrightOperator__) REFERENCES BinaryOperator (__IDBinaryOperator__),
	FOREIGN KEY decoration (__FKdecoration__) REFERENCES UnaryOperator (__IDUnaryOperator__),
	PRIMARY KEY Task (__IDTask__),
	__FKdecomposedTask__ Integer,
	__FKleftOperator__ Integer,
	__FKrightOperator__ Integer,
	__FKdecoration__ Integer
) ;

CREATE TABLE Operator (
	__IDOperator__ Integer NOT NULL,
	id text,
	name text,
	PRIMARY KEY Operator (__IDOperator__)
) ;

CREATE TABLE BinaryOperator (
	__IDBinaryOperator__ Integer NOT NULL,
	type text,
	FOREIGN KEY leftTask (__FKleftTask__) REFERENCES Task (__IDTask__),
	FOREIGN KEY rightTask (__FKrightTask__) REFERENCES Task (__IDTask__),
	PRIMARY KEY BinaryOperator (__IDBinaryOperator__),
	__FKleftTask__ Integer,
	__FKrightTask__ Integer
) ;

CREATE TABLE UnaryOperator (
	__IDUnaryOperator__ Integer NOT NULL,
	UnaryType text,
	FOREIGN KEY decoratedTask (__FKdecoratedTask__) REFERENCES Task (__IDTask__),
	PRIMARY KEY UnaryOperator (__IDUnaryOperator__),
	__FKdecoratedTask__ Integer
) ;

CREATE TABLE FiniteInteration (
	__IDFiniteInteration__ Integer NOT NULL,
	interation Integer,
	PRIMARY KEY FiniteInteration (__IDFiniteInteration__)
) ;

CREATE TABLE Task_decompositionTasks_Task (
	__IDTask__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;
