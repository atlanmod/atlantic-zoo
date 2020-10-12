CREATE TABLE MotivationElement (
	__IDMotivationElement__ Integer NOT NULL,
	name text,
	description text,
	PRIMARY KEY MotivationElement (__IDMotivationElement__)
) ;

CREATE TABLE Assessment (
	__IDAssessment__ Integer NOT NULL,
	PRIMARY KEY Assessment (__IDAssessment__)
) ;

CREATE TABLE End (
	__IDEnd__ Integer NOT NULL,
	PRIMARY KEY End (__IDEnd__)
) ;

CREATE TABLE Influencer (
	__IDInfluencer__ Integer NOT NULL,
	PRIMARY KEY Influencer (__IDInfluencer__)
) ;

CREATE TABLE InfluencingOrganization (
	__IDInfluencingOrganization__ Integer NOT NULL,
	PRIMARY KEY InfluencingOrganization (__IDInfluencingOrganization__)
) ;

CREATE TABLE Means (
	__IDMeans__ Integer NOT NULL,
	PRIMARY KEY Means (__IDMeans__)
) ;

CREATE TABLE PotentialImpact (
	__IDPotentialImpact__ Integer NOT NULL,
	PRIMARY KEY PotentialImpact (__IDPotentialImpact__)
) ;

CREATE TABLE AssessmentCategory (
	__IDAssessmentCategory__ Integer NOT NULL,
	PRIMARY KEY AssessmentCategory (__IDAssessmentCategory__)
) ;

CREATE TABLE InfluencerCategory (
	__IDInfluencerCategory__ Integer NOT NULL,
	PRIMARY KEY InfluencerCategory (__IDInfluencerCategory__)
) ;

CREATE TABLE OrganizationCategory (
	__IDOrganizationCategory__ Integer NOT NULL,
	PRIMARY KEY OrganizationCategory (__IDOrganizationCategory__)
) ;

CREATE TABLE OrganizationUnit (
	__IDOrganizationUnit__ Integer NOT NULL,
	PRIMARY KEY OrganizationUnit (__IDOrganizationUnit__)
) ;

CREATE TABLE BusinessProcess (
	__IDBusinessProcess__ Integer NOT NULL,
	PRIMARY KEY BusinessProcess (__IDBusinessProcess__)
) ;

CREATE TABLE Asset (
	__IDAsset__ Integer NOT NULL,
	PRIMARY KEY Asset (__IDAsset__)
) ;

CREATE TABLE Liability (
	__IDLiability__ Integer NOT NULL,
	PRIMARY KEY Liability (__IDLiability__)
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	PRIMARY KEY Resource (__IDResource__)
) ;

CREATE TABLE Mission (
	__IDMission__ Integer NOT NULL,
	FOREIGN KEY missionMakesOperativeVision (__FKmissionMakesOperativeVision__) REFERENCES Vision (__IDVision__),
	PRIMARY KEY Mission (__IDMission__),
	__FKmissionMakesOperativeVision__ Integer
) ;

CREATE TABLE CourseOfAction (
	__IDCourseOfAction__ Integer NOT NULL,
	FOREIGN KEY courseOfActionChanneIsEffortsTowardsDesiredResult (__FKcourseOfActionChanneIsEffortsTowardsDesiredResult__) REFERENCES DesiredResult (__IDDesiredResult__),
	PRIMARY KEY CourseOfAction (__IDCourseOfAction__),
	__FKcourseOfActionChanneIsEffortsTowardsDesiredResult__ Integer
) ;

CREATE TABLE FixedAsset (
	__IDFixedAsset__ Integer NOT NULL,
	PRIMARY KEY FixedAsset (__IDFixedAsset__)
) ;

CREATE TABLE Offering (
	__IDOffering__ Integer NOT NULL,
	PRIMARY KEY Offering (__IDOffering__)
) ;

CREATE TABLE Directive (
	__IDDirective__ Integer NOT NULL,
	PRIMARY KEY Directive (__IDDirective__)
) ;

CREATE TABLE Strategy (
	__IDStrategy__ Integer NOT NULL,
	PRIMARY KEY Strategy (__IDStrategy__)
) ;

CREATE TABLE Tactic (
	__IDTactic__ Integer NOT NULL,
	PRIMARY KEY Tactic (__IDTactic__)
) ;

CREATE TABLE BusinessRule (
	__IDBusinessRule__ Integer NOT NULL,
	PRIMARY KEY BusinessRule (__IDBusinessRule__)
) ;

CREATE TABLE BusinessPolicy (
	__IDBusinessPolicy__ Integer NOT NULL,
	PRIMARY KEY BusinessPolicy (__IDBusinessPolicy__)
) ;

CREATE TABLE Regulation (
	__IDRegulation__ Integer NOT NULL,
	PRIMARY KEY Regulation (__IDRegulation__)
) ;

CREATE TABLE Vision (
	__IDVision__ Integer NOT NULL,
	PRIMARY KEY Vision (__IDVision__)
) ;

CREATE TABLE DesiredResult (
	__IDDesiredResult__ Integer NOT NULL,
	PRIMARY KEY DesiredResult (__IDDesiredResult__)
) ;

CREATE TABLE Goal (
	__IDGoal__ Integer NOT NULL,
	FOREIGN KEY goalAmplidfiesVision (__FKgoalAmplidfiesVision__) REFERENCES Vision (__IDVision__),
	PRIMARY KEY Goal (__IDGoal__),
	__FKgoalAmplidfiesVision__ Integer
) ;

CREATE TABLE Objective (
	__IDObjective__ Integer NOT NULL,
	PRIMARY KEY Objective (__IDObjective__)
) ;

CREATE TABLE PotentialReward (
	__IDPotentialReward__ Integer NOT NULL,
	PRIMARY KEY PotentialReward (__IDPotentialReward__)
) ;

CREATE TABLE Risk (
	__IDRisk__ Integer NOT NULL,
	PRIMARY KEY Risk (__IDRisk__)
) ;

CREATE TABLE Assessment_usingAssessmentUsesUsedAssessment_Assessment (
	__IDAssessment__ Integer NOT NULL,
	__IDAssessment__ Integer NOT NULL
) ;

CREATE TABLE Assessment_assessmentProvidesImpetusForDirective_Directive (
	__IDAssessment__ Integer NOT NULL,
	__IDDirective__ Integer NOT NULL
) ;

CREATE TABLE Assessment_assessmentIdentifiesPotentialImpact_PotentialImpact (
	__IDAssessment__ Integer NOT NULL,
	__IDPotentialImpact__ Integer NOT NULL
) ;

CREATE TABLE Assessment_assessmentJudgmentOfInfluencer_Influencer (
	__IDAssessment__ Integer NOT NULL,
	__IDInfluencer__ Integer NOT NULL
) ;

CREATE TABLE InfluencingOrganization_influencingOrganizationIsSourceOfInfluencer_Influencer (
	__IDInfluencingOrganization__ Integer NOT NULL,
	__IDInfluencer__ Integer NOT NULL
) ;

CREATE TABLE PotentialImpact_potentialImpactProvidesImpetusForDirective_Directive (
	__IDPotentialImpact__ Integer NOT NULL,
	__IDDirective__ Integer NOT NULL
) ;

CREATE TABLE AssessmentCategory_assessmentCategoryCategoriesAssessment_Assessment (
	__IDAssessmentCategory__ Integer NOT NULL,
	__IDAssessment__ Integer NOT NULL
) ;

CREATE TABLE InfluencerCategory_influencerCategoryCategorizesInfluencer_Influencer (
	__IDInfluencerCategory__ Integer NOT NULL,
	__IDInfluencer__ Integer NOT NULL
) ;

CREATE TABLE OrganizationCategory_organizationCategoryCategorizesInfluencingOrganization_InfluencingOrganization (
	__IDOrganizationCategory__ Integer NOT NULL,
	__IDInfluencingOrganization__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_organizationUnitDefinesEnd_End (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDEnd__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_organizationUnitEstablishesMeans_Means (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDMeans__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_organizationUnitIsResponsibleForAsset_Asset (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDAsset__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_organizationUnitIsResponsibleForLiability_Liability (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDLiability__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_organizationUnitRecognizesInfluencer_Influencer (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDInfluencer__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_organizationUnitActAsInfluencingOrganization_InfluencingOrganization (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDInfluencingOrganization__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_organizationUnitMakesAssessment_Assessment (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDAssessment__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_organizationUnitIsResponsibleForBusinessProcess_BusinessProcess (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDBusinessProcess__ Integer NOT NULL
) ;

CREATE TABLE BusinessProcess_businessProcessRealizesCourseOfAction_CourseOfAction (
	__IDBusinessProcess__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE BusinessProcess_businessProcessManagerAsset_Asset (
	__IDBusinessProcess__ Integer NOT NULL,
	__IDAsset__ Integer NOT NULL
) ;

CREATE TABLE BusinessProcess_businessProcessDeliversOfeering_Offering (
	__IDBusinessProcess__ Integer NOT NULL,
	__IDOffering__ Integer NOT NULL
) ;

CREATE TABLE Liability_liabilityClaimsResource_Resource (
	__IDLiability__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_enablingCourseofActionEnablesEnabledCourseOfAction_CourseOfAction (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_broaderCourseofActionIncludesMoreSpecificCourseOfAction_CourseOfAction (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_courseOfActionDeployAsset_Asset (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDAsset__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_courseOfActionDefiensOffering_Offering (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDOffering__ Integer NOT NULL
) ;

CREATE TABLE FixedAsset_fixedAssetProvidesResource_Resource (
	__IDFixedAsset__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Offering_offeringRequiresResource_Resource (
	__IDOffering__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Offering_offeringUsesFixedAsset_FixedAsset (
	__IDOffering__ Integer NOT NULL,
	__IDFixedAsset__ Integer NOT NULL
) ;

CREATE TABLE Directive_directiveGovernsCourseOfAction_CourseOfAction (
	__IDDirective__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE Directive_directiveIsSourceOfCourseOfAction_CourseOfAction (
	__IDDirective__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE Directive_directiveActAsRegulation_Regulation (
	__IDDirective__ Integer NOT NULL,
	__IDRegulation__ Integer NOT NULL
) ;

CREATE TABLE Directive_directiveSupportsAchievementOfDesiredResult_DesiredResult (
	__IDDirective__ Integer NOT NULL,
	__IDDesiredResult__ Integer NOT NULL
) ;

CREATE TABLE Directive_directiveGovernsUseOfAsset_Asset (
	__IDDirective__ Integer NOT NULL,
	__IDAsset__ Integer NOT NULL
) ;

CREATE TABLE Strategy_strategyIsAComponentOfThePlanForMission_Mission (
	__IDStrategy__ Integer NOT NULL,
	__IDMission__ Integer NOT NULL
) ;

CREATE TABLE Strategy_strategyDeterminesOrganizationUnit_OrganizationUnit (
	__IDStrategy__ Integer NOT NULL,
	__IDOrganizationUnit__ Integer NOT NULL
) ;

CREATE TABLE Tactic_tacticImplementsStrategy_Strategy (
	__IDTactic__ Integer NOT NULL,
	__IDStrategy__ Integer NOT NULL
) ;

CREATE TABLE Tactic_tacticEffectsEnforcementLevelOfBusinessRule_BusinessRule (
	__IDTactic__ Integer NOT NULL,
	__IDBusinessRule__ Integer NOT NULL
) ;

CREATE TABLE BusinessRule_businessRuleGuidesBusinessProcess_BusinessProcess (
	__IDBusinessRule__ Integer NOT NULL,
	__IDBusinessProcess__ Integer NOT NULL
) ;

CREATE TABLE BusinessPolicy_businessPolicyIsBasisForBusinessRule_BusinessRule (
	__IDBusinessPolicy__ Integer NOT NULL,
	__IDBusinessRule__ Integer NOT NULL
) ;

CREATE TABLE BusinessPolicy_broaderBusinessPolicyIncludesMoreSpecificBusinessPolicy_BusinessPolicy (
	__IDBusinessPolicy__ Integer NOT NULL,
	__IDBusinessPolicy__ Integer NOT NULL
) ;

CREATE TABLE BusinessPolicy_businessPolicyGovernsBusinessProcess_BusinessProcess (
	__IDBusinessPolicy__ Integer NOT NULL,
	__IDBusinessProcess__ Integer NOT NULL
) ;

CREATE TABLE DesiredResult_broaderDesiredResultIncludesMoreSpecificDesiredResult_DesiredResult (
	__IDDesiredResult__ Integer NOT NULL,
	__IDDesiredResult__ Integer NOT NULL
) ;

CREATE TABLE Objective_objectiveQuantifiesGoal_Goal (
	__IDObjective__ Integer NOT NULL,
	__IDGoal__ Integer NOT NULL
) ;
