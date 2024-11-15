# scheduleJPA

# [Spring 7기] CH_3 일정 관리 앱 만들기 Develop

### API 명세서
---
> 일정 관리 앱  API 설계

| 기능 | Method | URL | request | response | 상태코드 |
|:-------:|:-----:|----|-----|------|------|
|전체 유저 조회|GET   |./schedule           |요청 body          |다건 응답 정보|200 정상조회    |
|유저 단건 조회|GET   |./schedule/{id}        |요청 param         |단건 응답 정보|200 정상조회 / 400 Bad Request("없는 일정입니다." |
|유저 등록    |POST  |./schedule           |요청 body          |등록 정보    |200 정상등록   |
|일정 삭제    |DELETE|./schedule{id}       |요청 param 요청 body|수정 정보    |200 정상삭제 / 404 Not Fount   |
|일정 수정    |PUT   |./schedule{id}       |요청 param         |삭제 정보    |200 정상수정/등록|
   
###  ERD
---
![image](https://github.com/user-attachments/assets/824a566f-ada6-485c-ad3d-beba8959d41f)

[https://www.erdcloud.com/d/zfwmJFNWTwWzABwfz](https://www.erdcloud.com/d/aFAYEQycCM2vAKbkf)
