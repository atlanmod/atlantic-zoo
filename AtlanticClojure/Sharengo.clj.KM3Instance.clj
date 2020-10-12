( declare MMASharengo_ModelElement )
( declare MMASharengo_Classifier )
( declare MMASharengo_Operation )
( declare MMASharengo_Service )
( declare MMASharengo_BusinessObject )
( declare MMASharengo_ServiceOperation )
( declare MMASharengo_BusinessObjectOperation )
( declare MMASharengo_BusinessRule )
( declare MMASharengo_Flow )
( declare MMASharengo_Service2BusinessObjectFlow )
( declare PrimitiveTypes_String )
( def MMASharengo ( struct-map
	KM3_Package
	:contents[( def MMASharengo_ModelElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MMASharengo_ModelElement
			:type String
			:location "11:3-11:27"
		)]
	) ) ( def MMASharengo_Classifier ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MMASharengo_ModelElement]
		:structuralFeatures[]
	) ) ( def MMASharengo_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MMASharengo_ModelElement]
		:structuralFeatures[]
	) ) ( def MMASharengo_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MMASharengo_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MMASharengo_Service
			:type MMASharengo_ServiceOperation
			:location "21:3-21:58"
			:isContainer true
		)]
	) ) ( def MMASharengo_BusinessObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MMASharengo_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MMASharengo_BusinessObject
			:type MMASharengo_BusinessObjectOperation
			:location "25:6-25:68"
			:isContainer true
		)]
	) ) ( def MMASharengo_ServiceOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MMASharengo_Operation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "BOFlows"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MMASharengo_ServiceOperation
			:type MMASharengo_Service2BusinessObjectFlow
			:location "29:3-29:65"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MMASharengo_ServiceOperation
			:type MMASharengo_BusinessRule
			:location "30:3-30:49"
			:isContainer true
		)]
	) ) ( def MMASharengo_BusinessObjectOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MMASharengo_Operation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MMASharengo_BusinessObjectOperation
			:type MMASharengo_BusinessRule
			:location "34:3-34:49"
			:isContainer true
		)]
	) ) ( def MMASharengo_BusinessRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MMASharengo_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "expr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MMASharengo_BusinessRule
			:type String
			:location "38:3-38:26"
		)]
	) ) ( def MMASharengo_Flow ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MMASharengo_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MMASharengo_Flow
			:type String
			:location "42:3-42:29"
		) ( struct-map
			KM3_Attribute
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MMASharengo_Flow
			:type String
			:location "43:3-43:29"
		)]
	) ) ( def MMASharengo_Service2BusinessObjectFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MMASharengo_Flow]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "52:2-52:18"
	) )]
) )
