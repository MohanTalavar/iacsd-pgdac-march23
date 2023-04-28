Assignment Pre-requisit:
Create a Employee Collection add 5 documents:
Example: 
{empno:111,ename:”Deepali 
Vaidya”,sal:40000.00,dept:{deptno12,dname:,”Hr”,dloc:”Mumbai},
Desg:”Analyst”,mgr:{name:”Satish”,num:111},project:[{name:”Project-1”,Hrs:4},{name:”project- 2”,Hrs:4}]}
>
db.emp.insertMany([
  {
    empno: 111,
    ename: "Deepali Vaidya",
    sal: 40000.00,
    dept: {
      deptno: 12,
      dname: "Hr",
      dloc: "Mumbai"
    },
    Desg: "Analyst",
    mgr: {
      name: "Satish",
      num: 111
    },
    project: [
      { name: "Project-1", Hrs: 4 },
      { name: "Project-2", Hrs: 4 }
    ],
	bonus: 10000
  }
]);

Assignment 2 Questions:

1. All Employee’s with the desg as ‘CLERK’ are now called as (AO) Administrative Officers. Update the Employee collection for this.
> 
db.emp.update({Desg:'Clerk'},
{$set: {Desg:'AO'}},
{multi:true});

2. Change the number of hours for project-1 to 5 for all employees with designation analyst.
>
db.emp.update({ "project.name": 'Project-1', Desg: 'Analyst'},
{$set:{ "project.$.Hrs": 5}},
{mult:true})


3. Add 2 projects project-3 and project-4 for employee whose 
name starts with ”Deep” with 2 hrs
> 
db.emp.update( {ename: /^Deep/}, 
{$push: { project: {$each: [{name:'Project-3',Hrs:2},
			    {name:'Project-4',Hrs:2}
]}} },
{multi:true}
)

4. Add bonus rs 2000 for all employees with salary > 50000 
>
db.emp.update({sal: {$gt:50000}  },
 {$inc:{sal:2000 }},
 {multi:true}
 )

5. Add bonus rs 1500 if salary <50000 and > 30000 
>
db.emp.update( { sal:{$gt:30000, $lt:50000 }},
 { $inc: {sal:15000}},
 {multi:true}
 )
 
 6. increment bounus by 1000 for all employees if salary <=30000
>
db.emp.update( {sal: {$lte:30000}},
{$inc: {sal:1000}},
{mutli:true}
)

7. Change manager name to Tushar for all employees whose manager is currently “satish”
And manager number to 3333
>	
db.emp.update( { "mgr.name": 'Satish'},
{ $set:{"mgr.name":'Tushar'}},
{multi:true});
 
8. Increase salary of all employees from “purchase department” by 15000
>
db.emp.update( {"dept.dname":'purchase department'},
{$inc: { sal:15000}},
{multi:true}
);

9. Decrease number of hrs by 2 for all employees who are working on project-2
>
db.emp.update( {"project.name":'Project-2'},
{$inc: {" project.Hrs":-2, }},
{multi:true}
);

10. Delete project-2 from all employee document if they are working on the project for 4 hrs
>
db.emp.update(
   { "project": { $elemMatch: { "name": "Project-2", "Hrs": 4 } } },
   { $pull: { "project": { "name": "Project-2", "Hrs": 4 } } },
   { multi: true }
)

11. Change the salary of employees to 10000 only if their salary is < 10000
>
db.emp.update( 
	{sal: {$lt:10000}},
	{$set: {sal:10000}},
	{multi:true}
);

12. Increase bonus of all employees by 500 if the bonus is <2000 or their salary is < 20000 or if employee belong to sales department
>
db.emp.update( 
	{sal:{$lt:20000}, "dept.dname":'Sales' },
	{$inc:{sal:500}},
	{multi:true}
);

13. Add 2 new project at position 2 for all employeeswith designation analyst or salary is equal to either 30000 or 33000 or 35000
>
db.emp.update(
  {Desg: 'Analyst', sal: {$in: [30000, 33000, 35000]}},
  {
    $push: {
      project: {
        $each: [
          {name: 'Project-11', Hrs: 10},
          {name: 'Project-12', Hrs: 11}
        ],
        $position: 2
      }
    }
  },
  {multi: true}
);

14. Delete last project of all employees with departmentname is “HR” and if the location is Mumbai
 >
 db.emp.update( 
	{},
	{},
	{multi:true}
);

15. Change designation of all employees to senior programmer if they are working on name:”Project-1” for 4 hrs
>
db.emp.update( 
	{project:{$elemMatch:{name:'Project-1',Hrs:4}} },
	{ $set:{Desg:'senior programmer'}},
	{multi:true}
);

16. Add list of hobbies in all employees document whose manager is Rajan or Revati
>
db.emp.update( 
	{"mgr.name":{$in:['Rajan','Revati']}},
	{$push:{"Hobbies": {$each:['Reading','Dancing']}}},
	{multi:true}
);
// Adding revati as a manager.
db.emp.update( 
	{"mgr.name":""},
	{$set:{"mgr.name":'Revati'}},
	{multi:true}
);

17. Add list of skillset in all employee documents who are working on project-4 for 3 hrs oron project-3 for 4 hrs 
>
db.emp.update( 
	{
	"project":{$elemMatch:{ $in: [{name:'Project-3',Hrs:4},{name:'Project-4',Hrs:3}]}}
	},
	{
	$push:{"Skillset":{$each:['Java','C']}}
	},
	{multi:true}
);


18. Add a new hobby as blogging at 3 position in hobbies arrayfor all employess whose name starts with R or M and ends with j or s
>
db.emp.update(
  { 
    ename: { $in: [ /^R.*$/, /^M.*$/ ] , $regex: /^.*n$/ }
  },
  { 
    $push: { Hobbies: { $each: [ ".NET" ], $position: 3 } } 
  },
  { 
    multi: true 
  }
);

19. Increase salary by 10000 for all employees who are working on project-2 or project-3 or project-1Decrease bonus by 1000 rs And increase salary
by 1000rs for all employees whose department location is Mumbai
>
db.emp.update( 
	{"project.name": {$in:[ 'Project-1', 'Project-2', 'Project-3']}},
	{ $inc: {sal:10000}},
	{multi:true}
);

>
db.emp.update( 
	{ "dept.dloc":'Mumbai'},
	{$inc: {bonus:-1000, sal:1000}},
	{multi:true}
);

20. Remove all employees working on project-1
>
db.emp.deleteMany( 
	{"project.name": 'Project-1'},
	{},
	{multi:true}
);

21. Replace document of employee with name “Deepak to some new document
> 
NEED TO FIND!!!!!!!!

22. Change skill python to python 3.8 for all employees if python is there in the skillset
>
db.emp.update( 
	{ "Skillset":'Python'},
	{$set: {"Skillset": "Python 3.8"}},
	{multi:true}
);

23. Add 2 skills MongoDb and Perl at the end of skillset array for all employees who are working at Pune location                                             
>
db.emp.update( 
	{ "dept.dloc":'Pune'},
	{ $push: { Skillset: {$each: ['JS', 'CS']}} },
	{multi:true}
);

24. Delete first hobby from hobby array for all employees who are working on project-1 or project-2
>
db.emp.update( 
	{ "project.name": { $in: ['Project-1', 'Project-2']}},
	{$pop: {Hobbies:-1}},
	{multi:true}
);

25. Delete last hobby from hobbies array for all employees who are working on project which is at 2 nd position in projects array for 4 hrs 
>
db.emp.update( 
	{"prject.1.Hrs":4},
	{$pop: {Hobbies:1}},
	{multi:true}
);

26. Add 2 new projects at the end of array for all employees whose skillset contains Perl or python 
>
db.emp.update( 
	{"Skillset": 'Python 3.8'},
	{$push:{ project: {$each :[ {"name":'Project-10', "Hrs":10},
	{"name":'Project-11', "Hrs":11}]}}},
	{multi:true}
);

27. Change hrs to 6 for project-1 for all employees if they working on the project-1 for < 6 hrs. otherwise keep the existing value
>
db.emp.update(
  {"project.name": "Project-2", "project.Hrs": {$lt: 6}},
  {$set: {"project.$.Hrs": {$max: [6, "$project.$.Hrs"]}}},
  {multi: true}
);

