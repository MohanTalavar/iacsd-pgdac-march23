> # In Lecture Questions on CURSOR.
*Class taught by kishori madam*

**Q1. GET EMP DETAILS**

	delimiter //

	create procedure get_emp_details()
	begin
	declare finished int default 0;
	declare vempno,vmgr,vdeptno int;
	declare vename, vjob varchar(20);
	declare vhiredate date;
	declare vsal, vcomm double(9,2);
	declare emp_cur cursor for select * from emp;
	declare continue handler for not found set finished=1;
	open emp_cur;
	L1:loop
	fetch emp_cur into vempno, vename, vjob, vmgr,
	vhiredate, vsal, vcomm, vdeptno;
	if finished =1 then
		leave L1;
	end if;
	select vempno, vename, vjob, vmgr,
	vhiredate, vsal, vcomm, vdeptno;
	end loop;
	close emp_cur;
	end//
	delimiter ;

**Q2.Update sal of employee, also give cnt of each type as output.
If manager, then increase it by 10%
If analyst, then increase by 20%
If CLERK, the increase by 25%
Otherwise increase by 8%**   

Note: Here pccnt : counting no of updated salaries of Clerk.  
	   pacnt : counting no of updated salaries of Analyst.  
	   pmcnt : counting no of updated salaries of Manager.  
	   pocnt : counting no of updated salaries of Others.   
	   
IMP:   SET VARIABLES AFTER THE ENTIRE DECLARATION BLOCK 
       Eg: line 68-71   

	delimiter //                       

	create procedure empupdatesal4(
	out pccnt int,
	out pmcnt int,
	out pacnt int,
	out pocnt int
	)
	begin 

	declare finished int default 0;

	declare vempno, vmgr, vdeptno int;
	declare vename, vjob varchar(20);
	declare vhiredate date;
	declare vsal, vcomm double(9,2);
	declare vupdsal double(9,2);
	declare hike float(5,2);

	declare emp_cur cursor for select * from emporg;

	declare continue handler for not found set finished =1;

	set pacnt=0;
	set pmcnt=0;
	set pccnt=0;
	set pocnt=0;

	open emp_cur;
	L1:loop
	fetch emp_cur into vempno, vename,vjob,vmgr,vhiredate,vsal,vcomm,vdeptno;
	if finished=1
		then leave L1;
	end if;
	
	if vjob='manager' then 
		set hike=0.10;
		set pmcnt=pmcnt+1;
	elseif vjob='analyst' then 
		set hike=0.20;
		set pacnt=pacnt+1;
	elseif vjob='clerk' then 
		set hike=0.25;
		set pccnt=pccnt+1;
	else 
		set hike=0.08;
		set pocnt=pocnt+1;
	end if;
	
	set vupdsal = vsal+vsal*hike;
	
	update emporg 
	set sal= vupdsal
	where empno=vempno;
	
	select vempno, vename,vjob,vmgr,vhiredate,vsal,vupdsal,vcomm,vdeptno;
	end loop;
	select pccnt,pacnt,pmcnt,pocnt;
	close emp_cur;
						
	end//
	delimiter ;

call empupdatesal4(@a,@b,@c,@d);
	
**Q3 Write a procedure to update price of product using cursor.
If the category is chips then increase the price by 10%
If the category is cold drink then increase the price by 20%
Else increase by 8 %**


	delimiter //
	create procedure upd_price_prod()
	begin 
	declare finished int default 0;
	declare vpid,vcatid,vqty int;
	declare vpname varchar(20);
	declare vprice double(9,2);
	declare vchipsid,vcoldrinkid int;
	
	declare prod_cur cursor for select * from product;
	declare continue handler for not found set finished=1;
	
	open prod_cur;
		
		select cid into vchipsid
		from category 
		where cname='chips';
		
		select cid into vcoldrinkid
		from category
		where cname='cold drink';
		
		L1:loop
		fetch prod_cur into vpid,vpname,vqty,
			vprice,vcatid;
		if finished=1 then
			leave L1;
		end if;
		
		if vchipsid=vcatid then 
		update product
		set price=1.10*ifnull(price,1)
		where pid=vpid;
		
		elseif vcoldrinkid=vcatid then 
		update product
		set price=1.20*ifnull(price,1)
		where pid=vpid;
		
		else 
		update product
		set price=1.08*price
		where pid=vpid;
		
		end if;
		end loop L1;
		
		select * from product;
		close prod_cur;
		end//
		
		delimiter ;
	
**Q4. Write a procedure to find comma separated list of emails**

	delimiter //
	create procedure get_emails_emp()
	begin
	declare finished int default 0;
	declare str varchar(1000) default'';
	declare vemail, vename, vjob varchar(50);
	
	declare emp_cur cursor for select ename,job from emp;
	declare continue handler for not found set finished=1;
	
	open emp_cur;
		L1:loop
		fetch emp_cur into vename,vjob;
		if finished=1 then 
		leave L1;
		end if;
		
		if vjob is not null then
		set vemail=concat(substr(vename,1,3),'.',substr(vjob,1,3),'@mycompany.com');
		set str=concat(str,vemail,',');
		end if;
		
		end loop L1;
		close emp_cur;
		set str=substr(str,1,length(str)-1);
		select str;
		
		end//
		delimiter ;
																		
