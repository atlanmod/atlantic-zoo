module SecureUML {

	type Group : Subject {
		SubjectGroup_ContRef : Subject*;
	};

	type User : Subject;

	type Subject {
		Group_Ref : Group;
		Role_Ref : Role*;
	};

	type Role {
		RoleHierarchy_ContRef : Role*;
		SubjectAssignment_Ref : Subject*;
		PermissionAssignment_Ref : Permission*;
	};

	type Permission {
		Role_Ref : Role*;
		ConstraintAssignment_Ref : AuthorizationConstraint?;
		ActionAssignment_Ref : Action+;
	};

	type AuthorizationConstraint {
		Permission_Ref : Permission*;
	};

	type AtomicAction : Action;

	type CompositeAction : Action {
		SubordinatedAction_ContRef : Action*;
	};

	type Action {
		Permission_Ref : Permission*;
		Resource_Ref : Resource;
		ActionHyerarchy_Ref : CompositeAction*;
	};

	type Resource {
		ResourceAction_ContRef : Action*;
	};
}