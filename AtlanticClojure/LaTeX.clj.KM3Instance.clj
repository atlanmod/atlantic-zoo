( declare LaTeX_ValuedElement )
( declare LaTeX_Type )
( declare LaTeX_Title )
( declare LaTeX_Name )
( declare LaTeX_Date )
( declare LaTeX_Author )
( declare LaTeX_Adress )
( declare LaTeX_Organisation )
( declare LaTeX_Phone )
( declare LaTeX_Fax )
( declare LaTeX_EMail )
( declare LaTeX_Heading )
( declare LaTeX_Abstract )
( declare LaTeX_Keywords )
( declare LaTeX_SectionBody )
( declare LaTeX_Corps )
( declare LaTeX_Value )
( declare LaTeX_Cite )
( declare LaTeX_Path )
( declare LaTeX_Label )
( declare LaTeX_Figure )
( declare LaTeX_Item )
( declare LaTeX_Items )
( declare LaTeX_Enumerate )
( declare LaTeX_Section )
( declare LaTeX_Description )
( declare LaTeX_Citation )
( declare LaTeX_Bibliography )
( declare LaTeX_DocumentBody )
( declare LaTeX_Document )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def LaTeX ( struct-map
	KM3_Package
	:contents[( def LaTeX_ValuedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_ValuedElement
			:type String
			:location "12:3-12:28"
		)]
	) ) ( def LaTeX_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_Title ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_Name ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LaTeX_Name
			:type LaTeX_Author
			:location "22:3-22:51"
			:isContainer false
			:opposite names
		) ( struct-map
			KM3_Reference
			:name "organisation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LaTeX_Name
			:type LaTeX_Organisation
			:location "23:3-23:63"
			:isContainer false
			:opposite names
		)]
	) ) ( def LaTeX_Date ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_Author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "names"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LaTeX_Author
			:type LaTeX_Name
			:location "30:3-30:59"
			:isContainer true
			:opposite author
		)]
	) ) ( def LaTeX_Adress ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_Organisation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "names"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LaTeX_Organisation
			:type LaTeX_Name
			:location "37:3-37:65"
			:isContainer true
			:opposite organisation
		) ( struct-map
			KM3_Reference
			:name "adress"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Organisation
			:type LaTeX_Adress
			:location "38:3-38:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "heading"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Organisation
			:type LaTeX_Heading
			:location "39:3-39:61"
			:isContainer false
			:opposite organisations
		)]
	) ) ( def LaTeX_Phone ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_Fax ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_EMail ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_Heading ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "organisations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner LaTeX_Heading
			:type LaTeX_Organisation
			:location "52:3-52:74"
			:isContainer true
			:opposite heading
		) ( struct-map
			KM3_Reference
			:name "phone"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LaTeX_Heading
			:type LaTeX_Phone
			:location "53:3-53:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fax"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LaTeX_Heading
			:type LaTeX_Fax
			:location "54:3-54:38"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "email"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LaTeX_Heading
			:type LaTeX_EMail
			:location "55:3-55:42"
			:isContainer true
		)]
	) ) ( def LaTeX_Abstract ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_Keywords ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_SectionBody ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "corps"
			:upper -1
			:lower 0
			:isOrdered false
			:owner LaTeX_SectionBody
			:type LaTeX_Corps
			:location "65:3-65:63"
			:isContainer true
			:opposite sectionbody
		) ( struct-map
			KM3_Reference
			:name "section"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_SectionBody
			:type LaTeX_Section
			:location "66:3-66:59"
			:isContainer false
			:opposite sectionBody
		)]
	) ) ( def LaTeX_Corps ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sectionbody"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Corps
			:type LaTeX_SectionBody
			:location "71:3-71:61"
			:isContainer false
			:opposite corps
		)]
	) ) ( def LaTeX_Value ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_Corps LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_Cite ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_Corps LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_Path ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_Label ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[]
	) ) ( def LaTeX_Figure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_Corps]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "path"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Figure
			:type LaTeX_Path
			:location "87:3-87:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Figure
			:type LaTeX_Label
			:location "88:3-88:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Figure
			:type LaTeX_Title
			:location "89:3-89:37"
			:isContainer true
		)]
	) ) ( def LaTeX_Item ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "itemscontainer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LaTeX_Item
			:type LaTeX_Items
			:location "93:3-93:57"
			:isContainer false
			:opposite item
		) ( struct-map
			KM3_Reference
			:name "enumeratecontainer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LaTeX_Item
			:type LaTeX_Enumerate
			:location "94:3-94:65"
			:isContainer false
			:opposite item
		)]
	) ) ( def LaTeX_Items ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_Corps]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "item"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LaTeX_Items
			:type LaTeX_Item
			:location "98:3-98:66"
			:isContainer true
			:opposite itemscontainer
		)]
	) ) ( def LaTeX_Enumerate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_Corps]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "item"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LaTeX_Enumerate
			:type LaTeX_Item
			:location "102:3-102:70"
			:isContainer true
			:opposite enumeratecontainer
		)]
	) ) ( def LaTeX_Section ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_Corps]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Section
			:type LaTeX_Title
			:location "106:3-106:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "sectionBody"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Section
			:type LaTeX_SectionBody
			:location "107:3-107:73"
			:isContainer true
			:opposite section
		)]
	) ) ( def LaTeX_Description ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LaTeX_ValuedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "date"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Description
			:type LaTeX_Date
			:location "111:3-111:35"
			:isContainer true
		)]
	) ) ( def LaTeX_Citation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Citation
			:type LaTeX_Label
			:location "115:3-115:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Citation
			:type LaTeX_Author
			:location "116:3-116:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Citation
			:type LaTeX_Description
			:location "117:3-117:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bibliography"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Citation
			:type LaTeX_Bibliography
			:location "118:3-118:67"
			:isContainer false
			:opposite citations
		)]
	) ) ( def LaTeX_Bibliography ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "citations"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LaTeX_Bibliography
			:type LaTeX_Citation
			:location "122:3-122:73"
			:isContainer true
			:opposite bibliography
		) ( struct-map
			KM3_Reference
			:name "documentbody"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Bibliography
			:type LaTeX_DocumentBody
			:location "123:3-123:70"
			:isContainer false
			:opposite bibliography
		)]
	) ) ( def LaTeX_DocumentBody ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sections"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LaTeX_DocumentBody
			:type LaTeX_Section
			:location "127:3-127:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bibliography"
			:upper -1
			:lower 0
			:isOrdered false
			:owner LaTeX_DocumentBody
			:type LaTeX_Bibliography
			:location "128:3-128:78"
			:isContainer true
			:opposite documentbody
		) ( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_DocumentBody
			:type LaTeX_Document
			:location "129:3-129:57"
			:isContainer false
			:opposite documentbody
		)]
	) ) ( def LaTeX_Document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Document
			:type LaTeX_Type
			:location "133:3-133:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Document
			:type LaTeX_Title
			:location "134:3-134:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LaTeX_Document
			:type LaTeX_Author
			:location "135:3-135:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "date"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LaTeX_Document
			:type LaTeX_Date
			:location "136:3-136:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "heading"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LaTeX_Document
			:type LaTeX_Heading
			:location "137:3-137:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "abstract"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LaTeX_Document
			:type LaTeX_Abstract
			:location "138:3-138:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "keywords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LaTeX_Document
			:type LaTeX_Keywords
			:location "139:3-139:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "documentbody"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LaTeX_Document
			:type LaTeX_DocumentBody
			:location "140:3-140:71"
			:isContainer true
			:opposite document
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "147:2-147:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "148:2-148:18"
	) )]
) )
