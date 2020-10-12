module MSProject {

	type MSPProject {
		Resource_ContRef : MSPResource*;
		Link_ContRef : MSPLink*;
		Task_ContRef : MSPTask*;
	};

	type MSPTask {
		FinishDate_ContRef : Date;
		StartDate_ContRef : Date;
		Project_Ref : MSPProject;
		SuperTask_Ref : MSPTask?;
		SubTask_Ref : MSPTask*;
		Assignment_Ref : MSPAssignment*;
		InLink_Ref : MSPLink*;
		OutLink_Ref : MSPLink*;
	};

	type MSPLink {
		Project_Ref : MSPProject;
		Succ_Ref : MSPTask;
		Pred_Ref : MSPTask;
	};

	type MSPAssignment {
		Task_Ref : MSPTask;
		Resource_Ref : MSPResource;
	};

	type MSPResource {
		Cost_Att : Double;
		Project_Ref : MSPProject;
		Assignment_Ref : MSPAssignment*;
	};

	type MSPHumanResource : MSPResource {
		Email_Att : Text;
	};

	type MSPMachine : MSPResource;

	type Date {
		Day_Att : Integer32;
		Month_Att : Integer32;
		Year_Att : Integer32;
	};
}