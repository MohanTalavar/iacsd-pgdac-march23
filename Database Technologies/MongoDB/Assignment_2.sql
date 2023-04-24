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

13. Add 2 new project at position 2 for all employees
with designation analyst or salary is 
equal to either 30000 or 33000 or 35000
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

14. Delete last project of all employees with department
 name is “HR” and if the location is Mumbai
 >
 db.emp.update( 
	{},
	{},
	{multi:true}
);

