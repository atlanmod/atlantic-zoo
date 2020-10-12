( declare CML_PCDATA )
( declare CML_Any )
( declare CML_TitledElement )
( declare CML_IdedElement )
( declare CML_ConventionnedElement )
( declare CML_DictRefElement )
( declare CML_SimpleLink_Element )
( declare CML_Counted_Element )
( declare CML_Sized_Element )
( declare CML_Rows_Element )
( declare CML_Columns_Element )
( declare CML_Min_Element )
( declare CML_Max_Element )
( declare CML_Units_Element )
( declare CML_AngleUnits )
( declare CML_AngleUnits_Element )
( declare CML_UnitsRef_Element )
( declare CML_AtomRefs_Element )
( declare CML_StringBuiltin )
( declare CML__StringBuiltin )
( declare CML__String )
( declare CML__Link )
( declare CML_FloatBuiltin )
( declare CML__FloatBuiltin )
( declare CML__Float )
( declare CML_IntegerBuiltin )
( declare CML__IntegerBuiltin )
( declare CML__Integer )
( declare CML__StringArray )
( declare CML__FloatArray )
( declare CML__IntegerArray )
( declare CML__FloatMatrix )
( declare CML_Coordinate2Builtin )
( declare CML__Coordinate2Builtin )
( declare CML__Coordinate2 )
( declare CML_Coordinate3Builtin )
( declare CML__Coordinate3Builtin )
( declare CML__Coordinate3 )
( declare CML__Angle )
( declare CML__Torsion )
( declare CML__List )
( declare CML_Molecule )
( declare CML_Formula )
( declare CML_Atom )
( declare CML_Atom_Array )
( declare CML_Bond )
( declare CML_Bond_Array )
( declare CML_Electron )
( declare CML_Reaction )
( declare CML_Crystal )
( declare CML_Sequence )
( declare CML_Feature )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def CML ( struct-map
	KM3_Package
	:contents[( def AngleUnits ( :literals[( struct-map
		KM3_EnumLiteral
		:name "degrees"
		:location "71:3-71:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "radians"
		:location "72:3-72:19"
	)] ) ) ( def StringBuiltin ( :literals[( struct-map
		KM3_EnumLiteral
		:name "id"
		:location "97:3-97:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "elementType"
		:location "99:3-99:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "atomId"
		:location "100:3-100:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "residueType"
		:location "101:3-101:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "residueId"
		:location "102:3-102:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "atomRef"
		:location "104:3-104:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "order"
		:location "105:3-105:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "stereo"
		:location "106:3-106:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "spaceground"
		:location "108:3-108:23"
	)] ) ) ( def FloatBuiltin ( :literals[( struct-map
		KM3_EnumLiteral
		:name "x2"
		:location "133:3-133:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "y2"
		:location "134:3-134:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "x3"
		:location "135:3-135:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "y3"
		:location "136:3-136:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "z3"
		:location "137:3-137:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "xFract"
		:location "138:3-138:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "yFract"
		:location "139:3-139:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "zFract"
		:location "140:3-140:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "occupancy"
		:location "141:3-141:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "isotope"
		:location "142:3-142:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "formalCharge"
		:location "143:3-143:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "hydrogenCount"
		:location "144:3-144:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "nonHydrogenCount"
		:location "145:3-145:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "atomParity"
		:location "146:3-146:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "length"
		:location "148:3-148:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "acell"
		:location "150:3-150:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "bcell"
		:location "151:3-151:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "ccell"
		:location "152:3-152:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "alpha"
		:location "153:3-153:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "beta"
		:location "154:3-154:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "gamma"
		:location "155:3-155:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "z"
		:location "156:3-156:13"
	)] ) ) ( def IntegerBuiltin ( :literals[( struct-map
		KM3_EnumLiteral
		:name "isotope"
		:location "173:3-173:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "formalCharge"
		:location "174:3-174:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "hydrogenCount"
		:location "175:3-175:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "nonHydrogenCount"
		:location "176:3-176:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "atomParity"
		:location "177:3-177:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "z"
		:location "179:3-179:13"
	)] ) ) ( def Coordinate2Builtin ( :literals[( struct-map
		KM3_EnumLiteral
		:name "xy2"
		:location "228:3-228:15"
	)] ) ) ( def Coordinate3Builtin ( :literals[( struct-map
		KM3_EnumLiteral
		:name "xyz3"
		:location "244:3-244:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "xyzFract"
		:location "245:3-245:20"
	)] ) ) ( def CML_PCDATA ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CML_PCDATA
			:type String
			:location "12:3-12:28"
		)]
	) ) ( def CML_Any ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CML_TitledElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML_TitledElement
			:type String
			:location "20:3-20:33"
		)]
	) ) ( def CML_IdedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML_IdedElement
			:type String
			:location "25:3-25:30"
		)]
	) ) ( def CML_ConventionnedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "convention"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CML_ConventionnedElement
			:type String
			:location "30:3-30:33"
		)]
	) ) ( def CML_DictRefElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dictRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML_DictRefElement
			:type String
			:location "34:3-34:35"
		)]
	) ) ( def CML_SimpleLink_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "href"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CML_SimpleLink_Element
			:type String
			:location "38:3-38:27"
		)]
	) ) ( def CML_Counted_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "count"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CML_Counted_Element
			:type String
			:location "43:3-43:28"
		)]
	) ) ( def CML_Sized_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML_Sized_Element
			:type String
			:location "47:3-47:32"
		)]
	) ) ( def CML_Rows_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "rows"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CML_Rows_Element
			:type String
			:location "51:3-51:27"
		)]
	) ) ( def CML_Columns_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "colums"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CML_Columns_Element
			:type String
			:location "55:3-55:29"
		)]
	) ) ( def CML_Min_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "min"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML_Min_Element
			:type String
			:location "59:3-59:31"
		)]
	) ) ( def CML_Max_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "max"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML_Max_Element
			:type String
			:location "63:3-63:31"
		)]
	) ) ( def CML_Units_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "units"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML_Units_Element
			:type String
			:location "67:3-67:33"
		)]
	) ) ( def CML_AngleUnits_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "angleUnits"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CML_AngleUnits_Element
			:type AngleUnits
			:location "77:3-77:37"
		)]
	) ) ( def CML_UnitsRef_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "unitsRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML_UnitsRef_Element
			:type String
			:location "81:3-81:36"
		)]
	) ) ( def CML_AtomRefs_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "atomRefs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML_AtomRefs_Element
			:type String
			:location "85:3-85:36"
		)]
	) ) ( def CML__StringBuiltin ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[CML_AtomRefs_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "builtin"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML__StringBuiltin
			:type StringBuiltin
			:location "112:3-112:42"
		)]
	) ) ( def CML__String ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_PCDATA CML_TitledElement CML_IdedElement CML__StringBuiltin CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[]
	) ) ( def CML__Link ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_PCDATA CML_TitledElement CML_IdedElement CML_SimpleLink_Element CML_ConventionnedElement]
		:structuralFeatures[]
	) ) ( def CML__FloatBuiltin ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "builtin"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML__FloatBuiltin
			:type FloatBuiltin
			:location "160:3-160:41"
		)]
	) ) ( def CML__Float ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_PCDATA CML_TitledElement CML_IdedElement CML__FloatBuiltin CML_Min_Element CML_Max_Element CML_Units_Element CML_UnitsRef_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[]
	) ) ( def CML__IntegerBuiltin ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "builtin"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML__IntegerBuiltin
			:type IntegerBuiltin
			:location "183:3-183:43"
		)]
	) ) ( def CML__Integer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_PCDATA CML_TitledElement CML_IdedElement CML__IntegerBuiltin CML_Min_Element CML_Max_Element CML_Units_Element CML_UnitsRef_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[]
	) ) ( def CML__StringArray ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_PCDATA CML_TitledElement CML_IdedElement CML__StringBuiltin CML_Sized_Element CML_Min_Element CML_Max_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "delimiter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML__StringArray
			:type String
			:location "195:3-195:37"
		)]
	) ) ( def CML__FloatArray ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_PCDATA CML_TitledElement CML_IdedElement CML__FloatBuiltin CML_Sized_Element CML_Min_Element CML_Max_Element CML_Units_Element CML_UnitsRef_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[]
	) ) ( def CML__IntegerArray ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_PCDATA CML_TitledElement CML_IdedElement CML__IntegerBuiltin CML_Sized_Element CML_Min_Element CML_Max_Element CML_Units_Element CML_UnitsRef_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[]
	) ) ( def CML__FloatMatrix ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_PCDATA CML_TitledElement CML_IdedElement CML_Rows_Element CML_Columns_Element CML_Min_Element CML_Max_Element CML_Units_Element CML_UnitsRef_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[]
	) ) ( def CML__Coordinate2Builtin ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "builtin"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML__Coordinate2Builtin
			:type Coordinate2Builtin
			:location "232:3-232:47"
		)]
	) ) ( def CML__Coordinate2 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_PCDATA CML_TitledElement CML_IdedElement CML__Coordinate2Builtin CML_UnitsRef_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[]
	) ) ( def CML__Coordinate3Builtin ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "builtin"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CML__Coordinate3Builtin
			:type Coordinate3Builtin
			:location "249:3-249:47"
		)]
	) ) ( def CML__Coordinate3 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_PCDATA CML_TitledElement CML_IdedElement CML__Coordinate3Builtin CML_UnitsRef_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[]
	) ) ( def CML__Angle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_PCDATA CML_TitledElement CML_IdedElement CML_AtomRefs_Element CML_AngleUnits_Element CML_Min_Element CML_Max_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[]
	) ) ( def CML__Torsion ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_PCDATA CML_TitledElement CML_IdedElement CML_AtomRefs_Element CML_AngleUnits_Element CML_Min_Element CML_Max_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[]
	) ) ( def CML__List ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_TitledElement CML_IdedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "any"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CML__List
			:type CML_Any
			:location "277:3-277:26"
			:isContainer false
		)]
	) ) ( def CML_Molecule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_TitledElement CML_IdedElement CML_Counted_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "any"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CML_Molecule
			:type CML_Any
			:location "289:3-289:26"
			:isContainer false
		)]
	) ) ( def CML_Formula ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_TitledElement CML_IdedElement CML_Counted_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "any"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CML_Formula
			:type CML_Any
			:location "293:3-293:26"
			:isContainer false
		)]
	) ) ( def CML_Atom ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_TitledElement CML_IdedElement CML_Counted_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "any"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CML_Atom
			:type CML_Any
			:location "297:3-297:26"
			:isContainer false
		)]
	) ) ( def CML_Atom_Array ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_TitledElement CML_IdedElement CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "any"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CML_Atom_Array
			:type CML_Any
			:location "301:3-301:26"
			:isContainer false
		)]
	) ) ( def CML_Bond ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_IdedElement CML_AtomRefs_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "any"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CML_Bond
			:type CML_Any
			:location "305:3-305:26"
			:isContainer false
		)]
	) ) ( def CML_Bond_Array ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_IdedElement CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "any"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CML_Bond_Array
			:type CML_Any
			:location "309:3-309:26"
			:isContainer false
		)]
	) ) ( def CML_Electron ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_IdedElement CML_Counted_Element CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "any"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CML_Electron
			:type CML_Any
			:location "313:3-313:26"
			:isContainer false
		)]
	) ) ( def CML_Reaction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_IdedElement CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "any"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CML_Reaction
			:type CML_Any
			:location "317:3-317:26"
			:isContainer false
		)]
	) ) ( def CML_Crystal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_TitledElement CML_IdedElement CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "any"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CML_Crystal
			:type CML_Any
			:location "321:3-321:26"
			:isContainer false
		)]
	) ) ( def CML_Sequence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_TitledElement CML_IdedElement CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "any"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CML_Sequence
			:type CML_Any
			:location "325:3-325:26"
			:isContainer false
		)]
	) ) ( def CML_Feature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CML_Any CML_TitledElement CML_IdedElement CML_DictRefElement CML_ConventionnedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "any"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CML_Feature
			:type CML_Any
			:location "329:3-329:26"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "337:2-337:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "338:2-338:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "339:2-339:19"
	) )]
) )
