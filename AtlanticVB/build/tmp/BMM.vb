Namespace BMM

	#Region " Interface MotivationElement "
		Interface MotivationElement
			Property name As [String]

			Property description As [String]
		End Interface
	#End Region

	#Region " Interface Assessment "
		Interface Assessment : Inherits MotivationElement
			Property usingAssessmentUsesUsedAssessment As List(Of [[Assessment]]

			Property assessmentProvidesImpetusForDirective As List(Of [[Directive]]

			Property assessmentIdentifiesPotentialImpact As List(Of [[PotentialImpact]]

			Property assessmentJudgmentOfInfluencer As List(Of [[Influencer]]
		End Interface
	#End Region

	#Region " Interface [End] "
		Interface [End] : Inherits MotivationElement
			
		End Interface
	#End Region

	#Region " Interface Influencer "
		Interface Influencer : Inherits MotivationElement
			
		End Interface
	#End Region

	#Region " Interface InfluencingOrganization "
		Interface InfluencingOrganization : Inherits MotivationElement
			Property influencingOrganizationIsSourceOfInfluencer As List(Of [[Influencer]]
		End Interface
	#End Region

	#Region " Interface Means "
		Interface Means : Inherits MotivationElement
			
		End Interface
	#End Region

	#Region " Interface PotentialImpact "
		Interface PotentialImpact : Inherits MotivationElement
			Property potentialImpactProvidesImpetusForDirective As List(Of [[Directive]]
		End Interface
	#End Region

	#Region " Interface AssessmentCategory "
		Interface AssessmentCategory : Inherits MotivationElement
			Property assessmentCategoryCategoriesAssessment As List(Of [[Assessment]]
		End Interface
	#End Region

	#Region " Interface InfluencerCategory "
		Interface InfluencerCategory : Inherits MotivationElement
			Property influencerCategoryCategorizesInfluencer As List(Of [[Influencer]]
		End Interface
	#End Region

	#Region " Interface OrganizationCategory "
		Interface OrganizationCategory : Inherits MotivationElement
			Property organizationCategoryCategorizesInfluencingOrganization As List(Of [[InfluencingOrganization]]
		End Interface
	#End Region

	#Region " Interface OrganizationUnit "
		Interface OrganizationUnit : Inherits MotivationElement
			Property organizationUnitDefinesEnd As List(Of [[End]]

			Property organizationUnitEstablishesMeans As List(Of [[Means]]

			Property organizationUnitIsResponsibleForAsset As List(Of [[Asset]]

			Property organizationUnitIsResponsibleForLiability As List(Of [[Liability]]

			Property organizationUnitRecognizesInfluencer As List(Of [[Influencer]]

			Property organizationUnitActAsInfluencingOrganization As List(Of [[InfluencingOrganization]]

			Property organizationUnitMakesAssessment As List(Of [[Assessment]]

			Property organizationUnitIsResponsibleForBusinessProcess As List(Of [[BusinessProcess]]
		End Interface
	#End Region

	#Region " Interface BusinessProcess "
		Interface BusinessProcess : Inherits MotivationElement
			Property businessProcessRealizesCourseOfAction As List(Of [[CourseOfAction]]

			Property businessProcessManagerAsset As List(Of [[Asset]]

			Property businessProcessDeliversOfeering As List(Of [[Offering]]
		End Interface
	#End Region

	#Region " Interface Asset "
		Interface Asset : Inherits MotivationElement
			
		End Interface
	#End Region

	#Region " Interface Liability "
		Interface Liability : Inherits MotivationElement
			Property liabilityClaimsResource As List(Of [[Resource]]
		End Interface
	#End Region

	#Region " Interface Resource "
		Interface Resource : Inherits Asset
			
		End Interface
	#End Region

	#Region " Interface Mission "
		Interface Mission : Inherits Means
			Property missionMakesOperativeVision As [[Vision]]
		End Interface
	#End Region

	#Region " Interface CourseOfAction "
		Interface CourseOfAction : Inherits Means
			Property enablingCourseofActionEnablesEnabledCourseOfAction As List(Of [[CourseOfAction]]

			Property broaderCourseofActionIncludesMoreSpecificCourseOfAction As List(Of [[CourseOfAction]]

			Property courseOfActionChanneIsEffortsTowardsDesiredResult As [[DesiredResult]]

			Property courseOfActionDeployAsset As List(Of [[Asset]]

			Property courseOfActionDefiensOffering As List(Of [[Offering]]
		End Interface
	#End Region

	#Region " Interface FixedAsset "
		Interface FixedAsset : Inherits Asset
			Property fixedAssetProvidesResource As List(Of [[Resource]]
		End Interface
	#End Region

	#Region " Interface Offering "
		Interface Offering : Inherits FixedAsset
			Property offeringRequiresResource As List(Of [[Resource]]

			Property offeringUsesFixedAsset As List(Of [[FixedAsset]]
		End Interface
	#End Region

	#Region " Interface Directive "
		Interface Directive : Inherits Means
			Property directiveGovernsCourseOfAction As List(Of [[CourseOfAction]]

			Property directiveIsSourceOfCourseOfAction As List(Of [[CourseOfAction]]

			Property directiveActAsRegulation As List(Of [[Regulation]]

			Property directiveSupportsAchievementOfDesiredResult As List(Of [[DesiredResult]]

			Property directiveGovernsUseOfAsset As List(Of [[Asset]]
		End Interface
	#End Region

	#Region " Interface Strategy "
		Interface Strategy : Inherits Mission
			Property strategyIsAComponentOfThePlanForMission As List(Of [[Mission]]

			Property strategyDeterminesOrganizationUnit As List(Of [[OrganizationUnit]]
		End Interface
	#End Region

	#Region " Interface Tactic "
		Interface Tactic : Inherits CourseOfAction
			Property tacticImplementsStrategy As List(Of [[Strategy]]

			Property tacticEffectsEnforcementLevelOfBusinessRule As List(Of [[BusinessRule]]
		End Interface
	#End Region

	#Region " Interface BusinessRule "
		Interface BusinessRule : Inherits Directive
			Property businessRuleGuidesBusinessProcess As List(Of [[BusinessProcess]]
		End Interface
	#End Region

	#Region " Interface BusinessPolicy "
		Interface BusinessPolicy : Inherits Directive
			Property businessPolicyIsBasisForBusinessRule As List(Of [[BusinessRule]]

			Property broaderBusinessPolicyIncludesMoreSpecificBusinessPolicy As List(Of [[BusinessPolicy]]

			Property businessPolicyGovernsBusinessProcess As List(Of [[BusinessProcess]]
		End Interface
	#End Region

	#Region " Interface Regulation "
		Interface Regulation : Inherits Influencer
			
		End Interface
	#End Region

	#Region " Interface Vision "
		Interface Vision : Inherits [End]
			
		End Interface
	#End Region

	#Region " Interface DesiredResult "
		Interface DesiredResult : Inherits [End]
			Property broaderDesiredResultIncludesMoreSpecificDesiredResult As List(Of [[DesiredResult]]
		End Interface
	#End Region

	#Region " Interface Goal "
		Interface Goal : Inherits DesiredResult
			Property goalAmplidfiesVision As [[Vision]]
		End Interface
	#End Region

	#Region " Interface Objective "
		Interface Objective : Inherits DesiredResult
			Property objectiveQuantifiesGoal As List(Of [[Goal]]
		End Interface
	#End Region

	#Region " Interface PotentialReward "
		Interface PotentialReward : Inherits PotentialImpact
			
		End Interface
	#End Region

	#Region " Interface Risk "
		Interface Risk : Inherits PotentialImpact
			
		End Interface
	#End Region
End Namespace
