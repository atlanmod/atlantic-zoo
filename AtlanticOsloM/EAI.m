module EAI {

	type FCMSource;

	type EAISource : FCMSource {
		Resources_Ref : EAIResource*;
	};

	type FCMSink;

	type EAISink : FCMSink {
		Resources_Ref : EAIResource*;
	};

	type EAIResource;

	type EAIQueue : EAIResource {
		MaxLength_Att : Integer32;
		Name_Att : Text;
	};
}