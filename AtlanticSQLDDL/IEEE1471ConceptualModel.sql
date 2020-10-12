CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	name text,
	content text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE IEEE1471Model (
	__IDIEEE1471Model__ Integer NOT NULL,
	FOREIGN KEY system (__FKsystem__) REFERENCES System (__IDSystem__),
	FOREIGN KEY environment (__FKenvironment__) REFERENCES Environment (__IDEnvironment__),
	FOREIGN KEY architecture (__FKarchitecture__) REFERENCES Architecture (__IDArchitecture__),
	FOREIGN KEY architecturalDescription (__FKarchitecturalDescription__) REFERENCES ArchitecturalDescription (__IDArchitecturalDescription__),
	FOREIGN KEY rationale (__FKrationale__) REFERENCES Rationale (__IDRationale__),
	PRIMARY KEY IEEE1471Model (__IDIEEE1471Model__),
	__FKsystem__ Integer,
	__FKarchitecturalDescription__ Integer,
	__FKenvironment__ Integer,
	__FKarchitecture__ Integer,
	__FKrationale__ Integer
) ;

CREATE TABLE System (
	__IDSystem__ Integer NOT NULL,
	FOREIGN KEY inhabits (__FKinhabits__) REFERENCES Environment (__IDEnvironment__),
	FOREIGN KEY hasAn (__FKhasAn__) REFERENCES Architecture (__IDArchitecture__),
	PRIMARY KEY System (__IDSystem__),
	__FKhasAn__ Integer,
	__FKinhabits__ Integer
) ;

CREATE TABLE Mission (
	__IDMission__ Integer NOT NULL,
	PRIMARY KEY Mission (__IDMission__)
) ;

CREATE TABLE Environment (
	__IDEnvironment__ Integer NOT NULL,
	FOREIGN KEY influences (__FKinfluences__) REFERENCES System (__IDSystem__),
	PRIMARY KEY Environment (__IDEnvironment__),
	__FKinfluences__ Integer
) ;

CREATE TABLE Architecture (
	__IDArchitecture__ Integer NOT NULL,
	FOREIGN KEY describedBy (__FKdescribedBy__) REFERENCES ArchitecturalDescription (__IDArchitecturalDescription__),
	PRIMARY KEY Architecture (__IDArchitecture__),
	__FKdescribedBy__ Integer
) ;

CREATE TABLE Rationale (
	__IDRationale__ Integer NOT NULL,
	FOREIGN KEY provides (__FKprovides__) REFERENCES ArchitecturalDescription (__IDArchitecturalDescription__),
	PRIMARY KEY Rationale (__IDRationale__),
	__FKprovides__ Integer
) ;

CREATE TABLE ArchitecturalDescription (
	__IDArchitecturalDescription__ Integer NOT NULL,
	PRIMARY KEY ArchitecturalDescription (__IDArchitecturalDescription__)
) ;

CREATE TABLE View (
	__IDView__ Integer NOT NULL,
	FOREIGN KEY conformsTo (__FKconformsTo__) REFERENCES Viewpoint (__IDViewpoint__),
	PRIMARY KEY View (__IDView__),
	__FKconformsTo__ Integer
) ;

CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	FOREIGN KEY participatesInAD (__FKparticipatesInAD__) REFERENCES ArchitecturalDescription (__IDArchitecturalDescription__),
	PRIMARY KEY Model (__IDModel__),
	__FKparticipatesInAD__ Integer
) ;

CREATE TABLE Stakeholder (
	__IDStakeholder__ Integer NOT NULL,
	PRIMARY KEY Stakeholder (__IDStakeholder__)
) ;

CREATE TABLE Concern (
	__IDConcern__ Integer NOT NULL,
	PRIMARY KEY Concern (__IDConcern__)
) ;

CREATE TABLE Viewpoint (
	__IDViewpoint__ Integer NOT NULL,
	FOREIGN KEY hasSource (__FKhasSource__) REFERENCES LibraryViewpoint (__IDLibraryViewpoint__),
	PRIMARY KEY Viewpoint (__IDViewpoint__),
	__FKhasSource__ Integer
) ;

CREATE TABLE LibraryViewpoint (
	__IDLibraryViewpoint__ Integer NOT NULL,
	PRIMARY KEY LibraryViewpoint (__IDLibraryViewpoint__)
) ;

CREATE TABLE ArchitecturalDescription_identifiesS_Stakeholder (
	__IDArchitecturalDescription__ Integer NOT NULL,
	__IDStakeholder__ Integer NOT NULL
) ;

CREATE TABLE IEEE1471Model_concerns_Concern (
	__IDIEEE1471Model__ Integer NOT NULL,
	__IDConcern__ Integer NOT NULL
) ;

CREATE TABLE ArchitecturalDescription_aggregates_Model (
	__IDArchitecturalDescription__ Integer NOT NULL,
	__IDModel__ Integer NOT NULL
) ;

CREATE TABLE System_fulfils_Mission (
	__IDSystem__ Integer NOT NULL,
	__IDMission__ Integer NOT NULL
) ;

CREATE TABLE Concern_isImportantTo_Stakeholder (
	__IDConcern__ Integer NOT NULL,
	__IDStakeholder__ Integer NOT NULL
) ;

CREATE TABLE ArchitecturalDescription_identifiesC_Concern (
	__IDArchitecturalDescription__ Integer NOT NULL,
	__IDConcern__ Integer NOT NULL
) ;

CREATE TABLE Viewpoint_usedToCover_Concern (
	__IDViewpoint__ Integer NOT NULL,
	__IDConcern__ Integer NOT NULL
) ;

CREATE TABLE IEEE1471Model_missions_Mission (
	__IDIEEE1471Model__ Integer NOT NULL,
	__IDMission__ Integer NOT NULL
) ;

CREATE TABLE Stakeholder_has_Concern (
	__IDStakeholder__ Integer NOT NULL,
	__IDConcern__ Integer NOT NULL
) ;

CREATE TABLE ArchitecturalDescription_organizedBy_View (
	__IDArchitecturalDescription__ Integer NOT NULL,
	__IDView__ Integer NOT NULL
) ;

CREATE TABLE Model_participatesInV_View (
	__IDModel__ Integer NOT NULL,
	__IDView__ Integer NOT NULL
) ;

CREATE TABLE Viewpoint_establishesMethodsFor_Model (
	__IDViewpoint__ Integer NOT NULL,
	__IDModel__ Integer NOT NULL
) ;

CREATE TABLE View_consitsOf_Model (
	__IDView__ Integer NOT NULL,
	__IDModel__ Integer NOT NULL
) ;

CREATE TABLE ArchitecturalDescription_selects_Viewpoint (
	__IDArchitecturalDescription__ Integer NOT NULL,
	__IDViewpoint__ Integer NOT NULL
) ;

CREATE TABLE IEEE1471Model_viewpoints_Viewpoint (
	__IDIEEE1471Model__ Integer NOT NULL,
	__IDViewpoint__ Integer NOT NULL
) ;

CREATE TABLE IEEE1471Model_stakeholders_Stakeholder (
	__IDIEEE1471Model__ Integer NOT NULL,
	__IDStakeholder__ Integer NOT NULL
) ;

CREATE TABLE System_has_Stakeholder (
	__IDSystem__ Integer NOT NULL,
	__IDStakeholder__ Integer NOT NULL
) ;

CREATE TABLE IEEE1471Model_libraryViewpoints_LibraryViewpoint (
	__IDIEEE1471Model__ Integer NOT NULL,
	__IDLibraryViewpoint__ Integer NOT NULL
) ;
