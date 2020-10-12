module LaTeX {

	type ValuedElement {
		Value_Att : Text;
	};

	type Type : ValuedElement;

	type Title : ValuedElement;

	type Name : ValuedElement {
		Author_Ref : Author?;
		Organisation_Ref : Organisation?;
	};

	type Date : ValuedElement;

	type Author {
		Names_ContRef : Name+;
	};

	type Adress : ValuedElement;

	type Organisation {
		Names_ContRef : Name+;
		Adress_ContRef : Adress;
		Heading_Ref : Heading;
	};

	type Phone : ValuedElement;

	type Fax : ValuedElement;

	type EMail : ValuedElement;

	type Heading {
		Organisations_ContRef : Organisation*;
		Phone_ContRef : Phone?;
		Fax_ContRef : Fax?;
		Email_ContRef : EMail?;
	};

	type Abstract : ValuedElement;

	type Keywords : ValuedElement;

	type SectionBody {
		Corps_ContRef : Corps*;
		Section_Ref : Section;
	};

	type Corps {
		Sectionbody_Ref : SectionBody;
	};

	type Value : Corps, ValuedElement;

	type Cite : Corps, ValuedElement;

	type Path : ValuedElement;

	type Label : ValuedElement;

	type Figure : Corps {
		Path_ContRef : Path;
		Label_ContRef : Label;
		Title_ContRef : Title;
	};

	type Item : ValuedElement {
		Itemscontainer_Ref : Items?;
		Enumeratecontainer_Ref : Enumerate?;
	};

	type Items : Corps {
		Item_ContRef : Item+;
	};

	type Enumerate : Corps {
		Item_ContRef : Item+;
	};

	type Section : Corps {
		Title_ContRef : Title;
		SectionBody_ContRef : SectionBody;
	};

	type Description : ValuedElement {
		Date_ContRef : Date;
	};

	type Citation {
		Label_ContRef : Label;
		Author_ContRef : Author;
		Description_ContRef : Description;
		Bibliography_Ref : Bibliography;
	};

	type Bibliography {
		Citations_ContRef : Citation+;
		Documentbody_Ref : DocumentBody;
	};

	type DocumentBody {
		Sections_ContRef : Section+;
		Bibliography_ContRef : Bibliography*;
		Document_Ref : Document;
	};

	type Document {
		Type_ContRef : Type;
		Title_ContRef : Title;
		Author_ContRef : Author?;
		Date_ContRef : Date?;
		Heading_ContRef : Heading?;
		Abstract_ContRef : Abstract?;
		Keywords_ContRef : Keywords?;
		Documentbody_ContRef : DocumentBody;
	};
}