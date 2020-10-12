( declare HTML_HTML )
( declare HTML_HTMLElement )
( declare HTML_HEAD )
( declare HTML_HEADElement )
( declare HTML_LINK )
( declare HTML_TITLE )
( declare HTML_BODY )
( declare HTML_BODYElement )
( declare HTML_H1 )
( declare HTML_H2 )
( declare HTML_H3 )
( declare HTML_H4 )
( declare HTML_EM )
( declare HTML_STRONG )
( declare HTML_B )
( declare HTML_I )
( declare HTML_TT )
( declare HTML_PRE )
( declare HTML_BIG )
( declare HTML_SMALL )
( declare HTML_SUB )
( declare HTML_SUP )
( declare HTML_STRIKE )
( declare HTML_FONT )
( declare HTML_IMG )
( declare HTML_BR )
( declare HTML_MAP )
( declare HTML_AREA )
( declare HTML_STYLE )
( declare HTML_EMBED )
( declare HTML_NOEMBED )
( declare HTML_SPAN )
( declare HTML_A )
( declare HTML_DIV )
( declare HTML_P )
( declare HTML_TABLEElement )
( declare HTML_TABLE )
( declare HTML_TR )
( declare HTML_TD )
( declare HTML_TH )
( declare HTML_FORM )
( declare HTML_INPUT )
( declare HTML_TEXTAREA )
( declare HTML_SELECT )
( declare HTML_OPTION )
( declare HTML_ListElement )
( declare HTML_OL )
( declare HTML_UL )
( declare HTML_LI )
( declare HTML_DL )
( declare HTML_DT )
( declare HTML_DD )
( declare HTML_APPLET )
( declare HTML_PARAM )
( declare HTML_OBJECT )
( declare HTML_FRAMESET )
( declare HTML_FRAME )
( declare HTML_NOFRAME )
( declare HTML_IFRAME )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def HTML ( struct-map
	KM3_Package
	:contents[( def HTML_HTML ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "head"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_HTML
			:type HTML_HEAD
			:location "11:17-11:65"
			:isContainer true
			:opposite html
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_HTML
			:type HTML_BODY
			:location "12:17-12:65"
			:isContainer true
			:opposite html
		)]
	) ) ( def HTML_HTMLElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_HTMLElement
			:type String
			:location "16:17-16:42"
		) ( struct-map
			KM3_Reference
			:name "children"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HTML_HTMLElement
			:type HTML_HTMLElement
			:location "17:17-17:81"
			:isContainer true
			:opposite parent
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_HTMLElement
			:type HTML_HTMLElement
			:location "18:17-18:68"
			:isContainer false
			:opposite children
		)]
	) ) ( def HTML_HEAD ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_HTMLElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "headElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HTML_HEAD
			:type HTML_HEADElement
			:location "25:17-25:83"
			:isContainer true
			:opposite head
		) ( struct-map
			KM3_Reference
			:name "html"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_HEAD
			:type HTML_HTML
			:location "26:17-26:55"
			:isContainer false
			:opposite head
		)]
	) ) ( def HTML_HEADElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[HTML_HTMLElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "head"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_HEADElement
			:type HTML_HEAD
			:location "30:17-30:63"
			:isContainer false
			:opposite headElements
		)]
	) ) ( def HTML_LINK ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_HEADElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "rel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_LINK
			:type String
			:location "34:17-34:40"
		) ( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_LINK
			:type String
			:location "35:17-35:42"
		) ( struct-map
			KM3_Attribute
			:name "ahref"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_LINK
			:type String
			:location "36:17-36:42"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_LINK
			:type String
			:location "37:17-37:41"
		)]
	) ) ( def HTML_TITLE ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_HEADElement]
		:structuralFeatures[]
	) ) ( def HTML_BODY ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_HTMLElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "background"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_BODY
			:type String
			:location "48:11-48:41"
		) ( struct-map
			KM3_Attribute
			:name "bgcolor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_BODY
			:type String
			:location "49:11-49:38"
		) ( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_BODY
			:type String
			:location "50:11-50:35"
		) ( struct-map
			KM3_Attribute
			:name "link"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_BODY
			:type String
			:location "51:11-51:35"
		) ( struct-map
			KM3_Attribute
			:name "alink"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_BODY
			:type String
			:location "52:11-52:36"
		) ( struct-map
			KM3_Attribute
			:name "vlink"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_BODY
			:type String
			:location "53:11-53:36"
		) ( struct-map
			KM3_Reference
			:name "bodyElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HTML_BODY
			:type HTML_BODYElement
			:location "54:17-54:83"
			:isContainer true
			:opposite body
		) ( struct-map
			KM3_Reference
			:name "html"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_BODY
			:type HTML_HTML
			:location "55:17-55:55"
			:isContainer false
			:opposite body
		)]
	) ) ( def HTML_BODYElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[HTML_HTMLElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_BODYElement
			:type HTML_BODY
			:location "59:17-59:63"
			:isContainer false
			:opposite bodyElements
		)]
	) ) ( def HTML_H1 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_H2 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_H3 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_H4 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_EM ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_STRONG ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_B ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_I ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_TT ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_PRE ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_BIG ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_SMALL ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_SUB ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_SUP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_STRIKE ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_FONT ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FONT
			:type String
			:location "95:17-95:42"
		) ( struct-map
			KM3_Attribute
			:name "face"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FONT
			:type String
			:location "96:17-96:41"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FONT
			:type String
			:location "97:17-97:41"
		)]
	) ) ( def HTML_IMG ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "src"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_IMG
			:type String
			:location "105:17-105:40"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_IMG
			:type String
			:location "106:17-106:42"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_IMG
			:type String
			:location "107:17-107:43"
		) ( struct-map
			KM3_Attribute
			:name "alt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_IMG
			:type String
			:location "108:17-108:40"
		) ( struct-map
			KM3_Attribute
			:name "align"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_IMG
			:type String
			:location "109:17-109:42"
		) ( struct-map
			KM3_Attribute
			:name "vspace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_IMG
			:type String
			:location "110:17-110:43"
		) ( struct-map
			KM3_Attribute
			:name "hspace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_IMG
			:type String
			:location "111:17-111:43"
		) ( struct-map
			KM3_Attribute
			:name "ismap"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_IMG
			:type String
			:location "112:17-112:42"
		) ( struct-map
			KM3_Attribute
			:name "usemap"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_IMG
			:type String
			:location "113:17-113:43"
		) ( struct-map
			KM3_Attribute
			:name "border"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_IMG
			:type String
			:location "114:17-114:43"
		)]
	) ) ( def HTML_BR ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "clear"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_BR
			:type String
			:location "118:11-118:36"
		)]
	) ) ( def HTML_MAP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_AREA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "shape"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_AREA
			:type String
			:location "124:17-124:42"
		) ( struct-map
			KM3_Attribute
			:name "coords"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_AREA
			:type String
			:location "125:17-125:43"
		) ( struct-map
			KM3_Attribute
			:name "ahref"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_AREA
			:type String
			:location "126:11-126:36"
		)]
	) ) ( def HTML_STYLE ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_EMBED ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "src"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_EMBED
			:type String
			:location "134:10-134:33"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_EMBED
			:type String
			:location "135:10-135:35"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_EMBED
			:type String
			:location "136:10-136:36"
		) ( struct-map
			KM3_Attribute
			:name "align"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_EMBED
			:type String
			:location "137:10-137:35"
		) ( struct-map
			KM3_Attribute
			:name "vspace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_EMBED
			:type String
			:location "138:10-138:36"
		) ( struct-map
			KM3_Attribute
			:name "hspace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_EMBED
			:type String
			:location "139:10-139:36"
		) ( struct-map
			KM3_Attribute
			:name "border"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_EMBED
			:type String
			:location "140:10-140:36"
		)]
	) ) ( def HTML_NOEMBED ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_SPAN ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_SPAN
			:type String
			:location "146:10-146:35"
		)]
	) ) ( def HTML_A ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ahref"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_A
			:type String
			:location "150:17-150:42"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_A
			:type String
			:location "151:17-151:41"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_A
			:type String
			:location "152:17-152:39"
		)]
	) ) ( def HTML_DIV ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "align"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_DIV
			:type String
			:location "156:11-156:36"
		)]
	) ) ( def HTML_P ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_BODYElement]
		:structuralFeatures[]
	) ) ( def HTML_TABLEElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[HTML_BODYElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "bgcolor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TABLEElement
			:type String
			:location "167:17-167:44"
		) ( struct-map
			KM3_Attribute
			:name "background"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TABLEElement
			:type String
			:location "168:17-168:47"
		)]
	) ) ( def HTML_TABLE ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_TABLEElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "border"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TABLE
			:type String
			:location "172:5-172:31"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TABLE
			:type String
			:location "173:17-173:42"
		) ( struct-map
			KM3_Attribute
			:name "cellspacing"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TABLE
			:type String
			:location "174:17-174:48"
		) ( struct-map
			KM3_Attribute
			:name "cellpadding"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TABLE
			:type String
			:location "175:17-175:48"
		) ( struct-map
			KM3_Reference
			:name "trs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HTML_TABLE
			:type HTML_TR
			:location "176:17-176:66"
			:isContainer true
			:opposite table
		)]
	) ) ( def HTML_TR ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_TABLEElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "valign"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TR
			:type String
			:location "180:17-180:43"
		) ( struct-map
			KM3_Attribute
			:name "align"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TR
			:type String
			:location "181:17-181:42"
		) ( struct-map
			KM3_Reference
			:name "table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TR
			:type HTML_TABLE
			:location "182:17-182:56"
			:isContainer false
			:opposite trs
		) ( struct-map
			KM3_Reference
			:name "tds"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HTML_TR
			:type HTML_TD
			:location "183:17-183:63"
			:isContainer true
			:opposite tr
		)]
	) ) ( def HTML_TD ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_TABLEElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "colspan"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TD
			:type String
			:location "187:17-187:44"
		) ( struct-map
			KM3_Attribute
			:name "rowspan"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TD
			:type String
			:location "188:17-188:44"
		) ( struct-map
			KM3_Attribute
			:name "valign"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TD
			:type String
			:location "189:17-189:43"
		) ( struct-map
			KM3_Attribute
			:name "align"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TD
			:type String
			:location "190:17-190:42"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TD
			:type String
			:location "191:17-191:42"
		) ( struct-map
			KM3_Reference
			:name "tr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TD
			:type HTML_TR
			:location "192:17-192:50"
			:isContainer false
			:opposite tds
		)]
	) ) ( def HTML_TH ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_TD]
		:structuralFeatures[]
	) ) ( def HTML_FORM ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FORM
			:type String
			:location "205:4-205:30"
		) ( struct-map
			KM3_Attribute
			:name "method"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FORM
			:type String
			:location "206:4-206:30"
		)]
	) ) ( def HTML_INPUT ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "align"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_INPUT
			:type String
			:location "210:4-210:29"
		) ( struct-map
			KM3_Attribute
			:name "maxlength"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_INPUT
			:type String
			:location "211:4-211:33"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_INPUT
			:type String
			:location "212:4-212:28"
		) ( struct-map
			KM3_Attribute
			:name "checked"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_INPUT
			:type String
			:location "213:4-213:31"
		) ( struct-map
			KM3_Attribute
			:name "src"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_INPUT
			:type String
			:location "214:4-214:27"
		) ( struct-map
			KM3_Attribute
			:name "inputValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_INPUT
			:type String
			:location "215:4-215:34"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_INPUT
			:type String
			:location "216:4-216:28"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_INPUT
			:type String
			:location "217:4-217:28"
		)]
	) ) ( def HTML_TEXTAREA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TEXTAREA
			:type String
			:location "221:4-221:28"
		) ( struct-map
			KM3_Attribute
			:name "rows"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TEXTAREA
			:type String
			:location "222:4-222:28"
		) ( struct-map
			KM3_Attribute
			:name "cols"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_TEXTAREA
			:type String
			:location "223:4-223:28"
		)]
	) ) ( def HTML_SELECT ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "multiple"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_SELECT
			:type String
			:location "227:4-227:32"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_SELECT
			:type String
			:location "228:4-228:28"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_SELECT
			:type String
			:location "229:4-229:28"
		)]
	) ) ( def HTML_OPTION ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "selected"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_OPTION
			:type String
			:location "233:4-233:32"
		) ( struct-map
			KM3_Attribute
			:name "optionValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_OPTION
			:type String
			:location "234:4-234:35"
		)]
	) ) ( def HTML_ListElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_ListElement
			:type String
			:location "243:4-243:28"
		)]
	) ) ( def HTML_OL ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_ListElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "start"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_OL
			:type String
			:location "247:10-247:35"
		)]
	) ) ( def HTML_UL ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_ListElement]
		:structuralFeatures[]
	) ) ( def HTML_LI ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_ListElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "liValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_LI
			:type String
			:location "253:10-253:37"
		)]
	) ) ( def HTML_DL ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def HTML_DT ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def HTML_DD ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def HTML_APPLET ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "applet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_APPLET
			:type String
			:location "268:10-268:36"
		) ( struct-map
			KM3_Attribute
			:name "class"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_APPLET
			:type String
			:location "269:10-269:37"
		) ( struct-map
			KM3_Attribute
			:name "src"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_APPLET
			:type String
			:location "270:10-270:33"
		) ( struct-map
			KM3_Attribute
			:name "align"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_APPLET
			:type String
			:location "271:10-271:35"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_APPLET
			:type String
			:location "272:10-272:35"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_APPLET
			:type String
			:location "273:10-273:36"
		)]
	) ) ( def HTML_PARAM ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_PARAM
			:type String
			:location "277:4-277:28"
		) ( struct-map
			KM3_Attribute
			:name "paramValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_PARAM
			:type String
			:location "278:4-278:34"
		)]
	) ) ( def HTML_OBJECT ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "classid"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_OBJECT
			:type String
			:location "282:4-282:31"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_OBJECT
			:type String
			:location "283:4-283:26"
		) ( struct-map
			KM3_Attribute
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_OBJECT
			:type String
			:location "284:4-284:28"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_OBJECT
			:type String
			:location "285:4-285:28"
		) ( struct-map
			KM3_Attribute
			:name "standby"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_OBJECT
			:type String
			:location "286:4-286:31"
		)]
	) ) ( def HTML_FRAMESET ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "rows"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FRAMESET
			:type String
			:location "295:4-295:28"
		) ( struct-map
			KM3_Attribute
			:name "cols"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FRAMESET
			:type String
			:location "296:4-296:28"
		) ( struct-map
			KM3_Attribute
			:name "framespacing"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FRAMESET
			:type String
			:location "297:4-297:36"
		) ( struct-map
			KM3_Attribute
			:name "frameborder"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FRAMESET
			:type String
			:location "298:4-298:35"
		) ( struct-map
			KM3_Attribute
			:name "border"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FRAMESET
			:type String
			:location "299:4-299:30"
		)]
	) ) ( def HTML_FRAME ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "src"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FRAME
			:type String
			:location "302:4-302:27"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FRAME
			:type String
			:location "303:4-303:28"
		) ( struct-map
			KM3_Attribute
			:name "marginwidth"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FRAME
			:type String
			:location "304:4-304:35"
		) ( struct-map
			KM3_Attribute
			:name "marginheight"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FRAME
			:type String
			:location "305:4-305:36"
		) ( struct-map
			KM3_Attribute
			:name "scrolling"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FRAME
			:type String
			:location "306:4-306:33"
		) ( struct-map
			KM3_Attribute
			:name "noresize"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HTML_FRAME
			:type String
			:location "307:4-307:32"
		)]
	) ) ( def HTML_NOFRAME ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def HTML_IFRAME ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HTML_FRAME]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "318:9-318:26"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "319:9-319:25"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "320:9-320:26"
	) )]
) )
