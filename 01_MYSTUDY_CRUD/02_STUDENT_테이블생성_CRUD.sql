/* STUDENT 테이블 생성
제약조건 없이 컬럼만 추가
*/
CREATE TABLE STUDENT (
    ID VARCHAR2(20),
    NAME VARCHAR2(30),
    KOR NUMBER(3),
    ENG NUMBER(3),
    MATH NUMBER(3),
    TOT NUMBER(3),
    AVG NUMBER(5,2)
);
----------------------------
-- CRUD : INSERT, SELECT, UPDATE, DELETE
SELECT * FROM STUDENT;
SELECT ID, NAME FROM STUDENT;

--데이타 추가(입력) : INSERT INTO 
INSERT INTO STUDENT 
       (ID, NAME, KOR, ENG, MATH)
VALUES ('1111', '홍길동', 100, 90, 80);
COMMIT; --작업결과 DB반영
ROLLBACK; -- 작업취소(INSERT,UPDATE,DELETE 작업)

INSERT INTO STUDENT (ID, NAME, KOR, ENG, MATH)
VALUES ('2222', '김유신', 90, 80, 70);
COMMIT;
----------------------
--수정 : 데이터 수정 - UPDATE
UPDATE STUDENT
SET ENG = 88, MATH = 77
WHERE NAME = '김유신';
COMMIT;

SELECT * FROM STUDENT WHERE NAME = '김유신';
SELECT * FROM STUDENT WHERE NAME = '홍길동';
--------------------------------
--데이타 삭제 : DELETE FROM
SELECT * FROM STUDENT WHERE ID = '2222';
DELETE FROM STUDENT WHERE ID = '2222';
DELETE FROM STUDENT WHERE NAME = '김유신';
SELECT * FROM STUDENT WHERE NAME = '김유신';
COMMIT;
-- =======================
INSERT INTO STUDENT (ID) VALUES ('3333');









