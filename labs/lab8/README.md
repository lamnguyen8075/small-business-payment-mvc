# CMPE 172 - Lab #8 Notes


DESCRIPTION: 
- In this lab student will deploy Kong API Gateway and Starbucks API.. Student will create the network bridge to connect the application to Spring-starbucks-api via Kong. Kong will route the request to the API endpoint at starbucks-api. The deployment will be performed in both local environment for testing purpose and deployed on GKE for production. In order to test the connection endpoint, student will use Postman or CURL tool. 

CHALLENGES:
- Deprecated APIVERSION: when I created the ingress for KONG, I used the extensions/v1beta1 but I couldn't apply the configuration on GKE. After multiple efforts and research I figured out that the given version is deprecated and I need to update it using the networking.k8s.io/v1 instead extensions/v1beta1
- On GKE, at the beginning I assign the given IP address from CANVAS for the KONG on GKE but once I tried to test it then It didn't work because the KONG IP endpoint on my cluster is diffrerent. The resolution is to reassign with my KONG API. Finally It worked. 

DISCUSSION
- The changes would be needed in order to deploy your Starbucks API with MySQL / Cloud SQL: In order to connect to Cloud SQL on Google Cloud Service,I have to create Cloud SQL instance and set up start up quickstart-user. Set up the Cloud SQL Client role for Cloud SQL access. Then I will configure the secrets which is the credential for the Cloud SQL app. Update the deployment yaml file in Starbucks API with the connection endpoint and service for the GKE cloud SQL and upload to GKE cluster. At the final steps I will spin up the sql instance and deploy the deployment yaml file. After all done, using the External IP to access the application. 


1. Create docker network bridge for KONG API
<img width="1899" alt="Screen Shot 2022-11-14 at 11 25 26 AM" src="https://user-images.githubusercontent.com/48584294/201747925-904e7ce8-44d1-4118-8388-fec74681f693.png">

2. Run Starbucks API container in Docker
![Screen Shot 2022-11-14 at 11 44 47 AM](https://user-images.githubusercontent.com/48584294/201751391-22718ac3-789b-42dd-b4bc-08bac8c0a778.png)

3. Run KONG DBless mode and set the configuration for each service.. In this project, I will use unencrypted version so the Admin port is 8001 and the API port is 8444.
<img width="1911" alt="Screen Shot 2022-11-14 at 11 27 36 AM" src="https://user-images.githubusercontent.com/48584294/201748272-c81b350d-6f2a-4498-9dd2-595c5eba83ce.png">

4. Generated kong.yaml and cat out to the local environment for updating the configuration
![Screen Shot 2022-11-14 at 11 30 50 AM](https://user-images.githubusercontent.com/48584294/201748819-c8f9113e-d23d-4b3c-8933-1ce159f68ecc.png)

5. Checking KONG API deployment status using POSTMAN
![Screen Shot 2022-11-14 at 11 32 06 AM](https://user-images.githubusercontent.com/48584294/201749046-f150f7fd-fe78-421d-aba1-a6ceb1f2edea.png)
List all services in KONG GATEWAY
![Screen Shot 2022-11-14 at 3 41 56 PM](https://user-images.githubusercontent.com/48584294/201790954-30c7a4f1-de90-4b36-826c-620a081a0a20.png)
Using ping to test API request and response and API Key header on POSTMAN 
![Screen Shot 2022-11-14 at 3 46 05 PM](https://user-images.githubusercontent.com/48584294/201791461-43db0472-1ade-481c-8b7a-70995cbf55b9.png)

6. Ping starbucks-api from KONG to make sure from KONG API getway can connect to starbucks-api endpoint
![Screen Shot 2022-11-14 at 11 33 12 AM](https://user-images.githubusercontent.com/48584294/201749218-8d2adbb8-84b5-493f-a7b7-3c3be815d7ee.png)

7. Using HTTP tool to check Kong status
![Screen Shot 2022-11-14 at 11 34 47 AM](https://user-images.githubusercontent.com/48584294/201749682-bd3d16ee-7924-4b2e-aaae-02315c6114c9.png)

8. Import the kong.yaml file after updating the configuration file
![Screen Shot 2022-11-14 at 11 35 34 AM](https://user-images.githubusercontent.com/48584294/201749789-5b9ac0c4-3fa6-422c-9d67-70377550ff7a.png)

9. Using http tool to ping the starbucks-api from kong with credential to test the communicatio between starbucks-api and kong gateway 
![Screen Shot 2022-11-14 at 11 36 07 AM](https://user-images.githubusercontent.com/48584294/201749879-d4156a23-64e6-488a-9ced-c4bd7673da17.png)

10. Upload and create deployment services on GKE (deployment, service and jumpbox.yaml files)
![Screen Shot 2022-11-14 at 1 37 11 PM](https://user-images.githubusercontent.com/48584294/201770738-3105823d-3cae-4bde-934f-d867![Uploading Screen Shot 2022-11-14 at 1.38.45 PM.png…]()
4c5ca9ea.png)

11. Testing starbucks-api on GKE
![Screen Shot 2022-11-14 at 1 40 18 PM](https://user-images.githubusercontent.com/48584294/201771250-933e73d2-53ba-437f-a640-9708b8ea8177.png)

12. Using CURL to test KONG deployment on GKE
![Screen Shot 2022-11-14 at 1 46 47 PM](https://user-images.githubusercontent.com/48584294/201774710-0a285b3d-5a57-4a46-979f-3748fafebceb.png)

13. Upload Kong configuration on GKE -- Update the deprecated api version on the YAML file
![Screen Shot 2022-11-14 at 2 58 44 PM](https://user-images.githubusercontent.com/48584294/201785635-1340926a-85ba-4468-a1ea-46b072acb1cf.png)

14. Test API KONG ping end point
![Screen Shot 2022-11-14 at 2 59 06 PM](https://user-images.githubusercontent.com/48584294/201785673-52aae61d-b1fe-4b9c-83b7-cbfd9d2d341e.png)

15. Upload kong-key-auth and kong-consumer YAML files and patched 
![Screen Shot 2022-11-14 at 3 01 09 PM](https://user-images.githubusercontent.com/48584294/201785899-a7c7c3d4-024c-4f97-a041-afeb05d884ba.png)

16. Running API Test to test the endpoint from KONG to Starbucks-API
![Screen Shot 2022-11-14 at 3 05 28 PM](https://user-images.githubusercontent.com/48584294/201786457-187c9558-b4c4-44eb-9f0e-b26c7ff2d6d3.png)

17. GKE Workloads
![Screen Shot 2022-11-14 at 3 06 08 PM](https://user-images.githubusercontent.com/48584294/201786529-061da81c-dadf-4f91-933d-70fc22d7f1f9.png)

18. GKE Running cluster
![Screen Shot 2022-11-14 at 3 06 35 PM](https://user-images.githubusercontent.com/48584294/201786591-f7e260c6-24ac-48ec-ad89-d32f75ee96ea.png)


