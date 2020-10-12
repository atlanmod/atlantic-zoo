( declare AnyLogic_ModelElement )
( declare AnyLogic_VisualModelElement )
( declare AnyLogic_Point )
( declare AnyLogic_Model )
( declare AnyLogic_ActiveObjectClass )
( declare AnyLogic_Connector )
( declare AnyLogic_EmbeddedObject )
( declare AnyLogic_ActiveObjectClassRef )
( declare AnyLogic_Parameter )
( declare AnyLogic_Shape )
( declare AnyLogic_EmbeddedObjectPresentation )
( declare AnyLogic_Experiment )
( declare AnyLogic_SimulationExperiment )
( declare AnyLogic_Control )
( declare AnyLogic_Button )
( declare AnyLogic_Frame )
( declare AnyLogic_Text )
( declare AnyLogic_Font )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Double )
( def AnyLogic ( struct-map
	KM3_Package
	:contents[( def AnyLogic_ModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_ModelElement
			:type Integer
			:location "13:6-13:29"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_ModelElement
			:type String
			:location "14:6-14:30"
		) ( struct-map
			KM3_Attribute
			:name "excludeFromBuild"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_ModelElement
			:type Boolean
			:location "15:6-15:43"
		)]
	) ) ( def AnyLogic_VisualModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AnyLogic_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "publicFlag"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_VisualModelElement
			:type Boolean
			:location "21:9-21:40"
		) ( struct-map
			KM3_Attribute
			:name "presentationFlag"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_VisualModelElement
			:type Boolean
			:location "22:6-22:43"
		) ( struct-map
			KM3_Attribute
			:name "showLabel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_VisualModelElement
			:type Boolean
			:location "23:3-23:33"
		) ( struct-map
			KM3_Reference
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_VisualModelElement
			:type AnyLogic_Point
			:location "19:6-19:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_VisualModelElement
			:type AnyLogic_Point
			:location "20:9-20:43"
			:isContainer true
		)]
	) ) ( def AnyLogic_Point ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "x"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Point
			:type Integer
			:location "27:9-27:31"
		) ( struct-map
			KM3_Attribute
			:name "y"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Point
			:type Integer
			:location "28:9-28:31"
		)]
	) ) ( def AnyLogic_Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AnyLogic_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "engineVersion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Model
			:type Integer
			:location "33:6-33:40"
		) ( struct-map
			KM3_Attribute
			:name "javaPackageName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Model
			:type String
			:location "34:6-34:41"
		) ( struct-map
			KM3_Reference
			:name "activeObjectClasses"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AnyLogic_Model
			:type AnyLogic_ActiveObjectClass
			:location "35:3-35:66"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "experiments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AnyLogic_Model
			:type AnyLogic_Experiment
			:location "36:3-36:51"
			:isContainer true
		)]
	) ) ( def AnyLogic_ActiveObjectClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AnyLogic_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "presentationTopGroupPersistent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_ActiveObjectClass
			:type Boolean
			:location "42:3-42:54"
		) ( struct-map
			KM3_Attribute
			:name "iconTopGroupPersistent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_ActiveObjectClass
			:type Boolean
			:location "43:3-43:46"
		) ( struct-map
			KM3_Attribute
			:name "generic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_ActiveObjectClass
			:type Boolean
			:location "44:3-44:31"
		) ( struct-map
			KM3_Attribute
			:name "genericParameters"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_ActiveObjectClass
			:type String
			:location "45:3-45:40"
		) ( struct-map
			KM3_Attribute
			:name "agent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_ActiveObjectClass
			:type Boolean
			:location "46:9-46:35"
		) ( struct-map
			KM3_Attribute
			:name "environmentDefinesInitialLocation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_ActiveObjectClass
			:type Boolean
			:location "47:9-47:63"
		) ( struct-map
			KM3_Reference
			:name "clientAreaTopLeft"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_ActiveObjectClass
			:type AnyLogic_Point
			:location "41:3-41:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "connectors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AnyLogic_ActiveObjectClass
			:type AnyLogic_Connector
			:location "50:3-50:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "embeddedObjects"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AnyLogic_ActiveObjectClass
			:type AnyLogic_EmbeddedObject
			:location "53:3-53:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "shapes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AnyLogic_ActiveObjectClass
			:type AnyLogic_Shape
			:location "56:3-56:41"
			:isContainer true
		)]
	) ) ( def AnyLogic_Connector ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AnyLogic_VisualModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "sourceConnectableName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Connector
			:type String
			:location "64:3-64:44"
		) ( struct-map
			KM3_Attribute
			:name "targetConnectableName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Connector
			:type String
			:location "66:3-66:44"
		) ( struct-map
			KM3_Reference
			:name "sourceEmbeddedObject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Connector
			:type AnyLogic_EmbeddedObject
			:location "63:6-63:54"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "targetEmbeddedObject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Connector
			:type AnyLogic_EmbeddedObject
			:location "65:3-65:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "points"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AnyLogic_Connector
			:type AnyLogic_Point
			:location "67:3-67:41"
			:isContainer true
		)]
	) ) ( def AnyLogic_EmbeddedObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AnyLogic_VisualModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "genericParametersSubstitute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_EmbeddedObject
			:type String
			:location "74:3-74:50"
		) ( struct-map
			KM3_Reference
			:name "presentation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_EmbeddedObject
			:type AnyLogic_EmbeddedObjectPresentation
			:location "72:3-72:55"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "activeObjectClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_EmbeddedObject
			:type AnyLogic_ActiveObjectClassRef
			:location "73:3-73:64"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AnyLogic_EmbeddedObject
			:type AnyLogic_Parameter
			:location "75:3-75:49"
			:isContainer true
		)]
	) ) ( def AnyLogic_ActiveObjectClassRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "packageName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_ActiveObjectClassRef
			:type String
			:location "79:5-79:36"
		) ( struct-map
			KM3_Attribute
			:name "className"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_ActiveObjectClassRef
			:type String
			:location "80:5-80:34"
		)]
	) ) ( def AnyLogic_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Parameter
			:type String
			:location "84:3-84:27"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Parameter
			:type String
			:location "85:3-85:28"
		)]
	) ) ( def AnyLogic_Shape ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AnyLogic_VisualModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "asObject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Shape
			:type Boolean
			:location "89:3-89:32"
		) ( struct-map
			KM3_Attribute
			:name "embeddedIcon"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Shape
			:type Boolean
			:location "90:3-90:36"
		) ( struct-map
			KM3_Attribute
			:name "rotation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Shape
			:type Double
			:location "91:3-91:31"
		)]
	) ) ( def AnyLogic_EmbeddedObjectPresentation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AnyLogic_Shape]
		:structuralFeatures[]
	) ) ( def AnyLogic_Experiment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AnyLogic_ModelElement]
		:structuralFeatures[]
	) ) ( def AnyLogic_SimulationExperiment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AnyLogic_Experiment]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "presentationTopGroupPersistent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Boolean
			:location "105:3-105:54"
		) ( struct-map
			KM3_Attribute
			:name "iconTopGroupPersistent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Boolean
			:location "106:3-106:46"
		) ( struct-map
			KM3_Attribute
			:name "commandLineArguments"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "108:3-108:43"
		) ( struct-map
			KM3_Attribute
			:name "maximumMemory"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Integer
			:location "109:3-109:37"
		) ( struct-map
			KM3_Attribute
			:name "randomSeed"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Boolean
			:location "110:3-110:34"
		) ( struct-map
			KM3_Attribute
			:name "seedValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Integer
			:location "111:3-111:33"
		) ( struct-map
			KM3_Attribute
			:name "vmArgs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "112:3-112:29"
		) ( struct-map
			KM3_Attribute
			:name "absoluteAccuracy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Double
			:location "113:3-113:39"
		) ( struct-map
			KM3_Attribute
			:name "relativeAccuracy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Double
			:location "114:3-114:39"
		) ( struct-map
			KM3_Attribute
			:name "timeAccuracy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Double
			:location "115:3-115:35"
		) ( struct-map
			KM3_Attribute
			:name "fixedTimeStep"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Double
			:location "116:3-116:36"
		) ( struct-map
			KM3_Attribute
			:name "enableAdaptiveFrameManagement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Boolean
			:location "121:3-121:53"
		) ( struct-map
			KM3_Attribute
			:name "enableAntiAliasing"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Boolean
			:location "122:3-122:42"
		) ( struct-map
			KM3_Attribute
			:name "enablePanning"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Boolean
			:location "123:3-123:37"
		) ( struct-map
			KM3_Attribute
			:name "enableZoom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Boolean
			:location "124:3-124:34"
		) ( struct-map
			KM3_Attribute
			:name "executionMode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "125:3-125:36"
		) ( struct-map
			KM3_Attribute
			:name "cpuRatio"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "126:3-126:31"
		) ( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "127:3-127:28"
		) ( struct-map
			KM3_Attribute
			:name "framesPerSecond"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "128:3-128:38"
		) ( struct-map
			KM3_Attribute
			:name "realTimeScale"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "129:3-129:36"
		) ( struct-map
			KM3_Attribute
			:name "useCalendar"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type Boolean
			:location "132:3-132:35"
		) ( struct-map
			KM3_Attribute
			:name "stopOption"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "133:3-133:33"
		) ( struct-map
			KM3_Attribute
			:name "initialDate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "134:3-134:34"
		) ( struct-map
			KM3_Attribute
			:name "initialTime"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "135:3-135:34"
		) ( struct-map
			KM3_Attribute
			:name "finalDate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "136:3-136:32"
		) ( struct-map
			KM3_Attribute
			:name "finalTime"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "137:3-137:32"
		) ( struct-map
			KM3_Attribute
			:name "modelTimeUnit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type String
			:location "138:3-138:36"
		) ( struct-map
			KM3_Reference
			:name "activeObjectClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type AnyLogic_ActiveObjectClass
			:location "102:3-102:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "clientAreaTopLeft"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type AnyLogic_Point
			:location "104:3-104:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "frame"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type AnyLogic_Frame
			:location "107:3-107:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "shapes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type AnyLogic_Shape
			:location "117:3-117:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "controls"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type AnyLogic_Control
			:location "118:3-118:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type AnyLogic_Parameter
			:location "119:3-119:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "uiProperties"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AnyLogic_SimulationExperiment
			:type AnyLogic_Parameter
			:location "130:3-130:52"
			:isContainer true
		)]
	) ) ( def AnyLogic_Control ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AnyLogic_VisualModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Control
			:type Integer
			:location "142:3-142:29"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Control
			:type Integer
			:location "143:3-143:30"
		) ( struct-map
			KM3_Attribute
			:name "asObject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Control
			:type Boolean
			:location "144:3-144:32"
		) ( struct-map
			KM3_Attribute
			:name "embeddedIcon"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Control
			:type Boolean
			:location "145:9-145:41"
		) ( struct-map
			KM3_Attribute
			:name "fillColor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Control
			:type Integer
			:location "146:3-146:33"
		) ( struct-map
			KM3_Attribute
			:name "textColor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Control
			:type Integer
			:location "147:3-147:33"
		) ( struct-map
			KM3_Attribute
			:name "enableExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Control
			:type String
			:location "148:3-148:39"
		) ( struct-map
			KM3_Attribute
			:name "actionCode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Control
			:type String
			:location "149:3-149:33"
		) ( struct-map
			KM3_Attribute
			:name "labelText"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Control
			:type String
			:location "150:3-150:32"
		) ( struct-map
			KM3_Reference
			:name "font"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Control
			:type AnyLogic_Font
			:location "151:3-151:35"
			:isContainer true
		)]
	) ) ( def AnyLogic_Button ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AnyLogic_Control]
		:structuralFeatures[]
	) ) ( def AnyLogic_Frame ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "x"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Frame
			:type Integer
			:location "158:9-158:31"
		) ( struct-map
			KM3_Attribute
			:name "y"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Frame
			:type Integer
			:location "159:9-159:31"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Frame
			:type Integer
			:location "160:9-160:35"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Frame
			:type Integer
			:location "161:9-161:36"
		)]
	) ) ( def AnyLogic_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AnyLogic_Shape]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Text
			:type Integer
			:location "165:3-165:29"
		) ( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Text
			:type String
			:location "166:3-166:27"
		) ( struct-map
			KM3_Attribute
			:name "alignment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Text
			:type String
			:location "168:3-168:32"
		) ( struct-map
			KM3_Reference
			:name "font"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Text
			:type AnyLogic_Font
			:location "167:3-167:35"
			:isContainer true
		)]
	) ) ( def AnyLogic_Font ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Font
			:type String
			:location "172:3-172:27"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Font
			:type Integer
			:location "173:3-173:28"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AnyLogic_Font
			:type Integer
			:location "174:3-174:29"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "179:2-179:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "180:2-180:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "181:2-181:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "182:2-182:18"
	) )]
) )
