( declare PluginEclipse_LocatedElement )
( declare PluginEclipse_Resolution )
( declare PluginEclipse_Visibility )
( declare PluginEclipse_Eclipse )
( declare PluginEclipse_Bundle )
( declare PluginEclipse_RequireBundleAttribute )
( declare PluginEclipse_AttResolution )
( declare PluginEclipse_AttVisibility )
( declare PluginEclipse_Range )
( declare PluginEclipse_Version )
( declare PluginEclipse_RequiredBundle )
( declare PluginEclipse_ImportedPackage )
( declare PluginEclipse_ExportedPackage )
( declare PluginEclipse_Package )
( declare PluginsEclipse_Xfriends )
( declare PluginsEclipse_Xinternal )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def PluginEclipse ( struct-map
	KM3_Package
	:contents[( def Resolution ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Mandatory"
		:location "30:2-30:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "Optional"
		:location "31:2-31:19"
	)] ) ) ( def Visibility ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Private"
		:location "35:2-35:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Reexport"
		:location "36:2-36:19"
	)] ) ) ( def PluginEclipse_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PluginEclipse_LocatedElement
			:type String
			:location "22:3-22:36"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PluginEclipse_LocatedElement
			:type String
			:location "23:3-23:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PluginEclipse_LocatedElement
			:type String
			:location "24:3-24:47"
		)]
	) ) ( def PluginEclipse_Eclipse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PluginEclipse_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bundles"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Eclipse
			:type PluginEclipse_Bundle
			:location "40:2-40:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "packages"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PluginEclipse_Eclipse
			:type PluginEclipse_Package
			:location "41:2-41:44"
			:isContainer true
		)]
	) ) ( def PluginEclipse_Bundle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PluginEclipse_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "symbolicName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Bundle
			:type String
			:location "45:2-45:34"
		) ( struct-map
			KM3_Attribute
			:name "singleton"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Bundle
			:type Boolean
			:location "46:2-46:32"
		) ( struct-map
			KM3_Attribute
			:name "manifestVersion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Bundle
			:type Integer
			:location "47:2-47:38"
		) ( struct-map
			KM3_Reference
			:name "require"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PluginEclipse_Bundle
			:type PluginEclipse_RequiredBundle
			:location "49:2-49:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Bundle
			:type PluginEclipse_Version
			:location "50:2-50:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "export"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PluginEclipse_Bundle
			:type PluginEclipse_ExportedPackage
			:location "51:2-51:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "import"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PluginEclipse_Bundle
			:type PluginEclipse_ImportedPackage
			:location "52:2-52:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "packages"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PluginEclipse_Bundle
			:type PluginEclipse_Package
			:location "53:2-53:44"
			:isContainer true
		)]
	) ) ( def PluginEclipse_RequireBundleAttribute ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[PluginEclipse_LocatedElement]
		:structuralFeatures[]
	) ) ( def PluginEclipse_AttResolution ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PluginEclipse_RequireBundleAttribute]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_AttResolution
			:type Resolution
			:location "60:2-60:31"
		)]
	) ) ( def PluginEclipse_AttVisibility ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PluginEclipse_RequireBundleAttribute]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_AttVisibility
			:type Visibility
			:location "64:2-64:31"
		)]
	) ) ( def PluginEclipse_Range ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PluginEclipse_RequireBundleAttribute]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isLeftInclusive"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Range
			:type Boolean
			:location "68:2-68:38"
		) ( struct-map
			KM3_Attribute
			:name "isRightInclusive"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Range
			:type Boolean
			:location "69:2-69:39"
		) ( struct-map
			KM3_Reference
			:name "lowerBound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Range
			:type PluginEclipse_Version
			:location "71:2-71:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "upperBound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Range
			:type PluginEclipse_Version
			:location "72:2-72:43"
			:isContainer true
		)]
	) ) ( def PluginEclipse_Version ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PluginEclipse_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "major"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Version
			:type Integer
			:location "77:2-77:28"
		) ( struct-map
			KM3_Attribute
			:name "minor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Version
			:type Integer
			:location "78:2-78:28"
		) ( struct-map
			KM3_Attribute
			:name "micro"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Version
			:type Integer
			:location "79:2-79:28"
		) ( struct-map
			KM3_Attribute
			:name "qualification"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Version
			:type String
			:location "80:2-80:35"
		)]
	) ) ( def PluginEclipse_RequiredBundle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PluginEclipse_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "requireBundleAttribute"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PluginEclipse_RequiredBundle
			:type PluginEclipse_RequireBundleAttribute
			:location "85:2-85:73"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bundle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_RequiredBundle
			:type PluginEclipse_Bundle
			:location "86:2-86:28"
			:isContainer false
		)]
	) ) ( def PluginEclipse_ImportedPackage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PluginEclipse_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "resolution"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_ImportedPackage
			:type Resolution
			:location "90:2-90:36"
		) ( struct-map
			KM3_Reference
			:name "package"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_ImportedPackage
			:type PluginEclipse_Package
			:location "92:2-92:54"
			:isContainer false
			:opposite importedBy
		) ( struct-map
			KM3_Reference
			:name "range"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PluginEclipse_ImportedPackage
			:type PluginEclipse_Range
			:location "93:2-93:41"
			:isContainer true
		)]
	) ) ( def PluginEclipse_ExportedPackage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PluginEclipse_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "package"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_ExportedPackage
			:type PluginEclipse_Package
			:location "97:2-97:54"
			:isContainer false
			:opposite exportedBy
		) ( struct-map
			KM3_Reference
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_ExportedPackage
			:type PluginEclipse_Version
			:location "98:2-98:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "xFriends"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_ExportedPackage
			:type PluginsEclipse_Xfriends
			:location "99:2-99:42"
			:isContainer true
		)]
	) ) ( def PluginEclipse_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PluginEclipse_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fqn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginEclipse_Package
			:type String
			:location "103:2-103:25"
		) ( struct-map
			KM3_Reference
			:name "importedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PluginEclipse_Package
			:type PluginEclipse_ImportedPackage
			:location "104:2-104:66"
			:isContainer false
			:opposite package
		) ( struct-map
			KM3_Reference
			:name "exportedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PluginEclipse_Package
			:type PluginEclipse_ExportedPackage
			:location "105:2-105:68"
			:isContainer false
			:opposite package
		)]
	) )]
) )
( def PluginsEclipse ( struct-map
	KM3_Package
	:contents[( def PluginsEclipse_Xfriends ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PluginEclipse_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bundles"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PluginsEclipse_Xfriends
			:type PluginEclipse_Bundle
			:location "114:2-114:34"
			:isContainer false
		)]
	) ) ( def PluginsEclipse_Xinternal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PluginEclipse_ExportedPackage]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PluginsEclipse_Xinternal
			:type Boolean
			:location "118:2-118:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "124:2-124:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "125:2-125:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "126:2-126:18"
	) )]
) )
