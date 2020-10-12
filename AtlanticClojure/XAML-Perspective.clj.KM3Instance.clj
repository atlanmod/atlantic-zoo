( declare XAML_Page )
( declare XAML_NameSpace )
( declare XAML_PageResource )
( declare XAML_GraphicalContainer )
( declare XAML_WinFXElement )
( declare XAML_PerspectiveElement )
( declare XAML_ResourceDictionary )
( declare XAML_Grid )
( declare XAML_Object3D )
( declare XAML_Workshop3D )
( declare XAML_Element3D )
( declare XAML_UI3Delement )
( declare XAML_XyzAxis3D )
( declare XAML_Box3D )
( declare XAML_Square3D )
( declare XAML_Name )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Double )
( def XAML ( struct-map
	KM3_Package
	:contents[( def XAML_Page ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_Page
			:type String
			:location "26:3-26:28"
		) ( struct-map
			KM3_Reference
			:name "xmlns"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XAML_Page
			:type XAML_NameSpace
			:location "25:3-25:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "graphContainer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_Page
			:type XAML_GraphicalContainer
			:location "27:3-27:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "pageResources"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_Page
			:type XAML_PageResource
			:location "28:3-28:52"
			:isContainer true
		)]
	) ) ( def XAML_NameSpace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_NameSpace
			:type String
			:location "32:3-32:32"
		) ( struct-map
			KM3_Attribute
			:name "identifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_NameSpace
			:type String
			:location "33:3-33:33"
		)]
	) ) ( def XAML_PageResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dictionaries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XAML_PageResource
			:type XAML_ResourceDictionary
			:location "38:3-38:60"
			:isContainer true
		)]
	) ) ( def XAML_GraphicalContainer ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XAML_WinFXElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "namespace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_WinFXElement
			:type XAML_NameSpace
			:location "46:3-46:35"
			:isContainer false
		)]
	) ) ( def XAML_PerspectiveElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "namespace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_PerspectiveElement
			:type XAML_NameSpace
			:location "50:3-50:35"
			:isContainer false
		)]
	) ) ( def XAML_ResourceDictionary ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_ResourceDictionary
			:type String
			:location "53:3-53:29"
		)]
	) ) ( def XAML_Grid ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_GraphicalContainer]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "object3D"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XAML_Grid
			:type XAML_Object3D
			:location "57:3-57:46"
			:isContainer true
		)]
	) ) ( def XAML_Object3D ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XAML_Workshop3D ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_Object3D XAML_PerspectiveElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements3D"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XAML_Workshop3D
			:type XAML_Element3D
			:location "64:3-64:49"
			:isContainer true
		)]
	) ) ( def XAML_Element3D ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XAML_UI3Delement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_Element3D]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "transform"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_UI3Delement
			:type String
			:location "72:3-72:32"
		) ( struct-map
			KM3_Attribute
			:name "material"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_UI3Delement
			:type String
			:location "73:3-73:31"
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_UI3Delement
			:type XAML_Name
			:location "74:3-74:35"
			:isContainer true
		)]
	) ) ( def XAML_XyzAxis3D ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_Element3D XAML_PerspectiveElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "length"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_XyzAxis3D
			:type Double
			:location "78:3-78:29"
		)]
	) ) ( def XAML_Box3D ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_UI3Delement XAML_PerspectiveElement]
		:structuralFeatures[]
	) ) ( def XAML_Square3D ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_UI3Delement XAML_PerspectiveElement]
		:structuralFeatures[]
	) ) ( def XAML_Name ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_WinFXElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_Name
			:type String
			:location "90:3-90:27"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "96:2-96:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "97:2-97:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "98:2-98:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "99:2-99:18"
	) )]
) )
