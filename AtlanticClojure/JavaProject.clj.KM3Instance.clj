( declare JavaProject_JavaProject )
( declare JavaProject_PackageFragment )
( declare JavaProject_CompilationUnit )
( declare JavaProject_ImportDeclaration )
( declare JavaProject_Type )
( declare JavaProject_Field )
( declare JavaProject_Method )
( declare JavaProject_JavaElement )
( declare JavaProject_MEMBER_KIND )
( declare JavaProject_NamedElement )
( declare JavaProject_PackageDeclaration )
( declare PrimitiveTypes_String )
( def JavaProject ( struct-map
	KM3_Package
	:contents[( def MEMBER_KIND ( :literals[( struct-map
		KM3_EnumLiteral
		:name "class"
		:location "51:3-51:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "enum"
		:location "52:3-52:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "interface"
		:location "53:3-53:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Annotation"
		:location "54:3-54:22"
	)] ) ) ( def JavaProject_JavaProject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaProject_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedPackageFragment"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaProject_JavaProject
			:type JavaProject_PackageFragment
			:location "10:3-10:73"
			:isContainer true
		)]
	) ) ( def JavaProject_PackageFragment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaProject_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedCompilationUnit"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaProject_PackageFragment
			:type JavaProject_CompilationUnit
			:location "14:3-14:73"
			:isContainer true
		)]
	) ) ( def JavaProject_CompilationUnit ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaProject_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "importDeclaration"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaProject_CompilationUnit
			:type JavaProject_ImportDeclaration
			:location "18:3-18:72"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ownedType"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaProject_CompilationUnit
			:type JavaProject_Type
			:location "19:3-19:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "declaration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner JavaProject_CompilationUnit
			:type JavaProject_PackageDeclaration
			:location "20:3-20:61"
			:isContainer true
		)]
	) ) ( def JavaProject_ImportDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaProject_NamedElement]
		:structuralFeatures[]
	) ) ( def JavaProject_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaProject_JavaElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "elementName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner JavaProject_Type
			:type String
			:location "30:3-30:40"
		) ( struct-map
			KM3_Attribute
			:name "member_kind"
			:upper 1
			:lower 0
			:isOrdered false
			:owner JavaProject_Type
			:type MEMBER_KIND
			:location "31:3-31:44"
		) ( struct-map
			KM3_Reference
			:name "nestedType"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaProject_Type
			:type JavaProject_Type
			:location "28:3-28:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ownedSuperType"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaProject_Type
			:type JavaProject_Type
			:location "29:3-29:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "methods"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaProject_Type
			:type JavaProject_Method
			:location "32:3-32:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fields"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaProject_Type
			:type JavaProject_Field
			:location "33:3-33:49"
			:isContainer true
		)]
	) ) ( def JavaProject_Field ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaProject_JavaElement]
		:structuralFeatures[]
	) ) ( def JavaProject_Method ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaProject_JavaElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "returnType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner JavaProject_Method
			:type String
			:location "41:3-41:39"
		) ( struct-map
			KM3_Attribute
			:name "parametersName"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaProject_Method
			:type String
			:location "42:3-42:56"
		) ( struct-map
			KM3_Attribute
			:name "parametersType"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaProject_Method
			:type String
			:location "43:3-43:56"
		)]
	) ) ( def JavaProject_JavaElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[JavaProject_NamedElement]
		:structuralFeatures[]
	) ) ( def JavaProject_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner JavaProject_NamedElement
			:type String
			:location "58:3-58:32"
		)]
	) ) ( def JavaProject_PackageDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaProject_NamedElement]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "67:5-67:21"
	) )]
) )
