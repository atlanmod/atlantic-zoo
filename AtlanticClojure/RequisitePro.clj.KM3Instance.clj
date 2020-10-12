( declare RequisitePro_DescribedElt )
( declare RequisitePro_NamedElt )
( declare RequisitePro_ContainerElt )
( declare RequisitePro_Project )
( declare RequisitePro_Package )
( declare RequisitePro_ContainedElt )
( declare RequisitePro_TypedElt )
( declare RequisitePro_Document )
( declare RequisitePro_Attribute )
( declare RequisitePro_Requirement )
( declare PrimitiveTypes_String )
( def RequisitePro ( struct-map
	KM3_Package
	:contents[( def RequisitePro_DescribedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RequisitePro_DescribedElt
			:type String
			:location "12:3-12:33"
		)]
	) ) ( def RequisitePro_NamedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RequisitePro_NamedElt
			:type String
			:location "16:3-16:26"
		)]
	) ) ( def RequisitePro_ContainerElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[RequisitePro_NamedElt RequisitePro_DescribedElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "content"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RequisitePro_ContainerElt
			:type RequisitePro_ContainedElt
			:location "21:3-21:70"
			:isContainer true
			:opposite package
		) ( struct-map
			KM3_Reference
			:name "packages"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RequisitePro_ContainerElt
			:type RequisitePro_Package
			:location "22:3-22:70"
			:isContainer true
			:opposite parentPackage
		)]
	) ) ( def RequisitePro_Project ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RequisitePro_ContainerElt]
		:structuralFeatures[]
	) ) ( def RequisitePro_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RequisitePro_ContainerElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parentPackage"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RequisitePro_Package
			:type RequisitePro_ContainerElt
			:location "29:3-29:61"
			:isContainer false
			:opposite packages
		)]
	) ) ( def RequisitePro_ContainedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "package"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RequisitePro_ContainedElt
			:type RequisitePro_ContainerElt
			:location "34:3-34:56"
			:isContainer false
			:opposite content
		)]
	) ) ( def RequisitePro_TypedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RequisitePro_TypedElt
			:type String
			:location "37:3-37:26"
		)]
	) ) ( def RequisitePro_Document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RequisitePro_DescribedElt RequisitePro_NamedElt RequisitePro_ContainedElt RequisitePro_TypedElt]
		:structuralFeatures[]
	) ) ( def RequisitePro_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RequisitePro_TypedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RequisitePro_Attribute
			:type String
			:location "44:3-44:27"
		)]
	) ) ( def RequisitePro_Requirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RequisitePro_NamedElt RequisitePro_ContainedElt RequisitePro_TypedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RequisitePro_Requirement
			:type String
			:location "48:3-48:26"
		) ( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RequisitePro_Requirement
			:type RequisitePro_Attribute
			:location "49:3-49:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RequisitePro_Requirement
			:type RequisitePro_Document
			:location "50:3-50:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RequisitePro_Requirement
			:type RequisitePro_Requirement
			:location "51:3-51:58"
			:isContainer false
			:opposite children
		) ( struct-map
			KM3_Reference
			:name "children"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RequisitePro_Requirement
			:type RequisitePro_Requirement
			:location "52:3-52:56"
			:isContainer false
			:opposite parent
		) ( struct-map
			KM3_Reference
			:name "coverLink"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RequisitePro_Requirement
			:type RequisitePro_Requirement
			:location "53:3-53:41"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "59:3-59:19"
	) )]
) )
