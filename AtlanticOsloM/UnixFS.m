module UnixFS {

	type NamedElement {
		Name_Att : Text;
	};

	type File : NamedElement {
		Owner_Att : Text;
		Group_Att : Text;
	};

	type Directory : File {
		Contents_ContRef : File*;
	};

	type FileSystemRoot : Directory;

	type TextFile : File;
}