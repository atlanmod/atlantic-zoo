( declare IEEE1471_Element )
( declare IEEE1471_IEEE1471Model )
( declare IEEE1471_System )
( declare IEEE1471_Mission )
( declare IEEE1471_Environment )
( declare IEEE1471_Architecture )
( declare IEEE1471_Rationale )
( declare IEEE1471_ArchitecturalDescription )
( declare IEEE1471_View )
( declare IEEE1471_Model )
( declare IEEE1471_Stakeholder )
( declare IEEE1471_Concern )
( declare IEEE1471_Viewpoint )
( declare IEEE1471_LibraryViewpoint )
( declare PrimitiveTypes_String )
( def IEEE1471 ( struct-map
	KM3_Package
	:contents[( def IEEE1471_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Element
			:type String
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 0
			:isOrdered false
			:owner IEEE1471_Element
			:type String
			:location "19:3-19:35"
		)]
	) ) ( def IEEE1471_IEEE1471Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "system"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_IEEE1471Model
			:type IEEE1471_System
			:location "27:3-27:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "environment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_IEEE1471Model
			:type IEEE1471_Environment
			:location "28:3-28:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "missions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IEEE1471_IEEE1471Model
			:type IEEE1471_Mission
			:location "29:3-29:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "architecture"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_IEEE1471Model
			:type IEEE1471_Architecture
			:location "30:3-30:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "stakeholders"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IEEE1471_IEEE1471Model
			:type IEEE1471_Stakeholder
			:location "31:3-31:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "concerns"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IEEE1471_IEEE1471Model
			:type IEEE1471_Concern
			:location "32:3-32:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "viewpoints"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IEEE1471_IEEE1471Model
			:type IEEE1471_Viewpoint
			:location "33:3-33:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "libraryViewpoints"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IEEE1471_IEEE1471Model
			:type IEEE1471_LibraryViewpoint
			:location "34:3-34:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "architecturalDescription"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_IEEE1471Model
			:type IEEE1471_ArchitecturalDescription
			:location "35:3-35:75"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rationale"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_IEEE1471Model
			:type IEEE1471_Rationale
			:location "36:3-36:45"
			:isContainer true
		)]
	) ) ( def IEEE1471_System ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fulfils"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_System
			:type IEEE1471_Mission
			:location "42:3-42:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "inhabits"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_System
			:type IEEE1471_Environment
			:location "43:3-43:58"
			:isContainer false
			:opposite influences
		) ( struct-map
			KM3_Reference
			:name "hasAn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_System
			:type IEEE1471_Architecture
			:location "44:3-44:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "has"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_System
			:type IEEE1471_Stakeholder
			:location "45:3-45:36"
			:isContainer false
		)]
	) ) ( def IEEE1471_Mission ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[]
	) ) ( def IEEE1471_Environment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "influences"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Environment
			:type IEEE1471_System
			:location "51:3-51:53"
			:isContainer false
			:opposite inhabits
		)]
	) ) ( def IEEE1471_Architecture ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "describedBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Architecture
			:type IEEE1471_ArchitecturalDescription
			:location "57:3-57:52"
			:isContainer false
		)]
	) ) ( def IEEE1471_Rationale ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "provides"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Rationale
			:type IEEE1471_ArchitecturalDescription
			:location "61:3-61:49"
			:isContainer false
		)]
	) ) ( def IEEE1471_ArchitecturalDescription ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "identifiesS"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_ArchitecturalDescription
			:type IEEE1471_Stakeholder
			:location "65:3-65:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "identifiesC"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_ArchitecturalDescription
			:type IEEE1471_Concern
			:location "66:3-66:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "selects"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_ArchitecturalDescription
			:type IEEE1471_Viewpoint
			:location "67:3-67:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organizedBy"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_ArchitecturalDescription
			:type IEEE1471_View
			:location "68:3-68:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "aggregates"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_ArchitecturalDescription
			:type IEEE1471_Model
			:location "69:3-69:75"
			:isContainer true
			:opposite participatesInAD
		)]
	) ) ( def IEEE1471_View ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "conformsTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_View
			:type IEEE1471_Viewpoint
			:location "73:3-73:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "consitsOf"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_View
			:type IEEE1471_Model
			:location "74:3-74:64"
			:isContainer false
			:opposite participatesInV
		)]
	) ) ( def IEEE1471_Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "participatesInV"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Model
			:type IEEE1471_View
			:location "78:3-78:62"
			:isContainer false
			:opposite consitsOf
		) ( struct-map
			KM3_Reference
			:name "participatesInAD"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Model
			:type IEEE1471_ArchitecturalDescription
			:location "79:3-79:79"
			:isContainer false
			:opposite aggregates
		)]
	) ) ( def IEEE1471_Stakeholder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "has"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Stakeholder
			:type IEEE1471_Concern
			:location "85:3-85:57"
			:isContainer false
			:opposite isImportantTo
		)]
	) ) ( def IEEE1471_Concern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isImportantTo"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Concern
			:type IEEE1471_Stakeholder
			:location "92:3-92:61"
			:isContainer false
			:opposite has
		)]
	) ) ( def IEEE1471_Viewpoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "hasSource"
			:upper 1
			:lower 0
			:isOrdered false
			:owner IEEE1471_Viewpoint
			:type IEEE1471_LibraryViewpoint
			:location "98:3-98:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "usedToCover"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Viewpoint
			:type IEEE1471_Concern
			:location "99:3-99:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "establishesMethodsFor"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Viewpoint
			:type IEEE1471_Model
			:location "100:3-100:48"
			:isContainer false
		)]
	) ) ( def IEEE1471_LibraryViewpoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Element]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "110:2-110:18"
	) )]
) )
