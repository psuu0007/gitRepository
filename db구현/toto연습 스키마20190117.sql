
select *
from dept;

--유일하면서도 null이 아닌 값 만 저장될 수 있는 컬럼?
--기본키

select *
from user_constraints;

--[형식]
--alter table 테이블명
--add constraint 제약조건명 제약조건(지정할 컬럼명);
alter table dept
add constraint dept_deptno_pk primary key(deptno);

--제약조건을 지우는방법
--alter table 테이블명
--drop constraint 제약조건명;


select * 
from emp06; 

create table emp06
as
select *
from emp;

insert into emp06
(empno,ename,deptno)
values
(8000,'홍길동',50);

rollback;
desc emp;
create table dept02
(
    DEPTNO      NUMBER(2) primary key,   
    DNAME       VARCHAR2(14), 
    LOC         VARCHAR2(13) 
);

create table emp07
(
    EMPNO       NUMBER(4) primary key,    
    ENAME       VARCHAR2(10), 
    JOB         VARCHAR2(9),  
    MGr         NUMBER(4),    
    HIREDATE    DATE,         
    SAL         NUMBER(7,2),  
    COMM        NUMBER(7,2),  
    DEPTNO      NUMBER(2) constraint EMP07_DEPTNO_DEPT02_FK references dept02(deptno)
);

select * from EMP07;

insert into emp07
(empno,ename,deptno)
values
(7369,'SMITH',20);

insert into emp07
(empno,ename,deptno)
values
(7499,'ALLEN',30);

insert into emp07
(empno,ename,deptno)
values
(8000,'홍길동',10);

insert into dept02
values(10,'ACCOUNTING','NEW YORK');

insert into dept02
values(20,'RESEARCH','DALLAS');

insert into dept02
values(30,'SALES','CHICAGO');

insert into dept02
values(40,'OPERATIONS','BOSTON');

CREATE TABLE DEPT03
(
    DEPTNO  NUMBER(3) PRIMARY KEY,
    DNAME   VARCHAR2(14),
    LOC     VARCHAR2(13) DEFAULT 'SEOUL'
);

INSERT INTO DEPT03
(DEPTNO,DNAME)
VALUES(10,'ACCOUNTING');

INSERT INTO DEPT03
(DEPTNO,DNAME)
VALUES(20,'ACCOUNTING');

INSERT INTO DEPT03
(DEPTNO,DNAME,LOC)
VALUES(30,'ACCOUNTING','JINJU');

INSERT INTO DEPT02
(DEPTNO,DNAME)
VALUES(50,'ACCOUNTING');

SELECT *
FROM USER_CONSTRAINTS;


SELECT * 
FROM EMP;

SELECT *
FROM DEPT;

DESC DEPT;


ALTER TABLE EMP06
MODIFY ENPNO CONSTRAINT EMP06_EMPNO_NN NOT NULL;

ALTER TABLE EMP06
DROP CONSTRAINT SYS_C007029;

DESC EMP;

SELECT *
FROM EMP_BACKUP;

CREATE TABLE EMP
AS
SELECT *
FROM EMP_BACKUP;

CREATE TABLE DEPT
AS
SELECT *
FROM DEPT_BACKUP;

ALTER TABLE DEPT
MODIFY DNAME constraint DEPT_DNAME_NN NOT NULL;

ALTER TABLE DEPT
MODIFY LOC constraint DEPT_LOC_NN NOT NULL;

SELECT *
FROM EMP;

ALTER TABLE EMP
ADD constraint EMP_EMPNO_PK PRIMARY KEY(EMPNO);

ALTER TABLE EMP
MODIFY SAL NOT NULL;

select *
from tab;




