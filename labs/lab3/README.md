# CMPE 172 - Lab #3 Notes

Description: In this project student will have hands on experiences with deploying the load balancer on local environment and GKE. Student will learn how to set up the Load Balancer configuration and observer the different of application deploy with LB and w/o LB

### Part 1 -- Spring Gumball on Docker && Part 2 -- Spring Gumball on Google Cloud

1. Running local deployment to ensure the app running without error <br />
![1](https://user-images.githubusercontent.com/48584294/193734196-02b61407-2109-4f0d-9d01-d3da581496fd.png)

2. Created the Docker Images and run the docker container to ensure that It's working correctly. <br />
![2](https://user-images.githubusercontent.com/48584294/193734318-1ead1fd7-0393-465f-b904-7d9dc939f831.png)

3. Running Docker Compose <br />
![3](https://user-images.githubusercontent.com/48584294/193734475-375147ec-3eac-4181-abf2-3ff50d40eb55.png)

4. Running HA Proxy Load Balancer <br />
![4](https://user-images.githubusercontent.com/48584294/193734705-71eef3b3-b579-48b5-889a-cd694c4d963f.png)

#### DOCKER - Reload the page multiple times 
<img width="327" alt="Screen Shot 2022-10-03 at 9 41 27 PM" src="https://user-images.githubusercontent.com/48584294/193735827-dd9b35ab-aa16-40b9-9fce-bb57d5520d01.png"><br />
<img width="344" alt="Screen Shot 2022-10-03 at 10 01 43 PM" src="https://user-images.githubusercontent.com/48584294/193738301-ce5851d5-2d56-47a8-b8ce-da0e82b4bf46.png"><br />
##### Observation: The IP address switching between two different pods. 

##### Reason: There is a load balancer help to run two pods and the request from client will be sent to whichever free at the time of the request. 

#### DOCKER - What's error?? .<br />
![5](https://user-images.githubusercontent.com/48584294/193735923-65f63958-2b73-448d-bd65-560151825ff3.png)

##### Observation: The page was crashed when user tried to Turn Crank and there is a NullPointerExeception throwing in the console. 

##### Reason: Because the COOKIES_ENABLED in docker-compose.yaml is set to FALSE. Therefore there is no sticky session has been tag causing error. We can fix it by set the COOKIES_ENABLED in docker-compose.yaml

5. Running curl on each containers to test the connection <br />
![6](https://user-images.githubusercontent.com/48584294/193737248-8e91a459-a6fb-4c5a-8eb5-ef36e4290487.png)

6. Running curl on LB on GKE <br />
<img width="1680" alt="Screen Shot 2022-10-03 at 9 57 38 PM" src="https://user-images.githubusercontent.com/48584294/193737793-63b0aeb3-b6fe-4774-9f1f-86e870b17b36.png">

7. Running curl on each pods in GKE<br />
Pod 1: <br />
![7](https://user-images.githubusercontent.com/48584294/193737918-33abc329-6051-4f6b-a728-bc49829b5065.png)

Pod 2:<br />
![8](https://user-images.githubusercontent.com/48584294/193738560-fcf517b7-8ffe-4db5-b914-a6dda0035ba3.png)

Pod 3: <br />
![9](https://user-images.githubusercontent.com/48584294/193738611-5afbca5b-68ed-4cc4-95ad-8438f2d63d20.png)

Pod 4: <br />
![10](https://user-images.githubusercontent.com/48584294/193738658-0eb73502-f61d-47a6-8adb-67205bef366e.png)

8. GKE Workloads
8.1. Jumpbox
<img width="1054" alt="Screen Shot 2022-10-03 at 10 08 37 PM" src="https://user-images.githubusercontent.com/48584294/193739039-945f1de7-8bcf-483b-8dd6-e32e3e1671f4.png">

8.2. Spring-gumball-deployment
<img width="1051" alt="Screen Shot 2022-10-03 at 10 09 03 PM" src="https://user-images.githubusercontent.com/48584294/193739122-e445773c-72d1-40d5-94fa-9aecc03926c3.png">

9. GKE Services & Ingress
9.1. Spring-gumball-service
<img width="1053" alt="Screen Shot 2022-10-03 at 10 09 48 PM" src="https://user-images.githubusercontent.com/48584294/193739221-13f14b99-7fe9-4c76-8d66-64ba406d2915.png">

9.2. Spring-gumball-ingress
<img width="1053" alt="Screen Shot 2022-10-03 at 10 10 37 PM" src="https://user-images.githubusercontent.com/48584294/193739312-69650d76-86ec-4928-b4ad-58389c0922ba.png">


#### GKE - Reload the page multiple times 


<img width="418" alt="Screen Shot 2022-10-03 at 10 28 31 PM" src="https://user-images.githubusercontent.com/48584294/193741469-7843c086-dec7-494f-adfd-5eabec2bcf4c.png">
<img width="489" alt="Screen Shot 2022-10-03 at 10 29 00 PM" src="https://user-images.githubusercontent.com/48584294/193741542-adc78ab2-c2bc-40e3-ae83-b7a7c46f264b.png">
<img width="490" alt="Screen Shot 2022-10-03 at 10 29 25 PM" src="https://user-images.githubusercontent.com/48584294/193741610-9e77afbe-87d0-491d-bc4e-32f8e637e352.png">

##### Observation: The IP address switching between two different 4 pods. 

##### Reason: The Load Balancer perform checking the availability of the pods in Kubernetes Endpoints then sort in order or RR to route the service to. 

#### What's error?? NullValue ....<br />
![5](https://user-images.githubusercontent.com/48584294/193735923-65f63958-2b73-448d-bd65-560151825ff3.png)

##### Observation: The page was crashed when user tried to Insert Coin, Turn Crank and there is a NullPointerExeception throwing in the console. 

##### Reason: Because intially client cookies hasn't been set. We can fix the issue by set the Client IP for the Load Balancer 
- In GKE, go to Network Services
- Select Edit in the tab Load Balances
- Choose Backend Configuration -- Advanced Configurations -- Session Affinity, Select Client IP. 

It will fix the issue. 



Reflection: 
It's not really hard to set everything up but once I got the error. I really enjoy troubleshooting because it helps me calm and understand thoroughly about what I have done for this project. I understood how the connection of the load balancer, pods, etc. Also one of the concept that I learnt acouple of weeks ago appear in my interview and I was able to answer it. 

Thank you!
- 
