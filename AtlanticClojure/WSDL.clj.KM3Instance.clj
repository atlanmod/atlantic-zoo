( declare WSDL_Port )
( declare WSDL_Service )
( declare WSDL_Param )
( declare WSDL_Input )
( declare WSDL_Output )
( declare WSDL_PortType )
( declare WSDL_Operation )
( declare WSDL_StartWithExtensions )
( declare WSDL_Binding )
( declare WSDL_BindingFault )
( declare WSDL_BindingOperation )
( declare WSDL_Fault )
( declare WSDL_Message )
( declare WSDL_Part )
( declare PrimitiveTypes_String )
( def WSDL ( struct-map
	KM3_Package
	:contents[( def WSDL_Port ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Port
			:type String
			:location "12:3-12:27"
		) ( struct-map
			KM3_Reference
			:name "service"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Port
			:type WSDL_Service
			:location "13:3-13:48"
			:isContainer false
			:opposite ports
		) ( struct-map
			KM3_Reference
			:name "binding"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Port
			:type WSDL_Binding
			:location "14:3-14:48"
			:isContainer false
			:opposite ports
		)]
	) ) ( def WSDL_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Service
			:type String
			:location "18:3-18:27"
		) ( struct-map
			KM3_Reference
			:name "ports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WSDL_Service
			:type WSDL_Port
			:location "19:3-19:58"
			:isContainer true
			:opposite service
		)]
	) ) ( def WSDL_Param ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Param
			:type String
			:location "23:3-23:27"
		) ( struct-map
			KM3_Reference
			:name "message"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Param
			:type WSDL_Message
			:location "24:3-24:49"
			:isContainer false
			:opposite params
		)]
	) ) ( def WSDL_Input ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WSDL_Param]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Input
			:type WSDL_Operation
			:location "28:3-28:54"
			:isContainer false
			:opposite input
		)]
	) ) ( def WSDL_Output ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WSDL_Param]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Output
			:type WSDL_Operation
			:location "32:3-32:55"
			:isContainer false
			:opposite output
		)]
	) ) ( def WSDL_PortType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_PortType
			:type String
			:location "36:3-36:27"
		) ( struct-map
			KM3_Reference
			:name "operations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WSDL_PortType
			:type WSDL_Operation
			:location "37:3-37:65"
			:isContainer true
			:opposite type
		) ( struct-map
			KM3_Reference
			:name "bindings"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WSDL_PortType
			:type WSDL_Binding
			:location "38:3-38:51"
			:isContainer false
			:opposite type
		)]
	) ) ( def WSDL_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Operation
			:type String
			:location "42:3-42:27"
		) ( struct-map
			KM3_Reference
			:name "input"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WSDL_Operation
			:type WSDL_Input
			:location "43:3-43:65"
			:isContainer true
			:opposite operation
		) ( struct-map
			KM3_Reference
			:name "output"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WSDL_Operation
			:type WSDL_Output
			:location "44:3-44:67"
			:isContainer true
			:opposite operation
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Operation
			:type WSDL_PortType
			:location "45:3-45:51"
			:isContainer false
			:opposite operations
		) ( struct-map
			KM3_Reference
			:name "faults"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WSDL_Operation
			:type WSDL_Fault
			:location "46:3-46:64"
			:isContainer true
			:opposite operation
		)]
	) ) ( def WSDL_StartWithExtensions ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def WSDL_Binding ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WSDL_StartWithExtensions]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Binding
			:type String
			:location "52:3-52:27"
		) ( struct-map
			KM3_Reference
			:name "ports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WSDL_Binding
			:type WSDL_Port
			:location "53:3-53:48"
			:isContainer false
			:opposite binding
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Binding
			:type WSDL_PortType
			:location "54:3-54:49"
			:isContainer false
			:opposite bindings
		) ( struct-map
			KM3_Reference
			:name "operations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WSDL_Binding
			:type WSDL_BindingOperation
			:location "55:3-55:72"
			:isContainer true
			:opposite bind
		)]
	) ) ( def WSDL_BindingFault ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WSDL_StartWithExtensions]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_BindingFault
			:type WSDL_BindingOperation
			:location "59:3-59:72"
			:isContainer true
			:opposite faults
		) ( struct-map
			KM3_Reference
			:name "binding"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_BindingFault
			:type WSDL_Fault
			:location "60:3-60:29"
			:isContainer false
		)]
	) ) ( def WSDL_BindingOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WSDL_StartWithExtensions]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_BindingOperation
			:type String
			:location "64:3-64:27"
		) ( struct-map
			KM3_Reference
			:name "bind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_BindingOperation
			:type WSDL_Binding
			:location "65:3-65:50"
			:isContainer false
			:opposite operations
		) ( struct-map
			KM3_Reference
			:name "binding"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_BindingOperation
			:type WSDL_Operation
			:location "66:3-66:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "input"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WSDL_BindingOperation
			:type WSDL_StartWithExtensions
			:location "67:3-67:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "output"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WSDL_BindingOperation
			:type WSDL_StartWithExtensions
			:location "68:3-68:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "faults"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WSDL_BindingOperation
			:type WSDL_BindingFault
			:location "69:3-69:71"
			:isContainer true
			:opposite operation
		)]
	) ) ( def WSDL_Fault ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Fault
			:type String
			:location "73:3-73:27"
		) ( struct-map
			KM3_Reference
			:name "operation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Fault
			:type WSDL_Operation
			:location "74:3-74:55"
			:isContainer false
			:opposite faults
		) ( struct-map
			KM3_Reference
			:name "message"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Fault
			:type WSDL_Message
			:location "75:3-75:49"
			:isContainer false
			:opposite faults
		)]
	) ) ( def WSDL_Message ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Message
			:type String
			:location "79:3-79:27"
		) ( struct-map
			KM3_Reference
			:name "params"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WSDL_Message
			:type WSDL_Param
			:location "80:3-80:50"
			:isContainer false
			:opposite message
		) ( struct-map
			KM3_Reference
			:name "faults"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WSDL_Message
			:type WSDL_Fault
			:location "81:3-81:50"
			:isContainer false
			:opposite message
		) ( struct-map
			KM3_Reference
			:name "parts"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WSDL_Message
			:type WSDL_Part
			:location "82:3-82:48"
			:isContainer false
			:opposite message
		)]
	) ) ( def WSDL_Part ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Part
			:type String
			:location "86:3-86:27"
		) ( struct-map
			KM3_Reference
			:name "message"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSDL_Part
			:type WSDL_Message
			:location "87:3-87:48"
			:isContainer false
			:opposite parts
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "92:2-92:18"
	) )]
) )
