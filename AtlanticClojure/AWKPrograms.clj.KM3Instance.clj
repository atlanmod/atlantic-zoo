( declare AWKPrograms_AWKProgram )
( declare AWKPrograms_File )
( declare AWKPrograms_Record )
( declare AWKPrograms_Field )
( declare AWKPrograms_Script )
( declare AWKPrograms_Rule )
( declare AWKPrograms_Pattern )
( declare AWKPrograms_Action )
( declare AWKPrograms_Instruction )
( declare AWKPrograms_InitialRule )
( declare AWKPrograms_FinalRule )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def AWKPrograms ( struct-map
	KM3_Package
	:contents[( def AWKPrograms_AWKProgram ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_AWKProgram
			:type String
			:location "14:3-14:27"
		) ( struct-map
			KM3_Reference
			:name "input"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_AWKProgram
			:type AWKPrograms_File
			:location "15:3-15:26"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "output"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_AWKProgram
			:type AWKPrograms_File
			:location "16:3-16:27"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "script"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_AWKProgram
			:type AWKPrograms_Script
			:location "17:3-17:29"
			:isContainer false
		)]
	) ) ( def AWKPrograms_File ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_File
			:type String
			:location "21:3-21:27"
		) ( struct-map
			KM3_Reference
			:name "records"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AWKPrograms_File
			:type AWKPrograms_Record
			:location "22:3-22:69"
			:isContainer true
			:opposite r_file
		)]
	) ) ( def AWKPrograms_Record ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "r_file"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_Record
			:type AWKPrograms_File
			:location "26:3-26:46"
			:isContainer false
			:opposite records
		) ( struct-map
			KM3_Reference
			:name "fields"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AWKPrograms_Record
			:type AWKPrograms_Field
			:location "27:3-27:69"
			:isContainer true
			:opposite f_record
		)]
	) ) ( def AWKPrograms_Field ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_Field
			:type String
			:location "31:3-31:28"
		) ( struct-map
			KM3_Reference
			:name "f_record"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_Field
			:type AWKPrograms_Record
			:location "32:3-32:49"
			:isContainer false
			:opposite fields
		)]
	) ) ( def AWKPrograms_Script ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_Script
			:type String
			:location "36:3-36:27"
		) ( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AWKPrograms_Script
			:type AWKPrograms_Rule
			:location "37:3-37:67"
			:isContainer true
			:opposite r_script
		)]
	) ) ( def AWKPrograms_Rule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "r_script"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_Rule
			:type AWKPrograms_Script
			:location "41:3-41:48"
			:isContainer false
			:opposite rules
		) ( struct-map
			KM3_Reference
			:name "pattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_Rule
			:type AWKPrograms_Pattern
			:location "42:3-42:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_Rule
			:type AWKPrograms_Action
			:location "43:3-43:29"
			:isContainer false
		)]
	) ) ( def AWKPrograms_Pattern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "regularExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_Pattern
			:type String
			:location "47:3-47:40"
		)]
	) ) ( def AWKPrograms_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "instructions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AWKPrograms_Action
			:type AWKPrograms_Instruction
			:location "51:3-51:81"
			:isContainer true
			:opposite i_action
		)]
	) ) ( def AWKPrograms_Instruction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_Instruction
			:type String
			:location "55:3-55:28"
		) ( struct-map
			KM3_Reference
			:name "i_action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AWKPrograms_Instruction
			:type AWKPrograms_Action
			:location "56:3-56:55"
			:isContainer false
			:opposite instructions
		)]
	) ) ( def AWKPrograms_InitialRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AWKPrograms_Rule]
		:structuralFeatures[]
	) ) ( def AWKPrograms_FinalRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AWKPrograms_Rule]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "72:2-72:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "73:2-73:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "74:2-74:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "75:2-75:18"
	) )]
) )
