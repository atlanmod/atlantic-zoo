( declare QoSProfile_QoSComponent )
( declare QoSProfile_Operation )
( declare QoSProfile_QoSProfile )
( declare QoSProfile_CompoundProfile )
( declare QoSProfile_SimpleProfile )
( declare QoSProfile_QoSStatement )
( declare QoSProfile_ProfileTransition )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def QoSProfile ( struct-map
	KM3_Package
	:contents[( def QoSProfile_QoSComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operations"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSProfile_QoSComponent
			:type QoSProfile_Operation
			:location "16:4-16:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "profile"
			:upper -1
			:lower 0
			:isOrdered false
			:owner QoSProfile_QoSComponent
			:type QoSProfile_QoSProfile
			:location "17:4-17:54"
			:isContainer false
			:opposite for
		)]
	) ) ( def QoSProfile_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def QoSProfile_QoSProfile ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "for"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSProfile_QoSProfile
			:type QoSProfile_QoSComponent
			:location "24:4-24:52"
			:isContainer false
			:opposite profile
		)]
	) ) ( def QoSProfile_CompoundProfile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSProfile_QoSProfile]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "profileTransition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner QoSProfile_CompoundProfile
			:type QoSProfile_ProfileTransition
			:location "28:3-28:82"
			:isContainer false
			:opposite compoundProfile
		) ( struct-map
			KM3_Reference
			:name "simpleProfile"
			:upper -1
			:lower 1
			:isOrdered true
			:owner QoSProfile_CompoundProfile
			:type QoSProfile_SimpleProfile
			:location "29:3-29:94"
			:isContainer true
			:opposite compoundProfile
		)]
	) ) ( def QoSProfile_SimpleProfile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSProfile_QoSProfile]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "compoundProfile"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSProfile_SimpleProfile
			:type QoSProfile_CompoundProfile
			:location "33:3-33:72"
			:isContainer false
			:opposite simpleProfile
		) ( struct-map
			KM3_Reference
			:name "uses"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSProfile_SimpleProfile
			:type QoSProfile_QoSStatement
			:location "34:3-34:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "provides"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSProfile_SimpleProfile
			:type QoSProfile_QoSStatement
			:location "35:3-35:37"
			:isContainer false
		)]
	) ) ( def QoSProfile_QoSStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def QoSProfile_ProfileTransition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner QoSProfile_ProfileTransition
			:type QoSProfile_Operation
			:location "42:3-42:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSProfile_ProfileTransition
			:type QoSProfile_SimpleProfile
			:location "43:3-43:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSProfile_ProfileTransition
			:type QoSProfile_SimpleProfile
			:location "44:3-44:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "compoundProfile"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSProfile_ProfileTransition
			:type QoSProfile_CompoundProfile
			:location "45:3-45:86"
			:isContainer true
			:opposite profileTransition
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "51:2-51:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "52:2-52:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "53:2-53:18"
	) )]
) )
