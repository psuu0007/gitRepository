SELECT TO_CHAR(1230000) + 1
FROM DUAL;

SELECT 1230000 + 1
FROM DUAL;

SELECT '1230000' + 1
FROM DUAL;

SELECT '1230000A' || 1
FROM DUAL;


SELECT TO_CHAR(1230000.3230000, 'L999,999,999.9999999999999')
FROM DUAL;

SELECT TO_CHAR(1230000, 'L000,000,000')
FROM DUAL;

SELECT TO_CHAR(123.3230000, 'L0,000,000.00000000000')
FROM DUAL;

select hiredate, sal, 332  as "1~2년 결과", comm
from emp;

desc emp;

select  sal * 12 년봉, emp.*
from emp;

select *
from emp;


select ename, hiredate
from emp
where hiredate = 19801217;

select ename, hiredate
from emp
where hiredate = 80/12/17;

select ename, hiredate
from emp
where hiredate = '80/12/17';

select ename, hiredate
from emp
where hiredate = '19801217';

--자동 형변환

select ename, hiredate
from emp
where hiredate = to_date(19801217, 'yyyyMMDD');


select sysdate + 20180123
from dual;

select to_char(sysdate + '20180123', 'YYYY-MM-DD')
from dual;

select to_char(sysdate + 2018 / 01 / 23, 'YYYY-MM-DD')
from dual;

--2019/01/23
select floor(sysdate - to_date('2018/01/22', 'YYYY/MM/DD')) "현재년도-1년전 일수"
from dual;

select floor(sysdate - to_date('20180122', 'YYYY/MM/DD')) "현재년도-1년전 일수"
from dual;

select to_date('20190123', 'YYYYMMDD') "문자를날짜로 표현"
from dual;

--20190912
--'20190912'
--hirede varchar2(233) '2019-09-12'  
--hiredate date 19/09/12 시 분 초
--'2019/09/12'


select *
from emp;

select emp.*, floor((sysdate - HIREDATE) / 365)
from emp;

select sysdate - to_date('20180122', 'YYYYMMDD')
from dual;

select (sysdate - to_date('20180122', 'YYYYMMDD')) / 365
from dual;

select floor((sysdate - to_date('20180122', 'YYYYMMDD')) / 365)
from dual;

select floor((sysdate - to_date('20180124', 'YYYYMMDD')) / 365)
from dual;


select emp.*, FLOOR((sysdate - hiredate) - (365 * 38))
from emp
WHERE (sysdate - hiredate) <= 38 * 365;

select emp.*, floor((sysdate - HIREDATE) / 365)
from emp
WHERE (sysdate - hiredate) <= 38 * 365;



SELECT 38 * 365, sysdate - TO_DATE('19810124')
FROM DUAL;

insert into emp
values(8000, '박성욱', '강사', null, to_date('19810123', 'YYYYMMDD'), 100, NULL, 10);

insert into emp
values(9000, '박성욱2', '강사', null, to_date('19810124', 'YYYYMMDD'), 100, NULL, 10);

insert into emp
values(8888, '박성욱3', '강사', null, to_date('19810122', 'YYYYMMDD'), 100, NULL, 10);

ROLLBACK;

SELECT *
FROM EMP;



SELECT '20,000' - '10,000'
FROM DUAL;

SELECT TO_NUMBER('20,000', '99,999') 
    - TO_NUMBER('10,000', '99,999') AS "두 수를 뺀값"
FROM DUAL;

SELECT TO_NUMBER('20,000', '99,999') + 2000
FROM DUAL;

--20,000
--'20,000'

select '$20,000'
from dual;

SELECT trim(to_char(TO_NUMBER('20,000', '99,999'), 'L99,999'))
FROM DUAL;


SELECT trim(to_char(20000, 'L99,999'))
FROM DUAL;

SELECT trim('￦20,000')
FROM DUAL;



select *
from stadium;

select *
from team;


SELECT 700 대한민국, 1700 미국, 1200 AS 일본
FROM DUAL;

SELECT 1000000  AS 대한민국, (100 * 10.2878) AS 일본, TO_CHAR(ROUND(1000000 / 10.2878, 2), '9,999,990.00') 일본환율적용
FROM DUAL;

SELECT 10  AS 대한민국, (100 * 10.30) AS 일본
    , TO_CHAR(ROUND(10 / 10.30, 2), '9,999,990.00') 일본환율적용
FROM DUAL;

SELECT 1000  AS 대한민국, (100 * 10.30) AS 일본
    , 1000 / 10.2878 일본환율적용
FROM DUAL;

--1000 ?    X = 97.20
--1 * 1 = 10.29

SELECT *
FROM EMP;

SELECT DEPT.*, 23432432 * 232323
FROM DEPT;

SELECT ENAME, DEPTNO,
    CASE WHEN DEPTNO=10 THEN 'ACCOUNTING'
               WHEN DEPTNO=20 THEN 'RESEARCH'
               WHEN DEPTNO=30 THEN 'SALES'
               WHEN DEPTNO=40 THEN 'OPERATIONS'
    END AS 부서명
FROM EMP;

SELECT ENAME, DEPTNO,
    CASE 
               WHEN DEPTNO=20 THEN 'RESEARCH'
               
               ELSE 'ACCOUNTING'
    END AS DNAME
FROM EMP;


sELECT *
FROM EMP;

SELECT ENAME, SAL, 
    CASE 
        WHEN SAL >= 2000 THEN 1000
        WHEN SAL < 2000 THEN 2000
    END AS Incentive,
    CASE 
        WHEN SAL >= 2000 THEN SAL + 1000
        WHEN SAL < 2000 THEN SAL + 2000
    END AS "Incentive + 월급여"
FROM EMP;


SELECT *
FROM DEPT;


SELECT ENAME, SAL,
    CASE 
        WHEN SAL >= 2000 THEN 1000
        ELSE    (CASE   WHEN SAL >= 1000
                                    THEN    500
                                    ELSE 0
                       END
                    )
    END AS BONUS
FROM EMP;










