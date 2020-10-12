( declare SimpleSBVR_Root )
( declare SimpleSBVR_Element )
( declare SimpleSBVR_Representation )
( declare SimpleSBVR_Designation )
( declare SimpleSBVR_Text )
( declare SimpleSBVR_Meaning )
( declare SimpleSBVR_Concept )
( declare SimpleSBVR_NounConcept )
( declare SimpleSBVR_ObjectType )
( declare SimpleSBVR_IndividualConcept )
( declare SimpleSBVR_DataType )
( declare SimpleSBVR_NonEmptyString )
( declare SimpleSBVR_NonNegativeInteger )
( declare SimpleSBVR_FactType )
( declare SimpleSBVR_BinaryFactType )
( declare SimpleSBVR_IsPropertyOfFactType )
( declare SimpleSBVR_AssociativeFactType )
( declare SimpleSBVR_CategorizationFactType )
( declare SimpleSBVR_ObjectificationFactType )
( declare SimpleSBVR_Role )
( declare SimpleSBVR_FactTypeRole )
( declare SimpleSBVR_LogicalFormulation )
( declare SimpleSBVR_AtomicFormulation )
( declare SimpleSBVR_BinaryAtomicFormulation )
( declare SimpleSBVR_NecessityFormulation )
( declare SimpleSBVR_Quantification )
( declare SimpleSBVR_UniversalQuantification )
( declare SimpleSBVR_AtLeastNQuantification )
( declare SimpleSBVR_ExactlyNQuantification )
( declare SimpleSBVR_AtMostNQuantification )
( declare SimpleSBVR_BindableTarget )
( declare SimpleSBVR_Variable )
( declare SimpleSBVR_RoleBinding )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def SimpleSBVR ( struct-map
	KM3_Package
	:contents[( def SimpleSBVR_Root ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleSBVR_Root
			:type SimpleSBVR_Element
			:location "24:3-24:47"
			:isContainer true
		)]
	) ) ( def SimpleSBVR_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "objectName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_Element
			:type String
			:location "29:3-29:33"
		)]
	) ) ( def SimpleSBVR_Representation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "meaning"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_Representation
			:type SimpleSBVR_Meaning
			:location "36:3-36:63"
			:isContainer false
			:opposite representations
		)]
	) ) ( def SimpleSBVR_Designation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Representation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_Designation
			:type SimpleSBVR_Text
			:location "41:3-41:30"
			:isContainer false
		)]
	) ) ( def SimpleSBVR_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_Text
			:type String
			:location "46:3-46:28"
		)]
	) ) ( def SimpleSBVR_Meaning ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "representations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleSBVR_Meaning
			:type SimpleSBVR_Representation
			:location "52:3-52:70"
			:isContainer false
			:opposite meaning
		)]
	) ) ( def SimpleSBVR_Concept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Meaning]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_NounConcept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Concept]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_ObjectType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_NounConcept]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "specializes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SimpleSBVR_ObjectType
			:type SimpleSBVR_ObjectType
			:location "63:3-63:66"
			:isContainer false
			:opposite generalizes
		) ( struct-map
			KM3_Reference
			:name "generalizes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleSBVR_ObjectType
			:type SimpleSBVR_ObjectType
			:location "64:3-64:66"
			:isContainer false
			:opposite specializes
		)]
	) ) ( def SimpleSBVR_IndividualConcept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_NounConcept]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "instanceOf"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SimpleSBVR_IndividualConcept
			:type SimpleSBVR_ObjectType
			:location "69:3-69:42"
			:isContainer false
		)]
	) ) ( def SimpleSBVR_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_NounConcept]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_NonEmptyString ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_DataType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_NonEmptyString
			:type String
			:location "76:3-76:28"
		)]
	) ) ( def SimpleSBVR_NonNegativeInteger ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_DataType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_NonNegativeInteger
			:type Integer
			:location "81:3-81:29"
		)]
	) ) ( def SimpleSBVR_FactType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Concept]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_BinaryFactType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_FactType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "role1"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_BinaryFactType
			:type SimpleSBVR_FactTypeRole
			:location "92:3-92:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "role2"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_BinaryFactType
			:type SimpleSBVR_FactTypeRole
			:location "93:3-93:39"
			:isContainer false
		)]
	) ) ( def SimpleSBVR_IsPropertyOfFactType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_BinaryFactType]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_AssociativeFactType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_BinaryFactType]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_CategorizationFactType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_BinaryFactType]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_ObjectificationFactType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_BinaryFactType]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nounConcept"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_Role
			:type SimpleSBVR_NounConcept
			:location "116:3-116:44"
			:isContainer false
		)]
	) ) ( def SimpleSBVR_FactTypeRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Role]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_LogicalFormulation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Meaning]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_AtomicFormulation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_LogicalFormulation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isBasedOn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_AtomicFormulation
			:type SimpleSBVR_FactType
			:location "130:3-130:39"
			:isContainer false
		)]
	) ) ( def SimpleSBVR_BinaryAtomicFormulation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_AtomicFormulation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "roleBinding1"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_BinaryAtomicFormulation
			:type SimpleSBVR_RoleBinding
			:location "136:3-136:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "roleBinding2"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_BinaryAtomicFormulation
			:type SimpleSBVR_RoleBinding
			:location "137:3-137:45"
			:isContainer false
		)]
	) ) ( def SimpleSBVR_NecessityFormulation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_LogicalFormulation]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_Quantification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_LogicalFormulation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "introducedVariable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_Quantification
			:type SimpleSBVR_Variable
			:location "146:3-146:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "scopesOver"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_Quantification
			:type SimpleSBVR_LogicalFormulation
			:location "147:3-147:50"
			:isContainer false
		)]
	) ) ( def SimpleSBVR_UniversalQuantification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Quantification]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_AtLeastNQuantification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Quantification]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "minCardinality"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_AtLeastNQuantification
			:type SimpleSBVR_NonNegativeInteger
			:location "154:3-154:54"
			:isContainer false
		)]
	) ) ( def SimpleSBVR_ExactlyNQuantification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Quantification]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cardinality"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_ExactlyNQuantification
			:type SimpleSBVR_NonNegativeInteger
			:location "159:3-159:51"
			:isContainer false
		)]
	) ) ( def SimpleSBVR_AtMostNQuantification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Quantification]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "maxCardinality"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_AtMostNQuantification
			:type SimpleSBVR_NonNegativeInteger
			:location "164:3-164:54"
			:isContainer false
		)]
	) ) ( def SimpleSBVR_BindableTarget ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Element]
		:structuralFeatures[]
	) ) ( def SimpleSBVR_Variable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_BindableTarget]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rangesOver"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_Variable
			:type SimpleSBVR_ObjectType
			:location "173:3-173:42"
			:isContainer false
		)]
	) ) ( def SimpleSBVR_RoleBinding ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleSBVR_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "occursIn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_RoleBinding
			:type SimpleSBVR_AtomicFormulation
			:location "178:3-178:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_RoleBinding
			:type SimpleSBVR_FactType
			:location "179:3-179:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "bindsTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleSBVR_RoleBinding
			:type SimpleSBVR_BindableTarget
			:location "180:3-180:43"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "189:2-189:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "190:2-190:19"
	) )]
) )
