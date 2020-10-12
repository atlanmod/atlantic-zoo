( declare BMM_MotivationElement )
( declare BMM_Assessment )
( declare BMM_End )
( declare BMM_Influencer )
( declare BMM_InfluencingOrganization )
( declare BMM_Means )
( declare BMM_PotentialImpact )
( declare BMM_AssessmentCategory )
( declare BMM_InfluencerCategory )
( declare BMM_OrganizationCategory )
( declare BMM_OrganizationUnit )
( declare BMM_BusinessProcess )
( declare BMM_Asset )
( declare BMM_Liability )
( declare BMM_Resource )
( declare BMM_Mission )
( declare BMM_CourseOfAction )
( declare BMM_FixedAsset )
( declare BMM_Offering )
( declare BMM_Directive )
( declare BMM_Strategy )
( declare BMM_Tactic )
( declare BMM_BusinessRule )
( declare BMM_BusinessPolicy )
( declare BMM_Regulation )
( declare BMM_Vision )
( declare BMM_DesiredResult )
( declare BMM_Goal )
( declare BMM_Objective )
( declare BMM_PotentialReward )
( declare BMM_Risk )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Double )
( def BMM ( struct-map
	KM3_Package
	:contents[( def BMM_MotivationElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BMM_MotivationElement
			:type String
			:location "12:3-12:27"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BMM_MotivationElement
			:type String
			:location "13:3-13:34"
		)]
	) ) ( def BMM_Assessment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "usingAssessmentUsesUsedAssessment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Assessment
			:type BMM_Assessment
			:location "17:3-17:62"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "assessmentProvidesImpetusForDirective"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Assessment
			:type BMM_Directive
			:location "18:3-18:65"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "assessmentIdentifiesPotentialImpact"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Assessment
			:type BMM_PotentialImpact
			:location "19:3-19:69"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "assessmentJudgmentOfInfluencer"
			:upper -1
			:lower 1
			:isOrdered false
			:owner BMM_Assessment
			:type BMM_Influencer
			:location "20:3-20:61"
			:isContainer false
		)]
	) ) ( def BMM_End ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[]
	) ) ( def BMM_Influencer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[]
	) ) ( def BMM_InfluencingOrganization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "influencingOrganizationIsSourceOfInfluencer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_InfluencingOrganization
			:type BMM_Influencer
			:location "29:3-29:72"
			:isContainer false
		)]
	) ) ( def BMM_Means ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[]
	) ) ( def BMM_PotentialImpact ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "potentialImpactProvidesImpetusForDirective"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_PotentialImpact
			:type BMM_Directive
			:location "35:3-35:70"
			:isContainer false
		)]
	) ) ( def BMM_AssessmentCategory ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "assessmentCategoryCategoriesAssessment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_AssessmentCategory
			:type BMM_Assessment
			:location "39:3-39:67"
			:isContainer false
		)]
	) ) ( def BMM_InfluencerCategory ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "influencerCategoryCategorizesInfluencer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_InfluencerCategory
			:type BMM_Influencer
			:location "43:3-43:68"
			:isContainer false
		)]
	) ) ( def BMM_OrganizationCategory ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "organizationCategoryCategorizesInfluencingOrganization"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_OrganizationCategory
			:type BMM_InfluencingOrganization
			:location "47:3-47:96"
			:isContainer false
		)]
	) ) ( def BMM_OrganizationUnit ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "organizationUnitDefinesEnd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_OrganizationUnit
			:type BMM_End
			:location "51:3-51:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organizationUnitEstablishesMeans"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_OrganizationUnit
			:type BMM_Means
			:location "52:3-52:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organizationUnitIsResponsibleForAsset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_OrganizationUnit
			:type BMM_Asset
			:location "53:3-53:61"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organizationUnitIsResponsibleForLiability"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_OrganizationUnit
			:type BMM_Liability
			:location "54:3-54:69"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organizationUnitRecognizesInfluencer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_OrganizationUnit
			:type BMM_Influencer
			:location "55:3-55:65"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organizationUnitActAsInfluencingOrganization"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_OrganizationUnit
			:type BMM_InfluencingOrganization
			:location "56:3-56:86"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organizationUnitMakesAssessment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_OrganizationUnit
			:type BMM_Assessment
			:location "57:3-57:60"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organizationUnitIsResponsibleForBusinessProcess"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_OrganizationUnit
			:type BMM_BusinessProcess
			:location "58:3-58:81"
			:isContainer false
		)]
	) ) ( def BMM_BusinessProcess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "businessProcessRealizesCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_BusinessProcess
			:type BMM_CourseOfAction
			:location "62:3-62:70"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "businessProcessManagerAsset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_BusinessProcess
			:type BMM_Asset
			:location "63:3-63:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "businessProcessDeliversOfeering"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_BusinessProcess
			:type BMM_Offering
			:location "64:3-64:58"
			:isContainer false
		)]
	) ) ( def BMM_Asset ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[]
	) ) ( def BMM_Liability ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "liabilityClaimsResource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Liability
			:type BMM_Resource
			:location "70:3-70:50"
			:isContainer false
		)]
	) ) ( def BMM_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_Asset]
		:structuralFeatures[]
	) ) ( def BMM_Mission ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_Means]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "missionMakesOperativeVision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BMM_Mission
			:type BMM_Vision
			:location "76:3-76:54"
			:isContainer false
		)]
	) ) ( def BMM_CourseOfAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_Means]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enablingCourseofActionEnablesEnabledCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_CourseOfAction
			:type BMM_CourseOfAction
			:location "80:3-80:83"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "broaderCourseofActionIncludesMoreSpecificCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_CourseOfAction
			:type BMM_CourseOfAction
			:location "81:3-81:88"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "courseOfActionChanneIsEffortsTowardsDesiredResult"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BMM_CourseOfAction
			:type BMM_DesiredResult
			:location "82:3-82:83"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "courseOfActionDeployAsset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_CourseOfAction
			:type BMM_Asset
			:location "84:3-84:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "courseOfActionDefiensOffering"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_CourseOfAction
			:type BMM_Offering
			:location "85:3-85:56"
			:isContainer false
		)]
	) ) ( def BMM_FixedAsset ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_Asset]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fixedAssetProvidesResource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_FixedAsset
			:type BMM_Resource
			:location "89:3-89:53"
			:isContainer false
		)]
	) ) ( def BMM_Offering ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_FixedAsset]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "offeringRequiresResource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Offering
			:type BMM_Resource
			:location "93:3-93:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "offeringUsesFixedAsset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Offering
			:type BMM_FixedAsset
			:location "94:3-94:51"
			:isContainer false
		)]
	) ) ( def BMM_Directive ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_Means]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "directiveGovernsCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Directive
			:type BMM_CourseOfAction
			:location "98:3-98:63"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "directiveIsSourceOfCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Directive
			:type BMM_CourseOfAction
			:location "99:3-99:66"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "directiveActAsRegulation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Directive
			:type BMM_Regulation
			:location "100:3-100:53"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "directiveSupportsAchievementOfDesiredResult"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Directive
			:type BMM_DesiredResult
			:location "101:3-101:75"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "directiveGovernsUseOfAsset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Directive
			:type BMM_Asset
			:location "103:3-103:50"
			:isContainer false
		)]
	) ) ( def BMM_Strategy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_Mission]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "strategyIsAComponentOfThePlanForMission"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Strategy
			:type BMM_Mission
			:location "107:3-107:65"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "strategyDeterminesOrganizationUnit"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Strategy
			:type BMM_OrganizationUnit
			:location "109:3-109:69"
			:isContainer false
		)]
	) ) ( def BMM_Tactic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_CourseOfAction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tacticImplementsStrategy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Tactic
			:type BMM_Strategy
			:location "113:3-113:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "tacticEffectsEnforcementLevelOfBusinessRule"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Tactic
			:type BMM_BusinessRule
			:location "114:3-114:74"
			:isContainer false
		)]
	) ) ( def BMM_BusinessRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_Directive]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "businessRuleGuidesBusinessProcess"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_BusinessRule
			:type BMM_BusinessProcess
			:location "118:3-118:67"
			:isContainer false
		)]
	) ) ( def BMM_BusinessPolicy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_Directive]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "businessPolicyIsBasisForBusinessRule"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_BusinessPolicy
			:type BMM_BusinessRule
			:location "122:3-122:67"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "broaderBusinessPolicyIncludesMoreSpecificBusinessPolicy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_BusinessPolicy
			:type BMM_BusinessPolicy
			:location "123:3-123:88"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "businessPolicyGovernsBusinessProcess"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_BusinessPolicy
			:type BMM_BusinessProcess
			:location "125:3-125:70"
			:isContainer false
		)]
	) ) ( def BMM_Regulation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_Influencer]
		:structuralFeatures[]
	) ) ( def BMM_Vision ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_End]
		:structuralFeatures[]
	) ) ( def BMM_DesiredResult ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_End]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "broaderDesiredResultIncludesMoreSpecificDesiredResult"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_DesiredResult
			:type BMM_DesiredResult
			:location "133:3-133:85"
			:isContainer false
		)]
	) ) ( def BMM_Goal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_DesiredResult]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "goalAmplidfiesVision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BMM_Goal
			:type BMM_Vision
			:location "137:3-137:47"
			:isContainer false
		)]
	) ) ( def BMM_Objective ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_DesiredResult]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectiveQuantifiesGoal"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BMM_Objective
			:type BMM_Goal
			:location "141:3-141:47"
			:isContainer false
		)]
	) ) ( def BMM_PotentialReward ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_PotentialImpact]
		:structuralFeatures[]
	) ) ( def BMM_Risk ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BMM_PotentialImpact]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "153:2-153:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "154:2-154:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "155:2-155:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "156:2-156:18"
	) )]
) )
