( declare Program_LocatedElement )
( declare Program_NamedElement )
( declare Program_Structure )
( declare Program_ProcContainerElement )
( declare Program_Program )
( declare Program_Monitor )
( declare Program_Procedure )
( declare Program_VariableDeclaration )
( declare Program_Parameter )
( declare Program_Direction )
( declare Program_Type )
( declare Program_Expression )
( declare Program_VariableExp )
( declare Program_PropertyCallExp )
( declare Program_OperatorCallExp )
( declare Program_AttributeCallExp )
( declare Program_ProcedureCallExp )
( declare Program_LiteralExp )
( declare Program_BooleanExp )
( declare Program_IntegerExp )
( declare Program_Statement )
( declare Program_AssignmentStat )
( declare Program_ConditionalStat )
( declare Program_WhileStat )
( declare Program_ExpressionStat )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def Program ( struct-map
	KM3_Package
	:contents[( def Direction ( :literals[( struct-map
		KM3_EnumLiteral
		:name "in"
		:location "54:3-54:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "out"
		:location "55:3-55:15"
	)] ) ) ( def Program_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_LocatedElement
			:type String
			:location "12:3-12:31"
		)]
	) ) ( def Program_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Program_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_NamedElement
			:type String
			:location "16:3-16:27"
		)]
	) ) ( def Program_Structure ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Program_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "variables"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Program_Structure
			:type Program_VariableDeclaration
			:location "20:3-20:87"
			:isContainer true
			:opposite structure
		)]
	) ) ( def Program_ProcContainerElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Program_Structure]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "procedures"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Program_ProcContainerElement
			:type Program_Procedure
			:location "24:3-24:80"
			:isContainer true
			:opposite container
		)]
	) ) ( def Program_Program ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_ProcContainerElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "monitors"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Program_Program
			:type Program_Monitor
			:location "28:3-28:72"
			:isContainer true
			:opposite program
		)]
	) ) ( def Program_Monitor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_ProcContainerElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "program"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_Monitor
			:type Program_Program
			:location "32:3-32:51"
			:isContainer false
			:opposite monitors
		)]
	) ) ( def Program_Procedure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_Structure]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_Procedure
			:type Program_ProcContainerElement
			:location "37:3-37:70"
			:isContainer false
			:opposite procedures
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Program_Procedure
			:type Program_Parameter
			:location "38:3-38:78"
			:isContainer true
			:opposite procedure
		) ( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Program_Procedure
			:type Program_Statement
			:location "39:3-39:57"
			:isContainer true
		)]
	) ) ( def Program_VariableDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_VariableDeclaration
			:type Program_Type
			:location "43:3-43:25"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "initialValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Program_VariableDeclaration
			:type Program_Expression
			:location "44:3-44:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "structure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_VariableDeclaration
			:type Program_Structure
			:location "45:3-45:56"
			:isContainer false
			:opposite variables
		)]
	) ) ( def Program_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_VariableDeclaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "direction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_Parameter
			:type Direction
			:location "49:3-49:35"
		) ( struct-map
			KM3_Reference
			:name "procedure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_Parameter
			:type Program_Procedure
			:location "50:3-50:57"
			:isContainer false
			:opposite parameters
		)]
	) ) ( def Program_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_NamedElement]
		:structuralFeatures[]
	) ) ( def Program_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Program_LocatedElement]
		:structuralFeatures[]
	) ) ( def Program_VariableExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "declaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_VariableExp
			:type Program_VariableDeclaration
			:location "69:3-69:47"
			:isContainer false
		)]
	) ) ( def Program_PropertyCallExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Program_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_PropertyCallExp
			:type String
			:location "75:3-75:27"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_PropertyCallExp
			:type Program_Expression
			:location "74:3-74:43"
			:isContainer true
		)]
	) ) ( def Program_OperatorCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_PropertyCallExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "right"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_OperatorCallExp
			:type Program_Expression
			:location "79:3-79:42"
			:isContainer true
		)]
	) ) ( def Program_AttributeCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_PropertyCallExp]
		:structuralFeatures[]
	) ) ( def Program_ProcedureCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_PropertyCallExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Program_ProcedureCallExp
			:type Program_Expression
			:location "86:3-86:57"
			:isContainer true
		)]
	) ) ( def Program_LiteralExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Program_Expression]
		:structuralFeatures[]
	) ) ( def Program_BooleanExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "symbol"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_BooleanExp
			:type Boolean
			:location "95:3-95:30"
		)]
	) ) ( def Program_IntegerExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "symbol"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_IntegerExp
			:type Integer
			:location "99:3-99:30"
		)]
	) ) ( def Program_Statement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Program_LocatedElement]
		:structuralFeatures[]
	) ) ( def Program_AssignmentStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_AssignmentStat
			:type Program_VariableExp
			:location "109:3-109:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_AssignmentStat
			:type Program_Expression
			:location "110:3-110:42"
			:isContainer true
		)]
	) ) ( def Program_ConditionalStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_ConditionalStat
			:type Program_Expression
			:location "114:3-114:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenStats"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Program_ConditionalStat
			:type Program_Statement
			:location "115:3-115:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseStats"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Program_ConditionalStat
			:type Program_Statement
			:location "116:3-116:48"
			:isContainer true
		)]
	) ) ( def Program_WhileStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_WhileStat
			:type Program_Expression
			:location "120:3-120:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "doStats"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Program_WhileStat
			:type Program_Statement
			:location "121:3-121:48"
			:isContainer true
		)]
	) ) ( def Program_ExpressionStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Program_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Program_ExpressionStat
			:type Program_Expression
			:location "125:3-125:47"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "131:2-131:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "132:2-132:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "133:2-133:18"
	) )]
) )
