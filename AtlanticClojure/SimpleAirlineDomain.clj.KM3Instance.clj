( declare SimpleAirlineDomain_Airport )
( declare SimpleAirlineDomain_Flight )
( declare SimpleAirlineDomain_Airline )
( declare SimpleAirlineDomain_Passenger )
( declare SimpleAirlineDomain_Genre )
( declare SimpleAirlineDomain_Time )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def SimpleAirlineDomain ( struct-map
	KM3_Package
	:contents[( def Genre ( :literals[( struct-map
		KM3_EnumLiteral
		:name "male"
		:location "47:3-47:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "female"
		:location "48:3-48:18"
	)] ) ) ( def SimpleAirlineDomain_Airport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Airport
			:type String
			:location "17:3-17:27"
		) ( struct-map
			KM3_Reference
			:name "departingFlight"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleAirlineDomain_Airport
			:type SimpleAirlineDomain_Flight
			:location "18:3-18:60"
			:isContainer false
			:opposite origin
		) ( struct-map
			KM3_Reference
			:name "arrivingFlight"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleAirlineDomain_Airport
			:type SimpleAirlineDomain_Flight
			:location "19:3-19:64"
			:isContainer false
			:opposite destination
		)]
	) ) ( def SimpleAirlineDomain_Flight ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "maxnrPassengers"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Flight
			:type Integer
			:location "25:3-25:39"
		) ( struct-map
			KM3_Reference
			:name "departTime"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Flight
			:type SimpleAirlineDomain_Time
			:location "23:3-23:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "duration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Flight
			:type SimpleAirlineDomain_Time
			:location "24:3-24:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "passenger"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SimpleAirlineDomain_Flight
			:type SimpleAirlineDomain_Passenger
			:location "26:3-26:65"
			:isContainer false
			:opposite flight
		) ( struct-map
			KM3_Reference
			:name "airline"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Flight
			:type SimpleAirlineDomain_Airline
			:location "27:3-27:49"
			:isContainer false
			:opposite flight
		) ( struct-map
			KM3_Reference
			:name "origin"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Flight
			:type SimpleAirlineDomain_Airport
			:location "28:3-28:57"
			:isContainer false
			:opposite departingFlight
		) ( struct-map
			KM3_Reference
			:name "destination"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Flight
			:type SimpleAirlineDomain_Airport
			:location "29:3-29:61"
			:isContainer false
			:opposite arrivingFlight
		)]
	) ) ( def SimpleAirlineDomain_Airline ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Airline
			:type String
			:location "33:3-33:27"
		) ( struct-map
			KM3_Attribute
			:name "nationality"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Airline
			:type String
			:location "34:3-34:34"
		) ( struct-map
			KM3_Reference
			:name "flight"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleAirlineDomain_Airline
			:type SimpleAirlineDomain_Flight
			:location "35:3-35:52"
			:isContainer false
			:opposite airline
		)]
	) ) ( def SimpleAirlineDomain_Passenger ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Passenger
			:type String
			:location "39:3-39:27"
		) ( struct-map
			KM3_Attribute
			:name "age"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Passenger
			:type Integer
			:location "40:3-40:27"
		) ( struct-map
			KM3_Attribute
			:name "gender"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Passenger
			:type Genre
			:location "41:3-41:28"
		) ( struct-map
			KM3_Attribute
			:name "needsAssistance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Passenger
			:type Boolean
			:location "42:3-42:39"
		) ( struct-map
			KM3_Reference
			:name "flight"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Passenger
			:type SimpleAirlineDomain_Flight
			:location "43:3-43:50"
			:isContainer false
			:opposite passenger
		)]
	) ) ( def SimpleAirlineDomain_Time ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Time
			:type Integer
			:location "52:3-52:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Time
			:type Integer
			:location "53:3-53:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Time
			:type Integer
			:location "54:3-54:28"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Time
			:type Integer
			:location "55:3-55:28"
		) ( struct-map
			KM3_Attribute
			:name "minute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Time
			:type Integer
			:location "56:3-56:30"
		) ( struct-map
			KM3_Attribute
			:name "second"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleAirlineDomain_Time
			:type Integer
			:location "57:3-57:30"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "62:2-62:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "63:2-63:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "64:2-64:18"
	) )]
) )
