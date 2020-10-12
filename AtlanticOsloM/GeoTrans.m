module GeoTrans {

	type GeoTransfos {
		Name_Att : Text;
		Transfos_ContRef : GeoTransfo*;
	};

	type GeoTransfo {
		Name_Att : Text;
		Freeze_Att : Logical;
		SubGeoTransfos_ContRef : GeoTransfo*;
		SuperGeoTransfo_Ref : GeoTransfo;
		Params_ContRef : Param*;
	};

	type Param {
		Name_Att : Text;
		Param_Att : Double;
		GeoTransfo_Ref : GeoTransfo;
	};
}