module Bmm {

	type Assessment : MotivationElement {
		MotivatedDirective_Ref : Directive*;
		AffectedEnd_Ref : End*;
		JudgedInfluencer_Ref : Influencer+;
		AssessingOrganizationUnit_Ref : OrganizationUnit;
		AffectedMeans_Ref : Means*;
		IdentifiedPotentialImpact_Ref : PotentialImpact*;
		UsedAssessment_Ref : Assessment*;
		UsingAssessment_Ref : Assessment*;
		CategorizingAssessmentCategory_Ref : AssessmentCategory*;
	};

	type MotivationElement {
		Name_Att : Text;
		Description_Att : Text;
	};

	type Directive : Means {
		SupportedDesiredResult_Ref : DesiredResult*;
		GovernedCourseOfAction_Ref : CourseOfAction*;
		DerivedCourseOfAction_Ref : CourseOfAction*;
		GovernedAsset_Ref : Asset*;
		MotivatingPotentialImpact_Ref : PotentialImpact*;
		DirectiveRegulation_Ref : Regulation*;
		MotivatingAssessment_Ref : Assessment*;
	};

	type Means : MotivationElement {
		EstablishingOrganizationUnit_Ref : OrganizationUnit*;
		JudgingAssessment_Ref : Assessment*;
	};

	type OrganizationUnit : MotivationElement {
		DefinedEnd_Ref : End*;
		ManagedBusinessProces_Ref : BusinessProcess*;
		ManagedLiability_Ref : Liability*;
		ManagedAsset_Ref : Asset*;
		DeterminingStrategy_Ref : Strategy*;
		RecognizedInfluencer_Ref : Influencer*;
		InternalInfluencingOrganization_Ref : InfluencingOrganization*;
		MadeAssessment_Ref : Assessment*;
		EstablishedMeans_Ref : Means*;
	};

	type End : MotivationElement {
		JudgingAssessment_Ref : Assessment*;
		DefiningOrganizationUnit_Ref : OrganizationUnit*;
	};

	type BusinessProcess : MotivationElement {
		DeliveredOffering_Ref : Offering*;
		RealizedCourseOfAction_Ref : CourseOfAction*;
		ManagedAsset_Ref : Asset*;
		GoverningBusinessPolicy_Ref : BusinessPolicy*;
		GuidingBusinessRule_Ref : BusinessRule;
		ResponsibleOrganizationUnit_Ref : OrganizationUnit*;
	};

	type Offering : FixedAsset, Asset {
		DefiningCourseOfAction_Ref : CourseOfAction*;
		UsedAsset_Ref : FixedAsset*;
		RequiredResource_Ref : Resource*;
		DeliveringBusinessProcess_Ref : BusinessProcess*;
	};

	type Asset : MotivationElement {
		DeployingCourseOfAction_Ref : CourseOfAction*;
		GoverningDirective_Ref : Directive*;
		ResponsibleOrganizationUnit_Ref : OrganizationUnit*;
		ManagingBusinessProcess_Ref : BusinessProcess*;
	};

	type CourseOfAction : Means {
		EnabledCourseOfAction_Ref : CourseOfAction*;
		EnablingCourseOfAction_Ref : CourseOfAction*;
		MoreSpecficCourseOfAction_Ref : CourseOfAction*;
		BroaderCourseOfAction_Ref : CourseOfAction*;
		SupportedDesiredResult_Ref : DesiredResult*;
		DefinedOffering_Ref : Offering*;
		DischargedLiability_Ref : Liability*;
		RealizingBusinessProcess_Ref : BusinessProcess;
		GoverningDirective_Ref : Directive*;
		BaseDirective_Ref : Directive*;
		DeployedAsset_Ref : Asset*;
	};

	type DesiredResult : End {
		MoreSpecificDesiredResult_Ref : DesiredResult*;
		BroaderDesiredResult_Ref : DesiredResult*;
		SupportingDirective_Ref : Directive*;
		SupportingCourseOfAction_Ref : CourseOfAction*;
	};

	type Liability : MotivationElement {
		ClaimedResource_Ref : Resource*;
		ResponsibleOrganizationUnit_Ref : OrganizationUnit*;
		DischargingCourseOfAction_Ref : CourseOfAction*;
	};

	type Resource : Asset {
		ProvidingFixedAsset_Ref : FixedAsset*;
		RequiringOffering_Ref : Offering*;
		ClaimingLiability_Ref : Liability*;
	};

	type FixedAsset : Asset {
		UsingOffering_Ref : Offering*;
		ProvidedResource_Ref : Resource*;
	};

	type BusinessPolicy : Directive {
		MoreSpecificBusinessPolicy_Ref : BusinessPolicy*;
		BroaderBusinessPolicy_Ref : BusinessPolicy*;
		DerivedBusinessRule_Ref : BusinessRule*;
		GovernedBusinessProcess_Ref : BusinessProcess*;
	};

	type BusinessRule : Directive {
		EffectingTactic_Ref : Tactic*;
		GuidedBusinessProcess_Ref : BusinessProcess*;
		BaseBusinessPolicy_Ref : BusinessPolicy*;
	};

	type Tactic : CourseOfAction {
		ImplementedStrategy_Ref : Strategy*;
		EnforcedBusinessRule_Ref : BusinessRule*;
	};

	type Strategy : CourseOfAction {
		DeterminedOrganizationUnit_Ref : OrganizationUnit*;
		PlannedMission_Ref : Mission*;
		ImplementingTactic_Ref : Tactic*;
	};

	type Mission : Means {
		OperativeVision_Ref : Vision?;
		ComponentStrategy_Ref : Strategy*;
	};

	type Vision : End {
		AmplifyingGoal_Ref : Goal*;
		DeliveringMission_Ref : Mission*;
	};

	type Goal : DesiredResult {
		QuantifyingObjective_Ref : Objective*;
		AmplifiedVision_Ref : Vision?;
	};

	type Objective : DesiredResult {
		QuantifiedGoal_Ref : Goal*;
	};

	type Influencer : MotivationElement {
		CategorizingInfluencerCategory_Ref : InfluencerCategory*;
		SourceInfluencingOrganization_Ref : InfluencingOrganization*;
		JudgingAssessment_Ref : Assessment*;
		RecognizingOrganizationUnit_Ref : OrganizationUnit+;
	};

	type InfluencerCategory : MotivationElement {
		CategorizedInfluencer_Ref : Influencer*;
	};

	type InfluencingOrganization : MotivationElement {
		CategorizingOrganizationCategory_Ref : OrganizationCategory*;
		InfluencingOrganizationUnit_Ref : OrganizationUnit?;
		ProvidedInfluencer_Ref : Influencer*;
	};

	type OrganizationCategory : MotivationElement {
		CategorizedInfluencingOrganization_Ref : InfluencingOrganization*;
	};

	type PotentialImpact : MotivationElement {
		IdentifyingAssessment_Ref : Assessment*;
		MotivatedDirective_Ref : Directive*;
	};

	type Regulation : Influencer {
		RegulatingDirective_Ref : Directive?;
	};

	type AssessmentCategory : MotivationElement {
		CategorizedAssessment_Ref : Assessment*;
	};

	type PotentialReward : PotentialImpact;

	type Risk : PotentialImpact;
}