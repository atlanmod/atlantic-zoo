module QoSProfile {

	type QoSComponent {
		Operations_ContRef : Operation;
		Profile_Ref : QoSProfile*;
	};

	type Operation;

	type QoSProfile {
		For_Ref : QoSComponent;
	};

	type CompoundProfile : QoSProfile {
		ProfileTransition_Ref : ProfileTransition*;
		SimpleProfile_ContRef : SimpleProfile+;
	};

	type SimpleProfile : QoSProfile {
		CompoundProfile_Ref : CompoundProfile;
		Uses_Ref : QoSStatement;
		Provides_Ref : QoSStatement;
	};

	type QoSStatement;

	type ProfileTransition {
		Operations_Ref : Operation*;
		From_Ref : SimpleProfile;
		To_Ref : SimpleProfile;
		CompoundProfile_ContRef : CompoundProfile;
	};
}