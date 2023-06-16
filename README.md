# Spring_CRUD
2023.6.12-2023.6.16 스프링 CRUD 구현, 메모리 사용(DB X)

과제 주의사항
1. Entity를 그대로 반환하지 말고, DTO에 담아서 반환해주세요! - 구현 못함
2. JSON을 반환하는 API형태 - 완료
3. PostMan - 완료


서비스 완성 요구 사항
1번 Use Case (사용자가 로그인 없이 비밀번호만으로 게시글 수정 및 삭제 할 수 있는 사이트)

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
- 내림차순 - compare to 메소드 재정의에 대한 이해 필요
- 비밀번호 표시 여부 - json 방식으로 들어온 정보를, 메소드에서 처리해서 표현하는 방법 구현
- [완료] 삭제 후 성공표시하기 
- [완료] 매서드명 변경
  [완료] Date -> 직관적으로 creationTime으로 변경

지난 개인과제 피드백 후 고치려고 노력한 부분과 개선해야 할 부분
1. 시간을 충분히 두고, 최대한 구현하기 - 최선을 다해서 구현하려고 노력함. 그러나 아직 스프링 이해가 부족함
2. [완료] List 구체적 클래스 적기
3. 디버깅 사용함, 테스트 케이스X, Slf4jX
4. [완료] 메서드명 이해하기 쉽게 작성하기 -> 수정해야 함. 
5. [완료] readme.md 파일 최대한 자세히 작성하기 (어떤 방식이 좋은지 확인 필요)
6. [완료] 래퍼 클래스 사용

깃허브에 위에 사항을 남겨두고, 배울 때마다 계속 수정하면 완성해나가기 
