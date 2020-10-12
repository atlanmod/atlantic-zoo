( defstruct RootFolder )
( defstruct RootContainer :name :rootFolder )
( defstruct Actor :memory :script :file :WCET :name :rootContainer )
( defstruct Transmitter :name :actor :associationQueueTransmitter )
( defstruct Receiver :name :actor :associationReceiverQueue )
( defstruct InputSignal :name :rootContainer :associationReceiverQueue )
( defstruct OutputSignal :name :rootContainer :associationQueueTransmitter )
( defstruct Queue :name :rootContainer :associationReceiverQueue :associationQueueTransmitter )
( defstruct AssociationReceiverQueue :srcqueue :dstreceiver :inputSignal )
( defstruct AssociationQueueTransmitter :dstqueue :srctransmitter :outputSignal )