( declare BQL_LocatedElement )
( declare BQL_Query )
( declare BQL_Entry )
( declare BQL_Field )
( declare BQL_Predicate )
( declare BQL_Expression )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def BQL ( struct-map
	KM3_Package
	:contents[( def BQL_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BQL_LocatedElement
			:type String
			:location "12:3-12:31"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner BQL_LocatedElement
			:type String
			:location "13:3-13:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner BQL_LocatedElement
			:type String
			:location "14:3-14:47"
		)]
	) ) ( def BQL_Query ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "entries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BQL_Query
			:type BQL_Entry
			:location "19:3-19:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "predicates"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BQL_Query
			:type BQL_Predicate
			:location "20:3-20:49"
			:isContainer true
		)]
	) ) ( def BQL_Entry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BQL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BQL_Entry
			:type String
			:location "26:3-26:27"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BQL_Entry
			:type String
			:location "27:3-27:27"
		) ( struct-map
			KM3_Attribute
			:name "allFields"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BQL_Entry
			:type Boolean
			:location "28:3-28:33"
		) ( struct-map
			KM3_Reference
			:name "fields"
			:upper -1
			:lower 1
			:isOrdered false
			:owner BQL_Entry
			:type BQL_Field
			:location "29:3-29:60"
			:isContainer true
			:opposite entry
		) ( struct-map
			KM3_Reference
			:name "predicate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BQL_Entry
			:type BQL_Predicate
			:location "30:3-30:57"
			:isContainer false
			:opposite entry
		)]
	) ) ( def BQL_Field ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BQL_Field
			:type String
			:location "35:3-35:27"
		) ( struct-map
			KM3_Reference
			:name "entry"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BQL_Field
			:type BQL_Entry
			:location "36:3-36:45"
			:isContainer false
			:opposite fields
		)]
	) ) ( def BQL_Predicate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "entry"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BQL_Predicate
			:type BQL_Entry
			:location "40:3-40:48"
			:isContainer false
			:opposite predicate
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper -1
			:lower 1
			:isOrdered false
			:owner BQL_Predicate
			:type BQL_Expression
			:location "41:3-41:53"
			:isContainer true
		)]
	) ) ( def BQL_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "field"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BQL_Expression
			:type String
			:location "45:3-45:28"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BQL_Expression
			:type String
			:location "46:3-46:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "52:2-52:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "53:2-53:19"
	) )]
) )
