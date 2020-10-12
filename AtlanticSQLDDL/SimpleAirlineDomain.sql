CREATE TABLE Airport (
	__IDAirport__ Integer NOT NULL,
	name text,
	PRIMARY KEY Airport (__IDAirport__)
) ;

CREATE TABLE Flight (
	__IDFlight__ Integer NOT NULL,
	FOREIGN KEY departTime (__FKdepartTime__) REFERENCES Time (__IDTime__),
	FOREIGN KEY duration (__FKduration__) REFERENCES Time (__IDTime__),
	maxnrPassengers Integer,
	FOREIGN KEY airline (__FKairline__) REFERENCES Airline (__IDAirline__),
	FOREIGN KEY origin (__FKorigin__) REFERENCES Airport (__IDAirport__),
	FOREIGN KEY destination (__FKdestination__) REFERENCES Airport (__IDAirport__),
	PRIMARY KEY Flight (__IDFlight__),
	__FKorigin__ Integer,
	__FKdestination__ Integer,
	__FKairline__ Integer,
	__FKdepartTime__ Integer,
	__FKduration__ Integer
) ;

CREATE TABLE Airline (
	__IDAirline__ Integer NOT NULL,
	name text,
	nationality text,
	PRIMARY KEY Airline (__IDAirline__)
) ;

CREATE TABLE Passenger (
	__IDPassenger__ Integer NOT NULL,
	name text,
	age Integer,
	gender text,
	needsAssistance Boolean,
	FOREIGN KEY flight (__FKflight__) REFERENCES Flight (__IDFlight__),
	PRIMARY KEY Passenger (__IDPassenger__),
	__FKflight__ Integer
) ;

CREATE TABLE Time (
	__IDTime__ Integer NOT NULL,
	year Integer,
	month Integer,
	day Integer,
	hour Integer,
	minute Integer,
	second Integer,
	PRIMARY KEY Time (__IDTime__)
) ;

CREATE TABLE Airport_arrivingFlight_Flight (
	__IDAirport__ Integer NOT NULL,
	__IDFlight__ Integer NOT NULL
) ;

CREATE TABLE Airline_flight_Flight (
	__IDAirline__ Integer NOT NULL,
	__IDFlight__ Integer NOT NULL
) ;

CREATE TABLE Flight_passenger_Passenger (
	__IDFlight__ Integer NOT NULL,
	__IDPassenger__ Integer NOT NULL
) ;

CREATE TABLE Airport_departingFlight_Flight (
	__IDAirport__ Integer NOT NULL,
	__IDFlight__ Integer NOT NULL
) ;
