( declare FlatSignalFlow_RootFolder )
( declare FlatSignalFlow_RootContainer )
( declare FlatSignalFlow_Actor )
( declare FlatSignalFlow_Transmitter )
( declare FlatSignalFlow_Receiver )
( declare FlatSignalFlow_InputSignal )
( declare FlatSignalFlow_OutputSignal )
( declare FlatSignalFlow_Queue )
( declare FlatSignalFlow_AssociationReceiverQueue )
( declare FlatSignalFlow_AssociationQueueTransmitter )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def FlatSignalFlow ( struct-map
	KM3_Package
	:contents[( def FlatSignalFlow_RootFolder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rootContainer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_RootFolder
			:type FlatSignalFlow_RootContainer
			:location "12:3-12:77"
			:isContainer true
			:opposite rootFolder
		)]
	) ) ( def FlatSignalFlow_RootContainer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_RootContainer
			:type String
			:location "17:3-17:27"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_RootContainer
			:type String
			:location "18:3-18:36"
		) ( struct-map
			KM3_Reference
			:name "rootFolder"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_RootContainer
			:type FlatSignalFlow_RootFolder
			:location "20:3-20:62"
			:isContainer false
			:opposite rootContainer
		) ( struct-map
			KM3_Reference
			:name "actor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_RootContainer
			:type FlatSignalFlow_Actor
			:location "21:3-21:64"
			:isContainer true
			:opposite rootContainer
		) ( struct-map
			KM3_Reference
			:name "inputSignal"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_RootContainer
			:type FlatSignalFlow_InputSignal
			:location "22:3-22:76"
			:isContainer true
			:opposite rootContainer
		) ( struct-map
			KM3_Reference
			:name "outputSignal"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_RootContainer
			:type FlatSignalFlow_OutputSignal
			:location "23:3-23:78"
			:isContainer true
			:opposite rootContainer
		) ( struct-map
			KM3_Reference
			:name "queue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_RootContainer
			:type FlatSignalFlow_Queue
			:location "24:3-24:64"
			:isContainer true
			:opposite rootContainer
		)]
	) ) ( def FlatSignalFlow_Actor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "memory"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Actor
			:type String
			:location "30:3-30:29"
		) ( struct-map
			KM3_Attribute
			:name "script"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Actor
			:type String
			:location "31:3-31:29"
		) ( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Actor
			:type String
			:location "32:3-32:27"
		) ( struct-map
			KM3_Attribute
			:name "WCET"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Actor
			:type String
			:location "33:3-33:27"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Actor
			:type String
			:location "34:3-34:27"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_Actor
			:type String
			:location "35:3-35:36"
		) ( struct-map
			KM3_Reference
			:name "rootContainer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Actor
			:type FlatSignalFlow_RootContainer
			:location "37:3-37:60"
			:isContainer false
			:opposite actor
		) ( struct-map
			KM3_Reference
			:name "transmitter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_Actor
			:type FlatSignalFlow_Transmitter
			:location "38:3-38:68"
			:isContainer true
			:opposite actor
		) ( struct-map
			KM3_Reference
			:name "receiver"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_Actor
			:type FlatSignalFlow_Receiver
			:location "39:3-39:62"
			:isContainer true
			:opposite actor
		)]
	) ) ( def FlatSignalFlow_Transmitter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Transmitter
			:type String
			:location "45:3-45:27"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_Transmitter
			:type String
			:location "46:3-46:36"
		) ( struct-map
			KM3_Reference
			:name "actor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Transmitter
			:type FlatSignalFlow_Actor
			:location "48:3-48:50"
			:isContainer false
			:opposite transmitter
		) ( struct-map
			KM3_Reference
			:name "associationQueueTransmitter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Transmitter
			:type FlatSignalFlow_AssociationQueueTransmitter
			:location "49:3-49:97"
			:isContainer false
			:opposite srctransmitter
		)]
	) ) ( def FlatSignalFlow_Receiver ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Receiver
			:type String
			:location "54:3-54:27"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_Receiver
			:type String
			:location "55:3-55:36"
		) ( struct-map
			KM3_Reference
			:name "actor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Receiver
			:type FlatSignalFlow_Actor
			:location "57:3-57:47"
			:isContainer false
			:opposite receiver
		) ( struct-map
			KM3_Reference
			:name "associationReceiverQueue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Receiver
			:type FlatSignalFlow_AssociationReceiverQueue
			:location "58:3-58:88"
			:isContainer false
			:opposite dstreceiver
		)]
	) ) ( def FlatSignalFlow_InputSignal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_InputSignal
			:type String
			:location "63:3-63:27"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_InputSignal
			:type String
			:location "64:3-64:36"
		) ( struct-map
			KM3_Reference
			:name "rootContainer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_InputSignal
			:type FlatSignalFlow_RootContainer
			:location "66:3-66:66"
			:isContainer false
			:opposite inputSignal
		) ( struct-map
			KM3_Reference
			:name "associationReceiverQueue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_InputSignal
			:type FlatSignalFlow_AssociationReceiverQueue
			:location "67:3-67:88"
			:isContainer false
			:opposite inputSignal
		)]
	) ) ( def FlatSignalFlow_OutputSignal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_OutputSignal
			:type String
			:location "72:3-72:27"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_OutputSignal
			:type String
			:location "73:3-73:36"
		) ( struct-map
			KM3_Reference
			:name "rootContainer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_OutputSignal
			:type FlatSignalFlow_RootContainer
			:location "75:3-75:67"
			:isContainer false
			:opposite outputSignal
		) ( struct-map
			KM3_Reference
			:name "associationQueueTransmitter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_OutputSignal
			:type FlatSignalFlow_AssociationQueueTransmitter
			:location "76:3-76:95"
			:isContainer false
			:opposite outputSignal
		)]
	) ) ( def FlatSignalFlow_Queue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Queue
			:type String
			:location "81:3-81:27"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner FlatSignalFlow_Queue
			:type String
			:location "82:3-82:36"
		) ( struct-map
			KM3_Reference
			:name "rootContainer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Queue
			:type FlatSignalFlow_RootContainer
			:location "84:3-84:60"
			:isContainer false
			:opposite queue
		) ( struct-map
			KM3_Reference
			:name "associationReceiverQueue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Queue
			:type FlatSignalFlow_AssociationReceiverQueue
			:location "85:3-85:85"
			:isContainer false
			:opposite srcqueue
		) ( struct-map
			KM3_Reference
			:name "associationQueueTransmitter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_Queue
			:type FlatSignalFlow_AssociationQueueTransmitter
			:location "86:3-86:91"
			:isContainer false
			:opposite dstqueue
		)]
	) ) ( def FlatSignalFlow_AssociationReceiverQueue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "srcqueue"
			:upper -1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_AssociationReceiverQueue
			:type FlatSignalFlow_Queue
			:location "91:3-91:71"
			:isContainer false
			:opposite associationReceiverQueue
		) ( struct-map
			KM3_Reference
			:name "dstreceiver"
			:upper -1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_AssociationReceiverQueue
			:type FlatSignalFlow_Receiver
			:location "92:3-92:77"
			:isContainer false
			:opposite associationReceiverQueue
		) ( struct-map
			KM3_Reference
			:name "inputSignal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_AssociationReceiverQueue
			:type FlatSignalFlow_InputSignal
			:location "93:3-93:75"
			:isContainer false
			:opposite associationReceiverQueue
		)]
	) ) ( def FlatSignalFlow_AssociationQueueTransmitter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dstqueue"
			:upper -1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_AssociationQueueTransmitter
			:type FlatSignalFlow_Queue
			:location "98:3-98:74"
			:isContainer false
			:opposite associationQueueTransmitter
		) ( struct-map
			KM3_Reference
			:name "srctransmitter"
			:upper -1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_AssociationQueueTransmitter
			:type FlatSignalFlow_Transmitter
			:location "99:3-99:86"
			:isContainer false
			:opposite associationQueueTransmitter
		) ( struct-map
			KM3_Reference
			:name "outputSignal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FlatSignalFlow_AssociationQueueTransmitter
			:type FlatSignalFlow_OutputSignal
			:location "100:3-100:80"
			:isContainer false
			:opposite associationQueueTransmitter
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "105:2-105:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "106:2-106:19"
	) )]
) )
