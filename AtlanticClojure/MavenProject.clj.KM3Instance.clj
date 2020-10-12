( declare MavenProject_Project )
( declare MavenProject_Build )
( declare MavenProject_Resource )
( declare MavenProject_MailingList )
( declare MavenProject_Person )
( declare MavenProject_Developer )
( declare MavenProject_Contributor )
( declare PrimitiveTypes_String )
( def MavenProject ( struct-map
	KM3_Package
	:contents[( def MavenProject_Project ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Project
			:type String
			:location "14:4-14:32"
		) ( struct-map
			KM3_Attribute
			:name "groupId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Project
			:type String
			:location "15:4-15:37"
		) ( struct-map
			KM3_Attribute
			:name "artifactId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Project
			:type String
			:location "16:4-16:40"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Project
			:type String
			:location "17:4-17:34"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Project
			:type String
			:location "18:4-18:41"
		) ( struct-map
			KM3_Reference
			:name "mailingLists"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenProject_Project
			:type MavenProject_MailingList
			:location "19:4-19:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "developersAndContributors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenProject_Project
			:type MavenProject_Person
			:location "20:4-20:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "build"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Project
			:type MavenProject_Build
			:location "21:4-21:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dependencies"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MavenProject_Project
			:type MavenProject_Project
			:location "22:4-22:59"
			:isContainer true
		)]
	) ) ( def MavenProject_Build ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "defaultGoal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Build
			:type String
			:location "27:4-27:41"
		) ( struct-map
			KM3_Attribute
			:name "sourceDirectory"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_Build
			:type String
			:location "28:4-28:39"
		) ( struct-map
			KM3_Attribute
			:name "unitTestSourceDirectory"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Build
			:type String
			:location "29:4-29:53"
		) ( struct-map
			KM3_Reference
			:name "uniTest"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenProject_Build
			:type MavenProject_Resource
			:location "30:4-30:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "resources"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenProject_Build
			:type MavenProject_Resource
			:location "31:4-31:39"
			:isContainer false
		)]
	) ) ( def MavenProject_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "targetPath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Resource
			:type String
			:location "36:3-36:39"
		) ( struct-map
			KM3_Attribute
			:name "filtering"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Resource
			:type String
			:location "37:3-37:38"
		) ( struct-map
			KM3_Attribute
			:name "directory"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Resource
			:type String
			:location "38:3-38:38"
		) ( struct-map
			KM3_Attribute
			:name "includes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Resource
			:type String
			:location "39:3-39:37"
		) ( struct-map
			KM3_Attribute
			:name "excludes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenProject_Resource
			:type String
			:location "40:3-40:37"
		)]
	) ) ( def MavenProject_MailingList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_MailingList
			:type String
			:location "46:6-46:30"
		) ( struct-map
			KM3_Attribute
			:name "subscribe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_MailingList
			:type String
			:location "47:6-47:35"
		) ( struct-map
			KM3_Attribute
			:name "unsubscribe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_MailingList
			:type String
			:location "48:6-48:37"
		) ( struct-map
			KM3_Attribute
			:name "post"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_MailingList
			:type String
			:location "49:6-49:30"
		) ( struct-map
			KM3_Attribute
			:name "archive"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_MailingList
			:type String
			:location "50:6-50:33"
		) ( struct-map
			KM3_Attribute
			:name "otherArchives"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_MailingList
			:type String
			:location "51:6-51:39"
		)]
	) ) ( def MavenProject_Person ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_Person
			:type String
			:location "55:5-55:29"
		) ( struct-map
			KM3_Attribute
			:name "email"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_Person
			:type String
			:location "56:5-56:30"
		) ( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_Person
			:type String
			:location "57:5-57:28"
		) ( struct-map
			KM3_Attribute
			:name "organization"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_Person
			:type String
			:location "58:5-58:37"
		) ( struct-map
			KM3_Attribute
			:name "organizationUrl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_Person
			:type String
			:location "59:5-59:40"
		) ( struct-map
			KM3_Attribute
			:name "roles"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_Person
			:type String
			:location "60:5-60:30"
		) ( struct-map
			KM3_Attribute
			:name "timezone"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_Person
			:type String
			:location "61:5-61:33"
		) ( struct-map
			KM3_Attribute
			:name "properties"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_Person
			:type String
			:location "62:5-62:35"
		)]
	) ) ( def MavenProject_Developer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenProject_Person]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenProject_Developer
			:type String
			:location "67:5-67:27"
		)]
	) ) ( def MavenProject_Contributor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenProject_Person]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "77:5-77:21"
	) )]
) )
