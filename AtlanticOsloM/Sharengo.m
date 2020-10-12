module MMASharengo {

	type ModelElement {
		Name_Att : Text;
	};

	type Classifier : ModelElement;

	type Operation : ModelElement;

	type Service : Classifier {
		Operations_ContRef : ServiceOperation*;
	};

	type BusinessObject : Classifier {
		Operations_ContRef : BusinessObjectOperation*;
	};

	type ServiceOperation : Operation {
		BOFlows_ContRef : Service2BusinessObjectFlow*;
		Rules_ContRef : BusinessRule*;
	};

	type BusinessObjectOperation : Operation {
		Rules_ContRef : BusinessRule*;
	};

	type BusinessRule : ModelElement {
		Expr_Att : Text;
	};

	type Flow : ModelElement {
		Source_Att : Text;
		Target_Att : Text;
	};

	type Service2BusinessObjectFlow : Flow;
}