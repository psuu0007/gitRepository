select sysdate
from dual;

--date 년/월/일 시 분 초

select to_char(sysdate, 'YYYY-MM-DD HH:MI:SS') 날짜
from dual;

select sysdate + 1
from dual;

-- 2019-01-24
select to_date('2019-01-24 10:38:10', 'YYYY-MM-DD HH24:MI:SS') 
    - to_date('2019-01-24 10:36:10', 'YYYY-MM-DD HH24:MI:SS') 일단위
from dual;


select (to_date('2019-01-24 10:38:10', 'YYYY-MM-DD HH24:MI:SS') 
          - to_date('2019-01-24 10:36:10', 'YYYY-MM-DD HH24:MI:SS')) * (60*60*24) 초단위
from dual;

select (to_date('2019-01-24 18:40:10', 'YYYY-MM-DD HH24:MI:SS') 
          - to_date('2019-01-24 12:40:10', 'YYYY-MM-DD HH24:MI:SS')) * 24 시간단위
from dual;

select (to_date('2019-01-24 12:40:10', 'YYYY-MM-DD HH24:MI:SS') 
          - to_date('2019-01-24 12:38:10', 'YYYY-MM-DD HH24:MI:SS')) * (24*60) 분단위
from dual;


select to_char(to_date('2019-01-23 10:36:10', 'YYYY-MM-DD HH24:MI:SS')
    , 'YYYY-MM-DD HH24:MI:SS') 초단위
from dual;


select 24*60*60
from dual;

desc emp;

select ename, sal, comm, job
from emp;

select ename, sal, nvl(comm, '널을 다른 값으로 표현하고자 하는 글'), job
from emp;

select ename, sal, nvl(comm, 10) comm, job
from emp;

select nvl('0', '아 nvl함수는 null에 관련해서 필요한 내용으로 변경하는거구나')
from dual;

select 'sdf'
from dual;

SELECT MGR
FROM EMP;

SELECT   NVL(TO_CHAR(7902), 'C  E  O') --, NVL(TO_CHAR(NULL), 'C  E  O')
FROM    DUAL;

SELECT   7902 + 1     -- 79021
FROM    DUAL;

-- '7902' + 1     ->    모든 문자 숫자로만 구성되어있더라 -> 7902 + 1 -> 7903

SELECT   TO_CHAR(7902) + '1'   -- 오류
FROM    DUAL;

SELECT   TO_CHAR(7902) || 1    -- 79021
FROM    DUAL;

SELECT   TO_CHAR(7902, 'L9,999')
FROM    DUAL;

SELECT   7902
FROM    DUAL;

select *
from emp;

insert into emp
values(8000, '박성욱', 'teacher', 0, sysdate, 1000, 1000, 40);

SELECT EMPNO, ENAME, NVL(TO_CHAR(MGR), 'C  E  O') AS  MANAGER
FROM EMP
WHERE NVL(MGR, 0) = 0;


SELECT EMPNO, ENAME, NVL(TO_CHAR(MGR), 'C  E  O') AS  MANAGER
FROM EMP
WHERE mgr is null;


select empno, ename, job, deptno
from emp
where sal = 800;

select empno, ename, job, deptno, sal * 12 as yearsal
from emp
where sal = 800
or yearsal >= 1000;


SELECT EMPNO, ENAME, NVL(TO_CHAR(MGR), 'C  E  O') AS  MANAGER
FROM EMP;

select *
from emp;



--그룹 함수   <--> 단일 함수
select deptno, round(sal, 3)     
from emp;

select *
from emp;

select sum(sal)
from emp;

select *
from dept;

select sum(deptno)
from dept;

select sum(weight) || 'Kg' as 모든선수들의몸무게, player_name
from player;

select comm, comm + 12
from emp;

-- 전체 사원의 커미션의 합계를 구하시오
select sum(comm)
from emp;

-- 전체 사원의 급여 평균을 구하시오
select round(avg(sal), 2)
from emp;

select avg(sal)
from emp;

select avg(nvl(comm, 0))   -- 0 300 0 0 0 500  (0 + 300 + 500 + 0 + 0 + 100) / 12
from emp;

select nvl(avg(comm), 0)   -- (300 + 500 + 100) / 3 -> nvl(733.3333333333, 0)
from emp;

select sal
from emp;


select max(sal) 최고급여, min(sal) 최저급여, sum(sal) 사원총급여
    , avg(sal) as 사원평균급여, count(*) 총사원수
from emp;

select count(empno), count(sal), count(*), count(comm)
, count(deptno)
from emp;

select empno, sal, comm, deptno
from emp;


--group by절
-- 사원테이블을 부서번호로 그룹화 하시오
-- 사원테이블을 부서번호로 그룹별로 표시하시오
select deptno
from emp
group by deptno;


SELECT *
FROM EMP;


SELECT MAX(SAL)
FROM EMP
GROUP BY DEPTNO;


SELECT DEPTNO, MAX(SAL)
FROM EMP
GROUP BY DEPTNO;


SELECT DEPTNO, MAX(SAL)
FROM EMP
WHERE DEPTNO IS NOT NULL
GROUP BY DEPTNO;



SELECT COUNT(COMM) AS 사원수
FROM EMP
WHERE DEPTNO = 10;


SELECT COUNT(COMM) AS 사원수
FROM EMP
WHERE DEPTNO IN(10);

SELECT *
FROM EMP;

SELECT COUNT(COMM) AS 사원수
FROM EMP
WHERE DEPTNO IN(10, 30);

--의미를 작성한다
--SQL연산자 없이 구현하시오




SELECT DEPTNO, MAX(SAL)
FROM EMP
WHERE DEPTNO IS NOT NULL
GROUP BY DEPTNO;


--승환
SELECT POSITION, ROUND(AVG(HEIGHT), 2) AS 평균키
FROM PLAYER
WHERE HEIGHT IS NOT NULL
AND POSITION IS NOT NULL
GROUP BY POSITION;


-- 기성
SELECT POSITION 포지션, ROUND(AVG(HEIGHT),2) 평균키
FROM PLAYER
GROUP BY POSITION;

SELECT COUNT(POSITION) DF선수수, COUNT(HEIGHT)
FROM PLAYER
WHERE POSITION = 'DF'
AND HEIGHT IS NOT NULL;





