( declare ClassicModels_AddressInfo )
( declare ClassicModels_Date )
( declare ClassicModels_ClassicModels )
( declare ClassicModels_ProductLine )
( declare ClassicModels_Product )
( declare ClassicModels_Office )
( declare ClassicModels_Employee )
( declare ClassicModels_Customer )
( declare ClassicModels_Payment )
( declare ClassicModels_Order )
( declare ClassicModels_OrderDetail )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Double )
( def ClassicModels ( struct-map
	KM3_Package
	:contents[( def ClassicModels_AddressInfo ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "phone"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_AddressInfo
			:type String
			:location "14:3-14:28"
		) ( struct-map
			KM3_Attribute
			:name "addressLine1"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_AddressInfo
			:type String
			:location "15:3-15:35"
		) ( struct-map
			KM3_Attribute
			:name "addressLine2"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_AddressInfo
			:type String
			:location "16:3-16:35"
		) ( struct-map
			KM3_Attribute
			:name "city"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_AddressInfo
			:type String
			:location "17:3-17:27"
		) ( struct-map
			KM3_Attribute
			:name "state"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_AddressInfo
			:type String
			:location "18:3-18:28"
		) ( struct-map
			KM3_Attribute
			:name "postalCode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_AddressInfo
			:type String
			:location "19:3-19:33"
		) ( struct-map
			KM3_Attribute
			:name "country"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_AddressInfo
			:type String
			:location "20:3-20:30"
		)]
	) ) ( def ClassicModels_Date ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Date
			:type Integer
			:location "24:3-24:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Date
			:type Integer
			:location "25:3-25:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Date
			:type Integer
			:location "26:3-26:27"
		)]
	) ) ( def ClassicModels_ClassicModels ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "offices"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ClassicModels_ClassicModels
			:type ClassicModels_Office
			:location "33:3-33:66"
			:isContainer true
			:opposite officeOwner
		) ( struct-map
			KM3_Reference
			:name "productLines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ClassicModels_ClassicModels
			:type ClassicModels_ProductLine
			:location "34:3-34:81"
			:isContainer true
			:opposite productLineOwner
		) ( struct-map
			KM3_Reference
			:name "customers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ClassicModels_ClassicModels
			:type ClassicModels_Customer
			:location "35:3-35:72"
			:isContainer true
			:opposite customerOwner
		)]
	) ) ( def ClassicModels_ProductLine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_ProductLine
			:type String
			:location "42:3-42:27"
		) ( struct-map
			KM3_Attribute
			:name "textDescription"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_ProductLine
			:type String
			:location "43:3-43:38"
		) ( struct-map
			KM3_Attribute
			:name "htmlDescription"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_ProductLine
			:type String
			:location "44:3-44:38"
		) ( struct-map
			KM3_Reference
			:name "productLineOwner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_ProductLine
			:type ClassicModels_ClassicModels
			:location "39:3-39:70"
			:isContainer false
			:opposite productLines
		) ( struct-map
			KM3_Reference
			:name "products"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ClassicModels_ProductLine
			:type ClassicModels_Product
			:location "40:3-40:68"
			:isContainer true
			:opposite productLine
		)]
	) ) ( def ClassicModels_Product ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "code"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Product
			:type String
			:location "50:3-50:27"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Product
			:type String
			:location "51:3-51:27"
		) ( struct-map
			KM3_Attribute
			:name "scale"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Product
			:type String
			:location "52:3-52:28"
		) ( struct-map
			KM3_Attribute
			:name "vendor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Product
			:type String
			:location "53:3-53:29"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Product
			:type String
			:location "54:3-54:34"
		) ( struct-map
			KM3_Attribute
			:name "quantityInStock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Product
			:type Integer
			:location "55:3-55:39"
		) ( struct-map
			KM3_Attribute
			:name "buyPrice"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Product
			:type Double
			:location "56:3-56:31"
		) ( struct-map
			KM3_Attribute
			:name "MSRP"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Product
			:type Double
			:location "57:3-57:27"
		) ( struct-map
			KM3_Reference
			:name "productLine"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Product
			:type ClassicModels_ProductLine
			:location "48:3-48:59"
			:isContainer false
			:opposite products
		)]
	) ) ( def ClassicModels_Office ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ClassicModels_AddressInfo]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "code"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Office
			:type String
			:location "63:3-63:27"
		) ( struct-map
			KM3_Attribute
			:name "territory"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Office
			:type String
			:location "65:3-65:32"
		) ( struct-map
			KM3_Reference
			:name "officeOwner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Office
			:type ClassicModels_ClassicModels
			:location "61:3-61:60"
			:isContainer false
			:opposite offices
		) ( struct-map
			KM3_Reference
			:name "employees"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ClassicModels_Office
			:type ClassicModels_Employee
			:location "64:3-64:65"
			:isContainer true
			:opposite office
		)]
	) ) ( def ClassicModels_Employee ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Employee
			:type Integer
			:location "71:3-71:30"
		) ( struct-map
			KM3_Attribute
			:name "lastName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Employee
			:type String
			:location "73:3-73:31"
		) ( struct-map
			KM3_Attribute
			:name "firstName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Employee
			:type String
			:location "74:3-74:32"
		) ( struct-map
			KM3_Attribute
			:name "extension"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Employee
			:type String
			:location "75:3-75:32"
		) ( struct-map
			KM3_Attribute
			:name "email"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Employee
			:type String
			:location "76:3-76:28"
		) ( struct-map
			KM3_Attribute
			:name "jobTitle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Employee
			:type String
			:location "78:3-78:31"
		) ( struct-map
			KM3_Reference
			:name "office"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Employee
			:type ClassicModels_Office
			:location "69:3-69:50"
			:isContainer false
			:opposite employees
		) ( struct-map
			KM3_Reference
			:name "employeeCustomers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ClassicModels_Employee
			:type ClassicModels_Customer
			:location "72:3-72:73"
			:isContainer false
			:opposite salesRepEmployee
		) ( struct-map
			KM3_Reference
			:name "reportsTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Employee
			:type ClassicModels_Employee
			:location "77:3-77:34"
			:isContainer false
		)]
	) ) ( def ClassicModels_Customer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ClassicModels_AddressInfo]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Customer
			:type Integer
			:location "84:3-84:30"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Customer
			:type String
			:location "88:3-88:27"
		) ( struct-map
			KM3_Attribute
			:name "contactLastName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Customer
			:type String
			:location "89:3-89:38"
		) ( struct-map
			KM3_Attribute
			:name "contactFirstName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Customer
			:type String
			:location "90:3-90:38"
		) ( struct-map
			KM3_Attribute
			:name "creditLimit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Customer
			:type Double
			:location "91:3-91:34"
		) ( struct-map
			KM3_Reference
			:name "customerOwner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Customer
			:type ClassicModels_ClassicModels
			:location "82:3-82:64"
			:isContainer false
			:opposite customers
		) ( struct-map
			KM3_Reference
			:name "orders"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassicModels_Customer
			:type ClassicModels_Order
			:location "85:3-85:71"
			:isContainer true
			:opposite customer
		) ( struct-map
			KM3_Reference
			:name "payments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassicModels_Customer
			:type ClassicModels_Payment
			:location "86:3-86:73"
			:isContainer true
			:opposite customer
		) ( struct-map
			KM3_Reference
			:name "salesRepEmployee"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Customer
			:type ClassicModels_Employee
			:location "87:3-87:70"
			:isContainer false
			:opposite employeeCustomers
		)]
	) ) ( def ClassicModels_Payment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "checkNumber"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Payment
			:type String
			:location "96:3-96:34"
		) ( struct-map
			KM3_Attribute
			:name "amount"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Payment
			:type Double
			:location "98:3-98:29"
		) ( struct-map
			KM3_Reference
			:name "customer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Payment
			:type ClassicModels_Customer
			:location "95:3-95:53"
			:isContainer false
			:opposite payments
		) ( struct-map
			KM3_Reference
			:name "date"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Payment
			:type ClassicModels_Date
			:location "97:3-97:35"
			:isContainer true
		)]
	) ) ( def ClassicModels_Order ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Order
			:type Integer
			:location "104:3-104:30"
		) ( struct-map
			KM3_Attribute
			:name "status"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Order
			:type String
			:location "108:3-108:29"
		) ( struct-map
			KM3_Attribute
			:name "comments"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Order
			:type String
			:location "109:3-109:31"
		) ( struct-map
			KM3_Reference
			:name "customer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Order
			:type ClassicModels_Customer
			:location "102:3-102:53"
			:isContainer false
			:opposite orders
		) ( struct-map
			KM3_Reference
			:name "orderDetails"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ClassicModels_Order
			:type ClassicModels_OrderDetail
			:location "103:3-103:78"
			:isContainer true
			:opposite order
		) ( struct-map
			KM3_Reference
			:name "date"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Order
			:type ClassicModels_Date
			:location "105:3-105:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "requiredDate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_Order
			:type ClassicModels_Date
			:location "106:3-106:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "shippedDate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ClassicModels_Order
			:type ClassicModels_Date
			:location "107:3-107:47"
			:isContainer true
		)]
	) ) ( def ClassicModels_OrderDetail ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "quantityOrdered"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_OrderDetail
			:type Integer
			:location "116:3-116:39"
		) ( struct-map
			KM3_Attribute
			:name "priceEach"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_OrderDetail
			:type Double
			:location "117:3-117:32"
		) ( struct-map
			KM3_Reference
			:name "order"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_OrderDetail
			:type ClassicModels_Order
			:location "113:3-113:51"
			:isContainer false
			:opposite orderDetails
		) ( struct-map
			KM3_Reference
			:name "product"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ClassicModels_OrderDetail
			:type ClassicModels_Product
			:location "115:3-115:31"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "123:2-123:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "124:2-124:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "125:2-125:18"
	) )]
) )
