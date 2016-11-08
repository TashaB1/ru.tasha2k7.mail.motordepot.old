SET search_path TO motordepot;

CREATE TABLE "dispatcher" (
	"id" serial NOT NULL,
	"employee_id" bigint,
	"category" character varying(128) NOT NULL,
	CONSTRAINT dispatcher_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "application" (
	"id" serial NOT NULL,
	"number_application" bigint UNIQUE,
	"date_application" DATE,
	"client_id" bigint,
	"trip_id" bigint,
	"weight_cargo_kg" real NOT NULL,
	"length_cargo_m" real NOT NULL,
	"width_cargo_m" real NOT NULL,
	"heigth_cargo_m" real NOT NULL,
	"mark_delivery_cargo" BOOLEAN NOT NULL,
	"date_delivery_cargo" DATE NOT NULL,
	"dispatcher_id" bigint NOT NULL,
	"driver_id" bigint NOT NULL,
	"note" character varying(512) NOT NULL,
	"status" character varying(256),
	CONSTRAINT application_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "trip" (
	"id" serial NOT NULL,
	"point_departure" character varying(256),
	"date_departure" DATE,
	"destination" character varying(256),
	"date_destination" DATE NOT NULL,
	CONSTRAINT trip_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "driver" (
	"id" serial NOT NULL,
	"employee_id" serial NOT NULL,
	"number_driver_license" character varying(128),
	"category_driver_license" character varying(128),
	"car_id" bigint,
	"status" character varying(256),
	CONSTRAINT driver_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "employee" (
	"id" serial NOT NULL,
	"firstname" character varying(512),
	"lastname" character varying(512),
	"surname" character varying(512),
	"birthday" DATE,
	"position" character varying(512),
	"deleted" DATE NOT NULL,
	CONSTRAINT employee_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "car" (
	"id" serial NOT NULL,
	"make_model" character varying(256),
	"number_registration" character varying(256),
	"capacity_carrying_kg" real,
	"length_dimensions_m" real,
	"width_dimensions_m" real,
	"heigth_dimensions_m" real,
	"condition_vehical" BOOLEAN,
	"inspection_date" DATE,
	"deleted" DATE NOT NULL,
	CONSTRAINT car_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "client" (
	"id" serial NOT NULL,
	"name_client" character varying(512) NOT NULL,
	"address" character varying(512) NOT NULL,
	"number_phone" character varying(256) NOT NULL,
	"deleted" DATE NOT NULL,
	CONSTRAINT client_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



ALTER TABLE "dispatcher" ADD CONSTRAINT "dispatcher_fk0" FOREIGN KEY ("employee_id") REFERENCES "employee"("id");

ALTER TABLE "application" ADD CONSTRAINT "application_fk0" FOREIGN KEY ("client_id") REFERENCES "client"("id");
ALTER TABLE "application" ADD CONSTRAINT "application_fk1" FOREIGN KEY ("trip_id") REFERENCES "trip"("id");
ALTER TABLE "application" ADD CONSTRAINT "application_fk2" FOREIGN KEY ("dispatcher_id") REFERENCES "dispatcher"("id");
ALTER TABLE "application" ADD CONSTRAINT "application_fk3" FOREIGN KEY ("driver_id") REFERENCES "driver"("id");


ALTER TABLE "driver" ADD CONSTRAINT "driver_fk0" FOREIGN KEY ("employee_id") REFERENCES "employee"("id");
ALTER TABLE "driver" ADD CONSTRAINT "driver_fk1" FOREIGN KEY ("car_id") REFERENCES "car"("id");




