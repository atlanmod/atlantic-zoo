CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	PRIMARY KEY ModelElement (__IDModelElement__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE StructuralFeature (
	__IDStructuralFeature__ Integer NOT NULL,
	PRIMARY KEY StructuralFeature (__IDStructuralFeature__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	name text,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	FOREIGN KEY attribute (__FKattribute__) REFERENCES Attribute (__IDAttribute__),
	PRIMARY KEY DataType (__IDDataType__),
	__FKattribute__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	FOREIGN KEY class (__FKclass__) REFERENCES Class (__IDClass__),
	FOREIGN KEY has (__FKhas__) REFERENCES DataType (__IDDataType__),
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKclass__ Integer,
	__FKhas__ Integer
) ;

CREATE TABLE "Case" (
	__IDCase__ Integer NOT NULL,
	name text,
	caseMode Boolean,
	FOREIGN KEY caseInput (__FKcaseInput__) REFERENCES Parameter (__IDParameter__),
	documentation text,
	PRIMARY KEY "Case" (__IDCase__),
	__FKcaseInput__ Integer
) ;

CREATE TABLE Step (
	__IDStep__ Integer NOT NULL,
	name text,
	description text,
	FOREIGN KEY belongsToCase (__FKbelongsToCase__) REFERENCES "Case" (__IDCase__),
	FOREIGN KEY embedsOperator (__FKembedsOperator__) REFERENCES Operator (__IDOperator__),
	PRIMARY KEY Step (__IDStep__),
	__FKembedsOperator__ Integer,
	__FKbelongsToCase__ Integer
) ;

CREATE TABLE LoopStep (
	__IDLoopStep__ Integer NOT NULL,
	PRIMARY KEY LoopStep (__IDLoopStep__)
) ;

CREATE TABLE MultiStep (
	__IDMultiStep__ Integer NOT NULL,
	iterationCondition text,
	PRIMARY KEY MultiStep (__IDMultiStep__)
) ;

CREATE TABLE Operator (
	__IDOperator__ Integer NOT NULL,
	loopable Boolean,
	numberOfInputParameters Integer,
	numberOfOutputParameters Integer,
	manual Boolean,
	tool text,
	FOREIGN KEY realizes (__FKrealizes__) REFERENCES ExecutionElement (__IDExecutionElement__),
	PRIMARY KEY Operator (__IDOperator__),
	__FKrealizes__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	name text,
	place text,
	FOREIGN KEY parameterType () REFERENCES,
	FOREIGN KEY belongsToOperator (__FKbelongsToOperator__) REFERENCES Operator (__IDOperator__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKbelongsToOperator__ Integer
) ;

CREATE TABLE FeatureConstruction (
	__IDFeatureConstruction__ Integer NOT NULL,
	scalingFactor Integer,
	PRIMARY KEY FeatureConstruction (__IDFeatureConstruction__)
) ;

CREATE TABLE DataMinStep (
	__IDDataMinStep__ Integer NOT NULL,
	PRIMARY KEY DataMinStep (__IDDataMinStep__)
) ;

CREATE TABLE TimeOperator (
	__IDTimeOperator__ Integer NOT NULL,
	PRIMARY KEY TimeOperator (__IDTimeOperator__)
) ;

CREATE TABLE FeatureSelection (
	__IDFeatureSelection__ Integer NOT NULL,
	PRIMARY KEY FeatureSelection (__IDFeatureSelection__)
) ;

CREATE TABLE MultiRelFeatureConstr (
	__IDMultiRelFeatureConstr__ Integer NOT NULL,
	PRIMARY KEY MultiRelFeatureConstr (__IDMultiRelFeatureConstr__)
) ;

CREATE TABLE RowSelection (
	__IDRowSelection__ Integer NOT NULL,
	PRIMARY KEY RowSelection (__IDRowSelection__)
) ;

CREATE TABLE Agregation (
	__IDAgregation__ Integer NOT NULL,
	PRIMARY KEY Agregation (__IDAgregation__)
) ;

CREATE TABLE Scaling (
	__IDScaling__ Integer NOT NULL,
	PRIMARY KEY Scaling (__IDScaling__)
) ;

CREATE TABLE Discretization (
	__IDDiscretization__ Integer NOT NULL,
	PRIMARY KEY Discretization (__IDDiscretization__)
) ;

CREATE TABLE Segmentation (
	__IDSegmentation__ Integer NOT NULL,
	PRIMARY KEY Segmentation (__IDSegmentation__)
) ;

CREATE TABLE Sampling (
	__IDSampling__ Integer NOT NULL,
	PRIMARY KEY Sampling (__IDSampling__)
) ;

CREATE TABLE ExecutionElement (
	__IDExecutionElement__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES DataObject (__IDDataObject__),
	FOREIGN KEY target (__FKtarget__) REFERENCES DataObject (__IDDataObject__),
	PRIMARY KEY ExecutionElement (__IDExecutionElement__),
	__FKtarget__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE DataObject (
	__IDDataObject__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES ExecutionElement (__IDExecutionElement__),
	FOREIGN KEY target (__FKtarget__) REFERENCES ExecutionElement (__IDExecutionElement__),
	PRIMARY KEY DataObject (__IDDataObject__),
	__FKtarget__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE "MSL-Tool" (
	"__IDMSL-Tool__" Integer NOT NULL,
	PRIMARY KEY "MSL-Tool" ("__IDMSL-Tool__")
) ;

CREATE TABLE TransformationGroup (
	__IDTransformationGroup__ Integer NOT NULL,
	PRIMARY KEY TransformationGroup (__IDTransformationGroup__)
) ;

CREATE TABLE Transformation (
	__IDTransformation__ Integer NOT NULL,
	FOREIGN KEY transformationGroup (__FKtransformationGroup__) REFERENCES TransformationGroup (__IDTransformationGroup__),
	PRIMARY KEY Transformation (__IDTransformation__),
	__FKtransformationGroup__ Integer
) ;

CREATE TABLE Function (
	__IDFunction__ Integer NOT NULL,
	nameOf text,
	signature text,
	PRIMARY KEY Function (__IDFunction__)
) ;

CREATE TABLE StoredProcedure (
	__IDStoredProcedure__ Integer NOT NULL,
	nameOf text,
	signature text,
	PRIMARY KEY StoredProcedure (__IDStoredProcedure__)
) ;

CREATE TABLE SQLQuery (
	__IDSQLQuery__ Integer NOT NULL,
	PRIMARY KEY SQLQuery (__IDSQLQuery__)
) ;

CREATE TABLE TransformationGroup_transformation_Transformation (
	__IDTransformationGroup__ Integer NOT NULL,
	__IDTransformation__ Integer NOT NULL
) ;

CREATE TABLE Class_attributes_Attribute (
	__IDClass__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE Step_predecessors_Step (
	__IDStep__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE Step_successors_Step (
	__IDStep__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE Case_listOfStep_Step (
	__IDCase__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE Operator_output_Parameter (
	__IDOperator__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Operator_input_Parameter (
	__IDOperator__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;
