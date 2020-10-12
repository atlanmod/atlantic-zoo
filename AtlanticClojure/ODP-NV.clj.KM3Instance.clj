( declare ODPNV_Node )
( declare ODPNV_Nucleus )
( declare ODPNV_Capsule )
( declare ODPNV_EngineeringObject )
( declare ODPNV_CapsuleManager )
( declare ODPNV_Cluster )
( declare ODPNV_ClusterManager )
( declare ODPNV_BEO )
( declare ODPNV_Stub )
( declare ODPNV_Binder )
( declare ODPNV_ProtocolObject )
( declare ODPNV_Interceptor )
( declare ODPNV_Channel )
( declare ODPNV_ClientServerChannel )
( declare ODPNV_ControllingObject )
( declare ODPNV_SecurityAuthority )
( declare ODPNV_ManagementAuthority )
( declare ODPNV_AddressingAuthority )
( declare ODPNV_NamingAuthority )
( declare ODPNV_ControlledObject )
( declare ODPNV_Domain )
( declare ODPNV_SecurityDomain )
( declare ODPNV_ManagementDomain )
( declare ODPNV_AddressingDomain )
( declare ODPNV_NamingDomain )
( declare ODPNV_EngineeringInterfaceReferenceManagementDomain )
( declare ODPNV_EngineeringInterfaceReferenceManagementPolicy )
( declare ODPNV_EngineeringInterfaceReference )
( declare datatypes_String )
( def ODPNV ( struct-map
	KM3_Package
	:contents[( def ODPNV_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_Node
			:type String
			:location "11:4-11:32"
		) ( struct-map
			KM3_Reference
			:name "manager"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_Node
			:type ODPNV_Nucleus
			:location "14:4-14:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "capsules"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_Node
			:type ODPNV_Capsule
			:location "16:4-16:48"
			:isContainer true
		)]
	) ) ( def ODPNV_Nucleus ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_EngineeringObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "otherEngObjects"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_Nucleus
			:type ODPNV_EngineeringObject
			:location "21:4-21:79"
			:isContainer false
			:opposite nodeManager
		) ( struct-map
			KM3_Reference
			:name "beos"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_Nucleus
			:type ODPNV_BEO
			:location "23:3-23:56"
			:isContainer false
			:opposite beoNodeManager
		)]
	) ) ( def ODPNV_Capsule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "otherEngObjects"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_Capsule
			:type ODPNV_EngineeringObject
			:location "28:4-28:66"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "capsuleManager"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_Capsule
			:type ODPNV_CapsuleManager
			:location "30:4-30:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "clusterManagers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_Capsule
			:type ODPNV_ClusterManager
			:location "32:4-32:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "clusters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_Capsule
			:type ODPNV_Cluster
			:location "34:4-34:49"
			:isContainer true
		)]
	) ) ( def ODPNV_EngineeringObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nodeManager"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_EngineeringObject
			:type ODPNV_Nucleus
			:location "39:4-39:63"
			:isContainer false
			:opposite otherEngObjects
		)]
	) ) ( def ODPNV_CapsuleManager ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_EngineeringObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cmClusterManagers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_CapsuleManager
			:type ODPNV_ClusterManager
			:location "48:4-48:81"
			:isContainer false
			:opposite capsuleManager
		)]
	) ) ( def ODPNV_Cluster ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "clusterManager"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_Cluster
			:type ODPNV_ClusterManager
			:location "53:4-53:66"
			:isContainer false
			:opposite clusters
		) ( struct-map
			KM3_Reference
			:name "clusterBeos"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_Cluster
			:type ODPNV_BEO
			:location "55:4-55:48"
			:isContainer true
		)]
	) ) ( def ODPNV_ClusterManager ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_EngineeringObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "clusters"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPNV_ClusterManager
			:type ODPNV_Cluster
			:location "60:4-60:65"
			:isContainer false
			:opposite clusterManager
		) ( struct-map
			KM3_Reference
			:name "clustermanagerBeos"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_ClusterManager
			:type ODPNV_BEO
			:location "62:4-62:67"
			:isContainer false
			:opposite beoManager
		) ( struct-map
			KM3_Reference
			:name "capsuleManager"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_ClusterManager
			:type ODPNV_CapsuleManager
			:location "64:4-64:75"
			:isContainer false
			:opposite cmClusterManagers
		)]
	) ) ( def ODPNV_BEO ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_EngineeringObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "beoNodeManager"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_BEO
			:type ODPNV_Nucleus
			:location "69:4-69:55"
			:isContainer false
			:opposite beos
		) ( struct-map
			KM3_Reference
			:name "locallyBoundObjects"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_BEO
			:type ODPNV_BEO
			:location "71:4-71:68"
			:isContainer false
			:opposite localbinds
		) ( struct-map
			KM3_Reference
			:name "localbinds"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_BEO
			:type ODPNV_BEO
			:location "73:4-73:68"
			:isContainer false
			:opposite locallyBoundObjects
		) ( struct-map
			KM3_Reference
			:name "beoManager"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_BEO
			:type ODPNV_ClusterManager
			:location "75:4-75:72"
			:isContainer false
			:opposite clustermanagerBeos
		) ( struct-map
			KM3_Reference
			:name "beoChannel"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_BEO
			:type ODPNV_Channel
			:location "77:4-77:63"
			:isContainer false
			:opposite chEndPoint
		) ( struct-map
			KM3_Reference
			:name "beoStub"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_BEO
			:type ODPNV_Stub
			:location "79:4-79:52"
			:isContainer false
			:opposite stBeo
		)]
	) ) ( def ODPNV_Stub ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_EngineeringObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stChannel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_Stub
			:type ODPNV_Channel
			:location "84:4-84:52"
			:isContainer false
			:opposite chStub
		) ( struct-map
			KM3_Reference
			:name "stBinder"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_Stub
			:type ODPNV_Binder
			:location "86:4-86:52"
			:isContainer false
			:opposite chBinder
		) ( struct-map
			KM3_Reference
			:name "stBeo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_Stub
			:type ODPNV_BEO
			:location "88:4-88:45"
			:isContainer false
			:opposite beoStub
		)]
	) ) ( def ODPNV_Binder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_EngineeringObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bdChannel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_Binder
			:type ODPNV_Channel
			:location "93:4-93:54"
			:isContainer false
			:opposite chBinder
		) ( struct-map
			KM3_Reference
			:name "chBinder"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_Binder
			:type ODPNV_Stub
			:location "95:4-95:50"
			:isContainer false
			:opposite stBinder
		) ( struct-map
			KM3_Reference
			:name "bdProtocolObject"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPNV_Binder
			:type ODPNV_ProtocolObject
			:location "97:3-97:74"
			:isContainer false
			:opposite poBinder
		)]
	) ) ( def ODPNV_ProtocolObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_EngineeringObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_ProtocolObject
			:type String
			:location "101:4-101:28"
		) ( struct-map
			KM3_Reference
			:name "poChannel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_ProtocolObject
			:type ODPNV_Channel
			:location "104:4-104:55"
			:isContainer false
			:opposite chPObject
		) ( struct-map
			KM3_Reference
			:name "poBinder"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_ProtocolObject
			:type ODPNV_Binder
			:location "106:3-106:59"
			:isContainer false
			:opposite bdProtocolObject
		) ( struct-map
			KM3_Reference
			:name "poInterceptor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_ProtocolObject
			:type ODPNV_Interceptor
			:location "108:3-108:76"
			:isContainer false
			:opposite intProtocolObject
		) ( struct-map
			KM3_Reference
			:name "poBoundProtocolObject"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_ProtocolObject
			:type ODPNV_ProtocolObject
			:location "110:3-110:58"
			:isContainer false
		)]
	) ) ( def ODPNV_Interceptor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_EngineeringObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "intChannel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_Interceptor
			:type ODPNV_Channel
			:location "115:4-115:60"
			:isContainer false
			:opposite chInterceptor
		) ( struct-map
			KM3_Reference
			:name "intProtocolObject"
			:upper 2
			:lower 2
			:isOrdered false
			:owner ODPNV_Interceptor
			:type ODPNV_ProtocolObject
			:location "117:4-117:80"
			:isContainer false
			:opposite poInterceptor
		)]
	) ) ( def ODPNV_Channel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "chStub"
			:upper -1
			:lower 2
			:isOrdered false
			:owner ODPNV_Channel
			:type ODPNV_Stub
			:location "122:4-122:65"
			:isContainer true
			:opposite stChannel
		) ( struct-map
			KM3_Reference
			:name "chBinder"
			:upper -1
			:lower 2
			:isOrdered false
			:owner ODPNV_Channel
			:type ODPNV_Binder
			:location "124:4-124:69"
			:isContainer true
			:opposite bdChannel
		) ( struct-map
			KM3_Reference
			:name "chPObject"
			:upper -1
			:lower 2
			:isOrdered false
			:owner ODPNV_Channel
			:type ODPNV_ProtocolObject
			:location "126:4-126:78"
			:isContainer true
			:opposite poChannel
		) ( struct-map
			KM3_Reference
			:name "chInterceptor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_Channel
			:type ODPNV_Interceptor
			:location "128:4-128:80"
			:isContainer true
			:opposite intChannel
		) ( struct-map
			KM3_Reference
			:name "chEndPoint"
			:upper -1
			:lower 2
			:isOrdered false
			:owner ODPNV_Channel
			:type ODPNV_BEO
			:location "130:4-130:59"
			:isContainer false
			:opposite beoChannel
		)]
	) ) ( def ODPNV_ClientServerChannel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_Channel]
		:structuralFeatures[]
	) ) ( def ODPNV_ControllingObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_EngineeringObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "coDomain"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_ControllingObject
			:type ODPNV_Domain
			:location "138:4-138:70"
			:isContainer false
			:opposite domControllingObject
		)]
	) ) ( def ODPNV_SecurityAuthority ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_ControllingObject]
		:structuralFeatures[]
	) ) ( def ODPNV_ManagementAuthority ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_ControllingObject]
		:structuralFeatures[]
	) ) ( def ODPNV_AddressingAuthority ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_ControllingObject]
		:structuralFeatures[]
	) ) ( def ODPNV_NamingAuthority ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_ControllingObject]
		:structuralFeatures[]
	) ) ( def ODPNV_ControlledObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_EngineeringObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cdoDomain"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_ControlledObject
			:type ODPNV_Domain
			:location "155:4-155:60"
			:isContainer false
			:opposite domMember
		)]
	) ) ( def ODPNV_Domain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parentDomain"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_Domain
			:type ODPNV_Domain
			:location "160:4-160:57"
			:isContainer false
			:opposite subDomain
		) ( struct-map
			KM3_Reference
			:name "subDomain"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_Domain
			:type ODPNV_Domain
			:location "162:4-162:63"
			:isContainer false
			:opposite parentDomain
		) ( struct-map
			KM3_Reference
			:name "domControllingObject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_Domain
			:type ODPNV_ControllingObject
			:location "164:4-164:75"
			:isContainer false
			:opposite coDomain
		) ( struct-map
			KM3_Reference
			:name "domMember"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_Domain
			:type ODPNV_ControlledObject
			:location "166:4-166:70"
			:isContainer false
			:opposite cdoDomain
		)]
	) ) ( def ODPNV_SecurityDomain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_Domain]
		:structuralFeatures[]
	) ) ( def ODPNV_ManagementDomain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_Domain]
		:structuralFeatures[]
	) ) ( def ODPNV_AddressingDomain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_Domain]
		:structuralFeatures[]
	) ) ( def ODPNV_NamingDomain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_Domain]
		:structuralFeatures[]
	) ) ( def ODPNV_EngineeringInterfaceReferenceManagementDomain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPNV_NamingDomain]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "eirmdReference"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_EngineeringInterfaceReferenceManagementDomain
			:type ODPNV_EngineeringInterfaceReference
			:location "183:4-183:98"
			:isContainer false
			:opposite eirManagementDomain
		) ( struct-map
			KM3_Reference
			:name "eirmdManagementPolicy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_EngineeringInterfaceReferenceManagementDomain
			:type ODPNV_EngineeringInterfaceReferenceManagementPolicy
			:location "185:4-185:117"
			:isContainer false
			:opposite eirmpManagementDomain
		)]
	) ) ( def ODPNV_EngineeringInterfaceReferenceManagementPolicy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "eirmpManagementDomain"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPNV_EngineeringInterfaceReferenceManagementPolicy
			:type ODPNV_EngineeringInterfaceReferenceManagementDomain
			:location "190:4-190:123"
			:isContainer false
			:opposite eirmdManagementPolicy
		)]
	) ) ( def ODPNV_EngineeringInterfaceReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "eirManagementDomain"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPNV_EngineeringInterfaceReference
			:type ODPNV_EngineeringInterfaceReferenceManagementDomain
			:location "195:3-195:107"
			:isContainer false
			:opposite eirmdReference
		)]
	) )]
) )
( def datatypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "200:3-200:19"
	) )]
) )
