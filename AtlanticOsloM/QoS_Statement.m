module QoSStatement {

	type QoSStatement {
		Relation_Ref : CoumpoundQoSStatement;
		Parameter_ContRef : Parameter*;
	};

	type SingleQoSStatement : QoSStatement {
		Contraint_ContRef : QoSContraint;
	};

	type CoumpoundQoSStatement : QoSStatement {
		Statement_ContRef : QoSStatement#2 ..;
	};

	type Parameter;

	type QoSContraint {
		Qualification_Ref : QualificationKind;
	};

	type QualificationKind : QoSCharacteristic {
		Value_Att : Text;
	};

	type QoSCharacteristic;
}