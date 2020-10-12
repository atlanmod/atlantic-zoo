( declare C_CDataType )
( declare C_CIntegral )
( declare C_CFloating )
( declare C_CBitField )
( declare C_CVoid )
( declare C_CEnumeration )
( declare C_CInt )
( declare C_CChar )
( declare C_CDouble )
( declare C_CFloat )
( declare C_CLongDouble )
( declare C_CUnsignedInt )
( declare C_CLong )
( declare C_CLongLong )
( declare C_CShort )
( declare C_CSignedChar )
( declare C_CUnsignedChar )
( declare C_CWChar )
( declare C_UnsignedLong )
( declare C_UnsignedLongLong )
( declare C_UnsignedShort )
( declare C_CClassifier )
( declare C_Derived )
( declare C_CStructureContents )
( declare C_CStructured )
( declare C_CStruct )
( declare C_CUnion )
( declare C_CSourceText )
( declare C_CTypedElement )
( declare C_CStructuralFeature )
( declare C_CField )
( declare C_CParameter )
( declare C_BehavioralFeature )
( declare C_CFunction )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def C ( struct-map
	KM3_Package
	:contents[( def C_CDataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CClassifier]
		:structuralFeatures[]
	) ) ( def C_CIntegral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CDataType]
		:structuralFeatures[]
	) ) ( def C_CFloating ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CDataType]
		:structuralFeatures[]
	) ) ( def C_CBitField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CDataType]
		:structuralFeatures[]
	) ) ( def C_CVoid ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CDataType]
		:structuralFeatures[]
	) ) ( def C_CEnumeration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CIntegral]
		:structuralFeatures[]
	) ) ( def C_CInt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CIntegral]
		:structuralFeatures[]
	) ) ( def C_CChar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CIntegral]
		:structuralFeatures[]
	) ) ( def C_CDouble ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CFloating]
		:structuralFeatures[]
	) ) ( def C_CFloat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CFloating]
		:structuralFeatures[]
	) ) ( def C_CLongDouble ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CFloating]
		:structuralFeatures[]
	) ) ( def C_CUnsignedInt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CInt]
		:structuralFeatures[]
	) ) ( def C_CLong ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CInt]
		:structuralFeatures[]
	) ) ( def C_CLongLong ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CInt]
		:structuralFeatures[]
	) ) ( def C_CShort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CInt]
		:structuralFeatures[]
	) ) ( def C_CSignedChar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CChar]
		:structuralFeatures[]
	) ) ( def C_CUnsignedChar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CChar]
		:structuralFeatures[]
	) ) ( def C_CWChar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CChar]
		:structuralFeatures[]
	) ) ( def C_UnsignedLong ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CUnsignedInt]
		:structuralFeatures[]
	) ) ( def C_UnsignedLongLong ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CUnsignedInt]
		:structuralFeatures[]
	) ) ( def C_UnsignedShort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CUnsignedInt]
		:structuralFeatures[]
	) ) ( def C_CClassifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def C_Derived ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CClassifier]
		:structuralFeatures[]
	) ) ( def C_CStructureContents ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sc_container"
			:upper 1
			:lower 0
			:isOrdered false
			:owner C_CStructureContents
			:type C_CStructured
			:location "65:3-65:65"
			:isContainer false
			:opposite contains
		)]
	) ) ( def C_CStructured ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CClassifier C_CStructureContents]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contains"
			:upper -1
			:lower 0
			:isOrdered false
			:owner C_CStructured
			:type C_CStructureContents
			:location "69:3-69:80"
			:isContainer true
			:opposite sc_container
		)]
	) ) ( def C_CStruct ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CStructured]
		:structuralFeatures[]
	) ) ( def C_CUnion ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CStructured]
		:structuralFeatures[]
	) ) ( def C_CSourceText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner C_CSourceText
			:type String
			:location "77:3-77:29"
		) ( struct-map
			KM3_Attribute
			:name "fileName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner C_CSourceText
			:type String
			:location "78:3-78:31"
		)]
	) ) ( def C_CTypedElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner C_CTypedElement
			:type C_CClassifier
			:location "82:3-82:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner C_CTypedElement
			:type C_CSourceText
			:location "83:3-83:34"
			:isContainer false
		)]
	) ) ( def C_CStructuralFeature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CStructureContents C_CTypedElement]
		:structuralFeatures[]
	) ) ( def C_CField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CStructuralFeature]
		:structuralFeatures[]
	) ) ( def C_CParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_CTypedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "behavioralFeature"
			:upper 1
			:lower 0
			:isOrdered false
			:owner C_CParameter
			:type C_BehavioralFeature
			:location "91:3-91:78"
			:isContainer false
			:opposite parameters
		)]
	) ) ( def C_BehavioralFeature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner C_BehavioralFeature
			:type C_CParameter
			:location "95:3-95:79"
			:isContainer true
			:opposite behavioralFeature
		)]
	) ) ( def C_CFunction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[C_BehavioralFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isVarArg"
			:upper 1
			:lower 1
			:isOrdered false
			:owner C_CFunction
			:type Boolean
			:location "99:3-99:32"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "109:2-109:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "110:2-110:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "111:2-111:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "112:2-112:18"
	) )]
) )
