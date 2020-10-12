( declare OpenQVT_Variable )
( declare OpenQVT_Context )
( declare OpenQVT_Rule )
( declare OpenQVT_RootRule )
( declare OpenQVT_RuleSetCall )
( declare OpenQVT_QARule )
( declare OpenQVT_RuleSet )
( declare OpenQVT_Service )
( declare OpenQVT_OCLService )
( declare OpenQVT_RTransService )
( declare OpenQVT_JavaService )
( declare OpenQVT_RulePart )
( declare OpenQVT_Action )
( declare OpenQVT_RTransAction )
( declare OpenQVT_JavaAction )
( declare OpenQVT_Query )
( declare OpenQVT_OCLFilter )
( declare OpenQVT_RTransQuery )
( declare OpenQVT_JavaQuery )
( declare OpenQVT_JavaFilter )
( declare PrimitiveTypes_String )
( def OpenQVT ( struct-map
	KM3_Package
	:contents[( def OpenQVT_Variable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Variable
			:type String
			:location "11:3-11:27"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Variable
			:type String
			:location "12:3-12:27"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Variable
			:type String
			:location "13:3-13:28"
		) ( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Variable
			:type String
			:location "14:3-14:33"
		) ( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Variable
			:type OpenQVT_Context
			:location "15:3-15:52"
			:isContainer false
			:opposite variables
		)]
	) ) ( def OpenQVT_Context ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "variables"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OpenQVT_Context
			:type OpenQVT_Variable
			:location "19:3-19:66"
			:isContainer true
			:opposite context
		) ( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Context
			:type OpenQVT_Rule
			:location "20:3-20:44"
			:isContainer false
			:opposite context
		)]
	) ) ( def OpenQVT_Rule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Rule
			:type OpenQVT_Context
			:location "24:3-24:57"
			:isContainer true
			:opposite rule
		) ( struct-map
			KM3_Reference
			:name "subRule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Rule
			:type OpenQVT_Rule
			:location "25:3-25:59"
			:isContainer true
			:opposite superRule
		) ( struct-map
			KM3_Reference
			:name "superRule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Rule
			:type OpenQVT_Rule
			:location "26:3-26:49"
			:isContainer false
			:opposite subRule
		) ( struct-map
			KM3_Reference
			:name "services"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OpenQVT_Rule
			:type OpenQVT_Service
			:location "27:3-27:61"
			:isContainer true
			:opposite rule
		)]
	) ) ( def OpenQVT_RootRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ruleSet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_RootRule
			:type OpenQVT_RuleSet
			:location "31:3-31:51"
			:isContainer false
			:opposite rootRule
		)]
	) ) ( def OpenQVT_RuleSetCall ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ruleSet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_RuleSetCall
			:type OpenQVT_RuleSet
			:location "35:3-35:31"
			:isContainer false
		)]
	) ) ( def OpenQVT_QARule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "query"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_QARule
			:type OpenQVT_Query
			:location "39:3-39:55"
			:isContainer true
			:opposite qARule
		) ( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_QARule
			:type OpenQVT_Action
			:location "40:3-40:57"
			:isContainer true
			:opposite qARule
		)]
	) ) ( def OpenQVT_RuleSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rootRule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_RuleSet
			:type OpenQVT_RootRule
			:location "44:3-44:62"
			:isContainer true
			:opposite ruleSet
		)]
	) ) ( def OpenQVT_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Service
			:type String
			:location "48:3-48:33"
		) ( struct-map
			KM3_Attribute
			:name "signature"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Service
			:type String
			:location "49:3-49:32"
		) ( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Service
			:type OpenQVT_Rule
			:location "50:3-50:45"
			:isContainer false
			:opposite services
		)]
	) ) ( def OpenQVT_OCLService ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_Service]
		:structuralFeatures[]
	) ) ( def OpenQVT_RTransService ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_Service]
		:structuralFeatures[]
	) ) ( def OpenQVT_JavaService ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_Service]
		:structuralFeatures[]
	) ) ( def OpenQVT_RulePart ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "service"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_RulePart
			:type OpenQVT_Service
			:location "60:3-60:31"
			:isContainer false
		)]
	) ) ( def OpenQVT_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_RulePart]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "qARule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Action
			:type OpenQVT_QARule
			:location "64:3-64:47"
			:isContainer false
			:opposite action
		)]
	) ) ( def OpenQVT_RTransAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_Action]
		:structuralFeatures[]
	) ) ( def OpenQVT_JavaAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_Action]
		:structuralFeatures[]
	) ) ( def OpenQVT_Query ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_RulePart]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "qARule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OpenQVT_Query
			:type OpenQVT_QARule
			:location "72:3-72:46"
			:isContainer false
			:opposite query
		)]
	) ) ( def OpenQVT_OCLFilter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_Query]
		:structuralFeatures[]
	) ) ( def OpenQVT_RTransQuery ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_Query]
		:structuralFeatures[]
	) ) ( def OpenQVT_JavaQuery ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_Query]
		:structuralFeatures[]
	) ) ( def OpenQVT_JavaFilter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OpenQVT_Query]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "87:2-87:18"
	) )]
) )
