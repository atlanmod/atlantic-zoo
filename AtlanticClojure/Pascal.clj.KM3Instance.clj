( declare Pascal_Program )
( declare Pascal_Variable )
( declare Pascal_Type )
( declare Pascal_Parameter )
( declare Pascal_Instruction )
( declare Pascal_Calculation )
( declare Pascal_Control )
( declare Pascal_Assignment )
( declare Pascal_Block )
( declare Pascal_Conditional )
( declare Pascal_Loop )
( declare Pascal_Procedure )
( declare Pascal_Function )
( declare Pascal_For )
( declare Pascal_While )
( declare Pascal_Repeat )
( declare PrimitiveTypes_String )
( def Pascal ( struct-map
	KM3_Package
	:contents[( def Pascal_Program ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Program
			:type String
			:location "11:3-11:27"
		) ( struct-map
			KM3_Reference
			:name "variables"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Pascal_Program
			:type Pascal_Variable
			:location "12:3-12:66"
			:isContainer true
			:opposite program
		) ( struct-map
			KM3_Reference
			:name "types"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Pascal_Program
			:type Pascal_Type
			:location "13:3-13:58"
			:isContainer true
			:opposite program
		) ( struct-map
			KM3_Reference
			:name "procedures"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Pascal_Program
			:type Pascal_Procedure
			:location "14:3-14:68"
			:isContainer true
			:opposite program
		)]
	) ) ( def Pascal_Variable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Variable
			:type String
			:location "18:3-18:27"
		) ( struct-map
			KM3_Reference
			:name "program"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Variable
			:type Pascal_Program
			:location "19:3-19:52"
			:isContainer false
			:opposite variables
		) ( struct-map
			KM3_Reference
			:name "procedure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Variable
			:type Pascal_Procedure
			:location "20:3-20:56"
			:isContainer false
			:opposite variables
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Variable
			:type Pascal_Type
			:location "21:3-21:46"
			:isContainer false
			:opposite variables
		)]
	) ) ( def Pascal_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Type
			:type String
			:location "25:3-25:27"
		) ( struct-map
			KM3_Reference
			:name "program"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Type
			:type Pascal_Program
			:location "26:3-26:48"
			:isContainer false
			:opposite types
		) ( struct-map
			KM3_Reference
			:name "variables"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Pascal_Type
			:type Pascal_Variable
			:location "27:3-27:53"
			:isContainer false
			:opposite type
		)]
	) ) ( def Pascal_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Pascal_Variable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "procedure_parameter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Parameter
			:type Pascal_Procedure
			:location "31:3-31:67"
			:isContainer false
			:opposite parameters
		)]
	) ) ( def Pascal_Instruction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "block"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Instruction
			:type Pascal_Block
			:location "35:3-35:51"
			:isContainer false
			:opposite instructions
		)]
	) ) ( def Pascal_Calculation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Pascal_Instruction]
		:structuralFeatures[]
	) ) ( def Pascal_Control ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Pascal_Instruction]
		:structuralFeatures[]
	) ) ( def Pascal_Assignment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Pascal_Instruction]
		:structuralFeatures[]
	) ) ( def Pascal_Block ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Pascal_Instruction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "instructions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Pascal_Block
			:type Pascal_Instruction
			:location "45:3-45:78"
			:isContainer true
			:opposite block
		) ( struct-map
			KM3_Reference
			:name "procedure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Block
			:type Pascal_Procedure
			:location "46:3-46:62"
			:isContainer false
			:opposite block_procedure
		) ( struct-map
			KM3_Reference
			:name "loop"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Block
			:type Pascal_Loop
			:location "47:3-47:47"
			:isContainer false
			:opposite block_loop
		) ( struct-map
			KM3_Reference
			:name "conditional"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Block
			:type Pascal_Conditional
			:location "48:3-48:57"
			:isContainer false
			:opposite blocks
		)]
	) ) ( def Pascal_Conditional ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Pascal_Control]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "blocks"
			:upper 2
			:lower 1
			:isOrdered true
			:owner Pascal_Conditional
			:type Pascal_Block
			:location "52:3-52:74"
			:isContainer true
			:opposite conditional
		)]
	) ) ( def Pascal_Loop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Pascal_Control]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "block_loop"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Loop
			:type Pascal_Block
			:location "56:3-56:58"
			:isContainer true
			:opposite loop
		)]
	) ) ( def Pascal_Procedure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Pascal_Control]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Procedure
			:type String
			:location "60:3-60:27"
		) ( struct-map
			KM3_Reference
			:name "program"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Procedure
			:type Pascal_Program
			:location "61:3-61:53"
			:isContainer false
			:opposite procedures
		) ( struct-map
			KM3_Reference
			:name "variables"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Pascal_Procedure
			:type Pascal_Variable
			:location "62:3-62:68"
			:isContainer true
			:opposite procedure
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Pascal_Procedure
			:type Pascal_Parameter
			:location "63:3-63:80"
			:isContainer true
			:opposite procedure_parameter
		) ( struct-map
			KM3_Reference
			:name "block_procedure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Procedure
			:type Pascal_Block
			:location "64:3-64:68"
			:isContainer true
			:opposite procedure
		)]
	) ) ( def Pascal_Function ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Pascal_Procedure]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "returnType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Pascal_Function
			:type Pascal_Type
			:location "68:3-68:31"
			:isContainer false
		)]
	) ) ( def Pascal_For ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Pascal_Loop]
		:structuralFeatures[]
	) ) ( def Pascal_While ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Pascal_Loop]
		:structuralFeatures[]
	) ) ( def Pascal_Repeat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Pascal_Loop]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "81:2-81:18"
	) )]
) )
