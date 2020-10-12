CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	id Integer,
	name text,
	excludeFromBuild Boolean,
	PRIMARY KEY ModelElement (__IDModelElement__)
) ;

CREATE TABLE VisualModelElement (
	__IDVisualModelElement__ Integer NOT NULL,
	FOREIGN KEY position (__FKposition__) REFERENCES Point (__IDPoint__),
	FOREIGN KEY "label" (__FKlabel__) REFERENCES Point (__IDPoint__),
	publicFlag Boolean,
	presentationFlag Boolean,
	showLabel Boolean,
	PRIMARY KEY VisualModelElement (__IDVisualModelElement__),
	__FKposition__ Integer,
	__FKlabel__ Integer
) ;

CREATE TABLE Point (
	__IDPoint__ Integer NOT NULL,
	x Integer,
	y Integer,
	PRIMARY KEY Point (__IDPoint__)
) ;

CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	engineVersion Integer,
	javaPackageName text,
	PRIMARY KEY Model (__IDModel__)
) ;

CREATE TABLE ActiveObjectClass (
	__IDActiveObjectClass__ Integer NOT NULL,
	FOREIGN KEY clientAreaTopLeft (__FKclientAreaTopLeft__) REFERENCES Point (__IDPoint__),
	presentationTopGroupPersistent Boolean,
	iconTopGroupPersistent Boolean,
	generic Boolean,
	genericParameters text,
	agent Boolean,
	environmentDefinesInitialLocation Boolean,
	PRIMARY KEY ActiveObjectClass (__IDActiveObjectClass__),
	__FKclientAreaTopLeft__ Integer
) ;

CREATE TABLE Connector (
	__IDConnector__ Integer NOT NULL,
	FOREIGN KEY sourceEmbeddedObject (__FKsourceEmbeddedObject__) REFERENCES EmbeddedObject (__IDEmbeddedObject__),
	sourceConnectableName text,
	FOREIGN KEY targetEmbeddedObject (__FKtargetEmbeddedObject__) REFERENCES EmbeddedObject (__IDEmbeddedObject__),
	targetConnectableName text,
	PRIMARY KEY Connector (__IDConnector__),
	__FKsourceEmbeddedObject__ Integer,
	__FKtargetEmbeddedObject__ Integer
) ;

CREATE TABLE EmbeddedObject (
	__IDEmbeddedObject__ Integer NOT NULL,
	FOREIGN KEY presentation (__FKpresentation__) REFERENCES EmbeddedObjectPresentation (__IDEmbeddedObjectPresentation__),
	FOREIGN KEY activeObjectClass (__FKactiveObjectClass__) REFERENCES ActiveObjectClassRef (__IDActiveObjectClassRef__),
	genericParametersSubstitute text,
	PRIMARY KEY EmbeddedObject (__IDEmbeddedObject__),
	__FKpresentation__ Integer,
	__FKactiveObjectClass__ Integer
) ;

CREATE TABLE ActiveObjectClassRef (
	__IDActiveObjectClassRef__ Integer NOT NULL,
	packageName text,
	className text,
	PRIMARY KEY ActiveObjectClassRef (__IDActiveObjectClassRef__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	name text,
	value text,
	PRIMARY KEY Parameter (__IDParameter__)
) ;

CREATE TABLE Shape (
	__IDShape__ Integer NOT NULL,
	asObject Boolean,
	embeddedIcon Boolean,
	rotation "Double",
	PRIMARY KEY Shape (__IDShape__)
) ;

CREATE TABLE EmbeddedObjectPresentation (
	__IDEmbeddedObjectPresentation__ Integer NOT NULL,
	PRIMARY KEY EmbeddedObjectPresentation (__IDEmbeddedObjectPresentation__)
) ;

CREATE TABLE Experiment (
	__IDExperiment__ Integer NOT NULL,
	PRIMARY KEY Experiment (__IDExperiment__)
) ;

CREATE TABLE SimulationExperiment (
	__IDSimulationExperiment__ Integer NOT NULL,
	FOREIGN KEY activeObjectClass (__FKactiveObjectClass__) REFERENCES ActiveObjectClass (__IDActiveObjectClass__),
	FOREIGN KEY clientAreaTopLeft (__FKclientAreaTopLeft__) REFERENCES Point (__IDPoint__),
	presentationTopGroupPersistent Boolean,
	iconTopGroupPersistent Boolean,
	FOREIGN KEY frame (__FKframe__) REFERENCES Frame (__IDFrame__),
	commandLineArguments text,
	maximumMemory Integer,
	randomSeed Boolean,
	seedValue Integer,
	vmArgs text,
	absoluteAccuracy "Double",
	relativeAccuracy "Double",
	timeAccuracy "Double",
	fixedTimeStep "Double",
	enableAdaptiveFrameManagement Boolean,
	enableAntiAliasing Boolean,
	enablePanning Boolean,
	enableZoom Boolean,
	executionMode text,
	cpuRatio text,
	title text,
	framesPerSecond text,
	realTimeScale text,
	useCalendar Boolean,
	stopOption text,
	initialDate text,
	initialTime text,
	finalDate text,
	finalTime text,
	modelTimeUnit text,
	PRIMARY KEY SimulationExperiment (__IDSimulationExperiment__),
	__FKactiveObjectClass__ Integer,
	__FKclientAreaTopLeft__ Integer,
	__FKframe__ Integer
) ;

CREATE TABLE Control (
	__IDControl__ Integer NOT NULL,
	width Integer,
	height Integer,
	asObject Boolean,
	embeddedIcon Boolean,
	fillColor Integer,
	textColor Integer,
	enableExpression text,
	actionCode text,
	labelText text,
	FOREIGN KEY font (__FKfont__) REFERENCES Font (__IDFont__),
	PRIMARY KEY Control (__IDControl__),
	__FKfont__ Integer
) ;

CREATE TABLE Button (
	__IDButton__ Integer NOT NULL,
	PRIMARY KEY Button (__IDButton__)
) ;

CREATE TABLE Frame (
	__IDFrame__ Integer NOT NULL,
	x Integer,
	y Integer,
	width Integer,
	height Integer,
	PRIMARY KEY Frame (__IDFrame__)
) ;

CREATE TABLE Text (
	__IDText__ Integer NOT NULL,
	color Integer,
	text text,
	FOREIGN KEY font (__FKfont__) REFERENCES Font (__IDFont__),
	alignment text,
	PRIMARY KEY Text (__IDText__),
	__FKfont__ Integer
) ;

CREATE TABLE Font (
	__IDFont__ Integer NOT NULL,
	name text,
	size Integer,
	style Integer,
	PRIMARY KEY Font (__IDFont__)
) ;

CREATE TABLE Model_activeObjectClasses_ActiveObjectClass (
	__IDModel__ Integer NOT NULL,
	__IDActiveObjectClass__ Integer NOT NULL
) ;

CREATE TABLE Model_experiments_Experiment (
	__IDModel__ Integer NOT NULL,
	__IDExperiment__ Integer NOT NULL
) ;

CREATE TABLE ActiveObjectClass_connectors_Connector (
	__IDActiveObjectClass__ Integer NOT NULL,
	__IDConnector__ Integer NOT NULL
) ;

CREATE TABLE ActiveObjectClass_embeddedObjects_EmbeddedObject (
	__IDActiveObjectClass__ Integer NOT NULL,
	__IDEmbeddedObject__ Integer NOT NULL
) ;

CREATE TABLE ActiveObjectClass_shapes_Shape (
	__IDActiveObjectClass__ Integer NOT NULL,
	__IDShape__ Integer NOT NULL
) ;

CREATE TABLE Connector_points_Point (
	__IDConnector__ Integer NOT NULL,
	__IDPoint__ Integer NOT NULL
) ;

CREATE TABLE EmbeddedObject_parameters_Parameter (
	__IDEmbeddedObject__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE SimulationExperiment_shapes_Shape (
	__IDSimulationExperiment__ Integer NOT NULL,
	__IDShape__ Integer NOT NULL
) ;

CREATE TABLE SimulationExperiment_controls_Control (
	__IDSimulationExperiment__ Integer NOT NULL,
	__IDControl__ Integer NOT NULL
) ;

CREATE TABLE SimulationExperiment_parameters_Parameter (
	__IDSimulationExperiment__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE SimulationExperiment_uiProperties_Parameter (
	__IDSimulationExperiment__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;
