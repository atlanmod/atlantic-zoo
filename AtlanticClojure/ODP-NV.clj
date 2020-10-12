( defstruct Node :location :manager )
( defstruct Nucleus :nodeManager )
( defstruct Capsule :capsuleManager )
( defstruct EngineeringObject :nodeManager )
( defstruct CapsuleManager :nodeManager )
( defstruct Cluster :clusterManager )
( defstruct ClusterManager :clusters :capsuleManager :nodeManager )
( defstruct BEO :beoNodeManager :beoManager :nodeManager )
( defstruct Stub :stChannel :stBinder :stBeo :nodeManager )
( defstruct Binder :bdChannel :chBinder :bdProtocolObject :nodeManager )
( defstruct ProtocolObject :type :poChannel :poBinder :nodeManager )
( defstruct Interceptor :intChannel :intProtocolObject :nodeManager )
( defstruct Channel :chStub :chBinder :chPObject :chEndPoint )
( defstruct ClientServerChannel :chStub :chBinder :chPObject :chEndPoint )
( defstruct ControllingObject :nodeManager )
( defstruct SecurityAuthority :nodeManager )
( defstruct ManagementAuthority :nodeManager )
( defstruct AddressingAuthority :nodeManager )
( defstruct NamingAuthority :nodeManager )
( defstruct ControlledObject :nodeManager )
( defstruct Domain :parentDomain :domControllingObject )
( defstruct SecurityDomain :parentDomain :domControllingObject )
( defstruct ManagementDomain :parentDomain :domControllingObject )
( defstruct AddressingDomain :parentDomain :domControllingObject )
( defstruct NamingDomain :parentDomain :domControllingObject )
( defstruct EngineeringInterfaceReferenceManagementDomain :eirmdManagementPolicy :parentDomain :domControllingObject )
( defstruct EngineeringInterfaceReferenceManagementPolicy )
( defstruct EngineeringInterfaceReference :eirManagementDomain )