use CSC

create table Student1(SNo int,SName varchar(20),Gender varchar(6),Dep varchar(20),M1 int,M2 int, M3 int,M4 int,M5 int,Total int,Avrg float, Result varchar(5))

select * from Student1 

create proc InsData @sno int,@nam varchar(20),@gen varchar(6),@dep varchar(15),@m1 int,@m2 int, @m3 int,@m4 int,@m5 int as
begin
declare @tot int
declare @avg int
declare @res varchar(5)
set @tot=@m1+@m2+@m3+@m4+@m5
set @avg=@tot/5
if @m1>35 and @m2>35 and @m3>35 and @m4>35 and @m5>35
 begin
   set @res= 'Pass'
  end
  else
  begin
   set @res='Fail'
   end
  insert into Student1 values(@sno,@nam,@gen,@dep,@m1,@m2,@m3,@m4,@m5,@tot,@avg,@res)   
  end

create proc GetData @sno int as
begin
  select * from student1 where Sno=@sno
  select * from student1
end