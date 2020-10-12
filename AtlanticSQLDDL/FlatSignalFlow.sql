CREATE TABLE RootFolder (
	__IDRootFolder__ Integer NOT NULL,
	PRIMARY KEY RootFolder (__IDRootFolder__)
) ;

CREATE TABLE RootContainer (
	__IDRootContainer__ Integer NOT NULL,
	name text,
	position text,
	FOREIGN KEY rootFolder (__FKrootFolder__) REFERENCES RootFolder (__IDRootFolder__),
	PRIMARY KEY RootContainer (__IDRootContainer__),
	__FKrootFolder__ Integer
) ;

CREATE TABLE Actor (
	__IDActor__ Integer NOT NULL,
	memory text,
	script text,
	file text,
	WCET text,
	name text,
	position text,
	FOREIGN KEY rootContainer (__FKrootContainer__) REFERENCES RootContainer (__IDRootContainer__),
	PRIMARY KEY Actor (__IDActor__),
	__FKrootContainer__ Integer
) ;

CREATE TABLE Transmitter (
	__IDTransmitter__ Integer NOT NULL,
	name text,
	position text,
	FOREIGN KEY actor (__FKactor__) REFERENCES Actor (__IDActor__),
	FOREIGN KEY associationQueueTransmitter (__FKassociationQueueTransmitter__) REFERENCES AssociationQueueTransmitter (__IDAssociationQueueTransmitter__),
	PRIMARY KEY Transmitter (__IDTransmitter__),
	__FKassociationQueueTransmitter__ Integer,
	__FKactor__ Integer
) ;

CREATE TABLE Receiver (
	__IDReceiver__ Integer NOT NULL,
	name text,
	position text,
	FOREIGN KEY actor (__FKactor__) REFERENCES Actor (__IDActor__),
	FOREIGN KEY associationReceiverQueue (__FKassociationReceiverQueue__) REFERENCES AssociationReceiverQueue (__IDAssociationReceiverQueue__),
	PRIMARY KEY Receiver (__IDReceiver__),
	__FKactor__ Integer,
	__FKassociationReceiverQueue__ Integer
) ;

CREATE TABLE InputSignal (
	__IDInputSignal__ Integer NOT NULL,
	name text,
	position text,
	FOREIGN KEY rootContainer (__FKrootContainer__) REFERENCES RootContainer (__IDRootContainer__),
	FOREIGN KEY associationReceiverQueue (__FKassociationReceiverQueue__) REFERENCES AssociationReceiverQueue (__IDAssociationReceiverQueue__),
	PRIMARY KEY InputSignal (__IDInputSignal__),
	__FKrootContainer__ Integer,
	__FKassociationReceiverQueue__ Integer
) ;

CREATE TABLE OutputSignal (
	__IDOutputSignal__ Integer NOT NULL,
	name text,
	position text,
	FOREIGN KEY rootContainer (__FKrootContainer__) REFERENCES RootContainer (__IDRootContainer__),
	FOREIGN KEY associationQueueTransmitter (__FKassociationQueueTransmitter__) REFERENCES AssociationQueueTransmitter (__IDAssociationQueueTransmitter__),
	PRIMARY KEY OutputSignal (__IDOutputSignal__),
	__FKrootContainer__ Integer,
	__FKassociationQueueTransmitter__ Integer
) ;

CREATE TABLE Queue (
	__IDQueue__ Integer NOT NULL,
	name text,
	position text,
	FOREIGN KEY rootContainer (__FKrootContainer__) REFERENCES RootContainer (__IDRootContainer__),
	FOREIGN KEY associationReceiverQueue (__FKassociationReceiverQueue__) REFERENCES AssociationReceiverQueue (__IDAssociationReceiverQueue__),
	FOREIGN KEY associationQueueTransmitter (__FKassociationQueueTransmitter__) REFERENCES AssociationQueueTransmitter (__IDAssociationQueueTransmitter__),
	PRIMARY KEY Queue (__IDQueue__),
	__FKrootContainer__ Integer,
	__FKassociationReceiverQueue__ Integer,
	__FKassociationQueueTransmitter__ Integer
) ;

CREATE TABLE AssociationReceiverQueue (
	__IDAssociationReceiverQueue__ Integer NOT NULL,
	FOREIGN KEY inputSignal (__FKinputSignal__) REFERENCES InputSignal (__IDInputSignal__),
	PRIMARY KEY AssociationReceiverQueue (__IDAssociationReceiverQueue__),
	__FKinputSignal__ Integer
) ;

CREATE TABLE AssociationQueueTransmitter (
	__IDAssociationQueueTransmitter__ Integer NOT NULL,
	FOREIGN KEY outputSignal (__FKoutputSignal__) REFERENCES OutputSignal (__IDOutputSignal__),
	PRIMARY KEY AssociationQueueTransmitter (__IDAssociationQueueTransmitter__),
	__FKoutputSignal__ Integer
) ;

CREATE TABLE RootContainer_inputSignal_InputSignal (
	__IDRootContainer__ Integer NOT NULL,
	__IDInputSignal__ Integer NOT NULL
) ;

CREATE TABLE AssociationReceiverQueue_srcqueue_Queue (
	__IDAssociationReceiverQueue__ Integer NOT NULL,
	__IDQueue__ Integer NOT NULL
) ;

CREATE TABLE RootContainer_actor_Actor (
	__IDRootContainer__ Integer NOT NULL,
	__IDActor__ Integer NOT NULL
) ;

CREATE TABLE RootContainer_outputSignal_OutputSignal (
	__IDRootContainer__ Integer NOT NULL,
	__IDOutputSignal__ Integer NOT NULL
) ;

CREATE TABLE Actor_receiver_Receiver (
	__IDActor__ Integer NOT NULL,
	__IDReceiver__ Integer NOT NULL
) ;

CREATE TABLE RootContainer_queue_Queue (
	__IDRootContainer__ Integer NOT NULL,
	__IDQueue__ Integer NOT NULL
) ;

CREATE TABLE AssociationQueueTransmitter_srctransmitter_Transmitter (
	__IDAssociationQueueTransmitter__ Integer NOT NULL,
	__IDTransmitter__ Integer NOT NULL
) ;

CREATE TABLE Actor_transmitter_Transmitter (
	__IDActor__ Integer NOT NULL,
	__IDTransmitter__ Integer NOT NULL
) ;

CREATE TABLE RootFolder_rootContainer_RootContainer (
	__IDRootFolder__ Integer NOT NULL,
	__IDRootContainer__ Integer NOT NULL
) ;

CREATE TABLE AssociationReceiverQueue_dstreceiver_Receiver (
	__IDAssociationReceiverQueue__ Integer NOT NULL,
	__IDReceiver__ Integer NOT NULL
) ;

CREATE TABLE AssociationQueueTransmitter_dstqueue_Queue (
	__IDAssociationQueueTransmitter__ Integer NOT NULL,
	__IDQueue__ Integer NOT NULL
) ;
