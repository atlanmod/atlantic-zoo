( declare Reqtify_Project )
( declare Reqtify_TypedElement )
( declare Reqtify_ElementWithIL )
( declare Reqtify_Document )
( declare Reqtify_TextElement )
( declare Reqtify_Section )
( declare Reqtify_AbstractRequirement )
( declare Reqtify_Requirement )
( declare Reqtify_MacroRequirement )
( declare Reqtify_CoverLink )
( declare Reqtify_Attribute )
( declare PrimitiveTypes_String )
( def Reqtify ( struct-map
	KM3_Package
	:contents[( def Reqtify_Project ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "documents"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Reqtify_Project
			:type Reqtify_Document
			:location "11:3-11:69"
			:isContainer true
			:opposite project
		)]
	) ) ( def Reqtify_TypedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Reqtify_TypedElement
			:type String
			:location "15:3-15:27"
		)]
	) ) ( def Reqtify_ElementWithIL ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Reqtify_TypedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Reqtify_ElementWithIL
			:type String
			:location "19:3-19:27"
		) ( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Reqtify_ElementWithIL
			:type String
			:location "20:3-20:28"
		)]
	) ) ( def Reqtify_Document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Reqtify_ElementWithIL]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "project"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Reqtify_Document
			:type Reqtify_Project
			:location "24:3-24:52"
			:isContainer false
			:opposite documents
		) ( struct-map
			KM3_Reference
			:name "sections"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Reqtify_Document
			:type Reqtify_Section
			:location "25:3-25:66"
			:isContainer true
			:opposite document
		)]
	) ) ( def Reqtify_TextElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Reqtify_ElementWithIL]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Reqtify_TextElement
			:type String
			:location "29:5-29:36"
		)]
	) ) ( def Reqtify_Section ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Reqtify_TextElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Reqtify_Section
			:type Reqtify_Document
			:location "33:3-33:59"
			:isContainer false
			:opposite sections
		) ( struct-map
			KM3_Reference
			:name "sectionChildren"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Reqtify_Section
			:type Reqtify_Section
			:location "34:3-34:78"
			:isContainer true
			:opposite sectionParent
		) ( struct-map
			KM3_Reference
			:name "sectionParent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Reqtify_Section
			:type Reqtify_Section
			:location "35:3-35:70"
			:isContainer false
			:opposite sectionChildren
		) ( struct-map
			KM3_Reference
			:name "requirements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Reqtify_Section
			:type Reqtify_AbstractRequirement
			:location "36:3-36:81"
			:isContainer true
			:opposite section
		)]
	) ) ( def Reqtify_AbstractRequirement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Reqtify_TextElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "section"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Reqtify_AbstractRequirement
			:type Reqtify_Section
			:location "41:3-41:61"
			:isContainer false
			:opposite requirements
		) ( struct-map
			KM3_Reference
			:name "isContained"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Reqtify_AbstractRequirement
			:type Reqtify_MacroRequirement
			:location "42:3-42:70"
			:isContainer false
			:opposite contains
		) ( struct-map
			KM3_Reference
			:name "coverLinks"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Reqtify_AbstractRequirement
			:type Reqtify_CoverLink
			:location "43:3-43:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "attribute"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Reqtify_AbstractRequirement
			:type Reqtify_Attribute
			:location "44:3-44:51"
			:isContainer true
		)]
	) ) ( def Reqtify_Requirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Reqtify_AbstractRequirement]
		:structuralFeatures[]
	) ) ( def Reqtify_MacroRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Reqtify_AbstractRequirement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contains"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Reqtify_MacroRequirement
			:type Reqtify_AbstractRequirement
			:location "51:3-51:80"
			:isContainer true
			:opposite isContained
		)]
	) ) ( def Reqtify_CoverLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Reqtify_TypedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "linkWith"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Reqtify_CoverLink
			:type Reqtify_AbstractRequirement
			:location "57:3-57:44"
			:isContainer false
		)]
	) ) ( def Reqtify_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Reqtify_TypedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Reqtify_Attribute
			:type String
			:location "61:3-61:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "67:3-67:19"
	) )]
) )
