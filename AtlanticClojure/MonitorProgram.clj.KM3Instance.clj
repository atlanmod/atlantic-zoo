( declare MonitorProgram_LocatedElement )
( declare MonitorProgram_NamedElement )
( declare MonitorProgram_Structure )
( declare MonitorProgram_ProcContainerElement )
( declare MonitorProgram_Program )
( declare MonitorProgram_Monitor )
( declare MonitorProgram_Procedure )
( declare MonitorProgram_VariableDeclaration )
( declare MonitorProgram_Parameter )
( declare MonitorProgram_Direction )
( declare MonitorProgram_Type )
( declare MonitorProgram_Expression )
( declare MonitorProgram_VariableExp )
( declare MonitorProgram_PropertyCallExp )
( declare MonitorProgram_OperatorCallExp )
( declare MonitorProgram_AttributeCallExp )
( declare MonitorProgram_ProcedureCallExp )
( declare MonitorProgram_LiteralExp )
( declare MonitorProgram_BooleanExp )
( declare MonitorProgram_IntegerExp )
( declare MonitorProgram_Statement )
( declare MonitorProgram_AssignmentStat )
( declare MonitorProgram_ConditionalStat )
( declare MonitorProgram_WhileStat )
( declare MonitorProgram_ExpressionStat )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def MonitorProgram ( struct-map
	KM3_Package
	:contents[( def Direction ( :literals[( struct-map
		KM3_EnumLiteral
		:name "in"
		:location "53:3-53:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "out"
		:location "54:3-54:15"
	)] ) ) ( def MonitorProgram_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_LocatedElement
			:type String
			:location "11:3-11:31"
		)]
	) ) ( def MonitorProgram_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MonitorProgram_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_NamedElement
			:type String
			:location "15:3-15:27"
		)]
	) ) ( def MonitorProgram_Structure ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MonitorProgram_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "variables"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MonitorProgram_Structure
			:type MonitorProgram_VariableDeclaration
			:location "19:3-19:87"
			:isContainer true
			:opposite structure
		)]
	) ) ( def MonitorProgram_ProcContainerElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MonitorProgram_Structure]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "procedures"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MonitorProgram_ProcContainerElement
			:type MonitorProgram_Procedure
			:location "23:3-23:80"
			:isContainer true
			:opposite container
		)]
	) ) ( def MonitorProgram_Program ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_ProcContainerElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "monitors"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MonitorProgram_Program
			:type MonitorProgram_Monitor
			:location "27:3-27:72"
			:isContainer true
			:opposite program
		)]
	) ) ( def MonitorProgram_Monitor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_ProcContainerElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "program"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_Monitor
			:type MonitorProgram_Program
			:location "31:3-31:51"
			:isContainer false
			:opposite monitors
		)]
	) ) ( def MonitorProgram_Procedure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_Structure]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_Procedure
			:type MonitorProgram_ProcContainerElement
			:location "36:3-36:70"
			:isContainer false
			:opposite procedures
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MonitorProgram_Procedure
			:type MonitorProgram_Parameter
			:location "37:3-37:78"
			:isContainer true
			:opposite procedure
		) ( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MonitorProgram_Procedure
			:type MonitorProgram_Statement
			:location "38:3-38:57"
			:isContainer true
		)]
	) ) ( def MonitorProgram_VariableDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_VariableDeclaration
			:type MonitorProgram_Type
			:location "42:3-42:25"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "initialValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MonitorProgram_VariableDeclaration
			:type MonitorProgram_Expression
			:location "43:3-43:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "structure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_VariableDeclaration
			:type MonitorProgram_Structure
			:location "44:3-44:56"
			:isContainer false
			:opposite variables
		)]
	) ) ( def MonitorProgram_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_VariableDeclaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "direction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_Parameter
			:type Direction
			:location "48:3-48:35"
		) ( struct-map
			KM3_Reference
			:name "procedure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_Parameter
			:type MonitorProgram_Procedure
			:location "49:3-49:57"
			:isContainer false
			:opposite parameters
		)]
	) ) ( def MonitorProgram_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_NamedElement]
		:structuralFeatures[]
	) ) ( def MonitorProgram_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MonitorProgram_LocatedElement]
		:structuralFeatures[]
	) ) ( def MonitorProgram_VariableExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "declaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_VariableExp
			:type MonitorProgram_VariableDeclaration
			:location "68:3-68:47"
			:isContainer false
		)]
	) ) ( def MonitorProgram_PropertyCallExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MonitorProgram_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_PropertyCallExp
			:type String
			:location "74:3-74:27"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_PropertyCallExp
			:type MonitorProgram_Expression
			:location "73:3-73:43"
			:isContainer true
		)]
	) ) ( def MonitorProgram_OperatorCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_PropertyCallExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "right"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_OperatorCallExp
			:type MonitorProgram_Expression
			:location "78:3-78:42"
			:isContainer true
		)]
	) ) ( def MonitorProgram_AttributeCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_PropertyCallExp]
		:structuralFeatures[]
	) ) ( def MonitorProgram_ProcedureCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_PropertyCallExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MonitorProgram_ProcedureCallExp
			:type MonitorProgram_Expression
			:location "85:3-85:57"
			:isContainer true
		)]
	) ) ( def MonitorProgram_LiteralExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MonitorProgram_Expression]
		:structuralFeatures[]
	) ) ( def MonitorProgram_BooleanExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "symbol"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_BooleanExp
			:type Boolean
			:location "94:3-94:30"
		)]
	) ) ( def MonitorProgram_IntegerExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "symbol"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_IntegerExp
			:type Integer
			:location "98:3-98:30"
		)]
	) ) ( def MonitorProgram_Statement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MonitorProgram_LocatedElement]
		:structuralFeatures[]
	) ) ( def MonitorProgram_AssignmentStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_AssignmentStat
			:type MonitorProgram_VariableExp
			:location "108:3-108:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_AssignmentStat
			:type MonitorProgram_Expression
			:location "109:3-109:42"
			:isContainer true
		)]
	) ) ( def MonitorProgram_ConditionalStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_ConditionalStat
			:type MonitorProgram_Expression
			:location "113:3-113:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenStats"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_ConditionalStat
			:type MonitorProgram_Statement
			:location "114:3-114:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseStats"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MonitorProgram_ConditionalStat
			:type MonitorProgram_Statement
			:location "115:3-115:48"
			:isContainer true
		)]
	) ) ( def MonitorProgram_WhileStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_WhileStat
			:type MonitorProgram_Expression
			:location "119:3-119:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "doStats"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_WhileStat
			:type MonitorProgram_Statement
			:location "120:3-120:48"
			:isContainer true
		)]
	) ) ( def MonitorProgram_ExpressionStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MonitorProgram_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MonitorProgram_ExpressionStat
			:type MonitorProgram_Expression
			:location "124:3-124:47"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "130:2-130:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "131:2-131:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "132:2-132:18"
	) )]
) )
