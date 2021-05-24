Environment
---
- Ubuntu 20.04 LTS
- Eclipse 4.19.0 + STS 4.10.0.RELEASE
- Spring Boot + Maven
- H2


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
- Lombok 설치
	- eclipse에 연동
- Spring Boot + H2 연결
	- SpringBootApplication Run 할 때, H2가 작동하지 않음
	
	
---


기능
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



DataBase
---
- category
	- category_id : pk
	- name
- item
	- item_id : pk
	- category_id : fk
	- name
	- stock
- order
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


주문
---
- contactInfo
	- contactEmail : "test@test.com   "
	- contactName : "   구매자   "
	- mobile : "01099999999    "
	- 위의 세 항목은 좌우 공백을 Trim 해야함
- items
	- itemType : "food" or "clothes"
		- food와 clothes 이외에 다른 카테고리 추가 가능
	- id : 1


---

















---


Note & Study
---
- MSA
	- https://wooaoe.tistory.com/57
- MVP : 최소 기능 제품
	- https://ko.wikipedia.org/wiki/%EC%B5%9C%EC%86%8C_%EA%B8%B0%EB%8A%A5_%EC%A0%9C%ED%92%88
- 내부 DB
	- https://juyeop.tistory.com/30
- H2
	- https://ixtears23.github.io/H2-Database/
	- https://developerhive.tistory.com/34
	- 연결 안됨
		- https://jamie95.tistory.com/171
- Spring Boot
- Thymeleaf
	- https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html		
		
		
- 교차 출처 리소스 공유 (CORS) 설정
- CI / CD
	- https://www.redhat.com/ko/topics/devops/what-is-ci-cd
- PostMan Test Tool





