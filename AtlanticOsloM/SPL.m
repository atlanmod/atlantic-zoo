module MetamodelRoot {

	type @[SPL.LocatedElement] {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type @[SPL.Program] : @[SPL.LocatedElement] {
		Service_ContRef : @[SPL.Service];
	};

	type @[SPL.Service] : @[SPL.LocatedElement] {
		Name_Att : Text;
		Declarations_ContRef : @[SPL.Declaration]*;
		Sessions_ContRef : @[SPL.Session]*;
	};

	type @[SPL.Session] : @[SPL.LocatedElement];

	type @[SPL.Registration] : @[SPL.Session] {
		Declarations_ContRef : @[SPL.Declaration]*;
		Sessions_ContRef : @[SPL.Session]*;
	};

	type @[SPL.Dialog] : @[SPL.Session] {
		Declarations_ContRef : @[SPL.Declaration]*;
		Methods_ContRef : @[SPL.Method]+;
	};

	type @[SPL.Event] : @[SPL.Session] {
		EventId_Att : Text;
		Declarations_ContRef : @[SPL.Declaration]*;
		Methods_ContRef : @[SPL.Method]+;
	};

	type @[SPL.Method] : @[SPL.Session] {
		Type_ContRef : @[SPL.TypeExpression];
		Direction_Att : @[Enum.Direction];
		MethodName_ContRef : @[SPL.MethodName];
		Arguments_ContRef : @[SPL.Argument]*;
		Statements_ContRef : @[SPL.Statement]+;
		Branches_ContRef : @[SPL.Branch]+;
	};

	type @[SPL.Argument] : @[SPL.VariableDeclaration];

	type @[SPL.MethodName] : @[SPL.LocatedElement];

	type @[SPL.SIPMethodName] : @[SPL.MethodName] {
		Name_Att : @[Enum.SIPMethod];
	};

	type @[SPL.ControlMethodName] : @[SPL.MethodName] {
		Name_Att : @[Enum.ControlMethod];
	};

	type @[SPL.Branch] : @[SPL.LocatedElement] {
		Statements_ContRef : @[SPL.Statement]+;
	};

	type @[SPL.DefaultBranch] : @[SPL.Branch];

	type @[SPL.NamedBranch] : @[SPL.Branch] {
		Name_Att : Text;
	};

	type @[SPL.TypeExpression] : @[SPL.LocatedElement];

	type @[SPL.SimpleType] : @[SPL.TypeExpression] {
		Type_Att : @[Enum.PrimitiveType];
	};

	type @[SPL.SequenceType] : @[SPL.TypeExpression] {
		Modifier_Att : @[Enum.Modifier]?;
		Type_Att : @[Enum.PrimitiveType];
		Size_Att : Integer32;
	};

	type @[SPL.DefinedType] : @[SPL.TypeExpression] {
		TypeName_Att : Text;
	};

	type @[SPL.Declaration] : @[SPL.LocatedElement] {
		Name_Att : Text;
	};

	type @[SPL.VariableDeclaration] : @[SPL.Declaration] {
		Type_ContRef : @[SPL.TypeExpression];
		InitExp_ContRef : @[SPL.Expression]?;
	};

	type @[SPL.FunctionDeclaration] : @[SPL.Declaration] {
		ReturnType_ContRef : @[SPL.TypeExpression];
		Arguments_ContRef : @[SPL.Argument]*;
	};

	type @[SPL.RemoteFunctionDeclaration] : @[SPL.FunctionDeclaration] {
		FunctionLocation_Att : @[Enum.FunctionLocation];
	};

	type @[SPL.LocalFunctionDeclaration] : @[SPL.FunctionDeclaration] {
		Statements_ContRef : @[SPL.Statement]+;
	};

	type @[SPL.StructureDeclaration] : @[SPL.Declaration] {
		Properties_ContRef : @[SPL.Argument]+;
	};

	type @[SPL.StructureProperty] : @[SPL.LocatedElement] {
		Name_Att : Text;
		Type_ContRef : @[SPL.TypeExpression];
	};

	type @[SPL.FunctionCall] : @[SPL.LocatedElement] {
		Function_Ref : @[SPL.FunctionDeclaration];
		Parameters_ContRef : @[SPL.Expression]*;
	};

	type @[SPL.Statement] : @[SPL.LocatedElement];

	type @[SPL.CompoundStat] : @[SPL.Statement] {
		Statements_ContRef : @[SPL.Statement]+;
	};

	type @[SPL.SetStat] : @[SPL.Statement] {
		Target_ContRef : @[SPL.Place];
		SetValue_ContRef : @[SPL.Expression];
	};

	type @[SPL.DeclarationStat] : @[SPL.Statement] {
		Declaration_ContRef : @[SPL.Declaration];
	};

	type @[SPL.ReturnStat] : @[SPL.Statement] {
		ReturnedValue_ContRef : @[SPL.Expression]?;
		Branch_Ref : @[SPL.NamedBranch]?;
	};

	type @[SPL.IfStat] : @[SPL.Statement] {
		Condition_ContRef : @[SPL.Expression];
		ThenStatements_ContRef : @[SPL.Statement]+;
		ElseStatements_ContRef : @[SPL.Statement]*;
	};

	type @[SPL.WhenStat] : @[SPL.Statement] {
		IdExp_ContRef : @[SPL.Variable];
		WhenHeaders_ContRef : @[SPL.WhenHeader]+;
		Statements_ContRef : @[SPL.Statement]+;
		ElseStatements_ContRef : @[SPL.Statement]*;
	};

	type @[SPL.ForeachStat] : @[SPL.Statement] {
		IteratorName_Att : Text;
		SequenceExp_ContRef : @[SPL.Expression];
		Statements_ContRef : @[SPL.Statement]+;
	};

	type @[SPL.SelectStat] : @[SPL.Statement] {
		MatchedExp_ContRef : @[SPL.Expression];
		SelectCases_ContRef : @[SPL.SelectCase]*;
		SelectDefault_ContRef : @[SPL.SelectDefault]?;
	};

	type @[SPL.FunctionCallStat] : @[SPL.Statement] {
		FunctionCall_ContRef : @[SPL.FunctionCall];
	};

	type @[SPL.ContinueStat] : @[SPL.Statement];

	type @[SPL.BreakStat] : @[SPL.Statement];

	type @[SPL.PushStat] : @[SPL.Statement] {
		Target_ContRef : @[SPL.Place];
		PushedValue_ContRef : @[SPL.Expression];
	};

	type @[SPL.WhenHeader] : @[SPL.VariableDeclaration] {
		HeaderId_Att : Text;
		Value_ContRef : @[SPL.Constant]?;
	};

	type @[SPL.SelectMember] : @[SPL.LocatedElement] {
		Statements_ContRef : @[SPL.Statement]*;
	};

	type @[SPL.SelectDefault] : @[SPL.SelectMember];

	type @[SPL.SelectCase] : @[SPL.SelectMember] {
		Values_ContRef : @[SPL.Constant]+;
	};

	type @[SPL.Expression] : @[SPL.LocatedElement];

	type @[SPL.ConstantExp] : @[SPL.Expression] {
		Value_ContRef : @[SPL.Constant];
	};

	type @[SPL.OperatorExp] : @[SPL.Expression] {
		OpName_Att : Text;
		LeftExp_ContRef : @[SPL.Expression];
		RightExp_ContRef : @[SPL.Expression]?;
	};

	type @[SPL.ForwardExp] : @[SPL.Expression] {
		IsParallel_Att : Logical;
		Exp_ContRef : @[SPL.Expression]?;
	};

	type @[SPL.WithExp] : @[SPL.Expression] {
		Exp_ContRef : @[SPL.Expression];
		MsgFields_ContRef : @[SPL.MessageField]+;
	};

	type @[SPL.BlockExp] : @[SPL.Expression] {
		Exp_ContRef : @[SPL.Expression];
	};

	type @[SPL.ReasonExp] : @[SPL.Expression];

	type @[SPL.BODYExp] : @[SPL.Expression];

	type @[SPL.RequestURIExp] : @[SPL.Expression];

	type @[SPL.PopExp] : @[SPL.Expression] {
		Source_ContRef : @[SPL.Place];
	};

	type @[SPL.FunctionCallExp] : @[SPL.Expression] {
		FunctionCall_ContRef : @[SPL.FunctionCall];
	};

	type @[SPL.Place] : @[SPL.Expression];

	type @[SPL.SIPHeaderPlace] : @[SPL.Place] {
		Header_Att : @[Enum.SIPHeader];
	};

	type @[SPL.VariablePlace] : @[SPL.Place];

	type @[SPL.PropertyCallPlace] : @[SPL.VariablePlace] {
		PropName_Att : Text;
		Source_ContRef : @[SPL.VariablePlace];
	};

	type @[SPL.Variable] : @[SPL.VariablePlace] {
		Source_Ref : @[SPL.Declaration];
	};

	type @[SPL.MessageField] : @[SPL.LocatedElement] {
		Exp_ContRef : @[SPL.Expression];
	};

	type @[SPL.ReasonMessageField] : @[SPL.MessageField];

	type @[SPL.HeadedMessageField] : @[SPL.MessageField] {
		HeaderId_Att : Text;
	};

	type @[SPL.Constant] : @[SPL.LocatedElement];

	type @[SPL.BooleanConstant] : @[SPL.Constant] {
		Value_Att : Logical;
	};

	type @[SPL.IntegerConstant] : @[SPL.Constant] {
		Value_Att : Integer32;
	};

	type @[SPL.StringConstant] : @[SPL.Constant] {
		Value_Att : Text;
	};

	type @[SPL.URIConstant] : @[SPL.Constant] {
		Uri_Att : Text;
	};

	type @[SPL.SequenceConstant] : @[SPL.Constant] {
		Values_ContRef : @[SPL.Constant]*;
	};

	type @[SPL.ResponseConstant] : @[SPL.Constant] {
		Response_ContRef : @[SPL.Response];
	};

	type @[SPL.Response] : @[SPL.LocatedElement];

	type @[SPL.SuccessResponse] : @[SPL.Response] {
		SuccessKind_Att : @[Enum.SuccessKind];
	};

	type @[SPL.ErrorResponse] : @[SPL.Response];

	type @[SPL.ClientErrorResponse] : @[SPL.ErrorResponse] {
		ErrorKind_Att : @[Enum.ClientErrorKind]?;
	};

	type @[SPL.GlobalErrorResponse] : @[SPL.ErrorResponse] {
		ErrorKind_Att : @[Enum.GlobalErrorKind]?;
	};

	type @[SPL.RedirectionErrorResponse] : @[SPL.ErrorResponse] {
		ErrorKind_Att : @[Enum.RedirectionErrorKind]?;
	};

	type @[SPL.ServerErrorResponse] : @[SPL.ErrorResponse] {
		ErrorKind_Att : @[Enum.ServerErrorKind]?;
	};

	type @[Enum.Direction] {"inout", "in", "out"};

	type @[Enum.SIPMethod] {"ACK", "BYE", "CANCEL", "INVITE", "NOTIFY", "OPTIONS", "REACK", "REGISTER", "REINVITE", "REREGISTER", "RESUBSCRIBE", "SUBSCRIBE"};

	type @[Enum.ControlMethod] {"deploy", "undeploy", "uninvite", "unregister", "unsubscribe"};

	type @[Enum.PrimitiveType] {"void", "bool", "int", "request", "response", "string", "time", "uri"};

	type @[Enum.Modifier] {"LIFO", "FIFO"};

	type @[Enum.FunctionLocation] {"remote", "local"};

	type @[Enum.SIPHeader] {"CALL_ID", "CONTACT", "CSEQ", "EVENT", "FROM", "MAX_FORWARDS", "SUBSCRIPTION_STATE", "TO", "VIA"};

	type @[Enum.SuccessKind] {"OK", "ACCEPTED"};

	type @[Enum.ClientErrorKind] {"ADDRESS_INCOMPLETE", "AMBIGUOUS", "BAD_EXTENSION", "BAD_REQUEST", "BUSY_HERE", "CALL_OR_TRANSACTION_DOES_NOT_EXIST", "EXTENSION_REQUIRED", "FORBIDDEN", "GONE", "INTERVAL_TOO_BRIEF", "LOOP_DETECTED", "METHOD_NOT_ALLOWED", "NOT_ACCEPTABLE_HERE", "NOT_ACCEPTABLE", "NOT_FOUND", "PAYMENT_REQUIRED", "PROXY_AUTHENTICATION_REQUIRED", "REQUESTURI_TOO_LONG", "REQUEST_ENTITY_TOO_LARGE", "REQUEST_PENDING", "REQUEST_TERMINATED", "REQUEST_TIMEOUT", "TEMPORARILY_UNAVAILABLE", "TOO_MANY_HOPS", "UNAUTHORIZED", "UNDECIPHERABLE", "UNSUPPORTED_MEDIA_TYPE", "UNSUPPORTED_URI_SCHEME"};

	type @[Enum.GlobalErrorKind] {"BUSY_EVERYWHERE", "DECLINE", "DOES_NOT_EXIST_ANYWHERE", "NOT_ACCEPTABLE"};

	type @[Enum.RedirectionErrorKind] {"ALTERNATIVE_SERVICE", "MOVED_PERMANENTLY", "MOVED_TEMPORARILY", "MULTIPLE_CHOICES", "USE_PROXY"};

	type @[Enum.ServerErrorKind] {"BAD_GATEWAY", "MESSAGE_TOO_LARGE", "NOT_IMPLEMENTED", "SERVER_INTERNAL_ERROR", "SERVER_TIMEOUT", "SERVICE_UNAVAILABLE", "VERSION_NOT_SUPPORTED"};
}