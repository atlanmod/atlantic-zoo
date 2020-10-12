( declare XSLT_Node )
( declare XSLT_ElementNode )
( declare XSLT_AttributeNode )
( declare XSLT_RootNode )
( declare XSLT_TextNode )
( declare XSLT_XSLTNode )
( declare XSLT_XSLTRootNode )
( declare XSLT_Document )
( declare XSLT_ApplyTemplates )
( declare XSLT_If )
( declare XSLT_Template )
( declare XSLT_ValueOf )
( declare XSLT_When )
( declare XSLT_Choose )
( declare XSLT_Otherwise )
( declare XSLT_Sort )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def XSLT ( struct-map
	KM3_Package
	:contents[( def XSLT_Node ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_Node
			:type String
			:location "13:6-13:30"
		) ( struct-map
			KM3_Reference
			:name "parentNode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XSLT_Node
			:type XSLT_ElementNode
			:location "14:3-14:60"
			:isContainer false
			:opposite nodes
		)]
	) ) ( def XSLT_ElementNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_Node]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nodes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XSLT_ElementNode
			:type XSLT_Node
			:location "20:3-20:69"
			:isContainer true
			:opposite parentNode
		)]
	) ) ( def XSLT_AttributeNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_Node]
		:structuralFeatures[]
	) ) ( def XSLT_RootNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_ElementNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_RootNode
			:type XSLT_Document
			:location "30:3-30:63"
			:isContainer true
			:opposite document
		)]
	) ) ( def XSLT_TextNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_ElementNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_TextNode
			:type String
			:location "34:6-34:31"
		)]
	) ) ( def XSLT_XSLTNode ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XSLT_ElementNode]
		:structuralFeatures[]
	) ) ( def XSLT_XSLTRootNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_RootNode]
		:structuralFeatures[]
	) ) ( def XSLT_Document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "documentName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_Document
			:type String
			:location "46:6-46:38"
		) ( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_Document
			:type XSLT_RootNode
			:location "47:3-47:63"
			:isContainer true
			:opposite document
		)]
	) ) ( def XSLT_ApplyTemplates ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_XSLTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "select"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_ApplyTemplates
			:type String
			:location "53:6-53:32"
		)]
	) ) ( def XSLT_If ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_XSLTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "test"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_If
			:type String
			:location "57:6-57:30"
		)]
	) ) ( def XSLT_Template ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_XSLTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "match"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_Template
			:type String
			:location "61:6-61:31"
		)]
	) ) ( def XSLT_ValueOf ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_XSLTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "select"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_ValueOf
			:type String
			:location "65:6-65:32"
		)]
	) ) ( def XSLT_When ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_XSLTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "test"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_When
			:type String
			:location "69:6-69:30"
		)]
	) ) ( def XSLT_Choose ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_XSLTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "when"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_Choose
			:type XSLT_When
			:location "74:3-74:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "otherwise"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_Choose
			:type XSLT_Otherwise
			:location "75:3-75:45"
			:isContainer true
		)]
	) ) ( def XSLT_Otherwise ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_XSLTNode]
		:structuralFeatures[]
	) ) ( def XSLT_Sort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSLT_XSLTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "select"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSLT_Sort
			:type String
			:location "84:6-84:31"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "90:2-90:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "91:2-91:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "92:2-92:18"
	) )]
) )
