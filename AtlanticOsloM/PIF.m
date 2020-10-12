module PIF {

	type Entity;

	type Activity : Entity;

	type Object : Entity;

	type Timepoint : Entity;

	type Relation : Entity;

	type Decision : Activity;

	type Agent : Object;

	type Creates : Relation;

	type Modifies : Relation;

	type Before : Relation;

	type Uses : Relation;

	type Performs : Relation;

	type ActivityStatus : Relation;

	type Succesor : Relation;
}