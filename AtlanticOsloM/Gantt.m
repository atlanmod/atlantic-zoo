module Gantt {

	type Project {
		Name_Att : Text;
		Company_Att : Text;
		ViewDate_ContRef : Date;
		ViewIndex_ContRef : Date;
		GanttDividerLocation_Att : Integer32;
		RessourceDividerLocation_Att : Integer32;
		WebLink_Att : Text;
		Tasks_ContRef : Tasks;
		Ressources_ContRef : Ressource*;
		Allocations_ContRef : Allocation*;
	};

	type Tasks {
		Color_Att : Text;
		Tasks_ContRef : Task*;
	};

	type Task {
		Id_Att : Text;
		Name_Att : Text;
		Meeting_Att : Logical;
		Color_Att : Text;
		Expand_Att : Logical;
		Complete_Att : Integer32;
		Duration_Att : Integer32;
		Priority_Att : Integer32;
		Start_ContRef : Date;
		Depends_ContRef : Depend*;
	};

	type Depend {
		Id_Att : Text;
		Type_Att : Integer32;
		Difference_Att : Integer32;
		Hardness_Att : Text;
		Task_Ref : Task;
	};

	type Ressource {
		Id_Att : Text;
		Name_Att : Text;
		Fonction_Att : Text;
		Contact_Att : Text;
		Phone_Att : Text;
	};

	type Date {
		Year_Att : Integer32;
		Month_Att : Integer32;
		Day_Att : Integer32;
	};

	type Allocation {
		TaskId_Att : Text;
		RessourceId_Att : Text;
		Name_Att : Text;
		Function_Att : Text;
		Responsible_Att : Logical;
		Load_Att : Integer32;
	};

	type Vacation;

	type Description;

	type Previous;
}