module Repository {

	type Subsystem {
		Classes_ContRef : Class*;
		Relations_ContRef : Relation*;
	};

	type Relation {
		Subsystem_Ref : Subsystem;
		Classes_Ref : Class#2 .. 2;
	};

	type Class {
		Name_Att : Text;
		Is_deferred_Att : Logical;
		Features_ContRef : Feature*;
		ParentSubsystem_Ref : Subsystem;
		Subsystem_Ref : Subsystem;
		Relations_Ref : Relation*;
	};

	type Feature {
		TheClass_Ref : Class;
		Type_Ref : Type;
	};

	type Type {
		Name_Att : Text;
	};

	type Entity : Feature;

	type Routine : Feature;
}