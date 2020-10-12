( declare ClassDiagram_Class )
( declare ClassDiagram_Property )
( declare ClassDiagram_Operation )
( declare ClassDiagram_Interface )
( declare ClassDiagram_Classifier )
( declare ClassDiagram_Package )
( declare ClassDiagram_Association )
( declare ClassDiagram_PackagedElement )
( declare ClassDiagram_Parameter )
( declare ClassDiagram_DataType )
( declare ClassDiagram_Enumeration )
( declare ClassDiagram_AggregationKind )
( declare ClassDiagram_type )
( declare ClassDiagram_TypedElement )
( declare ClassDiagram_ParameterDirectionKind )
( declare ClassDiagram_MultiplicityElement )
( declare ClassDiagram_EnumerationLiteral )
( declare ClassDiagram_NamedElement )
( declare ClassDiagram_Generalization )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Int )
( def ClassDiagram ( struct-map
	KM3_Package
	:contents[( def AggregationKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "none"
		:location "57:3-57:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "shared"
		:location "58:3-58:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "composite"
		:location "59:3-59:21"
	)] ) ) ( def ParameterDirectionKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "IN"
		:location "71:3-71:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "INOUT"
		:location "72:3-72:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "OUT"
		:location "73:3-73:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "RETURN"
		:location "74:3-74:18"
	)] ) ) ( def ClassDiagram_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ClassDiagram_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nestedClassifier"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassDiagram_Class
			:type ClassDiagram_Classifier
			:location "10:3-10:64"
			:isContainer true
		)]
	) ) ( def ClassDiagram_Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ClassDiagram_TypedElement ClassDiagram_MultiplicityElement ClassDiagram_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "aggregation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ClassDiagram_Property
			:type AggregationKind
			:location "14:3-14:48"
		)]
	) ) ( def ClassDiagram_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ClassDiagram_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedParmeter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassDiagram_Operation
			:type ClassDiagram_Parameter
			:location "18:3-18:60"
			:isContainer true
		)]
	) ) ( def ClassDiagram_Interface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ClassDiagram_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nestedClassifier"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassDiagram_Interface
			:type ClassDiagram_Classifier
			:location "22:3-22:64"
			:isContainer true
		)]
	) ) ( def ClassDiagram_Classifier ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ClassDiagram_PackagedElement ClassDiagram_type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedProperty"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassDiagram_Classifier
			:type ClassDiagram_Property
			:location "26:3-26:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ownedOperation"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassDiagram_Classifier
			:type ClassDiagram_Operation
			:location "27:3-27:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ownedElement"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassDiagram_Classifier
			:type ClassDiagram_Generalization
			:location "28:3-28:64"
			:isContainer true
		)]
	) ) ( def ClassDiagram_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ClassDiagram_PackagedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedPackagedElement"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassDiagram_Package
			:type ClassDiagram_PackagedElement
			:location "32:3-32:73"
			:isContainer true
		)]
	) ) ( def ClassDiagram_Association ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ClassDiagram_PackagedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedEnd"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassDiagram_Association
			:type ClassDiagram_Property
			:location "36:3-36:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "memberEnd"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassDiagram_Association
			:type ClassDiagram_Property
			:location "37:3-37:45"
			:isContainer false
		)]
	) ) ( def ClassDiagram_PackagedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ClassDiagram_NamedElement]
		:structuralFeatures[]
	) ) ( def ClassDiagram_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ClassDiagram_TypedElement ClassDiagram_MultiplicityElement ClassDiagram_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "direction"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ClassDiagram_Parameter
			:type ParameterDirectionKind
			:location "45:3-45:53"
		)]
	) ) ( def ClassDiagram_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ClassDiagram_Classifier]
		:structuralFeatures[]
	) ) ( def ClassDiagram_Enumeration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ClassDiagram_DataType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedLiteral"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassDiagram_Enumeration
			:type ClassDiagram_EnumerationLiteral
			:location "53:3-53:68"
			:isContainer true
		)]
	) ) ( def ClassDiagram_type ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ClassDiagram_PackagedElement]
		:structuralFeatures[]
	) ) ( def ClassDiagram_TypedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ClassDiagram_TypedElement
			:type ClassDiagram_type
			:location "67:3-67:30"
			:isContainer false
		)]
	) ) ( def ClassDiagram_MultiplicityElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "upper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ClassDiagram_MultiplicityElement
			:type Int
			:location "78:3-78:31"
		) ( struct-map
			KM3_Attribute
			:name "lower"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ClassDiagram_MultiplicityElement
			:type Int
			:location "79:3-79:31"
		)]
	) ) ( def ClassDiagram_EnumerationLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ClassDiagram_NamedElement]
		:structuralFeatures[]
	) ) ( def ClassDiagram_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ClassDiagram_NamedElement
			:type String
			:location "87:3-87:33"
		)]
	) ) ( def ClassDiagram_Generalization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "general"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ClassDiagram_Generalization
			:type ClassDiagram_Classifier
			:location "91:3-91:39"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "95:5-95:21"
	) ) ( def ptyp_Int ( struct-map
		KM3_DataType
		:name "Int"
		:location "96:5-96:18"
	) )]
) )
