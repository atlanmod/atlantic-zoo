( declare UEML_UEMLObject )
( declare UEML_UEMLModel )
( declare UEML_Geometry )
( declare UEML_Port )
( declare UEML_Flow )
( declare UEML_Activity )
( declare UEML_Object )
( declare UEML_InformationObject )
( declare UEML_Resource )
( declare UEML_MaterialResource )
( declare UEML_HumanResource )
( declare UEML_ResourceFlow )
( declare UEML_IOFlow )
( declare UEML_ControlFlow )
( declare UEML_TriggerFlow )
( declare UEML_ConstraintFlow )
( declare UEML_ResourceRole )
( declare UEML_RoleType )
( declare UEML_Anchor )
( declare UEML_OutputPort )
( declare UEML_InputPort )
( declare UEML_ConnectionOperator )
( declare UEML_AssociationConnector )
( def UEML ( struct-map
	KM3_Package
	:contents[( def UEML_UEMLObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "has"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_UEMLObject
			:type UEML_Geometry
			:location "18:3-18:51"
			:isContainer false
			:opposite object
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_UEMLObject
			:type UEML_UEMLModel
			:location "19:3-19:56"
			:isContainer false
			:opposite contains
		)]
	) ) ( def UEML_UEMLModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_UEMLObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contains"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_UEMLModel
			:type UEML_UEMLObject
			:location "23:3-23:65"
			:isContainer true
			:opposite model
		)]
	) ) ( def UEML_Geometry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Geometry
			:type UEML_UEMLObject
			:location "27:3-27:48"
			:isContainer false
			:opposite has
		)]
	) ) ( def UEML_Port ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_UEMLObject]
		:structuralFeatures[]
	) ) ( def UEML_Flow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_UEMLObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "associationConnector"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Flow
			:type UEML_AssociationConnector
			:location "33:3-33:85"
			:isContainer false
			:opposite classAssociation
		)]
	) ) ( def UEML_Activity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_UEMLObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resourceRole"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_Activity
			:type UEML_ResourceRole
			:location "37:3-37:58"
			:isContainer false
			:opposite in
		) ( struct-map
			KM3_Reference
			:name "child"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_Activity
			:type UEML_Activity
			:location "38:3-38:61"
			:isContainer true
			:opposite parent
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_Activity
			:type UEML_Activity
			:location "39:3-39:53"
			:isContainer false
			:opposite child
		) ( struct-map
			KM3_Reference
			:name "hasOutput"
			:upper -1
			:lower 1
			:isOrdered false
			:owner UEML_Activity
			:type UEML_OutputPort
			:location "40:3-40:71"
			:isContainer true
			:opposite activity
		) ( struct-map
			KM3_Reference
			:name "hasInput"
			:upper -1
			:lower 1
			:isOrdered false
			:owner UEML_Activity
			:type UEML_InputPort
			:location "41:3-41:69"
			:isContainer true
			:opposite activity
		)]
	) ) ( def UEML_Object ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_UEMLObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ioFlow"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_Object
			:type UEML_IOFlow
			:location "45:3-45:53"
			:isContainer false
			:opposite carries
		)]
	) ) ( def UEML_InformationObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Object]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "controlFlow"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_InformationObject
			:type UEML_ControlFlow
			:location "49:3-49:63"
			:isContainer false
			:opposite carries
		)]
	) ) ( def UEML_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Object]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "carries"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_Resource
			:type UEML_ResourceFlow
			:location "53:3-53:68"
			:isContainer false
			:opposite resourceCarries
		) ( struct-map
			KM3_Reference
			:name "plays"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_Resource
			:type UEML_ResourceRole
			:location "54:3-54:62"
			:isContainer false
			:opposite resourcePlays
		)]
	) ) ( def UEML_MaterialResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Resource]
		:structuralFeatures[]
	) ) ( def UEML_HumanResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Resource]
		:structuralFeatures[]
	) ) ( def UEML_ResourceFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Flow]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resourceCarries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_ResourceFlow
			:type UEML_Resource
			:location "61:3-61:62"
			:isContainer false
			:opposite carries
		)]
	) ) ( def UEML_IOFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Flow]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "carries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_IOFlow
			:type UEML_Object
			:location "65:3-65:51"
			:isContainer false
			:opposite ioFlow
		)]
	) ) ( def UEML_ControlFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Flow]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "carries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_ControlFlow
			:type UEML_InformationObject
			:location "69:3-69:67"
			:isContainer false
			:opposite controlFlow
		)]
	) ) ( def UEML_TriggerFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_ControlFlow]
		:structuralFeatures[]
	) ) ( def UEML_ConstraintFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_ControlFlow]
		:structuralFeatures[]
	) ) ( def UEML_ResourceRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Port]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resourcePlays"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_ResourceRole
			:type UEML_Resource
			:location "78:3-78:58"
			:isContainer false
			:opposite plays
		) ( struct-map
			KM3_Reference
			:name "roleQualifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_ResourceRole
			:type UEML_RoleType
			:location "79:3-79:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "in"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_ResourceRole
			:type UEML_Activity
			:location "80:3-80:51"
			:isContainer false
			:opposite resourceRole
		)]
	) ) ( def UEML_RoleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def UEML_Anchor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Port]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Anchor
			:type UEML_AssociationConnector
			:location "86:3-86:61"
			:isContainer false
			:opposite origin
		) ( struct-map
			KM3_Reference
			:name "origin"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Anchor
			:type UEML_AssociationConnector
			:location "87:3-87:61"
			:isContainer false
			:opposite target
		)]
	) ) ( def UEML_OutputPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Anchor]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "activity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_OutputPort
			:type UEML_Activity
			:location "91:3-91:54"
			:isContainer false
			:opposite hasOutput
		)]
	) ) ( def UEML_InputPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Anchor]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "activity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_InputPort
			:type UEML_Activity
			:location "95:3-95:53"
			:isContainer false
			:opposite hasInput
		)]
	) ) ( def UEML_ConnectionOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Anchor]
		:structuralFeatures[]
	) ) ( def UEML_AssociationConnector ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "origin"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_AssociationConnector
			:type UEML_Anchor
			:location "101:3-101:50"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_AssociationConnector
			:type UEML_Anchor
			:location "102:3-102:50"
			:isContainer false
			:opposite origin
		) ( struct-map
			KM3_Reference
			:name "classAssociation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_AssociationConnector
			:type UEML_Flow
			:location "103:3-103:69"
			:isContainer false
			:opposite associationConnector
		)]
	) )]
) )
