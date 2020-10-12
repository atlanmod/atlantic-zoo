( declare JAVA_JavaElement )
( declare JAVA_ClassFeature )
( declare JAVA_ClassMember )
( declare JAVA_Field )
( declare JAVA_JavaClass )
( declare JAVA_Method )
( declare JAVA_Package )
( declare JAVA_PrimitiveType )
( declare JAVA_FeatureParameter )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def JAVA ( struct-map
	KM3_Package
	:contents[( def JAVA_JavaElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_JavaElement
			:type String
			:location "10:3-10:27"
		)]
	) ) ( def JAVA_ClassFeature ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[JAVA_JavaElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isFinal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_ClassFeature
			:type Boolean
			:location "14:3-14:31"
		)]
	) ) ( def JAVA_ClassMember ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[JAVA_ClassFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isStatic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_ClassMember
			:type Boolean
			:location "20:3-20:32"
		) ( struct-map
			KM3_Attribute
			:name "isPublic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_ClassMember
			:type Boolean
			:location "21:3-21:32"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_ClassMember
			:type JAVA_JavaClass
			:location "18:3-18:50"
			:isContainer false
			:opposite members
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_ClassMember
			:type JAVA_JavaClass
			:location "19:3-19:55"
			:isContainer false
			:opposite typedElements
		)]
	) ) ( def JAVA_Field ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_ClassMember]
		:structuralFeatures[]
	) ) ( def JAVA_JavaClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_ClassFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_JavaClass
			:type Boolean
			:location "31:3-31:34"
		) ( struct-map
			KM3_Attribute
			:name "isStatic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_JavaClass
			:type Boolean
			:location "32:3-32:32"
		) ( struct-map
			KM3_Attribute
			:name "isPublic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_JavaClass
			:type Boolean
			:location "33:3-33:32"
		) ( struct-map
			KM3_Reference
			:name "members"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JAVA_JavaClass
			:type JAVA_ClassMember
			:location "27:3-27:65"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "package"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_JavaClass
			:type JAVA_Package
			:location "28:3-28:52"
			:isContainer false
			:opposite classes
		) ( struct-map
			KM3_Reference
			:name "typedElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JAVA_JavaClass
			:type JAVA_ClassMember
			:location "29:3-29:60"
			:isContainer false
			:opposite type
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JAVA_JavaClass
			:type JAVA_FeatureParameter
			:location "30:3-30:62"
			:isContainer false
			:opposite type
		)]
	) ) ( def JAVA_Method ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_ClassMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JAVA_Method
			:type JAVA_FeatureParameter
			:location "37:3-37:82"
			:isContainer true
			:opposite method
		)]
	) ) ( def JAVA_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_JavaElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JAVA_Package
			:type JAVA_JavaClass
			:location "41:3-41:67"
			:isContainer true
			:opposite package
		)]
	) ) ( def JAVA_PrimitiveType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_JavaClass]
		:structuralFeatures[]
	) ) ( def JAVA_FeatureParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_ClassFeature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_FeatureParameter
			:type JAVA_JavaClass
			:location "47:3-47:52"
			:isContainer false
			:opposite parameters
		) ( struct-map
			KM3_Reference
			:name "method"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_FeatureParameter
			:type JAVA_Method
			:location "48:3-48:51"
			:isContainer false
			:opposite parameters
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "53:2-53:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "54:2-54:19"
	) )]
) )
