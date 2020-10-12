CREATE TABLE RootMeasureSet (
	__IDRootMeasureSet__ Integer NOT NULL,
	modelType text,
	PRIMARY KEY RootMeasureSet (__IDRootMeasureSet__)
) ;

CREATE TABLE Category (
	__IDCategory__ Integer NOT NULL,
	name text,
	"desc" text,
	FOREIGN KEY root (__FKroot__) REFERENCES RootMeasureSet (__IDRootMeasureSet__),
	PRIMARY KEY Category (__IDCategory__),
	__FKroot__ Integer
) ;

CREATE TABLE Metric (
	__IDMetric__ Integer NOT NULL,
	name text,
	"desc" text,
	preferredValue text,
	FOREIGN KEY category (__FKcategory__) REFERENCES Category (__IDCategory__),
	PRIMARY KEY Metric (__IDMetric__),
	__FKcategory__ Integer
) ;

CREATE TABLE MeasureSet (
	__IDMeasureSet__ Integer NOT NULL,
	elementName text,
	elementType text,
	FOREIGN KEY root (__FKroot__) REFERENCES RootMeasureSet (__IDRootMeasureSet__),
	FOREIGN KEY parent (__FKparent__) REFERENCES MeasureSet (__IDMeasureSet__),
	PRIMARY KEY MeasureSet (__IDMeasureSet__),
	__FKroot__ Integer,
	__FKparent__ Integer
) ;

CREATE TABLE Measure (
	__IDMeasure__ Integer NOT NULL,
	FOREIGN KEY metric (__FKmetric__) REFERENCES Metric (__IDMetric__),
	FOREIGN KEY owner (__FKowner__) REFERENCES MeasureSet (__IDMeasureSet__),
	PRIMARY KEY Measure (__IDMeasure__),
	__FKmetric__ Integer,
	__FKowner__ Integer
) ;

CREATE TABLE IntegerMeasure (
	__IDIntegerMeasure__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY IntegerMeasure (__IDIntegerMeasure__)
) ;

CREATE TABLE DoubleMeasure (
	__IDDoubleMeasure__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY DoubleMeasure (__IDDoubleMeasure__)
) ;

CREATE TABLE PercentageMeasure (
	__IDPercentageMeasure__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY PercentageMeasure (__IDPercentageMeasure__)
) ;

CREATE TABLE RootMeasureSet_categories_Category (
	__IDRootMeasureSet__ Integer NOT NULL,
	__IDCategory__ Integer NOT NULL
) ;

CREATE TABLE RootMeasureSet_measureSets_MeasureSet (
	__IDRootMeasureSet__ Integer NOT NULL,
	__IDMeasureSet__ Integer NOT NULL
) ;

CREATE TABLE Category_metrics_Metric (
	__IDCategory__ Integer NOT NULL,
	__IDMetric__ Integer NOT NULL
) ;

CREATE TABLE MeasureSet_measures_Measure (
	__IDMeasureSet__ Integer NOT NULL,
	__IDMeasure__ Integer NOT NULL
) ;

CREATE TABLE MeasureSet_subsets_MeasureSet (
	__IDMeasureSet__ Integer NOT NULL,
	__IDMeasureSet__ Integer NOT NULL
) ;
