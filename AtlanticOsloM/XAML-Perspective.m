module XAML {

	type Page {
		Xmlns_ContRef : NameSpace*;
		Title_Att : Text;
		GraphContainer_ContRef : GraphicalContainer;
		PageResources_ContRef : PageResource;
	};

	type NameSpace {
		Namespace_Att : Text;
		Identifier_Att : Text;
	};

	type PageResource {
		Dictionaries_ContRef : ResourceDictionary*;
	};

	type GraphicalContainer;

	type WinFXElement {
		Namespace_Ref : NameSpace;
	};

	type PerspectiveElement {
		Namespace_Ref : NameSpace;
	};

	type ResourceDictionary {
		Source_Att : Text;
	};

	type Grid : GraphicalContainer {
		Object3D_ContRef : Object3D*;
	};

	type Object3D;

	type Workshop3D : Object3D, PerspectiveElement {
		Elements3D_ContRef : Element3D*;
	};

	type Element3D;

	type UI3Delement : Element3D {
		Transform_Att : Text;
		Material_Att : Text;
		Name_ContRef : Name;
	};

	type XyzAxis3D : Element3D, PerspectiveElement {
		Length_Att : Double;
	};

	type Box3D : UI3Delement, PerspectiveElement;

	type Square3D : UI3Delement, PerspectiveElement;

	type Name : WinFXElement {
		Name_Att : Text;
	};
}