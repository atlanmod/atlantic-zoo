CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	location text,
	FOREIGN KEY manager (__FKmanager__) REFERENCES Nucleus (__IDNucleus__),
	PRIMARY KEY Node (__IDNode__),
	__FKmanager__ Integer
) ;

CREATE TABLE Nucleus (
	__IDNucleus__ Integer NOT NULL,
	PRIMARY KEY Nucleus (__IDNucleus__)
) ;

CREATE TABLE Capsule (
	__IDCapsule__ Integer NOT NULL,
	FOREIGN KEY capsuleManager (__FKcapsuleManager__) REFERENCES CapsuleManager (__IDCapsuleManager__),
	PRIMARY KEY Capsule (__IDCapsule__),
	__FKcapsuleManager__ Integer
) ;

CREATE TABLE EngineeringObject (
	__IDEngineeringObject__ Integer NOT NULL,
	FOREIGN KEY nodeManager (__FKnodeManager__) REFERENCES Nucleus (__IDNucleus__),
	PRIMARY KEY EngineeringObject (__IDEngineeringObject__),
	__FKnodeManager__ Integer
) ;

CREATE TABLE CapsuleManager (
	__IDCapsuleManager__ Integer NOT NULL,
	PRIMARY KEY CapsuleManager (__IDCapsuleManager__)
) ;

CREATE TABLE Cluster (
	__IDCluster__ Integer NOT NULL,
	FOREIGN KEY clusterManager (__FKclusterManager__) REFERENCES ClusterManager (__IDClusterManager__),
	PRIMARY KEY Cluster (__IDCluster__),
	__FKclusterManager__ Integer
) ;

CREATE TABLE ClusterManager (
	__IDClusterManager__ Integer NOT NULL,
	FOREIGN KEY capsuleManager (__FKcapsuleManager__) REFERENCES CapsuleManager (__IDCapsuleManager__),
	PRIMARY KEY ClusterManager (__IDClusterManager__),
	__FKcapsuleManager__ Integer
) ;

CREATE TABLE BEO (
	__IDBEO__ Integer NOT NULL,
	FOREIGN KEY beoNodeManager (__FKbeoNodeManager__) REFERENCES Nucleus (__IDNucleus__),
	FOREIGN KEY beoManager (__FKbeoManager__) REFERENCES ClusterManager (__IDClusterManager__),
	PRIMARY KEY BEO (__IDBEO__),
	__FKbeoManager__ Integer,
	__FKbeoNodeManager__ Integer
) ;

CREATE TABLE Stub (
	__IDStub__ Integer NOT NULL,
	FOREIGN KEY stChannel (__FKstChannel__) REFERENCES Channel (__IDChannel__),
	FOREIGN KEY stBinder (__FKstBinder__) REFERENCES Binder (__IDBinder__),
	FOREIGN KEY stBeo (__FKstBeo__) REFERENCES BEO (__IDBEO__),
	PRIMARY KEY Stub (__IDStub__),
	__FKstBinder__ Integer,
	__FKstChannel__ Integer,
	__FKstBeo__ Integer
) ;

CREATE TABLE Binder (
	__IDBinder__ Integer NOT NULL,
	FOREIGN KEY bdChannel (__FKbdChannel__) REFERENCES Channel (__IDChannel__),
	FOREIGN KEY chBinder (__FKchBinder__) REFERENCES Stub (__IDStub__),
	PRIMARY KEY Binder (__IDBinder__),
	__FKchBinder__ Integer,
	__FKbdChannel__ Integer
) ;

CREATE TABLE ProtocolObject (
	__IDProtocolObject__ Integer NOT NULL,
	type text,
	FOREIGN KEY poChannel (__FKpoChannel__) REFERENCES Channel (__IDChannel__),
	FOREIGN KEY poBinder (__FKpoBinder__) REFERENCES Binder (__IDBinder__),
	PRIMARY KEY ProtocolObject (__IDProtocolObject__),
	__FKpoBinder__ Integer,
	__FKpoChannel__ Integer
) ;

CREATE TABLE Interceptor (
	__IDInterceptor__ Integer NOT NULL,
	FOREIGN KEY intChannel (__FKintChannel__) REFERENCES Channel (__IDChannel__),
	PRIMARY KEY Interceptor (__IDInterceptor__),
	__FKintChannel__ Integer
) ;

CREATE TABLE Channel (
	__IDChannel__ Integer NOT NULL,
	PRIMARY KEY Channel (__IDChannel__)
) ;

CREATE TABLE ClientServerChannel (
	__IDClientServerChannel__ Integer NOT NULL,
	PRIMARY KEY ClientServerChannel (__IDClientServerChannel__)
) ;

CREATE TABLE ControllingObject (
	__IDControllingObject__ Integer NOT NULL,
	PRIMARY KEY ControllingObject (__IDControllingObject__)
) ;

CREATE TABLE SecurityAuthority (
	__IDSecurityAuthority__ Integer NOT NULL,
	PRIMARY KEY SecurityAuthority (__IDSecurityAuthority__)
) ;

CREATE TABLE ManagementAuthority (
	__IDManagementAuthority__ Integer NOT NULL,
	PRIMARY KEY ManagementAuthority (__IDManagementAuthority__)
) ;

CREATE TABLE AddressingAuthority (
	__IDAddressingAuthority__ Integer NOT NULL,
	PRIMARY KEY AddressingAuthority (__IDAddressingAuthority__)
) ;

CREATE TABLE NamingAuthority (
	__IDNamingAuthority__ Integer NOT NULL,
	PRIMARY KEY NamingAuthority (__IDNamingAuthority__)
) ;

CREATE TABLE ControlledObject (
	__IDControlledObject__ Integer NOT NULL,
	PRIMARY KEY ControlledObject (__IDControlledObject__)
) ;

CREATE TABLE Domain (
	__IDDomain__ Integer NOT NULL,
	FOREIGN KEY parentDomain (__FKparentDomain__) REFERENCES Domain (__IDDomain__),
	FOREIGN KEY domControllingObject (__FKdomControllingObject__) REFERENCES ControllingObject (__IDControllingObject__),
	PRIMARY KEY Domain (__IDDomain__),
	__FKparentDomain__ Integer,
	__FKdomControllingObject__ Integer
) ;

CREATE TABLE SecurityDomain (
	__IDSecurityDomain__ Integer NOT NULL,
	PRIMARY KEY SecurityDomain (__IDSecurityDomain__)
) ;

CREATE TABLE ManagementDomain (
	__IDManagementDomain__ Integer NOT NULL,
	PRIMARY KEY ManagementDomain (__IDManagementDomain__)
) ;

CREATE TABLE AddressingDomain (
	__IDAddressingDomain__ Integer NOT NULL,
	PRIMARY KEY AddressingDomain (__IDAddressingDomain__)
) ;

CREATE TABLE NamingDomain (
	__IDNamingDomain__ Integer NOT NULL,
	PRIMARY KEY NamingDomain (__IDNamingDomain__)
) ;

CREATE TABLE EngineeringInterfaceReferenceManagementDomain (
	__IDEngineeringInterfaceReferenceManagementDomain__ Integer NOT NULL,
	FOREIGN KEY eirmdManagementPolicy (__FKeirmdManagementPolicy__) REFERENCES EngineeringInterfaceReferenceManagementPolicy (__IDEngineeringInterfaceReferenceManagementPolicy__),
	PRIMARY KEY EngineeringInterfaceReferenceManagementDomain (__IDEngineeringInterfaceReferenceManagementDomain__),
	__FKeirmdManagementPolicy__ Integer
) ;

CREATE TABLE EngineeringInterfaceReferenceManagementPolicy (
	__IDEngineeringInterfaceReferenceManagementPolicy__ Integer NOT NULL,
	PRIMARY KEY EngineeringInterfaceReferenceManagementPolicy (__IDEngineeringInterfaceReferenceManagementPolicy__)
) ;

CREATE TABLE EngineeringInterfaceReference (
	__IDEngineeringInterfaceReference__ Integer NOT NULL,
	FOREIGN KEY eirManagementDomain (__FKeirManagementDomain__) REFERENCES EngineeringInterfaceReferenceManagementDomain (__IDEngineeringInterfaceReferenceManagementDomain__),
	PRIMARY KEY EngineeringInterfaceReference (__IDEngineeringInterfaceReference__),
	__FKeirManagementDomain__ Integer
) ;

CREATE TABLE EngineeringInterfaceReferenceManagementPolicy_eirmpManagementDomain_EngineeringInterfaceReferenceManagementDomain (
	__IDEngineeringInterfaceReferenceManagementPolicy__ Integer NOT NULL,
	__IDEngineeringInterfaceReferenceManagementDomain__ Integer NOT NULL
) ;

CREATE TABLE CapsuleManager_cmClusterManagers_ClusterManager (
	__IDCapsuleManager__ Integer NOT NULL,
	__IDClusterManager__ Integer NOT NULL
) ;

CREATE TABLE BEO_localbinds_BEO (
	__IDBEO__ Integer NOT NULL,
	__IDBEO__ Integer NOT NULL
) ;

CREATE TABLE EngineeringInterfaceReferenceManagementDomain_eirmdReference_EngineeringInterfaceReference (
	__IDEngineeringInterfaceReferenceManagementDomain__ Integer NOT NULL,
	__IDEngineeringInterfaceReference__ Integer NOT NULL
) ;

CREATE TABLE ClusterManager_clustermanagerBeos_BEO (
	__IDClusterManager__ Integer NOT NULL,
	__IDBEO__ Integer NOT NULL
) ;

CREATE TABLE Channel_chBinder_Binder (
	__IDChannel__ Integer NOT NULL,
	__IDBinder__ Integer NOT NULL
) ;

CREATE TABLE ControllingObject_coDomain_Domain (
	__IDControllingObject__ Integer NOT NULL,
	__IDDomain__ Integer NOT NULL
) ;

CREATE TABLE Domain_domMember_ControlledObject (
	__IDDomain__ Integer NOT NULL,
	__IDControlledObject__ Integer NOT NULL
) ;

CREATE TABLE Domain_subDomain_Domain (
	__IDDomain__ Integer NOT NULL,
	__IDDomain__ Integer NOT NULL
) ;

CREATE TABLE BEO_locallyBoundObjects_BEO (
	__IDBEO__ Integer NOT NULL,
	__IDBEO__ Integer NOT NULL
) ;

CREATE TABLE ProtocolObject_poInterceptor_Interceptor (
	__IDProtocolObject__ Integer NOT NULL,
	__IDInterceptor__ Integer NOT NULL
) ;

CREATE TABLE Channel_chInterceptor_Interceptor (
	__IDChannel__ Integer NOT NULL,
	__IDInterceptor__ Integer NOT NULL
) ;

CREATE TABLE Interceptor_intProtocolObject_ProtocolObject (
	__IDInterceptor__ Integer NOT NULL,
	__IDProtocolObject__ Integer NOT NULL
) ;

CREATE TABLE Binder_bdProtocolObject_ProtocolObject (
	__IDBinder__ Integer NOT NULL,
	__IDProtocolObject__ Integer NOT NULL
) ;

CREATE TABLE BEO_beoStub_Stub (
	__IDBEO__ Integer NOT NULL,
	__IDStub__ Integer NOT NULL
) ;

CREATE TABLE ControlledObject_cdoDomain_Domain (
	__IDControlledObject__ Integer NOT NULL,
	__IDDomain__ Integer NOT NULL
) ;

CREATE TABLE Cluster_clusterBeos_BEO (
	__IDCluster__ Integer NOT NULL,
	__IDBEO__ Integer NOT NULL
) ;

CREATE TABLE Capsule_clusterManagers_ClusterManager (
	__IDCapsule__ Integer NOT NULL,
	__IDClusterManager__ Integer NOT NULL
) ;

CREATE TABLE Nucleus_beos_BEO (
	__IDNucleus__ Integer NOT NULL,
	__IDBEO__ Integer NOT NULL
) ;

CREATE TABLE Node_capsules_Capsule (
	__IDNode__ Integer NOT NULL,
	__IDCapsule__ Integer NOT NULL
) ;

CREATE TABLE Capsule_otherEngObjects_EngineeringObject (
	__IDCapsule__ Integer NOT NULL,
	__IDEngineeringObject__ Integer NOT NULL
) ;

CREATE TABLE BEO_beoChannel_Channel (
	__IDBEO__ Integer NOT NULL,
	__IDChannel__ Integer NOT NULL
) ;

CREATE TABLE Capsule_clusters_Cluster (
	__IDCapsule__ Integer NOT NULL,
	__IDCluster__ Integer NOT NULL
) ;

CREATE TABLE Channel_chPObject_ProtocolObject (
	__IDChannel__ Integer NOT NULL,
	__IDProtocolObject__ Integer NOT NULL
) ;

CREATE TABLE Nucleus_otherEngObjects_EngineeringObject (
	__IDNucleus__ Integer NOT NULL,
	__IDEngineeringObject__ Integer NOT NULL
) ;

CREATE TABLE Channel_chStub_Stub (
	__IDChannel__ Integer NOT NULL,
	__IDStub__ Integer NOT NULL
) ;

CREATE TABLE Channel_chEndPoint_BEO (
	__IDChannel__ Integer NOT NULL,
	__IDBEO__ Integer NOT NULL
) ;

CREATE TABLE ClusterManager_clusters_Cluster (
	__IDClusterManager__ Integer NOT NULL,
	__IDCluster__ Integer NOT NULL
) ;

CREATE TABLE ProtocolObject_poBoundProtocolObject_ProtocolObject (
	__IDProtocolObject__ Integer NOT NULL,
	__IDProtocolObject__ Integer NOT NULL
) ;
