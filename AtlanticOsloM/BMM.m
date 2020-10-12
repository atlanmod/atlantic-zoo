module BMM {

	type MotivationElement {
		Name_Att : Text;
		Description_Att : Text;
	};

	type Assessment : MotivationElement {
		UsingAssessmentUsesUsedAssessment_Ref : Assessment*;
		AssessmentProvidesImpetusForDirective_Ref : Directive*;
		AssessmentIdentifiesPotentialImpact_Ref : PotentialImpact*;
		AssessmentJudgmentOfInfluencer_Ref : Influencer+;
	};

	type End : MotivationElement;

	type Influencer : MotivationElement;

	type InfluencingOrganization : MotivationElement {
		InfluencingOrganizationIsSourceOfInfluencer_Ref : Influencer*;
	};

	type Means : MotivationElement;

	type PotentialImpact : MotivationElement {
		PotentialImpactProvidesImpetusForDirective_Ref : Directive*;
	};

	type AssessmentCategory : MotivationElement {
		AssessmentCategoryCategoriesAssessment_Ref : Assessment*;
	};

	type InfluencerCategory : MotivationElement {
		InfluencerCategoryCategorizesInfluencer_Ref : Influencer*;
	};

	type OrganizationCategory : MotivationElement {
		OrganizationCategoryCategorizesInfluencingOrganization_Ref : InfluencingOrganization*;
	};

	type OrganizationUnit : MotivationElement {
		OrganizationUnitDefinesEnd_Ref : End*;
		OrganizationUnitEstablishesMeans_Ref : Means*;
		OrganizationUnitIsResponsibleForAsset_Ref : Asset*;
		OrganizationUnitIsResponsibleForLiability_Ref : Liability*;
		OrganizationUnitRecognizesInfluencer_Ref : Influencer*;
		OrganizationUnitActAsInfluencingOrganization_Ref : InfluencingOrganization*;
		OrganizationUnitMakesAssessment_Ref : Assessment*;
		OrganizationUnitIsResponsibleForBusinessProcess_Ref : BusinessProcess*;
	};

	type BusinessProcess : MotivationElement {
		BusinessProcessRealizesCourseOfAction_Ref : CourseOfAction*;
		BusinessProcessManagerAsset_Ref : Asset*;
		BusinessProcessDeliversOfeering_Ref : Offering*;
	};

	type Asset : MotivationElement;

	type Liability : MotivationElement {
		LiabilityClaimsResource_Ref : Resource*;
	};

	type Resource : Asset;

	type Mission : Means {
		MissionMakesOperativeVision_Ref : Vision?;
	};

	type CourseOfAction : Means {
		EnablingCourseofActionEnablesEnabledCourseOfAction_Ref : CourseOfAction*;
		BroaderCourseofActionIncludesMoreSpecificCourseOfAction_Ref : CourseOfAction*;
		CourseOfActionChanneIsEffortsTowardsDesiredResult_Ref : DesiredResult?;
		CourseOfActionDeployAsset_Ref : Asset*;
		CourseOfActionDefiensOffering_Ref : Offering*;
	};

	type FixedAsset : Asset {
		FixedAssetProvidesResource_Ref : Resource*;
	};

	type Offering : FixedAsset {
		OfferingRequiresResource_Ref : Resource*;
		OfferingUsesFixedAsset_Ref : FixedAsset*;
	};

	type Directive : Means {
		DirectiveGovernsCourseOfAction_Ref : CourseOfAction*;
		DirectiveIsSourceOfCourseOfAction_Ref : CourseOfAction*;
		DirectiveActAsRegulation_Ref : Regulation*;
		DirectiveSupportsAchievementOfDesiredResult_Ref : DesiredResult*;
		DirectiveGovernsUseOfAsset_Ref : Asset*;
	};

	type Strategy : Mission {
		StrategyIsAComponentOfThePlanForMission_Ref : Mission*;
		StrategyDeterminesOrganizationUnit_Ref : OrganizationUnit*;
	};

	type Tactic : CourseOfAction {
		TacticImplementsStrategy_Ref : Strategy*;
		TacticEffectsEnforcementLevelOfBusinessRule_Ref : BusinessRule*;
	};

	type BusinessRule : Directive {
		BusinessRuleGuidesBusinessProcess_Ref : BusinessProcess*;
	};

	type BusinessPolicy : Directive {
		BusinessPolicyIsBasisForBusinessRule_Ref : BusinessRule*;
		BroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy_Ref : BusinessPolicy*;
		BusinessPolicyGovernsBusinessProcess_Ref : BusinessProcess*;
	};

	type Regulation : Influencer;

	type Vision : End;

	type DesiredResult : End {
		BroaderDesiredResultIncludesMoreSpecificDesiredResult_Ref : DesiredResult*;
	};

	type Goal : DesiredResult {
		GoalAmplidfiesVision_Ref : Vision?;
	};

	type Objective : DesiredResult {
		ObjectiveQuantifiesGoal_Ref : Goal*;
	};

	type PotentialReward : PotentialImpact;

	type Risk : PotentialImpact;
}