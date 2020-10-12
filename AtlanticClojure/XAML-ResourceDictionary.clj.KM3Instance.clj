( declare XAML_Transformation )
( declare XAML_WinFXElement )
( declare XAML_NameSpace )
( declare XAML_ResourceGroup )
( declare XAML_Material )
( declare XAML_Key )
( declare XAML_ResourceDictionary )
( declare XAML_Transform3DGroup )
( declare XAML_MaterialGroup )
( declare XAML_DiffuseMaterial )
( declare XAML_TranslateTransform3D )
( declare XAML_ScaleTransform3D )
( declare XAML_RotateTransform3D )
( declare XAML_RotateTransformat3DRotation )
( declare XAML_AxisAngleRotation3D )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Double )
( def XAML ( struct-map
	KM3_Package
	:contents[( def XAML_Transformation ( struct-map
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
			:location "30:3-30:35"
			:isContainer false
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
			:location "34:3-34:32"
		) ( struct-map
			KM3_Attribute
			:name "identifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_NameSpace
			:type String
			:location "35:3-35:33"
		)]
	) ) ( def XAML_ResourceGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_ResourceGroup
			:type XAML_Key
			:location "39:3-39:33"
			:isContainer true
		)]
	) ) ( def XAML_Material ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XAML_Key ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_WinFXElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_Key
			:type String
			:location "47:3-47:27"
		)]
	) ) ( def XAML_ResourceDictionary ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resourcegroups"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XAML_ResourceDictionary
			:type XAML_ResourceGroup
			:location "51:3-51:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "xmlns"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XAML_ResourceDictionary
			:type XAML_NameSpace
			:location "52:3-52:44"
			:isContainer true
		)]
	) ) ( def XAML_Transform3DGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_ResourceGroup]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transformations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XAML_Transform3DGroup
			:type XAML_Transformation
			:location "56:3-56:59"
			:isContainer true
		)]
	) ) ( def XAML_MaterialGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_ResourceGroup]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "materials"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XAML_MaterialGroup
			:type XAML_Material
			:location "60:3-60:47"
			:isContainer true
		)]
	) ) ( def XAML_DiffuseMaterial ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_Material]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "Brush"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_DiffuseMaterial
			:type String
			:location "64:3-64:28"
		)]
	) ) ( def XAML_TranslateTransform3D ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_Transformation]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "OffsetX"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_TranslateTransform3D
			:type Double
			:location "68:3-68:30"
		) ( struct-map
			KM3_Attribute
			:name "OffsetY"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_TranslateTransform3D
			:type Double
			:location "69:3-69:30"
		) ( struct-map
			KM3_Attribute
			:name "OffsetZ"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_TranslateTransform3D
			:type Double
			:location "70:3-70:30"
		)]
	) ) ( def XAML_ScaleTransform3D ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_Transformation]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ScaleX"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_ScaleTransform3D
			:type Double
			:location "74:3-74:29"
		) ( struct-map
			KM3_Attribute
			:name "ScaleY"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_ScaleTransform3D
			:type Double
			:location "75:3-75:29"
		) ( struct-map
			KM3_Attribute
			:name "ScaleZ"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_ScaleTransform3D
			:type Double
			:location "76:3-76:29"
		)]
	) ) ( def XAML_RotateTransform3D ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XAML_Transformation]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "CenterX"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_RotateTransform3D
			:type Double
			:location "80:3-80:30"
		) ( struct-map
			KM3_Attribute
			:name "CenterY"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_RotateTransform3D
			:type Double
			:location "81:3-81:30"
		) ( struct-map
			KM3_Reference
			:name "rotation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_RotateTransform3D
			:type XAML_RotateTransformat3DRotation
			:location "82:3-82:62"
			:isContainer true
		)]
	) ) ( def XAML_RotateTransformat3DRotation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "axisAngleRotation3D"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_RotateTransformat3DRotation
			:type XAML_AxisAngleRotation3D
			:location "86:3-86:65"
			:isContainer true
		)]
	) ) ( def XAML_AxisAngleRotation3D ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "angle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_AxisAngleRotation3D
			:type Integer
			:location "90:3-90:29"
		) ( struct-map
			KM3_Attribute
			:name "axis"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XAML_AxisAngleRotation3D
			:type String
			:location "91:3-91:27"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "97:2-97:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "98:2-98:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "99:2-99:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "100:2-100:18"
	) )]
) )
