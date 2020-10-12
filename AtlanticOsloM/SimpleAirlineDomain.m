module SimpleAirlineDomain {

	type Airport {
		Name_Att : Text;
		DepartingFlight_Ref : Flight*;
		ArrivingFlight_Ref : Flight*;
	};

	type Flight {
		DepartTime_Ref : Time;
		Duration_Ref : Time;
		MaxnrPassengers_Att : Integer32;
		Passenger_Ref : Passenger*;
		Airline_Ref : Airline;
		Origin_Ref : Airport;
		Destination_Ref : Airport;
	};

	type Airline {
		Name_Att : Text;
		Nationality_Att : Text;
		Flight_Ref : Flight*;
	};

	type Passenger {
		Name_Att : Text;
		Age_Att : Integer32;
		Gender_Att : Genre;
		NeedsAssistance_Att : Logical;
		Flight_Ref : Flight;
	};

	type Genre {"male", "female"};

	type Time {
		Year_Att : Integer32;
		Month_Att : Integer32;
		Day_Att : Integer32;
		Hour_Att : Integer32;
		Minute_Att : Integer32;
		Second_Att : Integer32;
	};
}