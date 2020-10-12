( declare DNSR_NamedElement )
( declare DNSR_Assembly )
( declare DNSR_ManifestResource )
( declare DNSR_Module )
( declare DNSR_MemberInfo )
( declare DNSR_PropertyInfo )
( declare DNSR_FieldInfo )
( declare DNSR_EventInfo )
( declare DNSR_ParameterInfo )
( declare DNSR_MethodBase )
( declare DNSR_MethodInfo )
( declare DNSR_ConstructorInfo )
( declare DNSR_Type )
( declare DNSR_EventAttributes )
( declare DNSR_FieldAttributes )
( declare DNSR_GenericParameterAttributes )
( declare DNSR_MemberTypes )
( declare DNSR_MethodAttributes )
( declare DNSR_ParameterAttributes )
( declare DNSR_PropertyAttributes )
( declare DNSR_TypeAttributes )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def DNSR ( struct-map
	KM3_Package
	:contents[( def EventAttributes ( :literals[( struct-map
		KM3_EnumLiteral
		:name "None"
		:location "103:3-103:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "ReservedMask"
		:location "104:3-104:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "RTSpecialName"
		:location "105:3-105:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "SpecialName"
		:location "106:3-106:24"
	)] ) ) ( def FieldAttributes ( :literals[( struct-map
		KM3_EnumLiteral
		:name "FieldAccessMask"
		:location "110:3-110:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "PrivateScope"
		:location "111:3-111:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "Private"
		:location "112:3-112:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "Assembly"
		:location "113:3-113:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Family"
		:location "114:3-114:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "FamANDAssem"
		:location "115:3-115:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "FamORAssem"
		:location "116:3-116:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "Public"
		:location "117:3-117:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Shared"
		:location "118:3-118:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "InitOnly"
		:location "119:3-119:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Literal"
		:location "120:3-120:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "NotSerialized"
		:location "121:3-121:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "SpecialName"
		:location "122:3-122:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "PinvokeImpl"
		:location "123:3-123:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "ReservedMask"
		:location "124:3-124:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "RTSpecialName"
		:location "125:3-125:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "HasFieldMarshal"
		:location "126:3-126:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "HasDefault"
		:location "127:3-127:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "HasFieldRVA"
		:location "128:3-128:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "Static"
		:location "129:3-129:19"
	)] ) ) ( def GenericParameterAttributes ( :literals[( struct-map
		KM3_EnumLiteral
		:name "HasElementType"
		:location "133:3-133:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "Abstract"
		:location "134:3-134:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "AnsiClass"
		:location "135:3-135:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "AutoClass"
		:location "136:3-136:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "AutoLayout"
		:location "137:3-137:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "ByRef"
		:location "138:3-138:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Class"
		:location "139:3-139:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "COMObject"
		:location "140:3-140:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "Contextful"
		:location "141:3-141:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "Enum"
		:location "142:3-142:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "ExplicitLayout"
		:location "143:3-143:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "Import"
		:location "144:3-144:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Interface"
		:location "145:3-145:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "LayoutSequential"
		:location "146:3-146:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "MarshalByRef"
		:location "147:3-147:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedAssembly"
		:location "148:3-148:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedFamADNAssem"
		:location "149:3-149:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedFamily"
		:location "150:3-150:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedFamORAssem"
		:location "151:3-151:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedPrivate"
		:location "152:3-152:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedPublic"
		:location "153:3-153:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "NotPublic"
		:location "154:3-154:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "Pointer"
		:location "155:3-155:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "Primitive"
		:location "156:3-156:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "Public"
		:location "157:3-157:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Sealed"
		:location "158:3-158:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Serializable"
		:location "159:3-159:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "SpecialName"
		:location "160:3-160:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "UnicodeClass"
		:location "161:3-161:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "ValueType"
		:location "162:3-162:22"
	)] ) ) ( def MemberTypes ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Constructor"
		:location "166:3-166:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "Event"
		:location "167:3-167:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Field"
		:location "168:3-168:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Method"
		:location "169:3-169:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Property"
		:location "170:3-170:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "TypeInfo"
		:location "171:3-171:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Custom"
		:location "172:3-172:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedType"
		:location "173:3-173:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "All"
		:location "174:3-174:16"
	)] ) ) ( def MethodAttributes ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Abstract"
		:location "178:3-178:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Assembly"
		:location "179:3-179:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ChekedAccessOnOverride"
		:location "180:3-180:35"
	) ( struct-map
		KM3_EnumLiteral
		:name "FamADNAssem"
		:location "181:3-181:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "Family"
		:location "182:3-182:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "FamORAssem"
		:location "183:3-183:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "Final"
		:location "184:3-184:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "HasSecurity"
		:location "185:3-185:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "HideBySig"
		:location "186:3-186:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "MemberAccessMask"
		:location "187:3-187:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "NewSlot"
		:location "188:3-188:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "PInvokeImpl"
		:location "189:3-189:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "Private"
		:location "190:3-190:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "PrivateScope"
		:location "191:3-191:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "Public"
		:location "192:3-192:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "RequiredSecObject"
		:location "193:3-193:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "ReservedMask"
		:location "194:3-194:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "ReuseSlot"
		:location "195:3-195:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "RTSpecialName"
		:location "196:3-196:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "SpecialName"
		:location "197:3-197:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "Static"
		:location "198:3-198:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "UnmanagedExport"
		:location "199:3-199:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "Virtual"
		:location "200:3-200:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "VtableLayoutMask"
		:location "201:3-201:29"
	)] ) ) ( def ParameterAttributes ( :literals[( struct-map
		KM3_EnumLiteral
		:name "HasDefault"
		:location "205:3-205:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "HasDefaultMArshal"
		:location "206:3-206:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "In"
		:location "207:3-207:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "Lcid"
		:location "208:3-208:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "None"
		:location "209:3-209:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "Optional"
		:location "210:3-210:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Out"
		:location "211:3-211:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "Reserved3"
		:location "212:3-212:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "Reserved4"
		:location "213:3-213:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "ReservedMask"
		:location "214:3-214:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "RetVal"
		:location "215:3-215:19"
	)] ) ) ( def PropertyAttributes ( :literals[( struct-map
		KM3_EnumLiteral
		:name "NotSupported"
		:location "219:3-219:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "Optional"
		:location "220:3-220:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Read"
		:location "221:3-221:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "Required"
		:location "222:3-222:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Write"
		:location "223:3-223:18"
	)] ) ) ( def TypeAttributes ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Abstract"
		:location "227:3-227:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "AnsiClass"
		:location "228:3-228:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "AutoClass"
		:location "229:3-229:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "AutoLayout"
		:location "230:3-230:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "BeforFieldInit"
		:location "231:3-231:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "Class"
		:location "232:3-232:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "ClassSemanticsMask"
		:location "233:3-233:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "ExplicitLayout"
		:location "234:3-234:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "HasSecutity"
		:location "235:3-235:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "Import"
		:location "236:3-236:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Interface"
		:location "237:3-237:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "LayoutMask"
		:location "238:3-238:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedAssembly"
		:location "239:3-239:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedFamADNAssem"
		:location "240:3-240:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedFamily"
		:location "241:3-241:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedFamORAssem"
		:location "242:3-242:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedPrivate"
		:location "243:3-243:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "NestedPublic"
		:location "244:3-244:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "NotPublic"
		:location "245:3-245:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "Public"
		:location "246:3-246:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "ReservedMask"
		:location "247:3-247:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "RTSpecialName"
		:location "248:3-248:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "Sealed"
		:location "249:3-249:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "SequentialLayout"
		:location "250:3-250:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "Serializable"
		:location "251:3-251:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "SpecialName"
		:location "252:3-252:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "StringFormatMask"
		:location "253:3-253:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "UnicodeClass"
		:location "254:3-254:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "VisibilityMask"
		:location "255:3-255:27"
	)] ) ) ( def DNSR_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_NamedElement
			:type String
			:location "14:3-14:28"
		)]
	) ) ( def DNSR_Assembly ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DNSR_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_Assembly
			:type String
			:location "20:3-20:32"
		) ( struct-map
			KM3_Attribute
			:name "imageRuntimeVersion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_Assembly
			:type String
			:location "21:3-21:43"
		) ( struct-map
			KM3_Attribute
			:name "evidence"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_Assembly
			:type String
			:location "22:3-22:32"
		) ( struct-map
			KM3_Attribute
			:name "codeBase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_Assembly
			:type String
			:location "23:3-23:32"
		) ( struct-map
			KM3_Reference
			:name "entryPoint"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_Assembly
			:type DNSR_MethodInfo
			:location "24:3-24:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "modules"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DNSR_Assembly
			:type DNSR_Module
			:location "25:3-25:66"
			:isContainer true
			:opposite assembly
		) ( struct-map
			KM3_Reference
			:name "manifestModule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_Assembly
			:type DNSR_Module
			:location "26:3-26:54"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "referencedAssembly"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DNSR_Assembly
			:type DNSR_Assembly
			:location "27:3-27:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "manifest"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_Assembly
			:type DNSR_ManifestResource
			:location "28:3-28:71"
			:isContainer true
			:opposite assembly
		)]
	) ) ( def DNSR_ManifestResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_ManifestResource
			:type String
			:location "32:3-32:31"
		) ( struct-map
			KM3_Reference
			:name "assembly"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_ManifestResource
			:type DNSR_Assembly
			:location "33:3-33:54"
			:isContainer false
			:opposite manifest
		)]
	) ) ( def DNSR_Module ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DNSR_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "qualifiedName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_Module
			:type String
			:location "39:3-39:37"
		) ( struct-map
			KM3_Attribute
			:name "scopeName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_Module
			:type String
			:location "40:3-40:33"
		) ( struct-map
			KM3_Reference
			:name "assembly"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_Module
			:type DNSR_Assembly
			:location "41:3-41:53"
			:isContainer false
			:opposite modules
		) ( struct-map
			KM3_Reference
			:name "types"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DNSR_Module
			:type DNSR_Type
			:location "42:3-42:60"
			:isContainer true
			:opposite module
		)]
	) ) ( def DNSR_MemberInfo ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DNSR_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "memberType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_MemberInfo
			:type MemberTypes
			:location "48:3-48:39"
		) ( struct-map
			KM3_Reference
			:name "declaringType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_MemberInfo
			:type DNSR_Type
			:location "49:3-49:53"
			:isContainer false
			:opposite members
		)]
	) ) ( def DNSR_PropertyInfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DNSR_MemberInfo]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DNSR_PropertyInfo
			:type PropertyAttributes
			:location "54:3-54:51"
		) ( struct-map
			KM3_Reference
			:name "propertyType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_PropertyInfo
			:type DNSR_Type
			:location "53:3-53:34"
			:isContainer false
		)]
	) ) ( def DNSR_FieldInfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DNSR_MemberInfo]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DNSR_FieldInfo
			:type FieldAttributes
			:location "59:3-59:49"
		) ( struct-map
			KM3_Reference
			:name "fieldType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_FieldInfo
			:type DNSR_Type
			:location "58:3-58:31"
			:isContainer false
		)]
	) ) ( def DNSR_EventInfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DNSR_MemberInfo]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isMulticast"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DNSR_EventInfo
			:type Boolean
			:location "63:3-63:41"
		) ( struct-map
			KM3_Attribute
			:name "attributes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DNSR_EventInfo
			:type EventAttributes
			:location "64:3-64:48"
		) ( struct-map
			KM3_Reference
			:name "eventHandlerType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_EventInfo
			:type DNSR_Type
			:location "65:3-65:38"
			:isContainer false
		)]
	) ) ( def DNSR_ParameterInfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DNSR_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "defaultValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DNSR_ParameterInfo
			:type String
			:location "69:3-69:41"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_ParameterInfo
			:type Integer
			:location "70:3-70:33"
		) ( struct-map
			KM3_Attribute
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DNSR_ParameterInfo
			:type ParameterAttributes
			:location "71:3-71:52"
		) ( struct-map
			KM3_Reference
			:name "parameterType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_ParameterInfo
			:type DNSR_Type
			:location "72:3-72:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "member"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_ParameterInfo
			:type DNSR_MethodBase
			:location "73:3-73:56"
			:isContainer false
			:opposite parameters
		)]
	) ) ( def DNSR_MethodBase ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DNSR_MemberInfo]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DNSR_MethodBase
			:type MethodAttributes
			:location "78:3-78:49"
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DNSR_MethodBase
			:type DNSR_ParameterInfo
			:location "79:3-79:74"
			:isContainer true
			:opposite member
		)]
	) ) ( def DNSR_MethodInfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DNSR_MethodBase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "returnType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DNSR_MethodInfo
			:type DNSR_Type
			:location "83:3-83:37"
			:isContainer false
		)]
	) ) ( def DNSR_ConstructorInfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DNSR_MethodBase]
		:structuralFeatures[]
	) ) ( def DNSR_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DNSR_MemberInfo]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_Type
			:type String
			:location "91:3-91:33"
		) ( struct-map
			KM3_Attribute
			:name "genericParameterAttributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DNSR_Type
			:type GenericParameterAttributes
			:location "92:3-92:75"
		) ( struct-map
			KM3_Attribute
			:name "typeAttributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DNSR_Type
			:type TypeAttributes
			:location "93:3-93:51"
		) ( struct-map
			KM3_Reference
			:name "baseType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DNSR_Type
			:type DNSR_Type
			:location "94:3-94:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "module"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DNSR_Type
			:type DNSR_Module
			:location "95:3-95:46"
			:isContainer false
			:opposite types
		) ( struct-map
			KM3_Reference
			:name "interfaces"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DNSR_Type
			:type DNSR_Type
			:location "96:3-96:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "members"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DNSR_Type
			:type DNSR_MemberInfo
			:location "97:3-97:75"
			:isContainer true
			:opposite declaringType
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "264:2-264:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "265:2-265:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "266:2-266:19"
	) )]
) )
