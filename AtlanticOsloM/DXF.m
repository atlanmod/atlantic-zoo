module DXF {

	type DXF {
		Meshes_ContRef : Mesh*;
	};

	type Mesh {
		Name_Att : Text;
		Points_ContRef : Point*;
	};

	type Point {
		Name_Att : Text;
		Mesh_Ref : Mesh;
		X_Att : Double;
		Y_Att : Double;
		Z_Att : Double;
	};
}