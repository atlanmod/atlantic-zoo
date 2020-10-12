CREATE TABLE "Group" (
	__IDGroup__ Integer NOT NULL,
	PRIMARY KEY "Group" (__IDGroup__)
) ;

CREATE TABLE User (
	__IDUser__ Integer NOT NULL,
	PRIMARY KEY User (__IDUser__)
) ;

CREATE TABLE Subject (
	__IDSubject__ Integer NOT NULL,
	FOREIGN KEY "group" (__FKgroup__) REFERENCES "Group" (__IDGroup__),
	PRIMARY KEY Subject (__IDSubject__),
	__FKgroup__ Integer
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	PRIMARY KEY Role (__IDRole__)
) ;

CREATE TABLE Permission (
	__IDPermission__ Integer NOT NULL,
	FOREIGN KEY constraintAssignment (__FKconstraintAssignment__) REFERENCES AuthorizationConstraint (__IDAuthorizationConstraint__),
	PRIMARY KEY Permission (__IDPermission__),
	__FKconstraintAssignment__ Integer
) ;

CREATE TABLE AuthorizationConstraint (
	__IDAuthorizationConstraint__ Integer NOT NULL,
	PRIMARY KEY AuthorizationConstraint (__IDAuthorizationConstraint__)
) ;

CREATE TABLE AtomicAction (
	__IDAtomicAction__ Integer NOT NULL,
	PRIMARY KEY AtomicAction (__IDAtomicAction__)
) ;

CREATE TABLE CompositeAction (
	__IDCompositeAction__ Integer NOT NULL,
	PRIMARY KEY CompositeAction (__IDCompositeAction__)
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	FOREIGN KEY resource (__FKresource__) REFERENCES Resource (__IDResource__),
	PRIMARY KEY Action (__IDAction__),
	__FKresource__ Integer
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	PRIMARY KEY Resource (__IDResource__)
) ;

CREATE TABLE AuthorizationConstraint_permission_Permission (
	__IDAuthorizationConstraint__ Integer NOT NULL,
	__IDPermission__ Integer NOT NULL
) ;

CREATE TABLE Action_actionHyerarchy_CompositeAction (
	__IDAction__ Integer NOT NULL,
	__IDCompositeAction__ Integer NOT NULL
) ;

CREATE TABLE Role_subjectAssignment_Subject (
	__IDRole__ Integer NOT NULL,
	__IDSubject__ Integer NOT NULL
) ;

CREATE TABLE Resource_resourceAction_Action (
	__IDResource__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE Role_permissionAssignment_Permission (
	__IDRole__ Integer NOT NULL,
	__IDPermission__ Integer NOT NULL
) ;

CREATE TABLE Group_subjectGroup_Subject (
	__IDGroup__ Integer NOT NULL,
	__IDSubject__ Integer NOT NULL
) ;

CREATE TABLE Permission_actionAssignment_Action (
	__IDPermission__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE Action_permission_Permission (
	__IDAction__ Integer NOT NULL,
	__IDPermission__ Integer NOT NULL
) ;

CREATE TABLE CompositeAction_subordinatedAction_Action (
	__IDCompositeAction__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE Role_roleHierarchy_Role (
	__IDRole__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE Subject_role_Role (
	__IDSubject__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE Permission_role_Role (
	__IDPermission__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;
