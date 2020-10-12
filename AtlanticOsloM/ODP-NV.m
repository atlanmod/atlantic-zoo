module MetamodelRoot {

	type @[ODPNV.Node] {
		Location_Att : Text;
		Manager_ContRef : @[ODPNV.Nucleus];
		Capsules_ContRef : @[ODPNV.Capsule]*;
	};

	type @[ODPNV.Nucleus] : @[ODPNV.EngineeringObject] {
		OtherEngObjects_Ref : @[ODPNV.EngineeringObject]*;
		Beos_Ref : @[ODPNV.BEO]*;
	};

	type @[ODPNV.Capsule] {
		OtherEngObjects_ContRef : @[ODPNV.EngineeringObject]*;
		CapsuleManager_ContRef : @[ODPNV.CapsuleManager];
		ClusterManagers_ContRef : @[ODPNV.ClusterManager]*;
		Clusters_ContRef : @[ODPNV.Cluster]*;
	};

	type @[ODPNV.EngineeringObject] {
		NodeManager_Ref : @[ODPNV.Nucleus];
	};

	type @[ODPNV.CapsuleManager] : @[ODPNV.EngineeringObject] {
		CmClusterManagers_Ref : @[ODPNV.ClusterManager]*;
	};

	type @[ODPNV.Cluster] {
		ClusterManager_Ref : @[ODPNV.ClusterManager];
		ClusterBeos_ContRef : @[ODPNV.BEO]*;
	};

	type @[ODPNV.ClusterManager] : @[ODPNV.EngineeringObject] {
		Clusters_Ref : @[ODPNV.Cluster]+;
		ClustermanagerBeos_Ref : @[ODPNV.BEO]*;
		CapsuleManager_Ref : @[ODPNV.CapsuleManager];
	};

	type @[ODPNV.BEO] : @[ODPNV.EngineeringObject] {
		BeoNodeManager_Ref : @[ODPNV.Nucleus];
		LocallyBoundObjects_Ref : @[ODPNV.BEO]*;
		Localbinds_Ref : @[ODPNV.BEO]*;
		BeoManager_Ref : @[ODPNV.ClusterManager];
		BeoChannel_Ref : @[ODPNV.Channel]*;
		BeoStub_Ref : @[ODPNV.Stub]*;
	};

	type @[ODPNV.Stub] : @[ODPNV.EngineeringObject] {
		StChannel_Ref : @[ODPNV.Channel];
		StBinder_Ref : @[ODPNV.Binder];
		StBeo_Ref : @[ODPNV.BEO];
	};

	type @[ODPNV.Binder] : @[ODPNV.EngineeringObject] {
		BdChannel_Ref : @[ODPNV.Channel];
		ChBinder_Ref : @[ODPNV.Stub];
		BdProtocolObject_Ref : @[ODPNV.ProtocolObject]+;
	};

	type @[ODPNV.ProtocolObject] : @[ODPNV.EngineeringObject] {
		Type_Att : Text;
		PoChannel_Ref : @[ODPNV.Channel];
		PoBinder_Ref : @[ODPNV.Binder];
		PoInterceptor_Ref : @[ODPNV.Interceptor]*;
		PoBoundProtocolObject_Ref : @[ODPNV.ProtocolObject]*;
	};

	type @[ODPNV.Interceptor] : @[ODPNV.EngineeringObject] {
		IntChannel_Ref : @[ODPNV.Channel];
		IntProtocolObject_Ref : @[ODPNV.ProtocolObject]#2 .. 2;
	};

	type @[ODPNV.Channel] {
		ChStub_ContRef : @[ODPNV.Stub]#2 ..;
		ChBinder_ContRef : @[ODPNV.Binder]#2 ..;
		ChPObject_ContRef : @[ODPNV.ProtocolObject]#2 ..;
		ChInterceptor_ContRef : @[ODPNV.Interceptor]*;
		ChEndPoint_Ref : @[ODPNV.BEO]#2 ..;
	};

	type @[ODPNV.ClientServerChannel] : @[ODPNV.Channel];

	type @[ODPNV.ControllingObject] : @[ODPNV.EngineeringObject] {
		CoDomain_Ref : @[ODPNV.Domain]*;
	};

	type @[ODPNV.SecurityAuthority] : @[ODPNV.ControllingObject];

	type @[ODPNV.ManagementAuthority] : @[ODPNV.ControllingObject];

	type @[ODPNV.AddressingAuthority] : @[ODPNV.ControllingObject];

	type @[ODPNV.NamingAuthority] : @[ODPNV.ControllingObject];

	type @[ODPNV.ControlledObject] : @[ODPNV.EngineeringObject] {
		CdoDomain_Ref : @[ODPNV.Domain]*;
	};

	type @[ODPNV.Domain] {
		ParentDomain_Ref : @[ODPNV.Domain];
		SubDomain_Ref : @[ODPNV.Domain]*;
		DomControllingObject_Ref : @[ODPNV.ControllingObject];
		DomMember_Ref : @[ODPNV.ControlledObject]*;
	};

	type @[ODPNV.SecurityDomain] : @[ODPNV.Domain];

	type @[ODPNV.ManagementDomain] : @[ODPNV.Domain];

	type @[ODPNV.AddressingDomain] : @[ODPNV.Domain];

	type @[ODPNV.NamingDomain] : @[ODPNV.Domain];

	type @[ODPNV.EngineeringInterfaceReferenceManagementDomain] : @[ODPNV.NamingDomain] {
		EirmdReference_Ref : @[ODPNV.EngineeringInterfaceReference]*;
		EirmdManagementPolicy_Ref : @[ODPNV.EngineeringInterfaceReferenceManagementPolicy];
	};

	type @[ODPNV.EngineeringInterfaceReferenceManagementPolicy] {
		EirmpManagementDomain_Ref : @[ODPNV.EngineeringInterfaceReferenceManagementDomain]*;
	};

	type @[ODPNV.EngineeringInterfaceReference] {
		EirManagementDomain_Ref : @[ODPNV.EngineeringInterfaceReferenceManagementDomain];
	};
}