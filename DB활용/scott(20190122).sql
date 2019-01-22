select player_name, position, back_no, height
from player
where team_id in('K02', 'K07')
and position = 'MF';


select *
from emp;

select *
from emp
where rownum = 1;

select *
from emp
where empno = 7369;

select *
from emp
where rownum <= 10;

--24 *234324
--가상 테이블
select 24 * 60
from dual;

select sysdate
from dual;

--절대값
select -10, abs(-10)
from dual;

-- 소수점 아래를 버린다
select 34.5678, floor(34.5678)
from dual;

-- 특정 자리수에서 반올림한다
select 34.5678, round(34.5678)
from dual;

select 34.5678, round(34.5678, 2)
from dual;

select 34.5678, round(34.5678, -1)
from dual;

-- 특정 자리수에서 잘라내는 함수
select trunc(34.5678, 2), trunc(34.5678, -1), trunc(34.5678, 0)
from dual;

select mod(27, 2), mod(27, 5)
from dual;


select *
from emp
where mod(empno, 2) = 1;

-- 문자형 데이터의 길이를 구한다
select length('SQL Expert')
from dual;

-- 문자 더하기
select concat(1, ' 축구') as 스포츠
from dual;


select ddd, tel, ddd || tel, length(tel)
from stadium;


select stadium_id, DDD || tel, length(ddd || tel) as "t_len"
from stadium;


select stadium_id, DDD || tel, length(ddd) + length(tel) as "t_len"
from stadium;

-- 올림처리한다
select ename, CEIL(sal / 12) 
from emp;

------------------------------------------------------
select LOWER('SQL Expert')
from dual;

select upper('SQL Expert')
from dual;

select substr('SQL Expert', 1, length('SQL Expert'))  -- 1. 글자들  2. 시작의 위치(인덱스), 3. 몇 글자 가져올래
from dual;

select ltrim('xxxYYZZxYZ', 'x')
from dual;

select rtrim('xxxYYZZxYZ', 'x')
from dual;

select trim(' ' from ' xxxYYZZxYZxx1x')
from dual;

select rtrim('xxxYYZZxYZ  ')
from dual;

select empno, ename, job
from emp
where 'manager' = lower(job);

select *
from emp;

select empno, ename, lower(job)
from emp
where lower(job) = 'manager';

--가독성
--일관성

-- 글자의 개수를 구한다
SELECT length('Oracle'), length('오라클')
FROM dual;

-- 메모리에서 차지하는 바이트 수를 구한다
SELECT lengthb('Oracle'), lengthb('오라클')
FROM dual;



select *
from emp;

select substr('Welcome to Oracle', -4, 3)
from dual;

select substr('Welcome to Oracle', 14, 3)
from dual;


select substr('웰컴투오라클', 3, 4), substrb('웰컴투오라클', 1, LENGTH('웰컴투오라클')*3)
from dual;

-- 특정 문자의 위치를 구하는 함수
select instr('Welcome to Oracle', 'O')
from dual;

select instr('WELCOME TO ORACLE', 'O')
from dual;

-- INSTR(대상, 찾을 글자, 시작 위치, 몇 번째 발견)
select instr('WELCOME TO ORACLE', 'O', 6, 2)
from dual;



SELECT EMPNO, ENAME
FROM EMP
WHERE ENAME LIKE '__R%';

-- 특정 문자를 채워주는 함수
--lpad(대상, 채워넣을 갯수, 채워넣을 기호)
SELECT LPAD('Oracle', 20, '#')
FROM DUAL;

SELECT RPAD('Oracle', 7, '1')
FROM DUAL;

SELECT RPAD('한', 7, '#')
FROM DUAL;

select trim('        Oracle               ')
from dual;

select ename
from emp
where ' oracle ' = ' oracle ';

select empno
from emp
where trim(' oracle ')  = ' oracle ';

select ename
from emp
where 'oracle' = ' oracle ';

select length('oracle'), length(' oracle ')
from dual;



select *
from emp;


select *
from player;

select rpad(nickname, length(nickname)*2+2, '!')
from player;


select nickname, length(nickname)
from player;


select sysdate
from dual;

--날짜 연산
select sysdate + 1
from dual;

select sysdate - 1
from dual;


select sysdate - 1 as 어제, sysdate as 오늘, sysdate + 1 as 내일
from dual;


select ename, sysdate - hiredate as "입사후 근무일수"
from emp;


select sysdate, sysdate + (2 * 365)
from dual;

--날짜 + 숫자/24
select sysdate + 48/24
from dual;

-- EXTRACT(YEAR | MONTH | DAY FROM DATE) 
-- 날짜 데이터에서 년 | 월 | 일 데이터를 출력할 수 있다
-- 시분초도 가능
select ename, hiredate
, EXTRACT(YEAR FROM HIREDATE) AS 입사년도
, EXTRACT(MONTH FROM HIREDATE) AS 입사월
, EXTRACT(DAY FROM HIREDATE) AS 입사일
from emp;


SELECT SYSDATE + 1
FROM DUAL;

SELECT  ADD_MONTHS(SYSDATE, 1)  개월수를더하는함수
FROM DUAL;

SELECT  ADD_MONTHS(SYSDATE, 4)  개월수를더하는함수
FROM DUAL;

SELECT ENAME, HIREDATE, ADD_MONTHS(HIREDATE, 6)
FROM EMP;

--해당 요일의 가장 가까운 날짜를 반환하는 함수
SELECT SYSDATE, NEXT_DAY(SYSDATE, 'WEDESDAY')
FROM DUAL;

SELECT SYSDATE, NEXT_DAY(SYSDATE, '화요일')
FROM DUAL;

--ALTER SESSION SET NLS_LANGUAGE=KOREAN;


--해당 달의 마지막 날짜를 반환하는 LAST_DAY 함수
SELECT SYSDATE, LAST_DAY(SYSDATE+10)
FROM DUAL;


SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD')
FROM DUAL;

-- 년도 뒤에 2/월2자리/일2자리 DATE


SELECT EMPNO, ENAME, HIREDATE, TO_CHAR(HIREDATE, 'YYYY-MM-DD') AS 입사년도
FROM EMP;

SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY:MM:DD')
FROM DUAL;


SELECT SYSDATE, TO_CHAR(SYSDATE, 'YY-MON-DD DAY')
FROM DUAL;

SELECT SYSDATE, TO_CHAR(SYSDATE, 'YY-MON-DD DY') || '요일'
FROM DUAL;


SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD, HH24 : MI : SS')
FROM DUAL;


SELECT TO_CHAR(SYSDATE, 'AM  HH : MI : SS'), TO_CHAR(SYSDATE, ' HH24 - MI ~ SS')
FROM DUAL;



SELECT SYSDATE, TO_CHAR(SYSDATE + 1/24, 'YYYY-MM-DD HH : MI : SS')
FROM DUAL;



