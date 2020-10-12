( declare WikiTable_LocatedElement )
( declare WikiTable_Table )
( declare WikiTable_Caption )
( declare WikiTable_Row )
( declare WikiTable_Cell )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def WikiTable ( struct-map
	KM3_Package
	:contents[( def WikiTable_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WikiTable_LocatedElement
			:type String
			:location "23:3-23:36"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WikiTable_LocatedElement
			:type String
			:location "24:3-24:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WikiTable_LocatedElement
			:type String
			:location "25:3-25:47"
		)]
	) ) ( def WikiTable_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WikiTable_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "border"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WikiTable_Table
			:type Integer
			:location "30:3-30:30"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WikiTable_Table
			:type String
			:location "31:3-31:28"
		) ( struct-map
			KM3_Attribute
			:name "class"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WikiTable_Table
			:type String
			:location "32:3-32:30"
		) ( struct-map
			KM3_Reference
			:name "caption"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WikiTable_Table
			:type WikiTable_Caption
			:location "33:3-33:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rows"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WikiTable_Table
			:type WikiTable_Row
			:location "34:3-34:45"
			:isContainer true
		)]
	) ) ( def WikiTable_Caption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WikiTable_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WikiTable_Caption
			:type String
			:location "39:3-39:30"
		)]
	) ) ( def WikiTable_Row ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WikiTable_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cells"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WikiTable_Row
			:type WikiTable_Cell
			:location "43:3-43:47"
			:isContainer true
		)]
	) ) ( def WikiTable_Cell ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WikiTable_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isHeading"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WikiTable_Cell
			:type Boolean
			:location "47:3-47:33"
		) ( struct-map
			KM3_Attribute
			:name "align"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WikiTable_Cell
			:type String
			:location "48:3-48:28"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WikiTable_Cell
			:type String
			:location "49:3-49:28"
		) ( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WikiTable_Cell
			:type String
			:location "50:3-50:30"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "56:2-56:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "57:2-57:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "58:2-58:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "59:2-59:18"
	) )]
) )
