select * from users.user;





--dashboard
select * from users.user_dashboard ;



--firmware version
select * from users.dev_app_version;
select * from users.device;

select date_trunc('day', gen_ts), app_version, count(*) from users.dev_app_version
group by date_trunc('day', gen_ts), app_version
order by date_trunc('day', gen_ts);


select app_version, count(device_id) as total_device_count,gen_ts::DATE 
from users.dev_app_version 
group by app_version, gen_ts::DATE 
order by  gen_ts,app_version;


/*
INSERT INTO users.dev_app_version(
            app_version, gen_ts, device_id, prev_app_version)
    VALUES ('8.A.409', now() - interval '7 day', 15, '1.02');
--7.P.409
--7.P.411
--8.A.409
--10/F.1024
*/



--alert table
select last_known_state, last_known_state_change_ts, last_known_state_age_in_hrs, * from alert.alert_def;

select 
	SUM(
	CASE WHEN  last_known_state_age_in_hrs > 24 AND last_known_state= false AND enabled= true  THEN 1
		ELSE 0
	END) AS off_state_count_over_24hrs,
	SUM(
	CASE WHEN  last_known_state_age_in_hrs > 24 AND last_known_state= true AND enabled= true  THEN 1
		ELSE 0
	END) AS on_state_count_over_24hrs,
	
	SUM(
	CASE WHEN  last_known_state_age_in_hrs <= 24 AND last_known_state= false AND enabled= true  THEN 1
		ELSE 0
	END) AS off_state_count_under_24hrs,
	SUM(
	CASE WHEN  last_known_state_age_in_hrs <= 24 AND last_known_state= true AND enabled= true  THEN 1
		ELSE 0
	END) AS on_state_count_under_24hrs,
	COUNT(*) as totalAlerts
from alert.alert_def
where org_id = 11;



select last_known_state, last_known_state_change_ts, last_known_state_age_in_hrs, * from alert.alert_def;
select * from alert.alert_count_stats;


select extract(day from gen_ts), * from alert.alert_count_stats;
select date_trunc('day', gen_ts), * from alert.alert_count_stats;

--TODO only last 6 days
select date_trunc('day', a.gen_ts), * from alert.alert_count_stats a
where a.id in (
select max(b.id) from alert.alert_count_stats b 
where b.gen_ts >= (now() - interval '15 day')
--where b.gen_ts >= '2016-02-18'
--where b.gen_ts >= now()
group by date_trunc('day', b.gen_ts)
)
and a.org_id = 11
order  by date_trunc('day', a.gen_ts);





select 
	SUM(
	CASE WHEN extract(day from (now() - interval '3 day') - de.gen_ts) >= 1 THEN 1
		ELSE 0
	END) AS moreThan24hr,
	COUNT(*) as totalAlerts
from alert.device_event de
inner join alert.device_event_param dep on dep.device_event_id = de.id
		and dep.key = 'orgId' and dep.value  = '11'
where de.gen_ts <= (now() - interval '3 day');


select 
	SUM(
	CASE WHEN extract(day from now() - de.gen_ts) >= 1 THEN 1
		ELSE 0
	END) AS moreThan24hr,
	COUNT(*) as totalAlerts
from alert.device_event de
inner join alert.device_event_param dep on dep.device_event_id = de.id
		and dep.key = 'orgId' and dep.value  = '11';
		

select current_timestamp, --current_date, current_time, 
extract(day from now() - gen_ts) as daysApart, 
--extract(hour from now() - gen_ts) as hoursApart, --this is only hours apart (ignoring days)
* from alert.device_event de


select * from alert.device_event;
select * from alert.device_event_param
 where device_event_id = 171;
 
select last_known_state, last_known_state_change_ts, last_known_state_age_in_hrs, * from alert.alert_def;

select * from alert.alert_count_stats;

/*
update alert.device_event
 set gen_ts = now() - interval '2 day'
-- set gen_ts = now() - interval '2 hour'
-- set last_known_state = not last_known_state
--	,last_known_state_age_in_hrs = 1.2
where id = 194;
*/ 



--device status

select ds.name, count(*) 
from users.device d
inner join users.device_state ds on ds.id = d.device_state_id
group by ds.name;





--ALTER user :DB_USER set search_path = "$user", users, public;--
set search_path=users;

select * from users.device;
select * from users.device_state ;
select * from users.resource_bundle;

--sort by device_state
select rb.text, ds.name, * from users.device d
inner join users.device_state ds on d.device_state_id = ds.id
inner join users.resource_bundle rb on rb.name  = 'users.device_state.' || ds.name




select * from users.user;
select * from users.organization ;
select * from users.location ;



--alter table alert.alert_def drop column if exists deleted;
--alter table alert.alert_def drop column if exists job_key

select * from users.qrtz_job_details ;

select name, last_known_state, * from alert.alert_def ;
 
--delete  from alert.alert_def ;

select * from alert.device_event de
inner join alert.device_event_param dep on de.id = dep.device_event_id
where de.type = 'ALERT'
 and dep.key = 'alertDefName';

 
 
--CTE (Common Table Expression)
with alert_events (id) as 
		( select de.id, dep.value 
			from alert.device_event de 
			inner join alert.device_event_param dep on de.id = dep.device_event_id 
		where dep.key = 'orgId' and dep.value = '11' and de.type = 'ALERT'), 
	org_alert_events (id, gen_ts, type, caused_by, pid, key, value) as 
		( select de.id, de.gen_ts, de.type, de.caused_by, dep.id, dep.key, dep.value 
			from alert.device_event de 
			inner join alert.device_event_param dep on de.id = dep.device_event_id 
			inner join alert_events ae on ae.id = de.id) 

select oae.id, oae.gen_ts, oae.type, oae.caused_by, oae.pid, oae.key, oae.value 
	from org_alert_events oae order by oae.gen_ts DESC, 1 limit 40 offset 0


select * from alert.device_event_param 
where device_event_id = 151;


--alert


                        
            
select * from users.device;

--equivalent to now... user current_timestamp


INSERT INTO users.unknown_device(
            gen_ts, remote_address, org_id)
    VALUES (current_timestamp, 'test1', 1);


--delete  from alert.device_event_param ;

/*
INSERT INTO alert.device_event(
            caused_by, gen_ts, type)
    VALUES ('test1', current_timestamp, 'ALERT');


INSERT INTO alert.device_event_param(
            key, value, device_event_id)
    VALUES ('orgId', '2', 3);
INSERT INTO alert.device_event_param(
            key, value, device_event_id)
    VALUES ('alertDefId', '19', 3);
INSERT INTO alert.device_event_param(
            key, value, device_event_id)
    VALUES ('alertDefName', 'test9', 3);
*/







/*



delete from  alert.alert_def ;
INSERT INTO alert.alert_def(
            creation_type, eval_period_in_min, deleted, enabled, last_exec_duration_in_sec, last_known_state,
            name, org_id, last_known_state_age_in_hrs)
    VALUES ('SCRIPTED', 2, false, true, 10, true,
            'name1', 2, 1.2 );

INSERT INTO alert.alert_def(
            creation_type, eval_period_in_min, deleted, enabled, last_exec_duration_in_sec, last_known_state,
            name, org_id, last_known_state_age_in_hrs)
    VALUES ('PREDEFINED', 2, false, true, 10, true,
            'name2', 2, 1.2 );

--AlertDefCreationType...PREDEFINED
*/            

--group

select * from users.device_group ;


select * from users.device;
select * from users.user_device_group;

select * from users.picklist_device_group ;

select * from users.device_group dg
inner join users.picklist_device_group pldg on pldg.device_group_id = dg.id
inner join users.device d on d.id = pldg.device_id
where dg.id = 39;

select * from users.device d
inner join users.picklist_device_group pldg on pldg.device_id = d.id
where pldg.device_group_id = 39;











/*
INSERT INTO users.user_device_group(
            user_id, device_group_id)
    VALUES (9, 39);


INSERT INTO users.picklist_device_group(
            device_group_id, device_id)
    VALUES (39, 3);
*/




select * from users.capability c
inner join users.capability_role oc
	on oc.capability_id = c.id 
right outer join users.role r on r.id = oc.role_id

select * from users.user;

select * from users.organization ;
select * from users.capability;
select * from users.organization_capability;


select * from users.capability_role;

select * from users.role;

select * from users.user_role
where user_id = 18;


--getting user roles
select r.name, * from users.user_role ur
inner join users.user u on u.id = ur.user_id
inner join users.role r on r.id = ur.role_id
where u.login_id = 'admin2'; --'user_test1';




select * from users.capability c
 inner join users.capability_role cr on c.id = cr.capability_id
 inner join users.role r on r.id = cr.role_id
where c.name <> 'SERVICE_ADMIN';





update users.capability
 set name = 'NEW_CAPABILITY'
where id = 4;


select * from users.organization_capability;

select * from users.capability_role;
select * from users.role ;

select * from users.resource_bundle;
where name = 'users.capability.TERMINAL_OWNER';
--update users.resource_bundle
-- set text = 'Terminal Owner2'


"users.capability.NEW_CAPABILITY"
		 "NEW_CAPABILITY"



select * from users.device_type;

select * from users.organization;

select * from users.user;

select * from users.device_owner;

select * from users.location;

select * from users.device;


--TODO automate this for unit testing
INSERT INTO users.device_owner(
            organization_id, url_hash)
    VALUES (1, 'test1');


--alter table users.resource_bundle alter column name type character varying(1024);

/*
INSERT INTO users.device(
            device_id, serial_number, lane_id, device_state_id, type_id,location_id
            )
    VALUES ('test6', 'test6', 'lane',2,4,1           );


INSERT INTO users.location(
            store_id, region, district, city, postal_code, state, owner_id)
    VALUES ('store01", "a:"?, ?, ?, ?, ?, ?);


INSERT INTO users.location(
            store_id, owner_id)
    VALUES ('store01',2 );
*/            



INSERT INTO users.capability(
            id, name)
    VALUES (4, 'New Capability');



INSERT INTO users.resource_bundle(
            name, text, text_fr)
    VALUES ('users.capability.NEW_CAPABILITY', 'NEW_CAPABILITY', 'NEW_CAPABILITY_FR');


"users.capability.TERMINAL_OWNER"
users.capability.NEW_CAPABILITY









select * from users.user_dashboard ;

{
  "views": [
    {
      "id": "view_9_34_44_550_6",
      "title": "some view title1",
      "description": "some view description1",
      "rows": [
        [
          {
            "id": "wdg_9_34_44_551_63",
            "class": "terminalStatus",
            "staticCfg": {},
            "dynamicCfg": {
              "deviceUIds": [],
              "groupIds": []
            }
          }
        ]
      ]
    },
    {
      "id": "view_10_5_51_322_46",
      "title": "some view title2",
      "description": "some view description2",
      "rows": [
        [
          {
            "id": "wdg_10_5_51_322_21",
            "class": "console",
            "staticCfg": {},
            "dynamicCfg": {
              "deviceUIds": [],
              "groupIds": []
            }
          }
        ]
      ]
    }
  ]
}


"{
  "views": [
    {
      "id": "view_10_23_43_588_61",
      "title": "some view title3",
      "description": "some view description3",
      "rows": [
        [
          {
            "id": "wdg_10_23_43_588_15",
            "class": "terminalStatus", (...)"



--Justin,

            
            