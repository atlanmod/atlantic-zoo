( declare RDFS_Resource )
( declare RDFS_Graph )
( declare RDFS_List )
( declare RDFS_Container )
( declare RDFS_Alt )
( declare RDFS_Bag )
( declare RDFS_Seq )
( declare RDFS_Property )
( declare RDFS_ContainerMembershipProperty )
( declare RDFS_Statement )
( declare RDFS_URIReferenceNode )
( declare RDFS_BlankNode )
( declare RDFS_Class )
( declare RDFS_Datatype )
( declare RDFS_Literal )
( declare RDFS_PlainLiteral )
( declare RDFS_TypedLiteral )
( declare RDFS_RDFXMLLiteral )
( declare RDFS_URIReference )
( declare RDFS_UniformResourceIdentifier )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def RDFS ( struct-map
	KM3_Package
	:contents[( def RDFS_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "graph"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_Resource
			:type RDFS_Graph
			:location "12:3-12:48"
			:isContainer false
			:opposite resources
		) ( struct-map
			KM3_Reference
			:name "uriRef"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Resource
			:type RDFS_URIReference
			:location "13:3-13:68"
			:isContainer true
			:opposite resource
		) ( struct-map
			KM3_Reference
			:name "subjectStatement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Resource
			:type RDFS_Statement
			:location "15:3-15:64"
			:isContainer false
			:opposite subject
		) ( struct-map
			KM3_Reference
			:name "objectStatement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Resource
			:type RDFS_Statement
			:location "16:3-16:62"
			:isContainer false
			:opposite object
		) ( struct-map
			KM3_Reference
			:name "label"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Resource
			:type RDFS_PlainLiteral
			:location "18:3-18:74"
			:isContainer true
			:opposite labeledResource
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper -1
			:lower 1
			:isOrdered false
			:owner RDFS_Resource
			:type RDFS_Class
			:location "19:3-19:56"
			:isContainer false
			:opposite typedResource
		) ( struct-map
			KM3_Reference
			:name "seeAlso"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Resource
			:type RDFS_Resource
			:location "22:3-22:64"
			:isContainer false
			:opposite referringResource
		) ( struct-map
			KM3_Reference
			:name "referringResource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Resource
			:type RDFS_Resource
			:location "23:3-23:64"
			:isContainer false
			:opposite seeAlso
		) ( struct-map
			KM3_Reference
			:name "member"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Resource
			:type RDFS_Resource
			:location "27:3-27:57"
			:isContainer false
			:opposite container
		) ( struct-map
			KM3_Reference
			:name "container"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Resource
			:type RDFS_Resource
			:location "28:3-28:57"
			:isContainer false
			:opposite member
		) ( struct-map
			KM3_Reference
			:name "list"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Resource
			:type RDFS_List
			:location "29:3-29:45"
			:isContainer false
			:opposite first
		)]
	) ) ( def RDFS_Graph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Resource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "graphName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_Graph
			:type RDFS_URIReference
			:location "33:3-33:75"
			:isContainer true
			:opposite namedGraph
		) ( struct-map
			KM3_Reference
			:name "resources"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Graph
			:type RDFS_Resource
			:location "34:3-34:64"
			:isContainer true
			:opposite graph
		)]
	) ) ( def RDFS_List ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Resource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "first"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_List
			:type RDFS_Resource
			:location "39:3-39:51"
			:isContainer false
			:opposite list
		) ( struct-map
			KM3_Reference
			:name "rest"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_List
			:type RDFS_List
			:location "40:3-40:54"
			:isContainer false
			:opposite originalList
		) ( struct-map
			KM3_Reference
			:name "originalList"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_List
			:type RDFS_List
			:location "41:3-41:52"
			:isContainer false
			:opposite rest
		)]
	) ) ( def RDFS_Container ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Resource]
		:structuralFeatures[]
	) ) ( def RDFS_Alt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Container]
		:structuralFeatures[]
	) ) ( def RDFS_Bag ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Container]
		:structuralFeatures[]
	) ) ( def RDFS_Seq ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Container]
		:structuralFeatures[]
	) ) ( def RDFS_Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Resource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "predicateStatement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Property
			:type RDFS_Statement
			:location "51:3-51:68"
			:isContainer false
			:opposite predicate
		) ( struct-map
			KM3_Reference
			:name "subPropertyOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Property
			:type RDFS_Property
			:location "52:3-52:66"
			:isContainer false
			:opposite superProperty
		) ( struct-map
			KM3_Reference
			:name "superProperty"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Property
			:type RDFS_Property
			:location "53:3-53:66"
			:isContainer false
			:opposite subPropertyOf
		) ( struct-map
			KM3_Reference
			:name "domain"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Property
			:type RDFS_Class
			:location "54:3-54:60"
			:isContainer false
			:opposite propertyForDomain
		) ( struct-map
			KM3_Reference
			:name "range"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Property
			:type RDFS_Class
			:location "55:3-55:58"
			:isContainer false
			:opposite propertyForRange
		)]
	) ) ( def RDFS_ContainerMembershipProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def RDFS_Statement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Resource]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isReifiedOnly"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_Statement
			:type Boolean
			:location "66:3-66:37"
		) ( struct-map
			KM3_Attribute
			:name "isReified"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_Statement
			:type Boolean
			:location "67:3-67:33"
		) ( struct-map
			KM3_Reference
			:name "predicate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_Statement
			:type RDFS_Property
			:location "62:3-62:69"
			:isContainer false
			:opposite predicateStatement
		) ( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_Statement
			:type RDFS_Resource
			:location "63:3-63:58"
			:isContainer false
			:opposite objectStatement
		) ( struct-map
			KM3_Reference
			:name "subject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_Statement
			:type RDFS_Resource
			:location "64:3-64:60"
			:isContainer false
			:opposite subjectStatement
		) ( struct-map
			KM3_Reference
			:name "nameForReification"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Statement
			:type RDFS_URIReference
			:location "68:3-68:78"
			:isContainer false
			:opposite reifiedStatement
		)]
	) ) ( def RDFS_URIReferenceNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Resource]
		:structuralFeatures[]
	) ) ( def RDFS_BlankNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Resource]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "nodeId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_BlankNode
			:type String
			:location "75:3-75:34"
		)]
	) ) ( def RDFS_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Resource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subClassOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Class
			:type RDFS_Class
			:location "80:3-80:57"
			:isContainer false
			:opposite superClass
		) ( struct-map
			KM3_Reference
			:name "superClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Class
			:type RDFS_Class
			:location "81:3-81:57"
			:isContainer false
			:opposite subClassOf
		) ( struct-map
			KM3_Reference
			:name "typedResource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Class
			:type RDFS_Resource
			:location "82:3-82:57"
			:isContainer false
			:opposite type
		) ( struct-map
			KM3_Reference
			:name "propertyForDomain"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Class
			:type RDFS_Property
			:location "84:3-84:63"
			:isContainer false
			:opposite domain
		) ( struct-map
			KM3_Reference
			:name "propertyForRange"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Class
			:type RDFS_Property
			:location "85:3-85:61"
			:isContainer false
			:opposite range
		)]
	) ) ( def RDFS_Datatype ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Class]
		:structuralFeatures[]
	) ) ( def RDFS_Literal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Resource]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lexicalForm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_Literal
			:type String
			:location "93:3-93:34"
		)]
	) ) ( def RDFS_PlainLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Literal]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "language"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_PlainLiteral
			:type String
			:location "97:3-97:36"
		) ( struct-map
			KM3_Reference
			:name "labeledResource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_PlainLiteral
			:type RDFS_Resource
			:location "98:3-98:57"
			:isContainer false
			:opposite label
		)]
	) ) ( def RDFS_TypedLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Literal]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "datatypeURI"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_TypedLiteral
			:type RDFS_URIReference
			:location "102:3-102:61"
			:isContainer false
			:opposite literal
		)]
	) ) ( def RDFS_RDFXMLLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_TypedLiteral]
		:structuralFeatures[]
	) ) ( def RDFS_URIReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "uri"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_URIReference
			:type RDFS_UniformResourceIdentifier
			:location "111:3-111:68"
			:isContainer false
			:opposite uriRef
		) ( struct-map
			KM3_Reference
			:name "resource"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_URIReference
			:type RDFS_Resource
			:location "112:3-112:56"
			:isContainer false
			:opposite uriRef
		) ( struct-map
			KM3_Reference
			:name "literal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_URIReference
			:type RDFS_TypedLiteral
			:location "113:3-113:66"
			:isContainer false
			:opposite datatypeURI
		) ( struct-map
			KM3_Reference
			:name "namedGraph"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_URIReference
			:type RDFS_Graph
			:location "114:3-114:58"
			:isContainer false
			:opposite graphName
		) ( struct-map
			KM3_Reference
			:name "reifiedStatement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_URIReference
			:type RDFS_Statement
			:location "116:3-116:75"
			:isContainer false
			:opposite nameForReification
		)]
	) ) ( def RDFS_UniformResourceIdentifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_URIReference]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_UniformResourceIdentifier
			:type String
			:location "120:3-120:27"
		) ( struct-map
			KM3_Reference
			:name "uriRef"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_UniformResourceIdentifier
			:type RDFS_URIReference
			:location "121:3-121:53"
			:isContainer false
			:opposite uri
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "127:2-127:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "128:2-128:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "129:2-129:18"
	) )]
) )
