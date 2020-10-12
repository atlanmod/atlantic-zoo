( declare UnixFS_NamedElement )
( declare UnixFS_File )
( declare UnixFS_Directory )
( declare UnixFS_FileSystemRoot )
( declare UnixFS_TextFile )
( declare PrimitiveTypes_String )
( def UnixFS ( struct-map
	KM3_Package
	:contents[( def UnixFS_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UnixFS_NamedElement
			:type String
			:location "12:3-12:27"
		)]
	) ) ( def UnixFS_File ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[UnixFS_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UnixFS_File
			:type String
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "group"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UnixFS_File
			:type String
			:location "17:3-17:28"
		)]
	) ) ( def UnixFS_Directory ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UnixFS_File]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered true
			:owner UnixFS_Directory
			:type UnixFS_File
			:location "21:3-21:50"
			:isContainer true
		)]
	) ) ( def UnixFS_FileSystemRoot ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UnixFS_Directory]
		:structuralFeatures[]
	) ) ( def UnixFS_TextFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UnixFS_File]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "35:2-35:18"
	) )]
) )
