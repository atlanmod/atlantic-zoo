module Mlhim2 {

	type Action : CareEntry {
		Time_ContRef : DvTemporal?;
		Description_ContRef : ItemStructure;
		IsmTransition_ContRef : DvCodedString?;
		InstructionDetails_ContRef : DvCodedString?;
	};

	type Activity : Locatable {
		Description_ContRef : ItemStructure;
		Timing_ContRef : DvParsable;
		Actions_ContRef : DvToken+;
	};

	type AdminEntry : Entry {
		Data_ContRef : ItemStructure;
	};

	type ASKR : UNK;

	type ASKU : UNK;

	type Attestation : Locatable {
		AttestedView_ContRef : DvMedia?;
		Proof_ContRef : DvParsable;
		Reason_ContRef : DvCodedString;
		Commiter_ContRef : PartyProxy;
		TimeCommited_ContRef : DvTemporal;
		IsPending_ContRef : DvBoolean;
	};

	type CareEntry : Entry {
		Protocol_ContRef : ItemStructure?;
		GuidelineId_ContRef : ObjectRef?;
	};

	type CCD {
		Definition_ContRef : Locatable;
		MetaData_ContRef : MetaDataSet+;
		Ontology_ContRef : Ontology;
	};

	type Cluster : Item {
		Items_ContRef : Item+;
	};

	type Composition : Locatable {
		Attestation_ContRef : Attestation;
		Links_ContRef : Link*;
		Original_ContRef : DvToken?;
		Predecessor_ContRef : DvToken?;
		Created_ContRef : DvTemporal;
		Composer_ContRef : PartyProxy;
		Territory_ContRef : Location?;
		Category_ContRef : DvCodedString?;
		Language_ContRef : DvLanguage;
		Context_ContRef : EventContext;
		Content_ContRef : Locatable;
	};

	type ContentItem : Locatable {
		Links_ContRef : Link*;
		Attestation_ContRef : Attestation?;
	};

	type DataStructure : Locatable;

	type DER : INV;

	type Device : Party {
		Details_ContRef : ItemStructure;
	};

	type DvAny {
		ValidTimeBegin_Att : Logical;
		ValidTimeEnd_Att : Logical;
		Ev_ContRef : ExceptionalValue?;
	};

	type DvBoolean : DvAny {
		Dv_Att : Logical;
	};

	type DvByte : DvNumeric {
		Dv_Att : Logical;
	};

	type DvChar : DvAny;

	type DvCodedString : DvString {
		CodeString_Att : Logical;
		TerminologyName_Att : Logical;
		TerminologyAbbrev_Att : Logical;
	};

	type DvCount : DvQuantified {
		Count_Att : Integer32;
	};

	type DvDate : DvTemporal {
		Dv_Att : Logical;
	};

	type DvDateTime : DvTemporal {
		Dv_Att : Logical;
	};

	type DvDecimal : DvNumeric {
		Dv_Att : Logical;
	};

	type DvDuration : DvTemporal {
		Dv_Att : Logical;
	};

	type DvEncapsulated : DvAny {
		Size_Att : Logical;
		Charset_Att : Logical;
		Language_Att : Logical;
	};

	type DvIdentifier : DvString {
		Issuer_Att : Logical;
		Assigner_Att : Logical;
		Name_Att : Logical;
	};

	type DvInt : DvNumeric {
		Dv_Att : Logical;
	};

	type DvInteger : DvNumeric {
		Dv_Att : Integer32;
	};

	type DvInterval : DvAny {
		Lower_ContRef : DvOrdered?;
		Upper_ContRef : DvOrdered?;
		LowerIncluded_Att : Logical;
		UpperIncluded_Att : Logical;
		LowerUnbounded_Att : Logical;
		UpperUnbounded_Att : Logical;
	};

	type DvLanguage : DvChar {
		Dv_Att : Logical;
	};

	type DvLong : DvNumeric {
		Dv_Att : Logical;
	};

	type DvMedia : DvEncapsulated {
		MimeType_Att : Logical;
		CompressionType_Att : Logical;
		HashResult_Att : Logical;
		HashFunction_Att : Logical;
		Uri_Att : Logical;
		AltText_Att : Logical;
	};

	type DvMediaApp : DvMedia {
		Dv_ContRef : ?;
	};

	type DvMediaAudio : DvMedia {
		Dv_Att : Logical;
	};

	type DvMediaImage : DvMedia {
		Dv_Att : Logical;
	};

	type DvMediaModel : DvMedia {
		Dv_Att : Logical;
	};

	type DvMediaMsg : DvMedia {
		Dv_Att : Logical;
	};

	type DvMediaMultipart : DvMedia {
		Dv_ContRef : ?;
	};

	type DvMediaText : DvMedia {
		Dv_Att : Text;
	};

	type DvMediaVideo : DvMedia {
		Dv_Att : Logical;
	};

	type DvNegativeInteger : DvNumeric {
		Dv_Att : Logical;
	};

	type DvNonNegativeInteger : DvNumeric {
		Dv_Att : Logical;
	};

	type DvNonPositiveInteger : DvNumeric {
		Dv_Att : Logical;
	};

	type DvNormalizedString : DvChar {
		Uuid_Att : Logical;
		Language_Att : Logical;
		Dv_Att : Logical;
	};

	type DvNumeric : DvAny;

	type DvOrdered : DvAny {
		NormalRange_ContRef : DvInterval?;
		OtherReferenceRanges_ContRef : ReferenceRange*;
		NormalStatus_Att : Text;
	};

	type DvOrdinal : DvOrdered {
		Dv_Att : Integer32;
		Symbol_Att : Text;
	};

	type DvParagraph : DvAny {
		Items_ContRef : DvString*;
	};

	type DvParsable : DvEncapsulated {
		Dv_Att : Logical;
		Formalism_Att : Logical;
	};

	type DvPositiveInteger : DvNumeric {
		Dv_Att : Logical;
	};

	type DvProportion : DvRatio {
		ProportionType_Att : Logical;
	};

	type DvQuantified : DvOrdered {
		Magnitude_Att : Logical;
		MagnitudeStatus_Att : Text;
		Error_Att : Logical;
		Accuracy_Att : Logical;
	};

	type DvQuantity : DvQuantified {
		Units_Att : Logical;
	};

	type DvRate : DvRatio {
		RateType_Att : Logical;
	};

	type DvRatio : DvQuantified {
		Numerator_Att : Logical;
		Denominator_Att : Logical;
	};

	type DvShort : DvNumeric {
		Dv_Att : Logical;
	};

	type DvString : DvChar {
		Uuid_Att : Logical;
		Language_Att : Logical;
		Dv_Att : Text;
	};

	type DvTemporal;

	type DvTime : DvTemporal {
		Dv_Att : Logical;
	};

	type DvToken : DvChar {
		Dv_Att : Logical;
	};

	type DvUnsignedByte : DvNumeric {
		Dv_Att : Logical;
	};

	type DvUnsignedInt : DvNumeric {
		Dv_Att : Logical;
	};

	type DvUnsignedLong : DvNumeric {
		Dv_Att : Logical;
	};

	type DvUnsignedShort : DvNumeric {
		Dv_Att : Logical;
	};

	type DvURI : DvAny {
		Dv_Att : Logical;
	};

	type Element : Item {
		Dv_ContRef : DvAny;
	};

	type EntityRef : ObjectRef;

	type Entry : ContentItem {
		Language_ContRef : DvLanguage;
		Encoding_ContRef : DvCodedString?;
		Subject_ContRef : PartyProxy?;
		Provider_ContRef : PartyProxy?;
		OtherParticipations_ContRef : Participation*;
		WorkflowId_ContRef : ObjectRef?;
	};

	type Evaluation : CareEntry {
		Data_ContRef : ItemStructure;
	};

	type Event : Locatable {
		Time_ContRef : DvTemporal;
		Data_ContRef : DvAny;
		State_ContRef : ItemStructure?;
	};

	type EventContext : Locatable {
		HealthcareFacility_ContRef : Organization?;
		StartTime_ContRef : DvTemporal;
		EndTime_ContRef : DvTemporal?;
		Participation_ContRef : Participation?;
		Location_ContRef : Location?;
		Setting_ContRef : DvCodedString?;
	};

	type ExceptionalValue {
		EvName_Att : Text;
		EvMeaning_Att : Text;
	};

	type FeederAudit {
		OriginatingSystemAudit_ContRef : FeederAuditDetails;
		OriginatingSystemItemIds_ContRef : DvIdentifier+;
		FeederSystemAudit_ContRef : FeederAuditDetails;
		FeederSystemIds_ContRef : DvIdentifier+;
		OriginalContent_ContRef : DvEncapsulated;
	};

	type FeederAuditDetails {
		SystemId_ContRef : DvIdentifier;
		VersionId_ContRef : DvNormalizedString?;
		Provider_ContRef : PartyIdentified?;
		Location_ContRef : Location?;
		Time_ContRef : DvTemporal?;
		Subject_ContRef : PartyProxy*;
	};

	type Folder : Locatable {
		Items_ContRef : Composition*;
	};

	type Group : Party {
		Members_ContRef : Party*;
	};

	type History : DataStructure {
		Origin_ContRef : DvTemporal;
		Events_ContRef : Event+;
		Period_ContRef : DvDuration?;
		Duration_ContRef : DvDuration?;
		Summary_ContRef : ItemStructure?;
	};

	type Instruction : CareEntry {
		ExpiryTime_ContRef : DvTemporal?;
		Narrative_ContRef : DvString;
		WfDefinition_ContRef : DvParsable?;
		Activities_ContRef : Activity+;
	};

	type IntervalEvent : Event {
		Width_ContRef : DvDuration;
		MathFunction_ContRef : DvCodedString;
		SampleCount_ContRef : DvCount?;
	};

	type INV : NI;

	type Item : Locatable;

	type ItemList : ItemStructure {
		Items_ContRef : Item*;
	};

	type ItemSingle : ItemStructure {
		Item_ContRef : Item;
	};

	type ItemStructure : DataStructure;

	type ItemTable : ItemStructure {
		Rows_ContRef : Cluster+;
	};

	type ItemTree : ItemStructure {
		Items_ContRef : Item+;
	};

	type Link {
		Relation_ContRef : Relationship;
		Target_ContRef : DvToken;
	};

	type Locatable {
		FeederAudit_ContRef : FeederAudit?;
		Name_ContRef : DvNormalizedString;
		Uuid_ContRef : DvToken;
		Parent_ContRef : DvToken?;
	};

	type Location : Locatable {
		Details_ContRef : ItemStructure;
		Description_ContRef : DvString;
		IsPrimary_ContRef : DvBoolean;
	};

	type MetaDataEntry {
		Title_Att : Text;
		Contents_Att : Text;
	};

	type MetaDataSet {
		Name_Att : Text;
		Entries_ContRef : MetaDataEntry+;
	};

	type MSK : NI;

	type NA : NI;

	type NASK : UNK;

	type NAV : ASKU;

	type NI : ExceptionalValue;

	type NINF : OTH;

	type NonHuman : Party {
		Details_ContRef : ItemStructure;
	};

	type ObjectRef {
		Uuid_Att : Logical;
		Namespace_Att : Logical;
		ObjType_Att : Logical;
	};

	type Observation : CareEntry {
		Data_ContRef : History;
		State_ContRef : History?;
	};

	type Ontology {
		Names_Att : Text;
		InternalVocabularies_Att : Text;
		LookupTables_Att : Text;
		Terminologies_Att : Text;
		GeneralEntries_ContRef : OntologyEntry*;
	};

	type OntologyEntry {
		Contents_Att : Text;
	};

	type Organization : Party {
		Details_ContRef : ItemStructure;
	};

	type OTH : INV;

	type Participation {
		Performer_ContRef : PartyProxy?;
		Function_ContRef : DvCodedString;
		Mode_ContRef : DvCodedString;
		Time_ContRef : DvTemporal;
	};

	type Party : Locatable {
		ValidTimeBegin_ContRef : DvDateTime?;
		ValidTimeEnd_ContRef : DvDateTime?;
		Ev_ContRef : ExceptionalValue?;
		Identifiers_ContRef : DvIdentifier*;
		Roles_ContRef : Role*;
		Relationships_ContRef : Relationship*;
		Locations_ContRef : Location*;
	};

	type PartyIdentified : PartyProxy {
		Name_ContRef : DvString?;
		Identifiers_ContRef : DvIdentifier+;
	};

	type PartyProxy : DvAny {
		ExternalRef_ContRef : EntityRef?;
	};

	type PartyRelated : PartyIdentified {
		Relationship_ContRef : Relationship;
	};

	type PartySelf : PartyProxy;

	type Person : Party {
		Details_ContRef : ItemStructure;
	};

	type PINF : OTH;

	type PointEvent : Event;

	type QS : UNK;

	type ReferenceRange : DvAny {
		Definition_ContRef : DvString;
		DataRange_ContRef : DvInterval;
	};

	type Relationship : Locatable {
		Targets_ContRef : DvToken+;
	};

	type Role : Locatable {
		Details_ContRef : ItemStructure;
		Description_ContRef : DvString;
		IsPrimary_ContRef : DvBoolean;
	};

	type Section : ContentItem {
		Items_ContRef : ContentItem*;
	};

	type Slot : Item {
		Ccd_ContRef : DvToken;
		AllowedCcds_ContRef : DvToken+;
	};

	type TRC : UNK;

	type UNC : INV;

	type UNK : NI;
}