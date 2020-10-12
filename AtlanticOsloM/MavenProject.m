module MavenProject {

	type Project {
		Id_Att : Text;
		GroupId_Att : Text;
		ArtifactId_Att : Text;
		Name_Att : Text;
		Description_Att : Text;
		MailingLists_ContRef : MailingList*;
		DevelopersAndContributors_ContRef : Person*;
		Build_ContRef : Build?;
		Dependencies_ContRef : Project*;
	};

	type Build {
		DefaultGoal_Att : Text;
		SourceDirectory_Att : Text;
		UnitTestSourceDirectory_Att : Text;
		UniTest_Ref : Resource*;
		Resources_Ref : Resource*;
	};

	type Resource {
		TargetPath_Att : Text;
		Filtering_Att : Text;
		Directory_Att : Text;
		Includes_Att : Text;
		Excludes_Att : Text;
	};

	type MailingList {
		Name_Att : Text;
		Subscribe_Att : Text;
		Unsubscribe_Att : Text;
		Post_Att : Text;
		Archive_Att : Text;
		OtherArchives_Att : Text;
	};

	type Person {
		Name_Att : Text;
		Email_Att : Text;
		Url_Att : Text;
		Organization_Att : Text;
		OrganizationUrl_Att : Text;
		Roles_Att : Text;
		Timezone_Att : Text;
		Properties_Att : Text;
	};

	type Developer : Person {
		Id_Att : Text;
	};

	type Contributor : Person;
}