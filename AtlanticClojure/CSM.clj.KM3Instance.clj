( declare CSM_CSM )
( declare CSM_GeneralResource )
( declare CSM_Step )
( declare CSM_Scenarion )
( declare CSM_Start )
( declare CSM_End )
( declare CSM_ResourceAcquire )
( declare CSM_ResourceRelease )
( declare CSM_Workload )
( declare CSM_Component )
( declare CSM_ProcessingResource )
( declare CSM_ExternalService )
( declare CSM_ActiveResource )
( declare CSM_PassiveResource )
( declare CSM_Message )
( declare CSM_PathConnection )
( declare CSM_Join )
( declare CSM_Fork )
( declare CSM_Merge )
( declare CSM_Branch )
( declare CSM_Seqence )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def CSM ( struct-map
	KM3_Package
	:contents[( def CSM_CSM ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "step"
			:upper -1
			:lower 1
			:isOrdered false
			:owner CSM_CSM
			:type CSM_Step
			:location "13:3-13:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "generalResource"
			:upper -1
			:lower 1
			:isOrdered false
			:owner CSM_CSM
			:type CSM_GeneralResource
			:location "14:3-14:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "scenarion"
			:upper -1
			:lower 1
			:isOrdered false
			:owner CSM_CSM
			:type CSM_Scenarion
			:location "15:3-15:51"
			:isContainer true
		)]
	) ) ( def CSM_GeneralResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resourceAcquire"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CSM_GeneralResource
			:type CSM_ResourceAcquire
			:location "20:3-20:78"
			:isContainer false
			:opposite generalResource
		) ( struct-map
			KM3_Reference
			:name "resourceRelease"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CSM_GeneralResource
			:type CSM_ResourceRelease
			:location "21:3-21:78"
			:isContainer false
			:opposite generalResource
		)]
	) ) ( def CSM_Step ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_Scenarion]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "postPath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CSM_Step
			:type CSM_PathConnection
			:location "26:3-26:61"
			:isContainer false
			:opposite post
		) ( struct-map
			KM3_Reference
			:name "prePath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CSM_Step
			:type CSM_PathConnection
			:location "27:3-27:59"
			:isContainer false
			:opposite pre
		) ( struct-map
			KM3_Reference
			:name "activeResource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSM_Step
			:type CSM_ActiveResource
			:location "28:3-28:61"
			:isContainer false
			:opposite step
		)]
	) ) ( def CSM_Scenarion ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "step"
			:upper -1
			:lower 1
			:isOrdered false
			:owner CSM_Scenarion
			:type CSM_Step
			:location "33:3-33:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "root"
			:upper -1
			:lower 1
			:isOrdered false
			:owner CSM_Scenarion
			:type CSM_Start
			:location "34:3-34:31"
			:isContainer false
		)]
	) ) ( def CSM_Start ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_Step]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "workload"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CSM_Start
			:type CSM_Workload
			:location "40:3-40:56"
			:isContainer false
			:opposite start
		)]
	) ) ( def CSM_End ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_Step]
		:structuralFeatures[]
	) ) ( def CSM_ResourceAcquire ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_Step]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "generalResource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSM_ResourceAcquire
			:type CSM_GeneralResource
			:location "50:3-50:74"
			:isContainer false
			:opposite resourceAcquire
		)]
	) ) ( def CSM_ResourceRelease ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_Step]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "generalResource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSM_ResourceRelease
			:type CSM_GeneralResource
			:location "55:3-55:74"
			:isContainer false
			:opposite resourceRelease
		)]
	) ) ( def CSM_Workload ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "start"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSM_Workload
			:type CSM_Start
			:location "60:3-60:47"
			:isContainer false
			:opposite workload
		)]
	) ) ( def CSM_Component ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_PassiveResource]
		:structuralFeatures[]
	) ) ( def CSM_ProcessingResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_ActiveResource]
		:structuralFeatures[]
	) ) ( def CSM_ExternalService ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_ActiveResource]
		:structuralFeatures[]
	) ) ( def CSM_ActiveResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_GeneralResource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "step"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CSM_ActiveResource
			:type CSM_Step
			:location "80:3-80:54"
			:isContainer false
			:opposite activeResource
		)]
	) ) ( def CSM_PassiveResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_GeneralResource]
		:structuralFeatures[]
	) ) ( def CSM_Message ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CSM_PathConnection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "message"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CSM_PathConnection
			:type CSM_Message
			:location "95:3-95:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "post"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CSM_PathConnection
			:type CSM_Step
			:location "96:3-96:49"
			:isContainer false
			:opposite postPath
		) ( struct-map
			KM3_Reference
			:name "pre"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CSM_PathConnection
			:type CSM_Step
			:location "97:3-97:47"
			:isContainer false
			:opposite prePath
		)]
	) ) ( def CSM_Join ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_PathConnection]
		:structuralFeatures[]
	) ) ( def CSM_Fork ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_PathConnection]
		:structuralFeatures[]
	) ) ( def CSM_Merge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_PathConnection]
		:structuralFeatures[]
	) ) ( def CSM_Branch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_PathConnection]
		:structuralFeatures[]
	) ) ( def CSM_Seqence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSM_PathConnection]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "126:2-126:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "127:2-127:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "128:2-128:19"
	) )]
) )
