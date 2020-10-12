( declare bmm_Assessment )
( declare bmm_MotivationElement )
( declare bmm_Directive )
( declare bmm_Means )
( declare bmm_OrganizationUnit )
( declare bmm_End )
( declare bmm_BusinessProcess )
( declare bmm_Offering )
( declare bmm_Asset )
( declare bmm_CourseOfAction )
( declare bmm_DesiredResult )
( declare bmm_Liability )
( declare bmm_Resource )
( declare bmm_FixedAsset )
( declare bmm_BusinessPolicy )
( declare bmm_BusinessRule )
( declare bmm_Tactic )
( declare bmm_Strategy )
( declare bmm_Mission )
( declare bmm_Vision )
( declare bmm_Goal )
( declare bmm_Objective )
( declare bmm_Influencer )
( declare bmm_InfluencerCategory )
( declare bmm_InfluencingOrganization )
( declare bmm_OrganizationCategory )
( declare bmm_PotentialImpact )
( declare bmm_Regulation )
( declare bmm_AssessmentCategory )
( declare bmm_PotentialReward )
( declare bmm_Risk )
( declare bmm_String )
( def bmm ( struct-map
	KM3_Package
	:contents[( def bmm_Assessment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "motivatedDirective"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Assessment
			:type bmm_Directive
			:location "12:3-12:79"
			:isContainer false
			:opposite motivatingAssessment
		) ( struct-map
			KM3_Reference
			:name "affectedEnd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Assessment
			:type bmm_End
			:location "13:3-13:63"
			:isContainer false
			:opposite judgingAssessment
		) ( struct-map
			KM3_Reference
			:name "judgedInfluencer"
			:upper -1
			:lower 1
			:isOrdered false
			:owner bmm_Assessment
			:type bmm_Influencer
			:location "14:3-14:77"
			:isContainer false
			:opposite judgingAssessment
		) ( struct-map
			KM3_Reference
			:name "assessingOrganizationUnit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner bmm_Assessment
			:type bmm_OrganizationUnit
			:location "15:3-15:84"
			:isContainer false
			:opposite madeAssessment
		) ( struct-map
			KM3_Reference
			:name "affectedMeans"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Assessment
			:type bmm_Means
			:location "16:3-16:67"
			:isContainer false
			:opposite judgingAssessment
		) ( struct-map
			KM3_Reference
			:name "identifiedPotentialImpact"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Assessment
			:type bmm_PotentialImpact
			:location "17:3-17:93"
			:isContainer false
			:opposite identifyingAssessment
		) ( struct-map
			KM3_Reference
			:name "usedAssessment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Assessment
			:type bmm_Assessment
			:location "18:3-18:71"
			:isContainer false
			:opposite usingAssessment
		) ( struct-map
			KM3_Reference
			:name "usingAssessment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Assessment
			:type bmm_Assessment
			:location "19:3-19:71"
			:isContainer false
			:opposite usedAssessment
		) ( struct-map
			KM3_Reference
			:name "categorizingAssessmentCategory"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Assessment
			:type bmm_AssessmentCategory
			:location "20:3-20:101"
			:isContainer false
			:opposite categorizedAssessment
		)]
	) ) ( def bmm_MotivationElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner bmm_MotivationElement
			:type String
			:location "24:3-24:27"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner bmm_MotivationElement
			:type String
			:location "25:3-25:34"
		)]
	) ) ( def bmm_Directive ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_Means]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "supportedDesiredResult"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Directive
			:type bmm_DesiredResult
			:location "29:3-29:86"
			:isContainer false
			:opposite supportingDirective
		) ( struct-map
			KM3_Reference
			:name "governedCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Directive
			:type bmm_CourseOfAction
			:location "30:3-30:86"
			:isContainer false
			:opposite governingDirective
		) ( struct-map
			KM3_Reference
			:name "derivedCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Directive
			:type bmm_CourseOfAction
			:location "31:3-31:80"
			:isContainer false
			:opposite baseDirective
		) ( struct-map
			KM3_Reference
			:name "governedAsset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Directive
			:type bmm_Asset
			:location "32:3-32:68"
			:isContainer false
			:opposite governingDirective
		) ( struct-map
			KM3_Reference
			:name "motivatingPotentialImpact"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Directive
			:type bmm_PotentialImpact
			:location "33:3-33:90"
			:isContainer false
			:opposite motivatedDirective
		) ( struct-map
			KM3_Reference
			:name "directiveRegulation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Directive
			:type bmm_Regulation
			:location "34:3-34:80"
			:isContainer false
			:opposite regulatingDirective
		) ( struct-map
			KM3_Reference
			:name "motivatingAssessment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Directive
			:type bmm_Assessment
			:location "35:3-35:80"
			:isContainer false
			:opposite motivatedDirective
		)]
	) ) ( def bmm_Means ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "establishingOrganizationUnit"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Means
			:type bmm_OrganizationUnit
			:location "39:3-39:92"
			:isContainer false
			:opposite establishedMeans
		) ( struct-map
			KM3_Reference
			:name "judgingAssessment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Means
			:type bmm_Assessment
			:location "40:3-40:72"
			:isContainer false
			:opposite affectedMeans
		)]
	) ) ( def bmm_OrganizationUnit ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "definedEnd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_OrganizationUnit
			:type bmm_End
			:location "44:3-44:69"
			:isContainer false
			:opposite definingOrganizationUnit
		) ( struct-map
			KM3_Reference
			:name "managedBusinessProces"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_OrganizationUnit
			:type bmm_BusinessProcess
			:location "45:3-45:95"
			:isContainer false
			:opposite responsibleOrganizationUnit
		) ( struct-map
			KM3_Reference
			:name "managedLiability"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_OrganizationUnit
			:type bmm_Liability
			:location "46:3-46:84"
			:isContainer false
			:opposite responsibleOrganizationUnit
		) ( struct-map
			KM3_Reference
			:name "managedAsset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_OrganizationUnit
			:type bmm_Asset
			:location "47:3-47:76"
			:isContainer false
			:opposite responsibleOrganizationUnit
		) ( struct-map
			KM3_Reference
			:name "determiningStrategy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_OrganizationUnit
			:type bmm_Strategy
			:location "48:3-48:85"
			:isContainer false
			:opposite determinedOrganizationUnit
		) ( struct-map
			KM3_Reference
			:name "recognizedInfluencer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_OrganizationUnit
			:type bmm_Influencer
			:location "49:3-49:89"
			:isContainer false
			:opposite recognizingOrganizationUnit
		) ( struct-map
			KM3_Reference
			:name "internalInfluencingOrganization"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_OrganizationUnit
			:type bmm_InfluencingOrganization
			:location "50:3-50:113"
			:isContainer false
			:opposite influencingOrganizationUnit
		) ( struct-map
			KM3_Reference
			:name "madeAssessment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_OrganizationUnit
			:type bmm_Assessment
			:location "51:3-51:81"
			:isContainer false
			:opposite assessingOrganizationUnit
		) ( struct-map
			KM3_Reference
			:name "establishedMeans"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_OrganizationUnit
			:type bmm_Means
			:location "52:3-52:81"
			:isContainer false
			:opposite establishingOrganizationUnit
		)]
	) ) ( def bmm_End ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "judgingAssessment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_End
			:type bmm_Assessment
			:location "56:3-56:70"
			:isContainer false
			:opposite affectedEnd
		) ( struct-map
			KM3_Reference
			:name "definingOrganizationUnit"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_End
			:type bmm_OrganizationUnit
			:location "57:3-57:82"
			:isContainer false
			:opposite definedEnd
		)]
	) ) ( def bmm_BusinessProcess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "deliveredOffering"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_BusinessProcess
			:type bmm_Offering
			:location "61:3-61:82"
			:isContainer false
			:opposite deliveringBusinessProcess
		) ( struct-map
			KM3_Reference
			:name "realizedCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_BusinessProcess
			:type bmm_CourseOfAction
			:location "62:3-62:92"
			:isContainer false
			:opposite realizingBusinessProcess
		) ( struct-map
			KM3_Reference
			:name "managedAsset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_BusinessProcess
			:type bmm_Asset
			:location "63:3-63:72"
			:isContainer false
			:opposite managingBusinessProcess
		) ( struct-map
			KM3_Reference
			:name "governingBusinessPolicy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_BusinessProcess
			:type bmm_BusinessPolicy
			:location "64:3-64:92"
			:isContainer false
			:opposite governedBusinessProcess
		) ( struct-map
			KM3_Reference
			:name "guidingBusinessRule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner bmm_BusinessProcess
			:type bmm_BusinessRule
			:location "65:3-65:81"
			:isContainer false
			:opposite guidedBusinessProcess
		) ( struct-map
			KM3_Reference
			:name "responsibleOrganizationUnit"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_BusinessProcess
			:type bmm_OrganizationUnit
			:location "66:3-66:96"
			:isContainer false
			:opposite managedBusinessProces
		)]
	) ) ( def bmm_Offering ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_FixedAsset bmm_Asset]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "definingCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Offering
			:type bmm_CourseOfAction
			:location "70:3-70:83"
			:isContainer false
			:opposite definedOffering
		) ( struct-map
			KM3_Reference
			:name "usedAsset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Offering
			:type bmm_FixedAsset
			:location "71:3-71:64"
			:isContainer false
			:opposite usingOffering
		) ( struct-map
			KM3_Reference
			:name "requiredResource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Offering
			:type bmm_Resource
			:location "72:3-72:73"
			:isContainer false
			:opposite requiringOffering
		) ( struct-map
			KM3_Reference
			:name "deliveringBusinessProcess"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Offering
			:type bmm_BusinessProcess
			:location "73:3-73:89"
			:isContainer false
			:opposite deliveredOffering
		)]
	) ) ( def bmm_Asset ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "deployingCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Asset
			:type bmm_CourseOfAction
			:location "77:3-77:82"
			:isContainer false
			:opposite deployedAsset
		) ( struct-map
			KM3_Reference
			:name "governingDirective"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Asset
			:type bmm_Directive
			:location "78:3-78:72"
			:isContainer false
			:opposite governedAsset
		) ( struct-map
			KM3_Reference
			:name "responsibleOrganizationUnit"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Asset
			:type bmm_OrganizationUnit
			:location "79:3-79:87"
			:isContainer false
			:opposite managedAsset
		) ( struct-map
			KM3_Reference
			:name "managingBusinessProcess"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Asset
			:type bmm_BusinessProcess
			:location "80:3-80:82"
			:isContainer false
			:opposite managedAsset
		)]
	) ) ( def bmm_CourseOfAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_Means]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enabledCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_CourseOfAction
			:type bmm_CourseOfAction
			:location "84:3-84:89"
			:isContainer false
			:opposite enablingCourseOfAction
		) ( struct-map
			KM3_Reference
			:name "enablingCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_CourseOfAction
			:type bmm_CourseOfAction
			:location "85:3-85:89"
			:isContainer false
			:opposite enabledCourseOfAction
		) ( struct-map
			KM3_Reference
			:name "moreSpecficCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_CourseOfAction
			:type bmm_CourseOfAction
			:location "86:3-86:92"
			:isContainer false
			:opposite broaderCourseOfAction
		) ( struct-map
			KM3_Reference
			:name "broaderCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_CourseOfAction
			:type bmm_CourseOfAction
			:location "87:3-87:92"
			:isContainer false
			:opposite moreSpecficCourseOfAction
		) ( struct-map
			KM3_Reference
			:name "supportedDesiredResult"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_CourseOfAction
			:type bmm_DesiredResult
			:location "88:3-88:91"
			:isContainer false
			:opposite supportingCourseOfAction
		) ( struct-map
			KM3_Reference
			:name "definedOffering"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_CourseOfAction
			:type bmm_Offering
			:location "89:3-89:77"
			:isContainer false
			:opposite definingCourseOfAction
		) ( struct-map
			KM3_Reference
			:name "dischargedLiability"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_CourseOfAction
			:type bmm_Liability
			:location "90:3-90:85"
			:isContainer false
			:opposite dischargingCourseOfAction
		) ( struct-map
			KM3_Reference
			:name "realizingBusinessProcess"
			:upper 1
			:lower 1
			:isOrdered false
			:owner bmm_CourseOfAction
			:type bmm_BusinessProcess
			:location "91:3-91:90"
			:isContainer false
			:opposite realizedCourseOfAction
		) ( struct-map
			KM3_Reference
			:name "governingDirective"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_CourseOfAction
			:type bmm_Directive
			:location "92:3-92:81"
			:isContainer false
			:opposite governedCourseOfAction
		) ( struct-map
			KM3_Reference
			:name "baseDirective"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_CourseOfAction
			:type bmm_Directive
			:location "93:3-93:75"
			:isContainer false
			:opposite derivedCourseOfAction
		) ( struct-map
			KM3_Reference
			:name "deployedAsset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_CourseOfAction
			:type bmm_Asset
			:location "94:3-94:73"
			:isContainer false
			:opposite deployingCourseOfAction
		)]
	) ) ( def bmm_DesiredResult ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_End]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "moreSpecificDesiredResult"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_DesiredResult
			:type bmm_DesiredResult
			:location "98:3-98:90"
			:isContainer false
			:opposite broaderDesiredResult
		) ( struct-map
			KM3_Reference
			:name "broaderDesiredResult"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_DesiredResult
			:type bmm_DesiredResult
			:location "99:3-99:90"
			:isContainer false
			:opposite moreSpecificDesiredResult
		) ( struct-map
			KM3_Reference
			:name "supportingDirective"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_DesiredResult
			:type bmm_Directive
			:location "100:3-100:82"
			:isContainer false
			:opposite supportedDesiredResult
		) ( struct-map
			KM3_Reference
			:name "supportingCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_DesiredResult
			:type bmm_CourseOfAction
			:location "101:3-101:92"
			:isContainer false
			:opposite supportedDesiredResult
		)]
	) ) ( def bmm_Liability ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "claimedResource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Liability
			:type bmm_Resource
			:location "105:3-105:72"
			:isContainer false
			:opposite claimingLiability
		) ( struct-map
			KM3_Reference
			:name "responsibleOrganizationUnit"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Liability
			:type bmm_OrganizationUnit
			:location "106:3-106:91"
			:isContainer false
			:opposite managedLiability
		) ( struct-map
			KM3_Reference
			:name "dischargingCourseOfAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Liability
			:type bmm_CourseOfAction
			:location "107:3-107:90"
			:isContainer false
			:opposite dischargedLiability
		)]
	) ) ( def bmm_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_Asset]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "providingFixedAsset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Resource
			:type bmm_FixedAsset
			:location "111:3-111:77"
			:isContainer false
			:opposite providedResource
		) ( struct-map
			KM3_Reference
			:name "requiringOffering"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Resource
			:type bmm_Offering
			:location "112:3-112:73"
			:isContainer false
			:opposite requiredResource
		) ( struct-map
			KM3_Reference
			:name "claimingLiability"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Resource
			:type bmm_Liability
			:location "113:3-113:73"
			:isContainer false
			:opposite claimedResource
		)]
	) ) ( def bmm_FixedAsset ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_Asset]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "usingOffering"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_FixedAsset
			:type bmm_Offering
			:location "117:3-117:62"
			:isContainer false
			:opposite usedAsset
		) ( struct-map
			KM3_Reference
			:name "providedResource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_FixedAsset
			:type bmm_Resource
			:location "118:3-118:75"
			:isContainer false
			:opposite providingFixedAsset
		)]
	) ) ( def bmm_BusinessPolicy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_Directive]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "moreSpecificBusinessPolicy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_BusinessPolicy
			:type bmm_BusinessPolicy
			:location "122:3-122:93"
			:isContainer false
			:opposite broaderBusinessPolicy
		) ( struct-map
			KM3_Reference
			:name "broaderBusinessPolicy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_BusinessPolicy
			:type bmm_BusinessPolicy
			:location "123:3-123:93"
			:isContainer false
			:opposite moreSpecificBusinessPolicy
		) ( struct-map
			KM3_Reference
			:name "derivedBusinessRule"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_BusinessPolicy
			:type bmm_BusinessRule
			:location "124:3-124:81"
			:isContainer false
			:opposite baseBusinessPolicy
		) ( struct-map
			KM3_Reference
			:name "governedBusinessProcess"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_BusinessPolicy
			:type bmm_BusinessProcess
			:location "125:3-125:93"
			:isContainer false
			:opposite governingBusinessPolicy
		)]
	) ) ( def bmm_BusinessRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_Directive]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "effectingTactic"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_BusinessRule
			:type bmm_Tactic
			:location "129:3-129:73"
			:isContainer false
			:opposite enforcedBusinessRule
		) ( struct-map
			KM3_Reference
			:name "guidedBusinessProcess"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_BusinessRule
			:type bmm_BusinessProcess
			:location "130:3-130:87"
			:isContainer false
			:opposite guidingBusinessRule
		) ( struct-map
			KM3_Reference
			:name "baseBusinessPolicy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_BusinessRule
			:type bmm_BusinessPolicy
			:location "131:3-131:83"
			:isContainer false
			:opposite derivedBusinessRule
		)]
	) ) ( def bmm_Tactic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_CourseOfAction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "implementedStrategy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Tactic
			:type bmm_Strategy
			:location "135:3-135:77"
			:isContainer false
			:opposite implementingTactic
		) ( struct-map
			KM3_Reference
			:name "enforcedBusinessRule"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Tactic
			:type bmm_BusinessRule
			:location "136:3-136:79"
			:isContainer false
			:opposite effectingTactic
		)]
	) ) ( def bmm_Strategy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_CourseOfAction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "determinedOrganizationUnit"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Strategy
			:type bmm_OrganizationUnit
			:location "140:3-140:93"
			:isContainer false
			:opposite determiningStrategy
		) ( struct-map
			KM3_Reference
			:name "plannedMission"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Strategy
			:type bmm_Mission
			:location "141:3-141:70"
			:isContainer false
			:opposite componentStrategy
		) ( struct-map
			KM3_Reference
			:name "implementingTactic"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Strategy
			:type bmm_Tactic
			:location "142:3-142:75"
			:isContainer false
			:opposite implementedStrategy
		)]
	) ) ( def bmm_Mission ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_Means]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operativeVision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bmm_Mission
			:type bmm_Vision
			:location "146:3-146:72"
			:isContainer false
			:opposite deliveringMission
		) ( struct-map
			KM3_Reference
			:name "componentStrategy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Mission
			:type bmm_Strategy
			:location "147:3-147:71"
			:isContainer false
			:opposite plannedMission
		)]
	) ) ( def bmm_Vision ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_End]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "amplifyingGoal"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Vision
			:type bmm_Goal
			:location "151:3-151:65"
			:isContainer false
			:opposite amplifiedVision
		) ( struct-map
			KM3_Reference
			:name "deliveringMission"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Vision
			:type bmm_Mission
			:location "152:3-152:71"
			:isContainer false
			:opposite operativeVision
		)]
	) ) ( def bmm_Goal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_DesiredResult]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "quantifyingObjective"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Goal
			:type bmm_Objective
			:location "156:3-156:75"
			:isContainer false
			:opposite quantifiedGoal
		) ( struct-map
			KM3_Reference
			:name "amplifiedVision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bmm_Goal
			:type bmm_Vision
			:location "157:3-157:69"
			:isContainer false
			:opposite amplifyingGoal
		)]
	) ) ( def bmm_Objective ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_DesiredResult]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "quantifiedGoal"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Objective
			:type bmm_Goal
			:location "161:3-161:70"
			:isContainer false
			:opposite quantifyingObjective
		)]
	) ) ( def bmm_Influencer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "categorizingInfluencerCategory"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Influencer
			:type bmm_InfluencerCategory
			:location "165:3-165:101"
			:isContainer false
			:opposite categorizedInfluencer
		) ( struct-map
			KM3_Reference
			:name "sourceInfluencingOrganization"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Influencer
			:type bmm_InfluencingOrganization
			:location "166:3-166:102"
			:isContainer false
			:opposite providedInfluencer
		) ( struct-map
			KM3_Reference
			:name "judgingAssessment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_Influencer
			:type bmm_Assessment
			:location "167:3-167:75"
			:isContainer false
			:opposite judgedInfluencer
		) ( struct-map
			KM3_Reference
			:name "recognizingOrganizationUnit"
			:upper -1
			:lower 1
			:isOrdered false
			:owner bmm_Influencer
			:type bmm_OrganizationUnit
			:location "168:3-168:97"
			:isContainer false
			:opposite recognizedInfluencer
		)]
	) ) ( def bmm_InfluencerCategory ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "categorizedInfluencer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_InfluencerCategory
			:type bmm_Influencer
			:location "172:3-172:93"
			:isContainer false
			:opposite categorizingInfluencerCategory
		)]
	) ) ( def bmm_InfluencingOrganization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "categorizingOrganizationCategory"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_InfluencingOrganization
			:type bmm_OrganizationCategory
			:location "176:3-176:118"
			:isContainer false
			:opposite categorizedInfluencingOrganization
		) ( struct-map
			KM3_Reference
			:name "influencingOrganizationUnit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bmm_InfluencingOrganization
			:type bmm_OrganizationUnit
			:location "177:3-177:108"
			:isContainer false
			:opposite internalInfluencingOrganization
		) ( struct-map
			KM3_Reference
			:name "providedInfluencer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_InfluencingOrganization
			:type bmm_Influencer
			:location "178:3-178:89"
			:isContainer false
			:opposite sourceInfluencingOrganization
		)]
	) ) ( def bmm_OrganizationCategory ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "categorizedInfluencingOrganization"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_OrganizationCategory
			:type bmm_InfluencingOrganization
			:location "182:3-182:121"
			:isContainer false
			:opposite categorizingOrganizationCategory
		)]
	) ) ( def bmm_PotentialImpact ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "identifyingAssessment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_PotentialImpact
			:type bmm_Assessment
			:location "186:3-186:88"
			:isContainer false
			:opposite identifiedPotentialImpact
		) ( struct-map
			KM3_Reference
			:name "motivatedDirective"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_PotentialImpact
			:type bmm_Directive
			:location "187:3-187:84"
			:isContainer false
			:opposite motivatingPotentialImpact
		)]
	) ) ( def bmm_Regulation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_Influencer]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "regulatingDirective"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bmm_Regulation
			:type bmm_Directive
			:location "191:3-191:81"
			:isContainer false
			:opposite directiveRegulation
		)]
	) ) ( def bmm_AssessmentCategory ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_MotivationElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "categorizedAssessment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner bmm_AssessmentCategory
			:type bmm_Assessment
			:location "195:3-195:93"
			:isContainer false
			:opposite categorizingAssessmentCategory
		)]
	) ) ( def bmm_PotentialReward ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_PotentialImpact]
		:structuralFeatures[]
	) ) ( def bmm_Risk ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bmm_PotentialImpact]
		:structuralFeatures[]
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "206:2-206:18"
	) )]
) )
