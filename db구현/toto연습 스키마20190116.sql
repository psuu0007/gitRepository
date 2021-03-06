SELECT *
FROM EMP01;

DESC EMP01;

--DROP TABLE EMP01;

CREATE TABLE EMP01
AS
SELECT *
FROM EMP;

--직급 컬럼을 최대 30글자까지 저장할 수 있도록 변경한다
ALTER TABLE EMP01
MODIFY(JOB VARCHAR2(30));

DESC EMP01;

CREATE TABLE EMP02
AS
SELECT *
FROM EMP01;

DESC EMP02;


SELECT *
FROM EMP02;

ALTER TABLE EMP02
MODIFY (JOB VARCHAR2(10));


DELETE FROM EMP02;

DROP TABLE EMP02;

SELECT *
FROM EMP02;

COMMIT;

ALTER TABLE EMP02
MODIFY (SAL VARCHAR2(100));

DESC EMP02;


SELECT *
FROM DEPT;

DESC DEPT;

CREATE TABLE DEPT01
AS
SELECT *
FROM DEPT;

DESC DEPT01;

--[형식]
--ALTER TABLE 테이블명
--RENAME COLUMN 변경해야 할 컬럼명 TO 새로운 컬럼명;

ALTER TABLE DEPT01
RENAME COLUMN LOC TO LOCATION;

-- 테이블명 수정
RENAME DEPT01 TO DEPARTMENT;

DESC DEPARTMENT;


CREATE TABLE test 
(
    no number,
    name varchar2(10),
    age     number,
    birthday    date
);

desc test;
select *
from test;

insert into test
(no, age, name)
values     
(1, 10, 'aaa');

insert into test
(no, age, name)
values     
(3, 30, 'ccc');

select *
from test;


insert into test
values(4, 'ddd', 40, null);



select *
from dept;


desc dept;


SELECT *
FROM EMP03;


UPDATE EMP03
SET DEPTNO = 30, 
        COMM = 100;

CREATE TABLE EMP03
AS
SELECT *
FROM EMP;


SELECT *
FROM DEPT;


CREATE TABLE DEPT01
AS
SELECT *
FROM DEPT;


SELECT *
FROM DEPT01;

UPDATE DEPT01
SET DNAME = 'ACCOUNT'
WHERE DNAME = 'ACCOUNTING';


DELETE FROM DEPT01;


COMMIT;


select *
from dept;

select *
from test;

insert into test 
values(1, 'aaa', 10, '');

commit;

select *
from test
where no = 2;

select *
from dept;


SELECT * 
FROM DEPT;


--제약조건 확인하기

DESC USER_CONSTRAINTS;

SELECT *
FROM USER_CONSTRAINTS;



SELECT *
FROM EMP01;


DROP TABLE EMP01;


CREATE TABLE EMP01
(
    EMPNO NUMBER(4),
    ENAME VARCHAR2(10),
    JOB VARCHAR2(9),
    DEPTNO NUMBER(2)
);

SELECT * FROM EMP01;

INSERT INTO EMP01
VALUES(NULL, NULL, 'SALES', 30);

DROP TABLE EMP02;

CREATE TABLE EMP02(
    EMPNO NUMBER(4) NOT NULL,
    ENAME VARCHAR2(10) NOT NULL,
    JOB VARCHAR2(9),
    DEPTNO NUMBER(2)
);

INSERT INTO EMP02
VALUES(1, 'AAA', NULL, NULL);

DESC EMP02;

SELECT *
FROM EMP01;

DELETE FROM EMP01;
COMMIT;


INSERT INTO EMP01
VALUES(7499, 'AAA', 'SALES', 30);
INSERT INTO EMP01
VALUES(7499, 'BBB', 'MANAGER', 20);


DROP TABLE EMP03;

CREATE TABLE EMP03(
    EMPNO NUMBER(4) UNIQUE,
    ENAME VARCHAR2(10) UNIQUE,
    JOB VARCHAR2(9),
    DEPTNO NUMBER(2)
);

INSERT INTO EMP03
VALUES(7499, 'AAA', 'SALES', 30);
INSERT INTO EMP03
VALUES(7501, 'BBC', 'MANAGER', 20);

SELECT * FROM EMP03;

DESC EMP03;

--제약조건 확인
SELECT *
FROM USER_CONSTRAINTS;

--형식
--컬럼명 타입 CONSTRAINT 제약조건명 제약조건

--제약조건명을 명시하여 작성하는 방법
CREATE TABLE EMP04(
    EMPNO NUMBER(4) CONSTRAINT EMP04_EMPNO_UK UNIQUE,
    ENAME VARCHAR2(10) CONSTRAINT EMP_ENAME_NN NOT NULL,
    JOB VARCHAR2(9),
    DEPTNO NUMBER(2)
);

--제약조건명 명명규칙
--테이블명_컬럼명_제약조건명

SELECT *
FROM EMP03;


DELETE FROM EMP03;
COMMIT;

INSERT INTO EMP03
VALUES(NULL, 'JONES', 'MANAGER', 20);

INSERT INTO EMP03
VALUES(NULL, 'JONES', 'SALES', 10);

DROP TABLE EMP05;

CREATE TABLE EMP05(
    EMPNO NUMBER(4) CONSTRAINT EMP05_EMPNO_PK PRIMARY KEY,
    ENAME VARCHAR2(10) CONSTRAINT EMP05_ENAME_NN NOT NULL,
    JOB VARCHAR2(9),
    DEPTNO NUMBER(2)
);

INSERT INTO EMP05
VALUES(7000, 'JONES', 'MANAGER', 20);

INSERT INTO EMP05
VALUES(7001, 'JONES', 'SALES', 10);

INSERT INTO EMP05
VALUES(7499, 'ALLEN', 'SALES', 30);

SELECT *
FROM EMP05;

SELECT *
FROM EMP05
WHERE EMPNO = 7001;


