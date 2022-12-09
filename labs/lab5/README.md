# CMPE 172 - Lab #5 Building REST services with Spring
#### <ins>1. Building NON-REST services with Spring</ins>

**1. Description**: NON-REST This assignment will be about building the simple payroll service to management compnay payroll for employee. I'm going to use the H2 Database and access via JPA. This app will be the application of MVC layers. 
**1.3. Screenshot: **:

Successfully build Spring REST application locally
![Screen Shot 2022-10-22 at 11 28 06 PM](https://user-images.githubusercontent.com/48584294/197377523-a4508ea7-4530-4bc6-aef6-7f890822863f.png)

send GET employee 99
![Screen Shot 2022-10-22 at 11 34 32 PM](https://user-images.githubusercontent.com/48584294/197377766-71235d61-c124-4973-b3fb-2faf777efcd6.png)

POSTMAN
<img width="1274" alt="Screen Shot 2022-10-22 at 11 38 04 PM" src="https://user-images.githubusercontent.com/48584294/197377922-06e57576-8e92-4e48-b5ae-2247a8384731.png">

POSTMAN
<img width="1276" alt="Screen Shot 2022-10-22 at 11 39 01 PM" src="https://user-images.githubusercontent.com/48584294/197377947-8d59351d-bc39-4f49-b0c9-a01388a5d103.png">
[GET] send GET employee 3
![Screen Shot 2022-10-22 at 11 39 42 PM](https://user-images.githubusercontent.com/48584294/197377973-e9c739d3-eb89-4d5a-bdfb-2e0f2b35ce4a.png)

[GET] send GET employee 1
<img width="1169" alt="Screen Shot 2022-10-22 at 11 52 09 PM" src="https://user-images.githubusercontent.com/48584294/197378413-cbd7a0bc-c1b6-493c-8def-a52aed5cec10.png">

[POST] send POST request to add 1 entry
<img width="1088" alt="Screen Shot 2022-10-23 at 1 11 05 AM" src="https://user-images.githubusercontent.com/48584294/197381567-1f049af1-cf72-49be-a7ca-bf15c3a71657.png">


[DELETE] send DELETE employee 1
--- BEFORE DELETE
<img width="1087" alt="Screen Shot 2022-10-23 at 11 45 58 PM" src="https://user-images.githubusercontent.com/48584294/197463993-c548fced-9f6e-487f-a8e8-d51bf3eea84d.png">
--- DELETE
<img width="1085" alt="Screen Shot 2022-10-23 at 11 48 47 PM" src="https://user-images.githubusercontent.com/48584294/197464382-53d82730-9050-4430-ab1b-4985973d68dd.png">
--- AFTER DELETE
<img width="1079" alt="Screen Shot 2022-10-23 at 11 49 39 PM" src="https://user-images.githubusercontent.com/48584294/197464535-982b9c75-2d6b-4203-a249-8e6ce50ed000.png">



[PUT] send PUT request to update entry id 13 role: "student" to role: "student-CMPE 172"
<img width="1087" alt="Screen Shot 2022-10-23 at 1 14 18 AM" src="https://user-images.githubusercontent.com/48584294/197381734-411a3464-7046-4921-af53-ac2f4cb39dee.png">

#### <ins>1. Building REST services with Spring</ins>

**2. Description**: REST This assignment will be about building the simple payroll service to management compnay payroll for employee. I'm going to use the H2 Database and access via JPA. This app will be the application of
**1.3. Screenshot**:

TEST Local deployment using curl command on terminal
![Screen Shot 2022-10-24 at 12 21 27 AM](https://user-images.githubusercontent.com/48584294/197469728-3aa47eb6-1a60-44de-a65e-e0223c5a09ac.png)

TEST Spring Boot REST Success local build
![Screen Shot 2022-10-24 at 12 47 24 AM](https://user-images.githubusercontent.com/48584294/197474332-4b5dc197-9170-4458-96da-9d3b36016565.png)

[GET] Send GET request to get information from orders using POSTMAN
<img width="547" alt="Screen Shot 2022-10-24 at 12 56 51 AM" src="https://user-images.githubusercontent.com/48584294/197476083-1062a4e3-a400-4a94-abeb-c321ed5d21e4.png">


[DELETE] Send DELETE request to remove object has id 4 information from orders using POSTMAN
<img width="1090" alt="Screen Shot 2022-10-24 at 12 57 47 AM" src="https://user-images.githubusercontent.com/48584294/197476276-d218c44f-dd70-40a3-b6dc-2ae136edf781.png">

[POST] Added new employees called Lam Nguyen id 5
<img width="1086" alt="Screen Shot 2022-10-24 at 1 07 19 AM" src="https://user-images.githubusercontent.com/48584294/197478077-49cf84ad-b0cc-48e7-ba5c-78b46cd0ad18.png">

-- AFTER Added new employee
<img width="1087" alt="Screen Shot 2022-10-24 at 1 07 54 AM" src="https://user-images.githubusercontent.com/48584294/197478180-68a2d8b1-99aa-4da1-85f8-bd97b9eff112.png">

[PUT] Update employee id 1 information 
![Screen Shot 2022-10-24 at 4 33 58 PM](https://user-images.githubusercontent.com/48584294/197649530-5d6fe968-f944-4cc8-af76-05caccf1a642.png)
-- AFTER update information\
![Screen Shot 2022-10-24 at 4 34 35 PM](https://user-images.githubusercontent.com/48584294/197649584-c668d171-fbdd-4e7c-8faa-2d33c577f5a2.png)




















