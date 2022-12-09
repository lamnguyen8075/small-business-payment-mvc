# CMPE 172 - Lab #4 Notes

#### <ins>1. Securing a Web Application</ins>


**1.1 Description**: This project will give hands-on experiences to build a web application with Spring Security. At the intial steps, student will create the Spring Initalizer with dependencies including Spring Web, Spring Security and Thymeleaf
**1.2. Steps**:


**1.3. Screenshot**:

&nbsp;&nbsp;1.3.1. Browser
Spring Security is working locally
![Screen Shot 2022-10-17 at 4 48 34 PM](https://user-images.githubusercontent.com/48584294/196304029-5e1706d1-edd9-4d84-bcb3-8aa0c895950c.png)
![Screen Shot 2022-10-17 at 4 49 10 PM](https://user-images.githubusercontent.com/48584294/196304090-46a49c72-5ae8-4ad1-b3dc-5c48b8955188.png)


Successfully open localhost:8080/hello after login -- Status code: 200
![Screen Shot 2022-10-17 at 4 58 35 PM](https://user-images.githubusercontent.com/48584294/196305024-aaf09d2d-bb6c-416e-8894-6404255ee529.png)
Failed to open localhost:8080/hello before login -- Status code: 302
![Screen Shot 2022-10-17 at 4 59 10 PM](https://user-images.githubusercontent.com/48584294/196305085-3020b383-0677-4f34-9f62-a5d12f12669b.png)

&nbsp;&nbsp;1.3.2. Fullscreen

#### <ins>2. Spring Gumball (Version 2)</ins>


**1.1 Description**: In this project, student will create the spring-gumball-version 2 with the hashing function to hash the request from the browser, the hashing string will include the state and the timestamp. With that mechanism, the attacker cannot modify the state in order to earn the benefit from the error. Student will use the Tamper Dev to testing the Replay Attack to see the response before and after implementing the hasing. 

**1.2. Screenshot**:

&nbsp;&nbsp;1.3.1. Browser
Successfully implement hashing message and deployed locally
<img width="1680" alt="Screen Shot 2022-10-17 at 10 15 40 PM" src="https://user-images.githubusercontent.com/48584294/196341343-be12ca68-b3c2-4766-a6ee-dc87480c67e2.png">


I already deleted Spring Gumball Version 1 to avoid conflict on local docker and docker hub


Build and deploy Spring Gumball Version 2 on Docker locally to test before push to Docker Hub
<img width="1916" alt="Screen Shot 2022-10-17 at 5 22 26 PM" src="https://user-images.githubusercontent.com/48584294/196307202-4fa56fbe-e26e-4746-b206-dd6e0d4d89e4.png">

One docker image is running
<img width="1680" alt="Screen Shot 2022-10-17 at 10 30 33 PM" src="https://user-images.githubusercontent.com/48584294/196343463-52de1bb1-8750-439c-8ccc-b5be9105aaee.png">

Successfully pushed to Docker Hub and deployed 4 pods
<img width="1680" alt="Screen Shot 2022-10-17 at 10 42 27 PM" src="https://user-images.githubusercontent.com/48584294/196345169-2b141256-4ede-48f4-a4f1-4aa3280e7d60.png">


DEPLOYMENT DETAILS
-- Deployment Details (at least 4 Pods)
<img width="1033" alt="Screen Shot 2022-10-17 at 7 34 14 PM" src="https://user-images.githubusercontent.com/48584294/196322116-604e11cc-4664-479a-bc32-af0c14df07f0.png">

-- Service Details
<img width="1034" alt="Screen Shot 2022-10-17 at 7 34 40 PM" src="https://user-images.githubusercontent.com/48584294/196322176-9e67ee95-8b2a-4cbd-bb82-4d1931dba994.png">

-- Ingress Details
<img width="1034" alt="Screen Shot 2022-10-17 at 7 35 38 PM" src="https://user-images.githubusercontent.com/48584294/196322289-a378a4a6-ec70-48e3-8880-948f871399ad.png">

Access the Docker deployment using IP address
<img width="1513" alt="Screen Shot 2022-10-17 at 7 44 41 PM" src="https://user-images.githubusercontent.com/48584294/196323576-bf61047e-61a3-4bce-8cc4-4a01b0cfc30c.png">



Do you see any errors that were observed in Spring Gumball (Version 1)? 
Answer: When I try to insert coin and turn crank, the message has been updated. Then I refresh the page and perform turn crank when there is no coin, there is no error pop up. 

Why or Why Not?  Explain the technical details to support your observation.
The error wasn't persisted anymore because there is a mechanism to handle the state of the Gumball Machine and it will carry along with the POST/GET in order to make sure when user insert the quarter then it will be store inline with the request message. 


Screenshot -- TAMPER DEV
--Turn Crank -- broswer state
<img width="798" alt="Screen Shot 2022-10-17 at 7 53 11 PM" src="https://user-images.githubusercontent.com/48584294/196324733-5d9175a6-c6a5-4315-9b34-528bc1ae3a78.png">
--Insert Coin -- broswer state
<img width="797" alt="Screen Shot 2022-10-17 at 7 54 16 PM" src="https://user-images.githubusercontent.com/48584294/196324868-c3974551-f6ea-47cb-8e1b-57134c3e11c1.png">
-- Capture the State of the Browser and changed from HasQuarterState to NoQuarterState
<img width="1680" alt="Screen Shot 2022-10-17 at 10 59 43 PM" src="https://user-images.githubusercontent.com/48584294/196347854-177ca391-e2e2-4ea5-b3c7-342c569344b7.png">

REPLAY ATTACK <br/>
---- BEFORE ----
There is no machenism in the code base to handle the Replay Attack, therefore, when I used the Tamper Dev to intersect the request from the application and update the state from NoQuarterState to HasQuarterState, It will also update the message from the server side. In the pic, I performed replay attacked when I alreayd inserted one quarter and then I modify the state to pretend like I inserted a second quarter then the message pop up that I cannot insert one more quarter.. The truth is that I did try to turned the crank. 

<img width="1680" alt="Screen Shot 2022-10-17 at 11 57 04 PM" src="https://user-images.githubusercontent.com/48584294/196357981-50d641de-9fd2-470f-8361-ab999360014d.png">


----AFTER ----
After inserting the GumballServerError and the throw-catch in the GumballController, the Replay Attack has passed by because when I user Tamper Dev to capture and intersect the request in the middle and modify the state from the browser, the error handler will handle it and response with the INTERNAL SERVER RESPONSE because It cannot validate the integrity of the request bause the hash string including the browser state, timestamp, therefore, modifying the state causing failed in the validation causing the error.

<img width="1675" alt="Screen Shot 2022-10-17 at 11 14 28 PM" src="https://user-images.githubusercontent.com/48584294/196350053-fc4bebe5-c4d8-44cd-8daa-efb1d584d588.png">

&nbsp;&nbsp;1.3.2. Fullscreen
