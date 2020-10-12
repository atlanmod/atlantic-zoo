( declare MTRANS_MetaClass )
( declare MTRANS_MetaModel )
( declare MTRANS_Module )
( declare MTRANS_Rule )
( declare MTRANS_Inheritance )
( declare MTRANS_Expression )
( declare MTRANS_Section )
( declare MTRANS_Instruction )
( declare MTRANS_Variable )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_String )
( def MTRANS ( struct-map
	KM3_Package
	:contents[( def MTRANS_MetaClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MTRANS_MetaModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MTRANS_Module ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Module
			:type String
			:location "15:3-15:27"
		) ( struct-map
			KM3_Attribute
			:name "mode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Module
			:type String
			:location "16:3-16:27"
		) ( struct-map
			KM3_Reference
			:name "metaDest"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MTRANS_Module
			:type MTRANS_MetaModel
			:location "17:3-17:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "metaSource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MTRANS_Module
			:type MTRANS_MetaModel
			:location "18:3-18:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MTRANS_Module
			:type MTRANS_Rule
			:location "19:3-19:59"
			:isContainer true
			:opposite module
		)]
	) ) ( def MTRANS_Rule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Rule
			:type Boolean
			:location "23:3-23:34"
		) ( struct-map
			KM3_Attribute
			:name "isEntryPoint"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Rule
			:type Boolean
			:location "24:3-24:36"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Rule
			:type String
			:location "25:3-25:27"
		) ( struct-map
			KM3_Reference
			:name "module"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Rule
			:type MTRANS_Module
			:location "26:3-26:46"
			:isContainer false
			:opposite rules
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MTRANS_Rule
			:type MTRANS_MetaClass
			:location "27:3-27:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MTRANS_Rule
			:type MTRANS_MetaClass
			:location "28:3-28:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "declaration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MTRANS_Rule
			:type MTRANS_Variable
			:location "29:3-29:67"
			:isContainer true
			:opposite rule
		) ( struct-map
			KM3_Reference
			:name "sections"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MTRANS_Rule
			:type MTRANS_Section
			:location "30:3-30:63"
			:isContainer true
			:opposite rule
		) ( struct-map
			KM3_Reference
			:name "guard"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MTRANS_Rule
			:type MTRANS_Expression
			:location "31:3-31:63"
			:isContainer true
			:opposite rule
		) ( struct-map
			KM3_Reference
			:name "inheritances"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MTRANS_Rule
			:type MTRANS_Inheritance
			:location "32:3-32:69"
			:isContainer true
			:opposite rule
		)]
	) ) ( def MTRANS_Inheritance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Inheritance
			:type MTRANS_Rule
			:location "36:3-36:49"
			:isContainer false
			:opposite inheritances
		) ( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MTRANS_Inheritance
			:type MTRANS_Expression
			:location "37:3-37:74"
			:isContainer true
			:opposite inheritance
		) ( struct-map
			KM3_Reference
			:name "inheritedRules"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MTRANS_Inheritance
			:type MTRANS_Rule
			:location "38:3-38:38"
			:isContainer false
		)]
	) ) ( def MTRANS_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "operator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Expression
			:type String
			:location "42:3-42:31"
		) ( struct-map
			KM3_Reference
			:name "inheritance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Expression
			:type MTRANS_Inheritance
			:location "43:3-43:62"
			:isContainer false
			:opposite expressions
		) ( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Expression
			:type MTRANS_Rule
			:location "44:3-44:42"
			:isContainer false
			:opposite guard
		) ( struct-map
			KM3_Reference
			:name "instruction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Expression
			:type MTRANS_Instruction
			:location "45:3-45:55"
			:isContainer false
			:opposite body
		)]
	) ) ( def MTRANS_Section ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Section
			:type String
			:location "49:3-49:27"
		) ( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Section
			:type MTRANS_Rule
			:location "50:3-50:45"
			:isContainer false
			:opposite sections
		) ( struct-map
			KM3_Reference
			:name "instructions"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MTRANS_Section
			:type MTRANS_Instruction
			:location "51:3-51:74"
			:isContainer true
			:opposite section
		)]
	) ) ( def MTRANS_Instruction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Instruction
			:type MTRANS_Expression
			:location "55:3-55:64"
			:isContainer true
			:opposite instruction
		) ( struct-map
			KM3_Reference
			:name "section"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Instruction
			:type MTRANS_Section
			:location "56:3-56:55"
			:isContainer false
			:opposite instructions
		)]
	) ) ( def MTRANS_Variable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Variable
			:type String
			:location "60:3-60:27"
		) ( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MTRANS_Variable
			:type MTRANS_Rule
			:location "61:3-61:48"
			:isContainer false
			:opposite declaration
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "67:2-67:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "68:2-68:18"
	) )]
) )
