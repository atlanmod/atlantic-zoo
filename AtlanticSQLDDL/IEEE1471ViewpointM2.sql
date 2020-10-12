CREATE TABLE Viewpoint (
	__IDViewpoint__ Integer NOT NULL,
	FOREIGN KEY isImportTo (__FKisImportTo__) REFERENCES Stakeholder (__IDStakeholder__),
	FOREIGN KEY process (__FKprocess__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY Viewpoint (__IDViewpoint__),
	__FKisImportTo__ Integer,
	__FKprocess__ Integer
) ;

CREATE TABLE Concern (
	__IDConcern__ Integer NOT NULL,
	PRIMARY KEY Concern (__IDConcern__)
) ;

CREATE TABLE Stakeholder (
	__IDStakeholder__ Integer NOT NULL,
	FOREIGN KEY concerns (__FKconcerns__) REFERENCES Concern (__IDConcern__),
	PRIMARY KEY Stakeholder (__IDStakeholder__),
	__FKconcerns__ Integer
) ;

CREATE TABLE ViewpointImport (
	__IDViewpointImport__ Integer NOT NULL,
	PRIMARY KEY ViewpointImport (__IDViewpointImport__)
) ;

CREATE TABLE ViewpointDependency (
	__IDViewpointDependency__ Integer NOT NULL,
	FOREIGN KEY supplier (__FKsupplier__) REFERENCES Viewpoint (__IDViewpoint__),
	FOREIGN KEY client (__FKclient__) REFERENCES Viewpoint (__IDViewpoint__),
	PRIMARY KEY ViewpointDependency (__IDViewpointDependency__),
	__FKsupplier__ Integer,
	__FKclient__ Integer
) ;

CREATE TABLE Process (
	__IDProcess__ Integer NOT NULL,
	PRIMARY KEY Process (__IDProcess__)
) ;

CREATE TABLE Technique (
	__IDTechnique__ Integer NOT NULL,
	PRIMARY KEY Technique (__IDTechnique__)
) ;

CREATE TABLE AnalysisMethod (
	__IDAnalysisMethod__ Integer NOT NULL,
	FOREIGN KEY analysis (__FKanalysis__) REFERENCES Language (__IDLanguage__),
	PRIMARY KEY AnalysisMethod (__IDAnalysisMethod__),
	__FKanalysis__ Integer
) ;

CREATE TABLE ArchitecturalConstruct (
	__IDArchitecturalConstruct__ Integer NOT NULL,
	PRIMARY KEY ArchitecturalConstruct (__IDArchitecturalConstruct__)
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	FOREIGN KEY guidance (__FKguidance__) REFERENCES Language (__IDLanguage__),
	PRIMARY KEY Rule (__IDRule__),
	__FKguidance__ Integer
) ;

CREATE TABLE ModelOrganization (
	__IDModelOrganization__ Integer NOT NULL,
	PRIMARY KEY ModelOrganization (__IDModelOrganization__)
) ;

CREATE TABLE ModellingRule (
	__IDModellingRule__ Integer NOT NULL,
	PRIMARY KEY ModellingRule (__IDModellingRule__)
) ;

CREATE TABLE Language (
	__IDLanguage__ Integer NOT NULL,
	PRIMARY KEY Language (__IDLanguage__)
) ;

CREATE TABLE Mapping (
	__IDMapping__ Integer NOT NULL,
	FOREIGN KEY input (__FKinput__) REFERENCES Language (__IDLanguage__),
	FOREIGN KEY ouput (__FKouput__) REFERENCES Language (__IDLanguage__),
	PRIMARY KEY Mapping (__IDMapping__),
	__FKinput__ Integer,
	__FKouput__ Integer
) ;

CREATE TABLE Pattern (
	__IDPattern__ Integer NOT NULL,
	PRIMARY KEY Pattern (__IDPattern__)
) ;

CREATE TABLE Viewpoint_source_ViewpointImport (
	__IDViewpoint__ Integer NOT NULL,
	__IDViewpointImport__ Integer NOT NULL
) ;

CREATE TABLE Viewpoint_architecturalConstruct_ArchitecturalConstruct (
	__IDViewpoint__ Integer NOT NULL,
	__IDArchitecturalConstruct__ Integer NOT NULL
) ;

CREATE TABLE Viewpoint_supplierDependency_ViewpointDependency (
	__IDViewpoint__ Integer NOT NULL,
	__IDViewpointDependency__ Integer NOT NULL
) ;

CREATE TABLE Viewpoint_covers_Concern (
	__IDViewpoint__ Integer NOT NULL,
	__IDConcern__ Integer NOT NULL
) ;

CREATE TABLE Technique_methods_AnalysisMethod (
	__IDTechnique__ Integer NOT NULL,
	__IDAnalysisMethod__ Integer NOT NULL
) ;

CREATE TABLE Viewpoint_clientDependency_ViewpointDependency (
	__IDViewpoint__ Integer NOT NULL,
	__IDViewpointDependency__ Integer NOT NULL
) ;

CREATE TABLE Process_methodology_Technique (
	__IDProcess__ Integer NOT NULL,
	__IDTechnique__ Integer NOT NULL
) ;

CREATE TABLE Rule_techniques_Technique (
	__IDRule__ Integer NOT NULL,
	__IDTechnique__ Integer NOT NULL
) ;

CREATE TABLE Technique_applies_Rule (
	__IDTechnique__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;
