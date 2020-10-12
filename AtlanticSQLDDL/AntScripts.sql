CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE DescribableElement (
	__IDDescribableElement__ Integer NOT NULL,
	description text,
	PRIMARY KEY DescribableElement (__IDDescribableElement__)
) ;

CREATE TABLE CommentableElement (
	__IDCommentableElement__ Integer NOT NULL,
	comment text,
	PRIMARY KEY CommentableElement (__IDCommentableElement__)
) ;

CREATE TABLE Project (
	__IDProject__ Integer NOT NULL,
	FOREIGN KEY defaultTarget (__FKdefaultTarget__) REFERENCES Target (__IDTarget__),
	PRIMARY KEY Project (__IDProject__),
	__FKdefaultTarget__ Integer
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	name text,
	value text,
	location text,
	refid text,
	resource text,
	file text,
	url text,
	environment text,
	classpath text,
	classpathref text,
	prefix text,
	PRIMARY KEY Property (__IDProperty__)
) ;

CREATE TABLE Target (
	__IDTarget__ Integer NOT NULL,
	"if" text,
	unless text,
	PRIMARY KEY Target (__IDTarget__)
) ;

CREATE TABLE TaskElement (
	__IDTaskElement__ Integer NOT NULL,
	PRIMARY KEY TaskElement (__IDTaskElement__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	value text,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE TaskParameter (
	__IDTaskParameter__ Integer NOT NULL,
	PRIMARY KEY TaskParameter (__IDTaskParameter__)
) ;

CREATE TABLE Project_properties_Property (
	__IDProject__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Project_targets_Target (
	__IDProject__ Integer NOT NULL,
	__IDTarget__ Integer NOT NULL
) ;

CREATE TABLE Target_tasks_Task (
	__IDTarget__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE Target_depends_Target (
	__IDTarget__ Integer NOT NULL,
	__IDTarget__ Integer NOT NULL
) ;

CREATE TABLE TaskElement_attributes_Attribute (
	__IDTaskElement__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE TaskElement_elements_TaskElement (
	__IDTaskElement__ Integer NOT NULL,
	__IDTaskElement__ Integer NOT NULL
) ;
