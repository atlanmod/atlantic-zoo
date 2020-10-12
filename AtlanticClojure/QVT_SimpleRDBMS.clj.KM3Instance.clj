( declare SimpleRDBMS_RModelElement )
( declare SimpleRDBMS_Schema )
( declare SimpleRDBMS_Table )
( declare SimpleRDBMS_Column )
( declare SimpleRDBMS_Key )
( declare SimpleRDBMS_ForeignKey )
( declare PrimitiveTypes_String )
( def SimpleRDBMS ( struct-map
	KM3_Package
	:contents[( def SimpleRDBMS_RModelElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleRDBMS_RModelElement
			:type String
			:location "11:5-11:29"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleRDBMS_RModelElement
			:type String
			:location "12:5-12:29"
		)]
	) ) ( def SimpleRDBMS_Schema ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleRDBMS_RModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tables"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_Schema
			:type SimpleRDBMS_Table
			:location "16:5-16:61"
			:isContainer true
			:opposite schema
		)]
	) ) ( def SimpleRDBMS_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleRDBMS_RModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "schema"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleRDBMS_Table
			:type SimpleRDBMS_Schema
			:location "20:5-20:54"
			:isContainer false
			:opposite tables
		) ( struct-map
			KM3_Reference
			:name "column"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_Table
			:type SimpleRDBMS_Column
			:location "21:5-21:61"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_Table
			:type SimpleRDBMS_Key
			:location "22:5-22:54"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "foreignKey"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_Table
			:type SimpleRDBMS_ForeignKey
			:location "23:5-23:68"
			:isContainer true
			:opposite owner
		)]
	) ) ( def SimpleRDBMS_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleRDBMS_RModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleRDBMS_Column
			:type String
			:location "27:5-27:29"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleRDBMS_Column
			:type SimpleRDBMS_Table
			:location "28:5-28:52"
			:isContainer false
			:opposite column
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_Column
			:type SimpleRDBMS_Key
			:location "29:5-29:46"
			:isContainer false
			:opposite column
		) ( struct-map
			KM3_Reference
			:name "foreignKey"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_Column
			:type SimpleRDBMS_ForeignKey
			:location "30:5-30:60"
			:isContainer false
			:opposite column
		)]
	) ) ( def SimpleRDBMS_Key ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleRDBMS_RModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleRDBMS_Key
			:type SimpleRDBMS_Table
			:location "34:5-34:49"
			:isContainer false
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "column"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_Key
			:type SimpleRDBMS_Column
			:location "35:5-35:49"
			:isContainer false
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "refersToOpposite"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_Key
			:type SimpleRDBMS_ForeignKey
			:location "36:5-36:68"
			:isContainer false
			:opposite refersTo
		)]
	) ) ( def SimpleRDBMS_ForeignKey ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleRDBMS_RModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "column"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_ForeignKey
			:type SimpleRDBMS_Column
			:location "40:5-40:56"
			:isContainer false
			:opposite foreignKey
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleRDBMS_ForeignKey
			:type SimpleRDBMS_Table
			:location "41:5-41:56"
			:isContainer false
			:opposite foreignKey
		) ( struct-map
			KM3_Reference
			:name "refersTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleRDBMS_ForeignKey
			:type SimpleRDBMS_Key
			:location "42:5-42:63"
			:isContainer false
			:opposite refersToOpposite
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "48:3-48:19"
	) )]
) )
