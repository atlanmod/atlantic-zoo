CREATE TABLE Assessment (
	__IDAssessment__ Integer NOT NULL,
	FOREIGN KEY assessingOrganizationUnit (__FKassessingOrganizationUnit__) REFERENCES OrganizationUnit (__IDOrganizationUnit__),
	PRIMARY KEY Assessment (__IDAssessment__),
	__FKassessingOrganizationUnit__ Integer
) ;

CREATE TABLE MotivationElement (
	__IDMotivationElement__ Integer NOT NULL,
	name text,
	description text,
	PRIMARY KEY MotivationElement (__IDMotivationElement__)
) ;

CREATE TABLE Directive (
	__IDDirective__ Integer NOT NULL,
	PRIMARY KEY Directive (__IDDirective__)
) ;

CREATE TABLE Means (
	__IDMeans__ Integer NOT NULL,
	PRIMARY KEY Means (__IDMeans__)
) ;

CREATE TABLE OrganizationUnit (
	__IDOrganizationUnit__ Integer NOT NULL,
	PRIMARY KEY OrganizationUnit (__IDOrganizationUnit__)
) ;

CREATE TABLE End (
	__IDEnd__ Integer NOT NULL,
	PRIMARY KEY End (__IDEnd__)
) ;

CREATE TABLE BusinessProcess (
	__IDBusinessProcess__ Integer NOT NULL,
	FOREIGN KEY guidingBusinessRule (__FKguidingBusinessRule__) REFERENCES BusinessRule (__IDBusinessRule__),
	PRIMARY KEY BusinessProcess (__IDBusinessProcess__),
	__FKguidingBusinessRule__ Integer
) ;

CREATE TABLE Offering (
	__IDOffering__ Integer NOT NULL,
	PRIMARY KEY Offering (__IDOffering__)
) ;

CREATE TABLE Asset (
	__IDAsset__ Integer NOT NULL,
	PRIMARY KEY Asset (__IDAsset__)
) ;

CREATE TABLE CourseOfAction (
	__IDCourseOfAction__ Integer NOT NULL,
	FOREIGN KEY realizingBusinessProcess (__FKrealizingBusinessProcess__) REFERENCES BusinessProcess (__IDBusinessProcess__),
	PRIMARY KEY CourseOfAction (__IDCourseOfAction__),
	__FKrealizingBusinessProcess__ Integer
) ;

CREATE TABLE DesiredResult (
	__IDDesiredResult__ Integer NOT NULL,
	PRIMARY KEY DesiredResult (__IDDesiredResult__)
) ;

CREATE TABLE Liability (
	__IDLiability__ Integer NOT NULL,
	PRIMARY KEY Liability (__IDLiability__)
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	PRIMARY KEY Resource (__IDResource__)
) ;

CREATE TABLE FixedAsset (
	__IDFixedAsset__ Integer NOT NULL,
	PRIMARY KEY FixedAsset (__IDFixedAsset__)
) ;

CREATE TABLE BusinessPolicy (
	__IDBusinessPolicy__ Integer NOT NULL,
	PRIMARY KEY BusinessPolicy (__IDBusinessPolicy__)
) ;

CREATE TABLE BusinessRule (
	__IDBusinessRule__ Integer NOT NULL,
	PRIMARY KEY BusinessRule (__IDBusinessRule__)
) ;

CREATE TABLE Tactic (
	__IDTactic__ Integer NOT NULL,
	PRIMARY KEY Tactic (__IDTactic__)
) ;

CREATE TABLE Strategy (
	__IDStrategy__ Integer NOT NULL,
	PRIMARY KEY Strategy (__IDStrategy__)
) ;

CREATE TABLE Mission (
	__IDMission__ Integer NOT NULL,
	FOREIGN KEY operativeVision (__FKoperativeVision__) REFERENCES Vision (__IDVision__),
	PRIMARY KEY Mission (__IDMission__),
	__FKoperativeVision__ Integer
) ;

CREATE TABLE Vision (
	__IDVision__ Integer NOT NULL,
	PRIMARY KEY Vision (__IDVision__)
) ;

CREATE TABLE Goal (
	__IDGoal__ Integer NOT NULL,
	FOREIGN KEY amplifiedVision (__FKamplifiedVision__) REFERENCES Vision (__IDVision__),
	PRIMARY KEY Goal (__IDGoal__),
	__FKamplifiedVision__ Integer
) ;

CREATE TABLE Objective (
	__IDObjective__ Integer NOT NULL,
	PRIMARY KEY Objective (__IDObjective__)
) ;

CREATE TABLE Influencer (
	__IDInfluencer__ Integer NOT NULL,
	PRIMARY KEY Influencer (__IDInfluencer__)
) ;

CREATE TABLE InfluencerCategory (
	__IDInfluencerCategory__ Integer NOT NULL,
	PRIMARY KEY InfluencerCategory (__IDInfluencerCategory__)
) ;

CREATE TABLE InfluencingOrganization (
	__IDInfluencingOrganization__ Integer NOT NULL,
	FOREIGN KEY influencingOrganizationUnit (__FKinfluencingOrganizationUnit__) REFERENCES OrganizationUnit (__IDOrganizationUnit__),
	PRIMARY KEY InfluencingOrganization (__IDInfluencingOrganization__),
	__FKinfluencingOrganizationUnit__ Integer
) ;

CREATE TABLE OrganizationCategory (
	__IDOrganizationCategory__ Integer NOT NULL,
	PRIMARY KEY OrganizationCategory (__IDOrganizationCategory__)
) ;

CREATE TABLE PotentialImpact (
	__IDPotentialImpact__ Integer NOT NULL,
	PRIMARY KEY PotentialImpact (__IDPotentialImpact__)
) ;

CREATE TABLE Regulation (
	__IDRegulation__ Integer NOT NULL,
	FOREIGN KEY regulatingDirective (__FKregulatingDirective__) REFERENCES Directive (__IDDirective__),
	PRIMARY KEY Regulation (__IDRegulation__),
	__FKregulatingDirective__ Integer
) ;

CREATE TABLE AssessmentCategory (
	__IDAssessmentCategory__ Integer NOT NULL,
	PRIMARY KEY AssessmentCategory (__IDAssessmentCategory__)
) ;

CREATE TABLE PotentialReward (
	__IDPotentialReward__ Integer NOT NULL,
	PRIMARY KEY PotentialReward (__IDPotentialReward__)
) ;

CREATE TABLE Risk (
	__IDRisk__ Integer NOT NULL,
	PRIMARY KEY Risk (__IDRisk__)
) ;

CREATE TABLE Assessment_motivatedDirective_Directive (
	__IDAssessment__ Integer NOT NULL,
	__IDDirective__ Integer NOT NULL
) ;

CREATE TABLE Assessment_affectedEnd_End (
	__IDAssessment__ Integer NOT NULL,
	__IDEnd__ Integer NOT NULL
) ;

CREATE TABLE Assessment_judgedInfluencer_Influencer (
	__IDAssessment__ Integer NOT NULL,
	__IDInfluencer__ Integer NOT NULL
) ;

CREATE TABLE Assessment_affectedMeans_Means (
	__IDAssessment__ Integer NOT NULL,
	__IDMeans__ Integer NOT NULL
) ;

CREATE TABLE Assessment_identifiedPotentialImpact_PotentialImpact (
	__IDAssessment__ Integer NOT NULL,
	__IDPotentialImpact__ Integer NOT NULL
) ;

CREATE TABLE Assessment_usedAssessment_Assessment (
	__IDAssessment__ Integer NOT NULL,
	__IDAssessment__ Integer NOT NULL
) ;

CREATE TABLE Assessment_usingAssessment_Assessment (
	__IDAssessment__ Integer NOT NULL,
	__IDAssessment__ Integer NOT NULL
) ;

CREATE TABLE Assessment_categorizingAssessmentCategory_AssessmentCategory (
	__IDAssessment__ Integer NOT NULL,
	__IDAssessmentCategory__ Integer NOT NULL
) ;

CREATE TABLE Directive_supportedDesiredResult_DesiredResult (
	__IDDirective__ Integer NOT NULL,
	__IDDesiredResult__ Integer NOT NULL
) ;

CREATE TABLE Directive_governedCourseOfAction_CourseOfAction (
	__IDDirective__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE Directive_derivedCourseOfAction_CourseOfAction (
	__IDDirective__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE Directive_governedAsset_Asset (
	__IDDirective__ Integer NOT NULL,
	__IDAsset__ Integer NOT NULL
) ;

CREATE TABLE Directive_motivatingPotentialImpact_PotentialImpact (
	__IDDirective__ Integer NOT NULL,
	__IDPotentialImpact__ Integer NOT NULL
) ;

CREATE TABLE Directive_directiveRegulation_Regulation (
	__IDDirective__ Integer NOT NULL,
	__IDRegulation__ Integer NOT NULL
) ;

CREATE TABLE Directive_motivatingAssessment_Assessment (
	__IDDirective__ Integer NOT NULL,
	__IDAssessment__ Integer NOT NULL
) ;

CREATE TABLE Means_establishingOrganizationUnit_OrganizationUnit (
	__IDMeans__ Integer NOT NULL,
	__IDOrganizationUnit__ Integer NOT NULL
) ;

CREATE TABLE Means_judgingAssessment_Assessment (
	__IDMeans__ Integer NOT NULL,
	__IDAssessment__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_definedEnd_End (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDEnd__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_managedBusinessProces_BusinessProcess (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDBusinessProcess__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_managedLiability_Liability (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDLiability__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_managedAsset_Asset (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDAsset__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_determiningStrategy_Strategy (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDStrategy__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_recognizedInfluencer_Influencer (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDInfluencer__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_internalInfluencingOrganization_InfluencingOrganization (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDInfluencingOrganization__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_madeAssessment_Assessment (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDAssessment__ Integer NOT NULL
) ;

CREATE TABLE OrganizationUnit_establishedMeans_Means (
	__IDOrganizationUnit__ Integer NOT NULL,
	__IDMeans__ Integer NOT NULL
) ;

CREATE TABLE End_judgingAssessment_Assessment (
	__IDEnd__ Integer NOT NULL,
	__IDAssessment__ Integer NOT NULL
) ;

CREATE TABLE End_definingOrganizationUnit_OrganizationUnit (
	__IDEnd__ Integer NOT NULL,
	__IDOrganizationUnit__ Integer NOT NULL
) ;

CREATE TABLE BusinessProcess_deliveredOffering_Offering (
	__IDBusinessProcess__ Integer NOT NULL,
	__IDOffering__ Integer NOT NULL
) ;

CREATE TABLE BusinessProcess_realizedCourseOfAction_CourseOfAction (
	__IDBusinessProcess__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE BusinessProcess_managedAsset_Asset (
	__IDBusinessProcess__ Integer NOT NULL,
	__IDAsset__ Integer NOT NULL
) ;

CREATE TABLE BusinessProcess_governingBusinessPolicy_BusinessPolicy (
	__IDBusinessProcess__ Integer NOT NULL,
	__IDBusinessPolicy__ Integer NOT NULL
) ;

CREATE TABLE BusinessProcess_responsibleOrganizationUnit_OrganizationUnit (
	__IDBusinessProcess__ Integer NOT NULL,
	__IDOrganizationUnit__ Integer NOT NULL
) ;

CREATE TABLE Offering_definingCourseOfAction_CourseOfAction (
	__IDOffering__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE Offering_usedAsset_FixedAsset (
	__IDOffering__ Integer NOT NULL,
	__IDFixedAsset__ Integer NOT NULL
) ;

CREATE TABLE Offering_requiredResource_Resource (
	__IDOffering__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Offering_deliveringBusinessProcess_BusinessProcess (
	__IDOffering__ Integer NOT NULL,
	__IDBusinessProcess__ Integer NOT NULL
) ;

CREATE TABLE Asset_deployingCourseOfAction_CourseOfAction (
	__IDAsset__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE Asset_governingDirective_Directive (
	__IDAsset__ Integer NOT NULL,
	__IDDirective__ Integer NOT NULL
) ;

CREATE TABLE Asset_responsibleOrganizationUnit_OrganizationUnit (
	__IDAsset__ Integer NOT NULL,
	__IDOrganizationUnit__ Integer NOT NULL
) ;

CREATE TABLE Asset_managingBusinessProcess_BusinessProcess (
	__IDAsset__ Integer NOT NULL,
	__IDBusinessProcess__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_enabledCourseOfAction_CourseOfAction (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_enablingCourseOfAction_CourseOfAction (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_moreSpecficCourseOfAction_CourseOfAction (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_broaderCourseOfAction_CourseOfAction (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_supportedDesiredResult_DesiredResult (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDDesiredResult__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_definedOffering_Offering (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDOffering__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_dischargedLiability_Liability (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDLiability__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_governingDirective_Directive (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDDirective__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_baseDirective_Directive (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDDirective__ Integer NOT NULL
) ;

CREATE TABLE CourseOfAction_deployedAsset_Asset (
	__IDCourseOfAction__ Integer NOT NULL,
	__IDAsset__ Integer NOT NULL
) ;

CREATE TABLE DesiredResult_moreSpecificDesiredResult_DesiredResult (
	__IDDesiredResult__ Integer NOT NULL,
	__IDDesiredResult__ Integer NOT NULL
) ;

CREATE TABLE DesiredResult_broaderDesiredResult_DesiredResult (
	__IDDesiredResult__ Integer NOT NULL,
	__IDDesiredResult__ Integer NOT NULL
) ;

CREATE TABLE DesiredResult_supportingDirective_Directive (
	__IDDesiredResult__ Integer NOT NULL,
	__IDDirective__ Integer NOT NULL
) ;

CREATE TABLE DesiredResult_supportingCourseOfAction_CourseOfAction (
	__IDDesiredResult__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE Liability_claimedResource_Resource (
	__IDLiability__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Liability_responsibleOrganizationUnit_OrganizationUnit (
	__IDLiability__ Integer NOT NULL,
	__IDOrganizationUnit__ Integer NOT NULL
) ;

CREATE TABLE Liability_dischargingCourseOfAction_CourseOfAction (
	__IDLiability__ Integer NOT NULL,
	__IDCourseOfAction__ Integer NOT NULL
) ;

CREATE TABLE Resource_providingFixedAsset_FixedAsset (
	__IDResource__ Integer NOT NULL,
	__IDFixedAsset__ Integer NOT NULL
) ;

CREATE TABLE Resource_requiringOffering_Offering (
	__IDResource__ Integer NOT NULL,
	__IDOffering__ Integer NOT NULL
) ;

CREATE TABLE Resource_claimingLiability_Liability (
	__IDResource__ Integer NOT NULL,
	__IDLiability__ Integer NOT NULL
) ;

CREATE TABLE FixedAsset_usingOffering_Offering (
	__IDFixedAsset__ Integer NOT NULL,
	__IDOffering__ Integer NOT NULL
) ;

CREATE TABLE FixedAsset_providedResource_Resource (
	__IDFixedAsset__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE BusinessPolicy_moreSpecificBusinessPolicy_BusinessPolicy (
	__IDBusinessPolicy__ Integer NOT NULL,
	__IDBusinessPolicy__ Integer NOT NULL
) ;

CREATE TABLE BusinessPolicy_broaderBusinessPolicy_BusinessPolicy (
	__IDBusinessPolicy__ Integer NOT NULL,
	__IDBusinessPolicy__ Integer NOT NULL
) ;

CREATE TABLE BusinessPolicy_derivedBusinessRule_BusinessRule (
	__IDBusinessPolicy__ Integer NOT NULL,
	__IDBusinessRule__ Integer NOT NULL
) ;

CREATE TABLE BusinessPolicy_governedBusinessProcess_BusinessProcess (
	__IDBusinessPolicy__ Integer NOT NULL,
	__IDBusinessProcess__ Integer NOT NULL
) ;

CREATE TABLE BusinessRule_effectingTactic_Tactic (
	__IDBusinessRule__ Integer NOT NULL,
	__IDTactic__ Integer NOT NULL
) ;

CREATE TABLE BusinessRule_guidedBusinessProcess_BusinessProcess (
	__IDBusinessRule__ Integer NOT NULL,
	__IDBusinessProcess__ Integer NOT NULL
) ;

CREATE TABLE BusinessRule_baseBusinessPolicy_BusinessPolicy (
	__IDBusinessRule__ Integer NOT NULL,
	__IDBusinessPolicy__ Integer NOT NULL
) ;

CREATE TABLE Tactic_implementedStrategy_Strategy (
	__IDTactic__ Integer NOT NULL,
	__IDStrategy__ Integer NOT NULL
) ;

CREATE TABLE Tactic_enforcedBusinessRule_BusinessRule (
	__IDTactic__ Integer NOT NULL,
	__IDBusinessRule__ Integer NOT NULL
) ;

CREATE TABLE Strategy_determinedOrganizationUnit_OrganizationUnit (
	__IDStrategy__ Integer NOT NULL,
	__IDOrganizationUnit__ Integer NOT NULL
) ;

CREATE TABLE Strategy_plannedMission_Mission (
	__IDStrategy__ Integer NOT NULL,
	__IDMission__ Integer NOT NULL
) ;

CREATE TABLE Strategy_implementingTactic_Tactic (
	__IDStrategy__ Integer NOT NULL,
	__IDTactic__ Integer NOT NULL
) ;

CREATE TABLE Mission_componentStrategy_Strategy (
	__IDMission__ Integer NOT NULL,
	__IDStrategy__ Integer NOT NULL
) ;

CREATE TABLE Vision_amplifyingGoal_Goal (
	__IDVision__ Integer NOT NULL,
	__IDGoal__ Integer NOT NULL
) ;

CREATE TABLE Vision_deliveringMission_Mission (
	__IDVision__ Integer NOT NULL,
	__IDMission__ Integer NOT NULL
) ;

CREATE TABLE Goal_quantifyingObjective_Objective (
	__IDGoal__ Integer NOT NULL,
	__IDObjective__ Integer NOT NULL
) ;

CREATE TABLE Objective_quantifiedGoal_Goal (
	__IDObjective__ Integer NOT NULL,
	__IDGoal__ Integer NOT NULL
) ;

CREATE TABLE Influencer_categorizingInfluencerCategory_InfluencerCategory (
	__IDInfluencer__ Integer NOT NULL,
	__IDInfluencerCategory__ Integer NOT NULL
) ;

CREATE TABLE Influencer_sourceInfluencingOrganization_InfluencingOrganization (
	__IDInfluencer__ Integer NOT NULL,
	__IDInfluencingOrganization__ Integer NOT NULL
) ;

CREATE TABLE Influencer_judgingAssessment_Assessment (
	__IDInfluencer__ Integer NOT NULL,
	__IDAssessment__ Integer NOT NULL
) ;

CREATE TABLE Influencer_recognizingOrganizationUnit_OrganizationUnit (
	__IDInfluencer__ Integer NOT NULL,
	__IDOrganizationUnit__ Integer NOT NULL
) ;

CREATE TABLE InfluencerCategory_categorizedInfluencer_Influencer (
	__IDInfluencerCategory__ Integer NOT NULL,
	__IDInfluencer__ Integer NOT NULL
) ;

CREATE TABLE InfluencingOrganization_categorizingOrganizationCategory_OrganizationCategory (
	__IDInfluencingOrganization__ Integer NOT NULL,
	__IDOrganizationCategory__ Integer NOT NULL
) ;

CREATE TABLE InfluencingOrganization_providedInfluencer_Influencer (
	__IDInfluencingOrganization__ Integer NOT NULL,
	__IDInfluencer__ Integer NOT NULL
) ;

CREATE TABLE OrganizationCategory_categorizedInfluencingOrganization_InfluencingOrganization (
	__IDOrganizationCategory__ Integer NOT NULL,
	__IDInfluencingOrganization__ Integer NOT NULL
) ;

CREATE TABLE PotentialImpact_identifyingAssessment_Assessment (
	__IDPotentialImpact__ Integer NOT NULL,
	__IDAssessment__ Integer NOT NULL
) ;

CREATE TABLE PotentialImpact_motivatedDirective_Directive (
	__IDPotentialImpact__ Integer NOT NULL,
	__IDDirective__ Integer NOT NULL
) ;

CREATE TABLE AssessmentCategory_categorizedAssessment_Assessment (
	__IDAssessmentCategory__ Integer NOT NULL,
	__IDAssessment__ Integer NOT NULL
) ;
