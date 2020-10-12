( declare GAIA_OrganizationalStructure )
( declare GAIA_Organization )
( declare GAIA_OrganizationalRule )
( declare GAIA_SafetyRule )
( declare GAIA_LivenessRule )
( declare GAIA_AgentType )
( declare GAIA_Service )
( declare GAIA_Role )
( declare GAIA_Activity )
( declare GAIA_Responsibility )
( declare GAIA_LivenessProperty )
( declare GAIA_SafetyProperty )
( declare GAIA_AssociationConnector )
( declare GAIA_Permission )
( declare GAIA_Resource )
( declare GAIA_Environnement )
( declare GAIA_Action )
( declare GAIA_Communication )
( declare GAIA_Protocol )
( declare PrimitiveTypes_String )
( def GAIA ( struct-map
	KM3_Package
	:contents[( def GAIA_OrganizationalStructure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "organization"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GAIA_OrganizationalStructure
			:type GAIA_Organization
			:location "14:3-14:56"
			:isContainer true
		)]
	) ) ( def GAIA_Organization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "collaborates"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Organization
			:type GAIA_Organization
			:location "18:3-18:66"
			:isContainer false
			:opposite interacts
		) ( struct-map
			KM3_Reference
			:name "interacts"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Organization
			:type GAIA_Organization
			:location "19:3-19:67"
			:isContainer false
			:opposite collaborates
		) ( struct-map
			KM3_Reference
			:name "member"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GAIA_Organization
			:type GAIA_AgentType
			:location "20:3-20:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "observes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GAIA_Organization
			:type GAIA_OrganizationalRule
			:location "21:3-21:50"
			:isContainer false
		)]
	) ) ( def GAIA_OrganizationalRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def GAIA_SafetyRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GAIA_OrganizationalRule]
		:structuralFeatures[]
	) ) ( def GAIA_LivenessRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GAIA_OrganizationalRule]
		:structuralFeatures[]
	) ) ( def GAIA_AgentType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "provides"
			:upper -1
			:lower 1
			:isOrdered false
			:owner GAIA_AgentType
			:type GAIA_Service
			:location "30:3-30:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "collaborates"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_AgentType
			:type GAIA_AgentType
			:location "31:3-31:59"
			:isContainer false
			:opposite agentType
		) ( struct-map
			KM3_Reference
			:name "agentType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_AgentType
			:type GAIA_AgentType
			:location "32:3-32:59"
			:isContainer false
			:opposite collaborates
		) ( struct-map
			KM3_Reference
			:name "plays"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GAIA_AgentType
			:type GAIA_Role
			:location "33:3-33:29"
			:isContainer false
		)]
	) ) ( def GAIA_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "inputs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Service
			:type String
			:location "37:3-37:29"
		) ( struct-map
			KM3_Attribute
			:name "outputs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Service
			:type String
			:location "38:3-38:30"
		) ( struct-map
			KM3_Attribute
			:name "pre-conditions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Service
			:type String
			:location "39:3-39:38"
		) ( struct-map
			KM3_Attribute
			:name "post-conditions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Service
			:type String
			:location "40:3-40:39"
		)]
	) ) ( def GAIA_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "activity"
			:upper -1
			:lower 1
			:isOrdered false
			:owner GAIA_Role
			:type GAIA_Activity
			:location "44:3-44:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "communication"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GAIA_Role
			:type GAIA_Communication
			:location "45:3-45:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "responsibility"
			:upper -1
			:lower 1
			:isOrdered false
			:owner GAIA_Role
			:type GAIA_Responsibility
			:location "46:3-46:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "actsOn"
			:upper 1
			:lower 0
			:isOrdered false
			:owner GAIA_Role
			:type GAIA_AssociationConnector
			:location "47:3-47:68"
			:isContainer false
			:opposite role
		)]
	) ) ( def GAIA_Activity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def GAIA_Responsibility ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def GAIA_LivenessProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GAIA_Responsibility]
		:structuralFeatures[]
	) ) ( def GAIA_SafetyProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GAIA_Responsibility]
		:structuralFeatures[]
	) ) ( def GAIA_AssociationConnector ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "actsOn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GAIA_AssociationConnector
			:type GAIA_Resource
			:location "58:3-58:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "role"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_AssociationConnector
			:type GAIA_Role
			:location "59:3-59:51"
			:isContainer false
			:opposite actsOn
		) ( struct-map
			KM3_Reference
			:name "permission"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GAIA_AssociationConnector
			:type GAIA_Permission
			:location "60:3-60:64"
			:isContainer false
			:opposite association
		)]
	) ) ( def GAIA_Permission ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "association"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Permission
			:type GAIA_AssociationConnector
			:location "64:3-64:70"
			:isContainer false
			:opposite permission
		)]
	) ) ( def GAIA_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Resource
			:type String
			:location "68:2-68:28"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Resource
			:type String
			:location "69:2-69:34"
		) ( struct-map
			KM3_Reference
			:name "permitted_action"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GAIA_Resource
			:type GAIA_Action
			:location "70:2-70:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "environnement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Resource
			:type GAIA_Environnement
			:location "71:2-71:62"
			:isContainer false
			:opposite resource
		)]
	) ) ( def GAIA_Environnement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GAIA_Environnement
			:type GAIA_Resource
			:location "75:3-75:71"
			:isContainer true
			:opposite environnement
		)]
	) ) ( def GAIA_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Action
			:type String
			:location "79:3-79:26"
		)]
	) ) ( def GAIA_Communication ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "observes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GAIA_Communication
			:type GAIA_OrganizationalRule
			:location "83:3-83:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "protocol"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Communication
			:type GAIA_Protocol
			:location "84:3-84:33"
			:isContainer false
		)]
	) ) ( def GAIA_Protocol ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Protocol
			:type String
			:location "88:3-88:30"
		) ( struct-map
			KM3_Attribute
			:name "initiator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Protocol
			:type String
			:location "89:2-89:32"
		) ( struct-map
			KM3_Attribute
			:name "partner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Protocol
			:type String
			:location "90:2-90:31"
		) ( struct-map
			KM3_Attribute
			:name "inputs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Protocol
			:type String
			:location "91:2-91:30"
		) ( struct-map
			KM3_Attribute
			:name "outputs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Protocol
			:type String
			:location "92:2-92:31"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GAIA_Protocol
			:type String
			:location "93:2-93:34"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "99:2-99:18"
	) )]
) )
