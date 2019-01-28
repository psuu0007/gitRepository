select e.ename, e.sal, s.grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal;

-- 급여 등급 테이블
select *
from salgrade;

select *
from emp e, salgrade s
where e.sal between s.losal and s.hisal;

SELECT *
FROM PLAYER;

SELECT *
FROM TEAM;

SELECT *
FROM STADIUM;

SELECT P.PLAYER_NAME 선수명, P.POSITION 포지션,
            T.REGION_NAME 연고지, T.TEAM_NAME 팀명,
            S.STADIUM_NAME 구장명
FROM PLAYER P INNER JOIN TEAM T
ON  P.TEAM_ID = T.TEAM_ID
        INNER JOIN STADIUM S
ON  T.STADIUM_ID = S.STADIUM_ID
ORDER BY 선수명;

select p.player_name            as 선수명
    , p.position                        as 포지션
    , t.region_name                   as 연고지
    , t.team_name                     as 팀명
    , s.stadium_name                as 구장명
from player p, team t, stadium s
where p.team_id = t.team_id
and p.team_id = s.hometeam_id
order by p.player_name asc;

SELECT *
FROM STADIUM;


SELECT ENAME, MGR
FROM EMP;


SELECT EMPLOYEE.ENAME || '의 매니저는 ' || MANAGER.ENAME || ' 입니다'
    , EMPLOYEE.EMPNO 나의사원번호, EMPLOYEE.ENAME 나의이름
    , EMPLOYEE.MGR 나의상사번호, MANAGER.ENAME 상사이름
FROM EMP EMPLOYEE, EMP MANAGER
WHERE EMPLOYEE.MGR = MANAGER.EMPNO;

SELECT *
FROM EMP;

--상사의 하위 직원의 정보를 출력하시오









