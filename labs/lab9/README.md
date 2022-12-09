# CMPE 172 - Lab #9 Notes


Description: In this project, student will learn about how RabbitMQ work and the how to access RabbitMQ portal to monitor the queueing message. 

Reflection: I can imagine in the large scale enterprise production, this RabbitMQ middleware layer will help to queueing the message sending from client to different API and routing to the correct destination, high available. and fault tolerant. Especially It can make sure the message won't loss. The most difficult of this lab is to to really understand how the message putting in the queue and how it releasing the receiver. About the Spring Profiles, I can see the helpful of using it in the enterprise software development, when we want to seperate the two different working environment and prevent the interference on each other so we create the profile in the application properties to execute the environment separately. 



### Messaging with RabbitMQ
- RabbitMQ is working
![Screen Shot 2022-11-21 at 11 42 15 AM](https://user-images.githubusercontent.com/48584294/203144443-b48da1ee-5e23-4f1a-bc47-662b1c02db74.png)

- Received <Hello from RabbitMQ!>
![Screen Shot 2022-11-21 at 6 20 02 PM](https://user-images.githubusercontent.com/48584294/203201367-519bf5c5-f257-4e9a-846e-1b5a59c2c027.png)
![Screen Shot 2022-11-21 at 6 20 58 PM](https://user-images.githubusercontent.com/48584294/203201485-d15bc056-c1a0-4cd8-9e33-ded5f65ba976.png)


### RabbitMQ Tutorial - Hello World
- Sender
![Screen Shot 2022-11-21 at 9 33 30 PM](https://user-images.githubusercontent.com/48584294/203231976-cee0b96d-66d0-40d7-8f15-b07acb73fd5c.png)
![Screen Shot 2022-11-21 at 8 57 47 PM](https://user-images.githubusercontent.com/48584294/203225360-2a0ff25d-7019-4dc7-ba6b-1a68989016f5.png)
![Screen Shot 2022-11-21 at 9 02 09 PM](https://user-images.githubusercontent.com/48584294/203225967-b25e390a-9005-4f5e-b86a-f2f7174cf9de.png)
![Screen Shot 2022-11-21 at 9 40 27 PM](https://user-images.githubusercontent.com/48584294/203233736-fef84128-8062-45eb-b189-a9cb71618885.png)


- Receive
![Screen Shot 2022-11-21 at 9 07 38 PM](https://user-images.githubusercontent.com/48584294/203226645-806f28c4-4723-4582-92e7-d0e2182c062b.png)
![Screen Shot 2022-11-21 at 9 35 45 PM](https://user-images.githubusercontent.com/48584294/203232743-4cb152da-7627-445d-9fc8-c65229a3edca.png)
![Screen Shot 2022-11-21 at 9 41 36 PM](https://user-images.githubusercontent.com/48584294/203233900-bf593bea-8ab2-4f5e-bb52-ec14433c492b.png)


### RabbitMQ Tutorial - Work Queues
- Sender
![Screen Shot 2022-11-21 at 9 56 01 PM](https://user-images.githubusercontent.com/48584294/203236041-69194f31-72c5-44d6-b765-4a34091fd582.png)
![Screen Shot 2022-11-21 at 9 56 13 PM](https://user-images.githubusercontent.com/48584294/203236071-ab24f652-8fef-4fe4-9f08-605013c94693.png)

- Reciver
![Screen Shot 2022-11-21 at 10 01 26 PM](https://user-images.githubusercontent.com/48584294/203236841-f91d7ce0-459b-4c71-ba02-1472cdb669a0.png)
![Screen Shot 2022-11-21 at 10 01 45 PM](https://user-images.githubusercontent.com/48584294/203236879-e1b26bcc-74c6-4b31-b834-3bcc8ae87592.png)

A discussion of what Spring Profiles are and how they can be used in your Project
Spring Profiles is providing the way to separate the configuration of the application into separate parts. Each of the diffrent configuration will be only available in the certain defined environment. In this project, we are having the dev environment for the sender and the receiver with different configuration sending and receiving message back and forth. And in order to execute the different environment we just need to pass the env parameter to run it. For example, in this project I passed the "dev" with different configuration point to localhost using the credential to access the dev working environment. 

A discussion of how RabbitMQ can be used in your Project (i.e. what's the use case?)
RabbitMQ is the AMQP messgae broker allow the application to be designed to validating, transforming and routing messages. In this project, we have sender sent multiple message to the receiver and the message queueing in the RabbitMQ will take care of the the message and keeping it in the queue. The queuing message will perform enqueue and dequeue follows the First In First Out. However, in the real world, It will also offers the priorities and reqeueing. 
















