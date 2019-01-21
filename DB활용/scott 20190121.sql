select *
from emp;

select job
from emp;

select ename
from emp;

select distinct job 
from emp;

select distinct ename, job 
from emp;


--선수들의 정보를 모두 조회하시오
select *
from player;

select empno as 사원번호, ename as 사원이름, mgr "사원의 직속상사번호", deptno 부서번호
from emp;

select deptno 부서번호, dname "name", loc "Location", deptno as "부서Number"
from dept;


select ename, sal, (sal+12)*1000
from emp;

select ename, sal, sal/12, round(sal/12, 2)
from emp;



select *
from player
where player_name = '정경량';


select player_name, height, weight, height-weight "키-몸무게"
from player;



select *
from emp;


select empno || '사원번호는 ' || ename || '님이며 직업은 ' || job || '입니다' "자기 소개", 
empno || ename, '컬럼에 없는 글자만으로도 ' || '만들수 있어'
from emp;



insert into player
(PLAYER_ID, TEAM_ID, PLAYER_NAME, POSITION, HEIGHT, WEIGHT, BACK_NO)
VALUES('1997035', 'K02', '이운재', 'GK', 182, 82, 1);

COMMIT;

DELETE FROM PLAYER
WHERE PLAYER_ID = '1997035';


SELECT *
FROM PLAYER;

SELECT COUNT(*)
FROM PLAYER
WHERE WEIGHT = 70;


SELECT *
FROM EMP;

SELECT COUNT(*)
FROM EMP
WHERE JOB = 'CLERK';

SELECT *
FROM EMP;

SELECT *
FROM EMP
WHERE SAL >= 3000;


SELECT *
FROM EMP
WHERE DEPTNO = 10;

-- 사원 테이블에서 이름이 FORD인 사원의 
-- 사원번호, 사원명, 급여 컬럼을 표시하시오
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE ENAME = 'FORD';

--SELECT EMPNO, ENAME, SAL
--FROM EMP
--WHERE ENAME = FORD;

SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE ENAME = 'FORd';

-- 1982년 1월 1일 이전에 입사한 사원을 출력한다
select *
from emp
WHERE HIREDATE <= '1981/04/02';


DESC EMP;

SELECT *
FROM EMP;

select *
from emp
where COMM IN(300, 500, 1400);

select *
from emp
where COMM IN(300, 500);

select *
from emp
where JOB IN('SALESMAN', 'ANALYST');
--또는


SELECT *
FROM EMP;

SELECT *
FROM EMP
WHERE DEPTNO NOT IN(20);


SELECT *
FROM EMP
WHERE ENAME LIKE 'M%';

--성이 김인 사람을 찾거나 거주지가 서울인 사람을 찾을 때 사용가능


SELECT *
FROM EMP
WHERE ENAME LIKE '%A%';


SELECT *
FROM EMP;

SELECT *
FROM EMP
WHERE ENAME LIKE '_L%';

SELECT *
FROM EMP
WHERE ENAME LIKE '_L___';

SELECT *
FROM EMP
WHERE SAL BETWEEN 2000 AND 3000;


SELECT *
FROM EMP
WHERE COMM BETWEEN 300 AND 1000;

SELECT *
FROM EMP
WHERE HIREDATE BETWEEN '1980/01/01' AND '1980/12/31';

SELECT *
FROM EMP
WHERE HIREDATE BETWEEN '80/01/01' AND '80/12/31';

SELECT *
FROM EMP;

SELECT *
FROM EMP
WHERE COMM = NULL;

-- 사원 테이블에서 커미션 컬럼이 NULL인 사원을 출력하시오
-- 커미션을 받지 못하는 사원을 검색하시오
SELECT *
FROM EMP
WHERE COMM IS NULL;

-- 커미션을 받는 사원을 검색하시오
SELECT *
FROM EMP
WHERE COMM IS NOT NULL;


SELECT ENAME, SAL, SAL*12, SAL*NULL, SAL+NULL
FROM EMP
WHERE COMM IS NULL;

SELECT *
FROM EMP;


SELECT *
FROM EMP
WHERE DEPTNO = 30
AND JOB = 'SALESMAN'
AND SAL >= 1500;

--1번 조건: 10번 부서 소속인 사원
--2번 조건: 직급이 MANAGER인 사원
--그리고


SELECT *
FROM PLAYER
WHERE (TEAM_ID = 'K02' OR TEAM_ID = 'K07')
AND POSITION = 'MF'
AND HEIGHT >= 170 AND HEIGHT <= 180;

SELECT *
FROM TEAM;


SELECT COUNT(*)
FROM PLAYER
WHERE TEAM_ID = 'K02';

--17+16 = 33
--17+49 = 66
SELECT COUNT(*)
FROM PLAYER
WHERE TEAM_ID = 'K07'
AND POSITION = 'MF'
AND HEIGHT >= 170 AND HEIGHT <= 180;



SELECT *
FROM PLAYER
WHERE TEAM_ID IN ('K02', 'K07')
AND POSITION = 'MF'
AND HEIGHT BETWEEN 170 AND 180;

SELECT *
FROM EMP;

-- 사원 테이블에서 부서번호가 10이거나 
-- 직급이 MANAGER인 사원을 출력하시오
SELECT *
FROM EMP
WHERE DEPTNO = 10
OR JOB  = 'MANAGER';

SELECT *
FROM EMP
WHERE DEPTNO = 10;

-- 부서번호가 10번이 아닌 사원들을 검색하시오
SELECT *
FROM EMP
WHERE NOT DEPTNO = 10;

SELECT *
FROM EMP
WHERE DEPTNO != 10;

SELECT *
FROM EMP
WHERE DEPTNO <> 10;

SELECT *
FROM EMP
WHERE DEPTNO IN(10, 20);

SELECT *
FROM EMP
WHERE DEPTNO = 10
OR DEPTNO = 20;


SELECT *
FROM EMP
WHERE (SAL < 2000 
OR SAL > 3000);


SELECT *
FROM EMP
WHERE NOT SAL BETWEEN 100 AND 1000;

SELECT *
FROM EMP
WHERE SAL BETWEEN 100 AND 1000;

SELECT *
FROM EMP
WHERE SAL >= 100 
AND SAL <= 1000;



SELECT PLAYER_NAME, NATION
FROM PLAYER
WHERE NATION IS NOT NULL;

SELECT PLAYER_NAME, NATION
FROM PLAYER
WHERE NOT NATION IS NULL;



