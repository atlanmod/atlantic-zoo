CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	name text,
	content text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE System (
	__IDSystem__ Integer NOT NULL,
	PRIMARY KEY System (__IDSystem__)
) ;

CREATE TABLE SystemRole (
	__IDSystemRole__ Integer NOT NULL,
	FOREIGN KEY terminatesAt (__FKterminatesAt__) REFERENCES SystemRoleInterface (__IDSystemRoleInterface__),
	PRIMARY KEY SystemRole (__IDSystemRole__),
	__FKterminatesAt__ Integer
) ;

CREATE TABLE SystemFunction (
	__IDSystemFunction__ Integer NOT NULL,
	FOREIGN KEY terminatesAt (__FKterminatesAt__) REFERENCES SystemProductFlow (__IDSystemProductFlow__),
	PRIMARY KEY SystemFunction (__IDSystemFunction__),
	__FKterminatesAt__ Integer
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	PRIMARY KEY Service (__IDService__)
) ;

CREATE TABLE SystemRoleInterface (
	__IDSystemRoleInterface__ Integer NOT NULL,
	FOREIGN KEY originatesFrom (__FKoriginatesFrom__) REFERENCES SystemRole (__IDSystemRole__),
	PRIMARY KEY SystemRoleInterface (__IDSystemRoleInterface__),
	__FKoriginatesFrom__ Integer
) ;

CREATE TABLE ServiceDependency (
	__IDServiceDependency__ Integer NOT NULL,
	PRIMARY KEY ServiceDependency (__IDServiceDependency__)
) ;

CREATE TABLE ServiceProvider (
	__IDServiceProvider__ Integer NOT NULL,
	PRIMARY KEY ServiceProvider (__IDServiceProvider__)
) ;

CREATE TABLE ServiceMediator (
	__IDServiceMediator__ Integer NOT NULL,
	PRIMARY KEY ServiceMediator (__IDServiceMediator__)
) ;

CREATE TABLE ServiceRegistry (
	__IDServiceRegistry__ Integer NOT NULL,
	PRIMARY KEY ServiceRegistry (__IDServiceRegistry__)
) ;

CREATE TABLE ServiceLocator (
	__IDServiceLocator__ Integer NOT NULL,
	PRIMARY KEY ServiceLocator (__IDServiceLocator__)
) ;

CREATE TABLE ServiceBroker (
	__IDServiceBroker__ Integer NOT NULL,
	PRIMARY KEY ServiceBroker (__IDServiceBroker__)
) ;

CREATE TABLE SystemAtNode (
	__IDSystemAtNode__ Integer NOT NULL,
	FOREIGN KEY "references" (__FKreferences__) REFERENCES System (__IDSystem__),
	FOREIGN KEY terminatesAt (__FKterminatesAt__) REFERENCES SystemAtNodeInterface (__IDSystemAtNodeInterface__),
	PRIMARY KEY SystemAtNode (__IDSystemAtNode__),
	__FKreferences__ Integer,
	__FKterminatesAt__ Integer
) ;

CREATE TABLE SystemAtNodeInterface (
	__IDSystemAtNodeInterface__ Integer NOT NULL,
	FOREIGN KEY originatesFrom (__FKoriginatesFrom__) REFERENCES SystemAtNode (__IDSystemAtNode__),
	PRIMARY KEY SystemAtNodeInterface (__IDSystemAtNodeInterface__),
	__FKoriginatesFrom__ Integer
) ;

CREATE TABLE SystemsNode (
	__IDSystemsNode__ Integer NOT NULL,
	PRIMARY KEY SystemsNode (__IDSystemsNode__)
) ;

CREATE TABLE COI (
	__IDCOI__ Integer NOT NULL,
	FOREIGN KEY defines (__FKdefines__) REFERENCES Vocabulary (__IDVocabulary__),
	PRIMARY KEY COI (__IDCOI__),
	__FKdefines__ Integer
) ;

CREATE TABLE Vocabulary (
	__IDVocabulary__ Integer NOT NULL,
	PRIMARY KEY Vocabulary (__IDVocabulary__)
) ;

CREATE TABLE DataReference (
	__IDDataReference__ Integer NOT NULL,
	FOREIGN KEY defineBy (__FKdefineBy__) REFERENCES Data (__IDData__),
	PRIMARY KEY DataReference (__IDDataReference__),
	__FKdefineBy__ Integer
) ;

CREATE TABLE Performer (
	__IDPerformer__ Integer NOT NULL,
	PRIMARY KEY Performer (__IDPerformer__)
) ;

CREATE TABLE OperationalRole (
	__IDOperationalRole__ Integer NOT NULL,
	PRIMARY KEY OperationalRole (__IDOperationalRole__)
) ;

CREATE TABLE OperationalActivity (
	__IDOperationalActivity__ Integer NOT NULL,
	PRIMARY KEY OperationalActivity (__IDOperationalActivity__)
) ;

CREATE TABLE Product (
	__IDProduct__ Integer NOT NULL,
	PRIMARY KEY Product (__IDProduct__)
) ;

CREATE TABLE Material (
	__IDMaterial__ Integer NOT NULL,
	PRIMARY KEY Material (__IDMaterial__)
) ;

CREATE TABLE Data (
	__IDData__ Integer NOT NULL,
	PRIMARY KEY Data (__IDData__)
) ;

CREATE TABLE SystemProductFlow (
	__IDSystemProductFlow__ Integer NOT NULL,
	FOREIGN KEY originatesFrom (__FKoriginatesFrom__) REFERENCES SystemFunction (__IDSystemFunction__),
	PRIMARY KEY SystemProductFlow (__IDSystemProductFlow__),
	__FKoriginatesFrom__ Integer
) ;

CREATE TABLE ConstraintOrRequirement (
	__IDConstraintOrRequirement__ Integer NOT NULL,
	PRIMARY KEY ConstraintOrRequirement (__IDConstraintOrRequirement__)
) ;

CREATE TABLE "Constraint" (
	__IDConstraint__ Integer NOT NULL,
	PRIMARY KEY "Constraint" (__IDConstraint__)
) ;

CREATE TABLE QualityRequirement (
	__IDQualityRequirement__ Integer NOT NULL,
	PRIMARY KEY QualityRequirement (__IDQualityRequirement__)
) ;

CREATE TABLE DIA (
	__IDDIA__ Integer NOT NULL,
	FOREIGN KEY nmjic (__FKnmjic__) REFERENCES NMJIC (__IDNMJIC__),
	FOREIGN KEY higherEchelon (__FKhigherEchelon__) REFERENCES HigherEchelon (__IDHigherEchelon__),
	PRIMARY KEY DIA (__IDDIA__),
	__FKnmjic__ Integer,
	__FKhigherEchelon__ Integer
) ;

CREATE TABLE NMJIC (
	__IDNMJIC__ Integer NOT NULL,
	FOREIGN KEY dia (__FKdia__) REFERENCES DIA (__IDDIA__),
	PRIMARY KEY NMJIC (__IDNMJIC__),
	__FKdia__ Integer
) ;

CREATE TABLE HigherEchelon (
	__IDHigherEchelon__ Integer NOT NULL,
	FOREIGN KEY dia (__FKdia__) REFERENCES DIA (__IDDIA__),
	FOREIGN KEY jfc (__FKjfc__) REFERENCES JFC (__IDJFC__),
	PRIMARY KEY HigherEchelon (__IDHigherEchelon__),
	__FKjfc__ Integer,
	__FKdia__ Integer
) ;

CREATE TABLE JFC (
	__IDJFC__ Integer NOT NULL,
	FOREIGN KEY higherEchelon (__FKhigherEchelon__) REFERENCES HigherEchelon (__IDHigherEchelon__),
	FOREIGN KEY f2c2 (__FKf2c2__) REFERENCES F2C2 (__IDF2C2__),
	FOREIGN KEY componentComand (__FKcomponentComand__) REFERENCES ComponentCommand (__IDComponentCommand__),
	PRIMARY KEY JFC (__IDJFC__),
	__FKf2c2__ Integer,
	__FKhigherEchelon__ Integer,
	__FKcomponentComand__ Integer
) ;

CREATE TABLE F2C2 (
	__IDF2C2__ Integer NOT NULL,
	FOREIGN KEY jfc (__FKjfc__) REFERENCES JFC (__IDJFC__),
	PRIMARY KEY F2C2 (__IDF2C2__),
	__FKjfc__ Integer
) ;

CREATE TABLE ComponentCommand (
	__IDComponentCommand__ Integer NOT NULL,
	FOREIGN KEY jfc (__FKjfc__) REFERENCES JFC (__IDJFC__),
	PRIMARY KEY ComponentCommand (__IDComponentCommand__),
	__FKjfc__ Integer
) ;

CREATE TABLE DJFLCC (
	__IDDJFLCC__ Integer NOT NULL,
	PRIMARY KEY DJFLCC (__IDDJFLCC__)
) ;

CREATE TABLE JFACC (
	__IDJFACC__ Integer NOT NULL,
	FOREIGN KEY subordinateAirCommand (__FKsubordinateAirCommand__) REFERENCES SubordinateAirCommand (__IDSubordinateAirCommand__),
	PRIMARY KEY JFACC (__IDJFACC__),
	__FKsubordinateAirCommand__ Integer
) ;

CREATE TABLE JFMCC (
	__IDJFMCC__ Integer NOT NULL,
	PRIMARY KEY JFMCC (__IDJFMCC__)
) ;

CREATE TABLE JFSOCC (
	__IDJFSOCC__ Integer NOT NULL,
	PRIMARY KEY JFSOCC (__IDJFSOCC__)
) ;

CREATE TABLE SubordinateAirCommand (
	__IDSubordinateAirCommand__ Integer NOT NULL,
	FOREIGN KEY jfacc (__FKjfacc__) REFERENCES JFACC (__IDJFACC__),
	PRIMARY KEY SubordinateAirCommand (__IDSubordinateAirCommand__),
	__FKjfacc__ Integer
) ;

CREATE TABLE MAW (
	__IDMAW__ Integer NOT NULL,
	PRIMARY KEY MAW (__IDMAW__)
) ;

CREATE TABLE WOC (
	__IDWOC__ Integer NOT NULL,
	PRIMARY KEY WOC (__IDWOC__)
) ;

CREATE TABLE AOCCID (
	__IDAOCCID__ Integer NOT NULL,
	PRIMARY KEY AOCCID (__IDAOCCID__)
) ;

CREATE TABLE AOCCombatPlanStrategyCells (
	__IDAOCCombatPlanStrategyCells__ Integer NOT NULL,
	PRIMARY KEY AOCCombatPlanStrategyCells (__IDAOCCombatPlanStrategyCells__)
) ;

CREATE TABLE ResultData (
	__IDResultData__ Integer NOT NULL,
	sourceID text,
	timeStamp text,
	PRIMARY KEY ResultData (__IDResultData__)
) ;

CREATE TABLE CombatReport (
	__IDCombatReport__ Integer NOT NULL,
	friendlyUnitsInvolved text,
	combatLocation text,
	resultsAssessment text,
	duration text,
	PRIMARY KEY CombatReport (__IDCombatReport__)
) ;

CREATE TABLE WSV (
	__IDWSV__ Integer NOT NULL,
	missionID text,
	weaponfSystemID text,
	videoType text,
	PRIMARY KEY WSV (__IDWSV__)
) ;

CREATE TABLE MISREP (
	__IDMISREP__ Integer NOT NULL,
	missionID text,
	missionObjectives text,
	missionAssesments text,
	PRIMARY KEY MISREP (__IDMISREP__)
) ;

CREATE TABLE Imagery (
	__IDImagery__ Integer NOT NULL,
	imageType text,
	spectralData text,
	geospacialLocation text,
	imageSize Integer,
	PRIMARY KEY Imagery (__IDImagery__)
) ;

CREATE TABLE CollectionRequirement (
	__IDCollectionRequirement__ Integer NOT NULL,
	sourceID text,
	collectionTargetID text,
	toBeDoneByTime text,
	specialNeeds text,
	PRIMARY KEY CollectionRequirement (__IDCollectionRequirement__)
) ;

CREATE TABLE BDAReport (
	__IDBDAReport__ Integer NOT NULL,
	targetID text,
	reportSourceID text,
	assesmentSumart text,
	validityDuration text,
	FOREIGN KEY mea (__FKmea__) REFERENCES MunitionsEffectsAssesment (__IDMunitionsEffectsAssesment__),
	PRIMARY KEY BDAReport (__IDBDAReport__),
	__FKmea__ Integer
) ;

CREATE TABLE MunitionsEffectsAssesment (
	__IDMunitionsEffectsAssesment__ Integer NOT NULL,
	FOREIGN KEY bdaReport (__FKbdaReport__) REFERENCES BDAReport (__IDBDAReport__),
	FOREIGN KEY ato (__FKato__) REFERENCES ATO (__IDATO__),
	FOREIGN KEY tn (__FKtn__) REFERENCES TargetNomination (__IDTargetNomination__),
	PRIMARY KEY MunitionsEffectsAssesment (__IDMunitionsEffectsAssesment__),
	__FKtn__ Integer,
	__FKato__ Integer,
	__FKbdaReport__ Integer
) ;

CREATE TABLE ATO (
	__IDATO__ Integer NOT NULL,
	timePeriod text,
	FOREIGN KEY mea (__FKmea__) REFERENCES MunitionsEffectsAssesment (__IDMunitionsEffectsAssesment__),
	FOREIGN KEY rr (__FKrr__) REFERENCES RestrikeRecommendation (__IDRestrikeRecommendation__),
	PRIMARY KEY ATO (__IDATO__),
	__FKrr__ Integer,
	__FKmea__ Integer
) ;

CREATE TABLE RestrikeRecommendation (
	__IDRestrikeRecommendation__ Integer NOT NULL,
	FOREIGN KEY ato (__FKato__) REFERENCES ATO (__IDATO__),
	FOREIGN KEY tn (__FKtn__) REFERENCES TargetNomination (__IDTargetNomination__),
	PRIMARY KEY RestrikeRecommendation (__IDRestrikeRecommendation__),
	__FKato__ Integer,
	__FKtn__ Integer
) ;

CREATE TABLE TargetNomination (
	__IDTargetNomination__ Integer NOT NULL,
	FOREIGN KEY rr (__FKrr__) REFERENCES RestrikeRecommendation (__IDRestrikeRecommendation__),
	FOREIGN KEY target (__FKtarget__) REFERENCES Target (__IDTarget__),
	PRIMARY KEY TargetNomination (__IDTargetNomination__),
	__FKrr__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE TargetMaterialsAnalysis (
	__IDTargetMaterialsAnalysis__ Integer NOT NULL,
	targetID text,
	FOREIGN KEY target (__FKtarget__) REFERENCES Target (__IDTarget__),
	PRIMARY KEY TargetMaterialsAnalysis (__IDTargetMaterialsAnalysis__),
	__FKtarget__ Integer
) ;

CREATE TABLE Target (
	__IDTarget__ Integer NOT NULL,
	FOREIGN KEY tn (__FKtn__) REFERENCES TargetNomination (__IDTargetNomination__),
	FOREIGN KEY holds (__FKholds__) REFERENCES MIDB (__IDMIDB__),
	PRIMARY KEY Target (__IDTarget__),
	__FKtn__ Integer,
	__FKholds__ Integer
) ;

CREATE TABLE MIDB (
	__IDMIDB__ Integer NOT NULL,
	PRIMARY KEY MIDB (__IDMIDB__)
) ;

CREATE TABLE SystemProductFlow_transports_Product (
	__IDSystemProductFlow__ Integer NOT NULL,
	__IDProduct__ Integer NOT NULL
) ;

CREATE TABLE SystemFunction_produces_Product (
	__IDSystemFunction__ Integer NOT NULL,
	__IDProduct__ Integer NOT NULL
) ;

CREATE TABLE Target_cr_CollectionRequirement (
	__IDTarget__ Integer NOT NULL,
	__IDCollectionRequirement__ Integer NOT NULL
) ;

CREATE TABLE CollectionRequirement_rd_ResultData (
	__IDCollectionRequirement__ Integer NOT NULL,
	__IDResultData__ Integer NOT NULL
) ;

CREATE TABLE OperationalActivity_supports_SystemFunction (
	__IDOperationalActivity__ Integer NOT NULL,
	__IDSystemFunction__ Integer NOT NULL
) ;

CREATE TABLE TargetNomination_ato_ATO (
	__IDTargetNomination__ Integer NOT NULL,
	__IDATO__ Integer NOT NULL
) ;

CREATE TABLE Target_describes_TargetMaterialsAnalysis (
	__IDTarget__ Integer NOT NULL,
	__IDTargetMaterialsAnalysis__ Integer NOT NULL
) ;

CREATE TABLE TargetNomination_mea_MunitionsEffectsAssesment (
	__IDTargetNomination__ Integer NOT NULL,
	__IDMunitionsEffectsAssesment__ Integer NOT NULL
) ;

CREATE TABLE SystemRole_performs_SystemFunction (
	__IDSystemRole__ Integer NOT NULL,
	__IDSystemFunction__ Integer NOT NULL
) ;

CREATE TABLE Performer_decomposes_Performer (
	__IDPerformer__ Integer NOT NULL,
	__IDPerformer__ Integer NOT NULL
) ;

CREATE TABLE COI_comprises_Performer (
	__IDCOI__ Integer NOT NULL,
	__IDPerformer__ Integer NOT NULL
) ;

CREATE TABLE SystemFunction_consumes_Product (
	__IDSystemFunction__ Integer NOT NULL,
	__IDProduct__ Integer NOT NULL
) ;

CREATE TABLE JFACC_aoccpsc_AOCCombatPlanStrategyCells (
	__IDJFACC__ Integer NOT NULL,
	__IDAOCCombatPlanStrategyCells__ Integer NOT NULL
) ;

CREATE TABLE MIDB_target_Target (
	__IDMIDB__ Integer NOT NULL,
	__IDTarget__ Integer NOT NULL
) ;

CREATE TABLE System_fulfills_SystemRole (
	__IDSystem__ Integer NOT NULL,
	__IDSystemRole__ Integer NOT NULL
) ;

CREATE TABLE OperationalActivity_decomposes_OperationalRole (
	__IDOperationalActivity__ Integer NOT NULL,
	__IDOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE SystemFunction_mesuredBy_ConstraintOrRequirement (
	__IDSystemFunction__ Integer NOT NULL,
	__IDConstraintOrRequirement__ Integer NOT NULL
) ;

CREATE TABLE CollectionRequirement_isContainedIn_Target (
	__IDCollectionRequirement__ Integer NOT NULL,
	__IDTarget__ Integer NOT NULL
) ;

CREATE TABLE Vocabulary_comprises_DataReference (
	__IDVocabulary__ Integer NOT NULL,
	__IDDataReference__ Integer NOT NULL
) ;

CREATE TABLE CollectionRequirement_ato_ATO (
	__IDCollectionRequirement__ Integer NOT NULL,
	__IDATO__ Integer NOT NULL
) ;

CREATE TABLE OperationalRole_accomplishes_OperationalActivity (
	__IDOperationalRole__ Integer NOT NULL,
	__IDOperationalActivity__ Integer NOT NULL
) ;

CREATE TABLE ResultData_bdaReport_BDAReport (
	__IDResultData__ Integer NOT NULL,
	__IDBDAReport__ Integer NOT NULL
) ;

CREATE TABLE SystemsNode_groups_SystemAtNode (
	__IDSystemsNode__ Integer NOT NULL,
	__IDSystemAtNode__ Integer NOT NULL
) ;

CREATE TABLE ATO_tn_TargetNomination (
	__IDATO__ Integer NOT NULL,
	__IDTargetNomination__ Integer NOT NULL
) ;

CREATE TABLE OperationalRole_decomposes_OperationalRole (
	__IDOperationalRole__ Integer NOT NULL,
	__IDOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE SystemRole_decomposes_SystemRole (
	__IDSystemRole__ Integer NOT NULL,
	__IDSystemRole__ Integer NOT NULL
) ;

CREATE TABLE JFACC_aoccid_AOCCID (
	__IDJFACC__ Integer NOT NULL,
	__IDAOCCID__ Integer NOT NULL
) ;

CREATE TABLE BDAReport_rd_ResultData (
	__IDBDAReport__ Integer NOT NULL,
	__IDResultData__ Integer NOT NULL
) ;

CREATE TABLE System_decomposes_System (
	__IDSystem__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE SystemFunction_decomposes_SystemFunction (
	__IDSystemFunction__ Integer NOT NULL,
	__IDSystemFunction__ Integer NOT NULL
) ;

CREATE TABLE ATO_cr_CollectionRequirement (
	__IDATO__ Integer NOT NULL,
	__IDCollectionRequirement__ Integer NOT NULL
) ;

CREATE TABLE Performer_fulfills_OperationalRole (
	__IDPerformer__ Integer NOT NULL,
	__IDOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE ResultData_cr_CollectionRequirement (
	__IDResultData__ Integer NOT NULL,
	__IDCollectionRequirement__ Integer NOT NULL
) ;
