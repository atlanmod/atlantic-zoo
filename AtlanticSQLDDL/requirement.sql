CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	FOREIGN KEY abstract (__FKabstract__) REFERENCES AbstractDocument (__IDAbstractDocument__),
	FOREIGN KEY description (__FKdescription__) REFERENCES ProductDescription (__IDProductDescription__),
	PRIMARY KEY Model (__IDModel__),
	__FKabstract__ Integer,
	__FKdescription__ Integer
) ;
