module WebApplication {

	type HyperLink {
		Server_Ref : @[Server.ServerPage]*;
	};

	type @[Client.ClientPage] {
		Hyperlink_Ref : HyperLink;
	};

	type @[Client.ClientPageModule] {
		ConsistsOf_ContRef : @[Client.ClientPage];
	};

	type @[Client.LogicInterface] : @[Client.ClientPageModule];

	type @[Client.DesignElement] : @[Client.ClientPageModule];

	type @[Server.ServerPage] {
		UseBusinessLogic_Ref : @[Server.BusinessLogic];
		UseDesignTemplate_Ref : @[Server.DesignTemplate];
		Generates_Ref : @[Client.ClientPage]*;
		Link_Ref : HyperLink*;
	};

	type @[Server.BusinessLogic];

	type @[Server.DesignTemplate];
}