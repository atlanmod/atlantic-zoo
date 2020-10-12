( declare Table_Table )
( declare Table_Row )
( declare Table_Cell )
( declare PrimitiveTypes_String )
( def Table ( struct-map
	KM3_Package
	:contents[( def Table_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rows"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Table_Table
			:type Table_Row
			:location "11:3-11:47"
			:isContainer true
		)]
	) ) ( def Table_Row ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cells"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Table_Row
			:type Table_Cell
			:location "15:3-15:49"
			:isContainer true
		)]
	) ) ( def Table_Cell ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Table_Cell
			:type String
			:location "19:3-19:30"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "24:4-24:20"
	) )]
) )
