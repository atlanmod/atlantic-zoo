( declare PtolemyII_EDataType )
( declare PtolemyII_NamedObject )
( declare PtolemyII_Attribute )
( declare PtolemyII_Entity )
( declare PtolemyII_Port )
( declare PtolemyII_Relation )
( declare PtolemyII_Director )
( declare PtolemyII_Parameter )
( declare PtolemyII_ComponentPort )
( declare PtolemyII_ComponentRelation )
( declare PtolemyII_ComponentEntity )
( declare PtolemyII_AtomicActor )
( declare PtolemyII_CompositeEntity )
( declare PtolemyII_WorkSpace )
( declare PtolemyII_CompositeActor )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def PtolemyII ( struct-map
	KM3_Package
	:contents[( def PtolemyII_EDataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PtolemyII_EDataType
			:type String
			:location "14:3-14:28"
		)]
	) ) ( def PtolemyII_NamedObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PtolemyII_NamedObject
			:type String
			:location "23:3-23:27"
		)]
	) ) ( def PtolemyII_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_NamedObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PtolemyII_Attribute
			:type String
			:location "28:3-28:29"
		) ( struct-map
			KM3_Reference
			:name "att_container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PtolemyII_Attribute
			:type PtolemyII_Entity
			:location "27:3-27:58"
			:isContainer false
			:opposite attributes
		)]
	) ) ( def PtolemyII_Entity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_NamedObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PtolemyII_Entity
			:type PtolemyII_Attribute
			:location "32:3-32:82"
			:isContainer true
			:opposite att_container
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PtolemyII_Entity
			:type PtolemyII_Parameter
			:location "33:3-33:81"
			:isContainer true
			:opposite pa_container
		) ( struct-map
			KM3_Reference
			:name "ports"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PtolemyII_Entity
			:type PtolemyII_Port
			:location "34:3-34:71"
			:isContainer true
			:opposite po_container
		)]
	) ) ( def PtolemyII_Port ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_NamedObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "po_container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PtolemyII_Port
			:type PtolemyII_Entity
			:location "38:3-38:52"
			:isContainer false
			:opposite ports
		) ( struct-map
			KM3_Reference
			:name "links"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PtolemyII_Port
			:type PtolemyII_Relation
			:location "39:3-39:50"
			:isContainer false
			:opposite ports
		)]
	) ) ( def PtolemyII_Relation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_NamedObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PtolemyII_Relation
			:type PtolemyII_Port
			:location "43:3-43:46"
			:isContainer false
			:opposite links
		)]
	) ) ( def PtolemyII_Director ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_NamedObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ca_container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PtolemyII_Director
			:type PtolemyII_CompositeActor
			:location "47:3-47:64"
			:isContainer false
			:opposite directors
		)]
	) ) ( def PtolemyII_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_Attribute]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pa_container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PtolemyII_Parameter
			:type PtolemyII_Entity
			:location "51:3-51:57"
			:isContainer false
			:opposite parameters
		) ( struct-map
			KM3_Reference
			:name "dataType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PtolemyII_Parameter
			:type PtolemyII_EDataType
			:location "52:3-52:34"
			:isContainer false
		)]
	) ) ( def PtolemyII_ComponentPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_Port]
		:structuralFeatures[]
	) ) ( def PtolemyII_ComponentRelation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_Relation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "re_container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PtolemyII_ComponentRelation
			:type PtolemyII_CompositeEntity
			:location "58:3-58:65"
			:isContainer false
			:opposite relations
		)]
	) ) ( def PtolemyII_ComponentEntity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_Attribute]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ce_container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PtolemyII_ComponentEntity
			:type PtolemyII_CompositeEntity
			:location "62:3-62:66"
			:isContainer false
			:opposite containees
		)]
	) ) ( def PtolemyII_AtomicActor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_ComponentEntity]
		:structuralFeatures[]
	) ) ( def PtolemyII_CompositeEntity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_ComponentEntity]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "containees"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PtolemyII_CompositeEntity
			:type PtolemyII_ComponentEntity
			:location "69:3-69:88"
			:isContainer true
			:opposite ce_container
		) ( struct-map
			KM3_Reference
			:name "relations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PtolemyII_CompositeEntity
			:type PtolemyII_ComponentRelation
			:location "70:3-70:89"
			:isContainer true
			:opposite re_container
		)]
	) ) ( def PtolemyII_WorkSpace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_CompositeEntity]
		:structuralFeatures[]
	) ) ( def PtolemyII_CompositeActor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PtolemyII_CompositeEntity]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "directors"
			:upper 2
			:lower 0
			:isOrdered false
			:owner PtolemyII_CompositeActor
			:type PtolemyII_Director
			:location "77:3-77:63"
			:isContainer false
			:opposite ca_container
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "87:2-87:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "88:2-88:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "89:2-89:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "90:2-90:18"
	) )]
) )
