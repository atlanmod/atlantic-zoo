( declare Perceptory_RelationSchip )
( declare Perceptory_ConstrainedRelationSchip )
( declare Perceptory_Aggregation )
( declare Perceptory_Composition )
( declare Perceptory_Association )
( declare Perceptory_Generalisation )
( declare Perceptory_Dependency )
( declare Perceptory_AssociationEnd )
( declare Perceptory_Package )
( declare Perceptory_Steriotype )
( declare Perceptory_Class )
( declare Perceptory_Constraint )
( declare Perceptory_Operation )
( declare Perceptory_Characteristic )
( declare Perceptory_BusnissRule )
( declare Perceptory_MetaData )
( declare Perceptory_Source )
( declare Perceptory_Domain )
( declare Perceptory_DescriptiveAttribute )
( declare Perceptory_Geometry )
( declare Perceptory_Temporality )
( declare Perceptory_VisualInfo )
( declare Perceptory_Value )
( declare Perceptory_RangeDomain )
( declare Perceptory_EnumeratedDomain )
( declare Perceptory_PerceptorySteriotype )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def Perceptory ( struct-map
	KM3_Package
	:contents[( def Perceptory_RelationSchip ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "affectCharacteristic"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_RelationSchip
			:type Perceptory_Characteristic
			:location "12:3-12:91"
			:isContainer true
			:opposite relationSchip
		) ( struct-map
			KM3_Reference
			:name "constraint"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_RelationSchip
			:type Perceptory_Constraint
			:location "13:3-13:68"
			:isContainer false
			:opposite relationSchip
		) ( struct-map
			KM3_Reference
			:name "steriotype"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_RelationSchip
			:type Perceptory_Steriotype
			:location "14:3-14:66"
			:isContainer false
			:opposite relationSchip
		) ( struct-map
			KM3_Reference
			:name "packages"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_RelationSchip
			:type Perceptory_Package
			:location "15:3-15:61"
			:isContainer false
			:opposite relationSchip
		) ( struct-map
			KM3_Reference
			:name "associatePackages"
			:upper 2
			:lower 2
			:isOrdered false
			:owner Perceptory_RelationSchip
			:type Perceptory_Package
			:location "16:3-16:81"
			:isContainer false
			:opposite connectedRelationSchip
		)]
	) ) ( def Perceptory_ConstrainedRelationSchip ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Perceptory_Aggregation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Association]
		:structuralFeatures[]
	) ) ( def Perceptory_Composition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Association]
		:structuralFeatures[]
	) ) ( def Perceptory_Association ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_RelationSchip]
		:structuralFeatures[]
	) ) ( def Perceptory_Generalisation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_RelationSchip]
		:structuralFeatures[]
	) ) ( def Perceptory_Dependency ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_RelationSchip]
		:structuralFeatures[]
	) ) ( def Perceptory_AssociationEnd ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Perceptory_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "steriotype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_Package
			:type Perceptory_Steriotype
			:location "56:3-56:65"
			:isContainer false
			:opposite thePackage
		) ( struct-map
			KM3_Reference
			:name "children"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Package
			:type Perceptory_Package
			:location "57:3-57:64"
			:isContainer true
			:opposite parent
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Package
			:type Perceptory_Package
			:location "58:3-58:50"
			:isContainer false
			:opposite children
		) ( struct-map
			KM3_Reference
			:name "classes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Package
			:type Perceptory_Class
			:location "59:3-59:63"
			:isContainer true
			:opposite packages
		) ( struct-map
			KM3_Reference
			:name "relationSchip"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Package
			:type Perceptory_RelationSchip
			:location "60:3-60:77"
			:isContainer true
			:opposite packages
		) ( struct-map
			KM3_Reference
			:name "connectedRelationSchip"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Package
			:type Perceptory_RelationSchip
			:location "61:3-61:85"
			:isContainer false
			:opposite associatePackages
		)]
	) ) ( def Perceptory_Steriotype ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "descriptiveAttribute"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Steriotype
			:type Perceptory_DescriptiveAttribute
			:location "66:3-66:83"
			:isContainer false
			:opposite steriotype
		) ( struct-map
			KM3_Reference
			:name "operations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Steriotype
			:type Perceptory_Operation
			:location "67:3-67:61"
			:isContainer false
			:opposite steriotype
		) ( struct-map
			KM3_Reference
			:name "relationSchip"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Steriotype
			:type Perceptory_RelationSchip
			:location "68:3-68:68"
			:isContainer false
			:opposite steriotype
		) ( struct-map
			KM3_Reference
			:name "theClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Steriotype
			:type Perceptory_Class
			:location "69:3-69:56"
			:isContainer false
			:opposite steriotype
		) ( struct-map
			KM3_Reference
			:name "thePackage"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Steriotype
			:type Perceptory_Package
			:location "70:3-70:60"
			:isContainer false
			:opposite steriotype
		)]
	) ) ( def Perceptory_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "characteristic"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Class
			:type Perceptory_Characteristic
			:location "75:3-75:78"
			:isContainer true
			:opposite theClass
		) ( struct-map
			KM3_Reference
			:name "details"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_Class
			:type Perceptory_MetaData
			:location "76:3-76:67"
			:isContainer true
			:opposite theClass
		) ( struct-map
			KM3_Reference
			:name "operations"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Class
			:type Perceptory_Operation
			:location "77:3-77:61"
			:isContainer false
			:opposite affectFeature
		) ( struct-map
			KM3_Reference
			:name "myOperations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Class
			:type Perceptory_Operation
			:location "78:3-78:72"
			:isContainer true
			:opposite behaviour
		) ( struct-map
			KM3_Reference
			:name "constraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Class
			:type Perceptory_Constraint
			:location "79:3-79:60"
			:isContainer false
			:opposite theClass
		) ( struct-map
			KM3_Reference
			:name "steriotype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_Class
			:type Perceptory_Steriotype
			:location "80:3-80:62"
			:isContainer false
			:opposite theClass
		) ( struct-map
			KM3_Reference
			:name "packages"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Class
			:type Perceptory_Package
			:location "81:3-81:55"
			:isContainer false
			:opposite classes
		)]
	) ) ( def Perceptory_Constraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "caracteristic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Constraint
			:type Perceptory_Characteristic
			:location "86:3-86:66"
			:isContainer false
			:opposite constraint
		) ( struct-map
			KM3_Reference
			:name "theClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Constraint
			:type Perceptory_Class
			:location "87:3-87:52"
			:isContainer false
			:opposite constraint
		) ( struct-map
			KM3_Reference
			:name "relationSchip"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Constraint
			:type Perceptory_RelationSchip
			:location "88:3-88:68"
			:isContainer false
			:opposite constraint
		)]
	) ) ( def Perceptory_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "detail"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_Operation
			:type Perceptory_MetaData
			:location "93:3-93:68"
			:isContainer true
			:opposite operations
		) ( struct-map
			KM3_Reference
			:name "inCharacteristic"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Perceptory_Operation
			:type Perceptory_Characteristic
			:location "94:3-94:84"
			:isContainer true
			:opposite operations
		) ( struct-map
			KM3_Reference
			:name "affectFeature"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Perceptory_Operation
			:type Perceptory_Class
			:location "95:3-95:70"
			:isContainer true
			:opposite operations
		) ( struct-map
			KM3_Reference
			:name "steriotype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_Operation
			:type Perceptory_Steriotype
			:location "96:3-96:64"
			:isContainer false
			:opposite operations
		) ( struct-map
			KM3_Reference
			:name "behaviour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Operation
			:type Perceptory_Class
			:location "97:3-97:55"
			:isContainer false
			:opposite myOperations
		)]
	) ) ( def Perceptory_Characteristic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "details"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_Characteristic
			:type Perceptory_MetaData
			:location "103:3-103:73"
			:isContainer true
			:opposite characteristic
		) ( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_Characteristic
			:type Perceptory_BusnissRule
			:location "104:3-104:73"
			:isContainer true
			:opposite characteristic
		) ( struct-map
			KM3_Reference
			:name "operations"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Characteristic
			:type Perceptory_Operation
			:location "105:3-105:64"
			:isContainer false
			:opposite inCharacteristic
		) ( struct-map
			KM3_Reference
			:name "theClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Characteristic
			:type Perceptory_Class
			:location "106:3-106:56"
			:isContainer false
			:opposite characteristic
		) ( struct-map
			KM3_Reference
			:name "relationSchip"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Characteristic
			:type Perceptory_RelationSchip
			:location "107:3-107:75"
			:isContainer false
			:opposite affectCharacteristic
		) ( struct-map
			KM3_Reference
			:name "constraint"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_Characteristic
			:type Perceptory_Constraint
			:location "108:3-108:68"
			:isContainer false
			:opposite caracteristic
		)]
	) ) ( def Perceptory_BusnissRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "characteristic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_BusnissRule
			:type Perceptory_Characteristic
			:location "113:3-113:61"
			:isContainer false
			:opposite rule
		)]
	) ) ( def Perceptory_MetaData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_MetaData
			:type Perceptory_Source
			:location "118:3-118:64"
			:isContainer true
			:opposite metaData
		) ( struct-map
			KM3_Reference
			:name "characteristic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_MetaData
			:type Perceptory_Characteristic
			:location "119:3-119:64"
			:isContainer false
			:opposite details
		) ( struct-map
			KM3_Reference
			:name "operations"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_MetaData
			:type Perceptory_Operation
			:location "120:3-120:55"
			:isContainer false
			:opposite detail
		) ( struct-map
			KM3_Reference
			:name "theClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_MetaData
			:type Perceptory_Class
			:location "121:3-121:49"
			:isContainer false
			:opposite details
		)]
	) ) ( def Perceptory_Source ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "metaData"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Source
			:type Perceptory_MetaData
			:location "126:3-126:51"
			:isContainer false
			:opposite source
		)]
	) ) ( def Perceptory_Domain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "descriptiveAttribute"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Perceptory_Domain
			:type Perceptory_DescriptiveAttribute
			:location "131:3-131:81"
			:isContainer false
			:opposite domain
		)]
	) ) ( def Perceptory_DescriptiveAttribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Characteristic]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tempsDef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_DescriptiveAttribute
			:type Perceptory_Temporality
			:location "136:3-136:85"
			:isContainer true
			:opposite descriptiveAttributet
		) ( struct-map
			KM3_Reference
			:name "specialDef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_DescriptiveAttribute
			:type Perceptory_Geometry
			:location "137:3-137:84"
			:isContainer true
			:opposite descriptiveAttributeg
		) ( struct-map
			KM3_Reference
			:name "steriotype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_DescriptiveAttribute
			:type Perceptory_Steriotype
			:location "138:3-138:75"
			:isContainer false
			:opposite descriptiveAttribute
		) ( struct-map
			KM3_Reference
			:name "domain"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_DescriptiveAttribute
			:type Perceptory_Domain
			:location "139:3-139:67"
			:isContainer false
			:opposite descriptiveAttribute
		)]
	) ) ( def Perceptory_Geometry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_PerceptorySteriotype Perceptory_Characteristic]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tempsDef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_Geometry
			:type Perceptory_Temporality
			:location "144:3-144:62"
			:isContainer false
			:opposite geometry
		) ( struct-map
			KM3_Reference
			:name "descriptiveAttributeg"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Geometry
			:type Perceptory_DescriptiveAttribute
			:location "145:3-145:80"
			:isContainer false
			:opposite specialDef
		)]
	) ) ( def Perceptory_Temporality ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_PerceptorySteriotype Perceptory_Characteristic]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "geometry"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_Temporality
			:type Perceptory_Geometry
			:location "150:3-150:60"
			:isContainer false
			:opposite tempsDef
		) ( struct-map
			KM3_Reference
			:name "descriptiveAttributet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Temporality
			:type Perceptory_DescriptiveAttribute
			:location "151:3-151:78"
			:isContainer false
			:opposite tempsDef
		)]
	) ) ( def Perceptory_VisualInfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_PerceptorySteriotype Perceptory_Characteristic]
		:structuralFeatures[]
	) ) ( def Perceptory_Value ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumeratedDomain"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Value
			:type Perceptory_EnumeratedDomain
			:location "161:3-161:66"
			:isContainer false
			:opposite value
		)]
	) ) ( def Perceptory_RangeDomain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Domain]
		:structuralFeatures[]
	) ) ( def Perceptory_EnumeratedDomain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Domain]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Perceptory_EnumeratedDomain
			:type Perceptory_Value
			:location "171:3-171:71"
			:isContainer true
			:opposite enumeratedDomain
		)]
	) ) ( def Perceptory_PerceptorySteriotype ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Steriotype]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "181:2-181:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "182:2-182:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "183:2-183:19"
	) )]
) )
