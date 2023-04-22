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
