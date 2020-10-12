module XAML {

	type Transformation;

	type WinFXElement {
		Namespace_Ref : NameSpace;
	};

	type NameSpace {
		Namespace_Att : Text;
		Identifier_Att : Text;
	};

	type ResourceGroup {
		Key_ContRef : Key;
	};

	type Material;

	type Key : WinFXElement {
		Name_Att : Text;
	};

	type ResourceDictionary {
		Resourcegroups_ContRef : ResourceGroup*;
		Xmlns_ContRef : NameSpace*;
	};

	type Transform3DGroup : ResourceGroup {
		Transformations_ContRef : Transformation*;
	};

	type MaterialGroup : ResourceGroup {
		Materials_ContRef : Material*;
	};

	type DiffuseMaterial : Material {
		Brush_Att : Text;
	};

	type TranslateTransform3D : Transformation {
		OffsetX_Att : Double;
		OffsetY_Att : Double;
		OffsetZ_Att : Double;
	};

	type ScaleTransform3D : Transformation {
		ScaleX_Att : Double;
		ScaleY_Att : Double;
		ScaleZ_Att : Double;
	};

	type RotateTransform3D : Transformation {
		CenterX_Att : Double;
		CenterY_Att : Double;
		Rotation_ContRef : RotateTransformat3DRotation;
	};

	type RotateTransformat3DRotation {
		AxisAngleRotation3D_ContRef : AxisAngleRotation3D;
	};

	type AxisAngleRotation3D {
		Angle_Att : Integer32;
		Axis_Att : Text;
	};
}