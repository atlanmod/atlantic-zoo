CREATE TABLE Entity (
	__IDEntity__ Integer NOT NULL,
	PRIMARY KEY Entity (__IDEntity__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE Dependency (
	__IDDependency__ Integer NOT NULL,
	PRIMARY KEY Dependency (__IDDependency__)
) ;

CREATE TABLE Conform (
	__IDConform__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES Viewpoint (__IDViewpoint__),
	FOREIGN KEY source (__FKsource__) REFERENCES View (__IDView__),
	PRIMARY KEY Conform (__IDConform__),
	__FKsource__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	PRIMARY KEY Package (__IDPackage__)
) ;

CREATE TABLE View (
	__IDView__ Integer NOT NULL,
	FOREIGN KEY conformsTo (__FKconformsTo__) REFERENCES Viewpoint (__IDViewpoint__),
	PRIMARY KEY View (__IDView__),
	__FKconformsTo__ Integer
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	name text,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE Viewpoint (
	__IDViewpoint__ Integer NOT NULL,
	purpose text,
	PRIMARY KEY Viewpoint (__IDViewpoint__)
) ;

CREATE TABLE Comment (
	__IDComment__ Integer NOT NULL,
	content text,
	PRIMARY KEY Comment (__IDComment__)
) ;

CREATE TABLE Rationale (
	__IDRationale__ Integer NOT NULL,
	PRIMARY KEY Rationale (__IDRationale__)
) ;

CREATE TABLE Problem (
	__IDProblem__ Integer NOT NULL,
	PRIMARY KEY Problem (__IDProblem__)
) ;

CREATE TABLE Block (
	__IDBlock__ Integer NOT NULL,
	isEncapsulated Boolean,
	PRIMARY KEY Block (__IDBlock__)
) ;

CREATE TABLE ConstraintBlock (
	__IDConstraintBlock__ Integer NOT NULL,
	PRIMARY KEY ConstraintBlock (__IDConstraintBlock__)
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	PRIMARY KEY Property (__IDProperty__)
) ;

CREATE TABLE BlockProperty (
	__IDBlockProperty__ Integer NOT NULL,
	PRIMARY KEY BlockProperty (__IDBlockProperty__)
) ;

CREATE TABLE ConstraintProperty (
	__IDConstraintProperty__ Integer NOT NULL,
	PRIMARY KEY ConstraintProperty (__IDConstraintProperty__)
) ;

CREATE TABLE DistributedProperty (
	__IDDistributedProperty__ Integer NOT NULL,
	PRIMARY KEY DistributedProperty (__IDDistributedProperty__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE ValueType (
	__IDValueType__ Integer NOT NULL,
	FOREIGN KEY unit (__FKunit__) REFERENCES Unit (__IDUnit__),
	FOREIGN KEY dimension (__FKdimension__) REFERENCES Dimension (__IDDimension__),
	PRIMARY KEY ValueType (__IDValueType__),
	__FKdimension__ Integer,
	__FKunit__ Integer
) ;

CREATE TABLE Unit (
	__IDUnit__ Integer NOT NULL,
	PRIMARY KEY Unit (__IDUnit__)
) ;

CREATE TABLE Dimension (
	__IDDimension__ Integer NOT NULL,
	PRIMARY KEY Dimension (__IDDimension__)
) ;

CREATE TABLE ConnectorEnd (
	__IDConnectorEnd__ Integer NOT NULL,
	PRIMARY KEY ConnectorEnd (__IDConnectorEnd__)
) ;

CREATE TABLE NestedConnectorEnd (
	__IDNestedConnectorEnd__ Integer NOT NULL,
	PRIMARY KEY NestedConnectorEnd (__IDNestedConnectorEnd__)
) ;

CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	isBehavior Boolean,
	PRIMARY KEY Port (__IDPort__)
) ;

CREATE TABLE FlowPort (
	__IDFlowPort__ Integer NOT NULL,
	isAtomic Boolean,
	direction text,
	isConjugated Boolean,
	PRIMARY KEY FlowPort (__IDFlowPort__)
) ;

CREATE TABLE FlowProperty (
	__IDFlowProperty__ Integer NOT NULL,
	direction text,
	PRIMARY KEY FlowProperty (__IDFlowProperty__)
) ;

CREATE TABLE Interface (
	__IDInterface__ Integer NOT NULL,
	PRIMARY KEY Interface (__IDInterface__)
) ;

CREATE TABLE FlowSpecification (
	__IDFlowSpecification__ Integer NOT NULL,
	PRIMARY KEY FlowSpecification (__IDFlowSpecification__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE InformationItem (
	__IDInformationItem__ Integer NOT NULL,
	PRIMARY KEY InformationItem (__IDInformationItem__)
) ;

CREATE TABLE InformationFlow (
	__IDInformationFlow__ Integer NOT NULL,
	PRIMARY KEY InformationFlow (__IDInformationFlow__)
) ;

CREATE TABLE ItemFlow (
	__IDItemFlow__ Integer NOT NULL,
	FOREIGN KEY itemProperty (__FKitemProperty__) REFERENCES BlockProperty (__IDBlockProperty__),
	PRIMARY KEY ItemFlow (__IDItemFlow__),
	__FKitemProperty__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	PRIMARY KEY Parameter (__IDParameter__)
) ;

CREATE TABLE ActivityEdge (
	__IDActivityEdge__ Integer NOT NULL,
	PRIMARY KEY ActivityEdge (__IDActivityEdge__)
) ;

CREATE TABLE ParameterSet (
	__IDParameterSet__ Integer NOT NULL,
	PRIMARY KEY ParameterSet (__IDParameterSet__)
) ;

CREATE TABLE Optional (
	__IDOptional__ Integer NOT NULL,
	PRIMARY KEY Optional (__IDOptional__)
) ;

CREATE TABLE Rate (
	__IDRate__ Integer NOT NULL,
	FOREIGN KEY instance (__FKinstance__) REFERENCES InstanceSpecification (__IDInstanceSpecification__),
	PRIMARY KEY Rate (__IDRate__),
	__FKinstance__ Integer
) ;

CREATE TABLE InstanceSpecification (
	__IDInstanceSpecification__ Integer NOT NULL,
	PRIMARY KEY InstanceSpecification (__IDInstanceSpecification__)
) ;

CREATE TABLE Continous (
	__IDContinous__ Integer NOT NULL,
	PRIMARY KEY Continous (__IDContinous__)
) ;

CREATE TABLE Discrete (
	__IDDiscrete__ Integer NOT NULL,
	PRIMARY KEY Discrete (__IDDiscrete__)
) ;

CREATE TABLE Probability (
	__IDProbability__ Integer NOT NULL,
	FOREIGN KEY probability (__FKprobability__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY Probability (__IDProbability__),
	__FKprobability__ Integer
) ;

CREATE TABLE ValueSpecification (
	__IDValueSpecification__ Integer NOT NULL,
	PRIMARY KEY ValueSpecification (__IDValueSpecification__)
) ;

CREATE TABLE Behavior (
	__IDBehavior__ Integer NOT NULL,
	PRIMARY KEY Behavior (__IDBehavior__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	PRIMARY KEY Operation (__IDOperation__)
) ;

CREATE TABLE ControlOperation (
	__IDControlOperation__ Integer NOT NULL,
	PRIMARY KEY ControlOperation (__IDControlOperation__)
) ;

CREATE TABLE ObjectNode (
	__IDObjectNode__ Integer NOT NULL,
	PRIMARY KEY ObjectNode (__IDObjectNode__)
) ;

CREATE TABLE NoBuffer (
	__IDNoBuffer__ Integer NOT NULL,
	PRIMARY KEY NoBuffer (__IDNoBuffer__)
) ;

CREATE TABLE Overwrite (
	__IDOverwrite__ Integer NOT NULL,
	PRIMARY KEY Overwrite (__IDOverwrite__)
) ;

CREATE TABLE Abstraction (
	__IDAbstraction__ Integer NOT NULL,
	PRIMARY KEY Abstraction (__IDAbstraction__)
) ;

CREATE TABLE Allocate (
	__IDAllocate__ Integer NOT NULL,
	PRIMARY KEY Allocate (__IDAllocate__)
) ;

CREATE TABLE Allocated (
	__IDAllocated__ Integer NOT NULL,
	PRIMARY KEY Allocated (__IDAllocated__)
) ;

CREATE TABLE ActivityPartition (
	__IDActivityPartition__ Integer NOT NULL,
	PRIMARY KEY ActivityPartition (__IDActivityPartition__)
) ;

CREATE TABLE AllocateActivityPartition (
	__IDAllocateActivityPartition__ Integer NOT NULL,
	PRIMARY KEY AllocateActivityPartition (__IDAllocateActivityPartition__)
) ;

CREATE TABLE Trace (
	__IDTrace__ Integer NOT NULL,
	PRIMARY KEY Trace (__IDTrace__)
) ;

CREATE TABLE DeriveReqt (
	__IDDeriveReqt__ Integer NOT NULL,
	PRIMARY KEY DeriveReqt (__IDDeriveReqt__)
) ;

CREATE TABLE Verify (
	__IDVerify__ Integer NOT NULL,
	PRIMARY KEY Verify (__IDVerify__)
) ;

CREATE TABLE Copy (
	__IDCopy__ Integer NOT NULL,
	PRIMARY KEY Copy (__IDCopy__)
) ;

CREATE TABLE Realization (
	__IDRealization__ Integer NOT NULL,
	PRIMARY KEY Realization (__IDRealization__)
) ;

CREATE TABLE Satisfy (
	__IDSatisfy__ Integer NOT NULL,
	PRIMARY KEY Satisfy (__IDSatisfy__)
) ;

CREATE TABLE Requirement (
	__IDRequirement__ Integer NOT NULL,
	text text,
	id text,
	FOREIGN KEY master (__FKmaster__) REFERENCES Requirement (__IDRequirement__),
	PRIMARY KEY Requirement (__IDRequirement__),
	__FKmaster__ Integer
) ;

CREATE TABLE TestCase (
	__IDTestCase__ Integer NOT NULL,
	PRIMARY KEY TestCase (__IDTestCase__)
) ;

CREATE TABLE RequirementRelated (
	__IDRequirementRelated__ Integer NOT NULL,
	PRIMARY KEY RequirementRelated (__IDRequirementRelated__)
) ;

CREATE TABLE BasicInterval (
	__IDBasicInterval__ Integer NOT NULL,
	min Integer,
	max Integer,
	PRIMARY KEY BasicInterval (__IDBasicInterval__)
) ;

CREATE TABLE "Interval" (
	__IDInterval__ Integer NOT NULL,
	PRIMARY KEY "Interval" (__IDInterval__)
) ;

CREATE TABLE Uniform (
	__IDUniform__ Integer NOT NULL,
	PRIMARY KEY Uniform (__IDUniform__)
) ;

CREATE TABLE Normal (
	__IDNormal__ Integer NOT NULL,
	mean Integer,
	standardDeviation Integer,
	PRIMARY KEY Normal (__IDNormal__)
) ;

CREATE TABLE Allocated_allocatedTo_NamedElement (
	__IDAllocated__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE RequirementRelated_satisfies_Requirement (
	__IDRequirementRelated__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE InformationFlow_source_NamedElement (
	__IDInformationFlow__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE InformationFlow_target_NamedElement (
	__IDInformationFlow__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE Requirement_satisfiedBy_NamedElement (
	__IDRequirement__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE NestedConnectorEnd_propertyPath_Property (
	__IDNestedConnectorEnd__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Requirement_refinedBy_NamedElement (
	__IDRequirement__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE RequirementRelated_verifies_Requirement (
	__IDRequirementRelated__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE Requirement_verifiedBy_TestCase (
	__IDRequirement__ Integer NOT NULL,
	__IDTestCase__ Integer NOT NULL
) ;

CREATE TABLE InformationItem_represented_Classifier (
	__IDInformationItem__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Allocated_allocatedFrom_NamedElement (
	__IDAllocated__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE Requirement_derivedFrom_Requirement (
	__IDRequirement__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE FlowSpecification_ownedFlowProperty_FlowProperty (
	__IDFlowSpecification__ Integer NOT NULL,
	__IDFlowProperty__ Integer NOT NULL
) ;

CREATE TABLE Requirement_tracedTo_NamedElement (
	__IDRequirement__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE InformationFlow_conveyed_Classifier (
	__IDInformationFlow__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE RequirementRelated_tracedFrom_Requirement (
	__IDRequirementRelated__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE Requirement_derived_Requirement (
	__IDRequirement__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE RequirementRelated_refines_Requirement (
	__IDRequirementRelated__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;
