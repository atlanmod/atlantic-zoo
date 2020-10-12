( declare HAL_HAL )
( declare HAL_Connexion )
( declare HAL_Entry )
( declare HAL_Article )
( declare HAL_ArticleRecent )
( declare HAL_ArticleRetro )
( declare HAL_Notice )
( declare HAL_ReferenceBiblioType )
( declare HAL_ArtRevueType )
( declare HAL_WorkshopType )
( declare HAL_ArtOuvrageType )
( declare HAL_OuvrageType )
( declare HAL_TheseType )
( declare HAL_BrevetType )
( declare HAL_AutreType )
( declare HAL_ArtRevue )
( declare HAL_ArtJournal )
( declare HAL_Workshop )
( declare HAL_Communication )
( declare HAL_Conference )
( declare HAL_ArtOuvrage )
( declare HAL_Ouvrage )
( declare HAL_Brevet )
( declare HAL_Autre )
( declare HAL_These )
( declare HAL_MetaType )
( declare HAL_MetaArtType )
( declare HAL_MetaArtNoticeType )
( declare HAL_AutLabType )
( declare HAL_Auteur )
( declare HAL_Laboratoire )
( declare HAL_AbstractMetaLab )
( declare HAL_MetaLab )
( declare HAL_AffiliationType )
( declare HAL_TamponType )
( declare HAL_DateVisibleEnum )
( declare HAL_AbstractDepot )
( declare HAL_Depot )
( declare HAL_FormatEnum )
( declare HAL_DepotWeb )
( declare HAL_FormatWebEnum )
( declare HAL_AbstractDepotType )
( declare HAL_DepotsType )
( declare HAL_WebLink )
( declare HAL_Server )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def HAL ( struct-map
	KM3_Package
	:contents[( def DateVisibleEnum ( :literals[( struct-map
		KM3_EnumLiteral
		:name "15J"
		:location "193:3-193:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "1M"
		:location "194:3-194:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "3M"
		:location "195:3-195:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "1A"
		:location "196:3-196:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "2A"
		:location "197:3-197:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "JAMAIS"
		:location "198:3-198:20"
	)] ) ) ( def FormatEnum ( :literals[( struct-map
		KM3_EnumLiteral
		:name "PDF"
		:location "213:3-213:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "TEX"
		:location "214:3-214:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "DOC"
		:location "215:3-215:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "RTF"
		:location "216:3-216:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "TXT"
		:location "217:3-217:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "PS"
		:location "218:3-218:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "ANNEX"
		:location "219:3-219:19"
	)] ) ) ( def FormatWebEnum ( :literals[( struct-map
		KM3_EnumLiteral
		:name "XML"
		:location "228:3-228:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "HTML"
		:location "229:3-229:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "HTM"
		:location "230:3-230:17"
	)] ) ) ( def HAL_HAL ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "connexion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_HAL
			:type HAL_Connexion
			:location "12:3-12:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HAL_HAL
			:type HAL_Entry
			:location "13:3-13:43"
			:isContainer true
		)]
	) ) ( def HAL_Connexion ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "login"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_Connexion
			:type String
			:location "17:3-17:28"
		) ( struct-map
			KM3_Attribute
			:name "password"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_Connexion
			:type String
			:location "18:3-18:31"
		)]
	) ) ( def HAL_Entry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "autLab"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_Entry
			:type HAL_AutLabType
			:location "23:3-23:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "tampons"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HAL_Entry
			:type HAL_TamponType
			:location "24:3-24:47"
			:isContainer true
		)]
	) ) ( def HAL_Article ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[HAL_Entry]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "metaArt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_Article
			:type HAL_MetaArtType
			:location "28:3-28:45"
			:isContainer true
		)]
	) ) ( def HAL_ArticleRecent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_Article]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fichiers"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_ArticleRecent
			:type HAL_DepotsType
			:location "33:3-33:45"
			:isContainer true
		)]
	) ) ( def HAL_ArticleRetro ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_Article]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dateRedaction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_ArticleRetro
			:type String
			:location "38:3-38:36"
		) ( struct-map
			KM3_Reference
			:name "fichiers"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_ArticleRetro
			:type HAL_AbstractDepot
			:location "39:3-39:48"
			:isContainer true
		)]
	) ) ( def HAL_Notice ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_Entry]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "metaArtNotice"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_Notice
			:type HAL_MetaArtNoticeType
			:location "44:3-44:57"
			:isContainer true
		)]
	) ) ( def HAL_ReferenceBiblioType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def HAL_ArtRevueType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[HAL_ReferenceBiblioType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "urldoi"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_ArtRevueType
			:type String
			:location "53:3-53:34"
		) ( struct-map
			KM3_Attribute
			:name "journal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_ArtRevueType
			:type String
			:location "54:3-54:30"
		) ( struct-map
			KM3_Attribute
			:name "volume"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_ArtRevueType
			:type String
			:location "55:3-55:29"
		) ( struct-map
			KM3_Attribute
			:name "page"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_ArtRevueType
			:type String
			:location "56:3-56:27"
		) ( struct-map
			KM3_Attribute
			:name "annee"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_ArtRevueType
			:type String
			:location "57:3-57:28"
		)]
	) ) ( def HAL_WorkshopType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[HAL_ReferenceBiblioType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "urldoi"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_WorkshopType
			:type String
			:location "61:3-61:34"
		) ( struct-map
			KM3_Attribute
			:name "titconf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_WorkshopType
			:type String
			:location "62:3-62:30"
		) ( struct-map
			KM3_Attribute
			:name "ville"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_WorkshopType
			:type String
			:location "63:3-63:33"
		) ( struct-map
			KM3_Attribute
			:name "pays"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_WorkshopType
			:type String
			:location "64:3-64:27"
		) ( struct-map
			KM3_Attribute
			:name "edcom"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_WorkshopType
			:type String
			:location "65:3-65:33"
		) ( struct-map
			KM3_Attribute
			:name "annee"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_WorkshopType
			:type String
			:location "66:3-66:28"
		) ( struct-map
			KM3_Attribute
			:name "page"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_WorkshopType
			:type String
			:location "67:3-67:32"
		) ( struct-map
			KM3_Attribute
			:name "edsci"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_WorkshopType
			:type String
			:location "68:3-68:33"
		) ( struct-map
			KM3_Attribute
			:name "serie"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_WorkshopType
			:type String
			:location "69:3-69:33"
		)]
	) ) ( def HAL_ArtOuvrageType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[HAL_ReferenceBiblioType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "urldoi"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_ArtOuvrageType
			:type String
			:location "73:3-73:34"
		) ( struct-map
			KM3_Attribute
			:name "titouv"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_ArtOuvrageType
			:type String
			:location "74:3-74:29"
		) ( struct-map
			KM3_Attribute
			:name "edcom"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_ArtOuvrageType
			:type String
			:location "75:3-75:33"
		) ( struct-map
			KM3_Attribute
			:name "annee"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_ArtOuvrageType
			:type String
			:location "76:3-76:28"
		) ( struct-map
			KM3_Attribute
			:name "edsci"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_ArtOuvrageType
			:type String
			:location "77:3-77:33"
		) ( struct-map
			KM3_Attribute
			:name "serie"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_ArtOuvrageType
			:type String
			:location "78:3-78:33"
		)]
	) ) ( def HAL_OuvrageType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[HAL_ReferenceBiblioType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "urldoi"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_OuvrageType
			:type String
			:location "82:3-82:34"
		) ( struct-map
			KM3_Attribute
			:name "edcom"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_OuvrageType
			:type String
			:location "83:3-83:33"
		) ( struct-map
			KM3_Attribute
			:name "annee"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_OuvrageType
			:type String
			:location "84:3-84:28"
		) ( struct-map
			KM3_Attribute
			:name "page"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_OuvrageType
			:type String
			:location "85:3-85:27"
		)]
	) ) ( def HAL_TheseType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[HAL_ReferenceBiblioType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "orgthe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_TheseType
			:type String
			:location "89:3-89:29"
		) ( struct-map
			KM3_Attribute
			:name "niveau"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_TheseType
			:type String
			:location "90:3-90:29"
		) ( struct-map
			KM3_Attribute
			:name "defencedate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_TheseType
			:type String
			:location "91:3-91:34"
		) ( struct-map
			KM3_Attribute
			:name "directeur"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_TheseType
			:type String
			:location "92:3-92:32"
		) ( struct-map
			KM3_Attribute
			:name "codirecteur"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_TheseType
			:type String
			:location "93:3-93:39"
		)]
	) ) ( def HAL_BrevetType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[HAL_ReferenceBiblioType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "datebrevet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_BrevetType
			:type String
			:location "97:3-97:33"
		) ( struct-map
			KM3_Attribute
			:name "numbrevet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_BrevetType
			:type String
			:location "98:3-98:32"
		) ( struct-map
			KM3_Attribute
			:name "page"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_BrevetType
			:type String
			:location "99:3-99:27"
		) ( struct-map
			KM3_Attribute
			:name "pays"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_BrevetType
			:type String
			:location "100:3-100:27"
		)]
	) ) ( def HAL_AutreType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[HAL_ReferenceBiblioType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "urldoi"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_AutreType
			:type String
			:location "104:3-104:34"
		) ( struct-map
			KM3_Attribute
			:name "annee"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_AutreType
			:type String
			:location "105:3-105:33"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_AutreType
			:type String
			:location "106:3-106:34"
		)]
	) ) ( def HAL_ArtRevue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_ArtRevueType]
		:structuralFeatures[]
	) ) ( def HAL_ArtJournal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_ArtRevueType]
		:structuralFeatures[]
	) ) ( def HAL_Workshop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_WorkshopType]
		:structuralFeatures[]
	) ) ( def HAL_Communication ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_WorkshopType]
		:structuralFeatures[]
	) ) ( def HAL_Conference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_WorkshopType]
		:structuralFeatures[]
	) ) ( def HAL_ArtOuvrage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_ArtOuvrageType]
		:structuralFeatures[]
	) ) ( def HAL_Ouvrage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_OuvrageType]
		:structuralFeatures[]
	) ) ( def HAL_Brevet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_BrevetType]
		:structuralFeatures[]
	) ) ( def HAL_Autre ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_AutreType]
		:structuralFeatures[]
	) ) ( def HAL_These ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_TheseType]
		:structuralFeatures[]
	) ) ( def HAL_MetaType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "langue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_MetaType
			:type String
			:location "123:3-123:29"
		) ( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_MetaType
			:type String
			:location "124:3-124:28"
		) ( struct-map
			KM3_Attribute
			:name "comment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaType
			:type String
			:location "125:3-125:35"
		) ( struct-map
			KM3_Attribute
			:name "refInterne"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaType
			:type String
			:location "126:3-126:38"
		) ( struct-map
			KM3_Attribute
			:name "idext"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaType
			:type String
			:location "127:3-127:33"
		) ( struct-map
			KM3_Attribute
			:name "isEpj"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaType
			:type Integer
			:location "128:3-128:34"
		) ( struct-map
			KM3_Attribute
			:name "isEpl"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaType
			:type String
			:location "129:3-129:33"
		) ( struct-map
			KM3_Attribute
			:name "classification"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaType
			:type String
			:location "130:3-130:42"
		) ( struct-map
			KM3_Attribute
			:name "collaboration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaType
			:type String
			:location "131:3-131:41"
		) ( struct-map
			KM3_Attribute
			:name "keyword"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaType
			:type String
			:location "132:3-132:35"
		) ( struct-map
			KM3_Attribute
			:name "datevisible"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaType
			:type DateVisibleEnum
			:location "133:3-133:48"
		) ( struct-map
			KM3_Attribute
			:name "financement"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaType
			:type String
			:location "134:3-134:39"
		) ( struct-map
			KM3_Attribute
			:name "researchteam"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaType
			:type String
			:location "135:3-135:40"
		)]
	) ) ( def HAL_MetaArtType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_MetaType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "domain"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_MetaArtType
			:type String
			:location "139:3-139:29"
		) ( struct-map
			KM3_Attribute
			:name "abstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_MetaArtType
			:type String
			:location "140:3-140:33"
		) ( struct-map
			KM3_Reference
			:name "referenceBiblio"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaArtType
			:type HAL_ReferenceBiblioType
			:location "141:3-141:66"
			:isContainer true
		)]
	) ) ( def HAL_MetaArtNoticeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_MetaType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "domain"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaArtNoticeType
			:type String
			:location "145:3-145:34"
		) ( struct-map
			KM3_Attribute
			:name "abstract"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_MetaArtNoticeType
			:type String
			:location "146:3-146:38"
		) ( struct-map
			KM3_Reference
			:name "referenceBiblio"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_MetaArtNoticeType
			:type HAL_ReferenceBiblioType
			:location "147:3-147:61"
			:isContainer true
		)]
	) ) ( def HAL_AutLabType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "auteurs"
			:upper -1
			:lower 1
			:isOrdered false
			:owner HAL_AutLabType
			:type HAL_Auteur
			:location "153:3-153:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "laboratoires"
			:upper -1
			:lower 1
			:isOrdered false
			:owner HAL_AutLabType
			:type HAL_Laboratoire
			:location "154:3-154:45"
			:isContainer false
		)]
	) ) ( def HAL_Auteur ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "nom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_Auteur
			:type String
			:location "158:3-158:26"
		) ( struct-map
			KM3_Attribute
			:name "prenom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_Auteur
			:type String
			:location "159:3-159:29"
		) ( struct-map
			KM3_Attribute
			:name "autrePrenom"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_Auteur
			:type String
			:location "160:3-160:39"
		) ( struct-map
			KM3_Attribute
			:name "email"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_Auteur
			:type String
			:location "161:3-161:33"
		) ( struct-map
			KM3_Attribute
			:name "urlPerso"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_Auteur
			:type String
			:location "162:3-162:36"
		) ( struct-map
			KM3_Reference
			:name "lab"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HAL_Auteur
			:type HAL_Laboratoire
			:location "163:3-163:36"
			:isContainer false
		)]
	) ) ( def HAL_Laboratoire ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_Laboratoire
			:type Integer
			:location "167:3-167:26"
		) ( struct-map
			KM3_Reference
			:name "metas"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_Laboratoire
			:type HAL_AbstractMetaLab
			:location "168:3-168:47"
			:isContainer true
		)]
	) ) ( def HAL_AbstractMetaLab ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def HAL_MetaLab ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_AbstractMetaLab]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_MetaLab
			:type String
			:location "174:3-174:24"
		)]
	) ) ( def HAL_AffiliationType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "institution"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HAL_AffiliationType
			:type String
			:location "178:3-178:37"
		) ( struct-map
			KM3_Attribute
			:name "prive"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HAL_AffiliationType
			:type String
			:location "179:3-179:31"
		) ( struct-map
			KM3_Attribute
			:name "ecole"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HAL_AffiliationType
			:type String
			:location "180:3-180:31"
		) ( struct-map
			KM3_Attribute
			:name "universite"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HAL_AffiliationType
			:type String
			:location "181:3-181:36"
		)]
	) ) ( def HAL_TamponType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_TamponType
			:type String
			:location "187:3-187:25"
		)]
	) ) ( def HAL_AbstractDepot ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "nom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_AbstractDepot
			:type String
			:location "204:3-204:26"
		)]
	) ) ( def HAL_Depot ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_AbstractDepot]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "format"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_Depot
			:type FormatEnum
			:location "209:3-209:33"
		)]
	) ) ( def HAL_DepotWeb ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_AbstractDepot]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "format"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_DepotWeb
			:type FormatWebEnum
			:location "224:3-224:36"
		)]
	) ) ( def HAL_AbstractDepotType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def HAL_DepotsType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_AbstractDepotType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "depots"
			:upper -1
			:lower 1
			:isOrdered false
			:owner HAL_DepotsType
			:type HAL_AbstractDepot
			:location "237:3-237:51"
			:isContainer true
		)]
	) ) ( def HAL_WebLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HAL_AbstractDepotType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "identifiant"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_WebLink
			:type String
			:location "242:3-242:34"
		) ( struct-map
			KM3_Reference
			:name "server"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HAL_WebLink
			:type HAL_Server
			:location "243:3-243:39"
			:isContainer true
		)]
	) ) ( def HAL_Server ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "251:2-251:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "252:2-252:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "253:2-253:18"
	) )]
) )
