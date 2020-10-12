CREATE TABLE EnterpriseObject (
	__IDEnterpriseObject__ Integer NOT NULL,
	FOREIGN KEY eoEOPD (__FKeoEOPD__) REFERENCES EO_P_D (__IDEO_P_D__),
	PRIMARY KEY EnterpriseObject (__IDEnterpriseObject__),
	__FKeoEOPD__ Integer
) ;

CREATE TABLE ODPSystem (
	__IDODPSystem__ Integer NOT NULL,
	FOREIGN KEY odpBehaviour (__FKodpBehaviour__) REFERENCES Scope (__IDScope__),
	FOREIGN KEY odpSpecifier (__FKodpSpecifier__) REFERENCES EnterpriseSpecification (__IDEnterpriseSpecification__),
	PRIMARY KEY ODPSystem (__IDODPSystem__),
	__FKodpBehaviour__ Integer,
	__FKodpSpecifier__ Integer
) ;

CREATE TABLE Party (
	__IDParty__ Integer NOT NULL,
	FOREIGN KEY ptyEOPD (__FKptyEOPD__) REFERENCES EO_P_D (__IDEO_P_D__),
	PRIMARY KEY Party (__IDParty__),
	__FKptyEOPD__ Integer
) ;

CREATE TABLE Objective (
	__IDObjective__ Integer NOT NULL,
	FOREIGN KEY objFulfiller (__FKobjFulfiller__) REFERENCES ODPSystem (__IDODPSystem__),
	FOREIGN KEY objSpecifier (__FKobjSpecifier__) REFERENCES Contract (__IDContract__),
	FOREIGN KEY objRefinement (__FKobjRefinement__) REFERENCES Objective (__IDObjective__),
	PRIMARY KEY Objective (__IDObjective__),
	__FKobjFulfiller__ Integer,
	__FKobjRefinement__ Integer,
	__FKobjSpecifier__ Integer
) ;

CREATE TABLE Scope (
	__IDScope__ Integer NOT NULL,
	FOREIGN KEY scOdpSystem (__FKscOdpSystem__) REFERENCES ODPSystem (__IDODPSystem__),
	PRIMARY KEY Scope (__IDScope__),
	__FKscOdpSystem__ Integer
) ;

CREATE TABLE EnterpriseSpecification (
	__IDEnterpriseSpecification__ Integer NOT NULL,
	FOREIGN KEY esContext (__FKesContext__) REFERENCES FieldOfApplication (__IDFieldOfApplication__),
	PRIMARY KEY EnterpriseSpecification (__IDEnterpriseSpecification__),
	__FKesContext__ Integer
) ;

CREATE TABLE FieldOfApplication (
	__IDFieldOfApplication__ Integer NOT NULL,
	FOREIGN KEY faEnterpriseSpecifications (__FKfaEnterpriseSpecifications__) REFERENCES EnterpriseSpecification (__IDEnterpriseSpecification__),
	PRIMARY KEY FieldOfApplication (__IDFieldOfApplication__),
	__FKfaEnterpriseSpecifications__ Integer
) ;

CREATE TABLE Policy (
	__IDPolicy__ Integer NOT NULL,
	FOREIGN KEY poSpecifier (__FKpoSpecifier__) REFERENCES Contract (__IDContract__),
	FOREIGN KEY poOwner (__FKpoOwner__) REFERENCES Community (__IDCommunity__),
	PRIMARY KEY Policy (__IDPolicy__),
	__FKpoOwner__ Integer,
	__FKpoSpecifier__ Integer
) ;

CREATE TABLE PolicyEnvelope (
	__IDPolicyEnvelope__ Integer NOT NULL,
	FOREIGN KEY pePolicySetter (__FKpePolicySetter__) REFERENCES Behaviour (__IDBehaviour__),
	FOREIGN KEY peBehaviour (__FKpeBehaviour__) REFERENCES Behaviour (__IDBehaviour__),
	FOREIGN KEY peCurrentValue (__FKpeCurrentValue__) REFERENCES PolicyValue (__IDPolicyValue__),
	PRIMARY KEY PolicyEnvelope (__IDPolicyEnvelope__),
	__FKpePolicySetter__ Integer,
	__FKpeBehaviour__ Integer,
	__FKpeCurrentValue__ Integer
) ;

CREATE TABLE PolicyValue (
	__IDPolicyValue__ Integer NOT NULL,
	FOREIGN KEY pvValue (__FKpvValue__) REFERENCES PolicyEnvelope (__IDPolicyEnvelope__),
	PRIMARY KEY PolicyValue (__IDPolicyValue__),
	__FKpvValue__ Integer
) ;

CREATE TABLE AssigmentPolicy (
	__IDAssigmentPolicy__ Integer NOT NULL,
	PRIMARY KEY AssigmentPolicy (__IDAssigmentPolicy__)
) ;

CREATE TABLE Contract (
	__IDContract__ Integer NOT NULL,
	FOREIGN KEY ctPolicies (__FKctPolicies__) REFERENCES Policy (__IDPolicy__),
	FOREIGN KEY ctObjective (__FKctObjective__) REFERENCES Objective (__IDObjective__),
	PRIMARY KEY Contract (__IDContract__),
	__FKctPolicies__ Integer,
	__FKctObjective__ Integer
) ;

CREATE TABLE Process (
	__IDProcess__ Integer NOT NULL,
	FOREIGN KEY prRefinement (__FKprRefinement__) REFERENCES Step (__IDStep__),
	PRIMARY KEY Process (__IDProcess__),
	__FKprRefinement__ Integer
) ;

CREATE TABLE Step (
	__IDStep__ Integer NOT NULL,
	FOREIGN KEY stAbstraction (__FKstAbstraction__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY Step (__IDStep__),
	__FKstAbstraction__ Integer
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	PRIMARY KEY Action (__IDAction__)
) ;

CREATE TABLE AccountableAction (
	__IDAccountableAction__ Integer NOT NULL,
	PRIMARY KEY AccountableAction (__IDAccountableAction__)
) ;

CREATE TABLE Prescription (
	__IDPrescription__ Integer NOT NULL,
	PRIMARY KEY Prescription (__IDPrescription__)
) ;

CREATE TABLE Commitment (
	__IDCommitment__ Integer NOT NULL,
	PRIMARY KEY Commitment (__IDCommitment__)
) ;

CREATE TABLE Declaration (
	__IDDeclaration__ Integer NOT NULL,
	PRIMARY KEY Declaration (__IDDeclaration__)
) ;

CREATE TABLE Evaluation (
	__IDEvaluation__ Integer NOT NULL,
	PRIMARY KEY Evaluation (__IDEvaluation__)
) ;

CREATE TABLE Delegation (
	__IDDelegation__ Integer NOT NULL,
	FOREIGN KEY dlgEOPD (__FKdlgEOPD__) REFERENCES EO_P_D (__IDEO_P_D__),
	PRIMARY KEY Delegation (__IDDelegation__),
	__FKdlgEOPD__ Integer
) ;

CREATE TABLE Behaviour (
	__IDBehaviour__ Integer NOT NULL,
	FOREIGN KEY beIdentifier (__FKbeIdentifier__) REFERENCES Role (__IDRole__),
	FOREIGN KEY bePolicyEnvelope (__FKbePolicyEnvelope__) REFERENCES PolicyEnvelope (__IDPolicyEnvelope__),
	FOREIGN KEY beConstrainer (__FKbeConstrainer__) REFERENCES PolicyEnvelope (__IDPolicyEnvelope__),
	PRIMARY KEY Behaviour (__IDBehaviour__),
	__FKbeIdentifier__ Integer,
	__FKbePolicyEnvelope__ Integer,
	__FKbeConstrainer__ Integer
) ;

CREATE TABLE Community (
	__IDCommunity__ Integer NOT NULL,
	FOREIGN KEY coAbstraction (__FKcoAbstraction__) REFERENCES CommunityObject (__IDCommunityObject__),
	PRIMARY KEY Community (__IDCommunity__),
	__FKcoAbstraction__ Integer
) ;

CREATE TABLE CommunityObject (
	__IDCommunityObject__ Integer NOT NULL,
	FOREIGN KEY cobjRefinement (__FKcobjRefinement__) REFERENCES Community (__IDCommunity__),
	PRIMARY KEY CommunityObject (__IDCommunityObject__),
	__FKcobjRefinement__ Integer
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	FOREIGN KEY roleBehaviour (__FKroleBehaviour__) REFERENCES Behaviour (__IDBehaviour__),
	FOREIGN KEY roleSpecifier (__FKroleSpecifier__) REFERENCES Community (__IDCommunity__),
	PRIMARY KEY Role (__IDRole__),
	__FKroleSpecifier__ Integer,
	__FKroleBehaviour__ Integer
) ;

CREATE TABLE InterfaceRole (
	__IDInterfaceRole__ Integer NOT NULL,
	PRIMARY KEY InterfaceRole (__IDInterfaceRole__)
) ;

CREATE TABLE Violation (
	__IDViolation__ Integer NOT NULL,
	FOREIGN KEY vioProhibitor (__FKvioProhibitor__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY Violation (__IDViolation__),
	__FKvioProhibitor__ Integer
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	PRIMARY KEY Rule (__IDRule__)
) ;

CREATE TABLE Obligation (
	__IDObligation__ Integer NOT NULL,
	PRIMARY KEY Obligation (__IDObligation__)
) ;

CREATE TABLE Authorisation (
	__IDAuthorisation__ Integer NOT NULL,
	PRIMARY KEY Authorisation (__IDAuthorisation__)
) ;

CREATE TABLE Permission (
	__IDPermission__ Integer NOT NULL,
	PRIMARY KEY Permission (__IDPermission__)
) ;

CREATE TABLE Prohibition (
	__IDProhibition__ Integer NOT NULL,
	PRIMARY KEY Prohibition (__IDProhibition__)
) ;

CREATE TABLE EO_A_R (
	__IDEO_A_R__ Integer NOT NULL,
	PRIMARY KEY EO_A_R (__IDEO_A_R__)
) ;

CREATE TABLE EO_P_D (
	__IDEO_P_D__ Integer NOT NULL,
	FOREIGN KEY eopdAgent (__FKeopdAgent__) REFERENCES EnterpriseObject (__IDEnterpriseObject__),
	FOREIGN KEY eopdPrincipal (__FKeopdPrincipal__) REFERENCES Party (__IDParty__),
	FOREIGN KEY eopdAction (__FKeopdAction__) REFERENCES Delegation (__IDDelegation__),
	PRIMARY KEY EO_P_D (__IDEO_P_D__),
	__FKeopdAction__ Integer,
	__FKeopdPrincipal__ Integer,
	__FKeopdAgent__ Integer
) ;

CREATE TABLE Behaviour_beSpecifiers_Contract (
	__IDBehaviour__ Integer NOT NULL,
	__IDContract__ Integer NOT NULL
) ;

CREATE TABLE Policy_poBehaviour_Behaviour (
	__IDPolicy__ Integer NOT NULL,
	__IDBehaviour__ Integer NOT NULL
) ;

CREATE TABLE PolicyEnvelope_peValues_PolicyValue (
	__IDPolicyEnvelope__ Integer NOT NULL,
	__IDPolicyValue__ Integer NOT NULL
) ;

CREATE TABLE Objective_objFulfillers_Behaviour (
	__IDObjective__ Integer NOT NULL,
	__IDBehaviour__ Integer NOT NULL
) ;

CREATE TABLE ODPSystem_odpObjectives_Objective (
	__IDODPSystem__ Integer NOT NULL,
	__IDObjective__ Integer NOT NULL
) ;

CREATE TABLE EO_A_R_eoarGovernor_AssigmentPolicy (
	__IDEO_A_R__ Integer NOT NULL,
	__IDAssigmentPolicy__ Integer NOT NULL
) ;

CREATE TABLE AccountableAction_aaAccountableParty_Party (
	__IDAccountableAction__ Integer NOT NULL,
	__IDParty__ Integer NOT NULL
) ;

CREATE TABLE Policy_poRole_Role (
	__IDPolicy__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE AssigmentPolicy_apEOAR_EO_A_R (
	__IDAssigmentPolicy__ Integer NOT NULL,
	__IDEO_A_R__ Integer NOT NULL
) ;

CREATE TABLE Action_actActorRoleFillers_EnterpriseObject (
	__IDAction__ Integer NOT NULL,
	__IDEnterpriseObject__ Integer NOT NULL
) ;

CREATE TABLE EnterpriseObject_eoArtefactActions_Action (
	__IDEnterpriseObject__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE Role_roleConstrainer_Policy (
	__IDRole__ Integer NOT NULL,
	__IDPolicy__ Integer NOT NULL
) ;

CREATE TABLE Community_coMembers_EnterpriseObject (
	__IDCommunity__ Integer NOT NULL,
	__IDEnterpriseObject__ Integer NOT NULL
) ;

CREATE TABLE EnterpriseObject_eoResourceActions_Action (
	__IDEnterpriseObject__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE Process_prObjectives_Objective (
	__IDProcess__ Integer NOT NULL,
	__IDObjective__ Integer NOT NULL
) ;

CREATE TABLE Role_roleEOAR_EO_A_R (
	__IDRole__ Integer NOT NULL,
	__IDEO_A_R__ Integer NOT NULL
) ;

CREATE TABLE Community_coPolicy_Policy (
	__IDCommunity__ Integer NOT NULL,
	__IDPolicy__ Integer NOT NULL
) ;

CREATE TABLE Rule_ruViolation_Violation (
	__IDRule__ Integer NOT NULL,
	__IDViolation__ Integer NOT NULL
) ;

CREATE TABLE Action_actArtefactRoleFillers_EnterpriseObject (
	__IDAction__ Integer NOT NULL,
	__IDEnterpriseObject__ Integer NOT NULL
) ;

CREATE TABLE EnterpriseObject_eoRoles_Role (
	__IDEnterpriseObject__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE Behaviour_bePolicyConstrainer_Policy (
	__IDBehaviour__ Integer NOT NULL,
	__IDPolicy__ Integer NOT NULL
) ;

CREATE TABLE Objective_objAchievers_Process (
	__IDObjective__ Integer NOT NULL,
	__IDProcess__ Integer NOT NULL
) ;

CREATE TABLE EO_A_R_eoarSubjectRole_Role (
	__IDEO_A_R__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE EnterpriseObject_eoPolicy_Policy (
	__IDEnterpriseObject__ Integer NOT NULL,
	__IDPolicy__ Integer NOT NULL
) ;

CREATE TABLE Action_actResourceRoleFillers_EnterpriseObject (
	__IDAction__ Integer NOT NULL,
	__IDEnterpriseObject__ Integer NOT NULL
) ;

CREATE TABLE Behaviour_bePolicy_Policy (
	__IDBehaviour__ Integer NOT NULL,
	__IDPolicy__ Integer NOT NULL
) ;

CREATE TABLE Policy_poEnterpriseObject_EnterpriseObject (
	__IDPolicy__ Integer NOT NULL,
	__IDEnterpriseObject__ Integer NOT NULL
) ;

CREATE TABLE EnterpriseObject_eoEOAR_EO_A_R (
	__IDEnterpriseObject__ Integer NOT NULL,
	__IDEO_A_R__ Integer NOT NULL
) ;

CREATE TABLE Step_stGraphs_Process (
	__IDStep__ Integer NOT NULL,
	__IDProcess__ Integer NOT NULL
) ;

CREATE TABLE Community_coCommunityRoles_Role (
	__IDCommunity__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE Role_rolefillers_EnterpriseObject (
	__IDRole__ Integer NOT NULL,
	__IDEnterpriseObject__ Integer NOT NULL
) ;

CREATE TABLE Objective_objRefiners_Objective (
	__IDObjective__ Integer NOT NULL,
	__IDObjective__ Integer NOT NULL
) ;

CREATE TABLE Policy_poChanger_Behaviour (
	__IDPolicy__ Integer NOT NULL,
	__IDBehaviour__ Integer NOT NULL
) ;

CREATE TABLE Contract_ctBehaviours_Behaviour (
	__IDContract__ Integer NOT NULL,
	__IDBehaviour__ Integer NOT NULL
) ;

CREATE TABLE Policy_poProcess_Process (
	__IDPolicy__ Integer NOT NULL,
	__IDProcess__ Integer NOT NULL
) ;

CREATE TABLE Party_ptyAccountableAction_AccountableAction (
	__IDParty__ Integer NOT NULL,
	__IDAccountableAction__ Integer NOT NULL
) ;

CREATE TABLE Behaviour_beActions_Action (
	__IDBehaviour__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE Process_prDetails_Step (
	__IDProcess__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE EnterpriseObject_eoConfigurations_Community (
	__IDEnterpriseObject__ Integer NOT NULL,
	__IDCommunity__ Integer NOT NULL
) ;

CREATE TABLE Action_actBehaviours_Behaviour (
	__IDAction__ Integer NOT NULL,
	__IDBehaviour__ Integer NOT NULL
) ;

CREATE TABLE Behaviour_beObjectives_Objective (
	__IDBehaviour__ Integer NOT NULL,
	__IDObjective__ Integer NOT NULL
) ;

CREATE TABLE Process_prConstrainer_Policy (
	__IDProcess__ Integer NOT NULL,
	__IDPolicy__ Integer NOT NULL
) ;

CREATE TABLE EO_A_R_eoarSubject_EnterpriseObject (
	__IDEO_A_R__ Integer NOT NULL,
	__IDEnterpriseObject__ Integer NOT NULL
) ;

CREATE TABLE EnterpriseSpecification_esDescribedSystems_ODPSystem (
	__IDEnterpriseSpecification__ Integer NOT NULL,
	__IDODPSystem__ Integer NOT NULL
) ;

CREATE TABLE EnterpriseObject_eoActorActions_Action (
	__IDEnterpriseObject__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;
