module PtolemyII {

	type EDataType {
		Value_Att : Text;
	};

	type NamedObject {
		Name_Att : Text;
	};

	type Attribute : NamedObject {
		Att_container_Ref : Entity;
		Value_Att : Text;
	};

	type Entity : NamedObject {
		Attributes_ContRef : Attribute*;
		Parameters_ContRef : Parameter*;
		Ports_ContRef : Port*;
	};

	type Port : NamedObject {
		Po_container_Ref : Entity;
		Links_Ref : Relation*;
	};

	type Relation : NamedObject {
		Ports_Ref : Port*;
	};

	type Director : NamedObject {
		Ca_container_Ref : CompositeActor;
	};

	type Parameter : Attribute {
		Pa_container_Ref : Entity;
		DataType_Ref : EDataType;
	};

	type ComponentPort : Port;

	type ComponentRelation : Relation {
		Re_container_Ref : CompositeEntity;
	};

	type ComponentEntity : Attribute {
		Ce_container_Ref : CompositeEntity;
	};

	type AtomicActor : ComponentEntity;

	type CompositeEntity : ComponentEntity {
		Containees_ContRef : ComponentEntity*;
		Relations_ContRef : ComponentRelation*;
	};

	type WorkSpace : CompositeEntity;

	type CompositeActor : CompositeEntity {
		Directors_Ref : Director#0 .. 2;
	};
}