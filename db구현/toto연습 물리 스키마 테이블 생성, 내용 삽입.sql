--테이블명: dept 부서 테이블 
--
--컬러명: 부서명  층수  인원

--CREATE TABLE 테이블명(
--   컬럼명, data_type,
--   column_name2, data_type,
--   column_name3, data_type,
--   ....
--);

CREATE TABLE DEPT(
    DEPTNAME VARCHAR2(30), 
    FLOOR NUMBER,
    NUM_OF_PEOPLE NUMBER(30) 
);

--테이블에 새로운 행을 추가하는 insert문
--insert into 테이블명
--(컬럼명, 컬럼명2, ...)
--values
--(컬럼에 넣을 값, 컬럼에 넣을 값2, ...);

desc dept;

insert into dept
(deptname, floor, num_of_people)
values
('운영', 12, 16);

insert into dept
(deptname, floor, num_of_people)
values
('편입지원', 13, 5);

select *
from dept;



insert into dept
(deptname, floor, num_of_people)
values
('aaaaabbbbbcccccdddddeeeeefffff1', 13, 5);

insert into dept
(deptname, floor, num_of_people)
values
('가나다라마바사ㅁㅂㅈ1', 13, 5);

--select LENGTHB('ㅎ'), LENGTHB('a')
--from dual;


desc book;


insert into book
(title, writer, price)
values
('다이나믹 오라클 13g', '홍길동', 3500.9);


select *
from book;

--생성된 테이블을 지우는 명령어
--DROP TABLE 테이블명;
DROP TABLE BAN;

DROP TABLE BOOK;

DROP TABLE OFFICEDEPT;


--테이블명 SAM
--
--SAM_NAME 선생님 이름 30
--SEX             성별           10
--MEET_YEAR 만난지 몇 년    NUMBER 3자리
--
--테이블을 만드시오
--
--데이터는 자신의 경험으로 알아서 2사람 넣으시오
--
--조회

CREATE TABLE SAM(
    SAM_NAME       VARCHAR2(30),
    SEX                   VARCHAR2(10),
    MEET_YEAR        NUMBER(3)
);

--DROP TABLE SAM;

DESC SAM;

INSERT INTO SAM
(
    SAM_NAME, SEX, MEET_YEAR
)
VALUES(
    '강익태', '남', 7
);

INSERT INTO SAM
(
    SAM_NAME, SEX, MEET_YEAR
)
VALUES(
    '김에녹', '남', 7
);

SELECT  * 
FROM     SAM;

--테이블 식별자 명명규칙
--1. 반드시 문자로 시작해야 함
--2. 1~30자까지 가능함
--3. A~Z가지의 대소문자와 0~9까지의 숫자, 특수 기호는(_, $, #)만 포함 가능
--4. 오라클에서 사용되는 예약어나 다른 객체명과 중복 불가
--5. 공백 허용 안함



--사원(EMP) 테이블
--
--사원 번호 컬럼, 사원명 컬럼, 급여 컬럼
--
--사원번호: 4자리 숫자
--사원명: 20자리 문자열
--급여: 정수5자리 소수점2자리 까지 표현가능
--
--사원 테이블 생성
--
--사원 3명의 내용을 모두 입력한다
--
--사원 테이블을 조회하시오

--급여 16000.31

SELECT *
FROM SAM;



CREATE TABLE DEPT(
        DEPTNO  NUMBER(2)
    ,   DNAME    VARCHAR2(14)
    ,   LOC        VARCHAR2(13) 
);


DESC DEPT;

------ -- ------------ 
--DEPTNO    NUMBER(2)    
--DNAME     VARCHAR2(14) 
--LOC       VARCHAR2(13) 


DESC SAM;

--물리적인 설명     VS      논리적인 설명
--테이블명: DEPT                  부서
--컬럼명: DEPTNO                부서 번호
--DNAME                             부서명
--LOC                                  부서위치



DESC DEPT;

INSERT INTO dept
(
    DEPTNO,
    DNAME,
    LOC
)VALUES(
    10,
    'SALES',
    'SEOUL'
);

INSERT INTO dept
(
    DEPTNO,
    DNAME,
    LOC
)VALUES(
    20,
    'MARKETING',
    'BUSAN'
);

COMMIT;

SELECT *
FROM DEPT;























