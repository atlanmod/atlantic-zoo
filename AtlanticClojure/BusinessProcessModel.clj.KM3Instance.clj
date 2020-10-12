( declare BusinessProcessModel_Namespace )
( declare BusinessProcessModel_Task )
( declare BusinessProcessModel_DataSet )
( declare BusinessProcessModel_Parameter )
( declare BusinessProcessModel_DataElement )
( declare BusinessProcessModel_ModelElement )
( declare BusinessProcessModel_Flow )
( declare BusinessProcessModel_DataFlow )
( declare BusinessProcessModel_ControlFlow )
( declare BusinessProcessModel_ControlPoint )
( declare BusinessProcessModel_Input )
( declare BusinessProcessModel_Output )
( declare BusinessProcessModel_OutputSet )
( declare BusinessProcessModel_InputSet )
( declare BusinessProcessModel_Exception )
( declare BusinessProcessModel_SimpleTask )
( declare BusinessProcessModel_CoumpoundTask )
( declare BusinessProcessModel_MutliTask )
( declare BusinessProcessModel_InvokerTask )
( declare BusinessProcessModel_TerminatorTask )
( declare BusinessProcessModel_ApplicationTask )
( declare BusinessProcessModel_Decision )
( declare BusinessProcessModel_Clock )
( declare BusinessProcessModel_SendCommunication )
( declare BusinessProcessModel_ReceiveCommunication )
( declare BusinessProcessModel_BusinessProcess )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def BusinessProcessModel ( struct-map
	KM3_Package
	:contents[( def BusinessProcessModel_Namespace ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_Task ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BusinessProcessModel_Namespace]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "containsDataSet"
			:upper -1
			:lower 3
			:isOrdered false
			:owner BusinessProcessModel_Task
			:type BusinessProcessModel_DataSet
			:location "18:3-18:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "containsControlPoint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_Task
			:type BusinessProcessModel_ControlPoint
			:location "19:3-19:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "invoker"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_Task
			:type BusinessProcessModel_InvokerTask
			:location "20:3-20:58"
			:isContainer false
			:opposite invokes
		) ( struct-map
			KM3_Reference
			:name "terminator"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_Task
			:type BusinessProcessModel_TerminatorTask
			:location "21:3-21:67"
			:isContainer false
			:opposite terminates
		)]
	) ) ( def BusinessProcessModel_DataSet ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BusinessProcessModel_Namespace]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contains"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_DataSet
			:type BusinessProcessModel_DataElement
			:location "25:3-25:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_DataSet
			:type BusinessProcessModel_ControlFlow
			:location "26:3-26:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "triggers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_DataSet
			:type BusinessProcessModel_ControlPoint
			:location "27:3-27:41"
			:isContainer false
		)]
	) ) ( def BusinessProcessModel_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_DataElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BusinessProcessModel_Parameter]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sink"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BusinessProcessModel_DataElement
			:type BusinessProcessModel_DataFlow
			:location "33:3-33:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BusinessProcessModel_DataElement
			:type BusinessProcessModel_DataFlow
			:location "34:3-34:31"
			:isContainer false
		)]
	) ) ( def BusinessProcessModel_ModelElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_Flow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_ModelElement]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_DataFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_Flow]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_ControlFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_Flow]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_ControlPoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sink"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_ControlPoint
			:type BusinessProcessModel_ControlFlow
			:location "46:3-46:36"
			:isContainer false
		)]
	) ) ( def BusinessProcessModel_Input ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_DataElement]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_Output ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_DataElement]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_OutputSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_DataSet]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "containsOutput"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_OutputSet
			:type BusinessProcessModel_Output
			:location "54:3-54:51"
			:isContainer true
		)]
	) ) ( def BusinessProcessModel_InputSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_DataSet]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "containsInput"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_InputSet
			:type BusinessProcessModel_Input
			:location "58:3-58:49"
			:isContainer true
		)]
	) ) ( def BusinessProcessModel_Exception ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_Output]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_SimpleTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_Task]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_CoumpoundTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_Task]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "containsTask"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_CoumpoundTask
			:type BusinessProcessModel_Task
			:location "66:3-66:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "containsFlow"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_CoumpoundTask
			:type BusinessProcessModel_Flow
			:location "67:3-67:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "realizes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BusinessProcessModel_CoumpoundTask
			:type BusinessProcessModel_BusinessProcess
			:location "68:3-68:40"
			:isContainer false
		)]
	) ) ( def BusinessProcessModel_MutliTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_CoumpoundTask]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_InvokerTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_SimpleTask]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "invokes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_InvokerTask
			:type BusinessProcessModel_Task
			:location "74:3-74:51"
			:isContainer false
			:opposite invoker
		)]
	) ) ( def BusinessProcessModel_TerminatorTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_SimpleTask]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "terminates"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessProcessModel_TerminatorTask
			:type BusinessProcessModel_Task
			:location "78:3-78:57"
			:isContainer false
			:opposite terminator
		)]
	) ) ( def BusinessProcessModel_ApplicationTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_SimpleTask]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_Decision ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_ApplicationTask]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_Clock ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_ApplicationTask]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_SendCommunication ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_ApplicationTask]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_ReceiveCommunication ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_ApplicationTask]
		:structuralFeatures[]
	) ) ( def BusinessProcessModel_BusinessProcess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessProcessModel_ApplicationTask]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "95:2-95:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "96:2-96:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "97:2-97:18"
	) )]
) )
