Environment
---
- Ubuntu 20.04 LTS
- Eclipse 4.19.0 + STS 4.10.0.RELEASE
- Spring Boot + Maven
- H2 Database


---


7 Days
---
- 23 ~ 24 : 개발환경 설정, 뷰/서버/DB 설계, 뷰 완성, 모르는 것들 공부
- 25 ~ 26 : back-end 구축
- 27 : test
- 28 ~ 29 : 보수 및 test
- 30 : 최종 점검 및 제출


Initial Settings
---
- Spring Boot Project 생성
	- spring initializr 사용
	- Dependencies
		- Spring Web
		- H2 Database
		- Thymeleaf
		- Lombok
	
	
---


기능 설계
---
- Admin
	- Category
		- List
		- Regist
			- Name
		- Delete
	- Item
		- List
		- Regist
			- Category Select
			- Name
			- Stock
		- Delete
- Order
	- Item List
	- Ordering
		- Input user info


DataBase 설계
---
- category
	- category_id : pk
	- name
- item
	- item_id : pk
	- category_id : fk
	- name
	- stock
- orders
	- order_id : pk
	- item_id : fk
	- email
	- name
	- mobile
- restock
	- restock_id : pk
	- item_id : fk
	- encrypt_name
	- amount


---


Domain
---
- Category
- Item
- Order
- Restock


---











---


Trouble Shooting
---
- H2 Database Connect
	- Error: Database "mem:testdb" not found, either pre-create it or allow remote database creation (not recommended in secure environments) [90149-200]
	- 원인 : 최근 버전의 경우, 보안상의 이유로 Web Console에서 새 database를 작성할 수 없음
	- H2 프로그램을 별도로 설치하고 database를 직접 생성하기로 함
	- 생성한 후, Web Console로 접속하면 Server mode로 connect 가능
	- H2 Embedded mode는 여전히 불가능하며, 시간 관계상 H2 Server mode로 진행


---


Note & Study
---
- MSA (MicroService Architecture)
	- http://clipsoft.co.kr/wp/blog/%EB%A7%88%EC%9D%B4%ED%81%AC%EB%A1%9C%EC%84%9C%EB%B9%84%EC%8A%A4-%EC%95%84%ED%82%A4%ED%85%8D%EC%B2%98msa-%EA%B0%9C%EB%85%90/
- MVP : 최소 기능 제품
	- https://ko.wikipedia.org/wiki/%EC%B5%9C%EC%86%8C_%EA%B8%B0%EB%8A%A5_%EC%A0%9C%ED%92%88
- 내부 DB
	- https://ko.wikipedia.org/wiki/%EC%9D%B8%EB%A9%94%EB%AA%A8%EB%A6%AC_%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4
- H2
	- Wiki
		- https://ko.wikipedia.org/wiki/H2_(DBMS)
	- Video
		- https://www.youtube.com/watch?v=YywLS8XdxLQ
	- How to
		- https://sosohanya.tistory.com/27
		- https://dev-woo.tistory.com/45
	- Initializing Database
		- https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/htmlsingle/#howto-initialize-a-database-using-spring-jdbc
- Thymeleaf
	- https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html		
- 교차 출처 리소스 공유 (CORS) 설정
- CI / CD
	- https://www.redhat.com/ko/topics/devops/what-is-ci-cd
- PostMan Test Tool





