( declare IMSTransactionMessage_OIMAPrefixFormats )
( declare IMSTransactionMessage_TwoByteField )
( declare IMSTransactionMessage_VariableLengthField )
( declare IMSTransactionMessage_IMSTransactionMessage )
( declare IMSTransactionMessage_OIMAPrefix )
( declare IMSTransactionMessage_ControlData )
( declare IMSTransactionMessage_StateData )
( declare IMSTransactionMessage_SecurityData )
( declare IMSTransactionMessage_UserData )
( declare IMSTransactionMessage_StandardFields )
( declare IMSTransactionMessage_ApplicationData )
( declare IMSTransactionMessage_Field )
( declare IMSTransactionMessage_TDLangElement )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def IMSTransactionMessage ( struct-map
	KM3_Package
	:contents[( def OIMAPrefixFormats ( :literals[( struct-map
		KM3_EnumLiteral
		:name "opp_one"
		:location "14:3-14:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "opp_two"
		:location "15:3-15:19"
	)] ) ) ( def IMSTransactionMessage_TwoByteField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def IMSTransactionMessage_VariableLengthField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def IMSTransactionMessage_IMSTransactionMessage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "OIMAPrefixFormat"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IMSTransactionMessage_IMSTransactionMessage
			:type OIMAPrefixFormats
			:location "31:3-31:50"
		) ( struct-map
			KM3_Attribute
			:name "standardFieldsFlag"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IMSTransactionMessage_IMSTransactionMessage
			:type Boolean
			:location "32:3-32:42"
		) ( struct-map
			KM3_Reference
			:name "OIMAPrefixComponent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner IMSTransactionMessage_IMSTransactionMessage
			:type IMSTransactionMessage_OIMAPrefix
			:location "33:3-33:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "standardFieldComponent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner IMSTransactionMessage_IMSTransactionMessage
			:type IMSTransactionMessage_StandardFields
			:location "34:3-34:68"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "messageComponent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IMSTransactionMessage_IMSTransactionMessage
			:type IMSTransactionMessage_ApplicationData
			:location "35:3-35:58"
			:isContainer true
		)]
	) ) ( def IMSTransactionMessage_OIMAPrefix ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "controlDataComponent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IMSTransactionMessage_OIMAPrefix
			:type IMSTransactionMessage_ControlData
			:location "39:3-39:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "stateDataComponent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IMSTransactionMessage_OIMAPrefix
			:type IMSTransactionMessage_StateData
			:location "40:3-40:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "securityDataComponent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner IMSTransactionMessage_OIMAPrefix
			:type IMSTransactionMessage_SecurityData
			:location "41:3-41:65"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "userDataComponent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner IMSTransactionMessage_OIMAPrefix
			:type IMSTransactionMessage_UserData
			:location "42:3-42:57"
			:isContainer true
		)]
	) ) ( def IMSTransactionMessage_ControlData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def IMSTransactionMessage_StateData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def IMSTransactionMessage_SecurityData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def IMSTransactionMessage_UserData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def IMSTransactionMessage_StandardFields ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "length"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IMSTransactionMessage_StandardFields
			:type IMSTransactionMessage_TwoByteField
			:location "58:3-58:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "reservedField"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IMSTransactionMessage_StandardFields
			:type IMSTransactionMessage_TwoByteField
			:location "59:3-59:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "transactionCode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IMSTransactionMessage_StandardFields
			:type IMSTransactionMessage_VariableLengthField
			:location "61:3-61:51"
			:isContainer false
		)]
	) ) ( def IMSTransactionMessage_ApplicationData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "languageElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IMSTransactionMessage_ApplicationData
			:type IMSTransactionMessage_TDLangElement
			:location "66:3-66:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "fieldComponents"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IMSTransactionMessage_ApplicationData
			:type IMSTransactionMessage_Field
			:location "67:3-67:78"
			:isContainer true
			:opposite fieldContainer
		)]
	) ) ( def IMSTransactionMessage_Field ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fieldContainer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IMSTransactionMessage_Field
			:type IMSTransactionMessage_ApplicationData
			:location "71:3-71:73"
			:isContainer false
			:opposite fieldComponents
		)]
	) ) ( def IMSTransactionMessage_TDLangElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "83:2-83:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "84:2-84:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "85:2-85:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "86:2-86:18"
	) )]
) )
