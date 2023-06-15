# Spring_CRUD
2023.6.12-2023.6.16 스프링 CRUD 구현, 메모리 사용(DB X)

과제 주의사항
1. Entity를 그대로 반환하지 말고, DTO에 담아서 반환해주세요! - 해결 못함
2. JSON을 반환하는 API형태 - 완료
3. PostMan - 완료


서비스 완성 요구 사항
1번 Use Case

![use case](https://github.com/seed0335/Spring_CRUD/assets/127582298/6018f17e-aa73-4d59-9879-4082b2b02f54)

2번 전체 게시글 목록 조회 API
- 제목, 작성자명, 작성 내용, 작성 날짜 조회 가능, 비밀번호는 표시X 구현해야 함
- 작성 날짜 기준 내림차순 구현x

![image](https://github.com/seed0335/Spring_CRUD/assets/127582298/bc03cb1d-9deb-496b-b9fd-9223fd5a96f7)

3번 게시글 작성 API 

![image](https://github.com/seed0335/Spring_CRUD/assets/127582298/4ab10595-c302-4147-9679-c6bb1c20bf2c)

4번 선택한 게시글 조회 API
- 비밀번호는 표시X 구현해야 함
![image](https://github.com/seed0335/Spring_CRUD/assets/127582298/316c26f2-5312-48dc-9fce-821cc86ec9b1)

5번 선택한 게시글 수정 API -구현o

![image](https://github.com/seed0335/Spring_CRUD/assets/127582298/6a534771-58f8-4e5a-b69c-b65cae6c5a2c)

6번 선택한 게시글 삭제 API 
- 성공 메시지 표시 반환X 

![image](https://github.com/seed0335/Spring_CRUD/assets/127582298/c2e917b4-72c4-4157-b425-ce3b9751953a).

API 명세서 
![image](https://github.com/seed0335/Spring_CRUD/assets/127582298/e9e79a0b-a87e-4a7e-a844-4c511cb24578)



문제점 및 공부할 부분
- Entity를 그대로 반환하지 말고, DTO에 담아서 반환해주세요!(1주차 강의만 들었고, entity 이해를 못함)
- 느슨한 결합X
- DB 활용X : DB, JPA 이해X

수정해야 할 사항
- 내림차순
- 비밀번호 표시 여부
- 삭제 후 성공표시하기 

