# nemo_spring
MVC로 구현된 project NEMO(ver 1.0)를 발전시킨(ver 2.0) 프로젝트 입니다.
- 바뀐점 : Spring 적용, MyBatis 사용, MySQL사용, 컬럼구조 개편
- ( [NEMO ver1.0](https://github.com/gmAnn00/nemo) : MVC로 구현, Oracle 사용  )



## 프로젝트 NEMO 소개
위치기반 관심사 · 취미 활동 공유 소모임 서비스입니다.

사용자들은 본인이 살고있는 동네와 내가 등록한 취미를 기반으로
온라인에서 같이 취미를 나누는 소모임을 개설하고 가입할 수 있습니다.

취미, 거리 등 조건에 따라 소모임을 추천받을 수 있고, 
소모임에 가입하여 모임일정을 등록하고 참석을 신청하고, 글과 댓글을 써서 다른 사용자와 소통할수 있습니다.

그리고 불량 소모임과 회원을 신고할 수 있고, 사이트 관리자에게 질문과 개선의견을 제시할 수 있습니다.



## 프로젝트 흐름도( Spring으로 이미지 업데이트 예정 )
![image](https://github.com/gmAnn00/nemo_spring/assets/117967689/f1d3a132-55eb-4880-ab9a-48b64e827313)



## 멤버구성
 - 팀장(GOD) : 카카오 소셜 로그인, 엠버 조회, 소모임 신고, 멤버 신고, 팀원들 도움 
 - 팀원 : 회원가입, 로그인/로그아웃, 소모임 소개, 소모임 생성
 - 팀원 : 메인페이지, 소모임 검색, 소모임 메인, 소모임 가입/탈퇴, 소모임 찜
 - 팀원 : 마이페이지(내정보 조회/수정, 회원 탈퇴, 만든/가입한/찜한 소모임 조회/탈퇴, 가입대기 취소, 내 일정 조회, 작성글/댓글 조회/삭제)
 - 팀원 : 소모임장 기능(가입 승인, 소모임 정보 수정, 멤버 추방, 소모임 삭제, 모임장 변경), 괸리자 기능(회원 조회/삭제, 소모임 조회/삭제)
 - 팀원 : 소모임 일정 조회/생성/수정/삭제, Q&A게시판(사용자-조회/등록/수정/삭제, 답변 조회, 관리자-답변 등록/삭제)
 - 팀원 : 소모임 게시글 목록 조회/상세조회/작성/수정/삭제, 댓글 작성/수정/삭제



## 개발환경
- FrontEnd : HTML, CSS, JS, jQuery, AJAX, JSP
- BackEnd : Java 11, JDK 11.0.17
- API & Library : kakaomap Local&map, Summernote, DataTables, unirest , jacson
- Framework: Spring
- Database: MySQL 8
- ORM: MyBatis
- Server : Apache Tomcat 9.0
- IDE : STS 3.0
- SCM : GitHub, SourceTree
- Design Tools : StarUML, Figma, Photoshop, ERDCloud
- OS : Window 10, macOS Sonoma



## 핵심 기술 및 주요 기능
- AJAX, GPS, kakaomap & Local, Zipcode API, Calendar, Editor Summernote, Query, Paging

#### 로그인
#### 회원가입
#### 관심사 선택
#### 메인페이지
#### 검색페이지
#### 마이페이지
#### 소모임 일정
#### 소모임 게시판
#### 소모임 관리
#### Q&A 게시판
#### 관리자
