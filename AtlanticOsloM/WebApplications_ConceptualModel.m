module CompleteWebApplication {

	type HyperLink {
		Server_Ref : @[Server.ServerPage]*;
	};

	type @[Client.ClientPage] {
		Hyperlink_Ref : HyperLink;
	};

	type @[Client.ClientPageModule] {
		ConsistsOf_ContRef : @[Client.ClientPage];
		RepresentsSMP_Ref : @[Server.ServerPageModule];
	};

	type @[Client.LogicInterface] : @[Client.ClientPageModule] {
		Represents_Ref : @[Server.LogicModule];
		GeneratedBy_Ref : @[Server.Renderer];
	};

	type @[Client.DesignElement] : @[Client.ClientPageModule] {
		Represents_Ref : @[Server.DesignModule];
	};

	type @[Server.ServerPage] {
		Link_Ref : HyperLink*;
		Generates_Ref : @[Client.ClientPage]*;
		Module_ContRef : @[Server.ServerPageModule]+;
	};

	type @[Server.ServerPageModule] {
		Contains_Ref : @[Server.ServerPage]+;
		Link_Ref : @[Server.Link];
		ContainsModule_ContRef : @[Server.DesignModule];
	};

	type @[Server.DesignModule] : @[Server.ServerPageModule];

	type @[Server.LogicModule] : @[Server.ServerPageModule] {
		UseCase_ContRef : @[Server.UseCase]+;
		LogicElement_ContRef : @[Server.LogicElement]+;
	};

	type @[Server.Link] {
		Page_Ref : @[Server.ServerPage];
		Posts_Ref : @[Server.Data];
	};

	type @[Server.BeginUseCase] : @[Server.Link] {
		UseCase_Ref : @[Server.UseCase];
	};

	type @[Server.UseCase] : @[Server.Link] {
		LogicElem_ContRef : @[Server.LogicElement]+;
	};

	type @[Server.LogicElement] {
		Uses_Ref : @[Server.UseCase]+;
		GeneratedBy_Ref : @[Server.LogicElement];
		Next_Ref : @[Server.LogicElement];
	};

	type @[Server.Alternative] : @[Server.LogicElement];

	type @[Server.UserDecision] : @[Server.LogicElement] {
		Allows_ContRef : @[Server.Alternative]+;
	};

	type @[Server.ServerDecision] : @[Server.LogicElement] {
		EvaluatesResultOf_Ref : @[Server.Processor];
	};

	type @[Server.Processor] : @[Server.LogicElement] {
		PersistentData_Ref : @[Server.Data]*;
		InputData_Ref : @[Server.Data]*;
		OutputData_Ref : @[Server.Data]+;
	};

	type @[Server.Renderer] : @[Server.LogicElement] {
		Renders_Ref : @[Server.Data]+;
	};

	type @[Server.Data] {
		Renderer_Ref : @[Server.Renderer]*;
		Persist_Ref : @[Server.Processor]*;
		Uses_Ref : @[Server.Processor]*;
		Computes_Ref : @[Server.Processor]*;
	};
}