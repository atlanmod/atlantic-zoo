( declare SecureUML_Group )
( declare SecureUML_User )
( declare SecureUML_Subject )
( declare SecureUML_Role )
( declare SecureUML_Permission )
( declare SecureUML_AuthorizationConstraint )
( declare SecureUML_AtomicAction )
( declare SecureUML_CompositeAction )
( declare SecureUML_Action )
( declare SecureUML_Resource )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def SecureUML ( struct-map
	KM3_Package
	:contents[( def SecureUML_Group ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SecureUML_Subject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subjectGroup"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SecureUML_Group
			:type SecureUML_Subject
			:location "12:3-12:65"
			:isContainer true
			:opposite group
		)]
	) ) ( def SecureUML_User ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SecureUML_Subject]
		:structuralFeatures[]
	) ) ( def SecureUML_Subject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "group"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SecureUML_Subject
			:type SecureUML_Group
			:location "22:3-22:51"
			:isContainer false
			:opposite subjectGroup
		) ( struct-map
			KM3_Reference
			:name "role"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SecureUML_Subject
			:type SecureUML_Role
			:location "23:3-23:57"
			:isContainer false
			:opposite subjectAssignment
		)]
	) ) ( def SecureUML_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "roleHierarchy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SecureUML_Role
			:type SecureUML_Role
			:location "28:3-28:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "subjectAssignment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SecureUML_Role
			:type SecureUML_Subject
			:location "29:3-29:60"
			:isContainer false
			:opposite role
		) ( struct-map
			KM3_Reference
			:name "permissionAssignment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SecureUML_Role
			:type SecureUML_Permission
			:location "30:3-30:66"
			:isContainer false
			:opposite role
		)]
	) ) ( def SecureUML_Permission ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "role"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SecureUML_Permission
			:type SecureUML_Role
			:location "35:3-35:60"
			:isContainer false
			:opposite permissionAssignment
		) ( struct-map
			KM3_Reference
			:name "constraintAssignment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SecureUML_Permission
			:type SecureUML_AuthorizationConstraint
			:location "36:3-36:87"
			:isContainer false
			:opposite permission
		) ( struct-map
			KM3_Reference
			:name "actionAssignment"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SecureUML_Permission
			:type SecureUML_Action
			:location "37:3-37:66"
			:isContainer false
			:opposite permission
		)]
	) ) ( def SecureUML_AuthorizationConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "permission"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SecureUML_AuthorizationConstraint
			:type SecureUML_Permission
			:location "42:3-42:74"
			:isContainer false
			:opposite constraintAssignment
		)]
	) ) ( def SecureUML_AtomicAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SecureUML_Action]
		:structuralFeatures[]
	) ) ( def SecureUML_CompositeAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SecureUML_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subordinatedAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SecureUML_CompositeAction
			:type SecureUML_Action
			:location "51:3-51:82"
			:isContainer true
			:opposite actionHyerarchy
		)]
	) ) ( def SecureUML_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "permission"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SecureUML_Action
			:type SecureUML_Permission
			:location "57:3-57:70"
			:isContainer false
			:opposite actionAssignment
		) ( struct-map
			KM3_Reference
			:name "resource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SecureUML_Action
			:type SecureUML_Resource
			:location "58:3-58:59"
			:isContainer false
			:opposite resourceAction
		) ( struct-map
			KM3_Reference
			:name "actionHyerarchy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SecureUML_Action
			:type SecureUML_CompositeAction
			:location "59:3-59:82"
			:isContainer false
			:opposite subordinatedAction
		)]
	) ) ( def SecureUML_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resourceAction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SecureUML_Resource
			:type SecureUML_Action
			:location "64:3-64:71"
			:isContainer true
			:opposite resource
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "69:2-69:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "70:2-70:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "71:2-71:19"
	) )]
) )
