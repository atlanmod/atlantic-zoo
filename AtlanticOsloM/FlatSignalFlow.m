module FlatSignalFlow {

	type RootFolder {
		RootContainer_ContRef : RootContainer*;
	};

	type RootContainer {
		Name_Att : Text;
		Position_Att : Text;
		RootFolder_Ref : RootFolder;
		Actor_ContRef : Actor*;
		InputSignal_ContRef : InputSignal*;
		OutputSignal_ContRef : OutputSignal*;
		Queue_ContRef : Queue*;
	};

	type Actor {
		Memory_Att : Text;
		Script_Att : Text;
		File_Att : Text;
		WCET_Att : Text;
		Name_Att : Text;
		Position_Att : Text;
		RootContainer_Ref : RootContainer;
		Transmitter_ContRef : Transmitter*;
		Receiver_ContRef : Receiver*;
	};

	type Transmitter {
		Name_Att : Text;
		Position_Att : Text;
		Actor_Ref : Actor;
		AssociationQueueTransmitter_Ref : AssociationQueueTransmitter;
	};

	type Receiver {
		Name_Att : Text;
		Position_Att : Text;
		Actor_Ref : Actor;
		AssociationReceiverQueue_Ref : AssociationReceiverQueue;
	};

	type InputSignal {
		Name_Att : Text;
		Position_Att : Text;
		RootContainer_Ref : RootContainer;
		AssociationReceiverQueue_Ref : AssociationReceiverQueue;
	};

	type OutputSignal {
		Name_Att : Text;
		Position_Att : Text;
		RootContainer_Ref : RootContainer;
		AssociationQueueTransmitter_Ref : AssociationQueueTransmitter;
	};

	type Queue {
		Name_Att : Text;
		Position_Att : Text;
		RootContainer_Ref : RootContainer;
		AssociationReceiverQueue_Ref : AssociationReceiverQueue;
		AssociationQueueTransmitter_Ref : AssociationQueueTransmitter;
	};

	type AssociationReceiverQueue {
		Srcqueue_Ref : Queue+;
		Dstreceiver_Ref : Receiver+;
		InputSignal_Ref : InputSignal;
	};

	type AssociationQueueTransmitter {
		Dstqueue_Ref : Queue+;
		Srctransmitter_Ref : Transmitter+;
		OutputSignal_Ref : OutputSignal;
	};
}