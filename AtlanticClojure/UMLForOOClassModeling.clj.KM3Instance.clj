( declare UMLForOOClassModeling_VisibilityKind )
( declare UMLForOOClassModeling_ScopeKind )
( declare UMLForOOClassModeling_MultiplicityType )
( declare UMLForOOClassModeling_ModelElement )
( declare UMLForOOClassModeling_Feature )
( declare UMLForOOClassModeling_NameSpace )
( declare UMLForOOClassModeling_GeneralizableElement )
( declare UMLForOOClassModeling_Classifier )
( declare UMLForOOClassModeling_Class )
( declare UMLForOOClassModeling_StructuralFeature )
( declare UMLForOOClassModeling_Attribute )
( declare UMLForOOClassModeling_BehavioralFeature )
( declare UMLForOOClassModeling_Operation )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def UMLForOOClassModeling ( struct-map
	KM3_Package
	:contents[( def VisibilityKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vk_public_vis"
		:location "15:3-15:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_private_vis"
		:location "16:3-16:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_protected_vis"
		:location "17:3-17:28"
	)] ) ) ( def ScopeKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "sk_instance_level"
		:location "21:3-21:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "sk_classifier_level"
		:location "22:3-22:31"
	)] ) ) ( def UMLForOOClassModeling_MultiplicityType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lower"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_MultiplicityType
			:type Integer
			:location "26:3-26:29"
		) ( struct-map
			KM3_Attribute
			:name "upper"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_MultiplicityType
			:type Integer
			:location "27:3-27:29"
		) ( struct-map
			KM3_Attribute
			:name "isOrdered"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_MultiplicityType
			:type Boolean
			:location "28:3-28:33"
		) ( struct-map
			KM3_Attribute
			:name "isUnique"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_MultiplicityType
			:type Boolean
			:location "29:3-29:32"
		)]
	) ) ( def UMLForOOClassModeling_ModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_ModelElement
			:type String
			:location "38:3-38:27"
		)]
	) ) ( def UMLForOOClassModeling_Feature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLForOOClassModeling_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ownerScope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_Feature
			:type ScopeKind
			:location "42:3-42:36"
		) ( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_Feature
			:type VisibilityKind
			:location "43:3-43:41"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UMLForOOClassModeling_Feature
			:type UMLForOOClassModeling_Classifier
			:location "44:3-44:56"
			:isContainer false
			:opposite feature
		)]
	) ) ( def UMLForOOClassModeling_NameSpace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLForOOClassModeling_ModelElement]
		:structuralFeatures[]
	) ) ( def UMLForOOClassModeling_GeneralizableElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLForOOClassModeling_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_GeneralizableElement
			:type Boolean
			:location "50:3-50:30"
		) ( struct-map
			KM3_Attribute
			:name "isLeaf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_GeneralizableElement
			:type Boolean
			:location "51:3-51:30"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_GeneralizableElement
			:type Boolean
			:location "52:3-52:34"
		)]
	) ) ( def UMLForOOClassModeling_Classifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLForOOClassModeling_NameSpace UMLForOOClassModeling_GeneralizableElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "feature"
			:upper -1
			:lower 0
			:isOrdered true
			:owner UMLForOOClassModeling_Classifier
			:type UMLForOOClassModeling_Feature
			:location "56:3-56:69"
			:isContainer true
			:opposite owner
		)]
	) ) ( def UMLForOOClassModeling_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLForOOClassModeling_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isActive"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_Class
			:type Boolean
			:location "60:3-60:32"
		)]
	) ) ( def UMLForOOClassModeling_StructuralFeature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLForOOClassModeling_Feature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isChangeable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_StructuralFeature
			:type Boolean
			:location "65:3-65:36"
		) ( struct-map
			KM3_Attribute
			:name "targetScope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_StructuralFeature
			:type ScopeKind
			:location "66:3-66:37"
		) ( struct-map
			KM3_Reference
			:name "multiplicity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_StructuralFeature
			:type UMLForOOClassModeling_MultiplicityType
			:location "64:3-64:45"
			:isContainer false
		)]
	) ) ( def UMLForOOClassModeling_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLForOOClassModeling_StructuralFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "initialValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_Attribute
			:type String
			:location "70:3-70:35"
		)]
	) ) ( def UMLForOOClassModeling_BehavioralFeature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLForOOClassModeling_Feature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isQuery"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_BehavioralFeature
			:type Boolean
			:location "74:3-74:31"
		)]
	) ) ( def UMLForOOClassModeling_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLForOOClassModeling_BehavioralFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_Operation
			:type Boolean
			:location "78:3-78:30"
		) ( struct-map
			KM3_Attribute
			:name "isLeaf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_Operation
			:type Boolean
			:location "79:3-79:30"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_Operation
			:type Boolean
			:location "80:3-80:34"
		) ( struct-map
			KM3_Attribute
			:name "specification"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLForOOClassModeling_Operation
			:type String
			:location "81:3-81:36"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "91:2-91:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "92:2-92:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "93:2-93:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "94:2-94:18"
	) )]
) )
