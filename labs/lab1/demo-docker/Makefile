all: clean

clean:
	gradle clean

compile:
	gradle build

jar: compile
	gradle bootJar

run: jar
	echo Starting Spring at:  http://localhost:8080
	java -jar target/demo-docker-1.0.jar

# Docker

docker-build: jar
	docker build -t demo-docker .
	docker images

docker-run: docker-build
	docker run --name demo-docker -td -p 80:8080 demo-docker	
	docker ps

docker-clean:
	docker stop demo-docker
	docker rm demo-docker
	docker rmi demo-docker

docker-shell:
	docker exec -it demo-docker bash 

docker-push:
	docker login
	docker build -t $(account)/demo-docker:latest -t $(account)/demo-docker:latest .
	docker push $(account)/demo-docker:latest 

# Pod

pod-run:
	kubectl apply -f pod.yaml

pod-list:
	kubectl get pods

pod-desc:
	kubectl describe pods demo-docker

pod-delete:
	kubectl delete -f pod.yaml

pod-shell:
	kubectl exec -it demo-docker -- /bin/bash

pod-logs:
	kubectl logs -f demo-docker

# Service

service-create:
	kubectl create -f service.yaml

service-get:
	kubectl get services

service-get-ip:
	kubectl get service demo-docker -o wide

service-delete:
	kubectl delete service demo-docker