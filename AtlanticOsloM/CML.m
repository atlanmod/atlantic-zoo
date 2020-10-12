module CML {

	type PCDATA {
		Value_Att : Text;
	};

	type Any;

	type TitledElement {
		Title_Att : Text;
	};

	type IdedElement {
		Id_Att : Text;
	};

	type ConventionnedElement {
		Convention_Att : Text;
	};

	type DictRefElement {
		DictRef_Att : Text;
	};

	type SimpleLink_Element {
		Href_Att : Text;
	};

	type Counted_Element {
		Count_Att : Text;
	};

	type Sized_Element {
		Size_Att : Text;
	};

	type Rows_Element {
		Rows_Att : Text;
	};

	type Columns_Element {
		Colums_Att : Text;
	};

	type Min_Element {
		Min_Att : Text;
	};

	type Max_Element {
		Max_Att : Text;
	};

	type Units_Element {
		Units_Att : Text;
	};

	type AngleUnits {"degrees", "radians"};

	type AngleUnits_Element {
		AngleUnits_Att : AngleUnits;
	};

	type UnitsRef_Element {
		UnitsRef_Att : Text;
	};

	type AtomRefs_Element {
		AtomRefs_Att : Text;
	};

	type StringBuiltin {"id", "elementType", "atomId", "residueType", "residueId", "atomRef", "order", "stereo", "spaceground"};

	type _StringBuiltin : AtomRefs_Element {
		Builtin_Att : StringBuiltin?;
	};

	type _String : Any, PCDATA, TitledElement, IdedElement, _StringBuiltin, DictRefElement, ConventionnedElement;

	type _Link : Any, PCDATA, TitledElement, IdedElement, SimpleLink_Element, ConventionnedElement;

	type FloatBuiltin {"x2", "y2", "x3", "y3", "z3", "xFract", "yFract", "zFract", "occupancy", "isotope", "formalCharge", "hydrogenCount", "nonHydrogenCount", "atomParity", "length", "acell", "bcell", "ccell", "alpha", "beta", "gamma", "z"};

	type _FloatBuiltin {
		Builtin_Att : FloatBuiltin?;
	};

	type _Float : Any, PCDATA, TitledElement, IdedElement, _FloatBuiltin, Min_Element, Max_Element, Units_Element, UnitsRef_Element, DictRefElement, ConventionnedElement;

	type IntegerBuiltin {"isotope", "formalCharge", "hydrogenCount", "nonHydrogenCount", "atomParity", "z"};

	type _IntegerBuiltin {
		Builtin_Att : IntegerBuiltin?;
	};

	type _Integer : Any, PCDATA, TitledElement, IdedElement, _IntegerBuiltin, Min_Element, Max_Element, Units_Element, UnitsRef_Element, DictRefElement, ConventionnedElement;

	type _StringArray : Any, PCDATA, TitledElement, IdedElement, _StringBuiltin, Sized_Element, Min_Element, Max_Element, DictRefElement, ConventionnedElement {
		Delimiter_Att : Text;
	};

	type _FloatArray : Any, PCDATA, TitledElement, IdedElement, _FloatBuiltin, Sized_Element, Min_Element, Max_Element, Units_Element, UnitsRef_Element, DictRefElement, ConventionnedElement;

	type _IntegerArray : Any, PCDATA, TitledElement, IdedElement, _IntegerBuiltin, Sized_Element, Min_Element, Max_Element, Units_Element, UnitsRef_Element, DictRefElement, ConventionnedElement;

	type _FloatMatrix : Any, PCDATA, TitledElement, IdedElement, Rows_Element, Columns_Element, Min_Element, Max_Element, Units_Element, UnitsRef_Element, DictRefElement, ConventionnedElement;

	type Coordinate2Builtin {"xy2"};

	type _Coordinate2Builtin {
		Builtin_Att : Coordinate2Builtin?;
	};

	type _Coordinate2 : Any, PCDATA, TitledElement, IdedElement, _Coordinate2Builtin, UnitsRef_Element, DictRefElement, ConventionnedElement;

	type Coordinate3Builtin {"xyz3", "xyzFract"};

	type _Coordinate3Builtin {
		Builtin_Att : Coordinate3Builtin?;
	};

	type _Coordinate3 : Any, PCDATA, TitledElement, IdedElement, _Coordinate3Builtin, UnitsRef_Element, DictRefElement, ConventionnedElement;

	type _Angle : Any, PCDATA, TitledElement, IdedElement, AtomRefs_Element, AngleUnits_Element, Min_Element, Max_Element, DictRefElement, ConventionnedElement;

	type _Torsion : Any, PCDATA, TitledElement, IdedElement, AtomRefs_Element, AngleUnits_Element, Min_Element, Max_Element, DictRefElement, ConventionnedElement;

	type _List : Any, TitledElement, IdedElement {
		Any_Ref : Any*;
	};

	type Molecule : Any, TitledElement, IdedElement, Counted_Element, DictRefElement, ConventionnedElement {
		Any_Ref : Any*;
	};

	type Formula : Any, TitledElement, IdedElement, Counted_Element, DictRefElement, ConventionnedElement {
		Any_Ref : Any*;
	};

	type Atom : Any, TitledElement, IdedElement, Counted_Element, DictRefElement, ConventionnedElement {
		Any_Ref : Any*;
	};

	type Atom_Array : Any, TitledElement, IdedElement, DictRefElement, ConventionnedElement {
		Any_Ref : Any*;
	};

	type Bond : Any, IdedElement, AtomRefs_Element, DictRefElement, ConventionnedElement {
		Any_Ref : Any*;
	};

	type Bond_Array : Any, IdedElement, DictRefElement, ConventionnedElement {
		Any_Ref : Any*;
	};

	type Electron : Any, IdedElement, Counted_Element, DictRefElement, ConventionnedElement {
		Any_Ref : Any*;
	};

	type Reaction : Any, IdedElement, DictRefElement, ConventionnedElement {
		Any_Ref : Any*;
	};

	type Crystal : Any, TitledElement, IdedElement, DictRefElement, ConventionnedElement {
		Any_Ref : Any*;
	};

	type Sequence : Any, TitledElement, IdedElement, DictRefElement, ConventionnedElement {
		Any_Ref : Any*;
	};

	type Feature : Any, TitledElement, IdedElement, DictRefElement, ConventionnedElement {
		Any_Ref : Any*;
	};
}