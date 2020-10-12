( declare ODPEV_EnterpriseObject )
( declare ODPEV_ODPSystem )
( declare ODPEV_Party )
( declare ODPEV_Objective )
( declare ODPEV_Scope )
( declare ODPEV_EnterpriseSpecification )
( declare ODPEV_FieldOfApplication )
( declare ODPEV_Policy )
( declare ODPEV_PolicyEnvelope )
( declare ODPEV_PolicyValue )
( declare ODPEV_AssigmentPolicy )
( declare ODPEV_Contract )
( declare ODPEV_Process )
( declare ODPEV_Step )
( declare ODPEV_Action )
( declare ODPEV_AccountableAction )
( declare ODPEV_Prescription )
( declare ODPEV_Commitment )
( declare ODPEV_Declaration )
( declare ODPEV_Evaluation )
( declare ODPEV_Delegation )
( declare ODPEV_Behaviour )
( declare ODPEV_Community )
( declare ODPEV_CommunityObject )
( declare ODPEV_Role )
( declare ODPEV_InterfaceRole )
( declare ODPEV_Violation )
( declare ODPEV_Rule )
( declare ODPEV_Obligation )
( declare ODPEV_Authorisation )
( declare ODPEV_Permission )
( declare ODPEV_Prohibition )
( declare ODPEV_EO_A_R )
( declare ODPEV_EO_P_D )
( def ODPEV ( struct-map
	KM3_Package
	:contents[( def ODPEV_EnterpriseObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "eoConfigurations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_EnterpriseObject
			:type ODPEV_Community
			:location "12:3-12:66"
			:isContainer false
			:opposite coMembers
		) ( struct-map
			KM3_Reference
			:name "eoRoles"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_EnterpriseObject
			:type ODPEV_Role
			:location "14:3-14:54"
			:isContainer false
			:opposite rolefillers
		) ( struct-map
			KM3_Reference
			:name "eoArtefactActions"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_EnterpriseObject
			:type ODPEV_Action
			:location "16:3-16:79"
			:isContainer false
			:opposite actArtefactRoleFillers
		) ( struct-map
			KM3_Reference
			:name "eoResourceActions"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_EnterpriseObject
			:type ODPEV_Action
			:location "18:3-18:79"
			:isContainer false
			:opposite actResourceRoleFillers
		) ( struct-map
			KM3_Reference
			:name "eoActorActions"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_EnterpriseObject
			:type ODPEV_Action
			:location "20:3-20:73"
			:isContainer false
			:opposite actActorRoleFillers
		) ( struct-map
			KM3_Reference
			:name "eoPolicy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_EnterpriseObject
			:type ODPEV_Policy
			:location "22:3-22:64"
			:isContainer false
			:opposite poEnterpriseObject
		) ( struct-map
			KM3_Reference
			:name "eoEOAR"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_EnterpriseObject
			:type ODPEV_EO_A_R
			:location "24:3-24:55"
			:isContainer false
			:opposite eoarSubject
		) ( struct-map
			KM3_Reference
			:name "eoEOPD"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_EnterpriseObject
			:type ODPEV_EO_P_D
			:location "26:3-26:50"
			:isContainer false
			:opposite eopdAgent
		)]
	) ) ( def ODPEV_ODPSystem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_EnterpriseObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "odpBehaviour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_ODPSystem
			:type ODPEV_Scope
			:location "31:3-31:57"
			:isContainer false
			:opposite scOdpSystem
		) ( struct-map
			KM3_Reference
			:name "odpObjectives"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_ODPSystem
			:type ODPEV_Objective
			:location "33:3-33:68"
			:isContainer false
			:opposite objFulfiller
		) ( struct-map
			KM3_Reference
			:name "odpSpecifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_ODPSystem
			:type ODPEV_EnterpriseSpecification
			:location "35:3-35:82"
			:isContainer false
			:opposite esDescribedSystems
		)]
	) ) ( def ODPEV_Party ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_EnterpriseObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ptyAccountableAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Party
			:type ODPEV_AccountableAction
			:location "40:3-40:87"
			:isContainer false
			:opposite aaAccountableParty
		) ( struct-map
			KM3_Reference
			:name "ptyEOPD"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_Party
			:type ODPEV_EO_P_D
			:location "42:3-42:55"
			:isContainer false
			:opposite eopdPrincipal
		)]
	) ) ( def ODPEV_Objective ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objFulfiller"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ODPEV_Objective
			:type ODPEV_ODPSystem
			:location "47:3-47:68"
			:isContainer false
			:opposite odpObjectives
		) ( struct-map
			KM3_Reference
			:name "objSpecifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_Objective
			:type ODPEV_Contract
			:location "49:3-49:60"
			:isContainer false
			:opposite ctObjective
		) ( struct-map
			KM3_Reference
			:name "objRefiners"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Objective
			:type ODPEV_Objective
			:location "51:3-51:65"
			:isContainer false
			:opposite objRefinement
		) ( struct-map
			KM3_Reference
			:name "objRefinement"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ODPEV_Objective
			:type ODPEV_Objective
			:location "53:3-53:67"
			:isContainer false
			:opposite objRefiners
		) ( struct-map
			KM3_Reference
			:name "objAchievers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Objective
			:type ODPEV_Process
			:location "55:3-55:63"
			:isContainer false
			:opposite prObjectives
		) ( struct-map
			KM3_Reference
			:name "objFulfillers"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_Objective
			:type ODPEV_Behaviour
			:location "57:3-57:68"
			:isContainer false
			:opposite beObjectives
		)]
	) ) ( def ODPEV_Scope ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "scOdpSystem"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_Scope
			:type ODPEV_ODPSystem
			:location "62:3-62:61"
			:isContainer false
			:opposite odpBehaviour
		)]
	) ) ( def ODPEV_EnterpriseSpecification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "esDescribedSystems"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_EnterpriseSpecification
			:type ODPEV_ODPSystem
			:location "67:3-67:73"
			:isContainer false
			:opposite odpSpecifier
		) ( struct-map
			KM3_Reference
			:name "esContext"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_EnterpriseSpecification
			:type ODPEV_FieldOfApplication
			:location "69:3-69:82"
			:isContainer false
			:opposite faEnterpriseSpecifications
		)]
	) ) ( def ODPEV_FieldOfApplication ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "faEnterpriseSpecifications"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_FieldOfApplication
			:type ODPEV_EnterpriseSpecification
			:location "74:3-74:87"
			:isContainer false
			:opposite esContext
		)]
	) ) ( def ODPEV_Policy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "poSpecifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_Policy
			:type ODPEV_Contract
			:location "79:3-79:58"
			:isContainer false
			:opposite ctPolicies
		) ( struct-map
			KM3_Reference
			:name "poOwner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_Policy
			:type ODPEV_Community
			:location "81:3-81:53"
			:isContainer false
			:opposite coPolicy
		) ( struct-map
			KM3_Reference
			:name "poProcess"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Policy
			:type ODPEV_Process
			:location "83:3-83:61"
			:isContainer false
			:opposite prConstrainer
		) ( struct-map
			KM3_Reference
			:name "poBehaviour"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Policy
			:type ODPEV_Behaviour
			:location "85:3-85:71"
			:isContainer false
			:opposite bePolicyConstrainer
		) ( struct-map
			KM3_Reference
			:name "poChanger"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Policy
			:type ODPEV_Behaviour
			:location "87:3-87:58"
			:isContainer false
			:opposite bePolicy
		) ( struct-map
			KM3_Reference
			:name "poRole"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Policy
			:type ODPEV_Role
			:location "89:3-89:57"
			:isContainer false
			:opposite roleConstrainer
		) ( struct-map
			KM3_Reference
			:name "poEnterpriseObject"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Policy
			:type ODPEV_EnterpriseObject
			:location "91:3-91:74"
			:isContainer false
			:opposite eoPolicy
		)]
	) ) ( def ODPEV_PolicyEnvelope ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_Policy]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pePolicySetter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_PolicyEnvelope
			:type ODPEV_Behaviour
			:location "96:3-96:68"
			:isContainer false
			:opposite bePolicyEnvelope
		) ( struct-map
			KM3_Reference
			:name "peBehaviour"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ODPEV_PolicyEnvelope
			:type ODPEV_Behaviour
			:location "98:3-98:67"
			:isContainer false
			:opposite beConstrainer
		) ( struct-map
			KM3_Reference
			:name "peValues"
			:upper -1
			:lower 1
			:isOrdered true
			:owner ODPEV_PolicyEnvelope
			:type ODPEV_PolicyValue
			:location "100:3-100:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "peCurrentValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_PolicyEnvelope
			:type ODPEV_PolicyValue
			:location "102:3-102:61"
			:isContainer false
			:opposite pvValue
		)]
	) ) ( def ODPEV_PolicyValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_Policy]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pvValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_PolicyValue
			:type ODPEV_PolicyEnvelope
			:location "107:3-107:64"
			:isContainer false
			:opposite peCurrentValue
		)]
	) ) ( def ODPEV_AssigmentPolicy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_Policy]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "apEOAR"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_AssigmentPolicy
			:type ODPEV_EO_A_R
			:location "112:3-112:56"
			:isContainer false
			:opposite eoarGovernor
		)]
	) ) ( def ODPEV_Contract ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ctPolicies"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_Contract
			:type ODPEV_Policy
			:location "117:3-117:56"
			:isContainer false
			:opposite poSpecifier
		) ( struct-map
			KM3_Reference
			:name "ctObjective"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_Contract
			:type ODPEV_Objective
			:location "119:3-119:61"
			:isContainer false
			:opposite objSpecifier
		) ( struct-map
			KM3_Reference
			:name "ctBehaviours"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_Contract
			:type ODPEV_Behaviour
			:location "121:3-121:67"
			:isContainer false
			:opposite beSpecifiers
		)]
	) ) ( def ODPEV_Process ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "prObjectives"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_Process
			:type ODPEV_Objective
			:location "126:3-126:67"
			:isContainer false
			:opposite objAchievers
		) ( struct-map
			KM3_Reference
			:name "prDetails"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_Process
			:type ODPEV_Step
			:location "128:3-128:55"
			:isContainer false
			:opposite stGraphs
		) ( struct-map
			KM3_Reference
			:name "prRefinement"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ODPEV_Process
			:type ODPEV_Step
			:location "130:3-130:63"
			:isContainer false
			:opposite stAbstraction
		) ( struct-map
			KM3_Reference
			:name "prConstrainer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Process
			:type ODPEV_Policy
			:location "132:3-132:60"
			:isContainer false
			:opposite poProcess
		)]
	) ) ( def ODPEV_Step ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stGraphs"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_Step
			:type ODPEV_Process
			:location "137:3-137:58"
			:isContainer false
			:opposite prDetails
		) ( struct-map
			KM3_Reference
			:name "stAbstraction"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ODPEV_Step
			:type ODPEV_Process
			:location "139:3-139:66"
			:isContainer false
			:opposite prRefinement
		)]
	) ) ( def ODPEV_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_Step]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "actBehaviours"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_Action
			:type ODPEV_Behaviour
			:location "144:3-144:65"
			:isContainer false
			:opposite beActions
		) ( struct-map
			KM3_Reference
			:name "actArtefactRoleFillers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Action
			:type ODPEV_EnterpriseObject
			:location "146:3-146:87"
			:isContainer false
			:opposite eoArtefactActions
		) ( struct-map
			KM3_Reference
			:name "actResourceRoleFillers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Action
			:type ODPEV_EnterpriseObject
			:location "148:3-148:87"
			:isContainer false
			:opposite eoResourceActions
		) ( struct-map
			KM3_Reference
			:name "actActorRoleFillers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Action
			:type ODPEV_EnterpriseObject
			:location "150:3-150:81"
			:isContainer false
			:opposite eoActorActions
		)]
	) ) ( def ODPEV_AccountableAction ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ODPEV_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "aaAccountableParty"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_AccountableAction
			:type ODPEV_Party
			:location "155:3-155:77"
			:isContainer false
			:opposite ptyAccountableAction
		)]
	) ) ( def ODPEV_Prescription ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_AccountableAction]
		:structuralFeatures[]
	) ) ( def ODPEV_Commitment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_AccountableAction]
		:structuralFeatures[]
	) ) ( def ODPEV_Declaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_AccountableAction]
		:structuralFeatures[]
	) ) ( def ODPEV_Evaluation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_AccountableAction]
		:structuralFeatures[]
	) ) ( def ODPEV_Delegation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_AccountableAction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dlgEOPD"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_Delegation
			:type ODPEV_EO_P_D
			:location "172:3-172:52"
			:isContainer false
			:opposite eopdAction
		)]
	) ) ( def ODPEV_Behaviour ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "beObjectives"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_Behaviour
			:type ODPEV_Objective
			:location "177:3-177:68"
			:isContainer false
			:opposite objFulfillers
		) ( struct-map
			KM3_Reference
			:name "beSpecifiers"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_Behaviour
			:type ODPEV_Contract
			:location "179:3-179:66"
			:isContainer false
			:opposite ctBehaviours
		) ( struct-map
			KM3_Reference
			:name "beActions"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_Behaviour
			:type ODPEV_Action
			:location "181:3-181:62"
			:isContainer false
			:opposite actBehaviours
		) ( struct-map
			KM3_Reference
			:name "beIdentifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ODPEV_Behaviour
			:type ODPEV_Role
			:location "183:3-183:63"
			:isContainer false
			:opposite roleBehaviour
		) ( struct-map
			KM3_Reference
			:name "bePolicyEnvelope"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ODPEV_Behaviour
			:type ODPEV_PolicyEnvelope
			:location "185:3-185:78"
			:isContainer false
			:opposite pePolicySetter
		) ( struct-map
			KM3_Reference
			:name "beConstrainer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ODPEV_Behaviour
			:type ODPEV_PolicyEnvelope
			:location "187:3-187:72"
			:isContainer false
			:opposite peBehaviour
		) ( struct-map
			KM3_Reference
			:name "bePolicyConstrainer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Behaviour
			:type ODPEV_Policy
			:location "189:3-189:68"
			:isContainer false
			:opposite poBehaviour
		) ( struct-map
			KM3_Reference
			:name "bePolicy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Behaviour
			:type ODPEV_Policy
			:location "191:3-191:55"
			:isContainer false
			:opposite poChanger
		)]
	) ) ( def ODPEV_Community ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "coAbstraction"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ODPEV_Community
			:type ODPEV_CommunityObject
			:location "196:3-196:76"
			:isContainer false
			:opposite cobjRefinement
		) ( struct-map
			KM3_Reference
			:name "coMembers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Community
			:type ODPEV_EnterpriseObject
			:location "198:3-198:73"
			:isContainer false
			:opposite eoConfigurations
		) ( struct-map
			KM3_Reference
			:name "coCommunityRoles"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Community
			:type ODPEV_Role
			:location "200:3-200:65"
			:isContainer false
			:opposite roleSpecifier
		) ( struct-map
			KM3_Reference
			:name "coPolicy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Community
			:type ODPEV_Policy
			:location "202:3-202:53"
			:isContainer false
			:opposite poOwner
		)]
	) ) ( def ODPEV_CommunityObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_EnterpriseObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cobjRefinement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_CommunityObject
			:type ODPEV_Community
			:location "207:3-207:65"
			:isContainer false
			:opposite coAbstraction
		)]
	) ) ( def ODPEV_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "roleBehaviour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_Role
			:type ODPEV_Behaviour
			:location "212:3-212:63"
			:isContainer false
			:opposite beIdentifier
		) ( struct-map
			KM3_Reference
			:name "roleSpecifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_Role
			:type ODPEV_Community
			:location "214:3-214:67"
			:isContainer false
			:opposite coCommunityRoles
		) ( struct-map
			KM3_Reference
			:name "rolefillers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Role
			:type ODPEV_EnterpriseObject
			:location "216:3-216:66"
			:isContainer false
			:opposite eoRoles
		) ( struct-map
			KM3_Reference
			:name "roleConstrainer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Role
			:type ODPEV_Policy
			:location "218:3-218:59"
			:isContainer false
			:opposite poRole
		) ( struct-map
			KM3_Reference
			:name "roleEOAR"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Role
			:type ODPEV_EO_A_R
			:location "220:3-220:61"
			:isContainer false
			:opposite eoarSubjectRole
		)]
	) ) ( def ODPEV_InterfaceRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_Role]
		:structuralFeatures[]
	) ) ( def ODPEV_Violation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_Behaviour]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "vioProhibitor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_Violation
			:type ODPEV_Rule
			:location "228:3-228:57"
			:isContainer false
			:opposite ruViolation
		)]
	) ) ( def ODPEV_Rule ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ruViolation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_Rule
			:type ODPEV_Violation
			:location "233:3-233:65"
			:isContainer false
			:opposite vioProhibitor
		)]
	) ) ( def ODPEV_Obligation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_Rule]
		:structuralFeatures[]
	) ) ( def ODPEV_Authorisation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_Rule]
		:structuralFeatures[]
	) ) ( def ODPEV_Permission ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_Rule]
		:structuralFeatures[]
	) ) ( def ODPEV_Prohibition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPEV_Rule]
		:structuralFeatures[]
	) ) ( def ODPEV_EO_A_R ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "eoarSubject"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_EO_A_R
			:type ODPEV_EnterpriseObject
			:location "252:3-252:65"
			:isContainer false
			:opposite eoEOAR
		) ( struct-map
			KM3_Reference
			:name "eoarSubjectRole"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPEV_EO_A_R
			:type ODPEV_Role
			:location "254:3-254:61"
			:isContainer false
			:opposite roleEOAR
		) ( struct-map
			KM3_Reference
			:name "eoarGovernor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPEV_EO_A_R
			:type ODPEV_AssigmentPolicy
			:location "256:3-256:65"
			:isContainer false
			:opposite apEOAR
		)]
	) ) ( def ODPEV_EO_P_D ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "eopdAgent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_EO_P_D
			:type ODPEV_EnterpriseObject
			:location "263:3-263:60"
			:isContainer false
			:opposite eoEOPD
		) ( struct-map
			KM3_Reference
			:name "eopdPrincipal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_EO_P_D
			:type ODPEV_Party
			:location "265:3-265:54"
			:isContainer false
			:opposite ptyEOPD
		) ( struct-map
			KM3_Reference
			:name "eopdAction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPEV_EO_P_D
			:type ODPEV_Delegation
			:location "267:3-267:56"
			:isContainer false
			:opposite dlgEOPD
		)]
	) )]
) )
