( declare Deployment_Node )
( declare Deployment_Device )
( declare Deployment_ExecutionEnvironment )
( declare Deployment_Specification )
( declare Deployment_CommunicationLink )
( declare PrimitiveTypes_String )
( def Deployment ( struct-map
	KM3_Package
	:contents[( def Deployment_Node ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Deployment_Node
			:type String
			:location "11:3-11:32"
		) ( struct-map
			KM3_Reference
			:name "nestedNode"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Deployment_Node
			:type Deployment_Node
			:location "10:3-10:52"
			:isContainer true
		)]
	) ) ( def Deployment_Device ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Deployment_Node]
		:structuralFeatures[]
	) ) ( def Deployment_ExecutionEnvironment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Deployment_Node]
		:structuralFeatures[]
	) ) ( def Deployment_Specification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedNode"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Deployment_Specification
			:type Deployment_Node
			:location "23:3-23:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ownedCommunicationLink"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Deployment_Specification
			:type Deployment_CommunicationLink
			:location "24:3-24:77"
			:isContainer true
		)]
	) ) ( def Deployment_CommunicationLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Deployment_CommunicationLink
			:type String
			:location "30:3-30:32"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Deployment_CommunicationLink
			:type Deployment_Node
			:location "28:3-28:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Deployment_CommunicationLink
			:type Deployment_Node
			:location "29:3-29:32"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "34:5-34:21"
	) )]
) )
