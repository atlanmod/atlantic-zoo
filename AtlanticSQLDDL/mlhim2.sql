CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	FOREIGN KEY time (__FKtime__) REFERENCES DvTemporal (__IDDvTemporal__),
	FOREIGN KEY description (__FKdescription__) REFERENCES ItemStructure (__IDItemStructure__),
	FOREIGN KEY ismTransition (__FKismTransition__) REFERENCES DvCodedString (__IDDvCodedString__),
	FOREIGN KEY instructionDetails (__FKinstructionDetails__) REFERENCES DvCodedString (__IDDvCodedString__),
	PRIMARY KEY Action (__IDAction__),
	__FKtime__ Integer,
	__FKdescription__ Integer,
	__FKismTransition__ Integer,
	__FKinstructionDetails__ Integer
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	FOREIGN KEY description (__FKdescription__) REFERENCES ItemStructure (__IDItemStructure__),
	FOREIGN KEY timing (__FKtiming__) REFERENCES DvParsable (__IDDvParsable__),
	PRIMARY KEY Activity (__IDActivity__),
	__FKdescription__ Integer,
	__FKtiming__ Integer
) ;

CREATE TABLE AdminEntry (
	__IDAdminEntry__ Integer NOT NULL,
	FOREIGN KEY data (__FKdata__) REFERENCES ItemStructure (__IDItemStructure__),
	PRIMARY KEY AdminEntry (__IDAdminEntry__),
	__FKdata__ Integer
) ;

CREATE TABLE ASKR (
	__IDASKR__ Integer NOT NULL,
	PRIMARY KEY ASKR (__IDASKR__)
) ;

CREATE TABLE ASKU (
	__IDASKU__ Integer NOT NULL,
	PRIMARY KEY ASKU (__IDASKU__)
) ;

CREATE TABLE Attestation (
	__IDAttestation__ Integer NOT NULL,
	FOREIGN KEY attestedView (__FKattestedView__) REFERENCES DvMedia (__IDDvMedia__),
	FOREIGN KEY proof (__FKproof__) REFERENCES DvParsable (__IDDvParsable__),
	FOREIGN KEY reason (__FKreason__) REFERENCES DvCodedString (__IDDvCodedString__),
	FOREIGN KEY commiter (__FKcommiter__) REFERENCES PartyProxy (__IDPartyProxy__),
	FOREIGN KEY timeCommited (__FKtimeCommited__) REFERENCES DvTemporal (__IDDvTemporal__),
	FOREIGN KEY isPending (__FKisPending__) REFERENCES DvBoolean (__IDDvBoolean__),
	PRIMARY KEY Attestation (__IDAttestation__),
	__FKattestedView__ Integer,
	__FKproof__ Integer,
	__FKreason__ Integer,
	__FKcommiter__ Integer,
	__FKtimeCommited__ Integer,
	__FKisPending__ Integer
) ;

CREATE TABLE CareEntry (
	__IDCareEntry__ Integer NOT NULL,
	FOREIGN KEY protocol (__FKprotocol__) REFERENCES ItemStructure (__IDItemStructure__),
	FOREIGN KEY guidelineId (__FKguidelineId__) REFERENCES ObjectRef (__IDObjectRef__),
	PRIMARY KEY CareEntry (__IDCareEntry__),
	__FKprotocol__ Integer,
	__FKguidelineId__ Integer
) ;

CREATE TABLE CCD (
	__IDCCD__ Integer NOT NULL,
	FOREIGN KEY definition (__FKdefinition__) REFERENCES Locatable (__IDLocatable__),
	FOREIGN KEY ontology (__FKontology__) REFERENCES Ontology (__IDOntology__),
	PRIMARY KEY CCD (__IDCCD__),
	__FKdefinition__ Integer,
	__FKontology__ Integer
) ;

CREATE TABLE Cluster (
	__IDCluster__ Integer NOT NULL,
	PRIMARY KEY Cluster (__IDCluster__)
) ;

CREATE TABLE Composition (
	__IDComposition__ Integer NOT NULL,
	FOREIGN KEY attestation (__FKattestation__) REFERENCES Attestation (__IDAttestation__),
	FOREIGN KEY original (__FKoriginal__) REFERENCES DvToken (__IDDvToken__),
	FOREIGN KEY predecessor (__FKpredecessor__) REFERENCES DvToken (__IDDvToken__),
	FOREIGN KEY created (__FKcreated__) REFERENCES DvTemporal (__IDDvTemporal__),
	FOREIGN KEY composer (__FKcomposer__) REFERENCES PartyProxy (__IDPartyProxy__),
	FOREIGN KEY territory (__FKterritory__) REFERENCES Location (__IDLocation__),
	FOREIGN KEY category (__FKcategory__) REFERENCES DvCodedString (__IDDvCodedString__),
	FOREIGN KEY language (__FKlanguage__) REFERENCES DvLanguage (__IDDvLanguage__),
	FOREIGN KEY context (__FKcontext__) REFERENCES EventContext (__IDEventContext__),
	FOREIGN KEY content (__FKcontent__) REFERENCES Locatable (__IDLocatable__),
	PRIMARY KEY Composition (__IDComposition__),
	__FKattestation__ Integer,
	__FKoriginal__ Integer,
	__FKpredecessor__ Integer,
	__FKcreated__ Integer,
	__FKcomposer__ Integer,
	__FKterritory__ Integer,
	__FKcategory__ Integer,
	__FKlanguage__ Integer,
	__FKcontext__ Integer,
	__FKcontent__ Integer
) ;

CREATE TABLE ContentItem (
	__IDContentItem__ Integer NOT NULL,
	FOREIGN KEY attestation (__FKattestation__) REFERENCES Attestation (__IDAttestation__),
	PRIMARY KEY ContentItem (__IDContentItem__),
	__FKattestation__ Integer
) ;

CREATE TABLE DataStructure (
	__IDDataStructure__ Integer NOT NULL,
	PRIMARY KEY DataStructure (__IDDataStructure__)
) ;

CREATE TABLE DER (
	__IDDER__ Integer NOT NULL,
	PRIMARY KEY DER (__IDDER__)
) ;

CREATE TABLE Device (
	__IDDevice__ Integer NOT NULL,
	FOREIGN KEY details (__FKdetails__) REFERENCES ItemStructure (__IDItemStructure__),
	PRIMARY KEY Device (__IDDevice__),
	__FKdetails__ Integer
) ;

CREATE TABLE DvAny (
	__IDDvAny__ Integer NOT NULL,
	validTimeBegin text,
	validTimeEnd text,
	FOREIGN KEY ev (__FKev__) REFERENCES ExceptionalValue (__IDExceptionalValue__),
	PRIMARY KEY DvAny (__IDDvAny__),
	__FKev__ Integer
) ;

CREATE TABLE DvBoolean (
	__IDDvBoolean__ Integer NOT NULL,
	dv Boolean,
	PRIMARY KEY DvBoolean (__IDDvBoolean__)
) ;

CREATE TABLE DvByte (
	__IDDvByte__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvByte (__IDDvByte__)
) ;

CREATE TABLE DvChar (
	__IDDvChar__ Integer NOT NULL,
	PRIMARY KEY DvChar (__IDDvChar__)
) ;

CREATE TABLE DvCodedString (
	__IDDvCodedString__ Integer NOT NULL,
	codeString text,
	terminologyName text,
	terminologyAbbrev text,
	PRIMARY KEY DvCodedString (__IDDvCodedString__)
) ;

CREATE TABLE DvCount (
	__IDDvCount__ Integer NOT NULL,
	count Integer,
	PRIMARY KEY DvCount (__IDDvCount__)
) ;

CREATE TABLE DvDate (
	__IDDvDate__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvDate (__IDDvDate__)
) ;

CREATE TABLE DvDateTime (
	__IDDvDateTime__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvDateTime (__IDDvDateTime__)
) ;

CREATE TABLE DvDecimal (
	__IDDvDecimal__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvDecimal (__IDDvDecimal__)
) ;

CREATE TABLE DvDuration (
	__IDDvDuration__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvDuration (__IDDvDuration__)
) ;

CREATE TABLE DvEncapsulated (
	__IDDvEncapsulated__ Integer NOT NULL,
	size text,
	charset text,
	language text,
	PRIMARY KEY DvEncapsulated (__IDDvEncapsulated__)
) ;

CREATE TABLE DvIdentifier (
	__IDDvIdentifier__ Integer NOT NULL,
	issuer text,
	assigner text,
	name text,
	PRIMARY KEY DvIdentifier (__IDDvIdentifier__)
) ;

CREATE TABLE DvInt (
	__IDDvInt__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvInt (__IDDvInt__)
) ;

CREATE TABLE DvInteger (
	__IDDvInteger__ Integer NOT NULL,
	dv Integer,
	PRIMARY KEY DvInteger (__IDDvInteger__)
) ;

CREATE TABLE DvInterval (
	__IDDvInterval__ Integer NOT NULL,
	FOREIGN KEY lower (__FKlower__) REFERENCES DvOrdered (__IDDvOrdered__),
	FOREIGN KEY upper (__FKupper__) REFERENCES DvOrdered (__IDDvOrdered__),
	lowerIncluded Boolean,
	upperIncluded Boolean,
	lowerUnbounded Boolean,
	upperUnbounded Boolean,
	PRIMARY KEY DvInterval (__IDDvInterval__),
	__FKlower__ Integer,
	__FKupper__ Integer
) ;

CREATE TABLE DvLanguage (
	__IDDvLanguage__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvLanguage (__IDDvLanguage__)
) ;

CREATE TABLE DvLong (
	__IDDvLong__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvLong (__IDDvLong__)
) ;

CREATE TABLE DvMedia (
	__IDDvMedia__ Integer NOT NULL,
	mimeType text,
	compressionType text,
	hashResult text,
	hashFunction text,
	uri text,
	altText text,
	PRIMARY KEY DvMedia (__IDDvMedia__)
) ;

CREATE TABLE DvMediaApp (
	__IDDvMediaApp__ Integer NOT NULL,
	FOREIGN KEY dv REFERENCES,
	PRIMARY KEY DvMediaApp (__IDDvMediaApp__)
) ;

CREATE TABLE DvMediaAudio (
	__IDDvMediaAudio__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvMediaAudio (__IDDvMediaAudio__)
) ;

CREATE TABLE DvMediaImage (
	__IDDvMediaImage__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvMediaImage (__IDDvMediaImage__)
) ;

CREATE TABLE DvMediaModel (
	__IDDvMediaModel__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvMediaModel (__IDDvMediaModel__)
) ;

CREATE TABLE DvMediaMsg (
	__IDDvMediaMsg__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvMediaMsg (__IDDvMediaMsg__)
) ;

CREATE TABLE DvMediaMultipart (
	__IDDvMediaMultipart__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY DvMediaMultipart (__IDDvMediaMultipart__)
) ;

CREATE TABLE DvMediaText (
	__IDDvMediaText__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvMediaText (__IDDvMediaText__)
) ;

CREATE TABLE DvMediaVideo (
	__IDDvMediaVideo__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvMediaVideo (__IDDvMediaVideo__)
) ;

CREATE TABLE DvNegativeInteger (
	__IDDvNegativeInteger__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvNegativeInteger (__IDDvNegativeInteger__)
) ;

CREATE TABLE DvNonNegativeInteger (
	__IDDvNonNegativeInteger__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvNonNegativeInteger (__IDDvNonNegativeInteger__)
) ;

CREATE TABLE DvNonPositiveInteger (
	__IDDvNonPositiveInteger__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvNonPositiveInteger (__IDDvNonPositiveInteger__)
) ;

CREATE TABLE DvNormalizedString (
	__IDDvNormalizedString__ Integer NOT NULL,
	uuid text,
	language text,
	dv text,
	PRIMARY KEY DvNormalizedString (__IDDvNormalizedString__)
) ;

CREATE TABLE DvNumeric (
	__IDDvNumeric__ Integer NOT NULL,
	PRIMARY KEY DvNumeric (__IDDvNumeric__)
) ;

CREATE TABLE DvOrdered (
	__IDDvOrdered__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	normalStatus text,
	PRIMARY KEY DvOrdered (__IDDvOrdered__)
) ;

CREATE TABLE DvOrdinal (
	__IDDvOrdinal__ Integer NOT NULL,
	dv Integer,
	symbol text,
	PRIMARY KEY DvOrdinal (__IDDvOrdinal__)
) ;

CREATE TABLE DvParagraph (
	__IDDvParagraph__ Integer NOT NULL,
	PRIMARY KEY DvParagraph (__IDDvParagraph__)
) ;

CREATE TABLE DvParsable (
	__IDDvParsable__ Integer NOT NULL,
	dv text,
	formalism text,
	PRIMARY KEY DvParsable (__IDDvParsable__)
) ;

CREATE TABLE DvPositiveInteger (
	__IDDvPositiveInteger__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvPositiveInteger (__IDDvPositiveInteger__)
) ;

CREATE TABLE DvProportion (
	__IDDvProportion__ Integer NOT NULL,
	proportionType text,
	PRIMARY KEY DvProportion (__IDDvProportion__)
) ;

CREATE TABLE DvQuantified (
	__IDDvQuantified__ Integer NOT NULL,
	magnitude text,
	magnitudeStatus text,
	error text,
	accuracy text,
	PRIMARY KEY DvQuantified (__IDDvQuantified__)
) ;

CREATE TABLE DvQuantity (
	__IDDvQuantity__ Integer NOT NULL,
	units text,
	PRIMARY KEY DvQuantity (__IDDvQuantity__)
) ;

CREATE TABLE DvRate (
	__IDDvRate__ Integer NOT NULL,
	rateType text,
	PRIMARY KEY DvRate (__IDDvRate__)
) ;

CREATE TABLE DvRatio (
	__IDDvRatio__ Integer NOT NULL,
	numerator text,
	denominator text,
	PRIMARY KEY DvRatio (__IDDvRatio__)
) ;

CREATE TABLE DvShort (
	__IDDvShort__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvShort (__IDDvShort__)
) ;

CREATE TABLE DvString (
	__IDDvString__ Integer NOT NULL,
	uuid text,
	language text,
	dv text,
	PRIMARY KEY DvString (__IDDvString__)
) ;

CREATE TABLE DvTemporal (
	__IDDvTemporal__ Integer NOT NULL,
	PRIMARY KEY DvTemporal (__IDDvTemporal__)
) ;

CREATE TABLE DvTime (
	__IDDvTime__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvTime (__IDDvTime__)
) ;

CREATE TABLE DvToken (
	__IDDvToken__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvToken (__IDDvToken__)
) ;

CREATE TABLE DvUnsignedByte (
	__IDDvUnsignedByte__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvUnsignedByte (__IDDvUnsignedByte__)
) ;

CREATE TABLE DvUnsignedInt (
	__IDDvUnsignedInt__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvUnsignedInt (__IDDvUnsignedInt__)
) ;

CREATE TABLE DvUnsignedLong (
	__IDDvUnsignedLong__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvUnsignedLong (__IDDvUnsignedLong__)
) ;

CREATE TABLE DvUnsignedShort (
	__IDDvUnsignedShort__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvUnsignedShort (__IDDvUnsignedShort__)
) ;

CREATE TABLE DvURI (
	__IDDvURI__ Integer NOT NULL,
	dv text,
	PRIMARY KEY DvURI (__IDDvURI__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE EntityRef (
	__IDEntityRef__ Integer NOT NULL,
	PRIMARY KEY EntityRef (__IDEntityRef__)
) ;

CREATE TABLE Entry (
	__IDEntry__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Entry (__IDEntry__)
) ;

CREATE TABLE Evaluation (
	__IDEvaluation__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Evaluation (__IDEvaluation__)
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Event (__IDEvent__)
) ;

CREATE TABLE EventContext (
	__IDEventContext__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY EventContext (__IDEventContext__)
) ;

CREATE TABLE ExceptionalValue (
	__IDExceptionalValue__ Integer NOT NULL,
	evName text,
	evMeaning text,
	PRIMARY KEY ExceptionalValue (__IDExceptionalValue__)
) ;

CREATE TABLE FeederAudit (
	__IDFeederAudit__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY FeederAudit (__IDFeederAudit__)
) ;

CREATE TABLE FeederAuditDetails (
	__IDFeederAuditDetails__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY FeederAuditDetails (__IDFeederAuditDetails__)
) ;

CREATE TABLE Folder (
	__IDFolder__ Integer NOT NULL,
	PRIMARY KEY Folder (__IDFolder__)
) ;

CREATE TABLE "Group" (
	__IDGroup__ Integer NOT NULL,
	PRIMARY KEY "Group" (__IDGroup__)
) ;

CREATE TABLE History (
	__IDHistory__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY History (__IDHistory__)
) ;

CREATE TABLE Instruction (
	__IDInstruction__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Instruction (__IDInstruction__)
) ;

CREATE TABLE IntervalEvent (
	__IDIntervalEvent__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY IntervalEvent (__IDIntervalEvent__)
) ;

CREATE TABLE INV (
	__IDINV__ Integer NOT NULL,
	PRIMARY KEY INV (__IDINV__)
) ;

CREATE TABLE Item (
	__IDItem__ Integer NOT NULL,
	PRIMARY KEY Item (__IDItem__)
) ;

CREATE TABLE ItemList (
	__IDItemList__ Integer NOT NULL,
	PRIMARY KEY ItemList (__IDItemList__)
) ;

CREATE TABLE ItemSingle (
	__IDItemSingle__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY ItemSingle (__IDItemSingle__)
) ;

CREATE TABLE ItemStructure (
	__IDItemStructure__ Integer NOT NULL,
	PRIMARY KEY ItemStructure (__IDItemStructure__)
) ;

CREATE TABLE ItemTable (
	__IDItemTable__ Integer NOT NULL,
	PRIMARY KEY ItemTable (__IDItemTable__)
) ;

CREATE TABLE ItemTree (
	__IDItemTree__ Integer NOT NULL,
	PRIMARY KEY ItemTree (__IDItemTree__)
) ;

CREATE TABLE Link (
	__IDLink__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Link (__IDLink__)
) ;

CREATE TABLE Locatable (
	__IDLocatable__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Locatable (__IDLocatable__)
) ;

CREATE TABLE Location (
	__IDLocation__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Location (__IDLocation__)
) ;

CREATE TABLE MetaDataEntry (
	__IDMetaDataEntry__ Integer NOT NULL,
	title text,
	contents text,
	PRIMARY KEY MetaDataEntry (__IDMetaDataEntry__)
) ;

CREATE TABLE MetaDataSet (
	__IDMetaDataSet__ Integer NOT NULL,
	name text,
	PRIMARY KEY MetaDataSet (__IDMetaDataSet__)
) ;

CREATE TABLE MSK (
	__IDMSK__ Integer NOT NULL,
	PRIMARY KEY MSK (__IDMSK__)
) ;

CREATE TABLE NA (
	__IDNA__ Integer NOT NULL,
	PRIMARY KEY NA (__IDNA__)
) ;

CREATE TABLE NASK (
	__IDNASK__ Integer NOT NULL,
	PRIMARY KEY NASK (__IDNASK__)
) ;

CREATE TABLE NAV (
	__IDNAV__ Integer NOT NULL,
	PRIMARY KEY NAV (__IDNAV__)
) ;

CREATE TABLE NI (
	__IDNI__ Integer NOT NULL,
	PRIMARY KEY NI (__IDNI__)
) ;

CREATE TABLE NINF (
	__IDNINF__ Integer NOT NULL,
	PRIMARY KEY NINF (__IDNINF__)
) ;

CREATE TABLE NonHuman (
	__IDNonHuman__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY NonHuman (__IDNonHuman__)
) ;

CREATE TABLE ObjectRef (
	__IDObjectRef__ Integer NOT NULL,
	uuid text,
	namespace text,
	objType text,
	PRIMARY KEY ObjectRef (__IDObjectRef__)
) ;

CREATE TABLE Observation (
	__IDObservation__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Observation (__IDObservation__)
) ;

CREATE TABLE Ontology (
	__IDOntology__ Integer NOT NULL,
	PRIMARY KEY Ontology (__IDOntology__)
) ;

CREATE TABLE OntologyEntry (
	__IDOntologyEntry__ Integer NOT NULL,
	PRIMARY KEY OntologyEntry (__IDOntologyEntry__)
) ;

CREATE TABLE Organization (
	__IDOrganization__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Organization (__IDOrganization__)
) ;

CREATE TABLE OTH (
	__IDOTH__ Integer NOT NULL,
	PRIMARY KEY OTH (__IDOTH__)
) ;

CREATE TABLE Participation (
	__IDParticipation__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Participation (__IDParticipation__)
) ;

CREATE TABLE Party (
	__IDParty__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Party (__IDParty__)
) ;

CREATE TABLE PartyIdentified (
	__IDPartyIdentified__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY PartyIdentified (__IDPartyIdentified__)
) ;

CREATE TABLE PartyProxy (
	__IDPartyProxy__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY PartyProxy (__IDPartyProxy__)
) ;

CREATE TABLE PartyRelated (
	__IDPartyRelated__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY PartyRelated (__IDPartyRelated__)
) ;

CREATE TABLE PartySelf (
	__IDPartySelf__ Integer NOT NULL,
	PRIMARY KEY PartySelf (__IDPartySelf__)
) ;

CREATE TABLE Person (
	__IDPerson__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Person (__IDPerson__)
) ;

CREATE TABLE PINF (
	__IDPINF__ Integer NOT NULL,
	PRIMARY KEY PINF (__IDPINF__)
) ;

CREATE TABLE PointEvent (
	__IDPointEvent__ Integer NOT NULL,
	PRIMARY KEY PointEvent (__IDPointEvent__)
) ;

CREATE TABLE QS (
	__IDQS__ Integer NOT NULL,
	PRIMARY KEY QS (__IDQS__)
) ;

CREATE TABLE ReferenceRange (
	__IDReferenceRange__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY ReferenceRange (__IDReferenceRange__)
) ;

CREATE TABLE Relationship (
	__IDRelationship__ Integer NOT NULL,
	PRIMARY KEY Relationship (__IDRelationship__)
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Role (__IDRole__)
) ;

CREATE TABLE Section (
	__IDSection__ Integer NOT NULL,
	PRIMARY KEY Section (__IDSection__)
) ;

CREATE TABLE Slot (
	__IDSlot__ Integer NOT NULL,
	FOREIGN KEY REFERENCES,
	PRIMARY KEY Slot (__IDSlot__)
) ;

CREATE TABLE TRC (
	__IDTRC__ Integer NOT NULL,
	PRIMARY KEY TRC (__IDTRC__)
) ;

CREATE TABLE UNC (
	__IDUNC__ Integer NOT NULL,
	PRIMARY KEY UNC (__IDUNC__)
) ;

CREATE TABLE UNK (
	__IDUNK__ Integer NOT NULL,
	PRIMARY KEY UNK (__IDUNK__)
) ;
