( declare SPL_LocatedElement )
( declare SPL_Program )
( declare SPL_Service )
( declare SPL_Session )
( declare SPL_Registration )
( declare SPL_Dialog )
( declare SPL_Event )
( declare SPL_Method )
( declare SPL_Argument )
( declare SPL_MethodName )
( declare SPL_SIPMethodName )
( declare SPL_ControlMethodName )
( declare SPL_Branch )
( declare SPL_DefaultBranch )
( declare SPL_NamedBranch )
( declare SPL_TypeExpression )
( declare SPL_SimpleType )
( declare SPL_SequenceType )
( declare SPL_DefinedType )
( declare SPL_Declaration )
( declare SPL_VariableDeclaration )
( declare SPL_FunctionDeclaration )
( declare SPL_RemoteFunctionDeclaration )
( declare SPL_LocalFunctionDeclaration )
( declare SPL_StructureDeclaration )
( declare SPL_StructureProperty )
( declare SPL_FunctionCall )
( declare SPL_Statement )
( declare SPL_CompoundStat )
( declare SPL_SetStat )
( declare SPL_DeclarationStat )
( declare SPL_ReturnStat )
( declare SPL_IfStat )
( declare SPL_WhenStat )
( declare SPL_ForeachStat )
( declare SPL_SelectStat )
( declare SPL_FunctionCallStat )
( declare SPL_ContinueStat )
( declare SPL_BreakStat )
( declare SPL_PushStat )
( declare SPL_WhenHeader )
( declare SPL_SelectMember )
( declare SPL_SelectDefault )
( declare SPL_SelectCase )
( declare SPL_Expression )
( declare SPL_ConstantExp )
( declare SPL_OperatorExp )
( declare SPL_ForwardExp )
( declare SPL_WithExp )
( declare SPL_BlockExp )
( declare SPL_ReasonExp )
( declare SPL_BODYExp )
( declare SPL_RequestURIExp )
( declare SPL_PopExp )
( declare SPL_FunctionCallExp )
( declare SPL_Place )
( declare SPL_SIPHeaderPlace )
( declare SPL_VariablePlace )
( declare SPL_PropertyCallPlace )
( declare SPL_Variable )
( declare SPL_MessageField )
( declare SPL_ReasonMessageField )
( declare SPL_HeadedMessageField )
( declare SPL_Constant )
( declare SPL_BooleanConstant )
( declare SPL_IntegerConstant )
( declare SPL_StringConstant )
( declare SPL_URIConstant )
( declare SPL_SequenceConstant )
( declare SPL_ResponseConstant )
( declare SPL_Response )
( declare SPL_SuccessResponse )
( declare SPL_ErrorResponse )
( declare SPL_ClientErrorResponse )
( declare SPL_GlobalErrorResponse )
( declare SPL_RedirectionErrorResponse )
( declare SPL_ServerErrorResponse )
( declare Enum_Direction )
( declare Enum_SIPMethod )
( declare Enum_ControlMethod )
( declare Enum_PrimitiveType )
( declare Enum_Modifier )
( declare Enum_FunctionLocation )
( declare Enum_SIPHeader )
( declare Enum_SuccessKind )
( declare Enum_ClientErrorKind )
( declare Enum_GlobalErrorKind )
( declare Enum_RedirectionErrorKind )
( declare Enum_ServerErrorKind )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def SPL ( struct-map
	KM3_Package
	:contents[( def SPL_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_LocatedElement
			:type String
			:location "11:3-11:31"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_LocatedElement
			:type String
			:location "12:3-12:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_LocatedElement
			:type String
			:location "13:3-13:47"
		)]
	) ) ( def SPL_Program ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "service"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_Program
			:type SPL_Service
			:location "17:3-17:41"
			:isContainer true
		)]
	) ) ( def SPL_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_Service
			:type String
			:location "21:3-21:27"
		) ( struct-map
			KM3_Reference
			:name "declarations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_Service
			:type SPL_Declaration
			:location "22:3-22:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "sessions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_Service
			:type SPL_Session
			:location "23:3-23:53"
			:isContainer true
		)]
	) ) ( def SPL_Session ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[]
	) ) ( def SPL_Registration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Session]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "declarations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_Registration
			:type SPL_Declaration
			:location "31:3-31:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "sessions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_Registration
			:type SPL_Session
			:location "32:3-32:53"
			:isContainer true
		)]
	) ) ( def SPL_Dialog ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Session]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "declarations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_Dialog
			:type SPL_Declaration
			:location "36:3-36:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "methods"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_Dialog
			:type SPL_Method
			:location "37:3-37:53"
			:isContainer true
		)]
	) ) ( def SPL_Event ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Session]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "eventId"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_Event
			:type String
			:location "41:3-41:30"
		) ( struct-map
			KM3_Reference
			:name "declarations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_Event
			:type SPL_Declaration
			:location "42:3-42:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "methods"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_Event
			:type SPL_Method
			:location "43:3-43:53"
			:isContainer true
		)]
	) ) ( def SPL_Method ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Session]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "direction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_Method
			:type Direction
			:location "49:3-49:35"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_Method
			:type SPL_TypeExpression
			:location "48:3-48:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "methodName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_Method
			:type SPL_MethodName
			:location "50:3-50:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_Method
			:type SPL_Argument
			:location "51:3-51:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_Method
			:type SPL_Statement
			:location "54:3-54:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "branches"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_Method
			:type SPL_Branch
			:location "55:3-55:54"
			:isContainer true
		)]
	) ) ( def SPL_Argument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_VariableDeclaration]
		:structuralFeatures[]
	) ) ( def SPL_MethodName ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[]
	) ) ( def SPL_SIPMethodName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_MethodName]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_SIPMethodName
			:type SIPMethod
			:location "75:3-75:30"
		)]
	) ) ( def SPL_ControlMethodName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_MethodName]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_ControlMethodName
			:type ControlMethod
			:location "79:3-79:34"
		)]
	) ) ( def SPL_Branch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_Branch
			:type SPL_Statement
			:location "87:3-87:59"
			:isContainer true
		)]
	) ) ( def SPL_DefaultBranch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Branch]
		:structuralFeatures[]
	) ) ( def SPL_NamedBranch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Branch]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_NamedBranch
			:type String
			:location "94:3-94:40"
		)]
	) ) ( def SPL_TypeExpression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[]
	) ) ( def SPL_SimpleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_TypeExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_SimpleType
			:type PrimitiveType
			:location "104:3-104:34"
		)]
	) ) ( def SPL_SequenceType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_TypeExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "modifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_SequenceType
			:type Modifier
			:location "108:3-108:38"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_SequenceType
			:type PrimitiveType
			:location "110:3-110:34"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_SequenceType
			:type Integer
			:location "111:3-111:33"
		)]
	) ) ( def SPL_DefinedType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_TypeExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "typeName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_DefinedType
			:type String
			:location "115:3-115:31"
		)]
	) ) ( def SPL_Declaration ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_Declaration
			:type String
			:location "121:3-121:27"
		)]
	) ) ( def SPL_VariableDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Declaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_VariableDeclaration
			:type SPL_TypeExpression
			:location "125:3-125:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "initExp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_VariableDeclaration
			:type SPL_Expression
			:location "126:3-126:49"
			:isContainer true
		)]
	) ) ( def SPL_FunctionDeclaration ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_Declaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "returnType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_FunctionDeclaration
			:type SPL_TypeExpression
			:location "131:3-131:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_FunctionDeclaration
			:type SPL_Argument
			:location "132:3-132:55"
			:isContainer true
		)]
	) ) ( def SPL_RemoteFunctionDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_FunctionDeclaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "functionLocation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_RemoteFunctionDeclaration
			:type FunctionLocation
			:location "136:3-136:49"
		)]
	) ) ( def SPL_LocalFunctionDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_FunctionDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_LocalFunctionDeclaration
			:type SPL_Statement
			:location "140:3-140:59"
			:isContainer true
		)]
	) ) ( def SPL_StructureDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Declaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_StructureDeclaration
			:type SPL_Argument
			:location "146:3-146:58"
			:isContainer true
		)]
	) ) ( def SPL_StructureProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_StructureProperty
			:type String
			:location "150:3-150:27"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_StructureProperty
			:type SPL_TypeExpression
			:location "151:3-151:45"
			:isContainer true
		)]
	) ) ( def SPL_FunctionCall ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "function"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_FunctionCall
			:type SPL_FunctionDeclaration
			:location "157:3-157:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_FunctionCall
			:type SPL_Expression
			:location "158:3-158:58"
			:isContainer true
		)]
	) ) ( def SPL_Statement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[]
	) ) ( def SPL_CompoundStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SPL_CompoundStat
			:type SPL_Statement
			:location "166:3-166:51"
			:isContainer true
		)]
	) ) ( def SPL_SetStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_SetStat
			:type SPL_Place
			:location "170:3-170:38"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "setValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_SetStat
			:type SPL_Expression
			:location "171:3-171:45"
			:isContainer true
		)]
	) ) ( def SPL_DeclarationStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "declaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_DeclarationStat
			:type SPL_Declaration
			:location "175:3-175:49"
			:isContainer true
		)]
	) ) ( def SPL_ReturnStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "returnedValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_ReturnStat
			:type SPL_Expression
			:location "179:3-179:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "branch"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_ReturnStat
			:type SPL_NamedBranch
			:location "180:3-180:39"
			:isContainer false
		)]
	) ) ( def SPL_IfStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_IfStat
			:type SPL_Expression
			:location "184:3-184:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenStatements"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_IfStat
			:type SPL_Statement
			:location "185:3-185:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseStatements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_IfStat
			:type SPL_Statement
			:location "186:3-186:61"
			:isContainer true
		)]
	) ) ( def SPL_WhenStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "idExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_WhenStat
			:type SPL_Variable
			:location "190:3-190:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "whenHeaders"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_WhenStat
			:type SPL_WhenHeader
			:location "191:3-191:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_WhenStat
			:type SPL_Statement
			:location "192:3-192:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseStatements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_WhenStat
			:type SPL_Statement
			:location "193:3-193:63"
			:isContainer true
		)]
	) ) ( def SPL_ForeachStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Statement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iteratorName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_ForeachStat
			:type String
			:location "197:3-197:35"
		) ( struct-map
			KM3_Reference
			:name "sequenceExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_ForeachStat
			:type SPL_Expression
			:location "198:3-198:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_ForeachStat
			:type SPL_Statement
			:location "199:3-199:59"
			:isContainer true
		)]
	) ) ( def SPL_SelectStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "matchedExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_SelectStat
			:type SPL_Expression
			:location "203:3-203:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "selectCases"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_SelectStat
			:type SPL_SelectCase
			:location "204:3-204:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "selectDefault"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_SelectStat
			:type SPL_SelectDefault
			:location "205:3-205:58"
			:isContainer true
		)]
	) ) ( def SPL_FunctionCallStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "functionCall"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_FunctionCallStat
			:type SPL_FunctionCall
			:location "209:3-209:51"
			:isContainer true
		)]
	) ) ( def SPL_ContinueStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Statement]
		:structuralFeatures[]
	) ) ( def SPL_BreakStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Statement]
		:structuralFeatures[]
	) ) ( def SPL_PushStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_PushStat
			:type SPL_Place
			:location "219:3-219:38"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "pushedValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_PushStat
			:type SPL_Expression
			:location "220:3-220:48"
			:isContainer true
		)]
	) ) ( def SPL_WhenHeader ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_VariableDeclaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "headerId"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_WhenHeader
			:type String
			:location "226:3-226:31"
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_WhenHeader
			:type SPL_Constant
			:location "227:3-227:45"
			:isContainer true
		)]
	) ) ( def SPL_SelectMember ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_SelectMember
			:type SPL_Statement
			:location "231:3-231:57"
			:isContainer true
		)]
	) ) ( def SPL_SelectDefault ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_SelectMember]
		:structuralFeatures[]
	) ) ( def SPL_SelectCase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_SelectMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "values"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_SelectCase
			:type SPL_Constant
			:location "238:3-238:54"
			:isContainer true
		)]
	) ) ( def SPL_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[]
	) ) ( def SPL_ConstantExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_ConstantExp
			:type SPL_Constant
			:location "246:3-246:40"
			:isContainer true
		)]
	) ) ( def SPL_OperatorExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "opName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_OperatorExp
			:type String
			:location "250:3-250:29"
		) ( struct-map
			KM3_Reference
			:name "leftExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_OperatorExp
			:type SPL_Expression
			:location "251:3-251:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rightExp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_OperatorExp
			:type SPL_Expression
			:location "252:3-252:50"
			:isContainer true
		)]
	) ) ( def SPL_ForwardExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isParallel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_ForwardExp
			:type Boolean
			:location "256:3-256:34"
		) ( struct-map
			KM3_Reference
			:name "exp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_ForwardExp
			:type SPL_Expression
			:location "257:3-257:45"
			:isContainer true
		)]
	) ) ( def SPL_WithExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "exp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_WithExp
			:type SPL_Expression
			:location "261:3-261:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "msgFields"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SPL_WithExp
			:type SPL_MessageField
			:location "262:3-262:61"
			:isContainer true
		)]
	) ) ( def SPL_BlockExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "exp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_BlockExp
			:type SPL_Expression
			:location "266:3-266:40"
			:isContainer true
		)]
	) ) ( def SPL_ReasonExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Expression]
		:structuralFeatures[]
	) ) ( def SPL_BODYExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Expression]
		:structuralFeatures[]
	) ) ( def SPL_RequestURIExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Expression]
		:structuralFeatures[]
	) ) ( def SPL_PopExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_PopExp
			:type SPL_Place
			:location "279:3-279:38"
			:isContainer true
		)]
	) ) ( def SPL_FunctionCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "functionCall"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_FunctionCallExp
			:type SPL_FunctionCall
			:location "283:3-283:51"
			:isContainer true
		)]
	) ) ( def SPL_Place ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_Expression]
		:structuralFeatures[]
	) ) ( def SPL_SIPHeaderPlace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Place]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "header"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_SIPHeaderPlace
			:type SIPHeader
			:location "291:3-291:32"
		)]
	) ) ( def SPL_VariablePlace ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_Place]
		:structuralFeatures[]
	) ) ( def SPL_PropertyCallPlace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_VariablePlace]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "propName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_PropertyCallPlace
			:type String
			:location "298:3-298:31"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_PropertyCallPlace
			:type SPL_VariablePlace
			:location "299:3-299:46"
			:isContainer true
		)]
	) ) ( def SPL_Variable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_VariablePlace]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_Variable
			:type SPL_Declaration
			:location "303:3-303:34"
			:isContainer false
		)]
	) ) ( def SPL_MessageField ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "exp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_MessageField
			:type SPL_Expression
			:location "308:3-308:40"
			:isContainer true
		)]
	) ) ( def SPL_ReasonMessageField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_MessageField]
		:structuralFeatures[]
	) ) ( def SPL_HeadedMessageField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_MessageField]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "headerId"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_HeadedMessageField
			:type String
			:location "315:3-315:31"
		)]
	) ) ( def SPL_Constant ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[]
	) ) ( def SPL_BooleanConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Constant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_BooleanConstant
			:type Boolean
			:location "324:3-324:29"
		)]
	) ) ( def SPL_IntegerConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Constant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_IntegerConstant
			:type Integer
			:location "328:3-328:29"
		)]
	) ) ( def SPL_StringConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Constant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_StringConstant
			:type String
			:location "332:3-332:28"
		)]
	) ) ( def SPL_URIConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Constant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "uri"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_URIConstant
			:type String
			:location "336:3-336:26"
		)]
	) ) ( def SPL_SequenceConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Constant]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "values"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SPL_SequenceConstant
			:type SPL_Constant
			:location "340:3-340:52"
			:isContainer true
		)]
	) ) ( def SPL_ResponseConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Constant]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "response"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_ResponseConstant
			:type SPL_Response
			:location "344:3-344:43"
			:isContainer true
		)]
	) ) ( def SPL_Response ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SPL_LocatedElement]
		:structuralFeatures[]
	) ) ( def SPL_SuccessResponse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Response]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "successKind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPL_SuccessResponse
			:type SuccessKind
			:location "353:3-353:39"
		)]
	) ) ( def SPL_ErrorResponse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_Response]
		:structuralFeatures[]
	) ) ( def SPL_ClientErrorResponse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_ErrorResponse]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "errorKind"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_ClientErrorResponse
			:type ClientErrorKind
			:location "360:3-360:46"
		)]
	) ) ( def SPL_GlobalErrorResponse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_ErrorResponse]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "errorKind"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_GlobalErrorResponse
			:type GlobalErrorKind
			:location "364:3-364:46"
		)]
	) ) ( def SPL_RedirectionErrorResponse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_ErrorResponse]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "errorKind"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_RedirectionErrorResponse
			:type RedirectionErrorKind
			:location "368:3-368:51"
		)]
	) ) ( def SPL_ServerErrorResponse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPL_ErrorResponse]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "errorKind"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPL_ServerErrorResponse
			:type ServerErrorKind
			:location "372:3-372:46"
		)]
	) )]
) )
( def Enum ( struct-map
	KM3_Package
	:contents[( def Direction ( :literals[( struct-map
		KM3_EnumLiteral
		:name "inout"
		:location "381:3-381:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "in"
		:location "382:3-382:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "out"
		:location "383:3-383:15"
	)] ) ) ( def SIPMethod ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ACK"
		:location "387:3-387:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "BYE"
		:location "388:3-388:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "CANCEL"
		:location "389:3-389:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "INVITE"
		:location "390:3-390:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "NOTIFY"
		:location "391:3-391:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "OPTIONS"
		:location "392:3-392:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "REACK"
		:location "393:3-393:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "REGISTER"
		:location "394:3-394:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "REINVITE"
		:location "395:3-395:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "REREGISTER"
		:location "396:3-396:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "RESUBSCRIBE"
		:location "397:3-397:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "SUBSCRIBE"
		:location "398:3-398:21"
	)] ) ) ( def ControlMethod ( :literals[( struct-map
		KM3_EnumLiteral
		:name "deploy"
		:location "402:3-402:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "undeploy"
		:location "403:3-403:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "uninvite"
		:location "404:3-404:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "unregister"
		:location "405:3-405:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "unsubscribe"
		:location "406:3-406:23"
	)] ) ) ( def PrimitiveType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "void"
		:location "410:3-410:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "bool"
		:location "411:3-411:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "int"
		:location "412:3-412:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "request"
		:location "413:3-413:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "response"
		:location "414:3-414:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "string"
		:location "415:3-415:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "time"
		:location "416:3-416:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "uri"
		:location "417:3-417:15"
	)] ) ) ( def Modifier ( :literals[( struct-map
		KM3_EnumLiteral
		:name "LIFO"
		:location "421:3-421:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "FIFO"
		:location "422:3-422:16"
	)] ) ) ( def FunctionLocation ( :literals[( struct-map
		KM3_EnumLiteral
		:name "remote"
		:location "426:3-426:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "local"
		:location "427:3-427:17"
	)] ) ) ( def SIPHeader ( :literals[( struct-map
		KM3_EnumLiteral
		:name "CALL_ID"
		:location "431:3-431:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "CONTACT"
		:location "432:3-432:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "CSEQ"
		:location "433:3-433:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "EVENT"
		:location "434:3-434:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "FROM"
		:location "435:3-435:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "MAX_FORWARDS"
		:location "436:3-436:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "SUBSCRIPTION_STATE"
		:location "437:3-437:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "TO"
		:location "438:3-438:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "VIA"
		:location "439:3-439:15"
	)] ) ) ( def SuccessKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "OK"
		:location "443:3-443:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "ACCEPTED"
		:location "444:3-444:20"
	)] ) ) ( def ClientErrorKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ADDRESS_INCOMPLETE"
		:location "448:3-448:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "AMBIGUOUS"
		:location "449:3-449:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "BAD_EXTENSION"
		:location "450:3-450:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "BAD_REQUEST"
		:location "451:3-451:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "BUSY_HERE"
		:location "452:3-452:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "CALL_OR_TRANSACTION_DOES_NOT_EXIST"
		:location "453:3-453:46"
	) ( struct-map
		KM3_EnumLiteral
		:name "EXTENSION_REQUIRED"
		:location "454:3-454:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "FORBIDDEN"
		:location "455:3-455:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "GONE"
		:location "456:3-456:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "INTERVAL_TOO_BRIEF"
		:location "457:3-457:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "LOOP_DETECTED"
		:location "458:3-458:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "METHOD_NOT_ALLOWED"
		:location "459:3-459:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "NOT_ACCEPTABLE_HERE"
		:location "460:3-460:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "NOT_ACCEPTABLE"
		:location "461:3-461:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "NOT_FOUND"
		:location "462:3-462:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "PAYMENT_REQUIRED"
		:location "463:3-463:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "PROXY_AUTHENTICATION_REQUIRED"
		:location "464:3-464:41"
	) ( struct-map
		KM3_EnumLiteral
		:name "REQUESTURI_TOO_LONG"
		:location "465:3-465:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "REQUEST_ENTITY_TOO_LARGE"
		:location "466:3-466:36"
	) ( struct-map
		KM3_EnumLiteral
		:name "REQUEST_PENDING"
		:location "467:3-467:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "REQUEST_TERMINATED"
		:location "468:3-468:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "REQUEST_TIMEOUT"
		:location "469:3-469:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "TEMPORARILY_UNAVAILABLE"
		:location "470:3-470:35"
	) ( struct-map
		KM3_EnumLiteral
		:name "TOO_MANY_HOPS"
		:location "471:3-471:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "UNAUTHORIZED"
		:location "472:3-472:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "UNDECIPHERABLE"
		:location "473:3-473:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "UNSUPPORTED_MEDIA_TYPE"
		:location "474:3-474:34"
	) ( struct-map
		KM3_EnumLiteral
		:name "UNSUPPORTED_URI_SCHEME"
		:location "475:3-475:34"
	)] ) ) ( def GlobalErrorKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "BUSY_EVERYWHERE"
		:location "479:3-479:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "DECLINE"
		:location "480:3-480:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "DOES_NOT_EXIST_ANYWHERE"
		:location "481:3-481:35"
	) ( struct-map
		KM3_EnumLiteral
		:name "NOT_ACCEPTABLE"
		:location "482:3-482:26"
	)] ) ) ( def RedirectionErrorKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ALTERNATIVE_SERVICE"
		:location "486:3-486:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "MOVED_PERMANENTLY"
		:location "487:3-487:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "MOVED_TEMPORARILY"
		:location "488:3-488:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "MULTIPLE_CHOICES"
		:location "489:3-489:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "USE_PROXY"
		:location "490:3-490:21"
	)] ) ) ( def ServerErrorKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "BAD_GATEWAY"
		:location "494:3-494:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "MESSAGE_TOO_LARGE"
		:location "495:3-495:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "NOT_IMPLEMENTED"
		:location "496:3-496:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "SERVER_INTERNAL_ERROR"
		:location "497:3-497:33"
	) ( struct-map
		KM3_EnumLiteral
		:name "SERVER_TIMEOUT"
		:location "498:3-498:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "SERVICE_UNAVAILABLE"
		:location "499:3-499:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "VERSION_NOT_SUPPORTED"
		:location "500:3-500:33"
	)] ) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "528:2-528:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "529:2-529:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "530:2-530:19"
	) )]
) )
