select count(*) "전체 행수", count(height) "키 건수", max(height) 최대키
,  min(height) 최소키, round(avg(height), 2) 평균키
from player;

select count(player_id), count(height), count(player_name)
from player;

select count(*) "전체 행수", count(height) "키 건수"
    , count(*) - count(height) as "height val null cnt"
from player;

--테이블 구조 복사
create table emp_test
as
select ename, sal, job
from emp
where 1 = 0;

select *
from emp_test;

desc emp_test;

insert into emp_test(
    ename
)
values(null);

select count(*), count(ename), count(sal), count(job)
from emp_test;

select ROWNUM, EMP_TEST.*
from emp_test;



SELECT position              AS 포지션
     , COUNT(*)         AS 인원수
     , COUNT(height)         AS 키대상
     , MAX(height)           AS 최대키
     , MIN(height)           AS 최소키
     , ROUND(AVG(HEIGHT), 2) AS 평균키
FROM PLAYER
GROUP BY position;

SELECT position                     AS 포지션
     , COUNT(NVL(position, '없음'))  AS 인원수
     , COUNT(height)                AS 키대상
     , MAX(height)                  AS 최대키
     , MIN(height)                  AS 최소키
     , ROUND(AVG(HEIGHT), 2)        AS 평균키
FROM PLAYER
GROUP BY position;

SELECT position
FROM PLAYER
WHERE position IS NULL;

SELECT COUNT(position)
FROM PLAYER
WHERE position IS NULL;

SELECT COUNT(ROWNUM)
FROM PLAYER
WHERE position IS NULL;


select *
from emp
where rownum <= 3;


SELECT DEPTNO, AVG(SAL)
FROM EMP
GROUP BY DEPTNO;

-- 부서별 평균 급여가 2000이상인 
-- 부서의 부서번호와 부서별 평균 급여를 출력하시오
SELECT DEPTNO, AVG(SAL)
FROM EMP
GROUP BY DEPTNO
HAVING AVG(SAL) >= 2000;


-- 7  -> 3
SELECT TEAM_ID  AS 팀_ID ,
       COUNT(*) AS 인원수
FROM PLAYER
WHERE TEAM_ID = 'K02' OR TEAM_ID = 'K09'
GROUP BY TEAM_ID;

-- 6 ->
SELECT TEAM_ID  AS 팀_ID ,
       COUNT(*) AS 인원수
FROM PLAYER
GROUP BY TEAM_ID
having TEAM_ID = 'K02' OR TEAM_ID = 'K09';

select *
from emp;

-- 사원테이블에서 급여가 가장 작은 값에서 
-- 가장 큰 급여순으로 출력하시오
select *
from emp
order by sal asc;

select *
from emp
order by sal;

select *
from emp
order by sal desc;


SELECT *
FROM EMP
ORDER BY HIREDATE DESC, SAL ASC;


SELECT DEPT.*, DEPTNO * 10 AS NEWCOL
FROM DEPT
ORDER BY DEPTNO DESC, DNAME ASC, LOC DESC;

DESC DEPT;

SELECT DNAME, LOC, DEPTNO
FROM DEPT
ORDER BY 1 DESC, 2 ASC, 3 DESC;

SELECT DEPT.*, DEPTNO * 10 AS NEWCOL
FROM DEPT
ORDER BY NEWCOL DESC;

SELECT DEPT.*, DEPTNO * 0 AS NEWCOL
FROM DEPT
ORDER BY NEWCOL DESC, 1 DESC;



--VIEW


SELECT ENAME, JOB, SAL, SAL*12 YEARSAL
FROM EMP;

SELECT *
FROM EMP_BOOKS_VIEW;


CREATE VIEW EMP_BOOKS_VIEW
AS
SELECT ENAME, JOB, SAL, SAL*12 YEARSAL
FROM EMP
WHERE 1 = 0;


SELECT *
FROM EMP_BOOKS_VIEW
WHERE ROWNUM <= 3;

SELECT *
FROM EMP_BOOKS_VIEW
WHERE SAL <= 2000;


-- 동등 조인
-- 사원의 정보와 각 사원의 부서정보를 
-- 조회하시오
select *
from emp, dept
where emp.deptno = dept.deptno;


select emp.ename, dept.deptno, dept.dname
from emp, dept
where emp.deptno = dept.deptno;

select *
from user_constraints
where table_name = 'EMP'
or table_name = 'DEPT';

desc emp;

-- alias 별칭
select e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc as 이것도별칭
from emp e, dept d
where e.deptno = d.deptno;


SELECT EMP.ENAME, DEPT.DEPTNO, DEPT.DNAME
FROM EMP,DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO
ORDER BY DEPTNO, ENAME;


SELECT count(*)
FROM PLAYER, TEAM
WHERE PLAYER.TEAM_ID = TEAM.TEAM_ID;




-- 사원 중에 SMITH라는 이름의 사원에 대해
-- 이름과 부서명을 출력하시오
SELECT E.ENAME,  D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
AND E.ENAME = 'SMITH';

SELECT *
FROM EMP;

-- 사원 중 입사일이 현재날짜 보다 작거나 같은
-- 사원의 이름과 부서명을 조회하시오(부서과 없는 사원은 제외)
SELECT E.ENAME,  D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
AND E.HIREDATE <= SYSDATE;

-- 오라클 전용 SQL문
SELECT E.ENAME,  D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
AND E.ENAME = 'SMITH';

-- ANSI STANDARD JOIN    안시 표준 조인
-- 내부 조인 ( 동등조인 =,    범위조인)
SELECT  E.ENAME,  D.DNAME
FROM      EMP E INNER JOIN DEPT D
ON           E.DEPTNO = D.DEPTNO;


SELECT  E.ENAME,  D.DNAME
FROM      EMP E INNER JOIN DEPT D
ON           E.DEPTNO = D.DEPTNO
WHERE   E.ENAME = 'SMITH';




-- 비동등 조인
SELECT E.EMPNO, E.ENAME, E.JOB, E.SAL, D.DNAME
FROM EMP E JOIN DEPT D
ON   E.DEPTNO = D.DEPTNO
WHERE E.SAL BETWEEN 1000 AND 3000;

-- 오라클 조인
SELECT E.EMPNO, E.ENAME, E.JOB, E.SAL, D.DNAME
FROM EMP E JOIN DEPT D
ON   E.DEPTNO = D.DEPTNO
WHERE E.SAL BETWEEN 1000 AND 3000;  -- <- 기본 연산으로 구하시오




