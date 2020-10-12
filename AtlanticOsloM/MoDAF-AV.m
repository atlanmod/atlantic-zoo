module MoDAF {

	type Element {
		Name_Att : Text;
		Content_Att : Text;
	};

	type MoDAFModel : Element {
		Enterprise_ContRef : Enterprise;
		Environment_ContRef : Environment;
		OperationalMissions_ContRef : OperationalMission+;
		Architectures_ContRef : Architecture+;
		ArchitecturalDescription_ContRef : ArchitecturalDescription+;
		ArchitecturalReferences_ContRef : ArchitecturalReference+;
		ArchitecturalFrameworks_ContRef : ArchitecturalFramework+;
		ArchitectureMetadatas_ContRef : ArchitectureMetaData*;
		MetaDatas_ContRef : MetaData*;
		Stakeholders_ContRef : Stakeholder+;
		StakeholderHasConcerns_ContRef : StakeholderHasConcern+;
	};

	type Enterprise : Element {
		Inhabits_Ref : Environment;
		Fulfills_Ref : OperationalMission+;
	};

	type Environment : ClassifiedElement {
		Influences_Ref : Enterprise;
	};

	type OperationalMission : Element;

	type Architecture : Element {
		Enterprise_Ref : Enterprise;
		DescribedBy_Ref : ArchitecturalDescription;
	};

	type ArchitecturalDescription : Element {
		ApprovialAuthority_Att : Text;
		Architect_Att : Text;
		AssumptionAndConstraints_Att : Text;
		CreatingOrganisation_Att : Text;
		DateCompleted_Att : Text;
		Purpose_Att : Text;
		Recommendations_Att : Text;
		SummaryOfFindings_Att : Text;
		TollsUsed_Att : Text;
		Viewpoints_Ref : View+;
		Products_ContRef : ArchitecturalProduct+;
		Taxonomy_Ref : Taxonomy;
	};

	type ArchitecturalReference : Element {
		Referred_Ref : ArchitecturalDescription;
		Referrer_Ref : ArchitecturalDescription;
	};

	type ArchitecturalProduct : Element {
		Description_Att : Text;
		ArchitecturalElements_ContRef : Elements+;
		DefiningView_Ref : View;
		Addresses_Ref : Concern*;
	};

	type Elements : Element;

	type ArchitecturalFramework : Element {
		OwnedMember_ContRef : View+;
	};

	type View : Element {
		Framework_Att : Text;
		FrameworkWebsite_Att : Text;
		ViewCode_Att : Text;
		ViewDescription_Att : Text;
		ViewName_Att : Text;
		DefiningFramework_Ref : ArchitecturalFramework;
		UsedToCover_ContRef : Concern*;
	};

	type Concern : Element {
		AdressedBy_Ref : ArchitecturalProduct*;
	};

	type StakeholderHasConcern {
		Client_Ref : Stakeholder;
		Supplier_Ref : Concern;
		Owner_Ref : MoDAFModel;
	};

	type Stakeholder : Element;

	type MetaData {
		DublinCoreElement_Att : Text;
		ModMetaDataElement_Att : Text;
		Name_Att : Text;
		Body_Att : Text;
	};

	type ArchitectureMetaData : MetaData {
		AnnotatedArchitecture_Ref : ArchitecturalDescription;
	};

	type Taxonomy : Element {
		Date_Att : Text;
		Url_Att : Text;
		Version_Att : Text;
		Contents_ContRef : ClassifiedElement*;
	};

	type ClassifiedElement : Element {
		Taxonomy_Ref : Taxonomy;
	};

	type Standard : ClassifiedElement {
		Identifier_Att : Text;
		PublishedWebsite_Att : Text;
		Publisher_Att : Text;
		RatificationDate_ContRef : TimeExpression;
		Version_Att : Text;
		WithdrawalDate_ContRef : TimeExpression;
	};

	type MeasurableProperty : ClassifiedElement {
		MaxValue_ContRef : LiteralSpecification?;
		MinValue_ContRef : LiteralSpecification?;
	};

	type CapabilityRequirement : ClassifiedElement;

	type Effect : ClassifiedElement;

	type EnduringTask : ClassifiedElement;

	type OperationalConstraint : ClassifiedElement {
		NodeUsageContext_ContRef : Property?;
	};

	type PostType : ClassifiedElement;

	type OrganisationType : ClassifiedElement;

	type RoleInOrganisation : ClassifiedElement;

	type LocationType : ClassifiedElement;

	type OperationalActivity : ClassifiedElement;

	type Node : ClassifiedElement;

	type InformationExchange : ClassifiedElement {
		Identifier_Att : Text;
		RequirementText_Att : Text;
	};

	type Competence : ClassifiedElement;

	type InformationElement : ClassifiedElement;

	type NodeConnectionType : ClassifiedElement;

	type System : ClassifiedElement;

	type DataElement : ClassifiedElement;

	type SystemFunction : ClassifiedElement {
		SystemUsageContext_ContRef : Property;
	};

	type SystemConnectionSpecification : ClassifiedElement;

	type ProjectType : ClassifiedElement;

	type Service : ClassifiedElement;

	type Unit : ClassifiedElement;

	type Dimension : ClassifiedElement;

	type OrganisationProjectRelationship : ClassifiedElement;

	type ProjectThreadType : ClassifiedElement;

	type TimeExpression {
		Value_Att : Text;
	};

	type LiteralSpecification {
		Value_Att : Text;
	};

	type Property {
		Value_Att : Text;
	};
}