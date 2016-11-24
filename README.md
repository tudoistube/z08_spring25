#Spring and React Web Application Part5
#Source Document : [React.js and Spring Data REST :: Part 5 - Securing the UI and the API ](https://spring.io/guides/tutorials/react-and-spring-data-rest/ "Example Sources by tudoistube@gmail" )  
##Reference Document : Self Summary on [React.js and Spring Data REST :: Part 5 - Securing the UI and the API ](https://drive.google.com/open?id=1gZ0V8kqUy3ovYW8dx-2-uph2Zi7mYbl0KDQj5FaFoG4 "Example Sources by tudoistube@gmail" )  
* spring-boot-starter-security, thymeleaf-extras-springsecurity4 �������� ������.  
* AccessManager �� �ۼ��ؼ� role �� �����ϰ� password �� �巯���� �ʰ� �ϰ� AccessManagerRepository �� ������.
* Employee DTO Ŭ������ AccessManager �� n : 1 �� �ǵ��� ������ �߰��ϰ�, ������ �ִ� role  manager �� EmployeeRepository �� �̿��Ͽ� �����͸� �����ϰ� ��.  
* UserDetailService �� AuthorityUtils �� ����Ͽ� ��Ʈ�� ����� role �� Java ��  List ������ GrantedAuthority �� ��ȯ��.  
* SecurityConfiguration �� ���� ��Ģ�� ������.  
* SpringDataRestEventHandler �� Employee DTO �� Ư���ؼ� DB �� ����Ǳ� ����  �ش� �����͸� ã�Ƽ� manager �� ������.  
* DatabaseLoader ���� Employee �����Ϳ� AccessManager �� �Ҵ��ϰ� �����͸� ������.  
* app.js �� JSON Schema ���� manager �� ������ �� ���� ��.  
    
å ���鼭 �ǽ��� �ҽ���.  
�����ϸ鼭 �ø��� ���̾ Ʋ�� �κ��� �������� ����(�˷��ֽø� �ݿ��ϰ���)  
��Ȯ�� ������ ���� ������ ��ũ�� �����Ͻñ� �ٶ�.  

---
React.js �� Java Spring �� ����ؼ� ���� �������� ���鿡 ������ �� �� �ִ� ����
�Բ� ����� ���� ã��.

I hope to make something good to make our society better.  
If you are interested in my idea, please send your mail to me.  
e-mail : tudoistube@gmail.com
---