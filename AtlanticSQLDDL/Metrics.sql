CREATE TABLE Metric (
	__IDMetric__ Integer NOT NULL,
	name text,
	PRIMARY KEY Metric (__IDMetric__)
) ;

CREATE TABLE MetricValue (
	__IDMetricValue__ Integer NOT NULL,
	tag text,
	PRIMARY KEY MetricValue (__IDMetricValue__)
) ;

CREATE TABLE StringMetricValue (
	__IDStringMetricValue__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringMetricValue (__IDStringMetricValue__)
) ;

CREATE TABLE BooleanMetricValue (
	__IDBooleanMetricValue__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY BooleanMetricValue (__IDBooleanMetricValue__)
) ;

CREATE TABLE IntegerMetricValue (
	__IDIntegerMetricValue__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY IntegerMetricValue (__IDIntegerMetricValue__)
) ;

CREATE TABLE DoubleMetricValue (
	__IDDoubleMetricValue__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY DoubleMetricValue (__IDDoubleMetricValue__)
) ;

CREATE TABLE Metric_values_MetricValue (
	__IDMetric__ Integer NOT NULL,
	__IDMetricValue__ Integer NOT NULL
) ;
